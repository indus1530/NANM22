package edu.aku.abdulsajid.nanm2022.ui;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;

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
import edu.aku.abdulsajid.nanm2022.databinding.ActivityIdentificationBinding;
import edu.aku.abdulsajid.nanm2022.models.AdolList;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.models.Villages;
import edu.aku.abdulsajid.nanm2022.models.WISC;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA1Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.WISCActivity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private NANMRoomDatabase db;
    private int c, c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        bi.btnContinue.setText(R.string.open_hh_form);

        if (MainApp.user.getDesignation().equals("WISC Data Collector")) {
            bi.btnWISC.setVisibility(View.VISIBLE);
            bi.btnWISC.setText(R.string.open_wisc_form);
        } else bi.btnContinue.setVisibility(View.VISIBLE);
        if (MainApp.superuser) bi.btnContinue.setText("Review Form");
        MainApp.form = new Forms();
        MainApp.wisc = new WISC();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkChild(View view) {
        if (!formValidation()) return;

        bi.childName.setText(null);
        bi.child.setVisibility(View.GONE);
        bi.adolID.setText(null);
        bi.childID.setVisibility(View.GONE);
        bi.hhhead.setText(null);
        bi.headhh.setVisibility(View.GONE);

        AdolList adolList = new AdolList();

        //AdolList adolList = db.getChildBychildid(bi.a109.getText().toString(), bi.a105.getText().toString());

        try {
            adolList = db.adolListDao().getAdolBySno(bi.a109.getText().toString(), bi.a105.getText().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (adolList.getChild_id().equals("")) {
            adolList.getChild_id();
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnWISC.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
            bi.btnWISC.setEnabled(false);
            Toast.makeText(this, "Child not found", Toast.LENGTH_SHORT).show();
        } else {

            bi.childName.setText(adolList.getChild_name());
            bi.child.setVisibility(View.VISIBLE);
            bi.adolID.setText(adolList.getChild_id());
            bi.childID.setVisibility(View.VISIBLE);
            bi.hhhead.setText(adolList.getHh_head());
            bi.headhh.setVisibility(View.VISIBLE);

            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnWISC.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);
            bi.btnWISC.setEnabled(true);

            MainApp.currentADOL = adolList;
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

    public void btnWisc(View view) {
        if (!formValidation()) return;
        childExists();
        if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, WISCActivity.class));
        }
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean childExists() {

        MainApp.form = new Forms();
        try {
            //MainApp.form = db.formsDao().getFormByChildID(MainApp.currentHousehold.getChild_id(), MainApp.currentHousehold.getVillage_code());
            MainApp.form = db.formsDao().getFormByAdolSno(MainApp.currentADOL.getSrno(), MainApp.currentADOL.getVillage_code());
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;
    }


    public void searchVillage(View view) {
        bi.btnContinue.setEnabled(false);
        bi.btnWISC.setEnabled(false);
        bi.a106.setText(null);
        bi.a107.setText(null);
        bi.a108.setText(null);
        bi.a105.setText(null);
        bi.childName.setText(null);
        bi.adolID.setText(null);
        bi.hhhead.setText(null);
        bi.checkHhhead.setChecked(false);
        bi.checkChild.setChecked(false);
        bi.fldGrpA105.setVisibility(View.GONE);
        Villages villages = new Villages();

        try {
            villages = db.villagesDao().getVillage(bi.a109.getText().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String geoarea = villages.getGeoarea();
        if (villages.getVillage_code().equals("")) {
            villages.getVillage_code();
            Toast.makeText(this, "Village not found", Toast.LENGTH_SHORT).show();
        } else {
            bi.a106.setText(geoarea.split("\\|")[0]);
            bi.a107.setText(geoarea.split("\\|")[1]);
            bi.a108.setText(geoarea.split("\\|")[2]);

            bi.fldGrpA105.setVisibility(View.VISIBLE);

            MainApp.selectedTehsil = bi.a107.getText().toString();
            MainApp.selectedUC = bi.a108.getText().toString();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }
}
