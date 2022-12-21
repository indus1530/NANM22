package edu.aku.abdulsajid.nanm2022.ui;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.adol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import net.sqlcipher.database.SQLiteException;

import org.json.JSONException;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityChildEndingBinding;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.models.EntryLog;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;


public class ChildEndingActivity extends AppCompatActivity {

    ActivityChildEndingBinding bi;
    int sectionMainCheck;
    private NANMRoomDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeEnglish1 : sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeUrdu : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_child_ending);
        bi.setForm(adol);
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("End Review");
        db = MainApp.appInfo.dbHelper;
        boolean check = getIntent().getBooleanExtra("complete", false);


        bi.istatusa.setEnabled(check);
        bi.istatusb.setEnabled(!check);
        bi.istatusc.setEnabled(!check);


    }

    private void saveDraft() {
        adol.setIStatus(bi.istatusa.isChecked() ? "1"
                : bi.istatusb.isChecked() ? "2"
                : bi.istatusc.isChecked() ? "3"
                : "-1");
        // form.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
    }


    public void btnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {

            recordEntry();
            finish();
            setResult(RESULT_OK);
            Intent i = new Intent(this, EndingActivity.class).putExtra("complete", true);
            startActivity(i);
            Toast.makeText(this, "Data has been updated.", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Error in updating Database.", Toast.LENGTH_SHORT).show();
        }
    }


    private void recordEntry() {

        EntryLog entryLog = new EntryLog();
        entryLog.populateMeta();
        Long rowId = null;
        try {
            //rowId = db.addEntryLog(entryLog);
            rowId = db.entryLogDao().addEntryLog(entryLog);
        } catch (SQLiteException | JSONException e) {
            Toast.makeText(this, "SQLiteException(EntryLog)" + entryLog, Toast.LENGTH_SHORT).show();
        }
        if (rowId != -1) {
            entryLog.setId(rowId);
            entryLog.setUid(entryLog.getDeviceId() + entryLog.getId());
            //db.updatesEntryLogColumn(TableContracts.EntryLogTable.COLUMN_UID, entryLog.getUid(), entryLog.getId());
            db.entryLogDao().updateEntryLog(entryLog);
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();

        }

    }


    private boolean UpdateDB() {
        if (MainApp.superuser) return true;
        int updcount = 0;
        try {
            Adolescent adolescent = adol;
            adolescent.setSD2(adol.sD2toString());
            updcount = db.adolescentDao().updateAdolescent(adolescent);
            //updcount = db.updatesAdolColumn(TableContracts.AdolescentTable.COLUMN_SC1, MainApp.adol.sC1toString());
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


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}
