package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.familyMember;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.memberCount;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper;
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionDBinding;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;


public class SectionDActivity extends AppCompatActivity {

    private static final String TAG = "SectionDActivity";
    ActivitySectionDBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> fatherNames, fatherCodes, motherNames, motherCodes, motherUID, motherPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        familyMember.setD101(String.valueOf(memberCount + 1));
        bi.setMember(familyMember);
        populateSpinner();
        setupListener();
    }

    private void setupListener() {
        bi.d102.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.d102Name.setVisibility(View.VISIBLE);
                bi.d102Name.setText(getString(R.string.d103t1) + " " + familyMember.getD102() + " " + getString(R.string.d103t2));
            }
        });
    }


    private void populateSpinner() {

        fatherNames = new ArrayList<>();
        fatherCodes = new ArrayList<>();

        motherNames = new ArrayList<>();
        motherCodes = new ArrayList<>();

        motherUID = new ArrayList<>();
        motherPresent = new ArrayList<>();

        fatherNames.add("...");
        fatherCodes.add("...");
        for (FamilyMembers fl : MainApp.fatherList) {
            fatherNames.add(fl.getD102());
            fatherCodes.add(fl.getD101());
        }
        fatherNames.add("Not Available/Died");
        fatherCodes.add("97");

        motherNames.add("...");
        motherCodes.add("...");
        motherUID.add("...");
        motherPresent.add("...");
        for (FamilyMembers fl : MainApp.motherList) {
            motherNames.add(fl.getD102());
            motherCodes.add(fl.getD101());
            motherUID.add(fl.getUid());
            motherPresent.add(fl.getD115().equals("1") && Integer.parseInt(fl.getD109y()) < 50 ? "1" : "2");
        }
        motherNames.add("Not Available/Died");
        motherCodes.add("97");
        motherUID.add("");
        motherPresent.add("");

        // Apply the adapter to the Father spinner
        bi.d106.setAdapter(new ArrayAdapter<>(SectionDActivity.this, R.layout.custom_spinner, fatherNames));

        bi.d106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setD106(fatherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Apply the adapter to the Mother spinner
        bi.d107.setAdapter(new ArrayAdapter<>(SectionDActivity.this, R.layout.custom_spinner, motherNames));

        bi.d107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setD107(motherCodes.get(position));
                MainApp.familyMember.setMuid(motherUID.get(position));
                MainApp.familyMember.setMotherPresent(motherPresent.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


    }


    private boolean insertNewRecord() {
        if (!familyMember.getUid().equals("")) return true;
        if (MainApp.superuser) return true;

        // Populate MetaData from MainApp.Forms and any other master tables
        MainApp.familyMember.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addFamilyMembers(familyMember);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        familyMember.setId(String.valueOf(rowId));
        if (rowId > 0) {
            familyMember.setUid(familyMember.getDeviceId() + familyMember.getId());
            db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_UID, familyMember.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_SD, familyMember.sDtoString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (MainApp.familyMember.getUid().equals("") ? insertNewRecord() : updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {

        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;

        if (!MainApp.familyMember.getD109d().equals("98") && Integer.parseInt(MainApp.familyMember.getD109d()) > 29) {
            Validator.emptyCustomTextBox(this, bi.d109d, "Invalid day's value");
            return false;
        }

        if (!MainApp.familyMember.getD109m().equals("98") && Integer.parseInt(MainApp.familyMember.getD109m()) > 11) {
            Validator.emptyCustomTextBox(this, bi.d109m, "Invalid month's value");
            return false;
        }
        return true;
    }


    @Override
    public void onBackPressed() {
        setResult(Activity.RESULT_CANCELED);
        finish();
        super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}