package edu.aku.abdulsajid.nanm2022.ui.sections;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.adol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.familyList;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedAdol;
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
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionD1Binding;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.ChildEndingActivity;

public class SectionD1Activity extends AppCompatActivity {

    private static final String TAG = "SectionD1Activity";
    ActivitySectionD1Binding bi;
    private NANMRoomDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d1);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.sno.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA201());
        bi.name.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());
        bi.index.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getIndexed());
        bi.d105.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());

        if(adol.getUid() != null)
        {
            try {
                adol.sD1Hydrate(adol.getSD1());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bi.setForm(adol);
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            //updcount = db.updatesAdolColumn(TableContracts.AdolescentTable.COLUMN_SD1, adol.sD1toString());
            Adolescent adol = MainApp.adol;
            adol.setSD1(MainApp.adol.sD1toString());
            updcount = db.adolescentDao().updateAdolescent(adol);
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
            startActivity(new Intent(this, SectionD2Activity.class));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, ChildEndingActivity.class).putExtra("complete", false));
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