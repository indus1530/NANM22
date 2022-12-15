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
import edu.aku.abdulsajid.nanm2022.databinding.ActivitySectionC2Binding;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.ChildEndingActivity;

public class SectionC2Activity extends AppCompatActivity {

    private static final String TAG = "SectionC2Activity";
    ActivitySectionC2Binding bi;
    private NANMRoomDatabase db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c2);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.sno.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA201());
        bi.name.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());
        bi.index.setText(familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getIndexed());

        if (adol.getUid() != null) {
            try {
                adol.sC2Hydrate(adol.getSC2());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bi.setForm(adol);

        bi.c201text.setText(String.format(getResources().getString(R.string.c201), adol.getName()));
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            //updcount = db.updatesAdolColumn(TableContracts.AdolescentTable.COLUMN_SC2, adol.sC2toString());
            Adolescent adol = MainApp.adol;
            adol.setSC2(MainApp.adol.sC2toString());
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
            startActivity(new Intent(this, SectionC3Activity.class));
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