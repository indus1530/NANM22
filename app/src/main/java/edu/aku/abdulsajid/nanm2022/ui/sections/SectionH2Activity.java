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
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionH2Binding;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;

public class SectionH2Activity extends AppCompatActivity {

    private static final String TAG = "SectionH2Activity";
    ActivitySectionH2Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h2);
        bi.toolbar.setSubtitle("MWRA Child:\t\t" + "Sno: " + familyList.get(Integer.parseInt(selectedMWRA) - 1).getD101()
                + ",\tInd: " + familyList.get(Integer.parseInt(selectedMWRA) - 1).getIndexed()
                + ",\t Name: " + familyList.get(Integer.parseInt(selectedMWRA) - 1).getD102()
                + " \t");
        bi.setMwra(MainApp.mwra);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

    }


    private void setupSkips() {

    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SH2, MainApp.mwra.sH2toString());
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
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionKActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;

        if (MainApp.mwra.getH202().equals("1") && Integer.parseInt(MainApp.mwra.getH203d()) == 0 && Integer.parseInt(MainApp.mwra.getH203h()) == 0 && Integer.parseInt(MainApp.mwra.getH203w()) == 0)
            return Validator.emptyCustomTextBox(this, bi.h203w, "All cannot be Zero");

        return true;
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