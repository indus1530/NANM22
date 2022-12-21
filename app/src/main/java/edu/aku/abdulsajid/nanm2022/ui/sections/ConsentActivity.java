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
import edu.aku.abdulsajid.nanm2022.databinding.ActivityConsentBinding;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.EndingActivity;
import edu.aku.abdulsajid.nanm2022.ui.lists.FamilyMembersListActivity;


public class ConsentActivity extends AppCompatActivity {
    private static final String TAG = "ConsentActivity";
    ActivityConsentBinding bi;
    private NANMRoomDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_consent);
        if(form.getUid() != null) {
            try {
                form.sA1Hydrate(form.getSA1());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bi.setForm(form);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        /*String consentText = getString(R.string.consent, MainApp.user.getFullname());
        bi.consentTextView.setText(consentText);*/

    }


    private boolean updateDB() {
        int updcount = 0;
        try {
            Forms updateForms = form;
            updateForms.setSA1(form.sA1toString());
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
            Intent i;
            if (bi.a110a.isChecked()) {
                i = new Intent(this, FamilyMembersListActivity.class).putExtra("complete", true);
            } else {
                i = new Intent(this, EndingActivity.class).putExtra("complete", false);
            }
            finish();
            startActivity(i);
        } else {
            Toast.makeText(this, getString(R.string.upd_db_error), Toast.LENGTH_SHORT).show();
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        //startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }


}