package edu.aku.abdulsajid.nanm2022.models;

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
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.FormsTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;


@Entity(tableName = FormsTable.TABLE_NAME)
public class Forms extends BaseObservable implements Observable {

    private String TAG = "Forms";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = FormsTable.COLUMN_ID)
    private long id = 0;

    @ColumnInfo(name = FormsTable.COLUMN_UID)
    private String uid = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_USERNAME)
    private String userName = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SYSDATE)
    private String sysDate = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_CLUSTER_CODE)
    private String clusterCode = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_HHID)
    private String hhid = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SNO)
    private String sno = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_DEVICEID)
    private String deviceId = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_DEVICETAGID)
    private String deviceTag = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_APPVERSION)
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_ISTATUS)
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SYNCED)
    private String synced = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SYNC_DATE)
    private String syncDate = _EMPTY_;

    // FIELD VARIABLES
    //A
    private String a109 = _EMPTY_;
    private String a106 = _EMPTY_;
    private String a107 = _EMPTY_;
    private String a108 = _EMPTY_;
    private String a105 = _EMPTY_;
    private String a101 = _EMPTY_;
    private String a102 = _EMPTY_;
    private String a103 = _EMPTY_;
    private String a104 = _EMPTY_;
    private String a110 = _EMPTY_;
    private String a111 = _EMPTY_;
    private String a112 = _EMPTY_;
    private String a113 = _EMPTY_;

    // Section Variables

    private String sA = _EMPTY_;


    public Forms() {
    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setClusterCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
        setSno(MainApp.currentHousehold.getSno());

        //SECTION VARIABLES
        setA109(MainApp.currentHousehold.getClusterCode());
        setA106(selectedDistrict);
        setA107(selectedTehsil);
        setA108(selectedUC);
        setA105(MainApp.currentHousehold.getHhno());

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
    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String clusterCode) {
        this.clusterCode = clusterCode;
        notifyPropertyChanged(BR.clusterCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
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


    public String getSA() {
        return sA;
    }

    public void setSA(String sA) {
        this.sA = sA;
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }


    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        notifyPropertyChanged(BR.a105);
    }

    @Bindable
    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
        notifyPropertyChanged(BR.a106);
    }

    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        notifyPropertyChanged(BR.a107);
    }

    @Bindable
    public String getA108() {
        return a108;
    }

    public void setA108(String a108) {
        this.a108 = a108;
        notifyPropertyChanged(BR.a108);
    }

    @Bindable
    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
        notifyPropertyChanged(BR.a101);
    }

    @Bindable
    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
        notifyPropertyChanged(BR.a102);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA104() {
        return a104;
    }

    public void setA104(String a104) {
        this.a104 = a104;
        notifyPropertyChanged(BR.a104);
    }

    @Bindable
    public String getA110() {
        return a110;
    }

    public void setA110(String a110) {
        this.a110 = a110;
        notifyPropertyChanged(BR.a110);
    }

    @Bindable
    public String getA111() {
        return a111;
    }

    public void setA111(String a111) {
        this.a111 = a111;
        notifyPropertyChanged(BR.a111);
    }

    @Bindable
    public String getA112() {
        return a112;
    }

    public void setA112(String a112) {
        this.a112 = a112;
        notifyPropertyChanged(BR.a112);
    }

    @Bindable
    public String getA113() {
        return a113;
    }

    public void setA113(String a113) {
        this.a113 = a113;
        notifyPropertyChanged(BR.a113);
    }

    public Forms Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME));
        this.clusterCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNC_DATE));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA)));
        return this;
    }

    public void sAHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a109 = json.getString("a109");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a108 = json.getString("a108");
            this.a105 = json.getString("a105");
            this.a101 = json.getString("a101");
            this.a102 = json.getString("a102");
            this.a103 = json.getString("a103");
            this.a104 = json.getString("a104");
            this.a110 = json.getString("a110");
            this.a111 = json.getString("a111");
            this.a112 = json.getString("a112");
            this.a113 = json.getString("a113");
            this.iStatus96x = json.has("iStatus96x") ? json.getString("iStatus96x") : "";
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FormsTable.COLUMN_CLUSTER_CODE, this.clusterCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);
        json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
        return json;
    }

    public String sAtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("a109", a109)
                .put("a106", a106)
                .put("a107", a107)
                .put("a108", a108)
                .put("a105", a105)
                .put("a101", a101)
                .put("a102", a102)
                .put("a103", a103)
                .put("a104", a104)
                .put("a110", a110)
                .put("a111", a111)
                .put("a112", a112)
                .put("a113", a113)
                .put("iStatus96x", iStatus96x);
        return json.toString();
    }

}