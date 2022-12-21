package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.form;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;

import android.app.Activity;
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
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionA3BBinding;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;

public class SectionA3BActivity extends AppCompatActivity {

    private static final String TAG = "SectionA3BActivity";
    ActivitySectionA3BBinding bi;
    private NANMRoomDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a3_b);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        if (form.getUid() != null) {
            try {
                form.sA3BHydrate(form.getSA3B());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bi.setForm(form);
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            //updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SA, MainApp.form.sAtoString());
            Forms updateForms = form;
            updateForms.setSA3B(form.sA3BtoString());
            updcount = db.formsDao().updateForm(updateForms);

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
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionA4AActivity.class));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;

        if (form.getA327a().equals("0") && form.getA327b().equals("0"))
            return Validator.emptyCustomTextBox(this, bi.a327a, "Total cannot be 0");

        if (form.getA329a().equals("0") && form.getA329b().equals("0")
                && form.getA329c().equals("0") && form.getA329d().equals("0")
                && form.getA329e().equals("0") && form.getA329f().equals("0"))
            return Validator.emptyCustomTextBox(this, bi.a329a, "Total cannot be 0");

        return true;
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
        //setContentView(R.layout.activity_section_a3_b);
    }
}