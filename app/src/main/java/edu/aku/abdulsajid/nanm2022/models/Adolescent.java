package edu.aku.abdulsajid.nanm2022.models;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.PROJECT_NAME;
import static edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedAdol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedMWRA;

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

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.AdolescentTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;

@Entity(tableName = AdolescentTable.TABLE_NAME)
public class Adolescent extends BaseObservable implements Observable {

    private String TAG = "Adolescent";
    @Ignore
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    @ColumnInfo(name = AdolescentTable.COLUMN_PROJECT_NAME)
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = AdolescentTable.COLUMN_ID)
    private long id = 0;
    @ColumnInfo(name = AdolescentTable.COLUMN_UID)
    private String uid = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_UUID)
    private String uuid = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_FMUID)
    private String fmuid = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_MUID)
    private String muid = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_USERNAME)
    private String userName = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SYSDATE)
    private String sysDate = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_INDEXED)
    private String indexed = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_NAME)
    private String name = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_VILLAGE_CODE)
    private String villageCode = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_CHILD_ID)
    private String childID = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_CHILD_SNO)
    private String childSno = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SNO)
    private String sno = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_DEVICEID)
    private String deviceId = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_DEVICETAGID)
    private String deviceTag = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_APPVERSION)
    private String appver = _EMPTY_;
    @Ignore
    private String endTime = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_ISTATUS)
    private String iStatus = _EMPTY_;
    @Ignore
    private String iStatus96x = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SYNCED)
    private String synced = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SYNC_DATE)
    private String syncDate = _EMPTY_;


    // Field Variables
    @Ignore
    private String c101 = _EMPTY_;
    @Ignore
    private String c102 = _EMPTY_;
    @Ignore
    private String c103 = _EMPTY_;
    @Ignore
    private String c104a = _EMPTY_;
    @Ignore
    private String c104b = _EMPTY_;
    @Ignore
    private String c104c = _EMPTY_;
    @Ignore
    private String c105 = _EMPTY_;
    @Ignore
    private String c106 = _EMPTY_;
    @Ignore
    private String c107 = _EMPTY_;
    @Ignore
    private String c108 = _EMPTY_;
    @Ignore
    private String c109 = _EMPTY_;
    @Ignore
    private String c110 = _EMPTY_;
    @Ignore
    private String c111 = _EMPTY_;
    @Ignore
    private String c112 = _EMPTY_;
    @Ignore
    private String c113 = _EMPTY_;
    @Ignore
    private String c114 = _EMPTY_;
    @Ignore
    private String c201 = _EMPTY_;
    @Ignore
    private String c202 = _EMPTY_;
    @Ignore
    private String c202a = _EMPTY_;
    @Ignore
    private String c202b = _EMPTY_;
    @Ignore
    private String c202c = _EMPTY_;
    @Ignore
    private String c202d = _EMPTY_;
    @Ignore
    private String c202e = _EMPTY_;
    @Ignore
    private String c202f = _EMPTY_;
    @Ignore
    private String c202g = _EMPTY_;
    @Ignore
    private String c202h = _EMPTY_;
    @Ignore
    private String c20296 = _EMPTY_;
    @Ignore
    private String c20296x = _EMPTY_;
    @Ignore
    private String c203 = _EMPTY_;
    @Ignore
    private String c204 = _EMPTY_;
    @Ignore
    private String c20496x = _EMPTY_;
    @Ignore
    private String c205a = _EMPTY_;
    @Ignore
    private String c20598 = _EMPTY_;
    @Ignore
    private String c206a = _EMPTY_;
    @Ignore
    private String c20698 = _EMPTY_;
    @Ignore
    private String c207 = _EMPTY_;
    @Ignore
    private String c208 = _EMPTY_;
    @Ignore
    private String c209 = _EMPTY_;
    @Ignore
    private String c20996x = _EMPTY_;
    @Ignore
    private String c210 = _EMPTY_;
    @Ignore
    private String c21096x = _EMPTY_;
    @Ignore
    private String c211 = _EMPTY_;
    @Ignore
    private String c212 = _EMPTY_;
    @Ignore
    private String c213 = _EMPTY_;
    @Ignore
    private String c214 = _EMPTY_;
    @Ignore
    private String c215 = _EMPTY_;
    @Ignore
    private String ca301 = _EMPTY_;
    @Ignore
    private String ca302 = _EMPTY_;
    @Ignore
    private String ca303 = _EMPTY_;
    @Ignore
    private String ca304 = _EMPTY_;
    @Ignore
    private String ca305 = _EMPTY_;
    @Ignore
    private String ca306 = _EMPTY_;
    @Ignore
    private String ca307 = _EMPTY_;
    @Ignore
    private String ca309 = _EMPTY_;
    @Ignore
    private String ca310 = _EMPTY_;
    @Ignore
    private String ca308 = _EMPTY_;
    @Ignore
    private String cb309 = _EMPTY_;
    @Ignore
    private String cb310 = _EMPTY_;
    @Ignore
    private String cb311 = _EMPTY_;
    @Ignore
    private String cb312 = _EMPTY_;
    @Ignore
    private String ca402 = _EMPTY_;
    @Ignore
    private String ca403 = _EMPTY_;
    @Ignore
    private String ca404 = _EMPTY_;
    @Ignore
    private String ca405 = _EMPTY_;
    @Ignore
    private String ca406 = _EMPTY_;
    @Ignore
    private String ca407 = _EMPTY_;
    @Ignore
    private String cb401 = _EMPTY_;
    @Ignore
    private String cb402 = _EMPTY_;
    @Ignore
    private String cb403 = _EMPTY_;
    @Ignore
    private String cb404 = _EMPTY_;
    @Ignore
    private String c501a = _EMPTY_;
    @Ignore
    private String c501b = _EMPTY_;
    @Ignore
    private String c501c = _EMPTY_;
    @Ignore
    private String c501d = _EMPTY_;
    @Ignore
    private String c501e = _EMPTY_;
    @Ignore
    private String c501f = _EMPTY_;
    @Ignore
    private String c501g = _EMPTY_;
    @Ignore
    private String c501h = _EMPTY_;
    @Ignore
    private String c501i = _EMPTY_;
    @Ignore
    private String c501j = _EMPTY_;
    @Ignore
    private String c502 = _EMPTY_;
    @Ignore
    private String c503 = _EMPTY_;
    @Ignore
    private String c50301 = _EMPTY_;
    @Ignore
    private String c50302 = _EMPTY_;
    @Ignore
    private String c50303 = _EMPTY_;
    @Ignore
    private String c50304 = _EMPTY_;
    @Ignore
    private String c50305 = _EMPTY_;
    @Ignore
    private String c50306 = _EMPTY_;
    @Ignore
    private String c50307 = _EMPTY_;
    @Ignore
    private String c50308 = _EMPTY_;
    @Ignore
    private String c50396 = _EMPTY_;
    @Ignore
    private String c50396x = _EMPTY_;
    @Ignore
    private String c504 = _EMPTY_;
    @Ignore
    private String c50401 = _EMPTY_;
    @Ignore
    private String c50402 = _EMPTY_;
    @Ignore
    private String c50403 = _EMPTY_;
    @Ignore
    private String c50404 = _EMPTY_;
    @Ignore
    private String c50405 = _EMPTY_;
    @Ignore
    private String c50406 = _EMPTY_;
    @Ignore
    private String c50407 = _EMPTY_;
    @Ignore
    private String c50496 = _EMPTY_;
    @Ignore
    private String c50496x = _EMPTY_;
    @Ignore
    private String c505 = _EMPTY_;
    @Ignore
    private String c506 = _EMPTY_;
    @Ignore
    private String c50601 = _EMPTY_;
    @Ignore
    private String c50602 = _EMPTY_;
    @Ignore
    private String c50603 = _EMPTY_;
    @Ignore
    private String c50604 = _EMPTY_;
    @Ignore
    private String c50605 = _EMPTY_;
    @Ignore
    private String c50606 = _EMPTY_;
    @Ignore
    private String c50607 = _EMPTY_;
    @Ignore
    private String c50608 = _EMPTY_;
    @Ignore
    private String c50609 = _EMPTY_;
    @Ignore
    private String c50610 = _EMPTY_;
    @Ignore
    private String c50611 = _EMPTY_;
    @Ignore
    private String c50696 = _EMPTY_;
    @Ignore
    private String c50696x = _EMPTY_;
    @Ignore
    private String c507 = _EMPTY_;
    @Ignore
    private String c508 = _EMPTY_;
    @Ignore
    private String c509 = _EMPTY_;
    @Ignore
    private String c510 = _EMPTY_;
    @Ignore
    private String c51096x = _EMPTY_;
    @Ignore
    private String c511a = _EMPTY_;
    @Ignore
    private String c511b = _EMPTY_;
    @Ignore
    private String c511c = _EMPTY_;
    @Ignore
    private String c511d = _EMPTY_;
    @Ignore
    private String c511e = _EMPTY_;
    @Ignore
    private String c511f = _EMPTY_;
    @Ignore
    private String c511g = _EMPTY_;
    @Ignore
    private String c511h = _EMPTY_;
    @Ignore
    private String c511i = _EMPTY_;
    @Ignore
    private String c511j = _EMPTY_;
    @Ignore
    private String c701 = _EMPTY_;
    @Ignore
    private String c702 = _EMPTY_;
    @Ignore
    private String c70201 = _EMPTY_;
    @Ignore
    private String c70202 = _EMPTY_;
    @Ignore
    private String c70203 = _EMPTY_;
    @Ignore
    private String c70204 = _EMPTY_;
    @Ignore
    private String c70205 = _EMPTY_;
    @Ignore
    private String c70206 = _EMPTY_;
    @Ignore
    private String c70207 = _EMPTY_;
    @Ignore
    private String c70208 = _EMPTY_;
    @Ignore
    private String c70296 = _EMPTY_;
    @Ignore
    private String c70296x = _EMPTY_;
    @Ignore
    private String c703 = _EMPTY_;
    @Ignore
    private String c704 = _EMPTY_;
    @Ignore
    private String c70401 = _EMPTY_;
    @Ignore
    private String c70402 = _EMPTY_;
    @Ignore
    private String c70403 = _EMPTY_;
    @Ignore
    private String c70404 = _EMPTY_;
    @Ignore
    private String c70405 = _EMPTY_;
    @Ignore
    private String c70406 = _EMPTY_;
    @Ignore
    private String c70407 = _EMPTY_;
    @Ignore
    private String c70408 = _EMPTY_;
    @Ignore
    private String c70496 = _EMPTY_;
    @Ignore
    private String c70496x = _EMPTY_;
    @Ignore
    private String c705 = _EMPTY_;
    @Ignore
    private String c70501 = _EMPTY_;
    @Ignore
    private String c70502 = _EMPTY_;
    @Ignore
    private String c70503 = _EMPTY_;
    @Ignore
    private String c70504 = _EMPTY_;
    @Ignore
    private String c70505 = _EMPTY_;
    @Ignore
    private String c70506 = _EMPTY_;
    @Ignore
    private String c70507 = _EMPTY_;
    @Ignore
    private String c70508 = _EMPTY_;
    @Ignore
    private String c70596 = _EMPTY_;
    @Ignore
    private String c70596x = _EMPTY_;
    @Ignore
    private String c706 = _EMPTY_;
    @Ignore
    private String c601 = _EMPTY_;
    @Ignore
    private String c60101 = _EMPTY_;
    @Ignore
    private String c60102 = _EMPTY_;
    @Ignore
    private String c60103 = _EMPTY_;
    @Ignore
    private String c60104 = _EMPTY_;
    @Ignore
    private String c60105 = _EMPTY_;
    @Ignore
    private String c60106 = _EMPTY_;
    @Ignore
    private String c60107 = _EMPTY_;
    @Ignore
    private String c60108 = _EMPTY_;
    @Ignore
    private String c60109 = _EMPTY_;
    @Ignore
    private String c602 = _EMPTY_;
    @Ignore
    private String c60296x = _EMPTY_;
    @Ignore
    private String c603 = _EMPTY_;
    @Ignore
    private String c60396x = _EMPTY_;
    @Ignore
    private String c604 = _EMPTY_;
    @Ignore
    private String c60496x = _EMPTY_;
    @Ignore
    private String c605 = _EMPTY_;
    @Ignore
    private String c606a = _EMPTY_;
    @Ignore
    private String c606b = _EMPTY_;
    @Ignore
    private String c606c = _EMPTY_;
    @Ignore
    private String c606d = _EMPTY_;
    @Ignore
    private String c606e = _EMPTY_;
    @Ignore
    private String c60696 = _EMPTY_;
    @Ignore
    private String c60701 = _EMPTY_;
    @Ignore
    private String c608 = _EMPTY_;

    @Ignore
    private String d1001 = _EMPTY_;
    @Ignore
    private String d101 = _EMPTY_;
    @Ignore
    private String d102 = _EMPTY_;
    @Ignore
    private String d1102 = _EMPTY_;
    @Ignore
    private String d103 = _EMPTY_;
    @Ignore
    private String d104 = _EMPTY_;
    @Ignore
    private String d105 = _EMPTY_;
    @Ignore
    private String d106 = _EMPTY_;
    @Ignore
    private String d1203 = _EMPTY_;
    @Ignore
    private String d107 = _EMPTY_;
    @Ignore
    private String d108 = _EMPTY_;
    @Ignore
    private String d1304 = _EMPTY_;
    @Ignore
    private String d1304ax = _EMPTY_;
    @Ignore
    private String d109 = _EMPTY_;
    @Ignore
    private String d1title2 = _EMPTY_;
    @Ignore
    private String d110 = _EMPTY_;
    @Ignore
    private String d111 = _EMPTY_;
    @Ignore
    private String d112 = _EMPTY_;
    @Ignore
    private String d113 = _EMPTY_;
    @Ignore
    private String d11301x = _EMPTY_;
    @Ignore
    private String d114 = _EMPTY_;
    @Ignore
    private String d115 = _EMPTY_;
    @Ignore
    private String d116 = _EMPTY_;
    @Ignore
    private String d117 = _EMPTY_;
    @Ignore
    private String d118 = _EMPTY_;
    @Ignore
    private String d119 = _EMPTY_;
    @Ignore
    private String d120 = _EMPTY_;
    @Ignore
    private String d121 = _EMPTY_;
    @Ignore
    private String d122 = _EMPTY_;
    @Ignore
    private String d123 = _EMPTY_;
    @Ignore
    private String d124 = _EMPTY_;
    @Ignore
    private String d125 = _EMPTY_;
    @Ignore
    private String d126 = _EMPTY_;
    @Ignore
    private String d201 = _EMPTY_;
    @Ignore
    private String d202 = _EMPTY_;
    @Ignore
    private String d203 = _EMPTY_;
    @Ignore
    private String d204 = _EMPTY_;

    // Section Variables
    @ColumnInfo(name = AdolescentTable.COLUMN_SC1)
    private String sC1 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SC2)
    private String sC2 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SC3)
    private String sC3 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SC4)
    private String sC4 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SC5)
    private String sC5 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SC6)
    private String sC6 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SC7)
    private String sC7 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SD1)
    private String sD1 = _EMPTY_;
    @ColumnInfo(name = AdolescentTable.COLUMN_SD2)
    private String sD2 = _EMPTY_;


    public void Adolescent() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setVillageCode(MainApp.currentADOL.getVillage_code());
        setChildID(MainApp.currentADOL.getChild_id());
        setChildSno(MainApp.currentADOL.getSrno());
        setSno(selectedAdol);
        setD201(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());
        setD105(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getUid()); //// not applicable in Form table
        setIndexed(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getIndexed());
        setName(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());


    }

    @Bindable
    public String getTAG() {
        return TAG;
    }

    public void setTAG(String tag) {
        this.TAG = tag;
    }

    public PropertyChangeRegistry getPropertyChangeRegistry() {
        return propertyChangeRegistry;
    }

    public String getVillageCode() {
        return villageCode;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getpsuCode() {
        return villageCode;
    }

    public String getChildID() {
        return childID;
    }

    public void setChildID(String childID) {
        this.childID = childID;
    }

    public String getChildSno() {
        return childSno;
    }

    public void setChildSno(String childSno) {
        this.childSno = childSno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }


    public String getSC1() {
        return sC1;
    }

    public void setSC1(String sC1) {
        this.sC1 = sC1;
    }

    public String getSC2() {
        return sC2;
    }

    public void setSC2(String sC2) {
        this.sC2 = sC2;
    }

    public String getSC3() {
        return sC3;
    }

    public void setSC3(String sC3) {
        this.sC3 = sC3;
    }

    public String getSC4() {
        return sC4;
    }

    public void setSC4(String sC4) {
        this.sC4 = sC4;
    }

    public String getSC5() {
        return sC5;
    }

    public void setSC5(String sC5) {
        this.sC5 = sC5;
    }

    public String getSC6() {
        return sC6;
    }

    public void setSC6(String sC6) {
        this.sC6 = sC6;
    }

    public String getSC7() {
        return sC7;
    }

    public void setSC7(String sC7) {
        this.sC7 = sC7;
    }

    public String getSD1() {
        return sD1;
    }

    public void setSD1(String sD1) {
        this.sD1 = sD1;
    }


    public String getSD2() {
        return sD2;
    }

    public void setSD2(String sD2) {
        this.sD2 = sD2;
    }

    @Bindable
    public String getC101() {
        return c101;
    }

    public void setC101(String c101) {
        this.c101 = c101;
        notifyPropertyChanged(BR.c101);
    }

    @Bindable
    public String getC102() {
        return c102;
    }

    public void setC102(String c102) {
        this.c102 = c102;
        notifyPropertyChanged(BR.c102);
    }

    @Bindable
    public String getC103() {
        return c103;
    }

    public void setC103(String c103) {
        this.c103 = c103;
        notifyPropertyChanged(BR.c103);
    }

    @Bindable
    public String getC104a() {
        return c104a;
    }

    public void setC104a(String c104a) {
        this.c104a = c104a;
        notifyPropertyChanged(BR.c104a);
    }

    @Bindable
    public String getC104b() {
        return c104b;
    }

    public void setC104b(String c104b) {
        this.c104b = c104b;
        notifyPropertyChanged(BR.c104b);
    }

    @Bindable
    public String getC104c() {
        return c104c;
    }

    public void setC104c(String c104c) {
        this.c104c = c104c;
        notifyPropertyChanged(BR.c104c);
    }

    @Bindable
    public String getC105() {
        return c105;
    }

    public void setC105(String c105) {
        this.c105 = c105;
        notifyPropertyChanged(BR.c105);
    }

    @Bindable
    public String getC106() {
        return c106;
    }

    public void setC106(String c106) {
        this.c106 = c106;
        notifyPropertyChanged(BR.c106);
    }

    @Bindable
    public String getC107() {
        return c107;
    }

    public void setC107(String c107) {
        this.c107 = c107;
        notifyPropertyChanged(BR.c107);
    }

    @Bindable
    public String getC108() {
        return c108;
    }

    public void setC108(String c108) {
        this.c108 = c108;
        notifyPropertyChanged(BR.c108);
    }

    @Bindable
    public String getC109() {
        return c109;
    }

    public void setC109(String c109) {
        this.c109 = c109;
        notifyPropertyChanged(BR.c109);
    }

    @Bindable
    public String getC110() {
        return c110;
    }

    public void setC110(String c110) {
        this.c110 = c110;
        notifyPropertyChanged(BR.c110);
    }

    @Bindable
    public String getC111() {
        return c111;
    }

    public void setC111(String c111) {
        this.c111 = c111;
        notifyPropertyChanged(BR.c111);
    }

    @Bindable
    public String getC112() {
        return c112;
    }

    public void setC112(String c112) {
        this.c112 = c112;
        setC113(c112.equals("1") ? this.c113 : "");
        setC114(c112.equals("1") ? this.c114 : "");
        notifyPropertyChanged(BR.c112);
    }

    @Bindable
    public String getC113() {
        return c113;
    }

    public void setC113(String c113) {
        this.c113 = c113;
        notifyPropertyChanged(BR.c113);
    }

    @Bindable
    public String getC114() {
        return c114;
    }

    public void setC114(String c114) {
        this.c114 = c114;
        notifyPropertyChanged(BR.c114);
    }

    @Bindable
    public String getC201() {
        return c201;
    }

    public void setC201(String c201) {
        this.c201 = c201;
        setC202a(c201.equals("2") ? this.c202a : "");
        setC202b(c201.equals("2") ? this.c202b : "");
        setC202c(c201.equals("2") ? this.c202c : "");
        setC202d(c201.equals("2") ? this.c202d : "");
        setC202e(c201.equals("2") ? this.c202e : "");
        setC202f(c201.equals("2") ? this.c202f : "");
        setC202g(c201.equals("2") ? this.c202g : "");
        setC20296(c201.equals("2") ? this.c20296 : "");

        setC203(c201.equals("1") ? this.c203 : "");
        setC204(c201.equals("1") ? this.c204 : "");
        setC205a(c201.equals("1") ? this.c205a : "");
        setC20598(c201.equals("1") ? this.c20598 : "");
        setC206a(c201.equals("1") ? this.c206a : "");
        setC20698(c201.equals("1") ? this.c20698 : "");
        setC207(c201.equals("1") ? this.c207 : "");
        setC208(c201.equals("1") ? this.c208 : "");
        setC209(c201.equals("1") ? this.c209 : "");
        setC210(c201.equals("1") ? this.c210 : "");
        setC211(c201.equals("1") ? this.c211 : "");
        setC212(c201.equals("1") ? this.c212 : "");
        setC213(c201.equals("1") ? this.c213 : "");
        setC214(c201.equals("1") ? this.c214 : "");
        setC215(c201.equals("1") ? this.c215 : "");
        notifyPropertyChanged(BR.c201);
    }

    @Bindable
    public String getC202() {
        return c202;
    }

    public void setC202(String c202) {
        this.c202 = c202;
        notifyPropertyChanged(BR.c202);
    }

    @Bindable
    public String getC202a() {
        return c202a;
    }

    public void setC202a(String c202a) {
        if (this.c202a.equals(c202a)) return; // for all checkboxes
        this.c202a = c202a;
        notifyPropertyChanged(BR.c202a);
    }

    @Bindable
    public String getC202b() {
        return c202b;
    }

    public void setC202b(String c202b) {
        if (this.c202b.equals(c202b)) return; // for all checkboxes
        this.c202b = c202b;
        notifyPropertyChanged(BR.c202b);
    }

    @Bindable
    public String getC202c() {
        return c202c;
    }

    public void setC202c(String c202c) {
        if (this.c202c.equals(c202c)) return; // for all checkboxes
        this.c202c = c202c;
        notifyPropertyChanged(BR.c202c);
    }

    @Bindable
    public String getC202d() {
        return c202d;
    }

    public void setC202d(String c202d) {
        if (this.c202d.equals(c202d)) return; // for all checkboxes
        this.c202d = c202d;
        notifyPropertyChanged(BR.c202d);
    }

    @Bindable
    public String getC202e() {
        return c202e;
    }

    public void setC202e(String c202e) {
        if (this.c202e.equals(c202e)) return; // for all checkboxes
        this.c202e = c202e;
        notifyPropertyChanged(BR.c202e);
    }

    @Bindable
    public String getC202f() {
        return c202f;
    }

    public void setC202f(String c202f) {
        if (this.c202f.equals(c202f)) return; // for all checkboxes
        this.c202f = c202f;
        notifyPropertyChanged(BR.c202f);
    }

    @Bindable
    public String getC202g() {
        return c202g;
    }

    public void setC202g(String c202g) {
        if (this.c202g.equals(c202g)) return; // for all checkboxes
        this.c202g = c202g;
        notifyPropertyChanged(BR.c202g);
    }

    @Bindable
    public String getC202h() {
        return c202h;
    }

    public void setC202h(String c202h) {
        if (this.c202h.equals(c202h)) return; // for all checkboxes
        this.c202h = c202h;
        setC202a(c202h.equals("97") ? "" : this.c202a);
        setC202b(c202h.equals("97") ? "" : this.c202b);
        setC202c(c202h.equals("97") ? "" : this.c202c);
        setC202d(c202h.equals("97") ? "" : this.c202d);
        setC202e(c202h.equals("97") ? "" : this.c202e);
        setC202f(c202h.equals("97") ? "" : this.c202f);
        setC202g(c202h.equals("97") ? "" : this.c202g);
        setC20296(c202h.equals("97") ? "" : this.c20296);
        notifyPropertyChanged(BR.c202h);
    }

    @Bindable
    public String getC20296() {
        return c20296;
    }

    public void setC20296(String c20296) {
        if (this.c20296.equals(c20296)) return; // for all checkboxes
        this.c20296 = c20296;
        setC20296x(c20296.equals("96") ? this.c20296x : "");
        notifyPropertyChanged(BR.c20296);
    }

    @Bindable
    public String getC20296x() {
        return c20296x;
    }

    public void setC20296x(String c20296x) {
        this.c20296x = c20296x;
        notifyPropertyChanged(BR.c20296x);
    }

    @Bindable
    public String getC203() {
        return c203;
    }

    public void setC203(String c203) {
        this.c203 = c203;
        setC204(c203.equals("1") ? this.c204 : "");
        notifyPropertyChanged(BR.c203);
    }

    @Bindable
    public String getC204() {
        return c204;
    }

    public void setC204(String c204) {
        this.c204 = c204;
        setC20496x(c204.equals("96") ? this.c20496x : "");
        notifyPropertyChanged(BR.c204);
    }

    @Bindable
    public String getC20496x() {
        return c20496x;
    }

    public void setC20496x(String c20496x) {
        this.c20496x = c20496x;
        notifyPropertyChanged(BR.c20496x);
    }

    @Bindable
    public String getC205a() {
        return c205a;
    }

    public void setC205a(String c205a) {
        this.c205a = c205a;
        notifyPropertyChanged(BR.c205a);
    }

    @Bindable
    public String getC20598() {
        return c20598;
    }

    public void setC20598(String c20598) {
        if (this.c20598.equals(c20598)) return; // for all checkboxes
        this.c20598 = c20598;
        setC205a(c20598.equals("98") ? "" : this.c205a);
        notifyPropertyChanged(BR.c20598);
    }

    @Bindable
    public String getC206a() {
        return c206a;
    }

    public void setC206a(String c206a) {
        this.c206a = c206a;
        notifyPropertyChanged(BR.c206a);
    }

    @Bindable
    public String getC20698() {
        return c20698;
    }

    public void setC20698(String c20698) {
        if (this.c20698.equals(c20698)) return; // for all checkboxes
        this.c20698 = c20698;
        setC206a(c20698.equals("98") ? "" : this.c206a);
        notifyPropertyChanged(BR.c20698);
    }

    @Bindable
    public String getC207() {
        return c207;
    }

    public void setC207(String c207) {
        this.c207 = c207;
        notifyPropertyChanged(BR.c207);
    }

    @Bindable
    public String getC208() {
        return c208;
    }

    public void setC208(String c208) {
        this.c208 = c208;
        setC209(c208.equals("1") ? this.c209 : "");
        notifyPropertyChanged(BR.c208);
    }

    @Bindable
    public String getC209() {
        return c209;
    }

    public void setC209(String c209) {
        this.c209 = c209;
        setC20996x(c209.equals("96") ? this.c20996x : "");
        notifyPropertyChanged(BR.c209);
    }

    @Bindable
    public String getC20996x() {
        return c20996x;
    }

    public void setC20996x(String c20996x) {
        this.c20996x = c20996x;
        notifyPropertyChanged(BR.c20996x);
    }

    @Bindable
    public String getC210() {
        return c210;
    }

    public void setC210(String c210) {
        this.c210 = c210;
        setC21096x(c210.equals("96") ? this.c21096x : "");
        notifyPropertyChanged(BR.c210);
    }

    @Bindable
    public String getC21096x() {
        return c21096x;
    }

    public void setC21096x(String c21096x) {
        this.c21096x = c21096x;
        notifyPropertyChanged(BR.c21096x);
    }

    @Bindable
    public String getC211() {
        return c211;
    }

    public void setC211(String c211) {
        this.c211 = c211;
        notifyPropertyChanged(BR.c211);
    }

    @Bindable
    public String getC212() {
        return c212;
    }

    public void setC212(String c212) {
        this.c212 = c212;
        notifyPropertyChanged(BR.c212);
    }

    @Bindable
    public String getC213() {
        return c213;
    }

    public void setC213(String c213) {
        this.c213 = c213;
        notifyPropertyChanged(BR.c213);
    }

    @Bindable
    public String getC214() {
        return c214;
    }

    public void setC214(String c214) {
        this.c214 = c214;
        notifyPropertyChanged(BR.c214);
    }

    @Bindable
    public String getC215() {
        return c215;
    }

    public void setC215(String c215) {
        this.c215 = c215;
        notifyPropertyChanged(BR.c215);
    }

    @Bindable
    public String getCa301() {
        return ca301;
    }

    public void setCa301(String ca301) {
        this.ca301 = ca301;
        notifyPropertyChanged(BR.ca301);
    }

    @Bindable
    public String getCa302() {
        return ca302;
    }

    public void setCa302(String ca302) {
        this.ca302 = ca302;
        notifyPropertyChanged(BR.ca302);
    }

    @Bindable
    public String getCa303() {
        return ca303;
    }

    public void setCa303(String ca303) {
        this.ca303 = ca303;
        notifyPropertyChanged(BR.ca303);
    }

    @Bindable
    public String getCa304() {
        return ca304;
    }

    public void setCa304(String ca304) {
        this.ca304 = ca304;
        notifyPropertyChanged(BR.ca304);
    }

    @Bindable
    public String getCa305() {
        return ca305;
    }

    public void setCa305(String ca305) {
        this.ca305 = ca305;
        notifyPropertyChanged(BR.ca305);
    }

    @Bindable
    public String getCa306() {
        return ca306;
    }

    public void setCa306(String ca306) {
        this.ca306 = ca306;
        notifyPropertyChanged(BR.ca306);
    }

    @Bindable
    public String getCa307() {
        return ca307;
    }

    public void setCa307(String ca307) {
        this.ca307 = ca307;
        notifyPropertyChanged(BR.ca307);
    }

    @Bindable
    public String getCa309() {
        return ca309;
    }

    public void setCa309(String ca309) {
        this.ca309 = ca309;
        notifyPropertyChanged(BR.ca309);
    }

    @Bindable
    public String getCa310() {
        return ca310;
    }

    public void setCa310(String ca310) {
        this.ca310 = ca310;
        notifyPropertyChanged(BR.ca310);
    }

    @Bindable
    public String getCa308() {
        return ca308;
    }

    public void setCa308(String ca308) {
        this.ca308 = ca308;
        notifyPropertyChanged(BR.ca308);
    }

    @Bindable
    public String getCb309() {
        return cb309;
    }

    public void setCb309(String cb309) {
        this.cb309 = cb309;
        notifyPropertyChanged(BR.cb309);
    }

    @Bindable
    public String getCb310() {
        return cb310;
    }

    public void setCb310(String cb310) {
        this.cb310 = cb310;
        notifyPropertyChanged(BR.cb310);
    }

    @Bindable
    public String getCb311() {
        return cb311;
    }

    public void setCb311(String cb311) {
        this.cb311 = cb311;
        notifyPropertyChanged(BR.cb311);
    }

    @Bindable
    public String getCb312() {
        return cb312;
    }

    public void setCb312(String cb312) {
        this.cb312 = cb312;
        notifyPropertyChanged(BR.cb312);
    }

    @Bindable
    public String getCa402() {
        return ca402;
    }

    public void setCa402(String ca402) {
        this.ca402 = ca402;
        notifyPropertyChanged(BR.ca402);
    }

    @Bindable
    public String getCa403() {
        return ca403;
    }

    public void setCa403(String ca403) {
        this.ca403 = ca403;
        notifyPropertyChanged(BR.ca403);
    }

    @Bindable
    public String getCa404() {
        return ca404;
    }

    public void setCa404(String ca404) {
        this.ca404 = ca404;
        notifyPropertyChanged(BR.ca404);
    }

    @Bindable
    public String getCa405() {
        return ca405;
    }

    public void setCa405(String ca405) {
        this.ca405 = ca405;
        notifyPropertyChanged(BR.ca405);
    }

    @Bindable
    public String getCa406() {
        return ca406;
    }

    public void setCa406(String ca406) {
        this.ca406 = ca406;
        notifyPropertyChanged(BR.ca406);
    }

    @Bindable
    public String getCa407() {
        return ca407;
    }

    public void setCa407(String ca407) {
        this.ca407 = ca407;
        notifyPropertyChanged(BR.ca407);
    }

    @Bindable
    public String getCb401() {
        return cb401;
    }

    public void setCb401(String cb401) {
        this.cb401 = cb401;
        notifyPropertyChanged(BR.cb401);
    }

    @Bindable
    public String getCb402() {
        return cb402;
    }

    public void setCb402(String cb402) {
        this.cb402 = cb402;
        notifyPropertyChanged(BR.cb402);
    }

    @Bindable
    public String getCb403() {
        return cb403;
    }

    public void setCb403(String cb403) {
        this.cb403 = cb403;
        notifyPropertyChanged(BR.cb403);
    }

    @Bindable
    public String getCb404() {
        return cb404;
    }

    public void setCb404(String cb404) {
        this.cb404 = cb404;
        notifyPropertyChanged(BR.cb404);
    }

    @Bindable
    public String getC501a() {
        return c501a;
    }

    public void setC501a(String c501a) {
        this.c501a = c501a;
        notifyPropertyChanged(BR.c501a);
    }

    @Bindable
    public String getC501b() {
        return c501b;
    }

    public void setC501b(String c501b) {
        this.c501b = c501b;
        notifyPropertyChanged(BR.c501b);
    }

    @Bindable
    public String getC501c() {
        return c501c;
    }

    public void setC501c(String c501c) {
        this.c501c = c501c;
        notifyPropertyChanged(BR.c501c);
    }

    @Bindable
    public String getC501d() {
        return c501d;
    }

    public void setC501d(String c501d) {
        this.c501d = c501d;
        notifyPropertyChanged(BR.c501d);
    }

    @Bindable
    public String getC501e() {
        return c501e;
    }

    public void setC501e(String c501e) {
        this.c501e = c501e;
        notifyPropertyChanged(BR.c501e);
    }

    @Bindable
    public String getC501f() {
        return c501f;
    }

    public void setC501f(String c501f) {
        this.c501f = c501f;
        notifyPropertyChanged(BR.c501f);
    }

    @Bindable
    public String getC501g() {
        return c501g;
    }

    public void setC501g(String c501g) {
        this.c501g = c501g;
        notifyPropertyChanged(BR.c501g);
    }

    @Bindable
    public String getC501h() {
        return c501h;
    }

    public void setC501h(String c501h) {
        this.c501h = c501h;
        notifyPropertyChanged(BR.c501h);
    }

    @Bindable
    public String getC501i() {
        return c501i;
    }

    public void setC501i(String c501i) {
        this.c501i = c501i;
        notifyPropertyChanged(BR.c501i);
    }

    @Bindable
    public String getC501j() {
        return c501j;
    }

    public void setC501j(String c501j) {
        this.c501j = c501j;
        notifyPropertyChanged(BR.c501j);
    }

    @Bindable
    public String getC502() {
        return c502;
    }

    public void setC502(String c502) {
        this.c502 = c502;
        setC50301(c502.equals("1") ? this.c50301 : "");
        setC50302(c502.equals("1") ? this.c50302 : "");
        setC50303(c502.equals("1") ? this.c50303 : "");
        setC50304(c502.equals("1") ? this.c50304 : "");
        setC50305(c502.equals("1") ? this.c50305 : "");
        setC50306(c502.equals("1") ? this.c50306 : "");
        setC50307(c502.equals("1") ? this.c50307 : "");
        setC50308(c502.equals("1") ? this.c50308 : "");
        setC50396(c502.equals("1") ? this.c50396 : "");
        notifyPropertyChanged(BR.c502);
    }

    @Bindable
    public String getC503() {
        return c503;
    }

    public void setC503(String c503) {
        this.c503 = c503;
        notifyPropertyChanged(BR.c503);
    }

    @Bindable
    public String getC50301() {
        return c50301;
    }

    public void setC50301(String c50301) {
        if (this.c50301.equals(c50301)) return; // for all checkboxes
        this.c50301 = c50301;
        notifyPropertyChanged(BR.c50301);
    }

    @Bindable
    public String getC50302() {
        return c50302;
    }

    public void setC50302(String c50302) {
        if (this.c50302.equals(c50302)) return; // for all checkboxes
        this.c50302 = c50302;
        notifyPropertyChanged(BR.c50302);
    }

    @Bindable
    public String getC50303() {
        return c50303;
    }

    public void setC50303(String c50303) {
        if (this.c50303.equals(c50303)) return; // for all checkboxes
        this.c50303 = c50303;
        notifyPropertyChanged(BR.c50303);
    }

    @Bindable
    public String getC50304() {
        return c50304;
    }

    public void setC50304(String c50304) {
        if (this.c50304.equals(c50304)) return; // for all checkboxes
        this.c50304 = c50304;
        notifyPropertyChanged(BR.c50304);
    }

    @Bindable
    public String getC50305() {
        return c50305;
    }

    public void setC50305(String c50305) {
        if (this.c50305.equals(c50305)) return; // for all checkboxes
        this.c50305 = c50305;
        notifyPropertyChanged(BR.c50305);
    }

    @Bindable
    public String getC50306() {
        return c50306;
    }

    public void setC50306(String c50306) {
        if (this.c50306.equals(c50306)) return; // for all checkboxes
        this.c50306 = c50306;
        notifyPropertyChanged(BR.c50306);
    }

    @Bindable
    public String getC50307() {
        return c50307;
    }

    public void setC50307(String c50307) {
        if (this.c50307.equals(c50307)) return; // for all checkboxes
        this.c50307 = c50307;
        notifyPropertyChanged(BR.c50307);
    }

    @Bindable
    public String getC50308() {
        return c50308;
    }

    public void setC50308(String c50308) {
        if (this.c50308.equals(c50308)) return; // for all checkboxes
        this.c50308 = c50308;
        notifyPropertyChanged(BR.c50308);
    }

    @Bindable
    public String getC50396() {
        return c50396;
    }

    public void setC50396(String c50396) {
        if (this.c50396.equals(c50396)) return; // for all checkboxes
        this.c50396 = c50396;
        setC50396x(c50396.equals("96") ? this.c50396 : "");
        notifyPropertyChanged(BR.c50396);
    }

    @Bindable
    public String getC50396x() {
        return c50396x;
    }

    public void setC50396x(String c50396x) {
        this.c50396x = c50396x;
        notifyPropertyChanged(BR.c50396x);
    }

    @Bindable
    public String getC504() {
        return c504;
    }

    public void setC504(String c504) {
        this.c504 = c504;
        notifyPropertyChanged(BR.c504);
    }

    @Bindable
    public String getC50401() {
        return c50401;
    }

    public void setC50401(String c50401) {
        if (this.c50401.equals(c50401)) return; // for all checkboxes
        this.c50401 = c50401;
        notifyPropertyChanged(BR.c50401);
    }

    @Bindable
    public String getC50402() {
        return c50402;
    }

    public void setC50402(String c50402) {
        if (this.c50402.equals(c50402)) return; // for all checkboxes
        this.c50402 = c50402;
        notifyPropertyChanged(BR.c50402);
    }

    @Bindable
    public String getC50403() {
        return c50403;
    }

    public void setC50403(String c50403) {
        if (this.c50403.equals(c50403)) return; // for all checkboxes
        this.c50403 = c50403;
        notifyPropertyChanged(BR.c50403);
    }

    @Bindable
    public String getC50404() {
        return c50404;
    }

    public void setC50404(String c50404) {
        if (this.c50404.equals(c50404)) return; // for all checkboxes
        this.c50404 = c50404;
        notifyPropertyChanged(BR.c50404);
    }

    @Bindable
    public String getC50405() {
        return c50405;
    }

    public void setC50405(String c50405) {
        if (this.c50405.equals(c50405)) return; // for all checkboxes
        this.c50405 = c50405;
        notifyPropertyChanged(BR.c50405);
    }

    @Bindable
    public String getC50406() {
        return c50406;
    }

    public void setC50406(String c50406) {
        if (this.c50406.equals(c50406)) return; // for all checkboxes
        this.c50406 = c50406;
        notifyPropertyChanged(BR.c50406);
    }

    @Bindable
    public String getC50407() {
        return c50407;
    }

    public void setC50407(String c50407) {
        if (this.c50407.equals(c50407)) return; // for all checkboxes
        this.c50407 = c50407;
        notifyPropertyChanged(BR.c50407);
    }

    @Bindable
    public String getC50496() {
        return c50496;
    }

    public void setC50496(String c50496) {
        if (this.c50496.equals(c50496)) return; // for all checkboxes
        this.c50496 = c50496;
        setC50496x(c50496.equals("96") ? this.c50496x : "");
        notifyPropertyChanged(BR.c50496);
    }

    @Bindable
    public String getC50496x() {
        return c50496x;
    }

    public void setC50496x(String c50496x) {
        this.c50496x = c50496x;
        notifyPropertyChanged(BR.c50496x);
    }

    @Bindable
    public String getC505() {
        return c505;
    }

    public void setC505(String c505) {
        this.c505 = c505;
        setC50601(c505.equals("1") ? this.c50601 : "");
        setC50602(c505.equals("1") ? this.c50602 : "");
        setC50603(c505.equals("1") ? this.c50603 : "");
        setC50604(c505.equals("1") ? this.c50604 : "");
        setC50605(c505.equals("1") ? this.c50605 : "");
        setC50606(c505.equals("1") ? this.c50606 : "");
        setC50607(c505.equals("1") ? this.c50607 : "");
        setC50608(c505.equals("1") ? this.c50608 : "");
        setC50609(c505.equals("1") ? this.c50609 : "");
        setC50696(c505.equals("1") ? this.c50696 : "");
        notifyPropertyChanged(BR.c505);
    }

    @Bindable
    public String getC506() {
        return c506;
    }

    public void setC506(String c506) {
        this.c506 = c506;
        notifyPropertyChanged(BR.c506);
    }

    @Bindable
    public String getC50601() {
        return c50601;
    }

    public void setC50601(String c50601) {
        if (this.c50601.equals(c50601)) return; // for all checkboxes
        this.c50601 = c50601;
        notifyPropertyChanged(BR.c50601);
    }

    @Bindable
    public String getC50602() {
        return c50602;
    }

    public void setC50602(String c50602) {
        if (this.c50602.equals(c50602)) return; // for all checkboxes
        this.c50602 = c50602;
        notifyPropertyChanged(BR.c50602);
    }

    @Bindable
    public String getC50603() {
        return c50603;
    }

    public void setC50603(String c50603) {
        if (this.c50603.equals(c50603)) return; // for all checkboxes
        this.c50603 = c50603;
        notifyPropertyChanged(BR.c50603);
    }

    @Bindable
    public String getC50604() {
        return c50604;
    }

    public void setC50604(String c50604) {
        if (this.c50604.equals(c50604)) return; // for all checkboxes
        this.c50604 = c50604;
        notifyPropertyChanged(BR.c50604);
    }

    @Bindable
    public String getC50605() {
        return c50605;
    }

    public void setC50605(String c50605) {
        if (this.c50605.equals(c50605)) return; // for all checkboxes
        this.c50605 = c50605;
        notifyPropertyChanged(BR.c50605);
    }

    @Bindable
    public String getC50606() {
        return c50606;
    }

    public void setC50606(String c50606) {
        if (this.c50606.equals(c50606)) return; // for all checkboxes
        this.c50606 = c50606;
        notifyPropertyChanged(BR.c50606);
    }

    @Bindable
    public String getC50607() {
        return c50607;
    }

    public void setC50607(String c50607) {
        if (this.c50607.equals(c50607)) return; // for all checkboxes
        this.c50607 = c50607;
        notifyPropertyChanged(BR.c50607);
    }

    @Bindable
    public String getC50608() {
        return c50608;
    }

    public void setC50608(String c50608) {
        if (this.c50608.equals(c50608)) return; // for all checkboxes
        this.c50608 = c50608;
        notifyPropertyChanged(BR.c50608);
    }

    @Bindable
    public String getC50609() {
        return c50609;
    }

    public void setC50609(String c50609) {
        if (this.c50609.equals(c50609)) return; // for all checkboxes
        this.c50609 = c50609;
        notifyPropertyChanged(BR.c50609);
    }

    @Bindable
    public String getC50610() {
        return c50610;
    }

    public void setC50610(String c50610) {
        if (this.c50610.equals(c50610)) return; // for all checkboxes
        this.c50610 = c50610;
        notifyPropertyChanged(BR.c50610);
    }

    @Bindable
    public String getC50611() {
        return c50611;
    }

    public void setC50611(String c50611) {
        if (this.c50611.equals(c50611)) return; // for all checkboxes
        this.c50611 = c50611;
        notifyPropertyChanged(BR.c50611);
    }

    @Bindable
    public String getC50696() {
        return c50696;
    }

    public void setC50696(String c50696) {
        if (this.c50696.equals(c50696)) return; // for all checkboxes
        this.c50696 = c50696;
        setC50696x(c50696.equals("96") ? this.c50696x : "");
        notifyPropertyChanged(BR.c50696);
    }

    @Bindable
    public String getC50696x() {
        return c50696x;
    }

    public void setC50696x(String c50696x) {
        this.c50696x = c50696x;
        notifyPropertyChanged(BR.c50696x);
    }

    @Bindable
    public String getC507() {
        return c507;
    }

    public void setC507(String c507) {
        this.c507 = c507;
        notifyPropertyChanged(BR.c507);
    }

    @Bindable
    public String getC508() {
        return c508;
    }

    public void setC508(String c508) {
        this.c508 = c508;
        notifyPropertyChanged(BR.c508);
    }

    @Bindable
    public String getC509() {
        return c509;
    }

    public void setC509(String c509) {
        this.c509 = c509;
        notifyPropertyChanged(BR.c509);
    }

    @Bindable
    public String getC510() {
        return c510;
    }

    public void setC510(String c510) {
        this.c510 = c510;
        notifyPropertyChanged(BR.c510);
    }

    @Bindable
    public String getC51096x() {
        return c51096x;
    }

    public void setC51096x(String c51096x) {
        this.c51096x = c51096x;
        notifyPropertyChanged(BR.c51096x);
    }

    @Bindable
    public String getC511a() {
        return c511a;
    }

    public void setC511a(String c511a) {
        this.c511a = c511a;
        notifyPropertyChanged(BR.c511a);
    }

    @Bindable
    public String getC511b() {
        return c511b;
    }

    public void setC511b(String c511b) {
        this.c511b = c511b;
        notifyPropertyChanged(BR.c511b);
    }

    @Bindable
    public String getC511c() {
        return c511c;
    }

    public void setC511c(String c511c) {
        this.c511c = c511c;
        notifyPropertyChanged(BR.c511c);
    }

    @Bindable
    public String getC511d() {
        return c511d;
    }

    public void setC511d(String c511d) {
        this.c511d = c511d;
        notifyPropertyChanged(BR.c511d);
    }

    @Bindable
    public String getC511e() {
        return c511e;
    }

    public void setC511e(String c511e) {
        this.c511e = c511e;
        notifyPropertyChanged(BR.c511e);
    }

    @Bindable
    public String getC511f() {
        return c511f;
    }

    public void setC511f(String c511f) {
        this.c511f = c511f;
        notifyPropertyChanged(BR.c511f);
    }

    @Bindable
    public String getC511g() {
        return c511g;
    }

    public void setC511g(String c511g) {
        this.c511g = c511g;
        notifyPropertyChanged(BR.c511g);
    }

    @Bindable
    public String getC511h() {
        return c511h;
    }

    public void setC511h(String c511h) {
        this.c511h = c511h;
        notifyPropertyChanged(BR.c511h);
    }

    @Bindable
    public String getC511i() {
        return c511i;
    }

    public void setC511i(String c511i) {
        this.c511i = c511i;
        notifyPropertyChanged(BR.c511i);
    }

    @Bindable
    public String getC511j() {
        return c511j;
    }

    public void setC511j(String c511j) {
        this.c511j = c511j;
        notifyPropertyChanged(BR.c511j);
    }

    @Bindable
    public String getC701() {
        return c701;
    }

    public void setC701(String c701) {
        this.c701 = c701;
        setC70201(c701.equals("1") ? this.c70201 : "");
        setC70202(c701.equals("1") ? this.c70202 : "");
        setC70203(c701.equals("1") ? this.c70203 : "");
        setC70204(c701.equals("1") ? this.c70204 : "");
        setC70205(c701.equals("1") ? this.c70205 : "");
        setC70206(c701.equals("1") ? this.c70206 : "");
        setC70207(c701.equals("1") ? this.c70207 : "");
        setC70208(c701.equals("1") ? this.c70208 : "");
        setC70296(c701.equals("1") ? this.c70296 : "");
        notifyPropertyChanged(BR.c701);
    }

    @Bindable
    public String getC702() {
        return c702;
    }

    public void setC702(String c702) {
        this.c702 = c702;
        notifyPropertyChanged(BR.c702);
    }

    @Bindable
    public String getC70201() {
        return c70201;
    }

    public void setC70201(String c70201) {
        if (this.c70201.equals(c70201)) return; // for all checkboxes
        this.c70201 = c70201;
        notifyPropertyChanged(BR.c70201);
    }

    @Bindable
    public String getC70202() {
        return c70202;
    }

    public void setC70202(String c70202) {
        if (this.c70202.equals(c70202)) return; // for all checkboxes
        this.c70202 = c70202;
        notifyPropertyChanged(BR.c70202);
    }

    @Bindable
    public String getC70203() {
        return c70203;
    }

    public void setC70203(String c70203) {
        if (this.c70203.equals(c70203)) return; // for all checkboxes
        this.c70203 = c70203;
        notifyPropertyChanged(BR.c70203);
    }

    @Bindable
    public String getC70204() {
        return c70204;
    }

    public void setC70204(String c70204) {
        if (this.c70204.equals(c70204)) return; // for all checkboxes
        this.c70204 = c70204;
        notifyPropertyChanged(BR.c70204);
    }

    @Bindable
    public String getC70205() {
        return c70205;
    }

    public void setC70205(String c70205) {
        if (this.c70205.equals(c70205)) return; // for all checkboxes
        this.c70205 = c70205;
        notifyPropertyChanged(BR.c70205);
    }

    @Bindable
    public String getC70206() {
        return c70206;
    }

    public void setC70206(String c70206) {
        if (this.c70206.equals(c70206)) return; // for all checkboxes
        this.c70206 = c70206;
        notifyPropertyChanged(BR.c70206);
    }

    @Bindable
    public String getC70207() {
        return c70207;
    }

    public void setC70207(String c70207) {
        if (this.c70207.equals(c70207)) return; // for all checkboxes
        this.c70207 = c70207;
        notifyPropertyChanged(BR.c70207);
    }

    @Bindable
    public String getC70208() {
        return c70208;
    }

    public void setC70208(String c70208) {
        if (this.c70208.equals(c70208)) return; // for all checkboxes
        this.c70208 = c70208;
        notifyPropertyChanged(BR.c70208);
    }

    @Bindable
    public String getC70296() {
        return c70296;
    }

    public void setC70296(String c70296) {
        if (this.c70296.equals(c70296)) return; // for all checkboxes
        this.c70296 = c70296;
        setC70296x(c70296.equals("96") ? this.c70296x : "");
        notifyPropertyChanged(BR.c70296);
    }

    @Bindable
    public String getC70296x() {
        return c70296x;
    }

    public void setC70296x(String c70296x) {
        this.c70296x = c70296x;
        notifyPropertyChanged(BR.c70296x);
    }

    @Bindable
    public String getC703() {
        return c703;
    }

    public void setC703(String c703) {
        this.c703 = c703;
        setC70401(c703.equals("1") ? this.c70401 : "");
        setC70402(c703.equals("1") ? this.c70402 : "");
        setC70403(c703.equals("1") ? this.c70403 : "");
        setC70404(c703.equals("1") ? this.c70404 : "");
        setC70405(c703.equals("1") ? this.c70405 : "");
        setC70406(c703.equals("1") ? this.c70406 : "");
        setC70407(c703.equals("1") ? this.c70407 : "");
        setC70408(c703.equals("1") ? this.c70408 : "");
        setC70496(c703.equals("1") ? this.c70496 : "");
        notifyPropertyChanged(BR.c703);
    }

    @Bindable
    public String getC704() {
        return c704;
    }

    public void setC704(String c704) {
        this.c704 = c704;
        notifyPropertyChanged(BR.c704);
    }

    @Bindable
    public String getC70401() {
        return c70401;
    }

    public void setC70401(String c70401) {
        if (this.c70401.equals(c70401)) return; // for all checkboxes
        this.c70401 = c70401;
        notifyPropertyChanged(BR.c70401);
    }

    @Bindable
    public String getC70402() {
        return c70402;
    }

    public void setC70402(String c70402) {
        if (this.c70402.equals(c70402)) return; // for all checkboxes
        this.c70402 = c70402;
        notifyPropertyChanged(BR.c70402);
    }

    @Bindable
    public String getC70403() {
        return c70403;
    }

    public void setC70403(String c70403) {
        if (this.c70403.equals(c70403)) return; // for all checkboxes
        this.c70403 = c70403;
        notifyPropertyChanged(BR.c70403);
    }

    @Bindable
    public String getC70404() {
        return c70404;
    }

    public void setC70404(String c70404) {
        if (this.c70404.equals(c70404)) return; // for all checkboxes
        this.c70404 = c70404;
        notifyPropertyChanged(BR.c70404);
    }

    @Bindable
    public String getC70405() {
        return c70405;
    }

    public void setC70405(String c70405) {
        if (this.c70405.equals(c70405)) return; // for all checkboxes
        this.c70405 = c70405;
        notifyPropertyChanged(BR.c70405);
    }

    @Bindable
    public String getC70406() {
        return c70406;
    }

    public void setC70406(String c70406) {
        if (this.c70406.equals(c70406)) return; // for all checkboxes
        this.c70406 = c70406;
        notifyPropertyChanged(BR.c70406);
    }

    @Bindable
    public String getC70407() {
        return c70407;
    }

    public void setC70407(String c70407) {
        if (this.c70407.equals(c70407)) return; // for all checkboxes
        this.c70407 = c70407;
        notifyPropertyChanged(BR.c70407);
    }

    @Bindable
    public String getC70408() {
        return c70408;
    }

    public void setC70408(String c70408) {
        if (this.c70408.equals(c70408)) return; // for all checkboxes
        this.c70408 = c70408;
        notifyPropertyChanged(BR.c70408);
    }

    @Bindable
    public String getC70496() {
        return c70496;
    }

    public void setC70496(String c70496) {
        if (this.c70496.equals(c70496)) return; // for all checkboxes
        this.c70496 = c70496;
        setC70496x(c70496.equals("96") ? this.c70496x : "");
        notifyPropertyChanged(BR.c70496);
    }

    @Bindable
    public String getC70496x() {
        return c70496x;
    }

    public void setC70496x(String c70496x) {
        this.c70496x = c70496x;
        notifyPropertyChanged(BR.c70496x);
    }

    @Bindable
    public String getC705() {
        return c705;
    }

    public void setC705(String c705) {
        this.c705 = c705;
        notifyPropertyChanged(BR.c705);
    }

    @Bindable
    public String getC70501() {
        return c70501;
    }

    public void setC70501(String c70501) {
        if (this.c70501.equals(c70501)) return; // for all checkboxes
        this.c70501 = c70501;
        notifyPropertyChanged(BR.c70501);
    }

    @Bindable
    public String getC70502() {
        return c70502;
    }

    public void setC70502(String c70502) {
        if (this.c70502.equals(c70502)) return; // for all checkboxes
        this.c70502 = c70502;
        notifyPropertyChanged(BR.c70502);
    }

    @Bindable
    public String getC70503() {
        return c70503;
    }

    public void setC70503(String c70503) {
        if (this.c70503.equals(c70503)) return; // for all checkboxes
        this.c70503 = c70503;
        notifyPropertyChanged(BR.c70503);
    }

    @Bindable
    public String getC70504() {
        return c70504;
    }

    public void setC70504(String c70504) {
        if (this.c70504.equals(c70504)) return; // for all checkboxes
        this.c70504 = c70504;
        notifyPropertyChanged(BR.c70504);
    }

    @Bindable
    public String getC70505() {
        return c70505;
    }

    public void setC70505(String c70505) {
        if (this.c70505.equals(c70505)) return; // for all checkboxes
        this.c70505 = c70505;
        notifyPropertyChanged(BR.c70505);
    }

    @Bindable
    public String getC70506() {
        return c70506;
    }

    public void setC70506(String c70506) {
        if (this.c70506.equals(c70506)) return; // for all checkboxes
        this.c70506 = c70506;
        notifyPropertyChanged(BR.c70506);
    }

    @Bindable
    public String getC70507() {
        return c70507;
    }

    public void setC70507(String c70507) {
        if (this.c70507.equals(c70507)) return; // for all checkboxes
        this.c70507 = c70507;
        notifyPropertyChanged(BR.c70507);
    }

    @Bindable
    public String getC70508() {
        return c70508;
    }

    public void setC70508(String c70508) {
        if (this.c70508.equals(c70508)) return; // for all checkboxes
        this.c70508 = c70508;
        setC70501(c70508.equals("8") ? "" : this.c70501);
        setC70502(c70508.equals("8") ? "" : this.c70502);
        setC70503(c70508.equals("8") ? "" : this.c70503);
        setC70504(c70508.equals("8") ? "" : this.c70504);
        setC70505(c70508.equals("8") ? "" : this.c70505);
        setC70506(c70508.equals("8") ? "" : this.c70506);
        setC70507(c70508.equals("8") ? "" : this.c70507);
        setC70596(c70508.equals("8") ? "" : this.c70596);
        notifyPropertyChanged(BR.c70508);
    }

    @Bindable
    public String getC70596() {
        return c70596;
    }

    public void setC70596(String c70596) {
        if (this.c70596.equals(c70596)) return; // for all checkboxes
        this.c70596 = c70596;
        setC70596x(c70596.equals("96") ? this.c70596x : "");
        notifyPropertyChanged(BR.c70596);
    }

    @Bindable
    public String getC70596x() {
        return c70596x;
    }

    public void setC70596x(String c70596x) {
        this.c70596x = c70596x;
        notifyPropertyChanged(BR.c70596x);
    }

    @Bindable
    public String getC706() {
        return c706;
    }

    public void setC706(String c706) {
        this.c706 = c706;
        notifyPropertyChanged(BR.c706);
    }

    @Bindable
    public String getC601() {
        return c601;
    }

    public void setC601(String c601) {
        this.c601 = c601;
        notifyPropertyChanged(BR.c601);
    }

    @Bindable
    public String getC60101() {
        return c60101;
    }

    public void setC60101(String c60101) {
        if (this.c60101.equals(c60101)) return; // for all checkboxes
        this.c60101 = c60101;
        notifyPropertyChanged(BR.c60101);
    }

    @Bindable
    public String getC60102() {
        return c60102;
    }

    public void setC60102(String c60102) {
        if (this.c60102.equals(c60102)) return; // for all checkboxes
        this.c60102 = c60102;
        notifyPropertyChanged(BR.c60102);
    }

    @Bindable
    public String getC60103() {
        return c60103;
    }

    public void setC60103(String c60103) {
        if (this.c60103.equals(c60103)) return; // for all checkboxes
        this.c60103 = c60103;
        notifyPropertyChanged(BR.c60103);
    }

    @Bindable
    public String getC60104() {
        return c60104;
    }

    public void setC60104(String c60104) {
        if (this.c60104.equals(c60104)) return; // for all checkboxes
        this.c60104 = c60104;
        notifyPropertyChanged(BR.c60104);
    }

    @Bindable
    public String getC60105() {
        return c60105;
    }

    public void setC60105(String c60105) {
        if (this.c60105.equals(c60105)) return; // for all checkboxes
        this.c60105 = c60105;
        notifyPropertyChanged(BR.c60105);
    }

    @Bindable
    public String getC60106() {
        return c60106;
    }

    public void setC60106(String c60106) {
        if (this.c60106.equals(c60106)) return; // for all checkboxes
        this.c60106 = c60106;
        notifyPropertyChanged(BR.c60106);
    }

    @Bindable
    public String getC60107() {
        return c60107;
    }

    public void setC60107(String c60107) {
        if (this.c60107.equals(c60107)) return; // for all checkboxes
        this.c60107 = c60107;
        notifyPropertyChanged(BR.c60107);
    }

    @Bindable
    public String getC60108() {
        return c60108;
    }

    public void setC60108(String c60108) {
        if (this.c60108.equals(c60108)) return; // for all checkboxes
        this.c60108 = c60108;
        notifyPropertyChanged(BR.c60108);
    }

    @Bindable
    public String getC60109() {
        return c60109;
    }

    public void setC60109(String c60109) {
        if (this.c60109.equals(c60109)) return; // for all checkboxes
        this.c60109 = c60109;
        setC60101(c60109.equals("9") ? "" : this.c60101);
        setC60102(c60109.equals("9") ? "" : this.c60102);
        setC60103(c60109.equals("9") ? "" : this.c60103);
        setC60104(c60109.equals("9") ? "" : this.c60104);
        setC60105(c60109.equals("9") ? "" : this.c60105);
        setC60106(c60109.equals("9") ? "" : this.c60106);
        setC60107(c60109.equals("9") ? "" : this.c60107);
        setC60108(c60109.equals("9") ? "" : this.c60108);
        notifyPropertyChanged(BR.c60109);
    }

    @Bindable
    public String getC602() {
        return c602;
    }

    public void setC602(String c602) {
        this.c602 = c602;
        setC60296x(c602.equals("96") ? this.c60296x : "");
        notifyPropertyChanged(BR.c602);
    }

    @Bindable
    public String getC60296x() {
        return c60296x;
    }

    public void setC60296x(String c60296x) {
        this.c60296x = c60296x;
        notifyPropertyChanged(BR.c60296x);
    }

    @Bindable
    public String getC603() {
        return c603;
    }

    public void setC603(String c603) {
        this.c603 = c603;
        setC604(c603.equals("5") ? this.c604 : "");
        setC60396x(c603.equals("96") ? this.c60396x : "");
        notifyPropertyChanged(BR.c603);
    }

    @Bindable
    public String getC60396x() {
        return c60396x;
    }

    public void setC60396x(String c60396x) {
        this.c60396x = c60396x;
        notifyPropertyChanged(BR.c60396x);
    }

    @Bindable
    public String getC604() {
        return c604;
    }

    public void setC604(String c604) {
        this.c604 = c604;
        notifyPropertyChanged(BR.c604);
    }

    @Bindable
    public String getC60496x() {
        return c60496x;
    }

    public void setC60496x(String c60496x) {
        this.c60496x = c60496x;
        notifyPropertyChanged(BR.c60496x);
    }

    @Bindable
    public String getC605() {
        return c605;
    }

    public void setC605(String c605) {
        this.c605 = c605;
        setC606a(c605.equals("1") ? this.c606a : "");
        setC606b(c605.equals("1") ? this.c606b : "");
        setC606c(c605.equals("1") ? this.c606c : "");
        setC606d(c605.equals("1") ? this.c606d : "");
        setC606e(c605.equals("1") ? this.c606e : "");
        setC60696(c605.equals("1") ? this.c60696 : "");
        notifyPropertyChanged(BR.c605);
    }

    @Bindable
    public String getC606a() {
        return c606a;
    }

    public void setC606a(String c606a) {
        this.c606a = c606a;
        notifyPropertyChanged(BR.c606a);
    }

    @Bindable
    public String getC606b() {
        return c606b;
    }

    public void setC606b(String c606b) {
        this.c606b = c606b;
        notifyPropertyChanged(BR.c606b);
    }

    @Bindable
    public String getC606c() {
        return c606c;
    }

    public void setC606c(String c606c) {
        this.c606c = c606c;
        notifyPropertyChanged(BR.c606c);
    }

    @Bindable
    public String getC606d() {
        return c606d;
    }

    public void setC606d(String c606d) {
        this.c606d = c606d;
        notifyPropertyChanged(BR.c606d);
    }

    @Bindable
    public String getC606e() {
        return c606e;
    }

    public void setC606e(String c606e) {
        this.c606e = c606e;
        notifyPropertyChanged(BR.c606e);
    }

    @Bindable
    public String getC60696() {
        return c60696;
    }

    public void setC60696(String c60696) {
        this.c60696 = c60696;
        notifyPropertyChanged(BR.c60696);
    }

    @Bindable
    public String getC60701() {
        return c60701;
    }

    public void setC60701(String c60701) {
        this.c60701 = c60701;
        notifyPropertyChanged(BR.c60701);
    }

    @Bindable
    public String getC608() {
        return c608;
    }

    public void setC608(String c608) {
        this.c608 = c608;
        notifyPropertyChanged(BR.c608);
    }

    @Bindable
    public String getD1001() {
        return d1001;
    }

    public void setD1001(String d1001) {
        this.d1001 = d1001;
        notifyPropertyChanged(BR.d1001);
    }

    @Bindable
    public String getD101() {
        return d101;
    }

    public void setD101(String d101) {
        this.d101 = d101;
        notifyPropertyChanged(BR.d101);
    }

    @Bindable
    public String getD102() {
        return d102;
    }

    public void setD102(String d102) {
        this.d102 = d102;
        notifyPropertyChanged(BR.d102);
    }

    @Bindable
    public String getD1102() {
        return d1102;
    }

    public void setD1102(String d1102) {
        this.d1102 = d1102;
        notifyPropertyChanged(BR.d1102);
    }

    @Bindable
    public String getD103() {
        return d103;
    }

    public void setD103(String d103) {
        this.d103 = d103;
        notifyPropertyChanged(BR.d103);
    }

    @Bindable
    public String getD104() {
        return d104;
    }

    public void setD104(String d104) {
        this.d104 = d104;
        notifyPropertyChanged(BR.d104);
    }

    @Bindable
    public String getD105() {
        return d105;
    }

    public void setD105(String d105) {
        this.d105 = d105;
        notifyPropertyChanged(BR.d105);
    }

    @Bindable
    public String getD106() {
        return d106;
    }

    public void setD106(String d106) {
        this.d106 = d106;
        notifyPropertyChanged(BR.d106);
    }

    @Bindable
    public String getD1203() {
        return d1203;
    }

    public void setD1203(String d1203) {
        this.d1203 = d1203;
        notifyPropertyChanged(BR.d1203);
    }

    @Bindable
    public String getD107() {
        return d107;
    }

    public void setD107(String d107) {
        this.d107 = d107;
        notifyPropertyChanged(BR.d107);
    }

    @Bindable
    public String getD108() {
        return d108;
    }

    public void setD108(String d108) {
        this.d108 = d108;
        setD114(d108.equals("1") ? this.d114 : "");
        setD115(d108.equals("1") ? this.d115 : "");
        setD116(d108.equals("1") ? this.d116 : "");
        setD117(d108.equals("1") ? this.d117 : "");
        setD118(d108.equals("1") ? this.d118 : "");
        setD119(d108.equals("1") ? this.d119 : "");
        setD120(d108.equals("1") ? this.d120 : "");
        setD121(d108.equals("1") ? this.d121 : "");
        setD122(d108.equals("1") ? this.d122 : "");
        setD123(d108.equals("1") ? this.d123 : "");
        setD124(d108.equals("1") ? this.d124 : "");
        setD125(d108.equals("1") ? this.d125 : "");
        setD126(d108.equals("1") ? this.d126 : "");
        notifyPropertyChanged(BR.d108);
    }

    @Bindable
    public String getD1304() {
        return d1304;
    }

    public void setD1304(String d1304) {
        this.d1304 = d1304;
        notifyPropertyChanged(BR.d1304);
    }

    @Bindable
    public String getD1304ax() {
        return d1304ax;
    }

    public void setD1304ax(String d1304ax) {
        this.d1304ax = d1304ax;
        notifyPropertyChanged(BR.d1304ax);
    }

    @Bindable
    public String getD109() {
        return d109;
    }

    public void setD109(String d109) {
        this.d109 = d109;
        notifyPropertyChanged(BR.d109);
    }

    @Bindable
    public String getD1title2() {
        return d1title2;
    }

    public void setD1title2(String d1title2) {
        this.d1title2 = d1title2;
        notifyPropertyChanged(BR.d1title2);
    }

    @Bindable
    public String getD110() {
        return d110;
    }

    public void setD110(String d110) {
        this.d110 = d110;
        notifyPropertyChanged(BR.d110);
    }

    @Bindable
    public String getD111() {
        return d111;
    }

    public void setD111(String d111) {
        this.d111 = d111;
        notifyPropertyChanged(BR.d111);
    }

    @Bindable
    public String getD112() {
        return d112;
    }

    public void setD112(String d112) {
        this.d112 = d112;
        setD113(d112.equals("2") ? "" : this.d113);
        notifyPropertyChanged(BR.d112);
    }

    @Bindable
    public String getD113() {
        return d113;
    }

    public void setD113(String d113) {
        this.d113 = d113;
        notifyPropertyChanged(BR.d113);
    }

    @Bindable
    public String getD11301x() {
        return d11301x;
    }

    public void setD11301x(String d11301x) {
        this.d11301x = d11301x;
        notifyPropertyChanged(BR.d11301x);
    }

    @Bindable
    public String getD114() {
        return d114;
    }

    public void setD114(String d114) {
        this.d114 = d114;
        setD115(d108.equals("1") ? this.d115 : "");
        setD116(d108.equals("1") ? this.d116 : "");
        setD117(d114.equals("1") ? this.d117 : "");
        setD118(d114.equals("1") ? this.d118 : "");
        setD119(d114.equals("1") ? this.d119 : "");
        setD120(d114.equals("1") ? this.d120 : "");
        setD121(d114.equals("1") ? this.d121 : "");
        setD122(d114.equals("1") ? this.d122 : "");
        setD123(d114.equals("1") ? this.d123 : "");
        setD124(d114.equals("1") ? this.d124 : "");
        setD125(d114.equals("1") ? this.d125 : "");
        setD126(d114.equals("1") ? this.d126 : "");
        notifyPropertyChanged(BR.d114);
    }

    @Bindable
    public String getD115() {
        return d115;
    }

    public void setD115(String d115) {
        this.d115 = d115;
        notifyPropertyChanged(BR.d115);
    }

    @Bindable
    public String getD116() {
        return d116;
    }

    public void setD116(String d116) {
        this.d116 = d116;
        notifyPropertyChanged(BR.d116);
    }

    @Bindable
    public String getD117() {
        return d117;
    }

    public void setD117(String d117) {
        this.d117 = d117;
        setD118(d117.equals("1") ? this.d118 : "");
        notifyPropertyChanged(BR.d117);
    }

    @Bindable
    public String getD118() {
        return d118;
    }

    public void setD118(String d118) {
        this.d118 = d118;
        notifyPropertyChanged(BR.d118);
    }

    @Bindable
    public String getD119() {
        return d119;
    }

    public void setD119(String d119) {
        this.d119 = d119;
        notifyPropertyChanged(BR.d119);
    }

    @Bindable
    public String getD120() {
        return d120;
    }

    public void setD120(String d120) {
        this.d120 = d120;
        notifyPropertyChanged(BR.d120);
    }

    @Bindable
    public String getD121() {
        return d121;
    }

    public void setD121(String d121) {
        this.d121 = d121;
        setD122(d121.equals("1") ? this.d122 : "");
        notifyPropertyChanged(BR.d121);
    }

    @Bindable
    public String getD122() {
        return d122;
    }

    public void setD122(String d122) {
        this.d122 = d122;
        notifyPropertyChanged(BR.d122);
    }

    @Bindable
    public String getD123() {
        return d123;
    }

    public void setD123(String d123) {
        this.d123 = d123;
        notifyPropertyChanged(BR.d123);
    }

    @Bindable
    public String getD124() {
        return d124;
    }

    public void setD124(String d124) {
        this.d124 = d124;
        notifyPropertyChanged(BR.d124);
    }

    @Bindable
    public String getD125() {
        return d125;
    }

    public void setD125(String d125) {
        this.d125 = d125;
        setD126(d125.equals("1") ? this.d126 : "");
        notifyPropertyChanged(BR.d125);
    }

    @Bindable
    public String getD126() {
        return d126;
    }

    public void setD126(String d126) {
        this.d126 = d126;
        notifyPropertyChanged(BR.d126);
    }

    @Bindable
    public String getD201() {
        return d201;
    }

    public void setD201(String d201) {
        this.d201 = d201;
        notifyPropertyChanged(BR.d201);
    }

    @Bindable
    public String getD202() {
        return d202;
    }

    public void setD202(String d202) {
        this.d202 = d202;
        setD204(d202.equals("1") ? this.d204 : "");
        notifyPropertyChanged(BR.d202);
    }

    @Bindable
    public String getD203() {
        return d203;
    }

    public void setD203(String d203) {
        this.d203 = d203;
        notifyPropertyChanged(BR.d203);
    }

    @Bindable
    public String getD204() {
        return d204;
    }

    public void setD204(String d204) {
        this.d204 = d204;
        notifyPropertyChanged(BR.d204);
    }

    public Adolescent Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_INDEXED));
        this.name = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_NAME));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_VILLAGE_CODE));
        this.childID = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_CHILD_ID));
        this.childSno = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_CHILD_SNO));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SYNC_DATE));

        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC2)));
        sC3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC3)));
        sC4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC4)));
        sC5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC5)));
        sC6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC6)));
        sC7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SC7)));
        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SD2)));

        return this;
    }

    /*public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sCHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c101 = json.getString("c101");
            this.c102 = json.getString("c102");
            this.c103 = json.getString("c103");
            this.c104a = json.getString("c104a");
            this.c104b = json.getString("c104b");
            this.c104c = json.getString("c104c");
            this.c105 = json.getString("c105");
            this.c106 = json.getString("c106");
            this.c107 = json.getString("c107");
            this.c108 = json.getString("c108");
            this.c109 = json.getString("c109");
            this.c110 = json.getString("c110");
            this.c111 = json.getString("c111");
            this.c112 = json.getString("c112");
            this.c113 = json.getString("c113");
            this.c114 = json.getString("c114");
            this.c201 = json.getString("c201");
            this.c202 = json.getString("c202");
            this.c202a = json.getString("c202a");
            this.c202b = json.getString("c202b");
            this.c202c = json.getString("c202c");
            this.c202d = json.getString("c202d");
            this.c202e = json.getString("c202e");
            this.c202f = json.getString("c202f");
            this.c202g = json.getString("c202g");
            this.c202h = json.getString("c202h");
            this.c20296 = json.getString("c20296");
            this.c20296x = json.getString("c20296x");
            this.c203 = json.getString("c203");
            this.c204 = json.getString("c204");
            this.c20496x = json.getString("c20496x");
            this.c205a = json.getString("c205a");
            this.c20598 = json.getString("c20598");
            this.c206a = json.getString("c206a");
            this.c20698 = json.getString("c20698");
            this.c207 = json.getString("c207");
            this.c208 = json.getString("c208");
            this.c209 = json.getString("c209");
            this.c20996x = json.getString("c20996x");
            this.c210 = json.getString("c210");
            this.c21096x = json.getString("c21096x");
            this.c211 = json.getString("c211");
            this.c212 = json.getString("c212");
            this.c213 = json.getString("c213");
            this.c214 = json.getString("c214");
            this.c215 = json.getString("c215");
            this.ca301 = json.getString("ca301");
            this.ca302 = json.getString("ca302");
            this.ca303 = json.getString("ca303");
            this.ca304 = json.getString("ca304");
            this.ca305 = json.getString("ca305");
            this.ca306 = json.getString("ca306");
            this.ca307 = json.getString("ca307");
            this.ca309 = json.getString("ca309");
            this.ca310 = json.getString("ca310");
            this.ca308 = json.getString("ca308");
            this.cb309 = json.getString("cb309");
            this.cb310 = json.getString("cb310");
            this.cb311 = json.getString("cb311");
            this.cb312 = json.getString("cb312");
            this.ca402 = json.getString("ca402");
            this.ca403 = json.getString("ca403");
            this.ca404 = json.getString("ca404");
            this.ca405 = json.getString("ca405");
            this.ca406 = json.getString("ca406");
            this.ca407 = json.getString("ca407");
            this.cb401 = json.getString("cb401");
            this.cb402 = json.getString("cb402");
            this.cb403 = json.getString("cb403");
            this.cb404 = json.getString("cb404");
            this.c501a = json.getString("c501a");
            this.c501b = json.getString("c501b");
            this.c501c = json.getString("c501c");
            this.c501d = json.getString("c501d");
            this.c501e = json.getString("c501e");
            this.c501f = json.getString("c501f");
            this.c501g = json.getString("c501g");
            this.c501h = json.getString("c501h");
            this.c501i = json.getString("c501i");
            this.c501j = json.getString("c501j");
            this.c502 = json.getString("c502");
            this.c503 = json.getString("c503");
            this.c50301 = json.getString("c50301");
            this.c50302 = json.getString("c50302");
            this.c50303 = json.getString("c50303");
            this.c50304 = json.getString("c50304");
            this.c50305 = json.getString("c50305");
            this.c50306 = json.getString("c50306");
            this.c50307 = json.getString("c50307");
            this.c50308 = json.getString("c50308");
            this.c50396 = json.getString("c50396");
            this.c50396x = json.getString("c50396x");
            this.c504 = json.getString("c504");
            this.c50401 = json.getString("c50401");
            this.c50402 = json.getString("c50402");
            this.c50403 = json.getString("c50403");
            this.c50404 = json.getString("c50404");
            this.c50405 = json.getString("c50405");
            this.c50406 = json.getString("c50406");
            this.c50407 = json.getString("c50407");
            this.c50496 = json.getString("c50496");
            this.c50496x = json.getString("c50496x");
            this.c505 = json.getString("c505");
            this.c506 = json.getString("c506");
            this.c50601 = json.getString("c50601");
            this.c50602 = json.getString("c50602");
            this.c50603 = json.getString("c50603");
            this.c50604 = json.getString("c50604");
            this.c50605 = json.getString("c50605");
            this.c50606 = json.getString("c50606");
            this.c50607 = json.getString("c50607");
            this.c50608 = json.getString("c50608");
            this.c50609 = json.getString("c50609");
            this.c50610 = json.getString("c50610");
            this.c50611 = json.getString("c50611");
            this.c50696 = json.getString("c50696");
            this.c50696x = json.getString("c50696x");
            this.c507 = json.getString("c507");
            this.c508 = json.getString("c508");
            this.c509 = json.getString("c509");
            this.c510 = json.getString("c510");
            this.c51096x = json.getString("c51096x");
            this.c511a = json.getString("c511a");
            this.c511b = json.getString("c511b");
            this.c511c = json.getString("c511c");
            this.c511d = json.getString("c511d");
            this.c511e = json.getString("c511e");
            this.c511f = json.getString("c511f");
            this.c511g = json.getString("c511g");
            this.c511h = json.getString("c511h");
            this.c511i = json.getString("c511i");
            this.c511j = json.getString("c511j");
            this.c701 = json.getString("c701");
            this.c702 = json.getString("c702");
            this.c70201 = json.getString("c70201");
            this.c70202 = json.getString("c70202");
            this.c70203 = json.getString("c70203");
            this.c70204 = json.getString("c70204");
            this.c70205 = json.getString("c70205");
            this.c70206 = json.getString("c70206");
            this.c70207 = json.getString("c70207");
            this.c70208 = json.getString("c70208");
            this.c70296 = json.getString("c70296");
            this.c70296x = json.getString("c70296x");
            this.c703 = json.getString("c703");
            this.c704 = json.getString("c704");
            this.c70401 = json.getString("c70401");
            this.c70402 = json.getString("c70402");
            this.c70403 = json.getString("c70403");
            this.c70404 = json.getString("c70404");
            this.c70405 = json.getString("c70405");
            this.c70406 = json.getString("c70406");
            this.c70407 = json.getString("c70407");
            this.c70408 = json.getString("c70408");
            this.c70496 = json.getString("c70496");
            this.c70496x = json.getString("c70496x");
            this.c705 = json.getString("c705");
            this.c70501 = json.getString("c70501");
            this.c70502 = json.getString("c70502");
            this.c70503 = json.getString("c70503");
            this.c70504 = json.getString("c70504");
            this.c70505 = json.getString("c70505");
            this.c70506 = json.getString("c70506");
            this.c70507 = json.getString("c70507");
            this.c70508 = json.getString("c70508");
            this.c70596 = json.getString("c70596");
            this.c70596x = json.getString("c70596x");
            this.c706 = json.getString("c706");
            this.c601 = json.getString("c601");
            this.c60101 = json.getString("c60101");
            this.c60102 = json.getString("c60102");
            this.c60103 = json.getString("c60103");
            this.c60104 = json.getString("c60104");
            this.c60105 = json.getString("c60105");
            this.c60106 = json.getString("c60106");
            this.c60107 = json.getString("c60107");
            this.c60108 = json.getString("c60108");
            this.c60109 = json.getString("c60109");
            this.c602 = json.getString("c602");
            this.c60296x = json.getString("c60296x");
            this.c603 = json.getString("c603");
            this.c60396x = json.getString("c60396x");
            this.c604 = json.getString("c604");
            this.c60496x = json.getString("c60496x");
            this.c605 = json.getString("c605");
            this.c606a = json.getString("c606a");
            this.c606b = json.getString("c606b");
            this.c606c = json.getString("c606c");
            this.c606d = json.getString("c606d");
            this.c606e = json.getString("c606e");
            this.c60696 = json.getString("c60696");
            this.c60701 = json.getString("c60701");
            this.c608 = json.getString("c608");
        }
    }

    public void sD1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d1001 = json.getString("d1001");
            this.d101 = json.getString("d101");
            this.d102 = json.getString("d102");
            this.d1102 = json.getString("d1102");
            this.d103 = json.getString("d103");
            this.d104 = json.getString("d104");
            this.d105 = json.getString("d105");
            this.d106 = json.getString("d106");
            this.d1203 = json.getString("d1203");
            this.d107 = json.getString("d107");
            this.d108 = json.getString("d108");
            this.d1304 = json.getString("d1304");
            this.d1304ax = json.getString("d1304ax");
            this.d109 = json.getString("d109");
            this.d1title2 = json.getString("d1title2");
            this.d110 = json.getString("d110");
            this.d111 = json.getString("d111");
            this.d112 = json.getString("d112");
            this.d113 = json.getString("d113");
            this.d11301x = json.getString("d11301x");
            this.d114 = json.getString("d114");
            this.d115 = json.getString("d115");
            this.d116 = json.getString("d116");
            this.d117 = json.getString("d117");
            this.d118 = json.getString("d118");
            this.d119 = json.getString("d119");
            this.d120 = json.getString("d120");
            this.d121 = json.getString("d121");
            this.d122 = json.getString("d122");
            this.d123 = json.getString("d123");
            this.d124 = json.getString("d124");
            this.d125 = json.getString("d125");
            this.d126 = json.getString("d126");
            this.d201 = json.getString("d201");
            this.d202 = json.getString("d202");
            this.d203 = json.getString("d203");
            this.d204 = json.getString("d204");
        }
    }*/

    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c101 = json.getString("c101");
            this.c102 = json.getString("c102");
            this.c103 = json.getString("c103");
            this.c104a = json.getString("c104a");
            this.c104b = json.getString("c104b");
            this.c104c = json.getString("c104c");
            this.c105 = json.getString("c105");
            this.c106 = json.getString("c106");
            this.c107 = json.getString("c107");
            this.c108 = json.getString("c108");
            this.c109 = json.getString("c109");
            this.c110 = json.getString("c110");
            this.c111 = json.getString("c111");
            this.c112 = json.getString("c112");
            this.c113 = json.getString("c113");
            this.c114 = json.getString("c114");
        }
    }

    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c201 = json.getString("c201");
            this.c202 = json.getString("c202");
            this.c202a = json.getString("c202a");
            this.c202b = json.getString("c202b");
            this.c202c = json.getString("c202c");
            this.c202d = json.getString("c202d");
            this.c202e = json.getString("c202e");
            this.c202f = json.getString("c202f");
            this.c202g = json.getString("c202g");
            this.c202h = json.getString("c202h");
            this.c20296 = json.getString("c20296");
            this.c20296x = json.getString("c20296x");
            this.c203 = json.getString("c203");
            this.c204 = json.getString("c204");
            this.c20496x = json.getString("c20496x");
            this.c205a = json.getString("c205a");
            this.c20598 = json.getString("c20598");
            this.c206a = json.getString("c206a");
            this.c20698 = json.getString("c20698");
            this.c207 = json.getString("c207");
            this.c208 = json.getString("c208");
            this.c209 = json.getString("c209");
            this.c20996x = json.getString("c20996x");
            this.c210 = json.getString("c210");
            this.c21096x = json.getString("c21096x");
            this.c211 = json.getString("c211");
            this.c212 = json.getString("c212");
            this.c213 = json.getString("c213");
            this.c214 = json.getString("c214");
            this.c215 = json.getString("c215");
        }
    }

    public void sC3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ca301 = json.getString("ca301");
            this.ca302 = json.getString("ca302");
            this.ca303 = json.getString("ca303");
            this.ca304 = json.getString("ca304");
            this.ca305 = json.getString("ca305");
            this.ca306 = json.getString("ca306");
            this.ca307 = json.getString("ca307");
            this.ca309 = json.getString("ca309");
            this.ca310 = json.getString("ca310");
            this.ca308 = json.getString("ca308");
            this.cb309 = json.getString("cb309");
            this.cb310 = json.getString("cb310");
            this.cb311 = json.getString("cb311");
            this.cb312 = json.getString("cb312");
        }
    }

    public void sC4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ca402 = json.getString("ca402");
            this.ca403 = json.getString("ca403");
            this.ca404 = json.getString("ca404");
            this.ca405 = json.getString("ca405");
            this.ca406 = json.getString("ca406");
            this.ca407 = json.getString("ca407");
            this.cb401 = json.getString("cb401");
            this.cb402 = json.getString("cb402");
            this.cb403 = json.getString("cb403");
            this.cb404 = json.getString("cb404");
        }
    }

    public void sC5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.c501a = json.getString("c501a");
            this.c501b = json.getString("c501b");
            this.c501c = json.getString("c501c");
            this.c501d = json.getString("c501d");
            this.c501e = json.getString("c501e");
            this.c501f = json.getString("c501f");
            this.c501g = json.getString("c501g");
            this.c501h = json.getString("c501h");
            this.c501i = json.getString("c501i");
            this.c501j = json.getString("c501j");
            this.c502 = json.getString("c502");
            this.c503 = json.getString("c503");
            this.c50301 = json.getString("c50301");
            this.c50302 = json.getString("c50302");
            this.c50303 = json.getString("c50303");
            this.c50304 = json.getString("c50304");
            this.c50305 = json.getString("c50305");
            this.c50306 = json.getString("c50306");
            this.c50307 = json.getString("c50307");
            this.c50308 = json.getString("c50308");
            this.c50396 = json.getString("c50396");
            this.c50396x = json.getString("c50396x");
            this.c504 = json.getString("c504");
            this.c50401 = json.getString("c50401");
            this.c50402 = json.getString("c50402");
            this.c50403 = json.getString("c50403");
            this.c50404 = json.getString("c50404");
            this.c50405 = json.getString("c50405");
            this.c50406 = json.getString("c50406");
            this.c50407 = json.getString("c50407");
            this.c50496 = json.getString("c50496");
            this.c50496x = json.getString("c50496x");
            this.c505 = json.getString("c505");
            this.c506 = json.getString("c506");
            this.c50601 = json.getString("c50601");
            this.c50602 = json.getString("c50602");
            this.c50603 = json.getString("c50603");
            this.c50604 = json.getString("c50604");
            this.c50605 = json.getString("c50605");
            this.c50606 = json.getString("c50606");
            this.c50607 = json.getString("c50607");
            this.c50608 = json.getString("c50608");
            this.c50609 = json.getString("c50609");
            this.c50610 = json.getString("c50610");
            this.c50611 = json.getString("c50611");
            this.c50696 = json.getString("c50696");
            this.c50696x = json.getString("c50696x");
            this.c507 = json.getString("c507");
            this.c508 = json.getString("c508");
            this.c509 = json.getString("c509");
            this.c510 = json.getString("c510");
            this.c51096x = json.getString("c51096x");
            this.c511a = json.getString("c511a");
            this.c511b = json.getString("c511b");
            this.c511c = json.getString("c511c");
            this.c511d = json.getString("c511d");
            this.c511e = json.getString("c511e");
            this.c511f = json.getString("c511f");
            this.c511g = json.getString("c511g");
            this.c511h = json.getString("c511h");
            this.c511i = json.getString("c511i");
            this.c511j = json.getString("c511j");
        }
    }

    public void sC6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c601 = json.getString("c601");
            this.c60101 = json.getString("c60101");
            this.c60102 = json.getString("c60102");
            this.c60103 = json.getString("c60103");
            this.c60104 = json.getString("c60104");
            this.c60105 = json.getString("c60105");
            this.c60106 = json.getString("c60106");
            this.c60107 = json.getString("c60107");
            this.c60108 = json.getString("c60108");
            this.c60109 = json.getString("c60109");
            this.c602 = json.getString("c602");
            this.c60296x = json.getString("c60296x");
            this.c603 = json.getString("c603");
            this.c60396x = json.getString("c60396x");
            this.c604 = json.getString("c604");
            this.c60496x = json.getString("c60496x");
            this.c605 = json.getString("c605");
            this.c606a = json.getString("c606a");
            this.c606b = json.getString("c606b");
            this.c606c = json.getString("c606c");
            this.c606d = json.getString("c606d");
            this.c606e = json.getString("c606e");
            this.c60696 = json.getString("c60696");
            this.c60701 = json.getString("c60701");
            this.c608 = json.getString("c608");
        }
    }

    public void sC7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c701 = json.getString("c701");
            this.c702 = json.getString("c702");
            this.c70201 = json.getString("c70201");
            this.c70202 = json.getString("c70202");
            this.c70203 = json.getString("c70203");
            this.c70204 = json.getString("c70204");
            this.c70205 = json.getString("c70205");
            this.c70206 = json.getString("c70206");
            this.c70207 = json.getString("c70207");
            this.c70208 = json.getString("c70208");
            this.c70296 = json.getString("c70296");
            this.c70296x = json.getString("c70296x");
            this.c703 = json.getString("c703");
            this.c704 = json.getString("c704");
            this.c70401 = json.getString("c70401");
            this.c70402 = json.getString("c70402");
            this.c70403 = json.getString("c70403");
            this.c70404 = json.getString("c70404");
            this.c70405 = json.getString("c70405");
            this.c70406 = json.getString("c70406");
            this.c70407 = json.getString("c70407");
            this.c70408 = json.getString("c70408");
            this.c70496 = json.getString("c70496");
            this.c70496x = json.getString("c70496x");
            this.c705 = json.getString("c705");
            this.c70501 = json.getString("c70501");
            this.c70502 = json.getString("c70502");
            this.c70503 = json.getString("c70503");
            this.c70504 = json.getString("c70504");
            this.c70505 = json.getString("c70505");
            this.c70506 = json.getString("c70506");
            this.c70507 = json.getString("c70507");
            this.c70508 = json.getString("c70508");
            this.c70596 = json.getString("c70596");
            this.c70596x = json.getString("c70596x");
            this.c706 = json.getString("c706");
        }
    }

    public void sD1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d1001 = json.getString("d1001");
            this.d101 = json.getString("d101");
            this.d102 = json.getString("d102");
            this.d1102 = json.getString("d1102");
            this.d103 = json.getString("d103");
            this.d104 = json.getString("d104");
            this.d105 = json.getString("d105");
            this.d106 = json.getString("d106");
            this.d1203 = json.getString("d1203");
            this.d107 = json.getString("d107");
            this.d108 = json.getString("d108");
            this.d1304 = json.getString("d1304");
            this.d1304ax = json.getString("d1304ax");
            this.d109 = json.getString("d109");
            this.d1title2 = json.getString("d1title2");
            this.d110 = json.getString("d110");
            this.d111 = json.getString("d111");
            this.d112 = json.getString("d112");
            this.d113 = json.getString("d113");
            this.d11301x = json.getString("d11301x");
            this.d114 = json.getString("d114");
            this.d115 = json.getString("d115");
            this.d116 = json.getString("d116");
            this.d117 = json.getString("d117");
            this.d118 = json.getString("d118");
            this.d119 = json.getString("d119");
            this.d120 = json.getString("d120");
            this.d121 = json.getString("d121");
            this.d122 = json.getString("d122");
            this.d123 = json.getString("d123");
            this.d124 = json.getString("d124");
            this.d125 = json.getString("d125");
            this.d126 = json.getString("d126");
        }
    }

    public void sD2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d201 = json.getString("d201");
            this.d202 = json.getString("d202");
            this.d203 = json.getString("d203");
            this.d204 = json.getString("d204");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(AdolescentTable.COLUMN_ID, this.id);
        json.put(AdolescentTable.COLUMN_UID, this.uid);
        json.put(AdolescentTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(AdolescentTable.COLUMN_CHILD_ID, this.childID);
        json.put(AdolescentTable.COLUMN_CHILD_SNO, this.childSno);
        json.put(AdolescentTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(AdolescentTable.COLUMN_UUID, this.uuid);
        json.put(AdolescentTable.COLUMN_FMUID, this.fmuid);
        json.put(AdolescentTable.COLUMN_MUID, this.muid);
        json.put(AdolescentTable.COLUMN_INDEXED, this.indexed);
        json.put(AdolescentTable.COLUMN_NAME, this.name);
        json.put(AdolescentTable.COLUMN_SNO, this.sno);
        json.put(AdolescentTable.COLUMN_USERNAME, this.userName);
        json.put(AdolescentTable.COLUMN_SYSDATE, this.sysDate);
        json.put(AdolescentTable.COLUMN_DEVICEID, this.deviceId);
        json.put(AdolescentTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(AdolescentTable.COLUMN_ISTATUS, this.iStatus);
        json.put(AdolescentTable.COLUMN_SYNCED, this.synced);
        json.put(AdolescentTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(AdolescentTable.COLUMN_APPVERSION, this.appver);
        json.put(AdolescentTable.COLUMN_SC1, new JSONObject(sC1toString()));
        json.put(AdolescentTable.COLUMN_SC2, new JSONObject(sC2toString()));
        json.put(AdolescentTable.COLUMN_SC3, new JSONObject(sC3toString()));
        json.put(AdolescentTable.COLUMN_SC4, new JSONObject(sC4toString()));
        json.put(AdolescentTable.COLUMN_SC5, new JSONObject(sC5toString()));
        json.put(AdolescentTable.COLUMN_SC6, new JSONObject(sC6toString()));
        json.put(AdolescentTable.COLUMN_SC7, new JSONObject(sC7toString()));
        json.put(AdolescentTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(AdolescentTable.COLUMN_SD2, new JSONObject(sD2toString()));

        return json;
    }

    /*public String sC1toString() throws JSONException {
        Log.d(TAG, "sCtoString: ");
        JSONObject json = new JSONObject();
        json.put("c101", c101)
                .put("c102", c102)
                .put("c103", c103)
                .put("c104a", c104a)
                .put("c104b", c104b)
                .put("c104c", c104c)
                .put("c105", c105)
                .put("c106", c106)
                .put("c107", c107)
                .put("c108", c108)
                .put("c109", c109)
                .put("c110", c110)
                .put("c111", c111)
                .put("c112", c112)
                .put("c113", c113)
                .put("c114", c114)
                .put("c201", c201)
                .put("c202", c202)
                .put("c202a", c202a)
                .put("c202b", c202b)
                .put("c202c", c202c)
                .put("c202d", c202d)
                .put("c202e", c202e)
                .put("c202f", c202f)
                .put("c202g", c202g)
                .put("c202h", c202h)
                .put("c20296", c20296)
                .put("c20296x", c20296x)
                .put("c203", c203)
                .put("c204", c204)
                .put("c20496x", c20496x)
                .put("c205a", c205a)
                .put("c20598", c20598)
                .put("c206a", c206a)
                .put("c20698", c20698)
                .put("c207", c207)
                .put("c208", c208)
                .put("c209", c209)
                .put("c20996x", c20996x)
                .put("c210", c210)
                .put("c21096x", c21096x)
                .put("c211", c211)
                .put("c212", c212)
                .put("c213", c213)
                .put("c214", c214)
                .put("c215", c215)
                .put("ca301", ca301)
                .put("ca302", ca302)
                .put("ca303", ca303)
                .put("ca304", ca304)
                .put("ca305", ca305)
                .put("ca306", ca306)
                .put("ca307", ca307)
                .put("ca309", ca309)
                .put("ca310", ca310)
                .put("ca308", ca308)
                .put("cb309", cb309)
                .put("cb310", cb310)
                .put("cb311", cb311)
                .put("cb312", cb312)
                .put("ca402", ca402)
                .put("ca403", ca403)
                .put("ca404", ca404)
                .put("ca405", ca405)
                .put("ca406", ca406)
                .put("ca407", ca407)
                .put("cb401", cb401)
                .put("cb402", cb402)
                .put("cb403", cb403)
                .put("cb404", cb404)
                .put("c501a", c501a)
                .put("c501b", c501b)
                .put("c501c", c501c)
                .put("c501d", c501d)
                .put("c501e", c501e)
                .put("c501f", c501f)
                .put("c501g", c501g)
                .put("c501h", c501h)
                .put("c501i", c501i)
                .put("c501j", c501j)
                .put("c502", c502)
                .put("c503", c503)
                .put("c50301", c50301)
                .put("c50302", c50302)
                .put("c50303", c50303)
                .put("c50304", c50304)
                .put("c50305", c50305)
                .put("c50306", c50306)
                .put("c50307", c50307)
                .put("c50308", c50308)
                .put("c50396", c50396)
                .put("c50396x", c50396x)
                .put("c504", c504)
                .put("c50401", c50401)
                .put("c50402", c50402)
                .put("c50403", c50403)
                .put("c50404", c50404)
                .put("c50405", c50405)
                .put("c50406", c50406)
                .put("c50407", c50407)
                .put("c50496", c50496)
                .put("c50496x", c50496x)
                .put("c505", c505)
                .put("c506", c506)
                .put("c50601", c50601)
                .put("c50602", c50602)
                .put("c50603", c50603)
                .put("c50604", c50604)
                .put("c50605", c50605)
                .put("c50606", c50606)
                .put("c50607", c50607)
                .put("c50608", c50608)
                .put("c50609", c50609)
                .put("c50610", c50610)
                .put("c50611", c50611)
                .put("c50696", c50696)
                .put("c50696x", c50696x)
                .put("c507", c507)
                .put("c508", c508)
                .put("c509", c509)
                .put("c510", c510)
                .put("c51096x", c51096x)
                .put("c511a", c511a)
                .put("c511b", c511b)
                .put("c511c", c511c)
                .put("c511d", c511d)
                .put("c511e", c511e)
                .put("c511f", c511f)
                .put("c511g", c511g)
                .put("c511h", c511h)
                .put("c511i", c511i)
                .put("c511j", c511j)
                .put("c701", c701)
                .put("c702", c702)
                .put("c70201", c70201)
                .put("c70202", c70202)
                .put("c70203", c70203)
                .put("c70204", c70204)
                .put("c70205", c70205)
                .put("c70206", c70206)
                .put("c70207", c70207)
                .put("c70208", c70208)
                .put("c70296", c70296)
                .put("c70296x", c70296x)
                .put("c703", c703)
                .put("c704", c704)
                .put("c70401", c70401)
                .put("c70402", c70402)
                .put("c70403", c70403)
                .put("c70404", c70404)
                .put("c70405", c70405)
                .put("c70406", c70406)
                .put("c70407", c70407)
                .put("c70408", c70408)
                .put("c70496", c70496)
                .put("c70496x", c70496x)
                .put("c705", c705)
                .put("c70501", c70501)
                .put("c70502", c70502)
                .put("c70503", c70503)
                .put("c70504", c70504)
                .put("c70505", c70505)
                .put("c70506", c70506)
                .put("c70507", c70507)
                .put("c70508", c70508)
                .put("c70596", c70596)
                .put("c70596x", c70596x)
                .put("c706", c706)
                .put("c601", c601)
                .put("c60101", c60101)
                .put("c60102", c60102)
                .put("c60103", c60103)
                .put("c60104", c60104)
                .put("c60105", c60105)
                .put("c60106", c60106)
                .put("c60107", c60107)
                .put("c60108", c60108)
                .put("c60109", c60109)
                .put("c602", c602)
                .put("c60296x", c60296x)
                .put("c603", c603)
                .put("c60396x", c60396x)
                .put("c604", c604)
                .put("c60496x", c60496x)
                .put("c605", c605)
                .put("c606a", c606a)
                .put("c606b", c606b)
                .put("c606c", c606c)
                .put("c606d", c606d)
                .put("c606e", c606e)
                .put("c60696", c60696)
                .put("c60701", c60701)
                .put("c608", c608);
        return json.toString();
    }*/

    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();
        json.put("c101", c101)
                .put("c102", c102)
                .put("c103", c103)
                .put("c104a", c104a)
                .put("c104b", c104b)
                .put("c104c", c104c)
                .put("c105", c105)
                .put("c106", c106)
                .put("c107", c107)
                .put("c108", c108)
                .put("c109", c109)
                .put("c110", c110)
                .put("c111", c111)
                .put("c112", c112)
                .put("c113", c113)
                .put("c114", c114);
        return json.toString();
    }

    public String sC2toString() throws JSONException {
        Log.d(TAG, "sC2toString: ");
        JSONObject json = new JSONObject();
        json.put("c201", c201)
                .put("c202", c202)
                .put("c202a", c202a)
                .put("c202b", c202b)
                .put("c202c", c202c)
                .put("c202d", c202d)
                .put("c202e", c202e)
                .put("c202f", c202f)
                .put("c202g", c202g)
                .put("c202h", c202h)
                .put("c20296", c20296)
                .put("c20296x", c20296x)
                .put("c203", c203)
                .put("c204", c204)
                .put("c20496x", c20496x)
                .put("c205a", c205a)
                .put("c20598", c20598)
                .put("c206a", c206a)
                .put("c20698", c20698)
                .put("c207", c207)
                .put("c208", c208)
                .put("c209", c209)
                .put("c20996x", c20996x)
                .put("c210", c210)
                .put("c21096x", c21096x)
                .put("c211", c211)
                .put("c212", c212)
                .put("c213", c213)
                .put("c214", c214)
                .put("c215", c215);
        return json.toString();
    }

    public String sC3toString() throws JSONException {
        Log.d(TAG, "sC3toString: ");
        JSONObject json = new JSONObject();
        json.put("ca301", ca301)
                .put("ca302", ca302)
                .put("ca303", ca303)
                .put("ca304", ca304)
                .put("ca305", ca305)
                .put("ca306", ca306)
                .put("ca307", ca307)
                .put("ca309", ca309)
                .put("ca310", ca310)
                .put("ca308", ca308)
                .put("cb309", cb309)
                .put("cb310", cb310)
                .put("cb311", cb311)
                .put("cb312", cb312);
        return json.toString();
    }

    public String sC4toString() throws JSONException {
        Log.d(TAG, "sC4toString: ");
        JSONObject json = new JSONObject();
        json.put("ca402", ca402)
                .put("ca403", ca403)
                .put("ca404", ca404)
                .put("ca405", ca405)
                .put("ca406", ca406)
                .put("ca407", ca407)
                .put("cb401", cb401)
                .put("cb402", cb402)
                .put("cb403", cb403)
                .put("cb404", cb404);
        return json.toString();
    }

    public String sC5toString() throws JSONException {
        Log.d(TAG, "sC5toString: ");
        JSONObject json = new JSONObject();
        json.put("c501a", c501a)
                .put("c501b", c501b)
                .put("c501c", c501c)
                .put("c501d", c501d)
                .put("c501e", c501e)
                .put("c501f", c501f)
                .put("c501g", c501g)
                .put("c501h", c501h)
                .put("c501i", c501i)
                .put("c501j", c501j)
                .put("c502", c502)
                .put("c503", c503)
                .put("c50301", c50301)
                .put("c50302", c50302)
                .put("c50303", c50303)
                .put("c50304", c50304)
                .put("c50305", c50305)
                .put("c50306", c50306)
                .put("c50307", c50307)
                .put("c50308", c50308)
                .put("c50396", c50396)
                .put("c50396x", c50396x)
                .put("c504", c504)
                .put("c50401", c50401)
                .put("c50402", c50402)
                .put("c50403", c50403)
                .put("c50404", c50404)
                .put("c50405", c50405)
                .put("c50406", c50406)
                .put("c50407", c50407)
                .put("c50496", c50496)
                .put("c50496x", c50496x)
                .put("c505", c505)
                .put("c506", c506)
                .put("c50601", c50601)
                .put("c50602", c50602)
                .put("c50603", c50603)
                .put("c50604", c50604)
                .put("c50605", c50605)
                .put("c50606", c50606)
                .put("c50607", c50607)
                .put("c50608", c50608)
                .put("c50609", c50609)
                .put("c50610", c50610)
                .put("c50611", c50611)
                .put("c50696", c50696)
                .put("c50696x", c50696x)
                .put("c507", c507)
                .put("c508", c508)
                .put("c509", c509)
                .put("c510", c510)
                .put("c51096x", c51096x)
                .put("c511a", c511a)
                .put("c511b", c511b)
                .put("c511c", c511c)
                .put("c511d", c511d)
                .put("c511e", c511e)
                .put("c511f", c511f)
                .put("c511g", c511g)
                .put("c511h", c511h)
                .put("c511i", c511i)
                .put("c511j", c511j);
        return json.toString();
    }

    public String sC6toString() throws JSONException {
        Log.d(TAG, "sC6toString: ");
        JSONObject json = new JSONObject();
        json.put("c601", c601)
                .put("c60101", c60101)
                .put("c60102", c60102)
                .put("c60103", c60103)
                .put("c60104", c60104)
                .put("c60105", c60105)
                .put("c60106", c60106)
                .put("c60107", c60107)
                .put("c60108", c60108)
                .put("c60109", c60109)
                .put("c602", c602)
                .put("c60296x", c60296x)
                .put("c603", c603)
                .put("c60396x", c60396x)
                .put("c604", c604)
                .put("c60496x", c60496x)
                .put("c605", c605)
                .put("c606a", c606a)
                .put("c606b", c606b)
                .put("c606c", c606c)
                .put("c606d", c606d)
                .put("c606e", c606e)
                .put("c60696", c60696)
                .put("c60701", c60701)
                .put("c608", c608);
        return json.toString();
    }

    public String sC7toString() throws JSONException {
        Log.d(TAG, "sC7toString: ");
        JSONObject json = new JSONObject();
        json.put("c701", c701)
                .put("c702", c702)
                .put("c70201", c70201)
                .put("c70202", c70202)
                .put("c70203", c70203)
                .put("c70204", c70204)
                .put("c70205", c70205)
                .put("c70206", c70206)
                .put("c70207", c70207)
                .put("c70208", c70208)
                .put("c70296", c70296)
                .put("c70296x", c70296x)
                .put("c703", c703)
                .put("c704", c704)
                .put("c70401", c70401)
                .put("c70402", c70402)
                .put("c70403", c70403)
                .put("c70404", c70404)
                .put("c70405", c70405)
                .put("c70406", c70406)
                .put("c70407", c70407)
                .put("c70408", c70408)
                .put("c70496", c70496)
                .put("c70496x", c70496x)
                .put("c705", c705)
                .put("c70501", c70501)
                .put("c70502", c70502)
                .put("c70503", c70503)
                .put("c70504", c70504)
                .put("c70505", c70505)
                .put("c70506", c70506)
                .put("c70507", c70507)
                .put("c70508", c70508)
                .put("c70596", c70596)
                .put("c70596x", c70596x)
                .put("c706", c706);
        return json.toString();
    }

    public String sD1toString() throws JSONException {
        Log.d(TAG, "sD1toString: ");
        JSONObject json = new JSONObject();
        json.put("d1001", d1001)
                .put("d101", d101)
                .put("d102", d102)
                .put("d1102", d1102)
                .put("d103", d103)
                .put("d104", d104)
                .put("d105", d105)
                .put("d106", d106)
                .put("d1203", d1203)
                .put("d107", d107)
                .put("d108", d108)
                .put("d1304", d1304)
                .put("d1304ax", d1304ax)
                .put("d109", d109)
                .put("d1title2", d1title2)
                .put("d110", d110)
                .put("d111", d111)
                .put("d112", d112)
                .put("d113", d113)
                .put("d11301x", d11301x)
                .put("d114", d114)
                .put("d115", d115)
                .put("d116", d116)
                .put("d117", d117)
                .put("d118", d118)
                .put("d119", d119)
                .put("d120", d120)
                .put("d121", d121)
                .put("d122", d122)
                .put("d123", d123)
                .put("d124", d124)
                .put("d125", d125)
                .put("d126", d126);
        return json.toString();
    }

    public String sD2toString() throws JSONException {
        Log.d(TAG, "sD2toString: ");
        JSONObject json = new JSONObject();
        json.put("d201", d201)
                .put("d202", d202)
                .put("d203", d203)
                .put("d204", d204);
        return json.toString();
    }

    /*public String sD1toString() throws JSONException {
        Log.d(TAG, "sDtoString: ");
        JSONObject json = new JSONObject();
        json.put("d1001", d1001)
                .put("d101", d101)
                .put("d102", d102)
                .put("d1102", d1102)
                .put("d103", d103)
                .put("d104", d104)
                .put("d105", d105)
                .put("d106", d106)
                .put("d1203", d1203)
                .put("d107", d107)
                .put("d108", d108)
                .put("d1304", d1304)
                .put("d1304ax", d1304ax)
                .put("d109", d109)
                .put("d1title2", d1title2)
                .put("d110", d110)
                .put("d111", d111)
                .put("d112", d112)
                .put("d113", d113)
                .put("d11301x", d11301x)
                .put("d114", d114)
                .put("d115", d115)
                .put("d116", d116)
                .put("d117", d117)
                .put("d118", d118)
                .put("d119", d119)
                .put("d120", d120)
                .put("d121", d121)
                .put("d122", d122)
                .put("d123", d123)
                .put("d124", d124)
                .put("d125", d125)
                .put("d126", d126)
                .put("d201", d201)
                .put("d202", d202)
                .put("d203", d203)
                .put("d204", d204);
        return json.toString();
    }*/

}