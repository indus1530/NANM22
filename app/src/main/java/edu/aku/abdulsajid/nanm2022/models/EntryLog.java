package edu.aku.abdulsajid.nanm2022.models;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.PROJECT_NAME;
import static edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_;

import android.database.Cursor;

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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.EntryLogTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;


@Entity(tableName = EntryLogTable.TABLE_NAME)
public class EntryLog extends BaseObservable implements Observable {

    @Ignore
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EntryLogTable.COLUMN_ID)
    private long id = 0;
    @ColumnInfo(name = EntryLogTable.COLUMN_UID)
    private String uid = _EMPTY_;

    // APP VARIABLES
    @ColumnInfo(name = EntryLogTable.COLUMN_PROJECT_NAME)
    private String projectName = PROJECT_NAME;

    @ColumnInfo(name = EntryLogTable.COLUMN_UUID)
    private String uuid = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_USERNAME)
    private String userName = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_SYSDATE)
    private String sysDate = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_ENTRY_DATE)
    private String entryDate = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_VILLAGE_CODE)
    private String villageCode = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_CHILD_ID)
    private String childID = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_CHILD_SRNO)
    private String childSrno = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_APPVERSION)
    private String appver = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_ISTATUS)
    private String iStatus = _EMPTY_;

    @Ignore
    private String iStatus96x = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_ENTRY_TYPE)
    private String entryType = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_DEVICEID)
    private String deviceId = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_SYNCED)
    private String synced = _EMPTY_;

    @ColumnInfo(name = EntryLogTable.COLUMN_SYNC_DATE)
    private String syncDate = _EMPTY_;

    public EntryLog() {

    }


    public void populateMeta() {

        setProjectName(PROJECT_NAME);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setUserName(MainApp.user.getUserName());
        setSysDate(MainApp.form.getSysDate());
        setEntryDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setVillageCode(MainApp.form.getVillageCode());
        setChildID(MainApp.form.getChildID());
        setChildSrno(MainApp.form.getChildSno());
        setIStatus(MainApp.form.getIStatus());
        setIStatus96x(MainApp.form.getIStatus96x());
        setAppver(MainApp.appInfo.getAppVersion());
        setDeviceId(MainApp.deviceid);

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
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
    public String getChildSrno() {
        return childSrno;
    }

    public void setChildSrno(String childSrno) {
        this.childSrno = childSrno;
        notifyPropertyChanged(BR.childSrno);
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
/*

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }
*/

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        this.iStatus = iStatus;
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

    public EntryLog Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_PROJECT_NAME));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_VILLAGE_CODE));
        this.childID = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_CHILD_ID));
        this.childSrno = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_CHILD_SRNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYSDATE));
        this.entryDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ENTRY_DATE));
        this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ENTRY_TYPE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_DEVICEID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYNC_DATE));

        return this;
    }

    public EntryLog Hydrate(EntryLog entryLog) throws JSONException {

        this.id = entryLog.id;
        this.uid = entryLog.uid;
        this.uuid = entryLog.uuid;
        this.projectName = entryLog.projectName;
        this.villageCode = entryLog.villageCode;
        this.childID = entryLog.childID;
        this.childSrno = entryLog.childSrno;
        this.userName = entryLog.userName;
        this.sysDate = entryLog.sysDate;
        this.entryDate = entryLog.entryDate;
        this.entryType = entryLog.entryType;
        this.deviceId = entryLog.deviceId;
        this.appver = entryLog.appver;
        this.iStatus = entryLog.iStatus;
        this.iStatus96x = entryLog.iStatus96x;
        this.synced = entryLog.synced;
        this.syncDate = entryLog.syncDate;

        return this;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(EntryLogTable.COLUMN_ID, this.id);
        json.put(EntryLogTable.COLUMN_UID, this.uid);
        json.put(EntryLogTable.COLUMN_UUID, this.uuid);
        json.put(EntryLogTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(EntryLogTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(EntryLogTable.COLUMN_CHILD_ID, this.childID);
        json.put(EntryLogTable.COLUMN_CHILD_SRNO, this.childSrno);
        json.put(EntryLogTable.COLUMN_USERNAME, this.userName);
        json.put(EntryLogTable.COLUMN_SYSDATE, this.sysDate);
        json.put(EntryLogTable.COLUMN_ENTRY_DATE, this.entryDate);
        json.put(EntryLogTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(EntryLogTable.COLUMN_DEVICEID, this.deviceId);
        json.put(EntryLogTable.COLUMN_ISTATUS, this.iStatus);
        json.put(EntryLogTable.COLUMN_ISTATUS96x, this.iStatus96x);
        json.put(EntryLogTable.COLUMN_SYNCED, this.synced);
        json.put(EntryLogTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(EntryLogTable.COLUMN_APPVERSION, this.appver);
        return json;
    }


}
