package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.indexedPreg;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.pregM;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedMWRA;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper;
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionE1aBinding;
import edu.aku.abdulsajid.nanm2022.models.PregnancyDetails;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;

public class SectionE1AActivity extends AppCompatActivity {

    private static final String TAG = "SectionE1AActivity";
    ActivitySectionE1aBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e1a);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;


        try {
            MainApp.pregM = db.getPregMByFmuid(MainApp.allMWRAList.get(0).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(PregM): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        // Name
        MainApp.pregM.setE101a(MainApp.allMWRAList.get(0).getA202());

        // SNO
        MainApp.pregM.setE101b(MainApp.allMWRAList.get(0).getA201());

        // FMUID
        MainApp.pregM.setFmuid(MainApp.allMWRAList.get(0).getUid());
        bi.setPregM(MainApp.pregM);


    }


    private boolean insertNewRecord() {
        if (!MainApp.pregM.getUid().equals("") || MainApp.superuser) return true;
        MainApp.pregM.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPregnancyMaster(MainApp.pregM);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.pregM.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.pregM.setUid(MainApp.pregM.getDeviceId() + MainApp.pregM.getId());
            db.updatesPregnancyMasterColumn(TableContracts.PregnancyMasterTable.COLUMN_UID, MainApp.pregM.getUid());
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
            updcount = db.updatesPregnancyMasterColumn(TableContracts.PregnancyMasterTable.COLUMN_SE1, MainApp.pregM.sE1toString());
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

        if (MainApp.pregM.getE101b().equals(selectedMWRA)) {
            indexedPreg = pregM.getE102a();
        }
        if (MainApp.pregM.getUid().equals("") ? insertNewRecord() : updateDB()) {


            if (MainApp.pregM.getE101().equals("1")) {
                MainApp.totalPreg = Integer.parseInt(MainApp.pregM.getE102());
                MainApp.totalPreg = MainApp.pregM.getE102a().equals("1") ? MainApp.totalPreg - 1 : MainApp.totalPreg;
            } else {
                MainApp.totalPreg = 0;
            }
            finish();
            // Pregnancy Outcome History is ZERO goto PregDetails
            if (MainApp.totalPreg > 0) {
                MainApp.pregD = new PregnancyDetails();
                finish();
//                startActivity(new Intent(this, PregnancyListActivity.class).putExtra("complete", true));

            } else {


                // Remove current MWRA if not going to Pregnancy List
                MainApp.allMWRAList.remove(0);

                // If More MWRA Exists restart this activity for next MWRA
                if (MainApp.allMWRAList.size() > 0) {
                    finish();
                    startActivity(new Intent(this, SectionE1AActivity.class).putExtra("complete", true));

                } else {
                    finish();

                    // if no more pregnancy and no more mwra than go to E2
//                    startActivity(new Intent(this, SectionE2AActivity.class).putExtra("complete", true));

                }

            }

        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        // Allow BackPress
        // super.onBackPressed();

        // Dont Allow BackPress
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}