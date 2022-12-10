package edu.aku.abdulsajid.nanm2022.ui.lists;

import static android.view.View.VISIBLE;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.allAdolList;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.allMWRAList;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.familyList;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.familyMember;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedAdol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedChild;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedMWRA;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.adapters.FamilyMembersAdapter;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityFamilyListBinding;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA2Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA3AActivity;


public class FamilyMembersListActivity extends AppCompatActivity {


    private static final String TAG = "FamilyMembersListActivity";
    private final boolean selectionCheck = false;
    ActivityFamilyListBinding bi;
    NANMRoomDatabase db;
    private FamilyMembersAdapter familyMembersAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK && !MainApp.superuser) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();

                        MainApp.familyList.add(MainApp.familyMember);

                        // Set if relation to household head is head himself
                        MainApp.hhheadSelected = MainApp.familyMember.getA203().equals("1");

                        // Adding Parents
                        boolean memAgeCheck = Integer.parseInt(MainApp.familyMember.getA206yy()) > 14;
                        boolean memMarriedCheck = !MainApp.familyMember.getA211().equals("2");
                        String memGender = MainApp.familyMember.getA204();
                        if (memMarriedCheck && memAgeCheck) {
                            switch (memGender) {
                                case "1":
                                    MainApp.fatherList.add(MainApp.familyMember);
                                    //MainApp.mwraCount++;
                                    break;
                                case "2":
                                    MainApp.motherList.add(MainApp.familyMember);
                                    // if present add SNO to allMWRAlist

                                    if (MainApp.familyMember.getA212().equals("1") && Integer.parseInt(MainApp.familyMember.getA206yy()) < 50) {
                                        MainApp.allMWRAList.add(MainApp.familyMember);
                                    }
                                    //MainApp.adolCount++;
                                    break;

                            }
                        }

                        /**
                         *  Populate All Children Under-5
                         */
                        if (MainApp.familyMember.getA212().equals("1") && Integer.parseInt(MainApp.familyMember.getA206yy()) < 5) {
                            MainApp.allChildrenList.add(MainApp.familyMember);

                        }

                        /**
                         *  Populate All Adolescent between 10-15
                         */
                        if (MainApp.familyMember.getA212().equals("1") && Integer.parseInt(MainApp.familyMember.getA206yy()) > 9 && Integer.parseInt(MainApp.familyMember.getA206yy()) < 15) {
                            MainApp.allAdolList.add(MainApp.familyMember);

                        }

                        /** populateMothersList
                         *      Familymember has a value in mothers Serial Number (HL8)
                         *      Mother not already exists in the MWRA List
                         */

                        String motherSno = MainApp.familyMember.getA214();
                        if (Integer.parseInt(MainApp.familyMember.getA206yy()) < 5 && MainApp.familyMember.getA212().equals("1")
                                && !motherSno.equals("")
                                && !motherSno.equals("97")
                                && !MainApp.mwraList.contains(Integer.parseInt(motherSno))

                        ) {
                            FamilyMembers mother = MainApp.familyList.get(Integer.parseInt(motherSno) - 1);
                            /**
                             * Mother is present
                             * Mother's age is between 15 - 49
                             */
                            if (mother.getA212().equals("1") && Integer.parseInt(mother.getA206yy()) > 14 && Integer.parseInt(mother.getA206yy()) < 50) {
                                MainApp.mwraList.add(Integer.parseInt(motherSno));
                            }
                        }

                        MainApp.memberCount++;
                        familyMembersAdapter.notifyItemInserted(MainApp.familyList.size() - 1);
                        //  Collections.sort(MainApp.fm, new SortByStatus());
                        //fmAdapter.notifyDataSetChanged();

                        //        }
                        checkCompleteFm();
                    }
                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(FamilyMembersListActivity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });
    private ArrayList<String> motherNames, childNames, adolNames;
    private ArrayList<String> motherSno, childSno, adolSno;

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_family_list);
        bi.setCallback(this);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        db = MainApp.appInfo.dbHelper;
        MainApp.familyList = new ArrayList<>();
        MainApp.mwraList = new ArrayList<>();
        MainApp.allMWRAList = new ArrayList<>();
        MainApp.allChildrenList = new ArrayList<>();
        MainApp.allAdolList = new ArrayList<>();


        MainApp.fatherList = new ArrayList<>();
        MainApp.motherList = new ArrayList<>();
        Log.d(TAG, "onCreate(familyList): " + MainApp.familyList.size());


            MainApp.familyList = db.familyMembersDao().getMemberBYUID(MainApp.form.getUid());
            int fmCount = 0;
            for (FamilyMembers fm : MainApp.familyList) {
                fmCount++;

                // Adding Parents
                boolean memAgeCheck = Integer.parseInt(fm.getA206yy()) > 14;
                boolean memMarriedCheck = !fm.getA211().equals("2");
                String memGender = fm.getA204();
                if (memMarriedCheck && memAgeCheck) {
                    switch (memGender) {
                        case "1":
                            MainApp.fatherList.add(fm);
                            //MainApp.mwraCount++;
                            break;
                        case "2":
                            MainApp.motherList.add(fm);

                            if (fm.getA212().equals("1") && Integer.parseInt(fm.getA206yy()) < 50) {
                                MainApp.allMWRAList.add(fm);
                            }
                            //MainApp.adolCount++;
                            break;
                    }
                }

                // Populate All U-5 Children
                if (fm.getA212().equals("1") && Integer.parseInt(fm.getA206yy()) < 5) {
                    MainApp.allChildrenList.add(fm);
                }

                // Populate All Adolescent between 10 to 15
                /*if (fm.getA212().equals("1") && Integer.parseInt(fm.getA206yy()) > 9 && Integer.parseInt(fm.getA206yy()) < 15)
                    MainApp.allAdolList.add(fm);*/
                if (fm.getA212().equals("1") && fm.getA207().equals("1")) {
                    allAdolList.add(fm);
                }


                // Populate mothers' list
                String motherSno = fm.getA214(); // mother's line number from child
                if (Integer.parseInt(fm.getA206yy()) < 5 && fm.getA212().equals("1") &&
                        !motherSno.equals("") && !motherSno.equals("97") && !MainApp.mwraList.contains(Integer.parseInt(motherSno))) {
                    // MainApp.mwraList.add(Integer.parseInt(motherSno));
                    FamilyMembers mother = MainApp.familyList.get(Integer.parseInt(motherSno) - 1);

                    if (mother.getA212().equals("1") && Integer.parseInt(mother.getA206yy()) > 14 && Integer.parseInt(mother.getA206yy()) < 50) {
                        MainApp.mwraList.add(Integer.parseInt(motherSno));
                    }
                }


            }


        selectedMWRA = "";
        selectedChild = "";
        selectedAdol = "";

        // Set Selected Members
        for (int i = 0; i < MainApp.familyList.size(); i++) {

            // Set Adolescent
            if (MainApp.familyList.get(i).getIndexed().equals("1")) {
                selectedAdol = familyList.get(i).getA201();
                bi.btnRand.setVisibility(View.INVISIBLE);
                bi.btnContinue.setEnabled(true);
                bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
                // break;
            }
            MainApp.hhheadSelected = MainApp.familyList.get(i).getA203().equals("1");
        }


        bi.btnContinue.setEnabled(!selectedAdol.equals(""));
        bi.btnContinue.setBackground(!selectedAdol.equals("") ? getResources().getDrawable(R.drawable.button_shape_green) : getResources().getDrawable(R.drawable.button_shape_gray));

        //bi.btnContinue.setVisibility(!MainApp.selectedMWRA.equals("") ? View.VISIBLE : View.INVISIBLE);
        MainApp.memberCount = Math.round(MainApp.familyList.size());

        familyMembersAdapter = new FamilyMembersAdapter(this, MainApp.familyList);

        bi.rvMwra.setAdapter(familyMembersAdapter);
        bi.rvMwra.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainApp.superuser) {
                    Toast.makeText(FamilyMembersListActivity.this, "Supervisors cannot add new members.", Toast.LENGTH_LONG).show();

                } else if (selectedMWRA.equals("")) {
                    //     Toast.makeText(MwraActivity.this, "Opening Mwra Form", Toast.LENGTH_LONG).show();
                    MainApp.familyMember = new FamilyMembers();
                    addMoreMember();
                } else {
                    Toast.makeText(FamilyMembersListActivity.this, "This form has been locked. You cannot add new family member to locked forms", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();

        // Family Complete criteria: MWRA must exist
        if (allAdolList.size() > 0) bi.familyComplete.setVisibility(VISIBLE);
        else bi.familyComplete.setVisibility(View.GONE);

        // Disable family complete check if MWRA indexed
        if (!selectedAdol.equals("")) {
            bi.familyComplete.setChecked(true);
            bi.familyComplete.setEnabled(false);
        }
        checkCompleteFm();
    }


    private void checkCompleteFm() {
        int compCount = MainApp.familyList.size();
        MainApp.memberCountComplete = compCount;
    }

    public void btnContinue(View view) {

        try {
            MainApp.familyMember = db.familyMembersDao().getSelectedMemberBYUID(MainApp.form.getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(FamilyMembers): " + e.getMessage(), Toast.LENGTH_LONG).show();

        }

        finish();
        startActivity(new Intent(this, selectedAdol.equals("") ? EndingActivity.class : SectionA3AActivity.class).putExtra("complete", true));

    }


    private void proceedSelect() {
        // Updating database to mark selected Adol
        /**
         * Select youngest adol on basis of age in days
         * */
        if (!allAdolList.isEmpty()) {
            bi.familyComplete.setEnabled(false);

            for (FamilyMembers adol : allAdolList) {
                if (allAdolList.size() > 0)
                    selectedAdol = adol.getA201();
            }
            if (!selectedAdol.equals("")) {
                MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedAdol) - 1);
                familyMember.setIndexed("3");
                db.familyMembersDao().updateFamilyMembers(familyMember);

                // Updating adapter
                MainApp.familyList.get(Integer.parseInt(MainApp.selectedAdol) - 1).setIndexed("4");
            } /*else {
                MainApp.familyMember = allAdolList.get(new Random().nextInt(allAdolList.size()));
                familyMember.setIndexed("4");
                db.familyMembersDao().updateFamilyMembers(familyMember);
                //db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "4");
                selectedAdol = familyMember.getA201();

                // Updating adapter
                MainApp.familyList.get(Integer.parseInt(MainApp.selectedAdol) - 1).setIndexed("4");
            }*/
            familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedAdol) - 1);
        } else Toast.makeText(this, "NO ADOLESCENT IN HH", Toast.LENGTH_SHORT).show();

        bi.btnRand.setVisibility(View.INVISIBLE);
        // bi.btnContinue.setVisibility(View.VISIBLE);
        bi.btnContinue.setEnabled(true);
        bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
    }


    private void addMoreMember() {
        MainApp.familyMember = new FamilyMembers();
        Intent intent = new Intent(this, SectionA2Activity.class);
        MemberInfoLauncher.launch(intent);
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    public void btnRand(View view) {
        if (allAdolList.size() > 0 && selectedAdol.equals("")) proceedSelect();
        else bi.btnRand.setVisibility(VISIBLE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_OK)

            // A214 is line number
            familyMembersAdapter.notifyItemInserted(Integer.parseInt(MainApp.familyMember.getA214()) - 1);

    }


    public void finalizeFamily(View view) {
        if (bi.familyComplete.isChecked()) {
            if (allMWRAList.size() > 0 && selectedMWRA.equals("")) {
                //MainApp.fm.get(Integer.parseInt(String.valueOf(MainApp.selectedMWRA))).setStatus("1");
                bi.btnRand.setVisibility(VISIBLE);
                // bi.btnContinue.setVisibility(View.INVISIBLE);
                bi.btnContinue.setEnabled(false);
                bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_gray));

            } else {
                bi.btnRand.setVisibility(View.INVISIBLE);
                // bi.btnContinue.setVisibility(View.VISIBLE);
                bi.btnContinue.setEnabled(true);
                bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
            }
        } else {
            bi.btnRand.setVisibility(View.INVISIBLE);
            bi.btnContinue.setEnabled(false);
            bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_gray));
        }
    }


}