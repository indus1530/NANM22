package edu.aku.abdulsajid.nanm2022.ui.sections;


import static edu.aku.abdulsajid.nanm2022.core.MainApp.adol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.allAdolList;

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
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityAdolSelectBinding;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;


public class AdolSelectionActivity extends AppCompatActivity {
    private static final String TAG = "AdolSelectionActivity";
    ActivityAdolSelectBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> adolNames, adolCodes, adolAges, adolFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
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
            adolNames.add(fm.getD102());
            adolCodes.add(fm.getD101());
            adolAges.add(fm.getD109y());
            adolFmUID.add(fm.getUid());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AdolSelectionActivity.this,
                R.layout.custom_spinner, adolNames);

        bi.d102.setAdapter(adapter);
 /*       bi.es1resp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ladol.setEs1respline(adolCodes.get(bi.es1resp.getSelectedItemPosition()));
                ladol.setFmuid(adolFmUID.get(bi.es1resp.getSelectedItemPosition()));
                bi.age.setText(adolAges.get(bi.es1resp.getSelectedItemPosition()));
                if (position == 0) return;
                if (Integer.parseInt(adolAges.get(bi.es1resp.getSelectedItemPosition())) >= 18) {
                    bi.fldGrpCVes1cons.setVisibility(View.GONE);
                    ladol.setEs1cons("99");
                } else {
                    bi.fldGrpCVes1cons.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
        bi.d102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //ladol = new LateAdolescent();
                bi.age.setText("");
                bi.d101.setText("");

                //  if (position == 0) return;
                try {
                    adol = db.getAdolByUUID(adolFmUID.get(bi.d102.getSelectedItemPosition()));
                    if (MainApp.adol.getUid().equals("")) {
                        MainApp.adol.setFmuid(adolFmUID.get(bi.d102.getSelectedItemPosition()));
                        MainApp.adol.setSno(adolCodes.get(bi.d102.getSelectedItemPosition()));
                        /*MainApp.adol.setEs1respline(adolCodes.get(bi.d102.getSelectedItemPosition()));
                        MainApp.adol.setEs1resp(adolNames.get(bi.d102.getSelectedItemPosition()));*/
                    }
                    bi.d101.setText(adolCodes.get(bi.d102.getSelectedItemPosition()));
                    bi.age.setText(adolAges.get(bi.d102.getSelectedItemPosition()));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(AdolSelectionActivity.this, "JSONException(Adolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }


/*                if (Integer.parseInt(adolAges.get(bi.es1resp.getSelectedItemPosition())) >= 18) {
                    bi.fldGrpCVes1cons.setVisibility(View.GONE);
                    ladol.setEs1cons("99");
                } else {
                    bi.fldGrpCVes1cons.setVisibility(View.VISIBLE);
                }*/
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

        allAdolList.remove(bi.d102.getSelectedItemPosition() - 1);
        startActivity(new Intent(this, SectionAH1Activity.class).putExtra("age", bi.age.getText().toString()));
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