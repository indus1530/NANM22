package edu.aku.abdulsajid.nanm2022.ui.sections;


import static edu.aku.abdulsajid.nanm2022.core.MainApp.adol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.allAdolList;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
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
import edu.aku.abdulsajid.nanm2022.databinding.ActivityAdolSelectBinding;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;


public class AdolSelectionActivity extends AppCompatActivity {
    private static final String TAG = "AdolSelectionActivity";
    ActivityAdolSelectBinding bi;
    private NANMRoomDatabase db;
    private ArrayList<String> adolNames, adolCodes, adolAges, adolFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
//        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_adol_select);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        populateSpinner();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }


    private void populateSpinner() {

        // Populate Provinces

        adolNames = new ArrayList<>();
        adolCodes = new ArrayList<>();
        adolAges = new ArrayList<>();
        adolFmUID = new ArrayList<>();

        adolNames.add("...");
        adolCodes.add("");
        adolAges.add("");
        adolFmUID.add("");

        for (FamilyMembers fm : allAdolList) {
            adolNames.add(fm.getA202());
            adolCodes.add(fm.getA201());
            adolAges.add(fm.getA206yy());
            adolFmUID.add(fm.getUid());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AdolSelectionActivity.this,
                R.layout.custom_spinner, adolNames);
        bi.a202.setAdapter(adapter);

        bi.a202.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //ladol = new LateAdolescent();
                bi.age.setText("");
                bi.a201.setText("");

                //  if (position == 0) return;
                try {
                    //adol = db.getAdolByUUID(adolFmUID.get(bi.a202.getSelectedItemPosition()));
                    adol = db.adolescentDao().getAdolByUUid(MainApp.form.getUid(), adolFmUID.get(bi.a202.getSelectedItemPosition()));
                    if (MainApp.adol.getUid().equals("")) {
                        MainApp.adol.setFmuid(adolFmUID.get(bi.a202.getSelectedItemPosition()));
                        MainApp.adol.setChildSno(adolCodes.get(bi.a202.getSelectedItemPosition()));
                        /*MainApp.adol.setEs1respline(adolCodes.get(bi.a202.getSelectedItemPosition()));
                        MainApp.adol.setEs1resp(adolNames.get(bi.a202.getSelectedItemPosition()));*/
                    }
                    bi.a201.setText(adolCodes.get(bi.a202.getSelectedItemPosition()));
                    bi.age.setText(adolAges.get(bi.a202.getSelectedItemPosition()));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(AdolSelectionActivity.this, "JSONException(Adolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private boolean insertNewRecord() {
        return true;
/*
        if (!ladol.getUid().equals("") || MainApp.superuser) return true;

        ladol.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addAdolescent(ladol);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        ladol.setId(String.valueOf(rowId));
        if (rowId > 0) {
            ladol.setUid(ladol.getDeviceId() + ladol.getId());
            db.updatesAdolColumn(LateAdolescentTable.COLUMN_UID, ladol.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/
    }


    private boolean updateDB() {
        return true;
/*        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesAdolColumn(LateAdolescentTable.COLUMN_SE1, ladol.sE1toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;

        allAdolList.remove(bi.a202.getSelectedItemPosition() - 1);
        startActivity(new Intent(this, SectionC1Activity.class).putExtra("age", bi.age.getText().toString()));
        finish();


    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }
}