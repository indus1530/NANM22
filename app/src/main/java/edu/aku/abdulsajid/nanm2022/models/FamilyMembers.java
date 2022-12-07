package edu.aku.abdulsajid.nanm2022.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_;

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
import java.util.Locale;

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.FamilyMembersTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;

@Entity(tableName = FamilyMembersTable.TABLE_NAME)
public class FamilyMembers extends BaseObservable implements Observable {

    @Ignore
    private final String TAG = "FamilyMembers";
    @Ignore
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    // APP VARIABLES
    @ColumnInfo(name = FamilyMembersTable.COLUMN_PROJECT_NAME)
    private String projectName = MainApp.PROJECT_NAME;

    // APP VARIABLES
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = FamilyMembersTable.COLUMN_ID)
    private long id = 0;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_UID)
    private String uid = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_UUID)
    private String uuid = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_USERNAME)
    private String userName = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_SYSDATE)
    private String sysDate = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_CLUSTER_CODE)
    private String clusterCode = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_HHID)
    private String hhid = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_SNO)
    private String sno = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_DEVICEID)
    private String deviceId = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_DEVICETAGID)
    private String deviceTag = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_APPVERSION)
    private String appver = _EMPTY_;
    @Ignore
    private String endTime = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_ISTATUS)
    private String iStatus = _EMPTY_;
    @Ignore
    private String iStatus96x = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_SYNCED)
    private String synced = _EMPTY_;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_SYNC_DATE)
    private String syncDate = _EMPTY_;


    // SECTION VARIABLES
    @ColumnInfo(name = FamilyMembersTable.COLUMN_SD)
    private String sD = _EMPTY_;

    // FIELD VARIABLES
    @Ignore
    private String a201 = _EMPTY_;
    @Ignore
    private String a202 = _EMPTY_;
    @Ignore
    private String a204 = _EMPTY_;
    @Ignore
    private String a203 = _EMPTY_;
    @Ignore
    private String a20396x = _EMPTY_;
    @Ignore
    private String a205dd = _EMPTY_;
    @Ignore
    private String a205mm = _EMPTY_;
    @Ignore
    private String a205yy = _EMPTY_;
    @Ignore
    private String a206yy = _EMPTY_;
    @Ignore
    private String a206mm = _EMPTY_;
    @Ignore
    private String a206dd = _EMPTY_;
    @Ignore
    private String a212 = _EMPTY_;
    @Ignore
    private String a213 = _EMPTY_;
    @Ignore
    private String a207 = _EMPTY_;
    @Ignore
    private String a208 = _EMPTY_;
    @Ignore
    private String a209 = _EMPTY_;
    @Ignore
    private String a210 = _EMPTY_;
    @Ignore
    private String a211 = _EMPTY_;

    @Ignore
    private boolean mwra;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_AGE_MONTHS)
    private String ageInMonths;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_MUID)
    private String muid;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_MOTHER_PRESENT)
    private String motherPresent;
    @ColumnInfo(name = FamilyMembersTable.COLUMN_INDEXED)
    private String indexed = _EMPTY_;
    @Ignore
    private String memCate = _EMPTY_;

    public FamilyMembers() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        setAppver(MainApp.form.getAppver());
        setClusterCode(MainApp.form.getVillageCode());
        setHhid(MainApp.form.getChildID());
        setSno(getA201());
        CaluculateAge();

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


    public String getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(String ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getMotherPresent() {
        return motherPresent;
    }

    public void setMotherPresent(String motherPresent) {
        this.motherPresent = motherPresent;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String clusterCode) {
        this.clusterCode = clusterCode;
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
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


    public String getSD() {
        return sD;
    }

    public void setSD(String sD) {
        this.sD = sD;
    }


    @Bindable
    public String getA201() {
        return a201;
    }

    public void setA201(String a201) {
        this.a201 = a201;
        notifyPropertyChanged(BR.a201);
    }

    @Bindable
    public String getA202() {
        return a202;
    }

    public void setA202(String a202) {
        this.a202 = a202;
        notifyPropertyChanged(BR.a202);
    }

    @Bindable
    public String getA204() {
        return a204;
    }

    public void setA204(String a204) {
        this.a204 = a204;
        setA210("");
        notifyPropertyChanged(BR.a204);
    }

    @Bindable
    public String getA203() {
        return a203;
    }

    public void setA203(String a203) {
        this.a203 = a203;
        setA20396x(a203.equals("96") ? this.a20396x : "");
        notifyPropertyChanged(BR.a203);
    }

    @Bindable
    public String getA20396x() {
        return a20396x;
    }

    public void setA20396x(String a20396x) {
        this.a20396x = a20396x;
        notifyPropertyChanged(BR.a20396x);
    }

    @Bindable
    public String getA205dd() {
        return a205dd;
    }

    public void setA205dd(String a205dd) {
        this.a205dd = a205dd;
        CaluculateAge();
        notifyPropertyChanged(BR.a205dd);
    }

    @Bindable
    public String getA205mm() {
        return a205mm;
    }

    public void setA205mm(String a205mm) {
        this.a205mm = a205mm;
        if (a205mm.equals("98")) {
            setA205dd("98");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.a205mm);
    }

    @Bindable
    public String getA205yy() {
        return a205yy;
    }

    public void setA205yy(String a205yy) {
        this.a205yy = a205yy;
        if (a205yy.equals("9998")) {
            setA205mm("98");
            setA206dd("");
            setA206mm("");
            setA206yy("");
        }
        // Calculate age
        CaluculateAge();
        notifyPropertyChanged(BR.a205yy);
    }

    @Bindable
    public String getA206yy() {
        return a206yy;
    }

    public void setA206yy(String a206yy) {
        this.a206yy = a206yy;
        notifyPropertyChanged(BR.a206yy);
    }

    @Bindable
    public String getA206mm() {
        return a206mm;
    }

    public void setA206mm(String a206mm) {
        this.a206mm = a206mm;
        notifyPropertyChanged(BR.a206mm);
    }

    @Bindable
    public String getA206dd() {
        return a206dd;
    }

    public void setA206dd(String a206dd) {
        this.a206dd = a206dd;
        notifyPropertyChanged(BR.a206dd);
    }

    @Bindable
    public String getA212() {
        return a212;
    }

    public void setA212(String a212) {
        this.a212 = a212;
        notifyPropertyChanged(BR.a212);
    }

    @Bindable
    public String getA213() {
        return a213;
    }

    public void setA213(String a213) {
        this.a213 = a213;
        notifyPropertyChanged(BR.a213);
    }

    @Bindable
    public String getA207() {
        return a207;
    }

    public void setA207(String a207) {
        this.a207 = a207;
        notifyPropertyChanged(BR.a207);
    }

    @Bindable
    public String getA208() {
        return a208;
    }

    public void setA208(String a208) {
        this.a208 = a208;
        notifyPropertyChanged(BR.a208);
    }

    @Bindable
    public String getA209() {
        return a209;
    }

    public void setA209(String a209) {
        this.a209 = a209;
        notifyPropertyChanged(BR.a209);
    }

    @Bindable
    public String getA210() {
        return a210;
    }

    public void setA210(String a210) {
        this.a210 = a210;
        notifyPropertyChanged(BR.a210);
    }

    @Bindable
    public String getA211() {
        return a211;
    }

    public void setA211(String a211) {
        this.a211 = a211;
        notifyPropertyChanged(BR.a211);
    }


    @Bindable
    public boolean isMwra() {
        return mwra;
    }

    public void setMwra(boolean mwra) {
        this.mwra = mwra;

        notifyPropertyChanged(BR.mwra);
    }

    public String getMemCate() {
        return memCate;
    }

    public void setMemCate(String memCate) {
        this.memCate = memCate;
        // notifyPropertyChanged(BR.memCate);
    }

    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }


    public FamilyMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PROJECT_NAME));
        this.clusterCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_CLUSTER_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SNO));
        this.ageInMonths = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_AGE_MONTHS));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_MUID));
        this.motherPresent = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_MOTHER_PRESENT));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_INDEXED));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNC_DATE));

        sDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SD)));
        updateMemCategory();

        return this;
    }

    public void sDHydrate(String string) throws JSONException {
        Log.d(TAG, "sDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a201 = json.getString("a201");
            this.a202 = json.getString("a202");
            this.a204 = json.getString("a204");
            this.a203 = json.getString("a203");
            this.a20396x = json.getString("a20396x");
            this.a205dd = json.getString("a205dd");
            this.a205mm = json.getString("a205mm");
            this.a205yy = json.getString("a205yy");
            this.a206yy = json.getString("a206yy");
            this.a206mm = json.getString("a206mm");
            this.a206dd = json.getString("a206dd");
            this.a212 = json.getString("a212");
            this.a213 = json.getString("a213");
            this.a207 = json.getString("a207");
            this.a208 = json.getString("a208");
            this.a209 = json.getString("a209");
            this.a210 = json.getString("a210");
            this.a211 = json.getString("a211");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FamilyMembersTable.COLUMN_ID, this.id);
        json.put(FamilyMembersTable.COLUMN_UID, this.uid);
        json.put(FamilyMembersTable.COLUMN_UUID, this.uuid);
        json.put(FamilyMembersTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FamilyMembersTable.COLUMN_CLUSTER_CODE, this.clusterCode);
        json.put(FamilyMembersTable.COLUMN_HHID, this.hhid);
        json.put(FamilyMembersTable.COLUMN_INDEXED, this.indexed);
        json.put(FamilyMembersTable.COLUMN_SNO, this.sno);
        json.put(FamilyMembersTable.COLUMN_AGE_MONTHS, this.ageInMonths);
        json.put(FamilyMembersTable.COLUMN_MUID, this.muid);
        json.put(FamilyMembersTable.COLUMN_MOTHER_PRESENT, this.motherPresent);
        json.put(FamilyMembersTable.COLUMN_USERNAME, this.userName);
        json.put(FamilyMembersTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FamilyMembersTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FamilyMembersTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FamilyMembersTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FamilyMembersTable.COLUMN_SYNCED, this.synced);
        json.put(FamilyMembersTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(FamilyMembersTable.COLUMN_APPVERSION, this.appver);

        json.put(FamilyMembersTable.COLUMN_SD, new JSONObject(sDtoString()));
        return json;
    }

    public String sDtoString() throws JSONException {
        Log.d(TAG, "sDtoString: ");
        JSONObject json = new JSONObject();
        json.put("a201", a201)
                .put("a202", a202)
                .put("a204", a204)
                .put("a203", a203)
                .put("a20396x", a20396x)
                .put("a205dd", a205dd)
                .put("a205mm", a205mm)
                .put("a205yy", a205yy)
                .put("a206yy", a206yy)
                .put("a206mm", a206mm)
                .put("a206dd", a206dd)
                .put("a212", a212)
                .put("a213", a213)
                .put("a207", a207)
                .put("a208", a208)
                .put("a209", a209)
                .put("a210", a210)
                .put("a211", a211);
        return json.toString();
    }

    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.a205yy + "-" + this.a205mm + "-" + this.a205dd);

        if (!this.a205yy.equals("") && !this.a205yy.equals("9998") && !this.a205mm.equals("") && !this.a205dd.equals("")) {

            if ((Integer.parseInt(this.a205mm) > 12 && !this.a205mm.equals("98")) || (Integer.parseInt(this.a205dd) > 31 && !this.a205dd.equals("98")) || Integer.parseInt(this.a205yy) < 1920) {
                setA206yy("");
                setA206mm("");
                this.ageInMonths = "0";
                return;
            }


            //TODO:
            // set current Date
/*            int curDay = 15;//!MainApp.form.getAs1q15d().equals("98") ? Integer.parseInt(MainApp.form.getAs1q15d()) : 15;
            int curMonth = 6;//!MainApp.form.getAs1q15m().equals("98") ? Integer.parseInt(MainApp.form.getAs1q15m()) : 6;
            int curYear = 2021;//Integer.parseInt(MainApp.form.getAs1q15y());*/

            Calendar cur = Calendar.getInstance();


            // set Date of birth
            int day = !this.a205dd.equals("98") ? Integer.parseInt(this.a205dd) : 15;
            int month = !this.a205mm.equals("98") ? Integer.parseInt(this.a205mm) : 6;
            int year = Integer.parseInt(this.a205yy);
            Calendar cal = Calendar.getInstance();

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
//             String todayDate = df.format(Calendar.getInstance().getTime());


            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                long inDays = MILLISECONDS.toDays(millis);
                long tYear = inDays / 365;
                long tMonth = (inDays - (tYear * 365)) / 30;
                long tDay = inDays - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/

                setA206yy(String.valueOf(tYear));
                setA206mm(String.valueOf(tMonth));
                setA206dd(String.valueOf(tDay));
                setAgeInMonths(String.valueOf((int) inDays));
                if (tYear < 0)
                    setA206yy("");
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
            if (!this.a206yy.equals("") && !this.a206mm.equals("") && !this.a206dd.equals("")) {
                int yearToDays = 0;
                int monthsToDays = 0;
                int inDays = 0;


                if (Integer.parseInt(this.a206yy) < 98 && Integer.parseInt(this.a206yy) > 0)
                    yearToDays = (int) (Integer.parseInt(this.a206yy) * 365.2425);

                if (Integer.parseInt(this.a206mm) < 12 && Integer.parseInt(this.a206mm) > 0)
                    monthsToDays = (int) (Integer.parseInt(this.a206mm) * 30.43);
                if (Integer.parseInt(this.a206dd) < 30)
                    inDays = Integer.parseInt(this.a206dd);

                setAgeInMonths(String.valueOf(inDays + monthsToDays + yearToDays));

            }
        }
    }

    /**
     * Memeber Categories:
     * 1 = MWRA
     * 2 = Child
     * 3 = Adol MWRA
     * 4 = Adol
     */
    private void updateMemCategory() {
        if (a204.equals("") || a206yy.equals("") || a207.equals("") || !a211.equals("1")) return;
        String memGender = getA204();
        String memMaritalStatus = getA207();
        int memAge = Integer.parseInt(getA206yy());

        // MWRA
        if (memGender.equals("2")                // Female
                && memAge >= 15 && memAge <= 49   // 15 to 49 year old
                && !memMaritalStatus.equals("2")
                && !memMaritalStatus.isEmpty()
        ) {
            setMemCate("1");
        }

        // Child
        if (memAge < 5 && !a213.equals("") && !a213.equals("97")) setMemCate("2");


        // Adolescent
        if (memAge >= 10 && memAge <= 19)
            setMemCate("4");  // 10 to 19 year old

        // Adolescent MWRA
        if (memGender.equals("2")
                && memAge >= 15 && memAge <= 19   // 15 to 19 year old
                && (memMaritalStatus.equals("1") || memMaritalStatus.equals("3") || memMaritalStatus.equals("4"))
        ) setMemCate("3");


    }
}
