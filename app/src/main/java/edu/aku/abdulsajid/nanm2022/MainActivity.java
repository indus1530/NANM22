package edu.aku.abdulsajid.nanm2022;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.sharedPref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.database.AndroidManager;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityMainBinding;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.ui.ChangePasswordActivity;
import edu.aku.abdulsajid.nanm2022.ui.IdentificationActivity;
import edu.aku.abdulsajid.nanm2022.ui.SyncActivity;
import edu.aku.abdulsajid.nanm2022.ui.TakePhoto;
import edu.aku.abdulsajid.nanm2022.ui.lists.FormsReportCluster;
import edu.aku.abdulsajid.nanm2022.ui.lists.FormsReportDate;
import edu.aku.abdulsajid.nanm2022.ui.lists.FormsReportPending;
import edu.aku.abdulsajid.nanm2022.ui.sections.ConsentActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA1Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA2Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA3AActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA3BActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA4AActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA4BActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA4CActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA5AActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionA5BActivity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionB1Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionB3Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC1Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC2Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC3Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC4Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC5Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC6Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionC7Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionD1Activity;
import edu.aku.abdulsajid.nanm2022.ui.sections.SectionD2Activity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bi.getRoot());

        // bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
//        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();


        try {
            String pwExpiry = String.valueOf(new JSONObject(MainApp.user.getPwdExpiry()).get("date")).substring(0, 10);
            //     Toast.makeText(this, pwExpiry, Toast.LENGTH_LONG).show();
            Log.d(TAG, "onCreate: pwExpiry: " + pwExpiry);

            Calendar cal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            cal.setTime(sdf.parse(pwExpiry));// all done

            int daysLeft = (int) MILLISECONDS.toDays(cal.getTimeInMillis() - System.currentTimeMillis());
            //  Toast.makeText(this, daysLeft+" Days left", Toast.LENGTH_LONG).show();
            if (daysLeft < 1) {
                Toast.makeText(this, "Your password has expired. Please contact your supervisor.", Toast.LENGTH_LONG).show();
                finish();
            }
            if (daysLeft < 10) {
                bi.newApp.setText("Your current password is expiring in " + daysLeft + " day(s) on " + pwExpiry + ". Please change your password to avoid account lockout. (Internet Required.)");
                // bi.message.setText("Your password will expire on " + pwExpiry + ". There are only " + daysLeft + " Days left.");
                bi.newApp.setVisibility(View.VISIBLE);
            } else {
                bi.newApp.setVisibility(View.GONE);
            }

        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }


        String latestVersionName = sharedPref.getString("versionName", "");
        int latestVersionCode = Integer.parseInt(sharedPref.getString("versionCode", "0"));

        if (MainApp.appInfo.getVersionCode() < latestVersionCode) {
            bi.newApp.setVisibility(View.VISIBLE);
            bi.newApp.setText("NOTICE: There is a newer version of this app available on server (" + latestVersionName + latestVersionCode + "). \nPlease download update the app now.");
        } else {
            bi.newApp.setVisibility(View.GONE);

        }
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
/*            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;*/
/*
            case R.id.updateBlood:
                MainApp.entryType = 3;
                break;

            case R.id.updateStool:
                MainApp.entryType = 4;
                break;*/
            default:
                MainApp.entryType = 0;

        }


        switch (view.getId()) {

            case R.id.startInterview:
                MainApp.form = new Forms();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
            case R.id.secCon:
                MainApp.form = new Forms();
                startActivity(new Intent(this, ConsentActivity.class));
                break;
            case R.id.secA1:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA1Activity.class));
                break;

            case R.id.secA2:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA2Activity.class));
                break;

            case R.id.secA3a:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA3AActivity.class));
                break;

            case R.id.secA3b:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA3BActivity.class));
                break;

            case R.id.secA4a:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA4AActivity.class));
                break;

            case R.id.secA4b:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA4BActivity.class));
                break;

            case R.id.seca4c:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA4CActivity.class));
                break;

            case R.id.seceA5a:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA5AActivity.class));
                break;

            case R.id.seceA5b:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionA5BActivity.class));
                break;

            case R.id.secB1:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionB1Activity.class));
                break;

            case R.id.secB3:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionB3Activity.class));
                break;

            case R.id.secC1:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC1Activity.class));
                break;

            case R.id.secC2:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC2Activity.class));
                break;

            case R.id.secC3:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC3Activity.class));
                break;

            case R.id.secC4:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC4Activity.class));
                break;

            case R.id.secC5:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC5Activity.class));
                break;

            case R.id.secC6:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC6Activity.class));
                break;

            case R.id.secC7:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionC7Activity.class));
                break;

            case R.id.secD1:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionD1Activity.class));
                break;

            case R.id.secD2:
                MainApp.adol = new Adolescent();
                startActivity(new Intent(this, SectionD2Activity.class));
                break;

            case R.id.dbManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidManager.class);
                startActivity(intent);
                break;

            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }

    public void takePhoto(View view) {

        Intent intent = new Intent(this, TakePhoto.class);

        intent.putExtra("picID", "000000" + "_" + "A-0000-000" + "_" + "01" + "_");
        intent.putExtra("childName", "Test ChilD");
/*
        intent.putExtra("picID", "901001" + "_" + "A-0001-001" + "_" + "1" + "_");
        intent.putExtra("childName", "Hassan");
*/
        if (view.getId() == R.id.frontPhoto) {
            intent.putExtra("picView", "front".toUpperCase());
            startActivityForResult(intent, 1); // Activity is started with requestCode 1 = Front
        } else {
            intent.putExtra("picView", "back".toUpperCase());
            startActivityForResult(intent, 2); // Activity is started with requestCode 2 = Back
        }
    }

    // Call Back method  to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_CANCELED) {
            Toast.makeText(this, requestCode + "_" + resultCode, Toast.LENGTH_SHORT).show();

            String fileName = data.getStringExtra("FileName");

            // Check if the requestCode 1 = Front : 2 = Back -- resultCode 1 = Success : 2 = Failure
            // Results received with requestCode 1 = Front

            if (requestCode == 1 && resultCode == RESULT_OK) {
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();

             /*   bi.frontFileName.setText(fileName);
                bi.frontPhoto.setEnabled(false);
*/

            } else if (requestCode == 1 && resultCode != RESULT_CANCELED) {
                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                //TODO: Implement functionality below when photo was not taken
                // ...
                //     bi.frontFileName.setText("Photo not taken.");

            }

            // Results received with requestCode 2 = Back
            if (requestCode == 2 && resultCode == RESULT_OK) {
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();
/*
                bi.backFileName.setText(fileName);
                bi.backPhoto.setEnabled(false);*/
            } else if (requestCode == 2 && resultCode != RESULT_CANCELED) {

                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                //TODO: Implement functionality below when photo was not taken
                // ...
                //      bi.backFileName.setText("Photo not taken.");

            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

}