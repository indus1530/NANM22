package edu.aku.abdulsajid.nanm2022.ui;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.form;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import net.sqlcipher.database.SQLiteException;

import org.json.JSONException;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityEndingBinding;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.models.EntryLog;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;


public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    int sectionMainCheck;
    private NANMRoomDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("End Review");
        db = MainApp.appInfo.dbHelper;
        boolean check = getIntent().getBooleanExtra("complete", false);


        bi.istatusa.setEnabled(check);
        bi.istatusb.setEnabled(!check);
        bi.istatusc.setEnabled(!check);
        bi.istatusd.setEnabled(!check);
        bi.istatuse.setEnabled(!check);
        bi.istatusf.setEnabled(!check);
        bi.istatusg.setEnabled(!check);


    }

    private void saveDraft() {
        form.setIStatus(bi.istatusa.isChecked() ? "1"
                : bi.istatusb.isChecked() ? "2"
                : bi.istatusc.isChecked() ? "3"
                : bi.istatusd.isChecked() ? "4"
                : bi.istatuse.isChecked() ? "5"
                : bi.istatusf.isChecked() ? "6"
                : bi.istatusg.isChecked() ? "7"
                : bi.istatus96.isChecked() ? "96"
                : "-1");
        form.setIStatus96x(bi.istatus96x.getText().toString());
        // form.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
    }


    public void btnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {

            recordEntry();
            finish();
            setResult(RESULT_OK);
           /* Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
           */
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
            Forms forms = form;
            forms.setSA1(form.sA1toString());
            updcount = db.formsDao().updateForm(forms);
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
