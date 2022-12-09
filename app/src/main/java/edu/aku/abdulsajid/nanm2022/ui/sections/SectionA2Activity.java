package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.familyMember;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.memberCount;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
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
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionA2Binding;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;


public class SectionA2Activity extends AppCompatActivity {

    private static final String TAG = "SectionA2Activity";
    ActivitySectionA2Binding bi;
    private NANMRoomDatabase db;
    private ArrayList<String> fatherNames, fatherCodes, motherNames, motherCodes, motherUID, motherPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a2);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        familyMember.setA201(String.valueOf(memberCount + 1));

        bi.setMember(familyMember);
        populateSpinner();
        setupListener();
    }

    private void setupListener() {
/*        bi.a202.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.a202Name.setVisibility(View.VISIBLE);
                bi.a202Name.setText(getString(R.string.d103t1) + " " + familyMember.getA202() + " " + getString(R.string.d103t2));
            }
        });*/
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
            fatherNames.add(fl.getA202());
            fatherCodes.add(fl.getA201());
        }
        fatherNames.add("Not Available/Died");
        fatherCodes.add("97");

        motherNames.add("...");
        motherCodes.add("...");
        motherUID.add("...");
        motherPresent.add("...");
        for (FamilyMembers fl : MainApp.motherList) {
            motherNames.add(fl.getA202());
            motherCodes.add(fl.getA201());
            motherUID.add(fl.getUid());
            motherPresent.add(fl.getA212().equals("1") && Integer.parseInt(fl.getA206yy()) < 50 ? "1" : "2");
        }
        motherNames.add("Not Available/Died");
        motherCodes.add("97");
        motherUID.add("");
        motherPresent.add("");

        // Apply the adapter to the Father spinner
        bi.a213.setAdapter(new ArrayAdapter<>(SectionA2Activity.this, R.layout.custom_spinner, fatherNames));

        bi.a213.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setA213(fatherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Apply the adapter to the Mother spinner
        bi.a214.setAdapter(new ArrayAdapter<>(SectionA2Activity.this, R.layout.custom_spinner, motherNames));

        bi.a214.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setA214(motherCodes.get(position));
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
            //rowId = db.addFamilyMembers(familyMember);
            rowId = db.familyMembersDao().addFamilyMembers(familyMember);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        familyMember.setId(rowId);
        if (rowId > 0) {
            familyMember.setUid(familyMember.getDeviceId() + familyMember.getId());
            db.familyMembersDao().updateFamilyMembers(familyMember);
            //db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_UID, familyMember.getUid());
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
            //updcount = db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_SD, familyMember.sDtoString());
            FamilyMembers updatedFamilyMember = familyMember;
            updatedFamilyMember.setSA2(familyMember.sA2toString());
            updcount = db.familyMembersDao().updateFamilyMembers(updatedFamilyMember);
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

        if (!MainApp.familyMember.getA206dd().equals("98") && Integer.parseInt(MainApp.familyMember.getA206dd()) > 29) {
            Validator.emptyCustomTextBox(this, bi.a206dd, "Invalid day's value");
            return false;
        }

        if (!MainApp.familyMember.getA206mm().equals("98") && Integer.parseInt(MainApp.familyMember.getA206mm()) > 11) {
            Validator.emptyCustomTextBox(this, bi.a206mm, "Invalid month's value");
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