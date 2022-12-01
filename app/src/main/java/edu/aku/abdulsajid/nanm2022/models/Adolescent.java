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

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.AdolescentTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;

public class Adolescent extends BaseObservable implements Observable {

    private final String TAG = "Adolescent";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String muid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
    private String name = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // Field Variables
    //AH1
    private String ah1 = _EMPTY_;
    private String ah2 = _EMPTY_;
    private String ah3 = _EMPTY_;
    private String ah396x = _EMPTY_;
    private String ah4a = _EMPTY_;
    private String ah5 = _EMPTY_;
    private String ah6 = _EMPTY_;
    private String ah7a = _EMPTY_;
    private String ah7b = _EMPTY_;
    private String ah7c = _EMPTY_;
    private String ah7d = _EMPTY_;
    private String ah7e = _EMPTY_;
    private String ah7f = _EMPTY_;
    private String ah7g = _EMPTY_;
    private String ah7h = _EMPTY_;
    private String ah796 = _EMPTY_;
    private String ah796x = _EMPTY_;

    //AH2
    private String ah8 = _EMPTY_;
    private String ah9 = _EMPTY_;
    private String ah10 = _EMPTY_;
    private String ah11a = _EMPTY_;
    private String ah12 = _EMPTY_;
    private String ah13 = _EMPTY_;
    private String ah13aa = _EMPTY_;
    private String ah13ab = _EMPTY_;

    //AH3
    private String ah14 = _EMPTY_;
    private String ah15 = _EMPTY_;
    private String ah16 = _EMPTY_;
    private String ah17 = _EMPTY_;
    private String ah18 = _EMPTY_;
    private String ah19 = _EMPTY_;
    private String ah20 = _EMPTY_;
    private String ah21 = _EMPTY_;
    private String ah2102 = _EMPTY_;
    private String ah2201 = _EMPTY_;
    private String ah2202 = _EMPTY_;
    private String ah2203 = _EMPTY_;
    private String ah2296 = _EMPTY_;
    private String ah2296x = _EMPTY_;
    private String ah23 = _EMPTY_;
    private String ah2301x = _EMPTY_;
    private String ah2302x = _EMPTY_;
    private String ah2303x = _EMPTY_;
    private String ah2401 = _EMPTY_;
    private String ah2402 = _EMPTY_;
    private String ah2403 = _EMPTY_;
    private String ah2404 = _EMPTY_;
    private String ah2405 = _EMPTY_;
    private String ah2406 = _EMPTY_;
    private String ah2407 = _EMPTY_;
    private String ah2408 = _EMPTY_;
    private String ah2409 = _EMPTY_;
    private String ah2410 = _EMPTY_;
    private String ah2411 = _EMPTY_;
    private String ah24a = _EMPTY_;
    private String ah25 = _EMPTY_;
    private String ah26 = _EMPTY_;
    private String ah2696x = _EMPTY_;
    private String ah27 = _EMPTY_;
    private String ah28 = _EMPTY_;
    private String ah29 = _EMPTY_;
    private String ah3001 = _EMPTY_;
    private String ah3002 = _EMPTY_;
    private String ah3003 = _EMPTY_;
    private String ah31 = _EMPTY_;

    //AH4
    private String ah3201 = _EMPTY_;
    private String ah3202 = _EMPTY_;
    private String ah3203 = _EMPTY_;
    private String ah3204 = _EMPTY_;
    private String ah3205 = _EMPTY_;

    //AH5
    private String ah33a = _EMPTY_;
    private String ah33b = _EMPTY_;
    private String ah33c = _EMPTY_;
    private String ah3398 = _EMPTY_;
    private String ah34 = _EMPTY_;
    private String ah35a = _EMPTY_;
    private String ah35b = _EMPTY_;
    private String ah35c = _EMPTY_;
    private String ah35d = _EMPTY_;
    private String ah35e = _EMPTY_;
    private String ah35f = _EMPTY_;
    private String ah35g = _EMPTY_;
    private String ah35h = _EMPTY_;
    private String ah35i = _EMPTY_;
    private String ah35j = _EMPTY_;
    private String ah36 = _EMPTY_;
    private String ah36ax = _EMPTY_;

    //AH6
    private String ah3701 = _EMPTY_;
    private String ah3701a = _EMPTY_;
    private String ah3701b = _EMPTY_;
    private String ah3701c = _EMPTY_;
    private String ah3701d = _EMPTY_;
    private String ah3701e = _EMPTY_;
    private String ah3701f = _EMPTY_;
    private String ah3701x = _EMPTY_;
    private String ah3701xx = _EMPTY_;
    private String ah3702 = _EMPTY_;
    private String ah3702a = _EMPTY_;
    private String ah3702b = _EMPTY_;
    private String ah3702c = _EMPTY_;
    private String ah3702e = _EMPTY_;
    private String ah3702d = _EMPTY_;
    private String ah3702f = _EMPTY_;
    private String ah3702x = _EMPTY_;
    private String ah3702xx = _EMPTY_;
    private String ah3703 = _EMPTY_;
    private String ah3703a = _EMPTY_;
    private String ah3703b = _EMPTY_;
    private String ah3703c = _EMPTY_;
    private String ah3703e = _EMPTY_;
    private String ah3703d = _EMPTY_;
    private String ah3703f = _EMPTY_;
    private String ah3703x = _EMPTY_;
    private String ah3703xx = _EMPTY_;
    private String ah3704 = _EMPTY_;
    private String ah3704a = _EMPTY_;
    private String ah3704b = _EMPTY_;
    private String ah3704c = _EMPTY_;
    private String ah3704e = _EMPTY_;
    private String ah3704d = _EMPTY_;
    private String ah3704f = _EMPTY_;
    private String ah3704x = _EMPTY_;
    private String ah3704xx = _EMPTY_;
    private String ah3705 = _EMPTY_;
    private String ah3705a = _EMPTY_;
    private String ah3705b = _EMPTY_;
    private String ah3705c = _EMPTY_;
    private String ah3705e = _EMPTY_;
    private String ah3705d = _EMPTY_;
    private String ah3705f = _EMPTY_;
    private String ah3705x = _EMPTY_;
    private String ah3705xx = _EMPTY_;
    private String ah3706 = _EMPTY_;
    private String ah3706a = _EMPTY_;
    private String ah3706b = _EMPTY_;
    private String ah3706c = _EMPTY_;
    private String ah3706e = _EMPTY_;
    private String ah3706d = _EMPTY_;
    private String ah3706f = _EMPTY_;
    private String ah3706x = _EMPTY_;
    private String ah3706xx = _EMPTY_;
    private String ah37aa = _EMPTY_;
    private String ah37ab = _EMPTY_;
    private String ah37ac = _EMPTY_;
    private String ah38 = _EMPTY_;
    private String ah38aa = _EMPTY_;
    private String ah39 = _EMPTY_;
    private String ah39a = _EMPTY_;
    private String ah39b = _EMPTY_;
    private String ah39c = _EMPTY_;
    private String ah39d = _EMPTY_;
    private String ah39x = _EMPTY_;
    private String ah39xx = _EMPTY_;
    private String ah40 = _EMPTY_;
    private String ah40a = _EMPTY_;
    private String ah40b = _EMPTY_;
    private String ah40c = _EMPTY_;
    private String ah40d = _EMPTY_;
    private String ah40e = _EMPTY_;
    private String ah40f = _EMPTY_;
    private String ah40g = _EMPTY_;
    private String ah40h = _EMPTY_;
    private String ah40x = _EMPTY_;
    private String ah40xx = _EMPTY_;
    private String ah40aa = _EMPTY_;
    private String ah40aaa = _EMPTY_;
    private String ah40aab = _EMPTY_;
    private String ah40aac = _EMPTY_;
    private String ah40aad = _EMPTY_;
    private String ah40aae = _EMPTY_;
    private String ah40aaf = _EMPTY_;
    private String ah40aag = _EMPTY_;
    private String ah40aah = _EMPTY_;
    private String ah40aax = _EMPTY_;
    private String ah40aaxx = _EMPTY_;
    private String ah41 = _EMPTY_;
    private String ah42 = _EMPTY_;
    private String ah43 = _EMPTY_;
    private String ah44 = _EMPTY_;
    private String ah44a = _EMPTY_;
    private String ah44b = _EMPTY_;
    private String ah44c = _EMPTY_;
    private String ah44d = _EMPTY_;
    private String ah44e = _EMPTY_;
    private String ah44f = _EMPTY_;
    private String ah44g = _EMPTY_;
    private String ah44h = _EMPTY_;
    private String ah44i = _EMPTY_;
    private String ah45 = _EMPTY_;
    private String ah46 = _EMPTY_;
    private String ah47d = _EMPTY_;
    private String ah48 = _EMPTY_;

    //AH7
    private String ah49a = _EMPTY_;
    private String ah49b = _EMPTY_;
    private String ah49c = _EMPTY_;
    private String ah49ax = _EMPTY_;
    private String ah49bx = _EMPTY_;

    private String ah50 = _EMPTY_;
    private String ah50aaa = _EMPTY_;
    private String ah50aab = _EMPTY_;
    private String ah51 = _EMPTY_;
    private String ah52a = _EMPTY_;
    private String ah53 = _EMPTY_;
    private String ah54 = _EMPTY_;
    private String ah54ax = _EMPTY_;
    private String ah55 = _EMPTY_;
    private String ah56a = _EMPTY_;
    private String ah57 = _EMPTY_;
    private String ah57ax = _EMPTY_;
    private String ah58a = _EMPTY_;
    private String ah59a = _EMPTY_;
    private String ah59b = _EMPTY_;
    private String ah59c = _EMPTY_;
    private String ah59d = _EMPTY_;
    private String ah60a = _EMPTY_;

    public void Adolescent() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
        setSno(selectedAdol);
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getUid()); //// not applicable in Form table
        setIndexed(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getIndexed());
        setName(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getA202());


    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return psuCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
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

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
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

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    @Bindable
    public String getAh1() {
        return ah1;
    }

    public void setAh1(String ah1) {
        this.ah1 = ah1;
        setAh2(ah1.equals("0") || ah1.equals("99") ? "" : this.ah2);
        setAh3(ah1.equals("0") || ah1.equals("99") ? "" : this.ah3);
        setAh4a(ah1.equals("0") || ah1.equals("99") ? "" : this.ah4a);
        setAh5(ah1.equals("0") || ah1.equals("99") ? "" : this.ah5);
        setAh6(ah1.equals("0") || ah1.equals("99") ? "" : this.ah6);
        setAh7a(ah1.equals("0") || ah1.equals("99") ? this.ah7a : "");
        setAh7b(ah1.equals("0") || ah1.equals("99") ? this.ah7b : "");
        setAh7c(ah1.equals("0") || ah1.equals("99") ? this.ah7c : "");
        setAh7d(ah1.equals("0") || ah1.equals("99") ? this.ah7d : "");
        setAh7e(ah1.equals("0") || ah1.equals("99") ? this.ah7e : "");
        setAh7f(ah1.equals("0") || ah1.equals("99") ? this.ah7f : "");
        setAh7g(ah1.equals("0") || ah1.equals("99") ? this.ah7g : "");
        setAh7h(ah1.equals("0") || ah1.equals("99") ? this.ah7h : "");
        setAh796(ah1.equals("0") || ah1.equals("99") ? this.ah796 : "");
        notifyPropertyChanged(BR.ah1);
    }

    @Bindable
    public String getAh2() {
        return ah2;
    }

    public void setAh2(String ah2) {
        this.ah2 = ah2;
        setAh3(ah2.equals("1") ? this.ah3 : "");
        notifyPropertyChanged(BR.ah2);
    }

    @Bindable
    public String getAh3() {
        return ah3;
    }

    public void setAh3(String ah3) {
        this.ah3 = ah3;
        setAh396x(ah3.equals("96") ? this.ah396x : "");
        notifyPropertyChanged(BR.ah3);
    }

    @Bindable
    public String getAh396x() {
        return ah396x;
    }

    public void setAh396x(String ah396x) {
        this.ah396x = ah396x;
        notifyPropertyChanged(BR.ah396x);
    }

    @Bindable
    public String getAh4a() {
        return ah4a;
    }

    public void setAh4a(String ah4a) {
        this.ah4a = ah4a;
        notifyPropertyChanged(BR.ah4a);
    }

    @Bindable
    public String getAh5() {
        return ah5;
    }

    public void setAh5(String ah5) {
        this.ah5 = ah5;
        notifyPropertyChanged(BR.ah5);
    }

    @Bindable
    public String getAh6() {
        return ah6;
    }

    public void setAh6(String ah6) {
        this.ah6 = ah6;
        notifyPropertyChanged(BR.ah6);
    }

    @Bindable
    public String getAh7a() {
        return ah7a;
    }

    public void setAh7a(String ah7a) {
        if (this.ah7a.equals(ah7a)) return;      //For all checkboxes
        this.ah7a = ah7a;
        notifyPropertyChanged(BR.ah7a);
    }

    @Bindable
    public String getAh7b() {
        return ah7b;
    }

    public void setAh7b(String ah7b) {
        if (this.ah7b.equals(ah7b)) return;      //For all checkboxes
        this.ah7b = ah7b;
        notifyPropertyChanged(BR.ah7b);
    }

    @Bindable
    public String getAh7c() {
        return ah7c;
    }

    public void setAh7c(String ah7c) {
        if (this.ah7c.equals(ah7c)) return;      //For all checkboxes
        this.ah7c = ah7c;
        notifyPropertyChanged(BR.ah7c);
    }

    @Bindable
    public String getAh7d() {
        return ah7d;
    }

    public void setAh7d(String ah7d) {
        if (this.ah7d.equals(ah7d)) return;      //For all checkboxes
        this.ah7d = ah7d;
        notifyPropertyChanged(BR.ah7d);
    }

    @Bindable
    public String getAh7e() {
        return ah7e;
    }

    public void setAh7e(String ah7e) {
        if (this.ah7e.equals(ah7e)) return;      //For all checkboxes
        this.ah7e = ah7e;
        notifyPropertyChanged(BR.ah7e);
    }

    @Bindable
    public String getAh7f() {
        return ah7f;
    }

    public void setAh7f(String ah7f) {
        if (this.ah7f.equals(ah7f)) return;      //For all checkboxes
        this.ah7f = ah7f;
        notifyPropertyChanged(BR.ah7f);
    }

    @Bindable
    public String getAh7g() {
        return ah7g;
    }

    public void setAh7g(String ah7g) {
        if (this.ah7g.equals(ah7g)) return;      //For all checkboxes
        this.ah7g = ah7g;
        notifyPropertyChanged(BR.ah7g);
    }

    @Bindable
    public String getAh7h() {
        return ah7h;
    }

    public void setAh7h(String ah7h) {
        if (this.ah7h.equals(ah7h)) return;      //For all checkboxes
        this.ah7h = ah7h;
        setAh7a(ah7h.equals("8") ? "" : this.ah7a);
        setAh7b(ah7h.equals("8") ? "" : this.ah7b);
        setAh7c(ah7h.equals("8") ? "" : this.ah7c);
        setAh7d(ah7h.equals("8") ? "" : this.ah7d);
        setAh7e(ah7h.equals("8") ? "" : this.ah7e);
        setAh7f(ah7h.equals("8") ? "" : this.ah7f);
        setAh7g(ah7h.equals("8") ? "" : this.ah7g);
        setAh796(ah7h.equals("8") ? "" : this.ah796);
        notifyPropertyChanged(BR.ah7h);
    }

    @Bindable
    public String getAh796() {
        return ah796;
    }

    public void setAh796(String ah796) {
        if (this.ah796.equals(ah796)) return;      //For all checkboxes
        this.ah796 = ah796;
        setAh796x(ah796.equals("96") ? this.ah796x : "");
        notifyPropertyChanged(BR.ah796);
    }

    @Bindable
    public String getAh796x() {
        return ah796x;
    }

    public void setAh796x(String ah796x) {
        this.ah796x = ah796x;
        notifyPropertyChanged(BR.ah796x);
    }

    @Bindable
    public String getAh8() {
        return ah8;
    }

    public void setAh8(String ah8) {
        this.ah8 = ah8;
        setAh9(ah8.equals("3") ? "" : this.ah9);
        setAh10(ah8.equals("3") ? "" : this.ah10);
        setAh11a(ah8.equals("3") ? "" : this.ah11a);
        setAh12(ah8.equals("3") ? "" : this.ah12);
        notifyPropertyChanged(BR.ah8);
    }

    @Bindable
    public String getAh9() {
        return ah9;
    }

    public void setAh9(String ah9) {
        this.ah9 = ah9;
        notifyPropertyChanged(BR.ah9);
    }

    @Bindable
    public String getAh10() {
        return ah10;
    }

    public void setAh10(String ah10) {
        this.ah10 = ah10;
        notifyPropertyChanged(BR.ah10);
    }

    @Bindable
    public String getAh11a() {
        return ah11a;
    }

    public void setAh11a(String ah11a) {
        this.ah11a = ah11a;
        notifyPropertyChanged(BR.ah11a);
    }

    @Bindable
    public String getAh12() {
        return ah12;
    }

    public void setAh12(String ah12) {
        this.ah12 = ah12;
        setAh13(ah12.equals("2") ? this.ah13 : "");
        setAh13aa(ah12.equals("2") ? this.ah13aa : "");
        setAh13ab(ah12.equals("2") ? this.ah13ab : "");
        notifyPropertyChanged(BR.ah12);
    }

    @Bindable
    public String getAh13() {
        return ah13;
    }

    public void setAh13(String ah13) {
        this.ah13 = ah13;
        notifyPropertyChanged(BR.ah13);
    }

    @Bindable
    public String getAh13aa() {
        return ah13aa;
    }

    public void setAh13aa(String ah13aa) {
        this.ah13aa = ah13aa;
        notifyPropertyChanged(BR.ah13aa);
    }

    @Bindable
    public String getAh13ab() {
        return ah13ab;
    }

    public void setAh13ab(String ah13ab) {
        this.ah13ab = ah13ab;
        notifyPropertyChanged(BR.ah13ab);
    }

    @Bindable
    public String getAh14() {
        return ah14;
    }

    public void setAh14(String ah14) {
        this.ah14 = ah14;
        notifyPropertyChanged(BR.ah14);
    }

    @Bindable
    public String getAh15() {
        return ah15;
    }

    public void setAh15(String ah15) {
        this.ah15 = ah15;
        notifyPropertyChanged(BR.ah15);
    }

    @Bindable
    public String getAh16() {
        return ah16;
    }

    public void setAh16(String ah16) {
        this.ah16 = ah16;
        setAh17(ah16.equals("2") ? "" : this.ah17);
        setAh18(ah16.equals("2") ? "" : this.ah18);
        notifyPropertyChanged(BR.ah16);
    }

    @Bindable
    public String getAh17() {
        return ah17;
    }

    public void setAh17(String ah17) {
        this.ah17 = ah17;
        notifyPropertyChanged(BR.ah17);
    }

    @Bindable
    public String getAh18() {
        return ah18;
    }

    public void setAh18(String ah18) {
        this.ah18 = ah18;
        notifyPropertyChanged(BR.ah18);
    }

    @Bindable
    public String getAh19() {
        return ah19;
    }

    public void setAh19(String ah19) {
        this.ah19 = ah19;
        setAh20(ah19.equals("1") ? this.ah20 : "");
        setAh21(ah19.equals("1") ? this.ah21 : "");
        notifyPropertyChanged(BR.ah19);
    }

    @Bindable
    public String getAh20() {
        return ah20;
    }

    public void setAh20(String ah20) {
        this.ah20 = ah20;
        notifyPropertyChanged(BR.ah20);
    }

    @Bindable
    public String getAh21() {
        return ah21;
    }

    public void setAh21(String ah21) {
        this.ah21 = ah21;
        notifyPropertyChanged(BR.ah21);
    }

    @Bindable
    public String getAh2102() {
        return ah2102;
    }

    public void setAh2102(String ah2102) {
        this.ah2102 = ah2102;
        notifyPropertyChanged(BR.ah2102);
    }

    @Bindable
    public String getAh2201() {
        return ah2201;
    }

    public void setAh2201(String ah2201) {
        this.ah2201 = ah2201;
        setAh23(ah2201.equals("1") || this.ah2202.equals("1") || this.ah2203.equals("1") || this.ah2296.equals("1") ? this.ah23 : "");
        notifyPropertyChanged(BR.ah2201);
    }

    @Bindable
    public String getAh2202() {
        return ah2202;
    }

    public void setAh2202(String ah2202) {
        this.ah2202 = ah2202;
        setAh23(ah2202.equals("1") || this.ah2201.equals("1") || this.ah2203.equals("1") || this.ah2296.equals("1") ? this.ah23 : "");
/*        setAh23(ah2202.equals("2") ? "" : this.ah23);
        setAh2401(ah2202.equals("2") ? "" : this.ah2401);
        setAh2402(ah2202.equals("2") ? "" : this.ah2402);
        setAh2403(ah2202.equals("2") ? "" : this.ah2403);
        setAh2404(ah2202.equals("2") ? "" : this.ah2404);
        setAh2405(ah2202.equals("2") ? "" : this.ah2405);
        setAh2406(ah2202.equals("2") ? "" : this.ah2406);
        setAh2407(ah2202.equals("2") ? "" : this.ah2407);
        setAh2408(ah2202.equals("2") ? "" : this.ah2408);
        setAh2409(ah2202.equals("2") ? "" : this.ah2409);
        setAh2410(ah2202.equals("2") ? "" : this.ah2410);
        setAh2411(ah2202.equals("2") ? "" : this.ah2411);*/
        notifyPropertyChanged(BR.ah2202);
    }

    @Bindable
    public String getAh2203() {
        return ah2203;
    }

    public void setAh2203(String ah2203) {
        this.ah2203 = ah2203;
        setAh23(ah2203.equals("1") || this.ah2202.equals("1") || this.ah2201.equals("1") || this.ah2296.equals("1") ? this.ah23 : "");
        notifyPropertyChanged(BR.ah2203);
    }

    @Bindable
    public String getAh2296() {
        return ah2296;
    }

    public void setAh2296(String ah2296) {
        this.ah2296 = ah2296;
        setAh23(ah2296.equals("1") || this.ah2202.equals("1") || this.ah2203.equals("1") || this.ah2201.equals("1") ? this.ah23 : "");
        setAh2296x(ah2296.equals("96") ? this.ah2296x : "");
        notifyPropertyChanged(BR.ah2296);
    }

    @Bindable
    public String getAh2296x() {
        return ah2296x;
    }

    public void setAh2296x(String ah2296x) {
        this.ah2296x = ah2296x;
        notifyPropertyChanged(BR.ah2296x);
    }

    @Bindable
    public String getAh23() {
        return ah23;
    }

    public void setAh23(String ah23) {
        this.ah23 = ah23;
        setAh2301x(ah23.equals("1") ? this.ah2301x : "");
        setAh2302x(ah23.equals("2") ? this.ah2302x : "");
        setAh2303x(ah23.equals("3") ? this.ah2303x : "");
        notifyPropertyChanged(BR.ah23);
    }

    @Bindable
    public String getAh2301x() {
        return ah2301x;
    }

    public void setAh2301x(String ah2301x) {
        this.ah2301x = ah2301x;
        notifyPropertyChanged(BR.ah2301x);
    }

    @Bindable
    public String getAh2302x() {
        return ah2302x;
    }

    public void setAh2302x(String ah2302x) {
        this.ah2302x = ah2302x;
        notifyPropertyChanged(BR.ah2302x);
    }

    @Bindable
    public String getAh2303x() {
        return ah2303x;
    }

    public void setAh2303x(String ah2303x) {
        this.ah2303x = ah2303x;
        notifyPropertyChanged(BR.ah2303x);
    }


    @Bindable
    public String getAh2401() {
        return ah2401;
    }

    public void setAh2401(String ah2401) {
        this.ah2401 = ah2401;
        notifyPropertyChanged(BR.ah2401);
    }


    @Bindable
    public String getAh2402() {
        return ah2402;
    }

    public void setAh2402(String ah2402) {
        this.ah2402 = ah2402;
        notifyPropertyChanged(BR.ah2402);
    }


    @Bindable
    public String getAh2403() {
        return ah2403;
    }

    public void setAh2403(String ah2403) {
        this.ah2403 = ah2403;
        notifyPropertyChanged(BR.ah2403);
    }


    @Bindable
    public String getAh2404() {
        return ah2404;
    }

    public void setAh2404(String ah2404) {
        this.ah2404 = ah2404;
        notifyPropertyChanged(BR.ah2404);
    }


    @Bindable
    public String getAh2405() {
        return ah2405;
    }

    public void setAh2405(String ah2405) {
        this.ah2405 = ah2405;
        notifyPropertyChanged(BR.ah2405);
    }


    @Bindable
    public String getAh2406() {
        return ah2406;
    }

    public void setAh2406(String ah2406) {
        this.ah2406 = ah2406;
        notifyPropertyChanged(BR.ah2406);
    }


    @Bindable
    public String getAh2407() {
        return ah2407;
    }

    public void setAh2407(String ah2407) {
        this.ah2407 = ah2407;
        notifyPropertyChanged(BR.ah2407);
    }


    @Bindable
    public String getAh2408() {
        return ah2408;
    }

    public void setAh2408(String ah2408) {
        this.ah2408 = ah2408;
        notifyPropertyChanged(BR.ah2408);
    }


    @Bindable
    public String getAh2409() {
        return ah2409;
    }

    public void setAh2409(String ah2409) {
        this.ah2409 = ah2409;
        notifyPropertyChanged(BR.ah2409);
    }


    @Bindable
    public String getAh2410() {
        return ah2410;
    }

    public void setAh2410(String ah2410) {
        this.ah2410 = ah2410;
        notifyPropertyChanged(BR.ah2410);
    }


    @Bindable
    public String getAh2411() {
        return ah2411;
    }

    public void setAh2411(String ah2411) {
        if (this.ah2411.equals(ah2411)) return;
        this.ah2411 = ah2411;
        setAh24a(ah2411.equals("11") ? "" : this.ah24a);
        setAh2401(ah2411.equals("11") ? "" : this.ah2401);
        setAh2402(ah2411.equals("11") ? "" : this.ah2402);
        setAh2403(ah2411.equals("11") ? "" : this.ah2403);
        setAh2404(ah2411.equals("11") ? "" : this.ah2404);
        setAh2405(ah2411.equals("11") ? "" : this.ah2405);
        setAh2406(ah2411.equals("11") ? "" : this.ah2406);
        setAh2407(ah2411.equals("11") ? "" : this.ah2407);
        setAh2408(ah2411.equals("11") ? "" : this.ah2408);
        setAh2409(ah2411.equals("11") ? "" : this.ah2409);
        setAh2410(ah2411.equals("11") ? "" : this.ah2410);
        setAh24a(ah2411.equals("11") ? "" : this.ah24a);
        setAh25(ah2411.equals("11") ? "" : this.ah25);
        setAh26(ah2411.equals("11") ? "" : this.ah26);
        notifyPropertyChanged(BR.ah2411);
    }


    @Bindable
    public String getAh24a() {
        return ah24a;
    }

    public void setAh24a(String ah24a) {
        this.ah24a = ah24a;
        notifyPropertyChanged(BR.ah24a);
    }


    @Bindable
    public String getAh25() {
        return ah25;
    }

    public void setAh25(String ah25) {
        this.ah25 = ah25;
        setAh26(ah25.equals("2") ? "" : this.ah26);
        notifyPropertyChanged(BR.ah25);
    }

    @Bindable
    public String getAh26() {
        return ah26;
    }

    public void setAh26(String ah26) {
        this.ah26 = ah26;
        setAh2696x(ah26.equals("96") ? this.ah2696x : "");
        notifyPropertyChanged(BR.ah26);
    }

    @Bindable
    public String getAh2696x() {
        return ah2696x;
    }

    public void setAh2696x(String ah2696x) {
        this.ah2696x = ah2696x;
        notifyPropertyChanged(BR.ah2696x);
    }

    @Bindable
    public String getAh27() {
        return ah27;
    }

    public void setAh27(String ah27) {
        this.ah27 = ah27;
        setAh28(ah27.equals("2") ? "" : this.ah28);
        notifyPropertyChanged(BR.ah27);
    }

    @Bindable
    public String getAh28() {
        return ah28;
    }

    public void setAh28(String ah28) {
        this.ah28 = ah28;
        notifyPropertyChanged(BR.ah28);
    }

    @Bindable
    public String getAh29() {
        return ah29;
    }

    public void setAh29(String ah29) {
        this.ah29 = ah29;
        notifyPropertyChanged(BR.ah29);
    }

    @Bindable
    public String getAh3001() {
        return ah3001;
    }

    public void setAh3001(String ah3001) {
        this.ah3001 = ah3001;
        notifyPropertyChanged(BR.ah3001);
    }

    @Bindable
    public String getAh3002() {
        return ah3002;
    }

    public void setAh3002(String ah3002) {
        this.ah3002 = ah3002;
        notifyPropertyChanged(BR.ah3002);
    }

    @Bindable
    public String getAh3003() {
        return ah3003;
    }

    public void setAh3003(String ah3003) {
        this.ah3003 = ah3003;
        setAh31(ah3003.equals("1") ? this.ah31 : "");
        notifyPropertyChanged(BR.ah3003);
    }

    @Bindable
    public String getAh31() {
        return ah31;
    }

    public void setAh31(String ah31) {
        this.ah31 = ah31;
        notifyPropertyChanged(BR.ah31);
    }

    @Bindable
    public String getAh3201() {
        return ah3201;
    }

    public void setAh3201(String ah3201) {
        this.ah3201 = ah3201;
        notifyPropertyChanged(BR.ah3201);
    }

    @Bindable
    public String getAh3202() {
        return ah3202;
    }

    public void setAh3202(String ah3202) {
        this.ah3202 = ah3202;
        notifyPropertyChanged(BR.ah3202);
    }

    @Bindable
    public String getAh3203() {
        return ah3203;
    }

    public void setAh3203(String ah3203) {
        this.ah3203 = ah3203;
        notifyPropertyChanged(BR.ah3203);
    }

    @Bindable
    public String getAh3204() {
        return ah3204;
    }

    public void setAh3204(String ah3204) {
        this.ah3204 = ah3204;
        notifyPropertyChanged(BR.ah3204);
    }

    @Bindable
    public String getAh3205() {
        return ah3205;
    }

    public void setAh3205(String ah3205) {
        this.ah3205 = ah3205;
        notifyPropertyChanged(BR.ah3205);
    }

    @Bindable
    public String getAh33a() {
        return ah33a;
    }

    public void setAh33a(String ah33a) {
        if (this.ah33a.equals(ah33a)) return;
        this.ah33a = ah33a;
        notifyPropertyChanged(BR.ah33a);
    }

    @Bindable
    public String getAh33b() {
        return ah33b;
    }

    public void setAh33b(String ah33b) {
        if (this.ah33b.equals(ah33b)) return;
        this.ah33b = ah33b;
        notifyPropertyChanged(BR.ah33b);
    }

    @Bindable
    public String getAh33c() {
        return ah33c;
    }

    public void setAh33c(String ah33c) {
        if (this.ah33c.equals(ah33c)) return;
        this.ah33c = ah33c;
        notifyPropertyChanged(BR.ah33c);
    }

    @Bindable
    public String getAh3398() {
        return ah3398;
    }

    public void setAh3398(String ah3398) {
        if (this.ah3398.equals(ah3398)) return;
        this.ah3398 = ah3398;
        setAh33a(ah3398.equals("98") ? "" : this.ah33a);
        setAh33b(ah3398.equals("98") ? "" : this.ah33b);
        setAh33c(ah3398.equals("98") ? "" : this.ah33c);
        notifyPropertyChanged(BR.ah3398);
    }

    @Bindable
    public String getAh34() {
        return ah34;
    }

    public void setAh34(String ah34) {
        this.ah34 = ah34;
        notifyPropertyChanged(BR.ah34);
    }

    @Bindable
    public String getAh35a() {
        return ah35a;
    }

    public void setAh35a(String ah35a) {
        if (this.ah35a.equals(ah35a)) return;
        this.ah35a = ah35a;
        notifyPropertyChanged(BR.ah35a);
    }

    @Bindable
    public String getAh35b() {
        return ah35b;
    }

    public void setAh35b(String ah35b) {
        if (this.ah35b.equals(ah35b)) return;
        this.ah35b = ah35b;
        notifyPropertyChanged(BR.ah35b);
    }

    @Bindable
    public String getAh35c() {
        return ah35c;
    }

    public void setAh35c(String ah35c) {
        if (this.ah35c.equals(ah35c)) return;
        this.ah35c = ah35c;
        notifyPropertyChanged(BR.ah35c);
    }

    @Bindable
    public String getAh35d() {
        return ah35d;
    }

    public void setAh35d(String ah35d) {
        if (this.ah35d.equals(ah35d)) return;
        this.ah35d = ah35d;
        notifyPropertyChanged(BR.ah35d);
    }

    @Bindable
    public String getAh35e() {
        return ah35e;
    }

    public void setAh35e(String ah35e) {
        if (this.ah35e.equals(ah35e)) return;
        this.ah35e = ah35e;
        notifyPropertyChanged(BR.ah35e);
    }

    @Bindable
    public String getAh35f() {
        return ah35f;
    }

    public void setAh35f(String ah35f) {
        if (this.ah35f.equals(ah35f)) return;
        this.ah35f = ah35f;
        notifyPropertyChanged(BR.ah35f);
    }

    @Bindable
    public String getAh35g() {
        return ah35g;
    }

    public void setAh35g(String ah35g) {
        if (this.ah35g.equals(ah35g)) return;
        this.ah35g = ah35g;
        notifyPropertyChanged(BR.ah35g);
    }

    @Bindable
    public String getAh35h() {
        return ah35h;
    }

    public void setAh35h(String ah35h) {
        if (this.ah35h.equals(ah35h)) return;
        this.ah35h = ah35h;
        notifyPropertyChanged(BR.ah35h);
    }

    @Bindable
    public String getAh35i() {
        return ah35i;
    }

    public void setAh35i(String ah35i) {
        if (this.ah35i.equals(ah35i)) return;
        this.ah35i = ah35i;
        notifyPropertyChanged(BR.ah35i);
    }

    @Bindable
    public String getAh35j() {
        return ah35j;
    }

    public void setAh35j(String ah35j) {
        if (this.ah35j.equals(ah35j)) return;
        this.ah35j = ah35j;
        notifyPropertyChanged(BR.ah35j);
    }

    @Bindable
    public String getAh36() {
        return ah36;
    }

    public void setAh36(String ah36) {
        this.ah36 = ah36;
        setAh36ax(ah36.equals("1") ? this.ah36ax : "");
        notifyPropertyChanged(BR.ah36);
    }

    @Bindable
    public String getAh36ax() {
        return ah36ax;
    }

    public void setAh36ax(String ah36ax) {
        this.ah36ax = ah36ax;
        notifyPropertyChanged(BR.ah36ax);
    }

    @Bindable
    public String getAh3701() {
        return ah3701;
    }

    public void setAh3701(String ah3701) {
        this.ah3701 = ah3701;
        notifyPropertyChanged(BR.ah3701);
    }

    @Bindable
    public String getAh3701a() {
        return ah3701a;
    }

    public void setAh3701a(String ah3701a) {
        if (this.ah3701a.equals(ah3701a)) return;     // For all checkboxes
        this.ah3701a = ah3701a;
        notifyPropertyChanged(BR.ah3701a);
    }

    @Bindable
    public String getAh3701b() {
        return ah3701b;
    }

    public void setAh3701b(String ah3701b) {
        if (this.ah3701b.equals(ah3701b)) return;     // For all checkboxes
        this.ah3701b = ah3701b;
        notifyPropertyChanged(BR.ah3701b);
    }

    @Bindable
    public String getAh3701c() {
        return ah3701c;
    }

    public void setAh3701c(String ah3701c) {
        if (this.ah3701c.equals(ah3701c)) return;     // For all checkboxes
        this.ah3701c = ah3701c;
        notifyPropertyChanged(BR.ah3701c);
    }

    @Bindable
    public String getAh3701d() {
        return ah3701d;
    }

    public void setAh3701d(String ah3701d) {
        if (this.ah3701d.equals(ah3701d)) return;     // For all checkboxes
        this.ah3701d = ah3701d;
        notifyPropertyChanged(BR.ah3701d);
    }

    @Bindable
    public String getAh3701e() {
        return ah3701e;
    }

    public void setAh3701e(String ah3701e) {
        if (this.ah3701e.equals(ah3701e)) return;     // For all checkboxes
        this.ah3701e = ah3701e;
        setAh3701a(ah3701e.equals("5") ? "" : this.ah3701a);
        setAh3701b(ah3701e.equals("5") ? "" : this.ah3701b);
        setAh3701c(ah3701e.equals("5") ? "" : this.ah3701c);
        setAh3701d(ah3701e.equals("5") ? "" : this.ah3701d);
        setAh3701f(ah3701e.equals("5") ? "" : this.ah3701f);
        setAh3701x(ah3701e.equals("5") ? "" : this.ah3701x);
        notifyPropertyChanged(BR.ah3701e);
    }

    @Bindable
    public String getAh3701f() {
        return ah3701f;
    }

    public void setAh3701f(String ah3701f) {
        if (this.ah3701f.equals(ah3701f)) return;     // For all checkboxes
        this.ah3701f = ah3701f;
        notifyPropertyChanged(BR.ah3701f);
    }

    @Bindable
    public String getAh3701x() {
        return ah3701x;
    }

    public void setAh3701x(String ah3701x) {
        if (this.ah3701x.equals(ah3701x)) return;     // For all checkboxes
        this.ah3701x = ah3701x;
        setAh3701xx(ah3701x.equals("96") ? this.ah3701xx : "");
        notifyPropertyChanged(BR.ah3701x);
    }

    @Bindable
    public String getAh3701xx() {
        return ah3701xx;
    }

    public void setAh3701xx(String ah3701xx) {
        this.ah3701xx = ah3701xx;
        notifyPropertyChanged(BR.ah3701xx);
    }

    @Bindable
    public String getAh3702() {
        return ah3702;
    }

    public void setAh3702(String ah3702) {
        this.ah3702 = ah3702;
        notifyPropertyChanged(BR.ah3702);
    }

    @Bindable
    public String getAh3702a() {
        return ah3702a;
    }

    public void setAh3702a(String ah3702a) {
        if (this.ah3702a.equals(ah3702a)) return;     // For all checkboxes
        this.ah3702a = ah3702a;
        notifyPropertyChanged(BR.ah3702a);
    }

    @Bindable
    public String getAh3702b() {
        return ah3702b;
    }

    public void setAh3702b(String ah3702b) {
        if (this.ah3702b.equals(ah3702b)) return;     // For all checkboxes
        this.ah3702b = ah3702b;
        notifyPropertyChanged(BR.ah3702b);
    }

    @Bindable
    public String getAh3702c() {
        return ah3702c;
    }

    public void setAh3702c(String ah3702c) {
        if (this.ah3702c.equals(ah3702c)) return;     // For all checkboxes
        this.ah3702c = ah3702c;
        notifyPropertyChanged(BR.ah3702c);
    }

    @Bindable
    public String getAh3702e() {
        return ah3702e;
    }

    public void setAh3702e(String ah3702e) {
        if (this.ah3702e.equals(ah3702e)) return;     // For all checkboxes
        this.ah3702e = ah3702e;
        notifyPropertyChanged(BR.ah3702e);
    }

    @Bindable
    public String getAh3702d() {
        return ah3702d;
    }

    public void setAh3702d(String ah3702d) {
        if (this.ah3702d.equals(ah3702d)) return;     // For all checkboxes
        this.ah3702d = ah3702d;
        setAh3702a(ah3702d.equals("5") ? "" : this.ah3702a);
        setAh3702b(ah3702d.equals("5") ? "" : this.ah3702b);
        setAh3702c(ah3702d.equals("5") ? "" : this.ah3702c);
        setAh3702e(ah3702d.equals("5") ? "" : this.ah3702e);
        setAh3702f(ah3702d.equals("5") ? "" : this.ah3702f);
        setAh3702x(ah3702d.equals("5") ? "" : this.ah3702x);
        notifyPropertyChanged(BR.ah3702d);
    }

    @Bindable
    public String getAh3702f() {
        return ah3702f;
    }

    public void setAh3702f(String ah3702f) {
        if (this.ah3702f.equals(ah3702f)) return;     // For all checkboxes
        this.ah3702f = ah3702f;
        notifyPropertyChanged(BR.ah3702f);
    }

    @Bindable
    public String getAh3702x() {
        return ah3702x;
    }

    public void setAh3702x(String ah3702x) {
        if (this.ah3702x.equals(ah3702x)) return;     // For all checkboxes
        this.ah3702x = ah3702x;
        setAh3702xx(ah3702x.equals("96") ? this.ah3702xx : "");
        notifyPropertyChanged(BR.ah3702x);
    }

    @Bindable
    public String getAh3702xx() {
        return ah3702xx;
    }

    public void setAh3702xx(String ah3702xx) {
        this.ah3702xx = ah3702xx;
        notifyPropertyChanged(BR.ah3702xx);
    }

    @Bindable
    public String getAh3703() {
        return ah3703;
    }

    public void setAh3703(String ah3703) {
        this.ah3703 = ah3703;
        notifyPropertyChanged(BR.ah3703);
    }

    @Bindable
    public String getAh3703a() {
        return ah3703a;
    }

    public void setAh3703a(String ah3703a) {
        if (this.ah3703a.equals(ah3703a)) return;     // For all checkboxes
        this.ah3703a = ah3703a;
        notifyPropertyChanged(BR.ah3703a);
    }

    @Bindable
    public String getAh3703b() {
        return ah3703b;
    }

    public void setAh3703b(String ah3703b) {
        if (this.ah3703b.equals(ah3703b)) return;     // For all checkboxes
        this.ah3703b = ah3703b;
        notifyPropertyChanged(BR.ah3703b);
    }

    @Bindable
    public String getAh3703c() {
        return ah3703c;
    }

    public void setAh3703c(String ah3703c) {
        if (this.ah3703c.equals(ah3703c)) return;     // For all checkboxes
        this.ah3703c = ah3703c;
        notifyPropertyChanged(BR.ah3703c);
    }

    @Bindable
    public String getAh3703e() {
        return ah3703e;
    }

    public void setAh3703e(String ah3703e) {
        if (this.ah3703e.equals(ah3703e)) return;     // For all checkboxes
        this.ah3703e = ah3703e;
        notifyPropertyChanged(BR.ah3703e);
    }

    @Bindable
    public String getAh3703d() {
        return ah3703d;
    }

    public void setAh3703d(String ah3703d) {
        if (this.ah3703d.equals(ah3703d)) return;     // For all checkboxes
        this.ah3703d = ah3703d;
        setAh3703a(ah3703d.equals("5") ? "" : this.ah3703a);
        setAh3703b(ah3703d.equals("5") ? "" : this.ah3703b);
        setAh3703c(ah3703d.equals("5") ? "" : this.ah3703c);
        setAh3703e(ah3703d.equals("5") ? "" : this.ah3703e);
        setAh3703f(ah3703d.equals("5") ? "" : this.ah3703f);
        setAh3703x(ah3703d.equals("5") ? "" : this.ah3703x);
        notifyPropertyChanged(BR.ah3703d);
    }

    @Bindable
    public String getAh3703f() {
        return ah3703f;
    }

    public void setAh3703f(String ah3703f) {
        if (this.ah3703f.equals(ah3703f)) return;     // For all checkboxes
        this.ah3703f = ah3703f;
        notifyPropertyChanged(BR.ah3703f);
    }

    @Bindable
    public String getAh3703x() {
        return ah3703x;
    }

    public void setAh3703x(String ah3703x) {
        if (this.ah3703x.equals(ah3703x)) return;     // For all checkboxes
        this.ah3703x = ah3703x;
        setAh3703xx(ah3703x.equals("96") ? this.ah3703xx : "");
        notifyPropertyChanged(BR.ah3703x);
    }

    @Bindable
    public String getAh3703xx() {
        return ah3703xx;
    }

    public void setAh3703xx(String ah3703xx) {
        this.ah3703xx = ah3703xx;
        notifyPropertyChanged(BR.ah3703xx);
    }

    @Bindable
    public String getAh3704() {
        return ah3704;
    }

    public void setAh3704(String ah3704) {
        this.ah3704 = ah3704;
        notifyPropertyChanged(BR.ah3704);
    }

    @Bindable
    public String getAh3704a() {
        return ah3704a;
    }

    public void setAh3704a(String ah3704a) {
        if (this.ah3704a.equals(ah3704a)) return;     // For all checkboxes
        this.ah3704a = ah3704a;
        notifyPropertyChanged(BR.ah3704a);
    }

    @Bindable
    public String getAh3704b() {
        return ah3704b;
    }

    public void setAh3704b(String ah3704b) {
        if (this.ah3704b.equals(ah3704b)) return;     // For all checkboxes
        this.ah3704b = ah3704b;
        notifyPropertyChanged(BR.ah3704b);
    }

    @Bindable
    public String getAh3704c() {
        return ah3704c;
    }

    public void setAh3704c(String ah3704c) {
        if (this.ah3704c.equals(ah3704c)) return;     // For all checkboxes
        this.ah3704c = ah3704c;
        notifyPropertyChanged(BR.ah3704c);
    }

    @Bindable
    public String getAh3704e() {
        return ah3704e;
    }

    public void setAh3704e(String ah3704e) {
        if (this.ah3704e.equals(ah3704e)) return;     // For all checkboxes
        this.ah3704e = ah3704e;
        notifyPropertyChanged(BR.ah3704e);
    }

    @Bindable
    public String getAh3704d() {
        return ah3704d;
    }

    public void setAh3704d(String ah3704d) {
        if (this.ah3704d.equals(ah3704d)) return;     // For all checkboxes
        this.ah3704d = ah3704d;
        setAh3704a(ah3704d.equals("5") ? "" : this.ah3704a);
        setAh3704b(ah3704d.equals("5") ? "" : this.ah3704b);
        setAh3704c(ah3704d.equals("5") ? "" : this.ah3704c);
        setAh3704e(ah3704d.equals("5") ? "" : this.ah3704e);
        setAh3704f(ah3704d.equals("5") ? "" : this.ah3704f);
        setAh3704x(ah3704d.equals("5") ? "" : this.ah3704x);
        notifyPropertyChanged(BR.ah3704d);
    }

    @Bindable
    public String getAh3704f() {
        return ah3704f;
    }

    public void setAh3704f(String ah3704f) {
        if (this.ah3704f.equals(ah3704f)) return;     // For all checkboxes
        this.ah3704f = ah3704f;
        notifyPropertyChanged(BR.ah3704f);
    }

    @Bindable
    public String getAh3704x() {
        return ah3704x;
    }

    public void setAh3704x(String ah3704x) {
        if (this.ah3704x.equals(ah3704x)) return;     // For all checkboxes
        this.ah3704x = ah3704x;
        setAh3704xx(ah3704x.equals("96") ? this.ah3704xx : "");
        notifyPropertyChanged(BR.ah3704x);
    }

    @Bindable
    public String getAh3704xx() {
        return ah3704xx;
    }

    public void setAh3704xx(String ah3704xx) {
        this.ah3704xx = ah3704xx;
        notifyPropertyChanged(BR.ah3704xx);
    }

    @Bindable
    public String getAh3705() {
        return ah3705;
    }

    public void setAh3705(String ah3705) {
        this.ah3705 = ah3705;
        notifyPropertyChanged(BR.ah3705);
    }

    @Bindable
    public String getAh3705a() {
        return ah3705a;
    }

    public void setAh3705a(String ah3705a) {
        if (this.ah3705a.equals(ah3705a)) return;     // For all checkboxes
        this.ah3705a = ah3705a;
        notifyPropertyChanged(BR.ah3705a);
    }

    @Bindable
    public String getAh3705b() {
        return ah3705b;
    }

    public void setAh3705b(String ah3705b) {
        if (this.ah3705b.equals(ah3705b)) return;     // For all checkboxes
        this.ah3705b = ah3705b;
        notifyPropertyChanged(BR.ah3705b);
    }

    @Bindable
    public String getAh3705c() {
        return ah3705c;
    }

    public void setAh3705c(String ah3705c) {
        if (this.ah3705c.equals(ah3705c)) return;     // For all checkboxes
        this.ah3705c = ah3705c;
        notifyPropertyChanged(BR.ah3705c);
    }

    @Bindable
    public String getAh3705e() {
        return ah3705e;
    }

    public void setAh3705e(String ah3705e) {
        if (this.ah3705e.equals(ah3705e)) return;     // For all checkboxes
        this.ah3705e = ah3705e;
        notifyPropertyChanged(BR.ah3705e);
    }

    @Bindable
    public String getAh3705d() {
        return ah3705d;
    }

    public void setAh3705d(String ah3705d) {
        if (this.ah3705d.equals(ah3705d)) return;     // For all checkboxes
        this.ah3705d = ah3705d;
        setAh3705a(ah3705d.equals("5") ? "" : this.ah3705a);
        setAh3705b(ah3705d.equals("5") ? "" : this.ah3705b);
        setAh3705c(ah3705d.equals("5") ? "" : this.ah3705c);
        setAh3705e(ah3705d.equals("5") ? "" : this.ah3705e);
        setAh3705f(ah3705d.equals("5") ? "" : this.ah3705f);
        setAh3705x(ah3705d.equals("5") ? "" : this.ah3705x);
        notifyPropertyChanged(BR.ah3705d);
    }

    @Bindable
    public String getAh3705f() {
        return ah3705f;
    }

    public void setAh3705f(String ah3705f) {
        if (this.ah3705f.equals(ah3705f)) return;     // For all checkboxes
        this.ah3705f = ah3705f;
        notifyPropertyChanged(BR.ah3705f);
    }

    @Bindable
    public String getAh3705x() {
        return ah3705x;
    }

    public void setAh3705x(String ah3705x) {
        if (this.ah3705x.equals(ah3705x)) return;     // For all checkboxes
        this.ah3705x = ah3705x;
        setAh3705xx(ah3705x.equals("96") ? this.ah3705xx : "");
        notifyPropertyChanged(BR.ah3705x);
    }

    @Bindable
    public String getAh3705xx() {
        return ah3705xx;
    }

    public void setAh3705xx(String ah3705xx) {
        this.ah3705xx = ah3705xx;
        notifyPropertyChanged(BR.ah3705xx);
    }

    @Bindable
    public String getAh3706() {
        return ah3706;
    }

    public void setAh3706(String ah3706) {
        this.ah3706 = ah3706;
        notifyPropertyChanged(BR.ah3706);
    }

    @Bindable
    public String getAh3706a() {
        return ah3706a;
    }

    public void setAh3706a(String ah3706a) {
        if (this.ah3706a.equals(ah3706a)) return;     // For all checkboxes
        this.ah3706a = ah3706a;
        notifyPropertyChanged(BR.ah3706a);
    }

    @Bindable
    public String getAh3706b() {
        return ah3706b;
    }

    public void setAh3706b(String ah3706b) {
        if (this.ah3706b.equals(ah3706b)) return;     // For all checkboxes
        this.ah3706b = ah3706b;
        notifyPropertyChanged(BR.ah3706b);
    }

    @Bindable
    public String getAh3706c() {
        return ah3706c;
    }

    public void setAh3706c(String ah3706c) {
        if (this.ah3706c.equals(ah3706c)) return;     // For all checkboxes
        this.ah3706c = ah3706c;
        notifyPropertyChanged(BR.ah3706c);
    }

    @Bindable
    public String getAh3706e() {
        return ah3706e;
    }

    public void setAh3706e(String ah3706e) {
        if (this.ah3706e.equals(ah3706e)) return;     // For all checkboxes
        this.ah3706e = ah3706e;
        notifyPropertyChanged(BR.ah3706e);
    }

    @Bindable
    public String getAh3706d() {
        return ah3706d;
    }

    public void setAh3706d(String ah3706d) {
        if (this.ah3706d.equals(ah3706d)) return;     // For all checkboxes
        this.ah3706d = ah3706d;
        setAh3706a(ah3706d.equals("5") ? "" : this.ah3706a);
        setAh3706b(ah3706d.equals("5") ? "" : this.ah3706b);
        setAh3706c(ah3706d.equals("5") ? "" : this.ah3706c);
        setAh3706e(ah3706d.equals("5") ? "" : this.ah3706e);
        setAh3706f(ah3706d.equals("5") ? "" : this.ah3706f);
        setAh3706x(ah3706d.equals("5") ? "" : this.ah3706x);
        notifyPropertyChanged(BR.ah3706d);
    }

    @Bindable
    public String getAh3706f() {
        return ah3706f;
    }

    public void setAh3706f(String ah3706f) {
        if (this.ah3706f.equals(ah3706f)) return;     // For all checkboxes
        this.ah3706f = ah3706f;
        notifyPropertyChanged(BR.ah3706f);
    }

    @Bindable
    public String getAh3706x() {
        return ah3706x;
    }

    public void setAh3706x(String ah3706x) {
        if (this.ah3706x.equals(ah3706x)) return;     // For all checkboxes
        this.ah3706x = ah3706x;
        setAh3706xx(ah3706x.equals("96") ? this.ah3706xx : "");
        notifyPropertyChanged(BR.ah3706x);
    }

    @Bindable
    public String getAh3706xx() {
        return ah3706xx;
    }

    public void setAh3706xx(String ah3706xx) {
        this.ah3706xx = ah3706xx;
        notifyPropertyChanged(BR.ah3706xx);
    }

    @Bindable
    public String getAh37aa() {
        return ah37aa;
    }

    public void setAh37aa(String ah37aa) {
        if (this.ah37aa.equals(ah37aa)) return;     // For all checkboxes
        this.ah37aa = ah37aa;
        notifyPropertyChanged(BR.ah37aa);
    }

    @Bindable
    public String getAh37ab() {
        return ah37ab;
    }

    public void setAh37ab(String ah37ab) {
        if (this.ah37ab.equals(ah37ab)) return;     // For all checkboxes
        this.ah37ab = ah37ab;
        notifyPropertyChanged(BR.ah37ab);
    }

    @Bindable
    public String getAh37ac() {
        return ah37ac;
    }

    public void setAh37ac(String ah37ac) {
        if (this.ah37ac.equals(ah37ac)) return;     // For all checkboxes
        this.ah37ac = ah37ac;
        boolean b = ah37ac.length() > 0 && Integer.parseInt(ah37ac) < 14;
        setAh38(b ? "" : this.ah38);
        setAh38aa(b ? "" : this.ah38aa);

        setAh39a(b ? "" : this.ah39a);
        setAh39b(b ? "" : this.ah39b);
        setAh39c(b ? "" : this.ah39c);
        setAh39d(b ? "" : this.ah39d);
        setAh39x(b ? "" : this.ah39x);

        setAh40a(b ? "" : this.ah40a);
        setAh40b(b ? "" : this.ah40b);
        setAh40c(b ? "" : this.ah40c);
        setAh40d(b ? "" : this.ah40d);
        setAh40e(b ? "" : this.ah40e);

        setAh40aaa(b ? "" : this.ah40aaa);
        setAh40aab(b ? "" : this.ah40aab);
        setAh40aac(b ? "" : this.ah40aac);
        setAh40aad(b ? "" : this.ah40aad);
        setAh40aae(b ? "" : this.ah40aae);
        setAh40aaf(b ? "" : this.ah40aaf);
        setAh40aag(b ? "" : this.ah40aag);
        setAh40aah(b ? "" : this.ah40aah);
        setAh40aax(b ? "" : this.ah40aax);

        setAh41(b ? "" : this.ah41);
        setAh42(b ? "" : this.ah42);
        setAh43(b ? "" : this.ah43);

        setAh44a(b ? "" : this.ah44a);
        setAh44b(b ? "" : this.ah44b);
        setAh44c(b ? "" : this.ah44c);
        setAh44d(b ? "" : this.ah44d);
        setAh44e(b ? "" : this.ah44e);
        setAh44f(b ? "" : this.ah44f);
        setAh44g(b ? "" : this.ah44g);
        setAh44h(b ? "" : this.ah44h);
        setAh44i(b ? "" : this.ah44i);

        setAh45(b ? "" : this.ah45);
        setAh46(b ? "" : this.ah46);
        setAh47d(b ? "" : this.ah47d);
        setAh48(b ? "" : this.ah48);

        notifyPropertyChanged(BR.ah37ac);
    }

    @Bindable
    public String getAh38() {
        return ah38;
    }

    public void setAh38(String ah38) {
        this.ah38 = ah38;
        notifyPropertyChanged(BR.ah38);
    }

    @Bindable
    public String getAh38aa() {
        return ah38aa;
    }

    public void setAh38aa(String ah38aa) {
        this.ah38aa = ah38aa;
        notifyPropertyChanged(BR.ah38aa);
    }

    @Bindable
    public String getAh39() {
        return ah39;
    }

    public void setAh39(String ah39) {
        this.ah39 = ah39;
        notifyPropertyChanged(BR.ah39);
    }

    @Bindable
    public String getAh39a() {
        return ah39a;
    }

    public void setAh39a(String ah39a) {
        if (this.ah39a.equals(ah39a)) return;     // For all checkboxes
        this.ah39a = ah39a;
        notifyPropertyChanged(BR.ah39a);
    }

    @Bindable
    public String getAh39b() {
        return ah39b;
    }

    public void setAh39b(String ah39b) {
        if (this.ah39b.equals(ah39b)) return;     // For all checkboxes
        this.ah39b = ah39b;
        notifyPropertyChanged(BR.ah39b);
    }

    @Bindable
    public String getAh39c() {
        return ah39c;
    }

    public void setAh39c(String ah39c) {
        if (this.ah39c.equals(ah39c)) return;     // For all checkboxes
        this.ah39c = ah39c;
        notifyPropertyChanged(BR.ah39c);
    }

    @Bindable
    public String getAh39d() {
        return ah39d;
    }

    public void setAh39d(String ah39d) {
        if (this.ah39d.equals(ah39d)) return;     // For all checkboxes
        this.ah39d = ah39d;
        setAh39a(ah39d.equals("4") ? "" : this.ah39a);
        setAh39b(ah39d.equals("4") ? "" : this.ah39b);
        setAh39c(ah39d.equals("4") ? "" : this.ah39c);
        setAh39x(ah39d.equals("4") ? "" : this.ah39x);
        notifyPropertyChanged(BR.ah39d);
    }

    @Bindable
    public String getAh39x() {
        return ah39x;
    }

    public void setAh39x(String ah39x) {
        if (this.ah39x.equals(ah39x)) return;     // For all checkboxes
        this.ah39x = ah39x;
        setAh39xx(ah39x.equals("96") ? this.ah39xx : "");
        notifyPropertyChanged(BR.ah39x);
    }

    @Bindable
    public String getAh39xx() {
        return ah39xx;
    }

    public void setAh39xx(String ah39xx) {
        this.ah39xx = ah39xx;
        notifyPropertyChanged(BR.ah39xx);
    }

    @Bindable
    public String getAh40() {
        return ah40;
    }

    public void setAh40(String ah40) {
        this.ah40 = ah40;
        notifyPropertyChanged(BR.ah40);
    }

    @Bindable
    public String getAh40a() {
        return ah40a;
    }

    public void setAh40a(String ah40a) {
        if (this.ah40a.equals(ah40a)) return;     // For all checkboxes
        this.ah40a = ah40a;
        notifyPropertyChanged(BR.ah40a);
    }

    @Bindable
    public String getAh40b() {
        return ah40b;
    }

    public void setAh40b(String ah40b) {
        if (this.ah40b.equals(ah40b)) return;     // For all checkboxes
        this.ah40b = ah40b;
        notifyPropertyChanged(BR.ah40b);
    }

    @Bindable
    public String getAh40c() {
        return ah40c;
    }

    public void setAh40c(String ah40c) {
        if (this.ah40c.equals(ah40c)) return;     // For all checkboxes
        this.ah40c = ah40c;
        notifyPropertyChanged(BR.ah40c);
    }

    @Bindable
    public String getAh40d() {
        return ah40d;
    }

    public void setAh40d(String ah40d) {
        if (this.ah40d.equals(ah40d)) return;     // For all checkboxes
        this.ah40d = ah40d;
        notifyPropertyChanged(BR.ah40d);
    }

    @Bindable
    public String getAh40e() {
        return ah40e;
    }

    public void setAh40e(String ah40e) {
        if (this.ah40e.equals(ah40e)) return;     // For all checkboxes
        this.ah40e = ah40e;
        notifyPropertyChanged(BR.ah40e);
    }

    @Bindable
    public String getAh40f() {
        return ah40f;
    }

    public void setAh40f(String ah40f) {
        if (this.ah40f.equals(ah40f)) return;     // For all checkboxes
        this.ah40f = ah40f;
        notifyPropertyChanged(BR.ah40f);
    }

    @Bindable
    public String getAh40g() {
        return ah40g;
    }

    public void setAh40g(String ah40g) {
        if (this.ah40g.equals(ah40g)) return;     // For all checkboxes
        this.ah40g = ah40g;
        notifyPropertyChanged(BR.ah40g);
    }

    @Bindable
    public String getAh40h() {
        return ah40h;
    }

    public void setAh40h(String ah40h) {
        if (this.ah40h.equals(ah40h)) return;     // For all checkboxes
        this.ah40h = ah40h;
        notifyPropertyChanged(BR.ah40h);
    }

    @Bindable
    public String getAh40x() {
        return ah40x;
    }

    public void setAh40x(String ah40x) {
        if (this.ah40x.equals(ah40x)) return;     // For all checkboxes
        this.ah40x = ah40x;
        setAh40xx(ah40x.equals("96") ? this.ah40xx : "");
        notifyPropertyChanged(BR.ah40x);
    }

    @Bindable
    public String getAh40xx() {
        return ah40xx;
    }

    public void setAh40xx(String ah40xx) {
        this.ah40xx = ah40xx;
        notifyPropertyChanged(BR.ah40xx);
    }

    @Bindable
    public String getAh40aa() {
        return ah40aa;
    }

    public void setAh40aa(String ah40aa) {
        this.ah40aa = ah40aa;
        notifyPropertyChanged(BR.ah40aa);
    }

    @Bindable
    public String getAh40aaa() {
        return ah40aaa;
    }

    public void setAh40aaa(String ah40aaa) {
        if (this.ah40aaa.equals(ah40aaa)) return;     // For all checkboxes
        this.ah40aaa = ah40aaa;
        notifyPropertyChanged(BR.ah40aaa);
    }

    @Bindable
    public String getAh40aab() {
        return ah40aab;
    }

    public void setAh40aab(String ah40aab) {
        if (this.ah40aab.equals(ah40aab)) return;     // For all checkboxes
        this.ah40aab = ah40aab;
        notifyPropertyChanged(BR.ah40aab);
    }

    @Bindable
    public String getAh40aac() {
        return ah40aac;
    }

    public void setAh40aac(String ah40aac) {
        if (this.ah40aac.equals(ah40aac)) return;     // For all checkboxes
        this.ah40aac = ah40aac;
        notifyPropertyChanged(BR.ah40aac);
    }

    @Bindable
    public String getAh40aad() {
        return ah40aad;
    }

    public void setAh40aad(String ah40aad) {
        if (this.ah40aad.equals(ah40aad)) return;     // For all checkboxes
        this.ah40aad = ah40aad;
        notifyPropertyChanged(BR.ah40aad);
    }

    @Bindable
    public String getAh40aae() {
        return ah40aae;
    }

    public void setAh40aae(String ah40aae) {
        if (this.ah40aae.equals(ah40aae)) return;     // For all checkboxes
        this.ah40aae = ah40aae;
        notifyPropertyChanged(BR.ah40aae);
    }

    @Bindable
    public String getAh40aaf() {
        return ah40aaf;
    }

    public void setAh40aaf(String ah40aaf) {
        if (this.ah40aaf.equals(ah40aaf)) return;     // For all checkboxes
        this.ah40aaf = ah40aaf;
        notifyPropertyChanged(BR.ah40aaf);
    }

    @Bindable
    public String getAh40aag() {
        return ah40aag;
    }

    public void setAh40aag(String ah40aag) {
        if (this.ah40aag.equals(ah40aag)) return;     // For all checkboxes
        this.ah40aag = ah40aag;
        notifyPropertyChanged(BR.ah40aag);
    }

    @Bindable
    public String getAh40aah() {
        return ah40aah;
    }

    public void setAh40aah(String ah40aah) {
        if (this.ah40aah.equals(ah40aah)) return;     // For all checkboxes
        this.ah40aah = ah40aah;
        notifyPropertyChanged(BR.ah40aah);
    }

    @Bindable
    public String getAh40aax() {
        return ah40aax;
    }

    public void setAh40aax(String ah40aax) {
        if (this.ah40aax.equals(ah40aax)) return;     // For all checkboxes
        this.ah40aax = ah40aax;
        setAh40aaxx(ah40aax.equals("96") ? this.ah40aaxx : "");
        notifyPropertyChanged(BR.ah40aax);
    }

    @Bindable
    public String getAh40aaxx() {
        return ah40aaxx;
    }

    public void setAh40aaxx(String ah40aaxx) {
        this.ah40aaxx = ah40aaxx;
        notifyPropertyChanged(BR.ah40aaxx);
    }

    @Bindable
    public String getAh41() {
        return ah41;
    }

    public void setAh41(String ah41) {
        this.ah41 = ah41;
        setAh42(ah41.equals("1") ? this.ah42 : "");
        notifyPropertyChanged(BR.ah41);
    }

    @Bindable
    public String getAh42() {
        return ah42;
    }

    public void setAh42(String ah42) {
        this.ah42 = ah42;
        setAh43(ah42.equals(2) ? "" : this.ah43);
        setAh44a(ah42.equals("2") ? "" : this.ah44a);
        setAh44b(ah42.equals("2") ? "" : this.ah44b);
        setAh44c(ah42.equals("2") ? "" : this.ah44c);
        setAh44d(ah42.equals("2") ? "" : this.ah44d);
        setAh44e(ah42.equals("2") ? "" : this.ah44e);
        setAh44f(ah42.equals("2") ? "" : this.ah44f);
        setAh44g(ah42.equals("2") ? "" : this.ah44g);
        setAh44h(ah42.equals("2") ? "" : this.ah44h);
        setAh44i(ah42.equals("2") ? "" : this.ah44i);
        notifyPropertyChanged(BR.ah42);
    }

    @Bindable
    public String getAh43() {
        return ah43;
    }

    public void setAh43(String ah43) {
        this.ah43 = ah43;
        setAh44a(ah43.equals("1") ? this.ah44a : "");
        setAh44b(ah43.equals("1") ? this.ah44b : "");
        setAh44c(ah43.equals("1") ? this.ah44c : "");
        setAh44d(ah43.equals("1") ? this.ah44d : "");
        setAh44e(ah43.equals("1") ? this.ah44e : "");
        setAh44f(ah43.equals("1") ? this.ah44f : "");
        setAh44g(ah43.equals("1") ? this.ah44g : "");
        setAh44h(ah43.equals("1") ? this.ah44h : "");
        setAh44i(ah43.equals("1") ? this.ah44i : "");
        notifyPropertyChanged(BR.ah43);
    }

    @Bindable
    public String getAh44() {
        return ah44;
    }

    public void setAh44(String ah44) {
        this.ah44 = ah44;
        notifyPropertyChanged(BR.ah44);
    }

    @Bindable
    public String getAh44a() {
        return ah44a;
    }

    public void setAh44a(String ah44a) {
        if (this.ah44a.equals(ah44a)) return;     // For all checkboxes
        this.ah44a = ah44a;
        notifyPropertyChanged(BR.ah44a);
    }

    @Bindable
    public String getAh44b() {
        return ah44b;
    }

    public void setAh44b(String ah44b) {
        if (this.ah44b.equals(ah44b)) return;     // For all checkboxes
        this.ah44b = ah44b;
        notifyPropertyChanged(BR.ah44b);
    }

    @Bindable
    public String getAh44c() {
        return ah44c;
    }

    public void setAh44c(String ah44c) {
        if (this.ah44c.equals(ah44c)) return;     // For all checkboxes
        this.ah44c = ah44c;
        notifyPropertyChanged(BR.ah44c);
    }

    @Bindable
    public String getAh44d() {
        return ah44d;
    }

    public void setAh44d(String ah44d) {
        if (this.ah44d.equals(ah44d)) return;     // For all checkboxes
        this.ah44d = ah44d;
        notifyPropertyChanged(BR.ah44d);
    }

    @Bindable
    public String getAh44e() {
        return ah44e;
    }

    public void setAh44e(String ah44e) {
        if (this.ah44e.equals(ah44e)) return;     // For all checkboxes
        this.ah44e = ah44e;
        notifyPropertyChanged(BR.ah44e);
    }

    @Bindable
    public String getAh44f() {
        return ah44f;
    }

    public void setAh44f(String ah44f) {
        if (this.ah44f.equals(ah44f)) return;     // For all checkboxes
        this.ah44f = ah44f;
        notifyPropertyChanged(BR.ah44f);
    }

    @Bindable
    public String getAh44g() {
        return ah44g;
    }

    public void setAh44g(String ah44g) {
        if (this.ah44g.equals(ah44g)) return;     // For all checkboxes
        this.ah44g = ah44g;
        notifyPropertyChanged(BR.ah44g);
    }

    @Bindable
    public String getAh44h() {
        return ah44h;
    }

    public void setAh44h(String ah44h) {
        if (this.ah44h.equals(ah44h)) return;     // For all checkboxes
        this.ah44h = ah44h;
        notifyPropertyChanged(BR.ah44h);
    }

    @Bindable
    public String getAh44i() {
        return ah44i;
    }

    public void setAh44i(String ah44i) {
        if (this.ah44i.equals(ah44i)) return;     // For all checkboxes
        this.ah44i = ah44i;
        notifyPropertyChanged(BR.ah44i);
    }

    @Bindable
    public String getAh45() {
        return ah45;
    }

    public void setAh45(String ah45) {
        this.ah45 = ah45;
        setAh46(ah45.equals("1") ? this.ah46 : "");
        setAh47d(ah45.equals("1") ? this.ah47d : "");
        setAh48(ah45.equals("1") ? this.ah48 : "");
        notifyPropertyChanged(BR.ah45);
    }

    @Bindable
    public String getAh46() {
        return ah46;
    }

    public void setAh46(String ah46) {
        this.ah46 = ah46;
        notifyPropertyChanged(BR.ah46);
    }

    @Bindable
    public String getAh47d() {
        return ah47d;
    }

    public void setAh47d(String ah47d) {
        this.ah47d = ah47d;
        notifyPropertyChanged(BR.ah47d);
    }

    @Bindable
    public String getAh48() {
        return ah48;
    }

    public void setAh48(String ah48) {
        this.ah48 = ah48;
        notifyPropertyChanged(BR.ah48);
    }

    @Bindable
    public String getAh49a() {
        return ah49a;
    }

    public void setAh49a(String ah49a) {
        if (this.ah49a.equals(ah49a)) return;
        this.ah49a = ah49a;
        setAh49ax(ah49a.equals("1") ? this.ah49ax : "");
        notifyPropertyChanged(BR.ah49a);
    }

    @Bindable
    public String getAh49ax() {
        return ah49ax;
    }

    public void setAh49ax(String ah49ax) {
        this.ah49ax = ah49ax;
        notifyPropertyChanged(BR.ah49ax);
    }

    @Bindable
    public String getAh49b() {
        return ah49b;
    }

    public void setAh49b(String ah49b) {
        if (this.ah49b.equals(ah49b)) return;
        this.ah49b = ah49b;
        setAh49bx(ah49b.equals("2") ? this.ah49bx : "");
        notifyPropertyChanged(BR.ah49b);
    }

    @Bindable
    public String getAh49bx() {
        return ah49bx;
    }

    public void setAh49bx(String ah49bx) {
        this.ah49bx = ah49bx;
        notifyPropertyChanged(BR.ah49bx);
    }

    @Bindable
    public String getAh49c() {
        return ah49c;
    }

    public void setAh49c(String ah49c) {
        if (this.ah49c.equals(ah49c)) return;
        this.ah49c = ah49c;
        setAh49a(ah49c.equals("98") ? "" : this.ah49a);
        setAh49b(ah49c.equals("98") ? "" : this.ah49b);
        notifyPropertyChanged(BR.ah49c);
    }

    @Bindable
    public String getAh50() {
        return ah50;
    }

    public void setAh50(String ah50) {
        this.ah50 = ah50;
        notifyPropertyChanged(BR.ah50);
    }

    @Bindable
    public String getAh50aaa() {
        return ah50aaa;
    }

    public void setAh50aaa(String ah50aaa) {
        this.ah50aaa = ah50aaa;
        notifyPropertyChanged(BR.ah50aaa);
    }

    @Bindable
    public String getAh50aab() {
        return ah50aab;
    }

    public void setAh50aab(String ah50aab) {
        this.ah50aab = ah50aab;
        notifyPropertyChanged(BR.ah50aab);
    }

    @Bindable
    public String getAh51() {
        return ah51;
    }

    public void setAh51(String ah51) {
        this.ah51 = ah51;
        notifyPropertyChanged(BR.ah51);
    }

    @Bindable
    public String getAh52a() {
        return ah52a;
    }

    public void setAh52a(String ah52a) {
        this.ah52a = ah52a;
        notifyPropertyChanged(BR.ah52a);
    }

    @Bindable
    public String getAh53() {
        return ah53;
    }

    public void setAh53(String ah53) {
        this.ah53 = ah53;
        notifyPropertyChanged(BR.ah53);
    }

    @Bindable
    public String getAh54() {
        return ah54;
    }

    public void setAh54(String ah54) {
        this.ah54 = ah54;
        notifyPropertyChanged(BR.ah54);
    }

    @Bindable
    public String getAh54ax() {
        return ah54ax;
    }

    public void setAh54ax(String ah54ax) {
        this.ah54ax = ah54ax;
        notifyPropertyChanged(BR.ah54ax);
    }

    @Bindable
    public String getAh55() {
        return ah55;
    }

    public void setAh55(String ah55) {
        this.ah55 = ah55;
        notifyPropertyChanged(BR.ah55);
    }

    @Bindable
    public String getAh56a() {
        return ah56a;
    }

    public void setAh56a(String ah56a) {
        this.ah56a = ah56a;
        notifyPropertyChanged(BR.ah56a);
    }

    @Bindable
    public String getAh57() {
        return ah57;
    }

    public void setAh57(String ah57) {
        this.ah57 = ah57;
        notifyPropertyChanged(BR.ah57);
    }

    @Bindable
    public String getAh57ax() {
        return ah57ax;
    }

    public void setAh57ax(String ah57ax) {
        this.ah57ax = ah57ax;
        notifyPropertyChanged(BR.ah57ax);
    }

    @Bindable
    public String getAh58a() {
        return ah58a;
    }

    public void setAh58a(String ah58a) {
        this.ah58a = ah58a;
        notifyPropertyChanged(BR.ah58a);
    }

    @Bindable
    public String getAh59a() {
        return ah59a;
    }

    public void setAh59a(String ah59a) {
        this.ah59a = ah59a;
        notifyPropertyChanged(BR.ah59a);
    }

    @Bindable
    public String getAh59b() {
        return ah59b;
    }

    public void setAh59b(String ah59b) {
        this.ah59b = ah59b;
        notifyPropertyChanged(BR.ah59b);
    }

    @Bindable
    public String getAh59c() {
        return ah59c;
    }

    public void setAh59c(String ah59c) {
        this.ah59c = ah59c;
        notifyPropertyChanged(BR.ah59c);
    }

    @Bindable
    public String getAh59d() {
        return ah59d;
    }

    public void setAh59d(String ah59d) {
        this.ah59d = ah59d;
        setAh59a(ah59d.equals("98") ? "" : this.ah59a);
        setAh59b(ah59d.equals("98") ? "" : this.ah59b);
        setAh59c(ah59d.equals("98") ? "" : this.ah59c);
        notifyPropertyChanged(BR.ah59d);
    }

    @Bindable
    public String getAh60a() {
        return ah60a;
    }

    public void setAh60a(String ah60a) {
        this.ah60a = ah60a;
        notifyPropertyChanged(BR.ah60a);
    }


    public Adolescent Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_INDEXED));
        this.name = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_HHID));
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

        sAH1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH1)));
        sAH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH2)));
        sAH3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH3)));
        sAH4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH4)));
        sAH5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH5)));
        sAH6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH6)));
        sAH7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH7)));

        return this;
    }

    public void sAH1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah1 = json.getString("ah1");
            this.ah2 = json.getString("ah2");
            this.ah3 = json.getString("ah3");
            this.ah396x = json.getString("ah396x");
            this.ah4a = json.getString("ah4a");
            this.ah5 = json.getString("ah5");
            this.ah6 = json.getString("ah6");
            this.ah7a = json.getString("ah7a");
            this.ah7b = json.getString("ah7b");
            this.ah7c = json.getString("ah7c");
            this.ah7d = json.getString("ah7d");
            this.ah7e = json.getString("ah7e");
            this.ah7f = json.getString("ah7f");
            this.ah7g = json.getString("ah7g");
            this.ah7h = json.getString("ah7h");
            this.ah796 = json.getString("ah796");
            this.ah796x = json.getString("ah796x");
        }
    }

    public void sAH2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah8 = json.getString("ah8");
            this.ah9 = json.getString("ah9");
            this.ah10 = json.getString("ah10");
            this.ah11a = json.getString("ah11a");
            this.ah12 = json.getString("ah12");
            this.ah13 = json.getString("ah13");
            this.ah13aa = json.getString("ah13aa");
            this.ah13ab = json.getString("ah13ab");
        }
    }

    public void sAH3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah14 = json.getString("ah14");
            this.ah15 = json.getString("ah15");
            this.ah16 = json.getString("ah16");
            this.ah17 = json.getString("ah17");
            this.ah18 = json.getString("ah18");
            this.ah19 = json.getString("ah19");
            this.ah20 = json.getString("ah20");
            this.ah21 = json.getString("ah21");
            this.ah2102 = json.getString("ah2102");
            this.ah2201 = json.getString("ah2201");
            this.ah2202 = json.getString("ah2202");
            this.ah2203 = json.getString("ah2203");
            this.ah2296 = json.getString("ah2296");
            this.ah2296x = json.getString("ah2296x");
            this.ah23 = json.getString("ah23");
            this.ah2301x = json.getString("ah2301x");
            this.ah2302x = json.getString("ah2302x");
            this.ah2303x = json.getString("ah2303x");
            this.ah2401 = json.getString("ah2401");
            this.ah2402 = json.getString("ah2402");
            this.ah2403 = json.getString("ah2403");
            this.ah2404 = json.getString("ah2404");
            this.ah2405 = json.getString("ah2405");
            this.ah2406 = json.getString("ah2406");
            this.ah2407 = json.getString("ah2407");
            this.ah2408 = json.getString("ah2408");
            this.ah2409 = json.getString("ah2409");
            this.ah2410 = json.getString("ah2410");
            this.ah2411 = json.getString("ah2411");
            this.ah24a = json.getString("ah24a");
            this.ah25 = json.getString("ah25");
            this.ah26 = json.getString("ah26");
            this.ah2696x = json.getString("ah2696x");
            this.ah27 = json.getString("ah27");
            this.ah28 = json.getString("ah28");
            this.ah29 = json.getString("ah29");
            this.ah3001 = json.getString("ah3001");
            this.ah3002 = json.getString("ah3002");
            this.ah3003 = json.getString("ah3003");
            this.ah31 = json.getString("ah31");
        }
    }

    public void sAH4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah3201 = json.getString("ah3201");
            this.ah3202 = json.getString("ah3202");
            this.ah3203 = json.getString("ah3203");
            this.ah3204 = json.getString("ah3204");
            this.ah3205 = json.getString("ah3205");
        }
    }

    public void sAH5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah33a = json.getString("ah33a");
            this.ah33b = json.getString("ah33b");
            this.ah33c = json.getString("ah33c");
            this.ah3398 = json.getString("ah3398");
            this.ah34 = json.getString("ah34");
            this.ah35a = json.getString("ah35a");
            this.ah35b = json.getString("ah35b");
            this.ah35c = json.getString("ah35c");
            this.ah35d = json.getString("ah35d");
            this.ah35e = json.getString("ah35e");
            this.ah35f = json.getString("ah35f");
            this.ah35g = json.getString("ah35g");
            this.ah35h = json.getString("ah35h");
            this.ah35i = json.getString("ah35i");
            this.ah35j = json.getString("ah35j");
            this.ah36 = json.getString("ah36");
            this.ah36ax = json.getString("ah36ax");
        }
    }

    public void sAH6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah3701 = json.getString("ah3701");
            this.ah3701a = json.getString("ah3701a");
            this.ah3701b = json.getString("ah3701b");
            this.ah3701c = json.getString("ah3701c");
            this.ah3701d = json.getString("ah3701d");
            this.ah3701e = json.getString("ah3701e");
            this.ah3701f = json.getString("ah3701f");
            this.ah3701x = json.getString("ah3701x");
            this.ah3701xx = json.getString("ah3701xx");
            this.ah3702 = json.getString("ah3702");
            this.ah3702a = json.getString("ah3702a");
            this.ah3702b = json.getString("ah3702b");
            this.ah3702c = json.getString("ah3702c");
            this.ah3702e = json.getString("ah3702e");
            this.ah3702d = json.getString("ah3702d");
            this.ah3702f = json.getString("ah3702f");
            this.ah3702x = json.getString("ah3702x");
            this.ah3702xx = json.getString("ah3702xx");
            this.ah3703 = json.getString("ah3703");
            this.ah3703a = json.getString("ah3703a");
            this.ah3703b = json.getString("ah3703b");
            this.ah3703c = json.getString("ah3703c");
            this.ah3703e = json.getString("ah3703e");
            this.ah3703d = json.getString("ah3703d");
            this.ah3703f = json.getString("ah3703f");
            this.ah3703x = json.getString("ah3703x");
            this.ah3703xx = json.getString("ah3703xx");
            this.ah3704 = json.getString("ah3704");
            this.ah3704a = json.getString("ah3704a");
            this.ah3704b = json.getString("ah3704b");
            this.ah3704c = json.getString("ah3704c");
            this.ah3704e = json.getString("ah3704e");
            this.ah3704d = json.getString("ah3704d");
            this.ah3704f = json.getString("ah3704f");
            this.ah3704x = json.getString("ah3704x");
            this.ah3704xx = json.getString("ah3704xx");
            this.ah3705 = json.getString("ah3705");
            this.ah3705a = json.getString("ah3705a");
            this.ah3705b = json.getString("ah3705b");
            this.ah3705c = json.getString("ah3705c");
            this.ah3705e = json.getString("ah3705e");
            this.ah3705d = json.getString("ah3705d");
            this.ah3705f = json.getString("ah3705f");
            this.ah3705x = json.getString("ah3705x");
            this.ah3705xx = json.getString("ah3705xx");
            this.ah3706 = json.getString("ah3706");
            this.ah3706a = json.getString("ah3706a");
            this.ah3706b = json.getString("ah3706b");
            this.ah3706c = json.getString("ah3706c");
            this.ah3706e = json.getString("ah3706e");
            this.ah3706d = json.getString("ah3706d");
            this.ah3706f = json.getString("ah3706f");
            this.ah3706x = json.getString("ah3706x");
            this.ah3706xx = json.getString("ah3706xx");
            this.ah37aa = json.getString("ah37aa");
            this.ah37ab = json.getString("ah37ab");
            this.ah37ac = json.getString("ah37ac");
            this.ah38 = json.getString("ah38");
            this.ah38aa = json.getString("ah38aa");
            this.ah39 = json.getString("ah39");
            this.ah39a = json.getString("ah39a");
            this.ah39b = json.getString("ah39b");
            this.ah39c = json.getString("ah39c");
            this.ah39d = json.getString("ah39d");
            this.ah39x = json.getString("ah39x");
            this.ah39xx = json.getString("ah39xx");
            this.ah40 = json.getString("ah40");
            this.ah40a = json.getString("ah40a");
            this.ah40b = json.getString("ah40b");
            this.ah40c = json.getString("ah40c");
            this.ah40d = json.getString("ah40d");
            this.ah40e = json.getString("ah40e");
            this.ah40f = json.getString("ah40f");
            this.ah40g = json.getString("ah40g");
            this.ah40h = json.getString("ah40h");
            this.ah40x = json.getString("ah40x");
            this.ah40xx = json.getString("ah40xx");
            this.ah40aa = json.getString("ah40aa");
            this.ah40aaa = json.getString("ah40aaa");
            this.ah40aab = json.getString("ah40aab");
            this.ah40aac = json.getString("ah40aac");
            this.ah40aad = json.getString("ah40aad");
            this.ah40aae = json.getString("ah40aae");
            this.ah40aaf = json.getString("ah40aaf");
            this.ah40aag = json.getString("ah40aag");
            this.ah40aah = json.getString("ah40aah");
            this.ah40aax = json.getString("ah40aax");
            this.ah40aaxx = json.getString("ah40aaxx");
            this.ah41 = json.getString("ah41");
            this.ah42 = json.getString("ah42");
            this.ah43 = json.getString("ah43");
            this.ah44 = json.getString("ah44");
            this.ah44a = json.getString("ah44a");
            this.ah44b = json.getString("ah44b");
            this.ah44c = json.getString("ah44c");
            this.ah44d = json.getString("ah44d");
            this.ah44e = json.getString("ah44e");
            this.ah44f = json.getString("ah44f");
            this.ah44g = json.getString("ah44g");
            this.ah44h = json.getString("ah44h");
            this.ah44i = json.getString("ah44i");
            this.ah45 = json.getString("ah45");
            this.ah46 = json.getString("ah46");
            this.ah47d = json.getString("ah47d");
            this.ah48 = json.getString("ah48");
        }
    }

    public void sAH7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah49a = json.getString("ah49a");
            this.ah49b = json.getString("ah49b");
            this.ah49c = json.getString("ah49c");
            this.ah49ax = json.getString("ah49ax");
            this.ah49bx = json.getString("ah49bx");

            this.ah50 = json.getString("ah50");
            this.ah50aaa = json.getString("ah50aaa");
            this.ah50aab = json.getString("ah50aab");
            this.ah51 = json.getString("ah51");
            this.ah52a = json.getString("ah52a");
            this.ah53 = json.getString("ah53");
            this.ah54 = json.getString("ah54");
            this.ah54ax = json.getString("ah54ax");
            this.ah55 = json.getString("ah55");
            this.ah56a = json.getString("ah56a");
            this.ah57 = json.getString("ah57");
            this.ah57ax = json.getString("ah57ax");
            this.ah58a = json.getString("ah58a");
            this.ah59a = json.getString("ah59a");
            this.ah59b = json.getString("ah59b");
            this.ah59c = json.getString("ah59c");
            this.ah59d = json.getString("ah59d");
            this.ah60a = json.getString("ah60a");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(AdolescentTable.COLUMN_ID, this.id);
        json.put(AdolescentTable.COLUMN_UID, this.uid);
        json.put(AdolescentTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(AdolescentTable.COLUMN_HHID, this.hhid);
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
        json.put(AdolescentTable.COLUMN_SAH1, new JSONObject(sAH1toString()));
        json.put(AdolescentTable.COLUMN_SAH2, new JSONObject(sAH2toString()));
        json.put(AdolescentTable.COLUMN_SAH3, new JSONObject(sAH3toString()));
        json.put(AdolescentTable.COLUMN_SAH4, new JSONObject(sAH4toString()));
        json.put(AdolescentTable.COLUMN_SAH5, new JSONObject(sAH5toString()));
        json.put(AdolescentTable.COLUMN_SAH6, new JSONObject(sAH6toString()));
        json.put(AdolescentTable.COLUMN_SAH7, new JSONObject(sAH7toString()));

        return json;
    }

    public String sAH1toString() throws JSONException {
        Log.d(TAG, "sAH1toString: ");
        JSONObject json = new JSONObject();
        json.put("ah1", ah1)
                .put("ah2", ah2)
                .put("ah3", ah3)
                .put("ah396x", ah396x)
                .put("ah4a", ah4a)
                .put("ah5", ah5)
                .put("ah6", ah6)
                .put("ah7a", ah7a)
                .put("ah7b", ah7b)
                .put("ah7c", ah7c)
                .put("ah7d", ah7d)
                .put("ah7e", ah7e)
                .put("ah7f", ah7f)
                .put("ah7g", ah7g)
                .put("ah7h", ah7h)
                .put("ah796", ah796)
                .put("ah796x", ah796x);
        return json.toString();
    }

    public String sAH2toString() throws JSONException {
        Log.d(TAG, "sAH2toString: ");
        JSONObject json = new JSONObject();
        json.put("ah8", ah8)
                .put("ah9", ah9)
                .put("ah10", ah10)
                .put("ah11a", ah11a)
                .put("ah12", ah12)
                .put("ah13", ah13)
                .put("ah13aa", ah13aa)
                .put("ah13ab", ah13ab);
        return json.toString();
    }

    public String sAH3toString() throws JSONException {
        Log.d(TAG, "sAH3toString: ");
        JSONObject json = new JSONObject();
        json.put("ah14", ah14)
                .put("ah15", ah15)
                .put("ah16", ah16)
                .put("ah17", ah17)
                .put("ah18", ah18)
                .put("ah19", ah19)
                .put("ah20", ah20)
                .put("ah21", ah21)
                .put("ah2102", ah2102)
                .put("ah2201", ah2201)
                .put("ah2202", ah2202)
                .put("ah2203", ah2203)
                .put("ah2296", ah2296)
                .put("ah2296x", ah2296x)
                .put("ah23", ah23)
                .put("ah2301x", ah2301x)
                .put("ah2302x", ah2302x)
                .put("ah2303x", ah2303x)
                .put("ah2401", ah2401)
                .put("ah2402", ah2402)
                .put("ah2403", ah2403)
                .put("ah2404", ah2404)
                .put("ah2405", ah2405)
                .put("ah2406", ah2406)
                .put("ah2407", ah2407)
                .put("ah2408", ah2408)
                .put("ah2409", ah2409)
                .put("ah2410", ah2410)
                .put("ah2411", ah2411)
                .put("ah24a", ah24a)
                .put("ah25", ah25)
                .put("ah26", ah26)
                .put("ah2696x", ah2696x)
                .put("ah27", ah27)
                .put("ah28", ah28)
                .put("ah29", ah29)
                .put("ah3001", ah3001)
                .put("ah3002", ah3002)
                .put("ah3003", ah3003)
                .put("ah31", ah31);
        return json.toString();
    }

    public String sAH4toString() throws JSONException {
        Log.d(TAG, "sAH4toString: ");
        JSONObject json = new JSONObject();
        json.put("ah3201", ah3201)
                .put("ah3202", ah3202)
                .put("ah3203", ah3203)
                .put("ah3204", ah3204)
                .put("ah3205", ah3205);
        return json.toString();
    }

    public String sAH5toString() throws JSONException {
        Log.d(TAG, "sAH5toString: ");
        JSONObject json = new JSONObject();
        json.put("ah33a", ah33a)
                .put("ah33b", ah33b)
                .put("ah33c", ah33c)
                .put("ah3398", ah3398)
                .put("ah34", ah34)
                .put("ah35a", ah35a)
                .put("ah35b", ah35b)
                .put("ah35c", ah35c)
                .put("ah35d", ah35d)
                .put("ah35e", ah35e)
                .put("ah35f", ah35f)
                .put("ah35g", ah35g)
                .put("ah35h", ah35h)
                .put("ah35i", ah35i)
                .put("ah35j", ah35j)
                .put("ah36", ah36)
                .put("ah36ax", ah36ax);
        return json.toString();
    }

    public String sAH6toString() throws JSONException {
        Log.d(TAG, "sAH6toString: ");
        JSONObject json = new JSONObject();
        json.put("ah3701", ah3701)
                .put("ah3701a", ah3701a)
                .put("ah3701b", ah3701b)
                .put("ah3701c", ah3701c)
                .put("ah3701d", ah3701d)
                .put("ah3701e", ah3701e)
                .put("ah3701f", ah3701f)
                .put("ah3701x", ah3701x)
                .put("ah3701xx", ah3701xx)
                .put("ah3702", ah3702)
                .put("ah3702a", ah3702a)
                .put("ah3702b", ah3702b)
                .put("ah3702c", ah3702c)
                .put("ah3702e", ah3702e)
                .put("ah3702d", ah3702d)
                .put("ah3702f", ah3702f)
                .put("ah3702x", ah3702x)
                .put("ah3702xx", ah3702xx)
                .put("ah3703", ah3703)
                .put("ah3703a", ah3703a)
                .put("ah3703b", ah3703b)
                .put("ah3703c", ah3703c)
                .put("ah3703e", ah3703e)
                .put("ah3703d", ah3703d)
                .put("ah3703f", ah3703f)
                .put("ah3703x", ah3703x)
                .put("ah3703xx", ah3703xx)
                .put("ah3704", ah3704)
                .put("ah3704a", ah3704a)
                .put("ah3704b", ah3704b)
                .put("ah3704c", ah3704c)
                .put("ah3704e", ah3704e)
                .put("ah3704d", ah3704d)
                .put("ah3704f", ah3704f)
                .put("ah3704x", ah3704x)
                .put("ah3704xx", ah3704xx)
                .put("ah3705", ah3705)
                .put("ah3705a", ah3705a)
                .put("ah3705b", ah3705b)
                .put("ah3705c", ah3705c)
                .put("ah3705e", ah3705e)
                .put("ah3705d", ah3705d)
                .put("ah3705f", ah3705f)
                .put("ah3705x", ah3705x)
                .put("ah3705xx", ah3705xx)
                .put("ah3706", ah3706)
                .put("ah3706a", ah3706a)
                .put("ah3706b", ah3706b)
                .put("ah3706c", ah3706c)
                .put("ah3706e", ah3706e)
                .put("ah3706d", ah3706d)
                .put("ah3706f", ah3706f)
                .put("ah3706x", ah3706x)
                .put("ah3706xx", ah3706xx)
                .put("ah37aa", ah37aa)
                .put("ah37ab", ah37ab)
                .put("ah37ac", ah37ac)
                .put("ah38", ah38)
                .put("ah38aa", ah38aa)
                .put("ah39", ah39)
                .put("ah39a", ah39a)
                .put("ah39b", ah39b)
                .put("ah39c", ah39c)
                .put("ah39d", ah39d)
                .put("ah39x", ah39x)
                .put("ah39xx", ah39xx)
                .put("ah40", ah40)
                .put("ah40a", ah40a)
                .put("ah40b", ah40b)
                .put("ah40c", ah40c)
                .put("ah40d", ah40d)
                .put("ah40e", ah40e)
                .put("ah40f", ah40f)
                .put("ah40g", ah40g)
                .put("ah40h", ah40h)
                .put("ah40x", ah40x)
                .put("ah40xx", ah40xx)
                .put("ah40aa", ah40aa)
                .put("ah40aaa", ah40aaa)
                .put("ah40aab", ah40aab)
                .put("ah40aac", ah40aac)
                .put("ah40aad", ah40aad)
                .put("ah40aae", ah40aae)
                .put("ah40aaf", ah40aaf)
                .put("ah40aag", ah40aag)
                .put("ah40aah", ah40aah)
                .put("ah40aax", ah40aax)
                .put("ah40aaxx", ah40aaxx)
                .put("ah41", ah41)
                .put("ah42", ah42)
                .put("ah43", ah43)
                .put("ah44", ah44)
                .put("ah44a", ah44a)
                .put("ah44b", ah44b)
                .put("ah44c", ah44c)
                .put("ah44d", ah44d)
                .put("ah44e", ah44e)
                .put("ah44f", ah44f)
                .put("ah44g", ah44g)
                .put("ah44h", ah44h)
                .put("ah44i", ah44i)
                .put("ah45", ah45)
                .put("ah46", ah46)
                .put("ah47d", ah47d)
                .put("ah48", ah48);
        return json.toString();
    }

    public String sAH7toString() throws JSONException {
        Log.d(TAG, "sAH7toString: ");
        JSONObject json = new JSONObject();
        json.put("ah49a", ah49a)
                .put("ah49b", ah49b)
                .put("ah49c", ah49c)
                .put("ah49ax", ah49ax)
                .put("ah49bx", ah49bx)
                .put("ah50", ah50)
                .put("ah50aaa", ah50aaa)
                .put("ah50aab", ah50aab)
                .put("ah51", ah51)
                .put("ah52a", ah52a)
                .put("ah53", ah53)
                .put("ah54", ah54)
                .put("ah54ax", ah54ax)
                .put("ah55", ah55)
                .put("ah56a", ah56a)
                .put("ah57", ah57)
                .put("ah57ax", ah57ax)
                .put("ah58a", ah58a)
                .put("ah59a", ah59a)
                .put("ah59b", ah59b)
                .put("ah59c", ah59c)
                .put("ah59d", ah59d)
                .put("ah60a", ah60a);
        return json.toString();
    }

}