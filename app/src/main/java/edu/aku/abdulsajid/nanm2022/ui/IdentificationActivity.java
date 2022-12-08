package edu.aku.abdulsajid.nanm2022.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityIdentificationBinding;
import edu.aku.abdulsajid.nanm2022.models.AdolList;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.models.Villages;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA1Activity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private int c, c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        bi.btnContinue.setText(R.string.open_hh_form);
        if (MainApp.superuser) bi.btnContinue.setText("Review Form");
        MainApp.form = new Forms();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkChild(View view) {
        if (!formValidation()) return;

        bi.childName.setText(null);
        bi.child.setVisibility(View.GONE);
        bi.hhhead.setText(null);
        bi.headhh.setVisibility(View.GONE);

        AdolList adolList = db.getChildBychildid(bi.a109.getText().toString(), bi.a105.getText().toString());

        if (!adolList.getChild_id().equals("")) {

            bi.childName.setText(adolList.getChild_name());
            bi.child.setVisibility(View.VISIBLE);
            bi.hhhead.setText(adolList.getHh_head());
            bi.headhh.setVisibility(View.VISIBLE);

            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);

            MainApp.currentADOL = adolList;

        } else {
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
            Toast.makeText(this, "Child not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        childExists();
        if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        }
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean childExists() {

        MainApp.form = new Forms();
        try {
            MainApp.form = db.getFormByAdolSNO(MainApp.currentADOL.getSrno(), MainApp.currentADOL.getVillage_code());
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;
    }


    public void searchVillage(View view) {
        bi.btnContinue.setEnabled(false);
        bi.a106.setText(null);
        bi.a107.setText(null);
        bi.a108.setText(null);
        bi.a105.setText(null);
        bi.childName.setText(null);
        bi.hhhead.setText(null);
        bi.checkHhhead.setChecked(false);
        bi.checkChild.setChecked(false);
        bi.fldGrpA105.setVisibility(View.GONE);

//        Clusters clusters = db.getCluster(bi.a109.getText().toString());
        Villages villages = db.getVillage(bi.a109.getText().toString());

        String geoarea = villages.getGeoarea();
        if (!villages.getVillage_code().equals("")) {
            bi.a106.setText(geoarea.split("\\|")[0]);
            bi.a107.setText(geoarea.split("\\|")[1]);
            bi.a108.setText(geoarea.split("\\|")[2]);

            bi.fldGrpA105.setVisibility(View.VISIBLE);

            MainApp.selectedTehsil = bi.a107.getText().toString();
            MainApp.selectedUC = bi.a108.getText().toString();

        } else {
            Toast.makeText(this, "Village not found", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }
}
