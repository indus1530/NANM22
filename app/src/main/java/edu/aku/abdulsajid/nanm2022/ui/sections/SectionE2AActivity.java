package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.indexedPreg;

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
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionE2aBinding;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;

public class SectionE2AActivity extends AppCompatActivity {

    private static final String TAG = "SectionE2AActivity";
    ActivitySectionE2aBinding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e2a);
        bi.setForm(MainApp.form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        MainApp.mortalityCounter = 0;
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SE2, MainApp.form.sE2toString());
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

            // Remove current MWRA from the List (Test:Failed!!)
            // MainApp.allMWRAList.remove(0);

            if (bi.e11601.isChecked()) {
                MainApp.totalMortalities = Integer.parseInt(MainApp.form.getE117());
                startActivity(new Intent(this, SectionE2BActivity.class));
            } else if (indexedPreg.equals("1") || !MainApp.selectedChild.isEmpty()) {
                startActivity(new Intent(this, SectionF1Activity.class));
            } else {
                startActivity(new Intent(this, SectionKActivity.class));
            }
            finish();


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
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}