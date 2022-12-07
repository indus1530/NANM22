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
import edu.aku.abdulsajid.nanm2022.models.ChildList;
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


        /*bi.a109.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bi.btnContinue.setEnabled(false);
                bi.a106.setText(null);
                bi.a107.setText(null);
                bi.a108.setText(null);
                bi.a109.setText(null);
                bi.fldGrpA105.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });*/


        /*bi.a105.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                c = charSequence.length();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                c1 = charSequence.length();
                String txt = charSequence.toString();
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                Log.d(TAG, "onTextChanged: c-" + c + " c1-" + c1 + "\t\t\tCHAR: " + charSequence);
                Log.d(TAG, "onTextChanged: i-" + i + " i1-" + i1 + " i2-" + i2 + "\t\t\tCHAR: " + charSequence);
                if (c1 > 1 && charSequence.charAt(1) != '-') {
                    txt = txt.charAt(0) + "-" + txt.substring(1);
                    bi.a105.setText(txt);
                }
                if (c1 > 6 && charSequence.charAt(6) != '-') {
                    txt = txt.substring(0, 6) + "-" + txt.substring(6);
                    bi.a105.setText(txt);
                }
                bi.a105.setSelection(bi.a105.getText().length());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });*/


    }

   /* private void populateSpinner() {

        bi.a105.setText(db.getDistrictNameByCode());
        // Populate Provinces
        List<Villages> tehsils = db.getTehsilsByDistrict(String.valueOf(MainApp.selectedDistrict));

        tehsilNames = new ArrayList<>();
        tehsilCodes = new ArrayList<>();

        tehsilNames.add("...");
        tehsilCodes.add("...");
        if (MainApp.user.getUserName().equals("test1234")) {
            tehsilNames.add("Test Tehsil 1");
            tehsilNames.add("Test Tehsil 2");
            tehsilNames.add("Test Tehsil 3");

            tehsilCodes.add("91");
            tehsilCodes.add("92");
            tehsilCodes.add("93");
        }

        for (Villages t : tehsils) {

            tehsilNames.add(t.getTehsilName());
            tehsilCodes.add(t.getTcode());

        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this,
                R.layout.custom_spinner, tehsilNames);

        bi.a106.setAdapter(adapter);

        bi.a106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a107.setAdapter(null);
                bi.a101.setText(null);
                bi.a113.setText(null);

                if (position == 0) return;
                MainApp.selectedTehsil = tehsilCodes.get(position);
                // Populate UCs
                List<Villages> ucs = db.getUCsByTehsil(MainApp.selectedDistrict, MainApp.selectedTehsil);

                ucNames = new ArrayList<>();
                ucCodes = new ArrayList<>();

                ucNames.add("...");
                ucCodes.add("...");
                if (MainApp.user.getUserName().equals("test1234")) {
                    ucNames.add("Test UC 1");
                    ucNames.add("Test UC 2");
                    ucNames.add("Test UC 3");

                    ucCodes.add("9101");
                    ucCodes.add("9202");
                    ucCodes.add("9303");
                }
                psuCode = new ArrayList<>();

                for (Villages uc : ucs) {

                    ucNames.add(uc.getUcName());
                    ucCodes.add(uc.getUccode());
                    psuCode.add(uc.getPsucode());

                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, ucNames);

                bi.a107.setAdapter(adapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        bi.a107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a101.setText(null);
                bi.a113.setText(null);
                if (position == 0) return;

                MainApp.selectedUC = ucCodes.get(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        MainApp.selectedHHID = bi.a101.getText().toString();

        if (!hhExists()) {
            saveDraftForm();
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        } else if (MainApp.entryType != Integer.parseInt(MainApp.form.getEntryType())) {
            Toast.makeText(this, String.format("This form has been entered as %s", MainApp.form.getEntryType().equals("1") ? "interview." : "data-entry"), Toast.LENGTH_SHORT).show();

        } else if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        }

    }*/


/*    private void saveDraftForm() {
        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.form.setA104(String.valueOf(MainApp.selectedCountry));
        MainApp.form.setA105(MainApp.selectedProvince);
        MainApp.form.setA106(MainApp.selectedDistrict);
        MainApp.form.setA107(MainApp.selectedPSU);
        MainApp.form.setA109(MainApp.selectedPSU);
        MainApp.form.setA101(MainApp.selectedHHID);
        MainApp.form.setpSno(MainApp.selectedHHID);

    }*/

   /* private void saveDraftAnthro() {
        MainApp.anthro = new Anthro();

        MainApp.anthro.setUserName(MainApp.user.getUserName());
        MainApp.anthro.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.anthro.setDeviceId(MainApp.deviceid);
        MainApp.anthro.setAppver(MainApp.versionName + "." + MainApp.versionCode);

    }

    private void saveDraftSamples() {

        MainApp.samples = new Samples();
        MainApp.samples.setUserName(MainApp.user.getUserName());
        MainApp.samples.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.samples.setDeviceId(MainApp.deviceid);
        MainApp.samples.setAppver(MainApp.versionName + "." + MainApp.versionCode);
    }*/


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkChild(View view) {
        if (!formValidation()) return;

        bi.childName.setText(null);
        bi.child.setVisibility(View.GONE);
        bi.hhhead.setText(null);
        bi.hhhead.setVisibility(View.GONE);

        ChildList childList = db.getChildBychildid(bi.a109.getText().toString(), bi.a105.getText().toString());

        if (!childList.getChild_id().equals("")) {

            bi.childName.setText(childList.getChild_name());
            bi.child.setVisibility(View.VISIBLE);
            bi.hhhead.setText(childList.getHh_head());
            bi.hhhead.setVisibility(View.VISIBLE);

            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);

            MainApp.currentHousehold = childList;

        } else {

            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
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
            MainApp.form = db.getFormByChildID(MainApp.currentHousehold.getChild_id(), MainApp.currentHousehold.getVillage_code());
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

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }
}
