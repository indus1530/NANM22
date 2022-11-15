package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.familyList;
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
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionKBinding;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;

public class SectionKActivity extends AppCompatActivity {


    private static final String TAG = "SectionKActivity";
    ActivitySectionKBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_k);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.toolbar.setSubtitle("SNO: " + familyList.get(Integer.parseInt(selectedMWRA) - 1).getD101()
                + ", IND: " + familyList.get(Integer.parseInt(selectedMWRA) - 1).getIndexed()
                + ", NAME: " + familyList.get(Integer.parseInt(selectedMWRA) - 1).getD102());
       /* bi.sno.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getD101());
        bi.name.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getD102());
        bi.index.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getIndexed());*/

        try {
            MainApp.mwra = db.getMwraByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(MWRA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        bi.setMwra(MainApp.mwra);
    }

    private boolean insertNewRecord() {
        if (!MainApp.mwra.getUid().equals("") || MainApp.superuser) return true;
        MainApp.mwra.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addMWRA(MainApp.mwra);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.mwra.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.mwra.setUid(MainApp.mwra.getDeviceId() + MainApp.mwra.getId());
            db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_UID, MainApp.mwra.getUid());
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
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SK, MainApp.mwra.sKtoString());
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
        if (MainApp.mwra.getUid().equals("") ? insertNewRecord() : updateDB()) {
            finish();
            startActivity(new Intent(this, SectionUNActivity.class).putExtra("complete", true));
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
        setResult(RESULT_CANCELED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}