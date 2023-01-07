package edu.aku.abdulsajid.nanm2022.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.PROJECT_NAME;
import static edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedDistrict;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedTehsil;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedUC;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.WiscTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;


@Entity(tableName = WiscTable.TABLE_NAME)
public class WISC extends BaseObservable implements Observable {

    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private String TAG = "WISC";
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = WiscTable.COLUMN_ID)
    private long id = 0;

    @ColumnInfo(name = WiscTable.COLUMN_UID)
    private String uid = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_USERNAME)
    private String userName = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_SYSDATE)
    private String sysDate = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_VILLAGE_CODE)
    private String villageCode = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_CHILD_ID)
    private String childID = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_CHILD_SNO)
    private String childSno = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_DEVICEID)
    private String deviceId = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_DEVICETAGID)
    private String deviceTag = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_APPVERSION)
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_ISTATUS)
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_SYNCED)
    private String synced = _EMPTY_;
    @ColumnInfo(name = WiscTable.COLUMN_SYNC_DATE)
    private String syncDate = _EMPTY_;

    @ColumnInfo(name = WiscTable.COLUMN_AGE_MONTHS)
    private String ageInMonths;

    // FIELD VARIABLES
    //A
    @Ignore
    private String wisc01 = _EMPTY_;
    @Ignore
    private String wisc02 = _EMPTY_;
    @Ignore
    private String wisc03 = _EMPTY_;
    @Ignore
    private String wisc04 = _EMPTY_;
    @Ignore
    private String wisc05 = _EMPTY_;
    @Ignore
    private String wisc06 = _EMPTY_;
    @Ignore
    private String wisc07dd = _EMPTY_;
    @Ignore
    private String wisc07mm = _EMPTY_;
    @Ignore
    private String wisc07yy = _EMPTY_;
    @Ignore
    private String wisc08dd = _EMPTY_;
    @Ignore
    private String wisc08mm = _EMPTY_;
    @Ignore
    private String wisc08yy = _EMPTY_;
    @Ignore
    private String wisc0901 = _EMPTY_;
    @Ignore
    private String wisc0902 = _EMPTY_;
    @Ignore
    private String wisc0903 = _EMPTY_;
    @Ignore
    private String wisc0904 = _EMPTY_;
    @Ignore
    private String wisc0905 = _EMPTY_;
    @Ignore
    private String wisc0906 = _EMPTY_;
    @Ignore
    private String wisc0907 = _EMPTY_;
    @Ignore
    private String wisc0908 = _EMPTY_;
    @Ignore
    private String wisc0909 = _EMPTY_;
    @Ignore
    private String wisc0910 = _EMPTY_;

    private String district = _EMPTY_;
    private String tehsil = _EMPTY_;
    private String uc = _EMPTY_;


    // Section Variables
    @ColumnInfo(name = WiscTable.COLUMN_SA1)
    private String sA1 = _EMPTY_;


    public WISC() {
    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setVillageCode(MainApp.currentADOL.getVillage_code());
        setChildID(MainApp.currentADOL.getChild_id());
        setChildSno(MainApp.currentADOL.getSrno());

        //SECTION VARIABLES
        setDistrict(selectedDistrict);
        setTehsil(selectedTehsil);
        setUc(selectedUC);

    }

    @Bindable
    public String getTAG() {
        return TAG;
    }

    public void setTAG(String tag) {
        this.TAG = tag;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Bindable
    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
        notifyPropertyChanged(BR.villageCode);
    }

    @Bindable
    public String getChildID() {
        return childID;
    }

    public void setChildID(String childID) {
        this.childID = childID;
        notifyPropertyChanged(BR.childID);
    }

    @Bindable
    public String getChildSno() {
        return childSno;
    }

    public void setChildSno(String childSno) {
        this.childSno = childSno;
        notifyPropertyChanged(BR.childSno);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }


    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        this.iStatus = iStatus;
        // this.o108 = iStatus;
    }

    public String getIStatus96x() {
        return iStatus96x;
    }

    public void setIStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }


    public String getSA1() {
        return sA1;
    }

    public void setSA1(String sA1) {
        this.sA1 = sA1;
    }


    @Bindable
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
        notifyPropertyChanged(BR.district);
    }

    @Bindable
    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
        notifyPropertyChanged(BR.tehsil);
    }

    @Bindable
    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
        notifyPropertyChanged(BR.uc);
    }

    @Bindable
    public String getWisc01() {
        return wisc01;
    }

    public void setWisc01(String wisc01) {
        this.wisc01 = wisc01;
        notifyPropertyChanged(BR.wisc01);
    }

    @Bindable
    public String getWisc02() {
        return wisc02;
    }

    public void setWisc02(String wisc02) {
        this.wisc02 = wisc02;
        notifyPropertyChanged(BR.wisc02);
    }

    @Bindable
    public String getWisc03() {
        return wisc03;
    }

    public void setWisc03(String wisc03) {
        this.wisc03 = wisc03;
        notifyPropertyChanged(BR.wisc03);
    }

    @Bindable
    public String getWisc04() {
        return wisc04;
    }

    public void setWisc04(String wisc04) {
        this.wisc04 = wisc04;
        notifyPropertyChanged(BR.wisc04);
    }

    @Bindable
    public String getWisc05() {
        return wisc05;
    }

    public void setWisc05(String wisc05) {
        this.wisc05 = wisc05;
        notifyPropertyChanged(BR.wisc05);
    }

    @Bindable
    public String getWisc06() {
        return wisc06;
    }

    public void setWisc06(String wisc06) {
        this.wisc06 = wisc06;
        notifyPropertyChanged(BR.wisc06);
    }

    @Bindable
    public String getWisc07dd() {
        return wisc07dd;
    }

    public void setWisc07dd(String wisc07dd) {
        this.wisc07dd = wisc07dd;
        CaluculateAge();
        notifyPropertyChanged(BR.wisc07dd);
    }

    @Bindable
    public String getWisc07mm() {
        return wisc07mm;
    }

    public void setWisc07mm(String wisc07mm) {
        this.wisc07mm = wisc07mm;
        if (wisc07mm.equals("98")) {
            setWisc07dd("98");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.wisc07mm);
    }

    @Bindable
    public String getWisc07yy() {
        return wisc07yy;
    }

    public void setWisc07yy(String wisc07yy) {
        this.wisc07yy = wisc07yy;
        if (wisc07yy.equals("9998")) {
            setWisc07mm("98");
            setWisc08dd("");
            setWisc08mm("");
            setWisc08yy("");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.wisc07yy);
    }

    @Bindable
    public String getWisc08dd() {
        return wisc08dd;
    }

    public void setWisc08dd(String wisc08dd) {
        this.wisc08dd = wisc08dd;
        notifyPropertyChanged(BR.wisc08dd);
    }

    @Bindable
    public String getWisc08mm() {
        return wisc08mm;
    }

    public void setWisc08mm(String wisc08mm) {
        this.wisc08mm = wisc08mm;
        notifyPropertyChanged(BR.wisc08mm);
    }

    @Bindable
    public String getWisc08yy() {
        return wisc08yy;
    }

    public void setWisc08yy(String wisc08yy) {
        this.wisc08yy = wisc08yy;
        notifyPropertyChanged(BR.wisc08yy);
    }

    @Bindable
    public String getWisc0901() {
        return wisc0901;
    }

    public void setWisc0901(String wisc0901) {
        this.wisc0901 = wisc0901;
        notifyPropertyChanged(BR.wisc0901);
    }

    @Bindable
    public String getWisc0902() {
        return wisc0902;
    }

    public void setWisc0902(String wisc0902) {
        this.wisc0902 = wisc0902;
        notifyPropertyChanged(BR.wisc0902);
    }

    @Bindable
    public String getWisc0903() {
        return wisc0903;
    }

    public void setWisc0903(String wisc0903) {
        this.wisc0903 = wisc0903;
        notifyPropertyChanged(BR.wisc0903);
    }

    @Bindable
    public String getWisc0904() {
        return wisc0904;
    }

    public void setWisc0904(String wisc0904) {
        this.wisc0904 = wisc0904;
        notifyPropertyChanged(BR.wisc0904);
    }

    @Bindable
    public String getWisc0905() {
        return wisc0905;
    }

    public void setWisc0905(String wisc0905) {
        this.wisc0905 = wisc0905;
        notifyPropertyChanged(BR.wisc0905);
    }

    @Bindable
    public String getWisc0906() {
        return wisc0906;
    }

    public void setWisc0906(String wisc0906) {
        this.wisc0906 = wisc0906;
        notifyPropertyChanged(BR.wisc0906);
    }

    @Bindable
    public String getWisc0907() {
        return wisc0907;
    }

    public void setWisc0907(String wisc0907) {
        this.wisc0907 = wisc0907;
        notifyPropertyChanged(BR.wisc0907);
    }

    @Bindable
    public String getWisc0908() {
        return wisc0908;
    }

    public void setWisc0908(String wisc0908) {
        this.wisc0908 = wisc0908;
        notifyPropertyChanged(BR.wisc0908);
    }

    @Bindable
    public String getWisc0909() {
        return wisc0909;
    }

    public void setWisc0909(String wisc0909) {
        this.wisc0909 = wisc0909;
        notifyPropertyChanged(BR.wisc0909);
    }

    @Bindable
    public String getWisc0910() {
        return wisc0910;
    }

    public void setWisc0910(String wisc0910) {
        this.wisc0910 = wisc0910;
        notifyPropertyChanged(BR.wisc0910);
    }

    public String getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(String ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public WISC Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_PROJECT_NAME));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_VILLAGE_CODE));
        this.childID = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_CHILD_ID));
        this.childSno = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_CHILD_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_ISTATUS_96X));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_SYNC_DATE));

        sA1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(WiscTable.COLUMN_SA1)));
        return this;
    }

    public WISC Hydrate(WISC forms) throws JSONException {
        this.id = forms.id;
        this.uid = forms.uid;
        this.projectName = forms.projectName;
        this.villageCode = forms.villageCode;
        this.childID = forms.childID;
        this.childSno = forms.childSno;
        this.userName = forms.userName;
        this.sysDate = forms.sysDate;
        this.deviceTag = forms.deviceTag;
        this.appver = forms.appver;
        this.iStatus = forms.iStatus;
        this.iStatus96x = forms.iStatus96x;
        this.synced = forms.synced;
        this.syncDate = forms.syncDate;

        sA1Hydrate(forms.sA1);
        return this;
    }

    public void sA1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
        if (string != null && !string.equals("")) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.wisc01 = json.getString("wisc01");
            this.wisc02 = json.getString("wisc02");
            this.wisc03 = json.getString("wisc03");
            this.wisc04 = json.getString("wisc04");
            this.wisc05 = json.getString("wisc05");
            this.wisc06 = json.getString("wisc06");
            this.wisc07dd = json.getString("wisc07dd");
            this.wisc07mm = json.getString("wisc07mm");
            this.wisc07yy = json.getString("wisc07yy");
            this.wisc08dd = json.getString("wisc08dd");
            this.wisc08mm = json.getString("wisc08mm");
            this.wisc08yy = json.getString("wisc08yy");
            this.wisc0901 = json.getString("wisc0901");
            this.wisc0902 = json.getString("wisc0902");
            this.wisc0903 = json.getString("wisc0903");
            this.wisc0904 = json.getString("wisc0904");
            this.wisc0905 = json.getString("wisc0905");
            this.wisc0906 = json.getString("wisc0906");
            this.wisc0907 = json.getString("wisc0907");
            this.wisc0908 = json.getString("wisc0908");
            this.wisc0909 = json.getString("wisc0909");
            this.wisc0910 = json.getString("wisc0910");

        }
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(WiscTable.COLUMN_ID, this.id);
        json.put(WiscTable.COLUMN_UID, this.uid);
        json.put(WiscTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(WiscTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(WiscTable.COLUMN_CHILD_ID, this.childID);
        json.put(WiscTable.COLUMN_CHILD_SNO, this.childSno);
        json.put(WiscTable.COLUMN_USERNAME, this.userName);
        json.put(WiscTable.COLUMN_SYSDATE, this.sysDate);
        json.put(WiscTable.COLUMN_DEVICEID, this.deviceId);
        json.put(WiscTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(WiscTable.COLUMN_ISTATUS, this.iStatus);
        json.put(WiscTable.COLUMN_ISTATUS_96X, this.iStatus96x);
        json.put(WiscTable.COLUMN_SYNCED, this.synced);
        json.put(WiscTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(WiscTable.COLUMN_APPVERSION, this.appver);
        json.put(WiscTable.COLUMN_SA1, new JSONObject(sA1toString()));
        return json;
    }

    public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();
        json.put("wisc01", wisc01)
                .put("wisc02", wisc02)
                .put("wisc03", wisc03)
                .put("wisc04", wisc04)
                .put("wisc05", wisc05)
                .put("wisc06", wisc06)
                .put("wisc07dd", wisc07dd)
                .put("wisc07mm", wisc07mm)
                .put("wisc07yy", wisc07yy)
                .put("wisc08dd", wisc08dd)
                .put("wisc08mm", wisc08mm)
                .put("wisc08yy", wisc08yy)
                .put("wisc0901", wisc0901)
                .put("wisc0902", wisc0902)
                .put("wisc0903", wisc0903)
                .put("wisc0904", wisc0904)
                .put("wisc0905", wisc0905)
                .put("wisc0906", wisc0906)
                .put("wisc0907", wisc0907)
                .put("wisc0908", wisc0908)
                .put("wisc0909", wisc0909)
                .put("wisc0910", wisc0910);
        return json.toString();
    }

    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.wisc07yy + "-" + this.wisc07mm + "-" + this.wisc07dd);

        if (!this.wisc07yy.equals("") && !this.wisc07yy.equals("9998") && !this.wisc07mm.equals("") && !this.wisc07dd.equals("")) {

            if ((Integer.parseInt(this.wisc07mm) > 12 && !this.wisc07mm.equals("98")) || (Integer.parseInt(this.wisc07dd) > 31 && !this.wisc07dd.equals("98")) || Integer.parseInt(this.wisc07yy) < 1920) {
                setWisc08yy("");
                setWisc08mm("");
                this.ageInMonths = "0";
                return;
            }

            Calendar cur = Calendar.getInstance();


            // set Date of birth
            int day = !this.wisc07dd.equals("98") ? Integer.parseInt(this.wisc07dd) : 15;
            int month = !this.wisc07mm.equals("98") ? Integer.parseInt(this.wisc07mm) : 6;
            int year = Integer.parseInt(this.wisc07yy);
            Calendar cal = Calendar.getInstance();

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);


            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

                long inDays = MILLISECONDS.toDays(millis);
                long tYear = (long) (inDays / 365.2425);
                long tMonth = (long) ((inDays - (tYear * 365.2425)) / 30.43);
                long tDay = (long) (inDays - ((tYear * 365.2425) + (tMonth * 30.43)));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);

                setWisc08yy(String.valueOf(tYear));
                setWisc08mm(String.valueOf(tMonth));
                setWisc08dd(String.valueOf(tDay));
                setAgeInMonths(String.valueOf((int) inDays));
                if (tYear < 0)
                    setWisc08yy("");
                //setAge(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                Log.d(TAG, "CaluculateAge: " + e.getMessage());
                e.printStackTrace();

            }
        } else {
            if (!this.wisc08yy.equals("") && !this.wisc08mm.equals("") && !this.wisc08dd.equals("")) {
                int yearToDays = 0;
                int monthsToDays = 0;
                int inDays = 0;


                if (Integer.parseInt(this.wisc08yy) < 98 && Integer.parseInt(this.wisc08yy) > 0)
                    yearToDays = (int) (Integer.parseInt(this.wisc08yy) * 365.2425);

                if (Integer.parseInt(this.wisc08mm) < 12 && Integer.parseInt(this.wisc08mm) > 0)
                    monthsToDays = (int) (Integer.parseInt(this.wisc08mm) * 30.43);
                if (Integer.parseInt(this.wisc08dd) < 30)
                    inDays = Integer.parseInt(this.wisc08dd);

                setAgeInMonths(String.valueOf(inDays + monthsToDays + yearToDays));

            }
        }
    }

}