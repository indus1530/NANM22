package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.currentADOL;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.wisc;

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
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityWiscBinding;
import edu.aku.abdulsajid.nanm2022.models.WISC;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.IdentificationActivity;

public class WISCActivity extends AppCompatActivity {

    private static final String TAG = "WISCActivity";
    ActivityWiscBinding bi;
    private NANMRoomDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_wisc);
        bi.wisc01.setText(currentADOL.getChild_name());
        wisc.setWisc01(currentADOL.getChild_name());

        /* Here is the hydrate function to open in edit mode*/
        if (wisc.getUid() != null) {
            try {
                wisc.sA1Hydrate(wisc.getSA1());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bi.setForm(wisc);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
    }

    private boolean insertNewRecord() throws JSONException {
        if (!MainApp.wisc.getUid().equals("") || MainApp.superuser) return true;
        MainApp.wisc.populateMeta();
        long rowId = 0;
        try {
            rowId = db.wiscDao().addWisc(wisc);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.wisc.setId(rowId);
        if (rowId > 0) {
            MainApp.wisc.setUid(MainApp.wisc.getDeviceId() + MainApp.wisc.getId());
            wisc.setSA1(wisc.sA1toString());
            db.wiscDao().updateWisc(wisc);
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
            WISC updateForms = wisc;
            updateForms.setSA1(wisc.sA1toString());
            updcount = db.wiscDao().updateWisc(updateForms);

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

    public void btnContinue(View view) throws JSONException {
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        wisc.setIStatus("1");
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            Intent i;
            i = new Intent(this, IdentificationActivity.class).putExtra("complete", true);
            startActivity(i);
            Toast.makeText(this, "Record Saved", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, IdentificationActivity.class));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}