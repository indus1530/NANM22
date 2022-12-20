package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.adol;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.adapters.GenericLVFilterAdapter;
import edu.aku.abdulsajid.nanm2022.adapters.GenericRVAdapter;
import edu.aku.abdulsajid.nanm2022.core.BottomSheet;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Food;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodChange;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodTime;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Ingredient;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.PatientFood;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;


public class SectionC8Activity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private static final int REMOVE_FOOD_POPUP = 101;
    private static final int REMOVE_INGR_POPUP = 102;

    /*private ConnectionDetector connDetector;
    private WebAPI webAPI;
    private WebCall webCall;
    private AppDatabase appDatabase;
    private Loading loading;*/
    private final String TAG = getClass().getName();
    private final Activity activity = SectionC8Activity.this;
    // These tags are used to differentiate between multiple web calls
    private final String SUBMIT_PATIENT_FOOD = "submit-patient-food";
    private NANMRoomDatabase db;
    private ChipGroup foodIntakeCG;
    private RecyclerView foodTimeRV;
    private GenericRVAdapter<FoodTime> genericFoodTimeRVAdapter;
    private TextView errorTV, ingrErrorTV;
    private CheckBox noMealCB;
    private ImageView addPatientFoodBtn, prevBtn, nextBtn;
    private Button submitBtn;
    private List<FoodTime> foodTimeList;
    private BottomSheetDialog addFoodBottomSheet;
    private ChipGroup ingrCG;
    private HashMap<FoodTime, List<PatientFood>> patientFoodMap;
    private List<Food> foodList;
    private List<Ingredient> ingredientList;
    private FoodTime selectedFoodTime;
    private int selectedFoodTimeIndex;
    private Food selectedFood;
    private List<Ingredient> selectedFoodIngrList;
    // This list is the combination of selected food ingredients
    // and food changes
//    private List<Ingredient> updatedFoodIngrList;
    private List<FoodChange> foodChangeList;
    // For help in the backend DB
    private int serialNo;
    MainApp.IAlertCallback iAlertCallback = new MainApp.IAlertCallback() {
        @Override
        public void onClick(int popupId, boolean isPositiveClick, Object obj) {
            if (popupId == REMOVE_FOOD_POPUP) {
                if (isPositiveClick) {
                    foodIntakeCG.removeView((Chip) obj);
                    removePatientFood(((Chip) obj).getText().toString());
                    if (foodIntakeCG.getChildCount() == 0) {
                        errorTV.setVisibility(View.VISIBLE);
                        errorTV.setText(getString(R.string.empty_food_list, selectedFoodTime.getTitle()));
                        noMealCB.setVisibility(View.VISIBLE);
                        noMealCB.setChecked(false);
                    }
                }
            } else if (popupId == REMOVE_INGR_POPUP) {
                if (isPositiveClick) {
                    ingrCG.removeView((Chip) obj);
                    removeIngredient(((Chip) obj).getText().toString());
                    if (ingrCG.getChildCount() == 0) {
                        ingrErrorTV.setVisibility(View.VISIBLE);
                        ingrErrorTV.setText(getString(R.string.empty_ingredients_list));
                    }
                }
            }
        }
    };
    // This is a temporary id that will increment negatively for every new food
    // The server will give them an actual id of sync/upload
    private int newFoodId = -1;
    GenericLVFilterAdapter.ILVOnItemClickListener ilvOnItemClickListener = new GenericLVFilterAdapter.ILVOnItemClickListener() {
        @Override
        public void onItemClick(AutoCompleteTextView autoCompleteTextView, Object obj, int index) {
            int viewId = autoCompleteTextView.getId();
            if (viewId == R.id.foodNameACET) {
                selectedFood = (Food) obj;
                assert selectedFood != null;

                if (checkIfItemExistsInCG(foodIntakeCG, selectedFood.getFoodName())) {
                    autoCompleteTextView.setText(null);
                    Toast.makeText(activity, "Item already added", Toast.LENGTH_SHORT).show();
                    return;
                }

                autoCompleteTextView.setText(selectedFood.getFoodName());

                selectedFoodIngrList = db.foodIngrJTDao().getAllIngrByFoodId(selectedFood.getFoodId());
                // For testing purpose
//                selectedFoodIngrList = TestData.getFoodIngredients(selectedFood.getFoodId());
                if (selectedFoodIngrList != null && selectedFoodIngrList.size() > 0) {
//                    updatedFoodIngrList = selectedFoodIngrList;
                    initFoodIngredientsCG(ingrCG, selectedFoodIngrList);
                } else {
                    if (ingrCG.getChildCount() > 0)
                        ingrCG.removeAllViews();
                    ingrErrorTV.setText(getString(R.string.no_ingredients_found));
                    ingrErrorTV.setVisibility(View.VISIBLE);
                }
            } else if (viewId == R.id.newIngrACET) {
                // Ingredient found in the list
                Ingredient ingredient = (Ingredient) obj;
                if (checkIfItemExistsInCG(ingrCG, ingredient.getIngredientName())) {
                    autoCompleteTextView.setText(null);
                    Toast.makeText(activity, "Item already added", Toast.LENGTH_SHORT).show();
                    return;
                }
//                autoCompleteTextView.setText(ingredient.getIngredientName());
                addNewIngredient(ingredient, null);
                autoCompleteTextView.setText(null);
            }
            autoCompleteTextView.dismissDropDown();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c8);

        // Init Toolbar
        /*AppConstants.initToolbar(activity, getString(R.string.intake_followup), false);

        connDetector = new ConnectionDetector(this);
        appDatabase = AppDatabase.getDBInstance(activity);
        loading = new Loading(activity, false);
        webAPI = WebClient.getInstance().getWebAPI();*/
//        webCall = new WebCall(activity, connDetector, loading, iWebCallback);

        // For testing purpose
//        adolescent = TestData.getPatientDetails();

        db = MainApp.appInfo.dbHelper;

        patientFoodMap = new HashMap<>();

        foodTimeRV = findViewById(R.id.foodTimeRV);
        ((LinearLayoutManager) Objects.requireNonNull(foodTimeRV.getLayoutManager()))
                .setOrientation(LinearLayoutManager.HORIZONTAL);

        foodIntakeCG = findViewById(R.id.foodIntakeCG);

        errorTV = findViewById(R.id.errorTV);
        noMealCB = findViewById(R.id.noMealCB);
        noMealCB.setOnCheckedChangeListener(this);

        addPatientFoodBtn = findViewById(R.id.addPatientFoodBtn);
        addPatientFoodBtn.setOnClickListener(this);

        prevBtn = findViewById(R.id.prevBtn);
        prevBtn.setOnClickListener(this);

        nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);

        foodList = Objects.requireNonNull(db.foodDao()).getAll();

        ingredientList = Objects.requireNonNull(db.ingredientDao()).getAll();

        foodTimeList = new ArrayList<>();

        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(this);

        foodTimeList = Objects.requireNonNull(db.foodTimeDao()).getAll();
        // To automatically select first item in the list
        if (foodTimeList != null && foodTimeList.size() > 0)
            foodTimeList.get(0).setSelected(true);
        else {
            Toast.makeText(activity, getString(R.string.data_not_download_correctly), Toast.LENGTH_SHORT).show();
            return;
        }

        foodTimeRV.setAdapter(getFoodTimeAdapter());

//        initFoodTimeCG();
//        initFoodTimeRV();

        addFoodBottomSheet = BottomSheet.getBottomSheetDialog(activity, R.style.Theme_main_BottomSheetStyle,
                R.layout.view_bottomsheet_add_food, true, null);
        addFoodBottomSheet.setCancelable(false);
    }

    /*
     * SHOW ADD PATIENT FOOD BOTTOMSHEET
     */
    private void showAddFoodBottomSheet() {

//        patientFoodList = new ArrayList<>();
        foodChangeList = new ArrayList<>();

        ingrErrorTV = addFoodBottomSheet.findViewById(R.id.ingrErrorTV);

        AutoCompleteTextView foodNameACET = addFoodBottomSheet.findViewById(R.id.foodNameACET);
        assert foodNameACET != null;
        foodNameACET.setAdapter(getFoodACETAdapter(foodNameACET, foodList));

        ImageView bsFoodClearBtn = addFoodBottomSheet.findViewById(R.id.bsFoodClearBtn);
        assert bsFoodClearBtn != null;
        bsFoodClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Clear food name field
                foodNameACET.setText(null);
            }
        });

        ingrCG = addFoodBottomSheet.findViewById(R.id.ingrCG);
//        assert ingrCG != null;
//        ingrCG.setOnCheckedStateChangeListener(new ChipGroup.OnCheckedStateChangeListener() {
//            @Override
//            public void onCheckedChanged(@NonNull ChipGroup group, @NonNull List<Integer> checkedIds) {
//                int viewId = group.getId();
//                if (viewId == R.id.ingrCG) {
//
//                }
//            }
//        });

        AutoCompleteTextView newIngrACET = addFoodBottomSheet.findViewById(R.id.newIngrACET);
        assert newIngrACET != null;
        newIngrACET.setAdapter(getIngredientACETAdapter(newIngrACET, ingredientList));

        EditText quantityET = addFoodBottomSheet.findViewById(R.id.quantityET);
        assert quantityET != null;

        ImageView addNewIngrBtn = addFoodBottomSheet.findViewById(R.id.addNewIngrBtn);
        assert addNewIngrBtn != null;
        addNewIngrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ingredient NOT found in the list
                if (MainApp.isNotEmpty(newIngrACET)) {
                    if (checkIfItemExistsInCG(ingrCG, newIngrACET.getText().toString())) {
                        newIngrACET.setText(null);
                        Toast.makeText(activity, "Item already added", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    addNewIngredient(null, newIngrACET.getText().toString());
                    newIngrACET.setText(null);
                }
            }
        });

        // There is a theming issue with Button in bottomsheet so TextView is used
        TextView bsAddBtn = addFoodBottomSheet.findViewById(R.id.bsAddBtn);
        assert bsAddBtn != null;
        bsAddBtn.setOnClickListener(view -> {
//            if (!foodNameET.isEmptyTextBox() || !quantityET.isEmptyTextBox()) return;
            if (!MainApp.isNotEmpty(foodNameACET)) {
                Toast.makeText(activity, "field cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!MainApp.isNotEmpty(quantityET)) {
                Toast.makeText(activity, "field cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }

            if (ingrCG.getChildCount() == 0) {
                Toast.makeText(activity, "field cannot be empty", Toast.LENGTH_SHORT).show();
//                AppConstants.showSimpleSnackBar(activity, getString(R.string.add_ingredient_empty_error),
//                        AppConstants.SNACK_BAR_DEFAULT_DURATION, AppConstants.TYPE_ERROR);
                return;
            }

            if (!validateIngrCG()) {
                Toast.makeText(activity, "Be Careful!", Toast.LENGTH_SHORT).show();
                return;
            }

            Chip foodIntakeChip = (Chip) LayoutInflater.from(activity).inflate(R.layout.item_chip, null);

            PatientFood patientFood = new PatientFood();
            patientFood.setFoodId(selectedFood.getFoodId());
            patientFood.setPatientId(Integer.parseInt(adol.getChildID()));
            patientFood.setSerialNo(++serialNo);
            patientFood.setFoodTimeId(selectedFoodTime.getFoodTimeId());
            patientFood.setQuantity(Float.parseFloat(quantityET.getText().toString()));
            String foodName;
            if (selectedFood.getFoodId() > 0) {

                foodName = db.foodDao().getById(selectedFood.getFoodId()).getFoodName();
                // For testing purpose
//                foodName = Objects.requireNonNull(TestData.getFoodById(foodList, selectedFood.getFoodId())).getFoodName();
                // For personal use
                patientFood.setFoodName(foodName);
                if (foodChangeList == null || foodChangeList.size() == 0)
                    // No change
                    patientFood.setFoodChangeStatus(0);
                else {
                    // Something's changed
                    patientFood.setFoodChangeList(foodChangeList);
                    patientFood.setFoodChangeStatus(MainApp.STANDARD_ADD);
                }
            } else {
                // New food
                patientFood.setOther(foodNameACET.getText().toString());
                // For personal use
                patientFood.setFoodName(foodNameACET.getText().toString());

                patientFood.setFoodChangeList(foodChangeList);
                patientFood.setFoodChangeStatus(MainApp.NEW_ADD);
                foodName = foodNameACET.getText().toString();
                foodIntakeChip.setBackgroundColor(ContextCompat.getColor(activity, R.color.chip_new_color));
            }
//            patientFoodList.add(patientFood);

            List<PatientFood> patientFoodList = patientFoodMap.get(selectedFoodTime);
            if (patientFoodList == null)
                patientFoodList = new ArrayList<>();
            patientFoodList.add(patientFood);
            patientFoodMap.put(selectedFoodTime, patientFoodList);

            foodIntakeChip.setText(foodName);
            foodIntakeChip.setClickable(false);
            foodIntakeChip.setCloseIconVisible(true);
            foodIntakeChip.setOnCloseIconClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainApp.alert(REMOVE_FOOD_POPUP, activity, getString(R.string.are_you_sure),
                            getString(R.string.are_you_sure_food), view, iAlertCallback);
                }
            });

            foodIntakeCG.addView(foodIntakeChip);

//            // This will give a new temporary id of new (not our standard) food added
//            newFoodId--;
//            selectedFoodIngrList = null;
//            foodTimeList.get(selectedFoodTimeIndex).setFoodNotTaken(false);

            noMealCB.setVisibility(View.GONE);
            errorTV.setVisibility(View.GONE);

            // This will give a new temporary id of new (not our standard) food added
            newFoodId--;

            resetVariables();

            addFoodBottomSheet.dismiss();
        });

        foodNameACET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    quantityET.setEnabled(true);
                    newIngrACET.setEnabled(true);
                    newIngrACET.setEnabled(true);
                    addNewIngrBtn.setEnabled(true);
                } else {
                    quantityET.setEnabled(false);
                    newIngrACET.setEnabled(false);
                    newIngrACET.setEnabled(false);
                    addNewIngrBtn.setEnabled(false);
                    resetVariables();
                }
                if (ingrCG.getChildCount() > 0)
                    ingrCG.removeAllViews();

            }
        });

        foodNameACET.setText(null);
        quantityET.setText(null);
        newIngrACET.setText(null);
        if (ingrCG.getChildCount() > 0)
            ingrCG.removeAllViews();

        selectedFood = null;
        addFoodBottomSheet.show();
    }

    /*
     * SHOW INGREDIENTS OF SELECTED FOOD
     */
    // Generate ingredients chip group based on selected food
    private void initFoodIngredientsCG(ChipGroup ingrCG, List<Ingredient> selectedFoodIngrList) {
        if (ingrCG.getChildCount() > 0)
            ingrCG.removeAllViews();
        for (int i = 0; i < selectedFoodIngrList.size(); i++) {
            Chip chip = (Chip) LayoutInflater.from(activity).inflate(R.layout.item_chip, null);
            chip.setText(selectedFoodIngrList.get(i).getIngredientName());
            chip.setId(i);
            chip.setCloseIconVisible(true);
            chip.setCloseIconTint(
                    ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.light_gray_color)));
            chip.setOnCloseIconClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainApp.alert(REMOVE_INGR_POPUP, activity, getString(R.string.are_you_sure),
                            getString(R.string.are_you_sure_ingr), view, iAlertCallback);
                }
            });
            chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked)
                        ((Chip) compoundButton).setCloseIconTint(
                                ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.white)));
                    else
                        ((Chip) compoundButton).setCloseIconTint(
                                ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.light_gray_color)));
                }
            });
            ingrCG.addView(chip);
        }
        ingrErrorTV.setVisibility(View.GONE);
    }

    /*
     * LOAD PATIENT FOOD WITH RESPECT TO THE SELECTED TIME OF FOOD TIME LIST/RECYCLERVIEW
     */

    /*
     * INIT/UPDATE PATIENT FOOD INTAKE CHIP GROUP (ON IN SCREEN)
     */
    // Add Patient Food to food intake chip group on main screen
    private void initFoodIntakeCG(List<PatientFood> patientFoodList) {
        if (foodIntakeCG.getChildCount() > 0)
            foodIntakeCG.removeAllViews();
        for (int i = 0; i < patientFoodList.size(); i++) {
            Chip chip = (Chip) LayoutInflater.from(activity).inflate(R.layout.item_chip, null);
            chip.setId(i);
            chip.setText(patientFoodList.get(i).getFoodName());
            chip.setCloseIconVisible(true);
            chip.setCloseIconTint(ColorStateList.valueOf(
                    ContextCompat.getColor(activity, R.color.light_gray_color)));
            chip.setOnCloseIconClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainApp.alert(REMOVE_FOOD_POPUP, activity, getString(R.string.are_you_sure),
                            getString(R.string.are_you_sure_food), view, iAlertCallback);
                }
            });
            foodIntakeCG.addView(chip);
        }
    }

    /* ==============================
     * ADAPTERS
     * ==============================
     * */

    /*
     * ADD NEW INGREDIENT IN INGREDIENT CHIP GROUP WHICH IS NOT IN THE SELECTED FOOD INGREDIENTS LIST
     * @param addIngr = Add ingredient from our standard/db ingredients list
     * @param newIngr = Add new ingredient that is not in our standard/db ingredients list
     */
    private void addNewIngredient(Ingredient newStandardIngr, String otherIngr) {
        if (selectedFood == null) {
            selectedFood = new Food();
            selectedFood.setFoodId(newFoodId);
        }

        Chip chip = (Chip) LayoutInflater.from(activity).inflate(R.layout.item_chip, null);
        FoodChange ingredientChange = new FoodChange();
        ingredientChange.setPatientId(Integer.parseInt(adol.getChildID()));
        ingredientChange.setFoodId(selectedFood.getFoodId());
        ingredientChange.setFoodTimeId(selectedFoodTime.getFoodTimeId());
        String ingredientName;
        if (newStandardIngr != null) {
            ingredientName = db.ingredientDao().getById(newStandardIngr.getIngredientId()).getIngredientName();
            // For testing purpose
//            ingredientName = TestData.getIngredientById(ingredientList, addIngr.getIngredientId());
            if (!isStandardFoodIngredient(ingredientName)) {
                ingredientChange.setIngredientId(newStandardIngr.getIngredientId());
                ingredientChange.setIngrChangeStatus(MainApp.STANDARD_ADD);
                chip.setChipBackgroundColor(ColorStateList.valueOf(
                        ContextCompat.getColor(activity, R.color.chip_new_color)));
                foodChangeList.add(ingredientChange);
            } else {
                // This check is used to remove the standard food ingredient from the food changes
                // list when the user re-adds it after delete
                Ingredient ingredient = db.ingredientDao().getByName(ingredientName);
                for (int i = 0; i < foodChangeList.size(); i++) {
                    if (foodChangeList.get(i).getIngredientId() == ingredient.getIngredientId()) {
                        foodChangeList.remove(i);
                        break;
                    }
                }
            }
//            updatedFoodIngrList.add(addIngr);
        } else {
            ingredientChange.setOther(otherIngr);
            ingredientName = otherIngr;
            ingredientChange.setIngrChangeStatus(MainApp.NEW_ADD);
            chip.setChipBackgroundColor(ColorStateList.valueOf(
                    ContextCompat.getColor(activity, R.color.chip_new_color)));

            foodChangeList.add(ingredientChange);

            Ingredient _newIngr = new Ingredient();
            _newIngr.setIngredientName(ingredientName);

//            updatedFoodIngrList.add(_newIngr);
        }

//        chip.setId(ingrCG.getChildCount());
        chip.setText(ingredientName);
        chip.setChecked(true);
        chip.setClickable(false);
        chip.setCloseIconVisible(true);
        chip.setCloseIconTint(ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.white)));
        chip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainApp.alert(REMOVE_INGR_POPUP, activity, getString(R.string.are_you_sure),
                        getString(R.string.are_you_sure_ingr), view, iAlertCallback);
            }
        });
        ingrCG.addView(chip, 0);
        ingrErrorTV.setVisibility(View.GONE);
    }

    // Load Patient Food by Time
    @SuppressLint("NotifyDataSetChanged")
    private void loadPatientFood(int index) {
        if (foodIntakeCG.getChildCount() > 0)
            foodIntakeCG.removeAllViews();
        resetFoodTimeList();
        foodTimeList.get(index).setSelected(true);
        selectedFoodTime = foodTimeList.get(index);
        List<PatientFood> patientFoodList = patientFoodMap.get(selectedFoodTime);
        if (patientFoodList != null && patientFoodList.size() > 0) {
            errorTV.setVisibility(View.GONE);
            noMealCB.setVisibility(View.GONE);
//            foodTimeList.get(index).setFoodTaken(true);
            // Check isFoodNotTaken status
            noMealCB.setChecked(false);
            initFoodIntakeCG(patientFoodList);
        } else {
            errorTV.setVisibility(View.VISIBLE);
            noMealCB.setVisibility(View.VISIBLE);
//            foodTimeList.get(index).setFoodTaken(false);
            // Check isFoodNotTaken status
//            if (selectedFoodTime.isFoodNotTaken())
            noMealCB.setChecked(patientFoodMap.containsKey(selectedFoodTime));

            errorTV.setText(getString(R.string.empty_food_list, selectedFoodTime.getTitle()));
        }
        genericFoodTimeRVAdapter.notifyDataSetChanged();
    }

    /**
     * ADAPTERS
     * BIND FOOD AUTOCOMPLETE EDITTEXT WITH FOOD LIST
     */

    /*
     * INIT FOOD TIME
     */
    private GenericRVAdapter<FoodTime> getFoodTimeAdapter() {
        genericFoodTimeRVAdapter = new GenericRVAdapter<FoodTime>(activity, foodTimeList, foodTimeRV, null, false) {
            @Override
            protected View createView(Activity activity, ViewGroup viewGroup, int viewType) {
                return LayoutInflater.from(activity).inflate(R.layout.item_food_time, viewGroup, false);
            }

            @Override
            protected void bindView(FoodTime item, GenericRVAdapter<FoodTime>.ViewHolder viewHolder, int position, boolean isMultiSelect) {
                viewHolder.itemView.setTag(position);
                TextView titleTV = viewHolder.itemView.findViewById(R.id.titleTV);
                titleTV.setText(item.getTitle());
                titleTV.setTextColor(ContextCompat.getColor(activity, R.color.white));
                if (item.isSelected()) {
                    // Food time tab selected
                    viewHolder.itemView.setBackgroundTintList(
                            ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.chip_new_color)));
                    selectedFoodTime = item;
                    selectedFoodTimeIndex = position;
                    errorTV.setText(getString(R.string.empty_food_list, selectedFoodTime.getTitle()));
                } else if (patientFoodMap.get(item) != null
                        && Objects.requireNonNull(patientFoodMap.get(item)).size() > 0) {
                    // Food Taken at particular time
                    viewHolder.itemView.setBackgroundTintList(
                            ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.app_color)));
                } else if (patientFoodMap.containsKey(item) && (patientFoodMap.get(item) == null)) {
                    // // No food taken at particular time
                    viewHolder.itemView.setBackgroundTintList(
                            ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.red_color)));
                } else {
                    // Food time new tab i.e. none of the actions are performed at this food time tab
                    viewHolder.itemView.setBackgroundTintList(
                            ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.chip_default_color)));
                    titleTV.setTextColor(ContextCompat.getColor(activity, R.color.light_gray_color));
                }
            }
        };
        return genericFoodTimeRVAdapter;
    }

    /*
     * HELPER FUNCTIONS
     */

    // Food autocomplete list adapter
    private GenericLVFilterAdapter<Food> getFoodACETAdapter(AutoCompleteTextView autoCompleteTextView, List<Food> foodList) {
        return new GenericLVFilterAdapter<Food>(activity, foodList, autoCompleteTextView, ilvOnItemClickListener, R.id.titleTV) {
            @Override
            protected View createView(Activity activity1, View convertView, ViewGroup viewGroup,
                                      GenericLVFilterAdapter<Food>.ViewHolder viewHolder, Food item, int position) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(
                            R.layout.item_filter, viewGroup, false);
                    convertView.setTag(position);
                }
                if (item != null) {
                    TextView titleTV = convertView.findViewById(R.id.titleTV);
                    titleTV.setTag(position);
                    titleTV.setText(item.getFoodName());
                }

                return convertView;
            }

            @Override
            protected boolean checkFilterCondition(Food item, String charString) {
                return item.getFoodName().toLowerCase().contains(charString.toLowerCase());
            }
        };
    }

    /*
     * BIND INGREDIENT AUTOCOMPLETE EDITTEXT WITH INGREDIENT LIST
     */
    // Ingredient autocomplete list adapter
    private GenericLVFilterAdapter<Ingredient> getIngredientACETAdapter(AutoCompleteTextView autoCompleteTextView, List<Ingredient> ingredientList) {
        return new GenericLVFilterAdapter<Ingredient>(activity, ingredientList, autoCompleteTextView, ilvOnItemClickListener, R.id.titleTV) {
            @Override
            protected View createView(Activity activity1, View convertView, ViewGroup viewGroup,
                                      GenericLVFilterAdapter<Ingredient>.ViewHolder viewHolder, Ingredient item, int position) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(
                            R.layout.item_filter, viewGroup, false);
                    convertView.setTag(position);
                }
                if (item != null) {
                    TextView titleTV = convertView.findViewById(R.id.titleTV);
                    titleTV.setTag(position);
                    titleTV.setText(item.getIngredientName());
                }

                return convertView;
            }

            @Override
            protected boolean checkFilterCondition(Ingredient item, String charString) {
                return item.getIngredientName().toLowerCase().contains(charString.toLowerCase());
            }
        };
    }

    // Reset Food time list state
    private void resetFoodTimeList() {
//        int drawable, color;
        for (int i = 0; i < foodTimeList.size(); i++) {
            foodTimeList.get(i).setSelected(false);
        }
    }

    // This extra check is used to prevent Foods and Ingredients duplication in the list
    private boolean checkIfItemExistsInCG(ChipGroup cg, String item) {
        for (int i = 0; i < cg.getChildCount(); i++) {
            Chip chip = (Chip) cg.getChildAt(i);
            if (chip.getText().toString().equals(item))
                return true;
        }
        return false;
    }

    // All ingredients in the list must be checked/selected
    private boolean validateIngrCG() {
        for (int i = 0; i < ingrCG.getChildCount(); i++) {
            if (!((Chip) ingrCG.getChildAt(i)).isChecked()) {
                return false;
            }
        }
        return true;
    }

    // Remove selected patient food from the list
    private void removePatientFood(String patientFoodName) {
        List<PatientFood> patientFoodList = patientFoodMap.get(selectedFoodTime);
        for (int i = 0; i < Objects.requireNonNull(patientFoodList).size(); i++) {
            if (patientFoodList.get(i).getFoodName().equals(patientFoodName)) {
                patientFoodList.remove(i);
                serialNo--;
                break;
            }
        }
    }

    // Remove selected ingredient from the list
    private void removeIngredient(String ingredientName) {
        Ingredient ingredient = db.ingredientDao().getByName(ingredientName);
        if (isStandardFoodIngredient(ingredientName)) {
            // Only add those ingredients in the food change list which are the standard ones
            FoodChange ingredientChange = new FoodChange();
            ingredientChange.setPatientId(Integer.parseInt(adol.getChildID()));
            ingredientChange.setFoodId(selectedFood.getFoodId());
            ingredientChange.setFoodTimeId(selectedFoodTime.getFoodTimeId());
            ingredientChange.setIngredientId(ingredient.getIngredientId());
            ingredientChange.setIngrChangeStatus(MainApp.STANDARD_DELETE);
            foodChangeList.add(ingredientChange);
        } else if (ingredient != null) {
            // This check is used when the ingredient is not in the standard food list but
            // its a standard ingredient
            for (int i = 0; i < foodChangeList.size(); i++) {
                if (foodChangeList.get(i).getIngredientId() == ingredient.getIngredientId()) {
                    foodChangeList.remove(i);
                    break;
                }
            }
        } else {
            // This check is used to remove the newly add ingredients which are not standard ones
            // from food changes list
            for (int i = 0; i < foodChangeList.size(); i++) {
                if (foodChangeList.get(i).getOther().equals(ingredientName)) {
                    foodChangeList.remove(i);
                    break;
                }
            }
        }
    }

//    // Get updated ingredients of food
//    // This is the combination of the actual food ingredients and the food changes list
//    private List<Ingredient> getUpdatedIngredients() {
//        List<Ingredient> updatedFoodIngredientsList = new ArrayList<>();
//        updatedFoodIngredientsList.addAll(selectedFoodIngrList);
//        updatedFoodIngredientsList.addAll(foodChangeList);
//        for (int i = 0; i < ingrCG.getChildCount(); i++) {
//            if ()
//
//        }
//
//    }

    /*
     * WEB SERVICE CALLBACK
     */

//    // Web Service Callback
//    private final WebCall.IWebCallback iWebCallback = new WebCall.IWebCallback() {
//
//        @Override
//        public void onSuccess(String tag, ResponseBody jsonResponse) {
//              serialNo = 0;
//        }
//
//        @Override
//        public void onFailure(String tag) {
//
//        }
//    };

    /*
     * CLICK/ITEM-CLICK/CHECK-CHANGED LISTENERS
     */

    // Check if added ingredient is already exists in the standard food ingredients
    // This extra avoid the case when the user deletes an standard ingredient and then re-add
    // the same. So in this case we need to avoid this addition in the food change list
    private boolean isStandardFoodIngredient(String ingredientName) {
        if (selectedFoodIngrList != null && selectedFoodIngrList.size() > 0) {
            for (int i = 0; i < selectedFoodIngrList.size(); i++) {
                if (selectedFoodIngrList.get(i).getIngredientName().equals(ingredientName))
                    return true;
            }
        }
        return false;
    }

    // reset variables to add new food
    private void resetVariables() {
        selectedFood = null;
        selectedFoodIngrList = null;
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.submitBtn) {
            // Check if current list is empty or not to proceed to the next
            if (noMealCB.isChecked())
                // Put null/empty list if food is not taken in the hashmap
                patientFoodMap.put(selectedFoodTime, null);
            else if ((patientFoodMap.get(selectedFoodTime) == null
                    || Objects.requireNonNull(patientFoodMap.get(selectedFoodTime)).size() == 0)
                    && !noMealCB.isChecked()) {
                Toast.makeText(activity, "Be careful!", Toast.LENGTH_SHORT).show();
                return;
            }

            List<PatientFood> patientFoodMainList = new ArrayList<>();
            for (Map.Entry<FoodTime, List<PatientFood>> pair : patientFoodMap.entrySet()) {
                List<PatientFood> _patientFoodList = pair.getValue();
                if (_patientFoodList != null) {
                    patientFoodMainList.addAll(_patientFoodList);
                } else {
                    // This extra object is just to be sure the sequence of food intake
                    // i.e. Not Reported value 9999 means no food taken at this time point
                    PatientFood patientFood = new PatientFood();
                    patientFood.setPatientId(Integer.parseInt(adol.getChildID()));
                    patientFood.setFoodTimeId(pair.getKey().getFoodTimeId());
                    patientFood.setNotReported(MainApp.NOT_REPORTED);
                    patientFoodMainList.add(patientFood);
                }
//                else{
//                    // This extra object is just to add an empty when the patient does not take
//                    // any meal at the particular time
//                }
            }
            /*TODO
             *  List to be saved in the db*/
//            patient.setPatientFoodList(patientFoodMainList);
//            String postJson = new Gson().toJson(patient);
//            Log.e("POST_JSON: ", postJson);
            db.patientFoodDao().addAll(patientFoodMainList);
            if (foodChangeList != null && foodChangeList.size() > 0)
                db.foodChangeDao().addAll(foodChangeList);

            finish();
            startActivity(new Intent(this, SectionD1Activity.class));

        } else if (viewId == R.id.addPatientFoodBtn) {
            showAddFoodBottomSheet();
        } else if (viewId == R.id.nextBtn) {
            if (selectedFoodTimeIndex < foodTimeList.size() - 1) {
                // Check if current list is empty or not to proceed to the next
                if ((patientFoodMap.get(selectedFoodTime) == null
                        || Objects.requireNonNull(patientFoodMap.get(selectedFoodTime)).size() == 0)
                        && !noMealCB.isChecked()) {
                    Toast.makeText(activity, "Be Careful!", Toast.LENGTH_SHORT).show();
                    return;
                } else if (noMealCB.isChecked()) {
                    // Put null/empty list if food is not taken in the hashmap
                    patientFoodMap.put(selectedFoodTime, null);
                }

                selectedFoodTimeIndex += 1;
                loadPatientFood(selectedFoodTimeIndex);
                prevBtn.setEnabled(true);
                prevBtn.setBackgroundTintList(
                        ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.chip_new_color)));
                submitBtn.setEnabled(false);
                if (selectedFoodTimeIndex == foodTimeList.size() - 1) {
                    nextBtn.setEnabled(false);
                    nextBtn.setBackgroundTintList(
                            ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.chip_default_color)));
                    submitBtn.setEnabled(true);
                }
                // For Scrolling - UX
                if (selectedFoodTimeIndex == 3)
                    foodTimeRV.smoothScrollToPosition(foodTimeList.size());
            }
        } else if (viewId == R.id.prevBtn) {
            if (selectedFoodTimeIndex > 0) {
                selectedFoodTimeIndex -= 1;
                loadPatientFood(selectedFoodTimeIndex);
                nextBtn.setEnabled(true);
                nextBtn.setBackgroundTintList(
                        ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.chip_new_color)));
                submitBtn.setEnabled(false);
                if (selectedFoodTimeIndex == 0) {
                    prevBtn.setEnabled(false);
                    prevBtn.setBackgroundTintList(
                            ColorStateList.valueOf(ContextCompat.getColor(activity, R.color.chip_default_color)));

                }
                // For Scrolling - UX
                if (selectedFoodTimeIndex == 2)
                    foodTimeRV.smoothScrollToPosition(0);
            }

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        int viewId = compoundButton.getId();
        if (viewId == R.id.noMealCB) {
            if (isChecked) {
                // No food taken at particular time
//                foodTimeList.get(selectedFoodTimeIndex).setFoodNotTaken(true);
                addPatientFoodBtn.setEnabled(false);
                addPatientFoodBtn.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(activity, R.color.disabled_text_color)));
            } else {
                // Food taken at particular time
//                foodTimeList.get(selectedFoodTimeIndex).setFoodNotTaken(false);
                addPatientFoodBtn.setEnabled(true);
                addPatientFoodBtn.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(activity, R.color.clickable_color)));
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        serialNo = 0;
        newFoodId = -1;
    }


//    private boolean formValidation() {
//        return Validator.emptyCheckingContainer(this, bi.GrpName);
//    }

}