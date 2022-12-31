package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.form;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;

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
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionA5BBinding;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;

public class SectionA5BActivity extends AppCompatActivity {

    private static final String TAG = "SectionA5BActivity";
    ActivitySectionA5BBinding bi;
    private NANMRoomDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a5_b);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        if (form.getUid() != null) {
            try {
                form.sA5BHydrate(form.getSA5B());
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
            updateForms.setSA5B(form.sA5BtoString());
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
            startActivity(new Intent(this, SectionB1Activity.class));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;

        if (Integer.parseInt(bi.a5221bx.getText().toString()) + Integer.parseInt(bi.a5221cx.getText().toString()) > Integer.parseInt(bi.a5221ax.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.a5221ax, "Invalid Count");

        if (Integer.parseInt(bi.a5222bx.getText().toString()) + Integer.parseInt(bi.a5222cx.getText().toString()) > Integer.parseInt(bi.a5222ax.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.a5222ax, "Invalid Count");

        if (Integer.parseInt(bi.a5223bx.getText().toString()) + Integer.parseInt(bi.a5223cx.getText().toString()) > Integer.parseInt(bi.a5223ax.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.a5223ax, "Invalid Count");

        if (Integer.parseInt(bi.a5224bx.getText().toString()) + Integer.parseInt(bi.a5224cx.getText().toString()) > Integer.parseInt(bi.a5224ax.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.a5224ax, "Invalid Count");

        if (Integer.parseInt(bi.a5225bx.getText().toString()) + Integer.parseInt(bi.a5225cx.getText().toString()) > Integer.parseInt(bi.a5225ax.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.a5225ax, "Invalid Count");

        if (Integer.parseInt(bi.a5226bx.getText().toString()) + Integer.parseInt(bi.a5226cx.getText().toString()) > Integer.parseInt(bi.a5226ax.getText().toString()))
            return Validator.emptyCustomTextBox(this, bi.a5226ax, "Invalid Count");

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
    }
}