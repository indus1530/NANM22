package edu.aku.abdulsajid.nanm2022.core;

import static edu.aku.abdulsajid.nanm2022.database.DatabaseHelper.DATABASE_NAME;
import static edu.aku.abdulsajid.nanm2022.database.DatabaseHelper.DATABASE_PASSWORD;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;

import com.facebook.flipper.android.AndroidFlipperClient;
import com.facebook.flipper.android.utils.FlipperUtils;
import com.facebook.flipper.core.FlipperClient;
import com.facebook.flipper.plugins.databases.DatabasesFlipperPlugin;
import com.facebook.flipper.plugins.inspector.DescriptorMapping;
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin;
import com.facebook.soloader.SoLoader;
import com.scottyab.rootbeer.RootBeer;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.aku.abdulsajid.nanm2022.BuildConfig;
import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.models.AdolList;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.models.Users;
import edu.aku.abdulsajid.nanm2022.models.Villages;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;
import edu.aku.abdulsajid.nanm2022.ui.LockActivity;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "matiari_cohort_2022";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    // public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    // public static final String _IP = "http://f49461:8080/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/matiari_cohort/api/";// .TEST server;
    public static final String _SERVER_URL = "syncgcm.php";
    public static final String _USER_URL = "resetpassword.php";
    public static final String _SERVER_GET_URL = "getDatagcm.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/matiari_cohort/app/survey";
    public static final String _APP_FOLDER = "../app/";
    public static final String _EMPTY_ = "";
    private static final String TAG = "MainApp";
    private static final long MINIMUM_DISTANCE_CHANGE_FOR_UPDATES = 1; // in Meters
    private static final long MINIMUM_TIME_BETWEEN_UPDATES = 1000; // in Milliseconds
    public static int TRATS = 8;
    public static String IBAHC = "";
    //COUNTRIES
    public static int URDU = 1;
    public static File sdDir;
    public static String[] downloadData;


    //public static Samples samples;
    public static Forms form;
    public static Adolescent adol;
    public static FamilyMembers familyMember;
    public static AdolList currentADOL;
    public static int memberCount = 0;
    public static List<FamilyMembers> familyList;
    public static List<Integer> mwraList;
    public static List<Integer> childOfSelectedMWRAList;
    public static List<FamilyMembers> allChildrenList;
    public static List<FamilyMembers> allAdolList;
    public static List<FamilyMembers> fatherList;
    public static List<FamilyMembers> motherList;
    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String deviceid;
    public static int versionCode = edu.aku.abdulsajid.nanm2022.BuildConfig.VERSION_CODE;
    public static String versionName = edu.aku.abdulsajid.nanm2022.BuildConfig.VERSION_NAME;
    public static boolean permissionCheck = false;
    public static int entryType = 0;
    public static int childCount = 0;
    public static String selectedMWRA;
    public static String selectedChild;
    public static String selectedAdol;
    public static String selectedChildName = _EMPTY_;
    public static int memberCountComplete;
    public static boolean memberComplete;
    public static boolean hhheadSelected = false;
    public static boolean superuser;
    public static String selectedDistrict = "";
    public static String selectedTehsil = "";
    public static String selectedUC = "";
    public static int selectedLanguage = 0;
    public static boolean langRTL = false;
    public static int ageOfIndexAdol;
    public static List<FamilyMembers> allMWRAList = new ArrayList<>();
    public static Villages selectedVillages;
    public static CountDownTimer timer;
    protected static LocationManager locationManager;
    static ToneGenerator toneGen1;

    // FOOD AND INGREDIENTS CHANGES
    public static int STANDARD_ADD = 1;
    public static int STANDARD_DELETE = -1;
    public static int NEW_ADD = 2;
    public static int NOT_REPORTED = 9999;

    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static String getDeviceId(Context context) {
        String deviceId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            deviceId = Settings.Secure.getString(
                    context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } else {
           /* final TelephonyManager mTelephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (mTelephony.getDeviceId() != null) {
                deviceId = mTelephony.getDeviceId();
            } else {
                deviceId = Settings.Secure.getString(
                        context.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
            }*/
        }
        return "deviceId";
    }

    public static String kishGrid(int Hh_Sno, int totalMwra) {

        // GENERATE RANDOM
        // int household  = 1 + (int)(Math.random() * ((10 - 1) + 1));
        // int eligibles = 1 + (int)(Math.random() * ((8 - 1) + 1));

        int household = Math.min(Hh_Sno, 9);
        int eligibles = Math.min(totalMwra, 8);

        int[][] grid = {
                // Eligible People ===>>
                //1- 2- 3- 4- 5- 6- 7- 8
                {1, 2, 1, 2, 5, 4, 3, 2},  // 0 - Household (10th)
                {1, 1, 1, 1, 1, 1, 1, 1},  // 1 - Household (1st)
                {1, 2, 2, 2, 2, 2, 2, 2},  //         ||
                {1, 1, 3, 3, 3, 3, 3, 3},  //         ||
                {1, 2, 1, 4, 4, 4, 4, 4},  //         ||
                {1, 1, 2, 1, 5, 5, 5, 5},  //        \\//
                {1, 2, 3, 2, 1, 6, 6, 6},  //         \/
                {1, 1, 1, 3, 2, 1, 7, 7},  //
                {1, 2, 2, 4, 3, 2, 1, 8},  // 8 - Household (8th)
                {1, 1, 3, 1, 4, 3, 2, 1},  // 9 - Household (9th)
        };


        // System.out.println(household+"-"+eligibles);
        // System.out.println(grid[household-1][eligibles-1]);

        /**
         *  0 household mean 0 index
         *  1 eligibles means eligibles-1 index
         *
         *  return Index of MWRAList (SNO-1)
         */
        return String.valueOf((grid[household][eligibles - 1]) - 1);
    }

    public static Boolean isNetworkAvailable(Context c) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }

    public static void lockScreen(Context c) {

        if (timer != null) {
            timer.cancel();
        }

        //   Context mContext = c;
        Activity activity = (Activity) c;


        timer = new CountDownTimer(15 * 60 * 1000, 1000) {
            //timer = new CountDownTimer(30 * 1000, 1000) {

            public void onTick(long millisUntilFinished) {
                //Some code
                //bi.timeLeft.setText((millisUntilFinished / 1000) + " secs left");
                if ((millisUntilFinished / 1000) < 14) {
                    toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150);
                }

            }

            public void onFinish() {
                //Logout
                //
                //   finish();
                // lockScreen();
                Intent intent = new Intent();
                intent.setClass(c, LockActivity.class);
                c.startActivity(intent);
                timer.cancel();
                //  startActivity(new Intent(((Activity) c).getLocalClassName(), LockActivity.class));
            }
        };
        timer.start();

    }

    @Override
    public void onCreate() {
        super.onCreate();

        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            throw new RuntimeException("This is a crash");

            //System.exit(1);
        }
        //Initiate DateTime

        sharedPref = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                MINIMUM_TIME_BETWEEN_UPDATES,
                MINIMUM_DISTANCE_CHANGE_FOR_UPDATES,
                new GPSLocationListener(this) // Implement this class from code

        );

        initSecure();
        //Initializ App info
        appInfo = new AppInfo(this);

        toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);

        SoLoader.init(this, false);

        if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
            final FlipperClient client = AndroidFlipperClient.getInstance(this);
            client.addPlugin(new InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()));
            client.addPlugin(new DatabasesFlipperPlugin(this));

            client.start();
        }

    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);
        File databaseFile = getDatabasePath(DATABASE_NAME);
       /* databaseFile.mkdirs();
        databaseFile.delete();*/
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, DATABASE_PASSWORD, null);
        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            TRATS = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            IBAHC = bundle.getString("YEK_REVRES");
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);

            // Room DB
            NANMRoomDatabase.init(this, IBAHC);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * DIETARY FOLLOWUP
     */

    // Check Edittext, TextView and String is not empty
    public static boolean isNotEmpty(Object object) {
        if (object instanceof EditText) {
            return !((EditText) object).getText().toString().trim().equals("");
        } else if (object instanceof TextView) {
            return !((TextView) object).getText().toString().equals("");
        } else if (object instanceof String) {
            return !object.equals("");
        }
        return false;
    }

    // Simple Alert Dialog with Multiple Choice
    public static void alert(int popupId, Activity activity, String title, String message,
                             Object passObj, IAlertCallback iAlertCallback) {

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setMessage(message);

        AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        builder.setPositiveButton(activity.getString(R.string.yes), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.cancel();
                iAlertCallback.onClick(popupId, true, passObj);
            }
        });

        builder.setNegativeButton(activity.getString(R.string.no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.cancel();
                iAlertCallback.onClick(popupId, false, passObj);
            }
        });

        dialog.show();
    }

    // Alert dialog button click callback
    public interface IAlertCallback {
        void onClick(int popupId, boolean isPositiveClick, Object obj);
    }

}
