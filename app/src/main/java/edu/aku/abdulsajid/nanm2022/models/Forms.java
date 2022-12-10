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
import androidx.room.Ignore;
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
    @ColumnInfo(name = FormsTable.COLUMN_VILLAGE_CODE)
    private String villageCode = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_CHILD_ID)
    private String childID = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_CHILD_SNO)
    private String childSno = _EMPTY_;
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
    @Ignore
    private String a101 = _EMPTY_;
    @Ignore
    private String a102 = _EMPTY_;
    @Ignore
    private String a103 = _EMPTY_;
    @Ignore
    private String a104 = _EMPTY_;

    private String a105 = _EMPTY_;
    private String a106 = _EMPTY_;
    private String a107 = _EMPTY_;
    private String a108 = _EMPTY_;
    private String a109 = _EMPTY_;

    @Ignore
    private String a110 = _EMPTY_;
    @Ignore
    private String a111 = _EMPTY_;
    @Ignore
    private String a112 = _EMPTY_;
    @Ignore
    private String a113 = _EMPTY_;
    @Ignore
    private String a114 = _EMPTY_;
    @Ignore
    private String a11496x = _EMPTY_;
    @Ignore
    private String a301 = _EMPTY_;
    @Ignore
    private String a301xx = _EMPTY_;
    @Ignore
    private String a302 = _EMPTY_;
    @Ignore
    private String a302xx = _EMPTY_;
    @Ignore
    private String a303 = _EMPTY_;
    @Ignore
    private String a303xx = _EMPTY_;
    @Ignore
    private String a304 = _EMPTY_;
    @Ignore
    private String a304xx = _EMPTY_;
    @Ignore
    private String a305 = _EMPTY_;
    @Ignore
    private String a305xx = _EMPTY_;
    @Ignore
    private String a306 = _EMPTY_;
    @Ignore
    private String a306xx = _EMPTY_;
    @Ignore
    private String a306aa = _EMPTY_;
    @Ignore
    private String a307 = _EMPTY_;
    @Ignore
    private String a307xx = _EMPTY_;
    @Ignore
    private String a307aa = _EMPTY_;
    @Ignore
    private String a308 = _EMPTY_;
    @Ignore
    private String a309 = _EMPTY_;
    @Ignore
    private String a309a = _EMPTY_;
    @Ignore
    private String a310 = _EMPTY_;
    @Ignore
    private String a311 = _EMPTY_;
    @Ignore
    private String a312 = _EMPTY_;
    @Ignore
    private String a313 = _EMPTY_;
    @Ignore
    private String a314 = _EMPTY_;
    @Ignore
    private String a314xx = _EMPTY_;
    @Ignore
    private String a315 = _EMPTY_;
    @Ignore
    private String a316 = _EMPTY_;
    @Ignore
    private String a316xx = _EMPTY_;
    @Ignore
    private String a317 = _EMPTY_;
    @Ignore
    private String a317xx = _EMPTY_;
    @Ignore
    private String a318 = _EMPTY_;
    @Ignore
    private String a318xx = _EMPTY_;
    @Ignore
    private String a319a = _EMPTY_;
    @Ignore
    private String a319b = _EMPTY_;
    @Ignore
    private String a319c = _EMPTY_;
    @Ignore
    private String a319d = _EMPTY_;
    @Ignore
    private String a319e = _EMPTY_;
    @Ignore
    private String a319f = _EMPTY_;
    @Ignore
    private String a319g = _EMPTY_;
    @Ignore
    private String a319h = _EMPTY_;
    @Ignore
    private String a319i = _EMPTY_;
    @Ignore
    private String a319j = _EMPTY_;
    @Ignore
    private String a319k = _EMPTY_;
    @Ignore
    private String a319l = _EMPTY_;
    @Ignore
    private String a319m = _EMPTY_;
    @Ignore
    private String a319n = _EMPTY_;
    @Ignore
    private String a319o = _EMPTY_;
    @Ignore
    private String a319p = _EMPTY_;
    @Ignore
    private String a319q = _EMPTY_;
    @Ignore
    private String a319r = _EMPTY_;
    @Ignore
    private String a320 = _EMPTY_;
    @Ignore
    private String a321a = _EMPTY_;
    @Ignore
    private String a321b = _EMPTY_;
    @Ignore
    private String a321c = _EMPTY_;
    @Ignore
    private String a321d = _EMPTY_;
    @Ignore
    private String a321e = _EMPTY_;
    @Ignore
    private String a321f = _EMPTY_;
    @Ignore
    private String a321g = _EMPTY_;
    @Ignore
    private String a321h = _EMPTY_;
    @Ignore
    private String a321i = _EMPTY_;
    @Ignore
    private String a322 = _EMPTY_;
    @Ignore
    private String a322xx = _EMPTY_;
    @Ignore
    private String a323 = _EMPTY_;
    @Ignore
    private String a324 = _EMPTY_;
    @Ignore
    private String a325 = _EMPTY_;
    @Ignore
    private String a326 = _EMPTY_;
    @Ignore
    private String a327a = _EMPTY_;
    @Ignore
    private String a327b = _EMPTY_;
    @Ignore
    private String a327c = _EMPTY_;
    @Ignore
    private String a328 = _EMPTY_;
    @Ignore
    private String a329a = _EMPTY_;
    @Ignore
    private String a329b = _EMPTY_;
    @Ignore
    private String a329c = _EMPTY_;
    @Ignore
    private String a329d = _EMPTY_;
    @Ignore
    private String a329e = _EMPTY_;
    @Ignore
    private String a329f = _EMPTY_;
    @Ignore
    private String a330 = _EMPTY_;
    @Ignore
    private String a332 = _EMPTY_;
    @Ignore
    private String a332ax = _EMPTY_;
    @Ignore
    private String a331 = _EMPTY_;
    @Ignore
    private String a331xx = _EMPTY_;
    @Ignore
    private String a333 = _EMPTY_;
    @Ignore
    private String a333xx = _EMPTY_;
    @Ignore
    private String a334 = _EMPTY_;
    @Ignore
    private String a334xx = _EMPTY_;
    @Ignore
    private String a401 = _EMPTY_;
    @Ignore
    private String a402 = _EMPTY_;
    @Ignore
    private String a403 = _EMPTY_;
    @Ignore
    private String a404 = _EMPTY_;
    @Ignore
    private String a405 = _EMPTY_;
    @Ignore
    private String a40601 = _EMPTY_;
    @Ignore
    private String a40602 = _EMPTY_;
    @Ignore
    private String a40603 = _EMPTY_;
    @Ignore
    private String a40604 = _EMPTY_;
    @Ignore
    private String a40605 = _EMPTY_;
    @Ignore
    private String a40606 = _EMPTY_;
    @Ignore
    private String a40607 = _EMPTY_;
    @Ignore
    private String a40608 = _EMPTY_;
    @Ignore
    private String a40609 = _EMPTY_;
    @Ignore
    private String a40610 = _EMPTY_;
    @Ignore
    private String a40611 = _EMPTY_;
    @Ignore
    private String a40612 = _EMPTY_;
    @Ignore
    private String a40613 = _EMPTY_;
    @Ignore
    private String a40614 = _EMPTY_;
    @Ignore
    private String a40615 = _EMPTY_;
    @Ignore
    private String a407 = _EMPTY_;
    @Ignore
    private String a40801 = _EMPTY_;
    @Ignore
    private String a40802 = _EMPTY_;
    @Ignore
    private String a40803 = _EMPTY_;
    @Ignore
    private String a40804 = _EMPTY_;
    @Ignore
    private String a40805 = _EMPTY_;
    @Ignore
    private String a40806 = _EMPTY_;
    @Ignore
    private String a40807 = _EMPTY_;
    @Ignore
    private String a40808 = _EMPTY_;
    @Ignore
    private String a40809 = _EMPTY_;
    @Ignore
    private String a40810 = _EMPTY_;
    @Ignore
    private String a40811 = _EMPTY_;
    @Ignore
    private String a40812 = _EMPTY_;
    @Ignore
    private String a40813 = _EMPTY_;
    @Ignore
    private String a40814 = _EMPTY_;
    @Ignore
    private String a40815 = _EMPTY_;
    @Ignore
    private String a409 = _EMPTY_;
    @Ignore
    private String a40901 = _EMPTY_;
    @Ignore
    private String a40902 = _EMPTY_;
    @Ignore
    private String a40903 = _EMPTY_;
    @Ignore
    private String a40904 = _EMPTY_;
    @Ignore
    private String a40905 = _EMPTY_;
    @Ignore
    private String a40906 = _EMPTY_;
    @Ignore
    private String a40907 = _EMPTY_;
    @Ignore
    private String a40908 = _EMPTY_;
    @Ignore
    private String a40998 = _EMPTY_;
    @Ignore
    private String a40996 = _EMPTY_;
    @Ignore
    private String a40996x = _EMPTY_;
    @Ignore
    private String a410 = _EMPTY_;
    @Ignore
    private String a41101 = _EMPTY_;
    @Ignore
    private String a41102 = _EMPTY_;
    @Ignore
    private String a41103 = _EMPTY_;
    @Ignore
    private String a41104 = _EMPTY_;
    @Ignore
    private String a41105 = _EMPTY_;
    @Ignore
    private String a41106 = _EMPTY_;
    @Ignore
    private String a41107 = _EMPTY_;
    @Ignore
    private String a41108 = _EMPTY_;
    @Ignore
    private String a41109 = _EMPTY_;
    @Ignore
    private String a41110 = _EMPTY_;
    @Ignore
    private String a41111 = _EMPTY_;
    @Ignore
    private String a412a = _EMPTY_;
    @Ignore
    private String a412b = _EMPTY_;
    @Ignore
    private String a412c = _EMPTY_;
    @Ignore
    private String a412d = _EMPTY_;
    @Ignore
    private String a412e = _EMPTY_;
    @Ignore
    private String a412f = _EMPTY_;
    @Ignore
    private String a412g = _EMPTY_;
    @Ignore
    private String a412h = _EMPTY_;
    @Ignore
    private String a412i = _EMPTY_;
    @Ignore
    private String a412j = _EMPTY_;
    @Ignore
    private String a412k = _EMPTY_;
    @Ignore
    private String a412l = _EMPTY_;
    @Ignore
    private String a412m = _EMPTY_;
    @Ignore
    private String a412n = _EMPTY_;
    @Ignore
    private String a412o = _EMPTY_;
    @Ignore
    private String a413 = _EMPTY_;
    @Ignore
    private String a41301 = _EMPTY_;
    @Ignore
    private String a41302 = _EMPTY_;
    @Ignore
    private String a41303 = _EMPTY_;
    @Ignore
    private String a41304 = _EMPTY_;
    @Ignore
    private String a41305 = _EMPTY_;
    @Ignore
    private String a41306 = _EMPTY_;
    @Ignore
    private String a41307 = _EMPTY_;
    @Ignore
    private String a41396 = _EMPTY_;
    @Ignore
    private String a41396x = _EMPTY_;
    @Ignore
    private String a414 = _EMPTY_;
    @Ignore
    private String a415 = _EMPTY_;
    @Ignore
    private String a416 = _EMPTY_;
    @Ignore
    private String a41601 = _EMPTY_;
    @Ignore
    private String a41602 = _EMPTY_;
    @Ignore
    private String a41603 = _EMPTY_;
    @Ignore
    private String a41604 = _EMPTY_;
    @Ignore
    private String a41605 = _EMPTY_;
    @Ignore
    private String a41606 = _EMPTY_;
    @Ignore
    private String a41607 = _EMPTY_;
    @Ignore
    private String a41608 = _EMPTY_;
    @Ignore
    private String a41609 = _EMPTY_;
    @Ignore
    private String a41698 = _EMPTY_;
    @Ignore
    private String a41696 = _EMPTY_;
    @Ignore
    private String a417 = _EMPTY_;
    @Ignore
    private String a41701 = _EMPTY_;
    @Ignore
    private String a41702 = _EMPTY_;
    @Ignore
    private String a41703 = _EMPTY_;
    @Ignore
    private String a41704 = _EMPTY_;
    @Ignore
    private String a41705 = _EMPTY_;
    @Ignore
    private String a41706 = _EMPTY_;
    @Ignore
    private String a41707 = _EMPTY_;
    @Ignore
    private String a41708 = _EMPTY_;
    @Ignore
    private String a41709 = _EMPTY_;
    @Ignore
    private String a41710 = _EMPTY_;
    @Ignore
    private String a41711 = _EMPTY_;
    @Ignore
    private String a41712 = _EMPTY_;
    @Ignore
    private String a41713 = _EMPTY_;
    @Ignore
    private String a41798 = _EMPTY_;
    @Ignore
    private String a41796 = _EMPTY_;
    @Ignore
    private String a41796x = _EMPTY_;
    @Ignore
    private String a418 = _EMPTY_;
    @Ignore
    private String a41801 = _EMPTY_;
    @Ignore
    private String a41802 = _EMPTY_;
    @Ignore
    private String a41803 = _EMPTY_;
    @Ignore
    private String a41804 = _EMPTY_;
    @Ignore
    private String a41805 = _EMPTY_;
    @Ignore
    private String a41898 = _EMPTY_;
    @Ignore
    private String a41896 = _EMPTY_;
    @Ignore
    private String a41896x = _EMPTY_;
    @Ignore
    private String a419 = _EMPTY_;
    @Ignore
    private String a41901 = _EMPTY_;
    @Ignore
    private String a41902 = _EMPTY_;
    @Ignore
    private String a41903 = _EMPTY_;
    @Ignore
    private String a41904 = _EMPTY_;
    @Ignore
    private String a41905 = _EMPTY_;
    @Ignore
    private String a41906 = _EMPTY_;
    @Ignore
    private String a41907 = _EMPTY_;
    @Ignore
    private String a41908 = _EMPTY_;
    @Ignore
    private String a41909 = _EMPTY_;
    @Ignore
    private String a41910 = _EMPTY_;
    @Ignore
    private String a41911 = _EMPTY_;
    @Ignore
    private String a41912 = _EMPTY_;
    @Ignore
    private String a41913 = _EMPTY_;
    @Ignore
    private String a41914 = _EMPTY_;
    @Ignore
    private String a41915 = _EMPTY_;
    @Ignore
    private String a41998 = _EMPTY_;
    @Ignore
    private String a41996 = _EMPTY_;
    @Ignore
    private String a41996x = _EMPTY_;
    @Ignore
    private String a501 = _EMPTY_;
    @Ignore
    private String a50101 = _EMPTY_;
    @Ignore
    private String a50102 = _EMPTY_;
    @Ignore
    private String a50103 = _EMPTY_;
    @Ignore
    private String a50198 = _EMPTY_;
    @Ignore
    private String a50105 = _EMPTY_;
    @Ignore
    private String a502 = _EMPTY_;
    @Ignore
    private String a50301 = _EMPTY_;
    @Ignore
    private String a50302 = _EMPTY_;
    @Ignore
    private String a50303 = _EMPTY_;
    @Ignore
    private String a50304 = _EMPTY_;
    @Ignore
    private String a50305 = _EMPTY_;
    @Ignore
    private String a50401 = _EMPTY_;
    @Ignore
    private String a50402 = _EMPTY_;
    @Ignore
    private String a50403 = _EMPTY_;
    @Ignore
    private String a50404 = _EMPTY_;
    @Ignore
    private String a50497 = _EMPTY_;
    @Ignore
    private String a50501 = _EMPTY_;
    @Ignore
    private String a50502 = _EMPTY_;
    @Ignore
    private String a50503 = _EMPTY_;
    @Ignore
    private String a50504 = _EMPTY_;
    @Ignore
    private String a50597 = _EMPTY_;
    @Ignore
    private String a506 = _EMPTY_;
    @Ignore
    private String a507 = _EMPTY_;
    @Ignore
    private String a508 = _EMPTY_;
    @Ignore
    private String a509 = _EMPTY_;
    @Ignore
    private String a510 = _EMPTY_;
    @Ignore
    private String a511 = _EMPTY_;
    @Ignore
    private String a512 = _EMPTY_;
    @Ignore
    private String a51201 = _EMPTY_;
    @Ignore
    private String a51202 = _EMPTY_;
    @Ignore
    private String a51203 = _EMPTY_;
    @Ignore
    private String a51204 = _EMPTY_;
    @Ignore
    private String a51205 = _EMPTY_;
    @Ignore
    private String a51298 = _EMPTY_;
    @Ignore
    private String a51296 = _EMPTY_;
    @Ignore
    private String a51296x = _EMPTY_;
    @Ignore
    private String a513a = _EMPTY_;
    @Ignore
    private String a513b = _EMPTY_;
    @Ignore
    private String a513c = _EMPTY_;
    @Ignore
    private String a513d = _EMPTY_;
    @Ignore
    private String a513e = _EMPTY_;
    @Ignore
    private String a513f = _EMPTY_;
    @Ignore
    private String a513g = _EMPTY_;
    @Ignore
    private String a513h = _EMPTY_;
    @Ignore
    private String a513i = _EMPTY_;
    @Ignore
    private String a513j = _EMPTY_;
    @Ignore
    private String a513k = _EMPTY_;
    @Ignore
    private String a513l = _EMPTY_;
    @Ignore
    private String a513m = _EMPTY_;
    @Ignore
    private String a513n = _EMPTY_;
    @Ignore
    private String a513o = _EMPTY_;
    @Ignore
    private String a513p = _EMPTY_;
    @Ignore
    private String a514 = _EMPTY_;
    @Ignore
    private String a515 = _EMPTY_;
    @Ignore
    private String a516 = _EMPTY_;
    @Ignore
    private String a517 = _EMPTY_;
    @Ignore
    private String a518 = _EMPTY_;
    @Ignore
    private String a51801 = _EMPTY_;
    @Ignore
    private String a51802 = _EMPTY_;
    @Ignore
    private String a51803 = _EMPTY_;
    @Ignore
    private String a51804 = _EMPTY_;
    @Ignore
    private String a51805 = _EMPTY_;
    @Ignore
    private String a51806 = _EMPTY_;
    @Ignore
    private String a51807 = _EMPTY_;
    @Ignore
    private String a51808 = _EMPTY_;
    @Ignore
    private String a51809 = _EMPTY_;
    @Ignore
    private String a51810 = _EMPTY_;
    @Ignore
    private String a51811 = _EMPTY_;
    @Ignore
    private String a51812 = _EMPTY_;
    @Ignore
    private String a51813 = _EMPTY_;
    @Ignore
    private String a51814 = _EMPTY_;
    @Ignore
    private String a51896 = _EMPTY_;
    @Ignore
    private String a51896x = _EMPTY_;
    @Ignore
    private String a51898 = _EMPTY_;
    @Ignore
    private String a519 = _EMPTY_;
    @Ignore
    private String a51901x = _EMPTY_;
    @Ignore
    private String a520 = _EMPTY_;
    @Ignore
    private String a52001 = _EMPTY_;
    @Ignore
    private String a52001x = _EMPTY_;
    @Ignore
    private String a52002 = _EMPTY_;
    @Ignore
    private String a52002x = _EMPTY_;
    @Ignore
    private String a52003 = _EMPTY_;
    @Ignore
    private String a52003x = _EMPTY_;
    @Ignore
    private String a52004 = _EMPTY_;
    @Ignore
    private String a52004x = _EMPTY_;
    @Ignore
    private String a52005 = _EMPTY_;
    @Ignore
    private String a52005x = _EMPTY_;
    @Ignore
    private String a52098 = _EMPTY_;
    @Ignore
    private String a52096 = _EMPTY_;
    @Ignore
    private String a52096x = _EMPTY_;
    @Ignore
    private String a521 = _EMPTY_;
    @Ignore
    private String a52196x = _EMPTY_;
    @Ignore
    private String a5221 = _EMPTY_;
    @Ignore
    private String a5221ax = _EMPTY_;
    @Ignore
    private String a5221bx = _EMPTY_;
    @Ignore
    private String a5221cx = _EMPTY_;
    @Ignore
    private String a5222 = _EMPTY_;
    @Ignore
    private String a5222ax = _EMPTY_;
    @Ignore
    private String a5222bx = _EMPTY_;
    @Ignore
    private String a5222cx = _EMPTY_;
    @Ignore
    private String a5223 = _EMPTY_;
    @Ignore
    private String a5223ax = _EMPTY_;
    @Ignore
    private String a5223bx = _EMPTY_;
    @Ignore
    private String a5223cx = _EMPTY_;
    @Ignore
    private String a5224 = _EMPTY_;
    @Ignore
    private String a5224ax = _EMPTY_;
    @Ignore
    private String a5224bx = _EMPTY_;
    @Ignore
    private String a5224cx = _EMPTY_;
    @Ignore
    private String a5225 = _EMPTY_;
    @Ignore
    private String a5225ax = _EMPTY_;
    @Ignore
    private String a5225bx = _EMPTY_;
    @Ignore
    private String a5225cx = _EMPTY_;
    @Ignore
    private String a5226 = _EMPTY_;
    @Ignore
    private String a5226ax = _EMPTY_;
    @Ignore
    private String a5226bx = _EMPTY_;
    @Ignore
    private String a5226cx = _EMPTY_;
    @Ignore
    private String a52296x = _EMPTY_;
    @Ignore
    private String a523 = _EMPTY_;
    @Ignore
    private String a524 = _EMPTY_;
    @Ignore
    private String a52401 = _EMPTY_;
    @Ignore
    private String a52401x = _EMPTY_;
    @Ignore
    private String a52402 = _EMPTY_;
    @Ignore
    private String a52402x = _EMPTY_;
    @Ignore
    private String a52403 = _EMPTY_;
    @Ignore
    private String a52403x = _EMPTY_;
    @Ignore
    private String a52404 = _EMPTY_;
    @Ignore
    private String a52404x = _EMPTY_;
    @Ignore
    private String a52405 = _EMPTY_;
    @Ignore
    private String a52405x = _EMPTY_;
    @Ignore
    private String a52496 = _EMPTY_;
    @Ignore
    private String a52496x = _EMPTY_;
    @Ignore
    private String a52498 = _EMPTY_;
    @Ignore
    private String a525 = _EMPTY_;
    @Ignore
    private String a526 = _EMPTY_;
    @Ignore
    private String a52696x = _EMPTY_;
    @Ignore
    private String a527 = _EMPTY_;
    @Ignore
    private String a528 = _EMPTY_;
    @Ignore
    private String a52802x = _EMPTY_;
    @Ignore
    private String a52901 = _EMPTY_;
    @Ignore
    private String a52902 = _EMPTY_;
    @Ignore
    private String a52903 = _EMPTY_;
    @Ignore
    private String a52904 = _EMPTY_;
    @Ignore
    private String a52905 = _EMPTY_;
    @Ignore
    private String a52906 = _EMPTY_;
    @Ignore
    private String a52907 = _EMPTY_;
    @Ignore
    private String a52908 = _EMPTY_;
    @Ignore
    private String a52996 = _EMPTY_;
    @Ignore
    private String a52998 = _EMPTY_;
    @Ignore
    private String a52996x = _EMPTY_;
    @Ignore
    private String a530 = _EMPTY_;
    @Ignore
    private String a53001 = _EMPTY_;
    @Ignore
    private String a53002 = _EMPTY_;
    @Ignore
    private String a53003 = _EMPTY_;
    @Ignore
    private String a53004 = _EMPTY_;
    @Ignore
    private String a53005 = _EMPTY_;
    @Ignore
    private String a53006 = _EMPTY_;
    @Ignore
    private String a53007 = _EMPTY_;
    @Ignore
    private String a53008 = _EMPTY_;
    @Ignore
    private String a53009 = _EMPTY_;
    @Ignore
    private String a53010 = _EMPTY_;
    @Ignore
    private String a53098 = _EMPTY_;
    @Ignore
    private String a53096 = _EMPTY_;
    @Ignore
    private String a53096x = _EMPTY_;
    @Ignore
    private String a531 = _EMPTY_;
    @Ignore
    private String a53196x = _EMPTY_;
    @Ignore
    private String a532 = _EMPTY_;
    @Ignore
    private String a533 = _EMPTY_;
    @Ignore
    private String a53301 = _EMPTY_;
    @Ignore
    private String a53302 = _EMPTY_;
    @Ignore
    private String a53303 = _EMPTY_;
    @Ignore
    private String a53304 = _EMPTY_;
    @Ignore
    private String a53398 = _EMPTY_;
    @Ignore
    private String a53396 = _EMPTY_;
    @Ignore
    private String a53396x = _EMPTY_;
    @Ignore
    private String a534 = _EMPTY_;
    @Ignore
    private String a53401 = _EMPTY_;
    @Ignore
    private String a53402 = _EMPTY_;
    @Ignore
    private String a53403 = _EMPTY_;
    @Ignore
    private String a53404 = _EMPTY_;
    @Ignore
    private String a53405 = _EMPTY_;
    @Ignore
    private String a53406 = _EMPTY_;
    @Ignore
    private String a53407 = _EMPTY_;
    @Ignore
    private String a53408 = _EMPTY_;
    @Ignore
    private String a53409 = _EMPTY_;
    @Ignore
    private String a53410 = _EMPTY_;
    @Ignore
    private String a53498 = _EMPTY_;
    @Ignore
    private String a53496 = _EMPTY_;
    @Ignore
    private String a53496x = _EMPTY_;
    @Ignore
    private String b101 = _EMPTY_;
    @Ignore
    private String b102 = _EMPTY_;
    @Ignore
    private String b103 = _EMPTY_;
    @Ignore
    private String b104 = _EMPTY_;
    @Ignore
    private String b105 = _EMPTY_;
    @Ignore
    private String b106 = _EMPTY_;
    @Ignore
    private String b107 = _EMPTY_;
    @Ignore
    private String b108 = _EMPTY_;
    @Ignore
    private String b109 = _EMPTY_;
    @Ignore
    private String b110 = _EMPTY_;
    @Ignore
    private String b111 = _EMPTY_;
    @Ignore
    private String b112 = _EMPTY_;
    @Ignore
    private String b113 = _EMPTY_;
    @Ignore
    private String b114 = _EMPTY_;
    @Ignore
    private String b115 = _EMPTY_;
    @Ignore
    private String b116 = _EMPTY_;
    @Ignore
    private String b117 = _EMPTY_;
    @Ignore
    private String b118 = _EMPTY_;
    @Ignore
    private String b301 = _EMPTY_;
    @Ignore
    private String b301a = _EMPTY_;
    @Ignore
    private String b301b = _EMPTY_;
    @Ignore
    private String b301c = _EMPTY_;
    @Ignore
    private String b301d = _EMPTY_;
    @Ignore
    private String b301e = _EMPTY_;
    @Ignore
    private String b301f = _EMPTY_;
    @Ignore
    private String b301g = _EMPTY_;
    @Ignore
    private String b301h = _EMPTY_;
    @Ignore
    private String b30196 = _EMPTY_;
    @Ignore
    private String b30196x = _EMPTY_;
    @Ignore
    private String b302 = _EMPTY_;
    @Ignore
    private String b302a = _EMPTY_;
    @Ignore
    private String b302b = _EMPTY_;
    @Ignore
    private String b302c = _EMPTY_;
    @Ignore
    private String b302d = _EMPTY_;
    @Ignore
    private String b302e = _EMPTY_;
    @Ignore
    private String b302f = _EMPTY_;
    @Ignore
    private String b302g = _EMPTY_;
    @Ignore
    private String b302h = _EMPTY_;
    @Ignore
    private String b30296 = _EMPTY_;
    @Ignore
    private String b30296x = _EMPTY_;
    @Ignore
    private String b303 = _EMPTY_;
    @Ignore
    private String b303a = _EMPTY_;
    @Ignore
    private String b303b = _EMPTY_;
    @Ignore
    private String b303c = _EMPTY_;
    @Ignore
    private String b303d = _EMPTY_;
    @Ignore
    private String b303e = _EMPTY_;
    @Ignore
    private String b303f = _EMPTY_;
    @Ignore
    private String b303g = _EMPTY_;
    @Ignore
    private String b303h = _EMPTY_;
    @Ignore
    private String b30396 = _EMPTY_;
    @Ignore
    private String b30396x = _EMPTY_;
    @Ignore
    private String b304 = _EMPTY_;
    @Ignore
    private String b304a = _EMPTY_;
    @Ignore
    private String b304b = _EMPTY_;
    @Ignore
    private String b304c = _EMPTY_;
    @Ignore
    private String b304d = _EMPTY_;
    @Ignore
    private String b304e = _EMPTY_;
    @Ignore
    private String b304f = _EMPTY_;
    @Ignore
    private String b304g = _EMPTY_;
    @Ignore
    private String b304h = _EMPTY_;
    @Ignore
    private String b30496 = _EMPTY_;
    @Ignore
    private String b30496x = _EMPTY_;
    @Ignore
    private String b305 = _EMPTY_;
    @Ignore
    private String b305a = _EMPTY_;
    @Ignore
    private String b305b = _EMPTY_;
    @Ignore
    private String b305c = _EMPTY_;
    @Ignore
    private String b305d = _EMPTY_;
    @Ignore
    private String b305e = _EMPTY_;
    @Ignore
    private String b305f = _EMPTY_;
    @Ignore
    private String b305g = _EMPTY_;
    @Ignore
    private String b305h = _EMPTY_;
    @Ignore
    private String b30596 = _EMPTY_;
    @Ignore
    private String b30596x = _EMPTY_;
    @Ignore
    private String b306 = _EMPTY_;
    @Ignore
    private String b306a = _EMPTY_;
    @Ignore
    private String b306b = _EMPTY_;
    @Ignore
    private String b306c = _EMPTY_;
    @Ignore
    private String b306d = _EMPTY_;
    @Ignore
    private String b306e = _EMPTY_;
    @Ignore
    private String b306f = _EMPTY_;
    @Ignore
    private String b306g = _EMPTY_;
    @Ignore
    private String b306h = _EMPTY_;
    @Ignore
    private String b30696 = _EMPTY_;
    @Ignore
    private String b30696x = _EMPTY_;
    @Ignore
    private String b307 = _EMPTY_;
    @Ignore
    private String b307a = _EMPTY_;
    @Ignore
    private String b307b = _EMPTY_;
    @Ignore
    private String b307c = _EMPTY_;
    @Ignore
    private String b307d = _EMPTY_;
    @Ignore
    private String b307e = _EMPTY_;
    @Ignore
    private String b307f = _EMPTY_;
    @Ignore
    private String b307g = _EMPTY_;
    @Ignore
    private String b307h = _EMPTY_;
    @Ignore
    private String b30796 = _EMPTY_;
    @Ignore
    private String b30796x = _EMPTY_;
    @Ignore
    private String b308 = _EMPTY_;
    @Ignore
    private String b308a = _EMPTY_;
    @Ignore
    private String b308b = _EMPTY_;
    @Ignore
    private String b308c = _EMPTY_;
    @Ignore
    private String b308d = _EMPTY_;
    @Ignore
    private String b308e = _EMPTY_;
    @Ignore
    private String b308f = _EMPTY_;
    @Ignore
    private String b308g = _EMPTY_;
    @Ignore
    private String b308h = _EMPTY_;
    @Ignore
    private String b30896 = _EMPTY_;
    @Ignore
    private String b30896x = _EMPTY_;
    @Ignore
    private String b309 = _EMPTY_;
    @Ignore
    private String b309a = _EMPTY_;
    @Ignore
    private String b309b = _EMPTY_;
    @Ignore
    private String b309c = _EMPTY_;
    @Ignore
    private String b309d = _EMPTY_;
    @Ignore
    private String b309e = _EMPTY_;
    @Ignore
    private String b309f = _EMPTY_;
    @Ignore
    private String b309g = _EMPTY_;
    @Ignore
    private String b309h = _EMPTY_;
    @Ignore
    private String b30996 = _EMPTY_;
    @Ignore
    private String b30996x = _EMPTY_;
    @Ignore
    private String b310 = _EMPTY_;
    @Ignore
    private String b310a = _EMPTY_;
    @Ignore
    private String b310b = _EMPTY_;
    @Ignore
    private String b310c = _EMPTY_;
    @Ignore
    private String b310d = _EMPTY_;
    @Ignore
    private String b310e = _EMPTY_;
    @Ignore
    private String b310f = _EMPTY_;
    @Ignore
    private String b310g = _EMPTY_;
    @Ignore
    private String b310h = _EMPTY_;
    @Ignore
    private String b31096 = _EMPTY_;
    @Ignore
    private String b31096x = _EMPTY_;
    @Ignore
    private String b311 = _EMPTY_;
    @Ignore
    private String b311a = _EMPTY_;
    @Ignore
    private String b311b = _EMPTY_;
    @Ignore
    private String b311c = _EMPTY_;
    @Ignore
    private String b311d = _EMPTY_;
    @Ignore
    private String b311e = _EMPTY_;
    @Ignore
    private String b311f = _EMPTY_;
    @Ignore
    private String b311g = _EMPTY_;
    @Ignore
    private String b311h = _EMPTY_;
    @Ignore
    private String b31196 = _EMPTY_;
    @Ignore
    private String b31196x = _EMPTY_;
    @Ignore
    private String b312 = _EMPTY_;
    @Ignore
    private String b312a = _EMPTY_;
    @Ignore
    private String b312b = _EMPTY_;
    @Ignore
    private String b312c = _EMPTY_;
    @Ignore
    private String b312d = _EMPTY_;
    @Ignore
    private String b312e = _EMPTY_;
    @Ignore
    private String b312f = _EMPTY_;
    @Ignore
    private String b312g = _EMPTY_;
    @Ignore
    private String b312h = _EMPTY_;
    @Ignore
    private String b31296 = _EMPTY_;
    @Ignore
    private String b31296x = _EMPTY_;
    @Ignore
    private String b313 = _EMPTY_;
    @Ignore
    private String b313a = _EMPTY_;
    @Ignore
    private String b313b = _EMPTY_;
    @Ignore
    private String b313c = _EMPTY_;
    @Ignore
    private String b313d = _EMPTY_;
    @Ignore
    private String b313e = _EMPTY_;
    @Ignore
    private String b313f = _EMPTY_;
    @Ignore
    private String b313g = _EMPTY_;
    @Ignore
    private String b313h = _EMPTY_;
    @Ignore
    private String b31396 = _EMPTY_;
    @Ignore
    private String b31396x = _EMPTY_;
    @Ignore
    private String b314 = _EMPTY_;
    @Ignore
    private String b314a = _EMPTY_;
    @Ignore
    private String b314b = _EMPTY_;
    @Ignore
    private String b314c = _EMPTY_;
    @Ignore
    private String b314d = _EMPTY_;
    @Ignore
    private String b314e = _EMPTY_;
    @Ignore
    private String b314f = _EMPTY_;
    @Ignore
    private String b314g = _EMPTY_;
    @Ignore
    private String b314h = _EMPTY_;
    @Ignore
    private String b31496 = _EMPTY_;
    @Ignore
    private String b31496x = _EMPTY_;


    // Section Variables

    @ColumnInfo(name = FormsTable.COLUMN_SA1)
    private String sA1 = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA3A)
    private String sA3A = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA3B)
    private String sA3B = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA4A)
    private String sA4A = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA4B)
    private String sA4B = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA4C)
    private String sA4C = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA5A)
    private String sA5A = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SA5B)
    private String sA5B = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SB1)
    private String sB1 = _EMPTY_;
    @ColumnInfo(name = FormsTable.COLUMN_SB3)
    private String sB3 = _EMPTY_;


    public Forms() {
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
        setA109(MainApp.currentADOL.getVillage_code());
        setA106(selectedDistrict);
        setA107(selectedTehsil);
        setA108(selectedUC);
        setA105(MainApp.currentADOL.getChild_id());

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

    public String getSA3A() {
        return sA3A;
    }

    public void setSA3A(String sA3A) {
        this.sA3A = sA3A;
    }

    public String getSA3B() {
        return sA3B;
    }

    public void setSA3B(String sA3B) {
        this.sA3B = sA3B;
    }

    public String getSA4A() {
        return sA4A;
    }

    public void setSA4A(String sA4A) {
        this.sA4A = sA4A;
    }

    public String getSA4B() {
        return sA4B;
    }

    public void setSA4B(String sA4B) {
        this.sA4B = sA4B;
    }

    public String getSA4C() {
        return sA4C;
    }

    public void setSA4C(String sA4C) {
        this.sA4C = sA4C;
    }

    public String getSA5A() {
        return sA5A;
    }

    public void setSA5A(String sA5A) {
        this.sA5A = sA5A;
    }

    public String getSA5B() {
        return sA5B;
    }

    public void setSA5B(String sA5B) {
        this.sA5B = sA5B;
    }

    public String getSB1() {
        return sB1;
    }

    public void setSB1(String sB1) {
        this.sB1 = sB1;
    }

    public String getSB3() {
        return sB3;
    }

    public void setSB3(String sB3) {
        this.sB3 = sB3;
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

    @Bindable
    public String getA114() {
        return a114;
    }

    public void setA114(String a114) {
        this.a114 = a114;
        notifyPropertyChanged(BR.a114);
    }

    @Bindable
    public String getA11496x() {
        return a11496x;
    }

    public void setA11496x(String a11496x) {
        this.a11496x = a11496x;
        notifyPropertyChanged(BR.a11496x);
    }

    @Bindable
    public String getA301() {
        return a301;
    }

    public void setA301(String a301) {
        this.a301 = a301;
        setA301xx(a301.equals("96") ? this.a301xx : "");
        notifyPropertyChanged(BR.a301);
    }

    @Bindable
    public String getA301xx() {
        return a301xx;
    }

    public void setA301xx(String a301xx) {
        this.a301xx = a301xx;
        notifyPropertyChanged(BR.a301xx);
    }

    @Bindable
    public String getA302() {
        return a302;
    }

    public void setA302(String a302) {
        this.a302 = a302;
        setA302xx(a302.equals("96") ? this.a302xx : "");
        notifyPropertyChanged(BR.a302);
    }

    @Bindable
    public String getA302xx() {
        return a302xx;
    }

    public void setA302xx(String a302xx) {
        this.a302xx = a302xx;
        notifyPropertyChanged(BR.a302xx);
    }

    @Bindable
    public String getA303() {
        return a303;
    }

    public void setA303(String a303) {
        this.a303 = a303;
        setA303xx(a303.equals("96") ? this.a303xx : "");
        notifyPropertyChanged(BR.a303);
    }

    @Bindable
    public String getA303xx() {
        return a303xx;
    }

    public void setA303xx(String a303xx) {
        this.a303xx = a303xx;
        notifyPropertyChanged(BR.a303xx);
    }

    @Bindable
    public String getA304() {
        return a304;
    }

    public void setA304(String a304) {
        this.a304 = a304;
        setA304xx(a304.equals("96") ? this.a304xx : "");
        notifyPropertyChanged(BR.a304);
    }

    @Bindable
    public String getA304xx() {
        return a304xx;
    }

    public void setA304xx(String a304xx) {
        this.a304xx = a304xx;
        notifyPropertyChanged(BR.a304xx);
    }

    @Bindable
    public String getA305() {
        return a305;
    }

    public void setA305(String a305) {
        this.a305 = a305;
        setA305xx(a305.equals("96") ? this.a305xx : "");
        notifyPropertyChanged(BR.a305);
    }

    @Bindable
    public String getA305xx() {
        return a305xx;
    }

    public void setA305xx(String a305xx) {
        this.a305xx = a305xx;
        notifyPropertyChanged(BR.a305xx);
    }

    @Bindable
    public String getA306() {
        return a306;
    }

    public void setA306(String a306) {
        this.a306 = a306;
        setA306xx(a306.equals("96") ? this.a306xx : "");
        notifyPropertyChanged(BR.a306);
    }

    @Bindable
    public String getA306xx() {
        return a306xx;
    }

    public void setA306xx(String a306xx) {
        this.a306xx = a306xx;
        notifyPropertyChanged(BR.a306xx);
    }

    @Bindable
    public String getA306aa() {
        return a306aa;
    }

    public void setA306aa(String a306aa) {
        this.a306aa = a306aa;
        notifyPropertyChanged(BR.a306aa);
    }

    @Bindable
    public String getA307() {
        return a307;
    }

    public void setA307(String a307) {
        this.a307 = a307;
        setA307xx(a307.equals("96") ? this.a307xx : "");
        notifyPropertyChanged(BR.a307);
    }

    @Bindable
    public String getA307xx() {
        return a307xx;
    }

    public void setA307xx(String a307xx) {
        this.a307xx = a307xx;
        notifyPropertyChanged(BR.a307xx);
    }

    @Bindable
    public String getA307aa() {
        return a307aa;
    }

    public void setA307aa(String a307aa) {
        this.a307aa = a307aa;
        notifyPropertyChanged(BR.a307aa);
    }

    @Bindable
    public String getA308() {
        return a308;
    }

    public void setA308(String a308) {
        this.a308 = a308;
        setA309(a308.equals("3") ? this.a309 : "");
        setA309a(a308.equals("3") ? this.a309a : "");
        setA310(a308.equals("3") ? this.a310 : "");
        notifyPropertyChanged(BR.a308);
    }

    @Bindable
    public String getA309() {
        return a309;
    }

    public void setA309(String a309) {
        this.a309 = a309;
        notifyPropertyChanged(BR.a309);
    }

    @Bindable
    public String getA309a() {
        return a309a;
    }

    public void setA309a(String a309a) {
        this.a309a = a309a;
        setA309(a309a.equals("98") ? "" : this.a309);
        notifyPropertyChanged(BR.a309a);
    }

    @Bindable
    public String getA310() {
        return a310;
    }

    public void setA310(String a310) {
        this.a310 = a310;
        notifyPropertyChanged(BR.a310);
    }

    @Bindable
    public String getA311() {
        return a311;
    }

    public void setA311(String a311) {
        this.a311 = a311;
        notifyPropertyChanged(BR.a311);
    }

    @Bindable
    public String getA312() {
        return a312;
    }

    public void setA312(String a312) {
        this.a312 = a312;
        notifyPropertyChanged(BR.a312);
    }

    @Bindable
    public String getA313() {
        return a313;
    }

    public void setA313(String a313) {
        this.a313 = a313;
        setA314(a313.equals("1") ? this.a314 : "");
        notifyPropertyChanged(BR.a313);
    }

    @Bindable
    public String getA314() {
        return a314;
    }

    public void setA314(String a314) {
        this.a314 = a314;
        setA314xx(a314.equals("96") ? this.a314xx : "");
        notifyPropertyChanged(BR.a314);
    }

    @Bindable
    public String getA314xx() {
        return a314xx;
    }

    public void setA314xx(String a314xx) {
        this.a314xx = a314xx;
        notifyPropertyChanged(BR.a314xx);
    }

    @Bindable
    public String getA315() {
        return a315;
    }

    public void setA315(String a315) {
        this.a315 = a315;
        notifyPropertyChanged(BR.a315);
    }

    @Bindable
    public String getA316() {
        return a316;
    }

    public void setA316(String a316) {
        this.a316 = a316;
        setA316xx(a316.equals("96") ? this.a316xx : "");
        notifyPropertyChanged(BR.a316);
    }

    @Bindable
    public String getA316xx() {
        return a316xx;
    }

    public void setA316xx(String a316xx) {
        this.a316xx = a316xx;
        notifyPropertyChanged(BR.a316xx);
    }

    @Bindable
    public String getA317() {
        return a317;
    }

    public void setA317(String a317) {
        this.a317 = a317;
        setA317xx(a317.equals("96") ? this.a317xx : "");
        notifyPropertyChanged(BR.a317);
    }

    @Bindable
    public String getA317xx() {
        return a317xx;
    }

    public void setA317xx(String a317xx) {
        this.a317xx = a317xx;
        notifyPropertyChanged(BR.a317xx);
    }

    @Bindable
    public String getA318() {
        return a318;
    }

    public void setA318(String a318) {
        this.a318 = a318;
        setA318xx(a318.equals("96") ? this.a318xx : "");
        notifyPropertyChanged(BR.a318);
    }

    @Bindable
    public String getA318xx() {
        return a318xx;
    }

    public void setA318xx(String a318xx) {
        this.a318xx = a318xx;
        notifyPropertyChanged(BR.a318xx);
    }

    @Bindable
    public String getA319a() {
        return a319a;
    }

    public void setA319a(String a319a) {
        this.a319a = a319a;
        notifyPropertyChanged(BR.a319a);
    }

    @Bindable
    public String getA319b() {
        return a319b;
    }

    public void setA319b(String a319b) {
        this.a319b = a319b;
        notifyPropertyChanged(BR.a319b);
    }

    @Bindable
    public String getA319c() {
        return a319c;
    }

    public void setA319c(String a319c) {
        this.a319c = a319c;
        notifyPropertyChanged(BR.a319c);
    }

    @Bindable
    public String getA319d() {
        return a319d;
    }

    public void setA319d(String a319d) {
        this.a319d = a319d;
        notifyPropertyChanged(BR.a319d);
    }

    @Bindable
    public String getA319e() {
        return a319e;
    }

    public void setA319e(String a319e) {
        this.a319e = a319e;
        notifyPropertyChanged(BR.a319e);
    }

    @Bindable
    public String getA319f() {
        return a319f;
    }

    public void setA319f(String a319f) {
        this.a319f = a319f;
        notifyPropertyChanged(BR.a319f);
    }

    @Bindable
    public String getA319g() {
        return a319g;
    }

    public void setA319g(String a319g) {
        this.a319g = a319g;
        notifyPropertyChanged(BR.a319g);
    }

    @Bindable
    public String getA319h() {
        return a319h;
    }

    public void setA319h(String a319h) {
        this.a319h = a319h;
        notifyPropertyChanged(BR.a319h);
    }

    @Bindable
    public String getA319i() {
        return a319i;
    }

    public void setA319i(String a319i) {
        this.a319i = a319i;
        notifyPropertyChanged(BR.a319i);
    }

    @Bindable
    public String getA319j() {
        return a319j;
    }

    public void setA319j(String a319j) {
        this.a319j = a319j;
        notifyPropertyChanged(BR.a319j);
    }

    @Bindable
    public String getA319k() {
        return a319k;
    }

    public void setA319k(String a319k) {
        this.a319k = a319k;
        notifyPropertyChanged(BR.a319k);
    }

    @Bindable
    public String getA319l() {
        return a319l;
    }

    public void setA319l(String a319l) {
        this.a319l = a319l;
        notifyPropertyChanged(BR.a319l);
    }

    @Bindable
    public String getA319m() {
        return a319m;
    }

    public void setA319m(String a319m) {
        this.a319m = a319m;
        notifyPropertyChanged(BR.a319m);
    }

    @Bindable
    public String getA319n() {
        return a319n;
    }

    public void setA319n(String a319n) {
        this.a319n = a319n;
        notifyPropertyChanged(BR.a319n);
    }

    @Bindable
    public String getA319o() {
        return a319o;
    }

    public void setA319o(String a319o) {
        this.a319o = a319o;
        notifyPropertyChanged(BR.a319o);
    }

    @Bindable
    public String getA319p() {
        return a319p;
    }

    public void setA319p(String a319p) {
        this.a319p = a319p;
        notifyPropertyChanged(BR.a319p);
    }

    @Bindable
    public String getA319q() {
        return a319q;
    }

    public void setA319q(String a319q) {
        this.a319q = a319q;
        notifyPropertyChanged(BR.a319q);
    }

    @Bindable
    public String getA319r() {
        return a319r;
    }

    public void setA319r(String a319r) {
        this.a319r = a319r;
        notifyPropertyChanged(BR.a319r);
    }

    @Bindable
    public String getA320() {
        return a320;
    }

    public void setA320(String a320) {
        this.a320 = a320;
        notifyPropertyChanged(BR.a320);
    }

    @Bindable
    public String getA321a() {
        return a321a;
    }

    public void setA321a(String a321a) {
        this.a321a = a321a;
        notifyPropertyChanged(BR.a321a);
    }

    @Bindable
    public String getA321b() {
        return a321b;
    }

    public void setA321b(String a321b) {
        this.a321b = a321b;
        notifyPropertyChanged(BR.a321b);
    }

    @Bindable
    public String getA321c() {
        return a321c;
    }

    public void setA321c(String a321c) {
        this.a321c = a321c;
        notifyPropertyChanged(BR.a321c);
    }

    @Bindable
    public String getA321d() {
        return a321d;
    }

    public void setA321d(String a321d) {
        this.a321d = a321d;
        notifyPropertyChanged(BR.a321d);
    }

    @Bindable
    public String getA321e() {
        return a321e;
    }

    public void setA321e(String a321e) {
        this.a321e = a321e;
        notifyPropertyChanged(BR.a321e);
    }

    @Bindable
    public String getA321f() {
        return a321f;
    }

    public void setA321f(String a321f) {
        this.a321f = a321f;
        notifyPropertyChanged(BR.a321f);
    }

    @Bindable
    public String getA321g() {
        return a321g;
    }

    public void setA321g(String a321g) {
        this.a321g = a321g;
        notifyPropertyChanged(BR.a321g);
    }

    @Bindable
    public String getA321h() {
        return a321h;
    }

    public void setA321h(String a321h) {
        this.a321h = a321h;
        notifyPropertyChanged(BR.a321h);
    }

    @Bindable
    public String getA321i() {
        return a321i;
    }

    public void setA321i(String a321i) {
        this.a321i = a321i;
        notifyPropertyChanged(BR.a321i);
    }

    @Bindable
    public String getA322() {
        return a322;
    }

    public void setA322(String a322) {
        this.a322 = a322;
        setA322xx(a322.equals("96") ? this.a322xx : "");
        setA323(a322.equals("11") ? "" : this.a323);
        setA324(a322.equals("11") ? "" : this.a324);
        setA325(a322.equals("11") ? "" : this.a325);
        notifyPropertyChanged(BR.a322);
    }

    @Bindable
    public String getA322xx() {
        return a322xx;
    }

    public void setA322xx(String a322xx) {
        this.a322xx = a322xx;
        notifyPropertyChanged(BR.a322xx);
    }

    @Bindable
    public String getA323() {
        return a323;
    }

    public void setA323(String a323) {
        this.a323 = a323;
        setA324(a323.equals("2") ? "" : this.a324);
        setA325(a323.equals("2") ? "" : this.a325);
        notifyPropertyChanged(BR.a323);
    }

    @Bindable
    public String getA324() {
        return a324;
    }

    public void setA324(String a324) {
        this.a324 = a324;
        notifyPropertyChanged(BR.a324);
    }

    @Bindable
    public String getA325() {
        return a325;
    }

    public void setA325(String a325) {
        this.a325 = a325;
        notifyPropertyChanged(BR.a325);
    }

    @Bindable
    public String getA326() {
        return a326;
    }

    public void setA326(String a326) {
        this.a326 = a326;
        setA327a(a326.equals("1") ? this.a327a : "");
        setA327b(a326.equals("1") ? this.a327b : "");
        setA327c(a326.equals("1") ? this.a327c : "");
        notifyPropertyChanged(BR.a326);
    }

    @Bindable
    public String getA327a() {
        return a327a;
    }

    public void setA327a(String a327a) {
        this.a327a = a327a;
        notifyPropertyChanged(BR.a327a);
    }

    @Bindable
    public String getA327b() {
        return a327b;
    }

    public void setA327b(String a327b) {
        this.a327b = a327b;
        notifyPropertyChanged(BR.a327b);
    }

    @Bindable
    public String getA327c() {
        return a327c;
    }

    public void setA327c(String a327c) {
        this.a327c = a327c;
        setA327a(a327c.equals("98") ? "" : this.a327a);
        setA327b(a327c.equals("98") ? "" : this.a327b);
        notifyPropertyChanged(BR.a327c);
    }

    @Bindable
    public String getA328() {
        return a328;
    }

    public void setA328(String a328) {
        this.a328 = a328;
        setA329a(a328.equals("1") ? this.a329a : "");
        setA329b(a328.equals("1") ? this.a329b : "");
        setA329c(a328.equals("1") ? this.a329c : "");
        setA329d(a328.equals("1") ? this.a329d : "");
        setA329e(a328.equals("1") ? this.a329e : "");
        setA329f(a328.equals("1") ? this.a329f : "");
        notifyPropertyChanged(BR.a328);
    }

    @Bindable
    public String getA329a() {
        return a329a;
    }

    public void setA329a(String a329a) {
        this.a329a = a329a;
        notifyPropertyChanged(BR.a329a);
    }

    @Bindable
    public String getA329b() {
        return a329b;
    }

    public void setA329b(String a329b) {
        this.a329b = a329b;
        notifyPropertyChanged(BR.a329b);
    }

    @Bindable
    public String getA329c() {
        return a329c;
    }

    public void setA329c(String a329c) {
        this.a329c = a329c;
        notifyPropertyChanged(BR.a329c);
    }

    @Bindable
    public String getA329d() {
        return a329d;
    }

    public void setA329d(String a329d) {
        this.a329d = a329d;
        notifyPropertyChanged(BR.a329d);
    }

    @Bindable
    public String getA329e() {
        return a329e;
    }

    public void setA329e(String a329e) {
        this.a329e = a329e;
        notifyPropertyChanged(BR.a329e);
    }

    @Bindable
    public String getA329f() {
        return a329f;
    }

    public void setA329f(String a329f) {
        this.a329f = a329f;
        notifyPropertyChanged(BR.a329f);
    }

    @Bindable
    public String getA330() {
        return a330;
    }

    public void setA330(String a330) {
        this.a330 = a330;
        notifyPropertyChanged(BR.a330);
    }

    @Bindable
    public String getA332() {
        return a332;
    }

    public void setA332(String a332) {
        this.a332 = a332;
        setA332ax(a332.equals("1") ? this.a332ax : "");
        notifyPropertyChanged(BR.a332);
    }

    @Bindable
    public String getA332ax() {
        return a332ax;
    }

    public void setA332ax(String a332ax) {
        this.a332ax = a332ax;
        notifyPropertyChanged(BR.a332ax);
    }

    @Bindable
    public String getA331() {
        return a331;
    }

    public void setA331(String a331) {
        this.a331 = a331;
        setA331xx(a331.equals("96") ? this.a331xx : "");
        notifyPropertyChanged(BR.a331);
    }

    @Bindable
    public String getA331xx() {
        return a331xx;
    }

    public void setA331xx(String a331xx) {
        this.a331xx = a331xx;
        notifyPropertyChanged(BR.a331xx);
    }

    @Bindable
    public String getA333() {
        return a333;
    }

    public void setA333(String a333) {
        this.a333 = a333;
        setA333xx(a333.equals("96") ? this.a333xx : "");
        setA334(a333.equals("97") ? "" : this.a334);
        notifyPropertyChanged(BR.a333);
    }

    @Bindable
    public String getA333xx() {
        return a333xx;
    }

    public void setA333xx(String a333xx) {
        this.a333xx = a333xx;
        notifyPropertyChanged(BR.a333xx);
    }

    @Bindable
    public String getA334() {
        return a334;
    }

    public void setA334(String a334) {
        this.a334 = a334;
        setA334xx(a334.equals("96") ? this.a334xx : "");
        notifyPropertyChanged(BR.a334);
    }

    @Bindable
    public String getA334xx() {
        return a334xx;
    }

    public void setA334xx(String a334xx) {
        this.a334xx = a334xx;
        notifyPropertyChanged(BR.a334xx);
    }

    @Bindable
    public String getA401() {
        return a401;
    }

    public void setA401(String a401) {
        this.a401 = a401;
        notifyPropertyChanged(BR.a401);
    }

    @Bindable
    public String getA402() {
        return a402;
    }

    public void setA402(String a402) {
        this.a402 = a402;
        notifyPropertyChanged(BR.a402);
    }

    @Bindable
    public String getA403() {
        return a403;
    }

    public void setA403(String a403) {
        this.a403 = a403;
        setA404(a403.equals("1") ? this.a404 : "");
        notifyPropertyChanged(BR.a403);
    }

    @Bindable
    public String getA404() {
        return a404;
    }

    public void setA404(String a404) {
        this.a404 = a404;
        notifyPropertyChanged(BR.a404);
    }

    @Bindable
    public String getA405() {
        return a405;
    }

    public void setA405(String a405) {
        this.a405 = a405;
        notifyPropertyChanged(BR.a405);
    }

    @Bindable
    public String getA40601() {
        return a40601;
    }

    public void setA40601(String a40601) {
        this.a40601 = a40601;
        notifyPropertyChanged(BR.a40601);
    }

    @Bindable
    public String getA40602() {
        return a40602;
    }

    public void setA40602(String a40602) {
        this.a40602 = a40602;
        notifyPropertyChanged(BR.a40602);
    }

    @Bindable
    public String getA40603() {
        return a40603;
    }

    public void setA40603(String a40603) {
        this.a40603 = a40603;
        notifyPropertyChanged(BR.a40603);
    }

    @Bindable
    public String getA40604() {
        return a40604;
    }

    public void setA40604(String a40604) {
        this.a40604 = a40604;
        notifyPropertyChanged(BR.a40604);
    }

    @Bindable
    public String getA40605() {
        return a40605;
    }

    public void setA40605(String a40605) {
        this.a40605 = a40605;
        notifyPropertyChanged(BR.a40605);
    }

    @Bindable
    public String getA40606() {
        return a40606;
    }

    public void setA40606(String a40606) {
        this.a40606 = a40606;
        notifyPropertyChanged(BR.a40606);
    }

    @Bindable
    public String getA40607() {
        return a40607;
    }

    public void setA40607(String a40607) {
        this.a40607 = a40607;
        notifyPropertyChanged(BR.a40607);
    }

    @Bindable
    public String getA40608() {
        return a40608;
    }

    public void setA40608(String a40608) {
        this.a40608 = a40608;
        notifyPropertyChanged(BR.a40608);
    }

    @Bindable
    public String getA40609() {
        return a40609;
    }

    public void setA40609(String a40609) {
        this.a40609 = a40609;
        notifyPropertyChanged(BR.a40609);
    }

    @Bindable
    public String getA40610() {
        return a40610;
    }

    public void setA40610(String a40610) {
        this.a40610 = a40610;
        notifyPropertyChanged(BR.a40610);
    }

    @Bindable
    public String getA40611() {
        return a40611;
    }

    public void setA40611(String a40611) {
        this.a40611 = a40611;
        notifyPropertyChanged(BR.a40611);
    }

    @Bindable
    public String getA40612() {
        return a40612;
    }

    public void setA40612(String a40612) {
        this.a40612 = a40612;
        notifyPropertyChanged(BR.a40612);
    }

    @Bindable
    public String getA40613() {
        return a40613;
    }

    public void setA40613(String a40613) {
        this.a40613 = a40613;
        notifyPropertyChanged(BR.a40613);
    }

    @Bindable
    public String getA40614() {
        return a40614;
    }

    public void setA40614(String a40614) {
        this.a40614 = a40614;
        notifyPropertyChanged(BR.a40614);
    }

    @Bindable
    public String getA40615() {
        return a40615;
    }

    public void setA40615(String a40615) {
        this.a40615 = a40615;
        notifyPropertyChanged(BR.a40615);
    }

    @Bindable
    public String getA407() {
        return a407;
    }

    public void setA407(String a407) {
        this.a407 = a407;
        notifyPropertyChanged(BR.a407);
    }

    @Bindable
    public String getA40801() {
        return a40801;
    }

    public void setA40801(String a40801) {
        this.a40801 = a40801;
        notifyPropertyChanged(BR.a40801);
    }

    @Bindable
    public String getA40802() {
        return a40802;
    }

    public void setA40802(String a40802) {
        this.a40802 = a40802;
        notifyPropertyChanged(BR.a40802);
    }

    @Bindable
    public String getA40803() {
        return a40803;
    }

    public void setA40803(String a40803) {
        this.a40803 = a40803;
        notifyPropertyChanged(BR.a40803);
    }

    @Bindable
    public String getA40804() {
        return a40804;
    }

    public void setA40804(String a40804) {
        this.a40804 = a40804;
        notifyPropertyChanged(BR.a40804);
    }

    @Bindable
    public String getA40805() {
        return a40805;
    }

    public void setA40805(String a40805) {
        this.a40805 = a40805;
        notifyPropertyChanged(BR.a40805);
    }

    @Bindable
    public String getA40806() {
        return a40806;
    }

    public void setA40806(String a40806) {
        this.a40806 = a40806;
        notifyPropertyChanged(BR.a40806);
    }

    @Bindable
    public String getA40807() {
        return a40807;
    }

    public void setA40807(String a40807) {
        this.a40807 = a40807;
        notifyPropertyChanged(BR.a40807);
    }

    @Bindable
    public String getA40808() {
        return a40808;
    }

    public void setA40808(String a40808) {
        this.a40808 = a40808;
        notifyPropertyChanged(BR.a40808);
    }

    @Bindable
    public String getA40809() {
        return a40809;
    }

    public void setA40809(String a40809) {
        this.a40809 = a40809;
        notifyPropertyChanged(BR.a40809);
    }

    @Bindable
    public String getA40810() {
        return a40810;
    }

    public void setA40810(String a40810) {
        this.a40810 = a40810;
        notifyPropertyChanged(BR.a40810);
    }

    @Bindable
    public String getA40811() {
        return a40811;
    }

    public void setA40811(String a40811) {
        this.a40811 = a40811;
        notifyPropertyChanged(BR.a40811);
    }

    @Bindable
    public String getA40812() {
        return a40812;
    }

    public void setA40812(String a40812) {
        this.a40812 = a40812;
        notifyPropertyChanged(BR.a40812);
    }

    @Bindable
    public String getA40813() {
        return a40813;
    }

    public void setA40813(String a40813) {
        this.a40813 = a40813;
        notifyPropertyChanged(BR.a40813);
    }

    @Bindable
    public String getA40814() {
        return a40814;
    }

    public void setA40814(String a40814) {
        this.a40814 = a40814;
        notifyPropertyChanged(BR.a40814);
    }

    @Bindable
    public String getA40815() {
        return a40815;
    }

    public void setA40815(String a40815) {
        this.a40815 = a40815;
        notifyPropertyChanged(BR.a40815);
    }

    @Bindable
    public String getA409() {
        return a409;
    }

    public void setA409(String a409) {
        this.a409 = a409;
        notifyPropertyChanged(BR.a409);
    }

    @Bindable
    public String getA40901() {
        return a40901;
    }

    public void setA40901(String a40901) {
        if (this.a40901.equals(a40901)) return; // for all checkboxes
        this.a40901 = a40901;
        notifyPropertyChanged(BR.a40901);
    }

    @Bindable
    public String getA40902() {
        return a40902;
    }

    public void setA40902(String a40902) {
        if (this.a40902.equals(a40902)) return; // for all checkboxes
        this.a40902 = a40902;
        notifyPropertyChanged(BR.a40902);
    }

    @Bindable
    public String getA40903() {
        return a40903;
    }

    public void setA40903(String a40903) {
        if (this.a40903.equals(a40903)) return; // for all checkboxes
        this.a40903 = a40903;
        notifyPropertyChanged(BR.a40903);
    }

    @Bindable
    public String getA40904() {
        return a40904;
    }

    public void setA40904(String a40904) {
        if (this.a40904.equals(a40904)) return; // for all checkboxes
        this.a40904 = a40904;
        notifyPropertyChanged(BR.a40904);
    }

    @Bindable
    public String getA40905() {
        return a40905;
    }

    public void setA40905(String a40905) {
        if (this.a40905.equals(a40905)) return; // for all checkboxes
        this.a40905 = a40905;
        notifyPropertyChanged(BR.a40905);
    }

    @Bindable
    public String getA40906() {
        return a40906;
    }

    public void setA40906(String a40906) {
        if (this.a40906.equals(a40906)) return; // for all checkboxes
        this.a40906 = a40906;
        notifyPropertyChanged(BR.a40906);
    }

    @Bindable
    public String getA40907() {
        return a40907;
    }

    public void setA40907(String a40907) {
        if (this.a40907.equals(a40907)) return; // for all checkboxes
        this.a40907 = a40907;
        notifyPropertyChanged(BR.a40907);
    }

    @Bindable
    public String getA40908() {
        return a40908;
    }

    public void setA40908(String a40908) {
        if (this.a40908.equals(a40908)) return; // for all checkboxes
        this.a40908 = a40908;
        notifyPropertyChanged(BR.a40908);
    }

    @Bindable
    public String getA40998() {
        return a40998;
    }

    public void setA40998(String a40998) {
        if (this.a40998.equals(a40998)) return; // for all checkboxes
        this.a40998 = a40998;
        setA40901(a40998.equals("98") ? "" : this.a40901);
        setA40902(a40998.equals("98") ? "" : this.a40902);
        setA40903(a40998.equals("98") ? "" : this.a40903);
        setA40904(a40998.equals("98") ? "" : this.a40904);
        setA40905(a40998.equals("98") ? "" : this.a40905);
        setA40906(a40998.equals("98") ? "" : this.a40906);
        setA40907(a40998.equals("98") ? "" : this.a40907);
        setA40908(a40998.equals("98") ? "" : this.a40908);
        setA40996(a40998.equals("98") ? "" : this.a40996);
        notifyPropertyChanged(BR.a40998);
    }

    @Bindable
    public String getA40996() {
        return a40996;
    }

    public void setA40996(String a40996) {
        if (this.a40996.equals(a40996)) return; // for all checkboxes
        this.a40996 = a40996;
        setA40996x(a40996.equals("96") ? this.a40996x : "");
        notifyPropertyChanged(BR.a40996);
    }

    @Bindable
    public String getA40996x() {
        return a40996x;
    }

    public void setA40996x(String a40996x) {
        this.a40996x = a40996x;
        notifyPropertyChanged(BR.a40996x);
    }

    @Bindable
    public String getA410() {
        return a410;
    }

    public void setA410(String a410) {
        this.a410 = a410;
        notifyPropertyChanged(BR.a410);
    }

    @Bindable
    public String getA41101() {
        return a41101;
    }

    public void setA41101(String a41101) {
        this.a41101 = a41101;
        notifyPropertyChanged(BR.a41101);
    }

    @Bindable
    public String getA41102() {
        return a41102;
    }

    public void setA41102(String a41102) {
        this.a41102 = a41102;
        notifyPropertyChanged(BR.a41102);
    }

    @Bindable
    public String getA41103() {
        return a41103;
    }

    public void setA41103(String a41103) {
        this.a41103 = a41103;
        notifyPropertyChanged(BR.a41103);
    }

    @Bindable
    public String getA41104() {
        return a41104;
    }

    public void setA41104(String a41104) {
        this.a41104 = a41104;
        notifyPropertyChanged(BR.a41104);
    }

    @Bindable
    public String getA41105() {
        return a41105;
    }

    public void setA41105(String a41105) {
        this.a41105 = a41105;
        notifyPropertyChanged(BR.a41105);
    }

    @Bindable
    public String getA41106() {
        return a41106;
    }

    public void setA41106(String a41106) {
        this.a41106 = a41106;
        notifyPropertyChanged(BR.a41106);
    }

    @Bindable
    public String getA41107() {
        return a41107;
    }

    public void setA41107(String a41107) {
        this.a41107 = a41107;
        notifyPropertyChanged(BR.a41107);
    }

    @Bindable
    public String getA41108() {
        return a41108;
    }

    public void setA41108(String a41108) {
        this.a41108 = a41108;
        notifyPropertyChanged(BR.a41108);
    }

    @Bindable
    public String getA41109() {
        return a41109;
    }

    public void setA41109(String a41109) {
        this.a41109 = a41109;
        notifyPropertyChanged(BR.a41109);
    }

    @Bindable
    public String getA41110() {
        return a41110;
    }

    public void setA41110(String a41110) {
        this.a41110 = a41110;
        notifyPropertyChanged(BR.a41110);
    }

    @Bindable
    public String getA41111() {
        return a41111;
    }

    public void setA41111(String a41111) {
        this.a41111 = a41111;
        notifyPropertyChanged(BR.a41111);
    }

    @Bindable
    public String getA412a() {
        return a412a;
    }

    public void setA412a(String a412a) {
        this.a412a = a412a;
        notifyPropertyChanged(BR.a412a);
    }

    @Bindable
    public String getA412b() {
        return a412b;
    }

    public void setA412b(String a412b) {
        this.a412b = a412b;
        notifyPropertyChanged(BR.a412b);
    }

    @Bindable
    public String getA412c() {
        return a412c;
    }

    public void setA412c(String a412c) {
        this.a412c = a412c;
        notifyPropertyChanged(BR.a412c);
    }

    @Bindable
    public String getA412d() {
        return a412d;
    }

    public void setA412d(String a412d) {
        this.a412d = a412d;
        notifyPropertyChanged(BR.a412d);
    }

    @Bindable
    public String getA412e() {
        return a412e;
    }

    public void setA412e(String a412e) {
        this.a412e = a412e;
        notifyPropertyChanged(BR.a412e);
    }

    @Bindable
    public String getA412f() {
        return a412f;
    }

    public void setA412f(String a412f) {
        this.a412f = a412f;
        notifyPropertyChanged(BR.a412f);
    }

    @Bindable
    public String getA412g() {
        return a412g;
    }

    public void setA412g(String a412g) {
        this.a412g = a412g;
        notifyPropertyChanged(BR.a412g);
    }

    @Bindable
    public String getA412h() {
        return a412h;
    }

    public void setA412h(String a412h) {
        this.a412h = a412h;
        notifyPropertyChanged(BR.a412h);
    }

    @Bindable
    public String getA412i() {
        return a412i;
    }

    public void setA412i(String a412i) {
        this.a412i = a412i;
        notifyPropertyChanged(BR.a412i);
    }

    @Bindable
    public String getA412j() {
        return a412j;
    }

    public void setA412j(String a412j) {
        this.a412j = a412j;
        notifyPropertyChanged(BR.a412j);
    }

    @Bindable
    public String getA412k() {
        return a412k;
    }

    public void setA412k(String a412k) {
        this.a412k = a412k;
        notifyPropertyChanged(BR.a412k);
    }

    @Bindable
    public String getA412l() {
        return a412l;
    }

    public void setA412l(String a412l) {
        this.a412l = a412l;
        notifyPropertyChanged(BR.a412l);
    }

    @Bindable
    public String getA412m() {
        return a412m;
    }

    public void setA412m(String a412m) {
        this.a412m = a412m;
        notifyPropertyChanged(BR.a412m);
    }

    @Bindable
    public String getA412n() {
        return a412n;
    }

    public void setA412n(String a412n) {
        this.a412n = a412n;
        notifyPropertyChanged(BR.a412n);
    }

    @Bindable
    public String getA412o() {
        return a412o;
    }

    public void setA412o(String a412o) {
        this.a412o = a412o;
        notifyPropertyChanged(BR.a412o);
    }

    @Bindable
    public String getA413() {
        return a413;
    }

    public void setA413(String a413) {
        this.a413 = a413;
        notifyPropertyChanged(BR.a413);
    }

    @Bindable
    public String getA41301() {
        return a41301;
    }

    public void setA41301(String a41301) {
        if (this.a41301.equals(a41301)) return; // for all checkboxes
        this.a41301 = a41301;
        notifyPropertyChanged(BR.a41301);
    }

    @Bindable
    public String getA41302() {
        return a41302;
    }

    public void setA41302(String a41302) {
        if (this.a41302.equals(a41302)) return; // for all checkboxes
        this.a41302 = a41302;
        notifyPropertyChanged(BR.a41302);
    }

    @Bindable
    public String getA41303() {
        return a41303;
    }

    public void setA41303(String a41303) {
        if (this.a41303.equals(a41303)) return; // for all checkboxes
        this.a41303 = a41303;
        notifyPropertyChanged(BR.a41303);
    }

    @Bindable
    public String getA41304() {
        return a41304;
    }

    public void setA41304(String a41304) {
        if (this.a41304.equals(a41304)) return; // for all checkboxes
        this.a41304 = a41304;
        notifyPropertyChanged(BR.a41304);
    }

    @Bindable
    public String getA41305() {
        return a41305;
    }

    public void setA41305(String a41305) {
        if (this.a41305.equals(a41305)) return; // for all checkboxes
        this.a41305 = a41305;
        notifyPropertyChanged(BR.a41305);
    }

    @Bindable
    public String getA41306() {
        return a41306;
    }

    public void setA41306(String a41306) {
        if (this.a41306.equals(a41306)) return; // for all checkboxes
        this.a41306 = a41306;
        notifyPropertyChanged(BR.a41306);
    }

    @Bindable
    public String getA41307() {
        return a41307;
    }

    public void setA41307(String a41307) {
        if (this.a41307.equals(a41307)) return; // for all checkboxes
        this.a41307 = a41307;
        notifyPropertyChanged(BR.a41307);
    }

    @Bindable
    public String getA41396() {
        return a41396;
    }

    public void setA41396(String a41396) {
        if (this.a41396.equals(a41396)) return; // for all checkboxes
        this.a41396 = a41396;
        setA41396x(a41396.equals("96") ? this.a41396 : "");
        notifyPropertyChanged(BR.a41396);
    }

    @Bindable
    public String getA41396x() {
        return a41396x;
    }

    public void setA41396x(String a41396x) {
        this.a41396x = a41396x;
        notifyPropertyChanged(BR.a41396x);
    }

    @Bindable
    public String getA414() {
        return a414;
    }

    public void setA414(String a414) {
        this.a414 = a414;
        notifyPropertyChanged(BR.a414);
    }

    @Bindable
    public String getA415() {
        return a415;
    }

    public void setA415(String a415) {
        this.a415 = a415;
        notifyPropertyChanged(BR.a415);
    }

    @Bindable
    public String getA416() {
        return a416;
    }

    public void setA416(String a416) {
        this.a416 = a416;
        notifyPropertyChanged(BR.a416);
    }

    @Bindable
    public String getA41601() {
        return a41601;
    }

    public void setA41601(String a41601) {
        if (this.a41601.equals(a41601)) return; // for all checkboxes
        this.a41601 = a41601;
        notifyPropertyChanged(BR.a41601);
    }

    @Bindable
    public String getA41602() {
        return a41602;
    }

    public void setA41602(String a41602) {
        if (this.a41602.equals(a41602)) return; // for all checkboxes
        this.a41602 = a41602;
        notifyPropertyChanged(BR.a41602);
    }

    @Bindable
    public String getA41603() {
        return a41603;
    }

    public void setA41603(String a41603) {
        if (this.a41603.equals(a41603)) return; // for all checkboxes
        this.a41603 = a41603;
        notifyPropertyChanged(BR.a41603);
    }

    @Bindable
    public String getA41604() {
        return a41604;
    }

    public void setA41604(String a41604) {
        if (this.a41604.equals(a41604)) return; // for all checkboxes
        this.a41604 = a41604;
        notifyPropertyChanged(BR.a41604);
    }

    @Bindable
    public String getA41605() {
        return a41605;
    }

    public void setA41605(String a41605) {
        if (this.a41605.equals(a41605)) return; // for all checkboxes
        this.a41605 = a41605;
        notifyPropertyChanged(BR.a41605);
    }

    @Bindable
    public String getA41606() {
        return a41606;
    }

    public void setA41606(String a41606) {
        if (this.a41606.equals(a41606)) return; // for all checkboxes
        this.a41606 = a41606;
        notifyPropertyChanged(BR.a41606);
    }

    @Bindable
    public String getA41607() {
        return a41607;
    }

    public void setA41607(String a41607) {
        if (this.a41607.equals(a41607)) return; // for all checkboxes
        this.a41607 = a41607;
        notifyPropertyChanged(BR.a41607);
    }

    @Bindable
    public String getA41608() {
        return a41608;
    }

    public void setA41608(String a41608) {
        if (this.a41608.equals(a41608)) return; // for all checkboxes
        this.a41608 = a41608;
        notifyPropertyChanged(BR.a41608);
    }

    @Bindable
    public String getA41609() {
        return a41609;
    }

    public void setA41609(String a41609) {
        if (this.a41609.equals(a41609)) return; // for all checkboxes
        this.a41609 = a41609;
        notifyPropertyChanged(BR.a41609);
    }

    @Bindable
    public String getA41698() {
        return a41698;
    }

    public void setA41698(String a41698) {
        if (this.a41698.equals(a41698)) return; // for all checkboxes
        this.a41698 = a41698;
        setA41601(a41698.equals("98") ? "" : this.a41601);
        setA41602(a41698.equals("98") ? "" : this.a41602);
        setA41603(a41698.equals("98") ? "" : this.a41603);
        setA41604(a41698.equals("98") ? "" : this.a41604);
        setA41605(a41698.equals("98") ? "" : this.a41605);
        setA41606(a41698.equals("98") ? "" : this.a41606);
        setA41607(a41698.equals("98") ? "" : this.a41607);
        setA41608(a41698.equals("98") ? "" : this.a41608);
        setA41609(a41698.equals("98") ? "" : this.a41609);
        setA41696(a41698.equals("98") ? "" : this.a41696);
        notifyPropertyChanged(BR.a41698);
    }

    @Bindable
    public String getA41696() {
        return a41696;
    }

    public void setA41696(String a41696) {
        if (this.a41696.equals(a41696)) return; // for all checkboxes
        this.a41696 = a41696;
        notifyPropertyChanged(BR.a41696);
    }

    @Bindable
    public String getA417() {
        return a417;
    }

    public void setA417(String a417) {
        this.a417 = a417;
        setA41801(a417.equals("13") ? this.a41801 : "");
        setA41802(a417.equals("13") ? this.a41802 : "");
        setA41803(a417.equals("13") ? this.a41803 : "");
        setA41804(a417.equals("13") ? this.a41804 : "");
        setA41805(a417.equals("13") ? this.a41805 : "");
        setA41896(a417.equals("13") ? this.a41896 : "");
        setA41898(a417.equals("13") ? this.a41898 : "");
        notifyPropertyChanged(BR.a417);
    }

    @Bindable
    public String getA41701() {
        return a41701;
    }

    public void setA41701(String a41701) {
        if (this.a41701.equals(a41701)) return; // for all checkboxes
        this.a41701 = a41701;
        notifyPropertyChanged(BR.a41701);
    }

    @Bindable
    public String getA41702() {
        return a41702;
    }

    public void setA41702(String a41702) {
        if (this.a41702.equals(a41702)) return; // for all checkboxes
        this.a41702 = a41702;
        notifyPropertyChanged(BR.a41702);
    }

    @Bindable
    public String getA41703() {
        return a41703;
    }

    public void setA41703(String a41703) {
        if (this.a41703.equals(a41703)) return; // for all checkboxes
        this.a41703 = a41703;
        notifyPropertyChanged(BR.a41703);
    }

    @Bindable
    public String getA41704() {
        return a41704;
    }

    public void setA41704(String a41704) {
        if (this.a41704.equals(a41704)) return; // for all checkboxes
        this.a41704 = a41704;
        notifyPropertyChanged(BR.a41704);
    }

    @Bindable
    public String getA41705() {
        return a41705;
    }

    public void setA41705(String a41705) {
        if (this.a41705.equals(a41705)) return; // for all checkboxes
        this.a41705 = a41705;
        notifyPropertyChanged(BR.a41705);
    }

    @Bindable
    public String getA41706() {
        return a41706;
    }

    public void setA41706(String a41706) {
        if (this.a41706.equals(a41706)) return; // for all checkboxes
        this.a41706 = a41706;
        notifyPropertyChanged(BR.a41706);
    }

    @Bindable
    public String getA41707() {
        return a41707;
    }

    public void setA41707(String a41707) {
        if (this.a41707.equals(a41707)) return; // for all checkboxes
        this.a41707 = a41707;
        notifyPropertyChanged(BR.a41707);
    }

    @Bindable
    public String getA41708() {
        return a41708;
    }

    public void setA41708(String a41708) {
        if (this.a41708.equals(a41708)) return; // for all checkboxes
        this.a41708 = a41708;
        notifyPropertyChanged(BR.a41708);
    }

    @Bindable
    public String getA41709() {
        return a41709;
    }

    public void setA41709(String a41709) {
        if (this.a41709.equals(a41709)) return; // for all checkboxes
        this.a41709 = a41709;
        notifyPropertyChanged(BR.a41709);
    }

    @Bindable
    public String getA41710() {
        return a41710;
    }

    public void setA41710(String a41710) {
        if (this.a41710.equals(a41710)) return; // for all checkboxes
        this.a41710 = a41710;
        notifyPropertyChanged(BR.a41710);
    }

    @Bindable
    public String getA41711() {
        return a41711;
    }

    public void setA41711(String a41711) {
        if (this.a41711.equals(a41711)) return; // for all checkboxes
        this.a41711 = a41711;
        notifyPropertyChanged(BR.a41711);
    }

    @Bindable
    public String getA41712() {
        return a41712;
    }

    public void setA41712(String a41712) {
        if (this.a41712.equals(a41712)) return; // for all checkboxes
        this.a41712 = a41712;
        notifyPropertyChanged(BR.a41712);
    }

    @Bindable
    public String getA41713() {
        return a41713;
    }

    public void setA41713(String a41713) {
        if (this.a41713.equals(a41713)) return; // for all checkboxes
        this.a41713 = a41713;
        notifyPropertyChanged(BR.a41713);
    }

    @Bindable
    public String getA41798() {
        return a41798;
    }

    public void setA41798(String a41798) {
        if (this.a41798.equals(a41798)) return; // for all checkboxes
        this.a41798 = a41798;
        setA41701(a41798.equals("98") ? "" : this.a41701);
        setA41702(a41798.equals("98") ? "" : this.a41702);
        setA41703(a41798.equals("98") ? "" : this.a41703);
        setA41704(a41798.equals("98") ? "" : this.a41704);
        setA41705(a41798.equals("98") ? "" : this.a41705);
        setA41706(a41798.equals("98") ? "" : this.a41706);
        setA41707(a41798.equals("98") ? "" : this.a41707);
        setA41708(a41798.equals("98") ? "" : this.a41708);
        setA41709(a41798.equals("98") ? "" : this.a41709);
        setA41710(a41798.equals("98") ? "" : this.a41710);
        setA41711(a41798.equals("98") ? "" : this.a41711);
        setA41712(a41798.equals("98") ? "" : this.a41712);
        setA41713(a41798.equals("98") ? "" : this.a41712);
        setA41796(a41798.equals("98") ? "" : this.a41796);
        notifyPropertyChanged(BR.a41798);
    }

    @Bindable
    public String getA41796() {
        return a41796;
    }

    public void setA41796(String a41796) {
        if (this.a41796.equals(a41796)) return; // for all checkboxes
        this.a41796 = a41796;
        setA41796x(a41796.equals("96") ? this.a41796x : "");
        notifyPropertyChanged(BR.a41796);
    }

    @Bindable
    public String getA41796x() {
        return a41796x;
    }

    public void setA41796x(String a41796x) {
        this.a41796x = a41796x;
        notifyPropertyChanged(BR.a41796x);
    }

    @Bindable
    public String getA418() {
        return a418;
    }

    public void setA418(String a418) {
        this.a418 = a418;
        notifyPropertyChanged(BR.a418);
    }

    @Bindable
    public String getA41801() {
        return a41801;
    }

    public void setA41801(String a41801) {
        if (this.a41801.equals(a41801)) return; // for all checkboxes
        this.a41801 = a41801;
        notifyPropertyChanged(BR.a41801);
    }

    @Bindable
    public String getA41802() {
        return a41802;
    }

    public void setA41802(String a41802) {
        if (this.a41802.equals(a41802)) return; // for all checkboxes
        this.a41802 = a41802;
        notifyPropertyChanged(BR.a41802);
    }

    @Bindable
    public String getA41803() {
        return a41803;
    }

    public void setA41803(String a41803) {
        if (this.a41803.equals(a41803)) return; // for all checkboxes
        this.a41803 = a41803;
        notifyPropertyChanged(BR.a41803);
    }

    @Bindable
    public String getA41804() {
        return a41804;
    }

    public void setA41804(String a41804) {
        if (this.a41804.equals(a41804)) return; // for all checkboxes
        this.a41804 = a41804;
        notifyPropertyChanged(BR.a41804);
    }

    @Bindable
    public String getA41805() {
        return a41805;
    }

    public void setA41805(String a41805) {
        if (this.a41805.equals(a41805)) return; // for all checkboxes
        this.a41805 = a41805;
        notifyPropertyChanged(BR.a41805);
    }

    @Bindable
    public String getA41898() {
        return a41898;
    }

    public void setA41898(String a41898) {
        if (this.a41898.equals(a41898)) return; // for all checkboxes
        this.a41898 = a41898;
        setA41801(a41898.equals("98") ? "" : this.a41801);
        setA41802(a41898.equals("98") ? "" : this.a41802);
        setA41803(a41898.equals("98") ? "" : this.a41803);
        setA41804(a41898.equals("98") ? "" : this.a41804);
        setA41805(a41898.equals("98") ? "" : this.a41805);
        setA41896(a41898.equals("98") ? "" : this.a41896);
        notifyPropertyChanged(BR.a41898);
    }

    @Bindable
    public String getA41896() {
        return a41896;
    }

    public void setA41896(String a41896) {
        if (this.a41896.equals(a41896)) return; // for all checkboxes
        this.a41896 = a41896;
        setA41896x(a41896.equals("96") ? this.a41896x : "");
        notifyPropertyChanged(BR.a41896);
    }

    @Bindable
    public String getA41896x() {
        return a41896x;
    }

    public void setA41896x(String a41896x) {
        this.a41896x = a41896x;
        notifyPropertyChanged(BR.a41896x);
    }

    @Bindable
    public String getA419() {
        return a419;
    }

    public void setA419(String a419) {
        this.a419 = a419;
        notifyPropertyChanged(BR.a419);
    }

    @Bindable
    public String getA41901() {
        return a41901;
    }

    public void setA41901(String a41901) {
        if (this.a41901.equals(a41901)) return; // for all checkboxes
        this.a41901 = a41901;
        notifyPropertyChanged(BR.a41901);
    }

    @Bindable
    public String getA41902() {
        return a41902;
    }

    public void setA41902(String a41902) {
        if (this.a41902.equals(a41902)) return; // for all checkboxes
        this.a41902 = a41902;
        notifyPropertyChanged(BR.a41902);
    }

    @Bindable
    public String getA41903() {
        return a41903;
    }

    public void setA41903(String a41903) {
        if (this.a41903.equals(a41903)) return; // for all checkboxes
        this.a41903 = a41903;
        notifyPropertyChanged(BR.a41903);
    }

    @Bindable
    public String getA41904() {
        return a41904;
    }

    public void setA41904(String a41904) {
        if (this.a41904.equals(a41904)) return; // for all checkboxes
        this.a41904 = a41904;
        notifyPropertyChanged(BR.a41904);
    }

    @Bindable
    public String getA41905() {
        return a41905;
    }

    public void setA41905(String a41905) {
        if (this.a41905.equals(a41905)) return; // for all checkboxes
        this.a41905 = a41905;
        notifyPropertyChanged(BR.a41905);
    }

    @Bindable
    public String getA41906() {
        return a41906;
    }

    public void setA41906(String a41906) {
        if (this.a41906.equals(a41906)) return; // for all checkboxes
        this.a41906 = a41906;
        notifyPropertyChanged(BR.a41906);
    }

    @Bindable
    public String getA41907() {
        return a41907;
    }

    public void setA41907(String a41907) {
        if (this.a41907.equals(a41907)) return; // for all checkboxes
        this.a41907 = a41907;
        notifyPropertyChanged(BR.a41907);
    }

    @Bindable
    public String getA41908() {
        return a41908;
    }

    public void setA41908(String a41908) {
        if (this.a41908.equals(a41908)) return; // for all checkboxes
        this.a41908 = a41908;
        notifyPropertyChanged(BR.a41908);
    }

    @Bindable
    public String getA41909() {
        return a41909;
    }

    public void setA41909(String a41909) {
        if (this.a41909.equals(a41909)) return; // for all checkboxes
        this.a41909 = a41909;
        notifyPropertyChanged(BR.a41909);
    }

    @Bindable
    public String getA41910() {
        return a41910;
    }

    public void setA41910(String a41910) {
        if (this.a41910.equals(a41910)) return; // for all checkboxes
        this.a41910 = a41910;
        notifyPropertyChanged(BR.a41910);
    }

    @Bindable
    public String getA41911() {
        return a41911;
    }

    public void setA41911(String a41911) {
        if (this.a41911.equals(a41911)) return; // for all checkboxes
        this.a41911 = a41911;
        notifyPropertyChanged(BR.a41911);
    }

    @Bindable
    public String getA41912() {
        return a41912;
    }

    public void setA41912(String a41912) {
        if (this.a41912.equals(a41912)) return; // for all checkboxes
        this.a41912 = a41912;
        notifyPropertyChanged(BR.a41912);
    }

    @Bindable
    public String getA41913() {
        return a41913;
    }

    public void setA41913(String a41913) {
        if (this.a41913.equals(a41913)) return; // for all checkboxes
        this.a41913 = a41913;
        notifyPropertyChanged(BR.a41913);
    }

    @Bindable
    public String getA41914() {
        return a41914;
    }

    public void setA41914(String a41914) {
        if (this.a41914.equals(a41914)) return; // for all checkboxes
        this.a41914 = a41914;
        notifyPropertyChanged(BR.a41914);
    }

    @Bindable
    public String getA41915() {
        return a41915;
    }

    public void setA41915(String a41915) {
        if (this.a41915.equals(a41915)) return; // for all checkboxes
        this.a41915 = a41915;
        notifyPropertyChanged(BR.a41915);
    }

    @Bindable
    public String getA41998() {
        return a41998;
    }

    public void setA41998(String a41998) {
        if (this.a41998.equals(a41998)) return; // for all checkboxes
        this.a41998 = a41998;
        setA41901(a41998.equals("98") ? "" : this.a41901);
        setA41902(a41998.equals("98") ? "" : this.a41902);
        setA41903(a41998.equals("98") ? "" : this.a41903);
        setA41904(a41998.equals("98") ? "" : this.a41904);
        setA41905(a41998.equals("98") ? "" : this.a41905);
        setA41906(a41998.equals("98") ? "" : this.a41906);
        setA41907(a41998.equals("98") ? "" : this.a41907);
        setA41908(a41998.equals("98") ? "" : this.a41908);
        setA41909(a41998.equals("98") ? "" : this.a41909);
        setA41910(a41998.equals("98") ? "" : this.a41910);
        setA41911(a41998.equals("98") ? "" : this.a41911);
        setA41912(a41998.equals("98") ? "" : this.a41912);
        setA41913(a41998.equals("98") ? "" : this.a41913);
        setA41914(a41998.equals("98") ? "" : this.a41914);
        setA41915(a41998.equals("98") ? "" : this.a41915);
        setA41996(a41998.equals("98") ? "" : this.a41996);
        notifyPropertyChanged(BR.a41998);
    }

    @Bindable
    public String getA41996() {
        return a41996;
    }

    public void setA41996(String a41996) {
        if (this.a41996.equals(a41996)) return; // for all checkboxes
        this.a41996 = a41996;
        setA41996x(a41996.equals("96") ? this.a41996x : "");
        notifyPropertyChanged(BR.a41996);
    }

    @Bindable
    public String getA41996x() {
        return a41996x;
    }

    public void setA41996x(String a41996x) {
        this.a41996x = a41996x;
        notifyPropertyChanged(BR.a41996x);
    }

    @Bindable
    public String getA501() {
        return a501;
    }

    public void setA501(String a501) {
        this.a501 = a501;
        notifyPropertyChanged(BR.a501);
    }

    @Bindable
    public String getA50101() {
        return a50101;
    }

    public void setA50101(String a50101) {
        if (this.a50101.equals(a50101)) return; // for all checkboxes
        this.a50101 = a50101;
        notifyPropertyChanged(BR.a50101);
    }

    @Bindable
    public String getA50102() {
        return a50102;
    }

    public void setA50102(String a50102) {
        if (this.a50102.equals(a50102)) return; // for all checkboxes
        this.a50102 = a50102;
        notifyPropertyChanged(BR.a50102);
    }

    @Bindable
    public String getA50103() {
        return a50103;
    }

    public void setA50103(String a50103) {
        if (this.a50103.equals(a50103)) return; // for all checkboxes
        this.a50103 = a50103;
        notifyPropertyChanged(BR.a50103);
    }

    @Bindable
    public String getA50198() {
        return a50198;
    }

    public void setA50198(String a50198) {
        if (this.a50198.equals(a50198)) return; // for all checkboxes
        this.a50198 = a50198;
        setA50101(a50198.equals("98") ? "" : this.a50101);
        setA50102(a50198.equals("98") ? "" : this.a50102);
        setA50103(a50198.equals("98") ? "" : this.a50103);
        setA50105(a50198.equals("98") ? "" : this.a50105);
        notifyPropertyChanged(BR.a50198);
    }

    @Bindable
    public String getA50105() {
        return a50105;
    }

    public void setA50105(String a50105) {
        if (this.a50105.equals(a50105)) return; // for all checkboxes
        this.a50105 = a50105;
        setA502(a50105.equals("5") ? "" : this.a502);
        setA502(a50105.equals("5") ? "" : this.a502);

        setA50301(a50105.equals("5") ? "" : this.a50301);
        setA50302(a50105.equals("5") ? "" : this.a50302);
        setA50303(a50105.equals("5") ? "" : this.a50303);
        setA50304(a50105.equals("5") ? "" : this.a50304);
        setA50305(a50105.equals("5") ? "" : this.a50305);

        setA50401(a50105.equals("5") ? "" : this.a50401);
        setA50402(a50105.equals("5") ? "" : this.a50402);
        setA50403(a50105.equals("5") ? "" : this.a50403);
        setA50404(a50105.equals("5") ? "" : this.a50404);
        setA50497(a50105.equals("5") ? "" : this.a50497);

        setA50501(a50105.equals("5") ? "" : this.a50501);
        setA50502(a50105.equals("5") ? "" : this.a50502);
        setA50503(a50105.equals("5") ? "" : this.a50503);
        setA50504(a50105.equals("5") ? "" : this.a50504);
        setA50597(a50105.equals("5") ? "" : this.a50597);

        setA506(a50105.equals("5") ? "" : this.a506);
        setA507(a50105.equals("5") ? "" : this.a507);
        setA508(a50105.equals("5") ? "" : this.a508);
        setA509(a50105.equals("5") ? "" : this.a509);
        setA510(a50105.equals("5") ? "" : this.a510);
        setA511(a50105.equals("5") ? "" : this.a511);

        setA51201(a50105.equals("5") ? "" : this.a51201);
        setA51202(a50105.equals("5") ? "" : this.a51202);
        setA51203(a50105.equals("5") ? "" : this.a51203);
        setA51204(a50105.equals("5") ? "" : this.a51204);
        setA51205(a50105.equals("5") ? "" : this.a51205);
        setA51296(a50105.equals("5") ? "" : this.a51296);
        setA51298(a50105.equals("5") ? "" : this.a51298);

        setA513a(a50105.equals("5") ? "" : this.a513a);
        setA513b(a50105.equals("5") ? "" : this.a513b);
        setA513c(a50105.equals("5") ? "" : this.a513c);
        setA513d(a50105.equals("5") ? "" : this.a513d);
        setA513e(a50105.equals("5") ? "" : this.a513e);
        setA513f(a50105.equals("5") ? "" : this.a513f);
        setA513g(a50105.equals("5") ? "" : this.a513g);
        setA513h(a50105.equals("5") ? "" : this.a513h);
        setA513i(a50105.equals("5") ? "" : this.a513i);
        setA513j(a50105.equals("5") ? "" : this.a513j);
        setA513k(a50105.equals("5") ? "" : this.a513k);
        setA513l(a50105.equals("5") ? "" : this.a513l);
        setA513m(a50105.equals("5") ? "" : this.a513m);
        setA513n(a50105.equals("5") ? "" : this.a513n);
        setA513o(a50105.equals("5") ? "" : this.a513o);
        setA513p(a50105.equals("5") ? "" : this.a513p);
        notifyPropertyChanged(BR.a50105);
    }

    @Bindable
    public String getA502() {
        return a502;
    }

    public void setA502(String a502) {
        this.a502 = a502;
        notifyPropertyChanged(BR.a502);
    }

    @Bindable
    public String getA50301() {
        return a50301;
    }

    public void setA50301(String a50301) {
        this.a50301 = a50301;
        notifyPropertyChanged(BR.a50301);
    }

    @Bindable
    public String getA50302() {
        return a50302;
    }

    public void setA50302(String a50302) {
        this.a50302 = a50302;
        notifyPropertyChanged(BR.a50302);
    }

    @Bindable
    public String getA50303() {
        return a50303;
    }

    public void setA50303(String a50303) {
        this.a50303 = a50303;
        notifyPropertyChanged(BR.a50303);
    }

    @Bindable
    public String getA50304() {
        return a50304;
    }

    public void setA50304(String a50304) {
        this.a50304 = a50304;
        notifyPropertyChanged(BR.a50304);
    }

    @Bindable
    public String getA50305() {
        return a50305;
    }

    public void setA50305(String a50305) {
        if (this.a50305.equals(a50305)) return; // for all checkboxes
        this.a50305 = a50305;
        setA50301(a50305.equals("1") ? "" : this.a50301);
        setA50302(a50305.equals("1") ? "" : this.a50302);
        setA50303(a50305.equals("1") ? "" : this.a50303);
        setA50304(a50305.equals("1") ? "" : this.a50304);
        notifyPropertyChanged(BR.a50305);
    }

    @Bindable
    public String getA50401() {
        return a50401;
    }

    public void setA50401(String a50401) {
        this.a50401 = a50401;
        notifyPropertyChanged(BR.a50401);
    }

    @Bindable
    public String getA50402() {
        return a50402;
    }

    public void setA50402(String a50402) {
        this.a50402 = a50402;
        notifyPropertyChanged(BR.a50402);
    }

    @Bindable
    public String getA50403() {
        return a50403;
    }

    public void setA50403(String a50403) {
        this.a50403 = a50403;
        notifyPropertyChanged(BR.a50403);
    }

    @Bindable
    public String getA50404() {
        return a50404;
    }

    public void setA50404(String a50404) {
        this.a50404 = a50404;
        notifyPropertyChanged(BR.a50404);
    }

    @Bindable
    public String getA50497() {
        return a50497;
    }

    public void setA50497(String a50497) {
        if (this.a50497.equals(a50497)) return; // for all checkboxes
        this.a50497 = a50497;
        setA50401(a50497.equals("1") ? "" : this.a50401);
        setA50402(a50497.equals("1") ? "" : this.a50402);
        setA50403(a50497.equals("1") ? "" : this.a50403);
        setA50404(a50497.equals("1") ? "" : this.a50404);
        notifyPropertyChanged(BR.a50497);
    }

    @Bindable
    public String getA50501() {
        return a50501;
    }

    public void setA50501(String a50501) {
        this.a50501 = a50501;
        notifyPropertyChanged(BR.a50501);
    }

    @Bindable
    public String getA50502() {
        return a50502;
    }

    public void setA50502(String a50502) {
        this.a50502 = a50502;
        notifyPropertyChanged(BR.a50502);
    }

    @Bindable
    public String getA50503() {
        return a50503;
    }

    public void setA50503(String a50503) {
        this.a50503 = a50503;
        notifyPropertyChanged(BR.a50503);
    }

    @Bindable
    public String getA50504() {
        return a50504;
    }

    public void setA50504(String a50504) {
        this.a50504 = a50504;
        notifyPropertyChanged(BR.a50504);
    }

    @Bindable
    public String getA50597() {
        return a50597;
    }

    public void setA50597(String a50597) {
        if (this.a50597.equals(a50597)) return; // for all checkboxes
        this.a50597 = a50597;
        setA50501(a50597.equals("1") ? "" : this.a50501);
        setA50502(a50597.equals("1") ? "" : this.a50502);
        setA50503(a50597.equals("1") ? "" : this.a50503);
        setA50504(a50597.equals("1") ? "" : this.a50504);
        notifyPropertyChanged(BR.a50597);
    }

    @Bindable
    public String getA506() {
        return a506;
    }

    public void setA506(String a506) {
        this.a506 = a506;
        notifyPropertyChanged(BR.a506);
    }

    @Bindable
    public String getA507() {
        return a507;
    }

    public void setA507(String a507) {
        this.a507 = a507;
        notifyPropertyChanged(BR.a507);
    }

    @Bindable
    public String getA508() {
        return a508;
    }

    public void setA508(String a508) {
        this.a508 = a508;
        notifyPropertyChanged(BR.a508);
    }

    @Bindable
    public String getA509() {
        return a509;
    }

    public void setA509(String a509) {
        this.a509 = a509;
        notifyPropertyChanged(BR.a509);
    }

    @Bindable
    public String getA510() {
        return a510;
    }

    public void setA510(String a510) {
        this.a510 = a510;
        notifyPropertyChanged(BR.a510);
    }

    @Bindable
    public String getA511() {
        return a511;
    }

    public void setA511(String a511) {
        this.a511 = a511;
        notifyPropertyChanged(BR.a511);
    }

    @Bindable
    public String getA512() {
        return a512;
    }

    public void setA512(String a512) {
        this.a512 = a512;
        notifyPropertyChanged(BR.a512);
    }

    @Bindable
    public String getA51201() {
        return a51201;
    }

    public void setA51201(String a51201) {
        if (this.a51201.equals(a51201)) return; // for all checkboxes
        this.a51201 = a51201;
        notifyPropertyChanged(BR.a51201);
    }

    @Bindable
    public String getA51202() {
        return a51202;
    }

    public void setA51202(String a51202) {
        if (this.a51202.equals(a51202)) return; // for all checkboxes
        this.a51202 = a51202;
        notifyPropertyChanged(BR.a51202);
    }

    @Bindable
    public String getA51203() {
        return a51203;
    }

    public void setA51203(String a51203) {
        if (this.a51203.equals(a51203)) return; // for all checkboxes
        this.a51203 = a51203;
        notifyPropertyChanged(BR.a51203);
    }

    @Bindable
    public String getA51204() {
        return a51204;
    }

    public void setA51204(String a51204) {
        if (this.a51204.equals(a51204)) return; // for all checkboxes
        this.a51204 = a51204;
        notifyPropertyChanged(BR.a51204);
    }

    @Bindable
    public String getA51205() {
        return a51205;
    }

    public void setA51205(String a51205) {
        if (this.a51205.equals(a51205)) return; // for all checkboxes
        this.a51205 = a51205;
        notifyPropertyChanged(BR.a51205);
    }

    @Bindable
    public String getA51298() {
        return a51298;
    }

    public void setA51298(String a51298) {
        if (this.a51298.equals(a51298)) return; // for all checkboxes
        this.a51298 = a51298;
        setA51201(a51298.equals("98") ? "" : this.a51201);
        setA51202(a51298.equals("98") ? "" : this.a51202);
        setA51203(a51298.equals("98") ? "" : this.a51203);
        setA51204(a51298.equals("98") ? "" : this.a51204);
        setA51205(a51298.equals("98") ? "" : this.a51205);
        setA51296(a51298.equals("98") ? "" : this.a51296);
        notifyPropertyChanged(BR.a51298);
    }

    @Bindable
    public String getA51296() {
        return a51296;
    }

    public void setA51296(String a51296) {
        if (this.a51296.equals(a51296)) return; // for all checkboxes
        this.a51296 = a51296;
        setA51296x(a51296.equals("96") ? this.a51296x : "");
        notifyPropertyChanged(BR.a51296);
    }

    @Bindable
    public String getA51296x() {
        return a51296x;
    }

    public void setA51296x(String a51296x) {
        this.a51296x = a51296x;
        notifyPropertyChanged(BR.a51296x);
    }

    @Bindable
    public String getA513a() {
        return a513a;
    }

    public void setA513a(String a513a) {
        this.a513a = a513a;
        notifyPropertyChanged(BR.a513a);
    }

    @Bindable
    public String getA513b() {
        return a513b;
    }

    public void setA513b(String a513b) {
        this.a513b = a513b;
        notifyPropertyChanged(BR.a513b);
    }

    @Bindable
    public String getA513c() {
        return a513c;
    }

    public void setA513c(String a513c) {
        this.a513c = a513c;
        notifyPropertyChanged(BR.a513c);
    }

    @Bindable
    public String getA513d() {
        return a513d;
    }

    public void setA513d(String a513d) {
        this.a513d = a513d;
        notifyPropertyChanged(BR.a513d);
    }

    @Bindable
    public String getA513e() {
        return a513e;
    }

    public void setA513e(String a513e) {
        this.a513e = a513e;
        notifyPropertyChanged(BR.a513e);
    }

    @Bindable
    public String getA513f() {
        return a513f;
    }

    public void setA513f(String a513f) {
        this.a513f = a513f;
        notifyPropertyChanged(BR.a513f);
    }

    @Bindable
    public String getA513g() {
        return a513g;
    }

    public void setA513g(String a513g) {
        this.a513g = a513g;
        notifyPropertyChanged(BR.a513g);
    }

    @Bindable
    public String getA513h() {
        return a513h;
    }

    public void setA513h(String a513h) {
        this.a513h = a513h;
        notifyPropertyChanged(BR.a513h);
    }

    @Bindable
    public String getA513i() {
        return a513i;
    }

    public void setA513i(String a513i) {
        this.a513i = a513i;
        notifyPropertyChanged(BR.a513i);
    }

    @Bindable
    public String getA513j() {
        return a513j;
    }

    public void setA513j(String a513j) {
        this.a513j = a513j;
        notifyPropertyChanged(BR.a513j);
    }

    @Bindable
    public String getA513k() {
        return a513k;
    }

    public void setA513k(String a513k) {
        this.a513k = a513k;
        notifyPropertyChanged(BR.a513k);
    }

    @Bindable
    public String getA513l() {
        return a513l;
    }

    public void setA513l(String a513l) {
        this.a513l = a513l;
        notifyPropertyChanged(BR.a513l);
    }

    @Bindable
    public String getA513m() {
        return a513m;
    }

    public void setA513m(String a513m) {
        this.a513m = a513m;
        notifyPropertyChanged(BR.a513m);
    }

    @Bindable
    public String getA513n() {
        return a513n;
    }

    public void setA513n(String a513n) {
        this.a513n = a513n;
        notifyPropertyChanged(BR.a513n);
    }

    @Bindable
    public String getA513o() {
        return a513o;
    }

    public void setA513o(String a513o) {
        this.a513o = a513o;
        notifyPropertyChanged(BR.a513o);
    }

    @Bindable
    public String getA513p() {
        return a513p;
    }

    public void setA513p(String a513p) {
        this.a513p = a513p;
        notifyPropertyChanged(BR.a513p);
    }

    @Bindable
    public String getA514() {
        return a514;
    }

    public void setA514(String a514) {
        this.a514 = a514;
        setA515(a514.equals("1") ? this.a515 : "");
        setA516(a514.equals("1") ? this.a516 : "");
        notifyPropertyChanged(BR.a514);
    }

    @Bindable
    public String getA515() {
        return a515;
    }

    public void setA515(String a515) {
        this.a515 = a515;
        notifyPropertyChanged(BR.a515);
    }

    @Bindable
    public String getA516() {
        return a516;
    }

    public void setA516(String a516) {
        this.a516 = a516;
        notifyPropertyChanged(BR.a516);
    }

    @Bindable
    public String getA517() {
        return a517;
    }

    public void setA517(String a517) {
        this.a517 = a517;
        setA51801(a517.equals("2") || a517.equals("98") ? this.a51801 : "");
        setA51802(a517.equals("2") || a517.equals("98") ? this.a51802 : "");
        setA51803(a517.equals("2") || a517.equals("98") ? this.a51803 : "");
        setA51804(a517.equals("2") || a517.equals("98") ? this.a51804 : "");
        setA51805(a517.equals("2") || a517.equals("98") ? this.a51805 : "");
        setA51806(a517.equals("2") || a517.equals("98") ? this.a51806 : "");
        setA51807(a517.equals("2") || a517.equals("98") ? this.a51807 : "");
        setA51808(a517.equals("2") || a517.equals("98") ? this.a51808 : "");
        setA51809(a517.equals("2") || a517.equals("98") ? this.a51809 : "");
        setA51810(a517.equals("2") || a517.equals("98") ? this.a51810 : "");
        setA51811(a517.equals("2") || a517.equals("98") ? this.a51811 : "");
        setA51812(a517.equals("2") || a517.equals("98") ? this.a51812 : "");
        setA51813(a517.equals("2") || a517.equals("98") ? this.a51813 : "");
        setA51814(a517.equals("2") || a517.equals("98") ? this.a51814 : "");
        setA51896(a517.equals("2") || a517.equals("98") ? this.a51896 : "");
        setA51898(a517.equals("2") || a517.equals("98") ? this.a51898 : "");
        notifyPropertyChanged(BR.a517);
    }

    @Bindable
    public String getA518() {
        return a518;
    }

    public void setA518(String a518) {
        this.a518 = a518;
        notifyPropertyChanged(BR.a518);
    }

    @Bindable
    public String getA51801() {
        return a51801;
    }

    public void setA51801(String a51801) {
        if (this.a51801.equals(a51801)) return; // for all checkboxes
        this.a51801 = a51801;
        notifyPropertyChanged(BR.a51801);
    }

    @Bindable
    public String getA51802() {
        return a51802;
    }

    public void setA51802(String a51802) {
        if (this.a51802.equals(a51802)) return; // for all checkboxes
        this.a51802 = a51802;
        notifyPropertyChanged(BR.a51802);
    }

    @Bindable
    public String getA51803() {
        return a51803;
    }

    public void setA51803(String a51803) {
        if (this.a51803.equals(a51803)) return; // for all checkboxes
        this.a51803 = a51803;
        notifyPropertyChanged(BR.a51803);
    }

    @Bindable
    public String getA51804() {
        return a51804;
    }

    public void setA51804(String a51804) {
        if (this.a51804.equals(a51804)) return; // for all checkboxes
        this.a51804 = a51804;
        notifyPropertyChanged(BR.a51804);
    }

    @Bindable
    public String getA51805() {
        return a51805;
    }

    public void setA51805(String a51805) {
        if (this.a51805.equals(a51805)) return; // for all checkboxes
        this.a51805 = a51805;
        notifyPropertyChanged(BR.a51805);
    }

    @Bindable
    public String getA51806() {
        return a51806;
    }

    public void setA51806(String a51806) {
        if (this.a51806.equals(a51806)) return; // for all checkboxes
        this.a51806 = a51806;
        notifyPropertyChanged(BR.a51806);
    }

    @Bindable
    public String getA51807() {
        return a51807;
    }

    public void setA51807(String a51807) {
        if (this.a51807.equals(a51807)) return; // for all checkboxes
        this.a51807 = a51807;
        notifyPropertyChanged(BR.a51807);
    }

    @Bindable
    public String getA51808() {
        return a51808;
    }

    public void setA51808(String a51808) {
        if (this.a51808.equals(a51808)) return; // for all checkboxes
        this.a51808 = a51808;
        notifyPropertyChanged(BR.a51808);
    }

    @Bindable
    public String getA51809() {
        return a51809;
    }

    public void setA51809(String a51809) {
        if (this.a51809.equals(a51809)) return; // for all checkboxes
        this.a51809 = a51809;
        notifyPropertyChanged(BR.a51809);
    }

    @Bindable
    public String getA51810() {
        return a51810;
    }

    public void setA51810(String a51810) {
        if (this.a51810.equals(a51810)) return; // for all checkboxes
        this.a51810 = a51810;
        notifyPropertyChanged(BR.a51810);
    }

    @Bindable
    public String getA51811() {
        return a51811;
    }

    public void setA51811(String a51811) {
        if (this.a51811.equals(a51811)) return; // for all checkboxes
        this.a51811 = a51811;
        notifyPropertyChanged(BR.a51811);
    }

    @Bindable
    public String getA51812() {
        return a51812;
    }

    public void setA51812(String a51812) {
        if (this.a51812.equals(a51812)) return; // for all checkboxes
        this.a51812 = a51812;
        notifyPropertyChanged(BR.a51812);
    }

    @Bindable
    public String getA51813() {
        return a51813;
    }

    public void setA51813(String a51813) {
        if (this.a51813.equals(a51813)) return; // for all checkboxes
        this.a51813 = a51813;
        notifyPropertyChanged(BR.a51813);
    }

    @Bindable
    public String getA51814() {
        return a51814;
    }

    public void setA51814(String a51814) {
        if (this.a51814.equals(a51814)) return; // for all checkboxes
        this.a51814 = a51814;
        notifyPropertyChanged(BR.a51814);
    }

    @Bindable
    public String getA51896() {
        return a51896;
    }

    public void setA51896(String a51896) {
        if (this.a51896.equals(a51896)) return; // for all checkboxes
        this.a51896 = a51896;
        setA51896x(a51896.equals("96") ? this.a51896 : "");
        notifyPropertyChanged(BR.a51896);
    }

    @Bindable
    public String getA51896x() {
        return a51896x;
    }

    public void setA51896x(String a51896x) {
        this.a51896x = a51896x;
        notifyPropertyChanged(BR.a51896x);
    }

    @Bindable
    public String getA51898() {
        return a51898;
    }

    public void setA51898(String a51898) {
        if (this.a51898.equals(a51898)) return; // for all checkboxes
        this.a51898 = a51898;
        setA51801(a51898.equals("98") ? "" : this.a51801);
        setA51802(a51898.equals("98") ? "" : this.a51802);
        setA51803(a51898.equals("98") ? "" : this.a51803);
        setA51804(a51898.equals("98") ? "" : this.a51804);
        setA51805(a51898.equals("98") ? "" : this.a51805);
        setA51806(a51898.equals("98") ? "" : this.a51806);
        setA51807(a51898.equals("98") ? "" : this.a51807);
        setA51808(a51898.equals("98") ? "" : this.a51808);
        setA51809(a51898.equals("98") ? "" : this.a51809);
        setA51810(a51898.equals("98") ? "" : this.a51810);
        setA51811(a51898.equals("98") ? "" : this.a51811);
        setA51812(a51898.equals("98") ? "" : this.a51812);
        setA51813(a51898.equals("98") ? "" : this.a51813);
        setA51814(a51898.equals("98") ? "" : this.a51814);
        setA51896(a51898.equals("98") ? "" : this.a51896);
        notifyPropertyChanged(BR.a51898);
    }

    @Bindable
    public String getA519() {
        return a519;
    }

    public void setA519(String a519) {
        this.a519 = a519;
        setA51901x(a519.equals("1") ? this.a51901x : "");
        notifyPropertyChanged(BR.a519);
    }

    @Bindable
    public String getA51901x() {
        return a51901x;
    }

    public void setA51901x(String a51901x) {
        this.a51901x = a51901x;
        notifyPropertyChanged(BR.a51901x);
    }

    @Bindable
    public String getA520() {
        return a520;
    }

    public void setA520(String a520) {
        this.a520 = a520;
        notifyPropertyChanged(BR.a520);
    }

    @Bindable
    public String getA52001() {
        return a52001;
    }

    public void setA52001(String a52001) {
        if (this.a52001.equals(a52001)) return; // for all checkboxes
        this.a52001 = a52001;
        setA52001x(a52001.equals("1") ? this.a52001x : "");
        notifyPropertyChanged(BR.a52001);
    }

    @Bindable
    public String getA52001x() {
        return a52001x;
    }

    public void setA52001x(String a52001x) {
        this.a52001x = a52001x;
        notifyPropertyChanged(BR.a52001x);
    }

    @Bindable
    public String getA52002() {
        return a52002;
    }

    public void setA52002(String a52002) {
        if (this.a52002.equals(a52002)) return; // for all checkboxes
        this.a52002 = a52002;
        setA52002x(a52002.equals("2") ? this.a52002x : "");
        notifyPropertyChanged(BR.a52002);
    }

    @Bindable
    public String getA52002x() {
        return a52002x;
    }

    public void setA52002x(String a52002x) {
        this.a52002x = a52002x;
        notifyPropertyChanged(BR.a52002x);
    }

    @Bindable
    public String getA52003() {
        return a52003;
    }

    public void setA52003(String a52003) {
        if (this.a52003.equals(a52003)) return; // for all checkboxes
        this.a52003 = a52003;
        setA52003x(a52003.equals("3") ? this.a52003x : "");
        notifyPropertyChanged(BR.a52003);
    }

    @Bindable
    public String getA52003x() {
        return a52003x;
    }

    public void setA52003x(String a52003x) {
        this.a52003x = a52003x;
        notifyPropertyChanged(BR.a52003x);
    }

    @Bindable
    public String getA52004() {
        return a52004;
    }

    public void setA52004(String a52004) {
        if (this.a52004.equals(a52004)) return; // for all checkboxes
        this.a52004 = a52004;
        setA52004x(a52004.equals("4") ? this.a52004x : "");
        notifyPropertyChanged(BR.a52004);
    }

    @Bindable
    public String getA52004x() {
        return a52004x;
    }

    public void setA52004x(String a52004x) {
        this.a52004x = a52004x;
        notifyPropertyChanged(BR.a52004x);
    }

    @Bindable
    public String getA52005() {
        return a52005;
    }

    public void setA52005(String a52005) {
        if (this.a52005.equals(a52005)) return; // for all checkboxes
        this.a52005 = a52005;
        setA52005x(a52005.equals("5") ? this.a52005x : "");
        notifyPropertyChanged(BR.a52005);
    }

    @Bindable
    public String getA52005x() {
        return a52005x;
    }

    public void setA52005x(String a52005x) {
        this.a52005x = a52005x;
        notifyPropertyChanged(BR.a52005x);
    }

    @Bindable
    public String getA52098() {
        return a52098;
    }

    public void setA52098(String a52098) {
        if (this.a52098.equals(a52098)) return; // for all checkboxes
        this.a52098 = a52098;
        setA52001(a52098.equals("98") ? "" : this.a52001);
        setA52002(a52098.equals("98") ? "" : this.a52002);
        setA52003(a52098.equals("98") ? "" : this.a52003);
        setA52004(a52098.equals("98") ? "" : this.a52004);
        setA52005(a52098.equals("98") ? "" : this.a52005);
        setA52096(a52098.equals("98") ? "" : this.a52096);
        notifyPropertyChanged(BR.a52098);
    }

    @Bindable
    public String getA52096() {
        return a52096;
    }

    public void setA52096(String a52096) {
        if (this.a52096.equals(a52096)) return; // for all checkboxes
        this.a52096 = a52096;
        setA52096x(a52096.equals("96") ? this.a52096x : "");
        notifyPropertyChanged(BR.a52096);
    }

    @Bindable
    public String getA52096x() {
        return a52096x;
    }

    public void setA52096x(String a52096x) {
        this.a52096x = a52096x;
        notifyPropertyChanged(BR.a52096x);
    }

    @Bindable
    public String getA521() {
        return a521;
    }

    public void setA521(String a521) {
        this.a521 = a521;
        setA52196x(a521.equals("96") ? this.a52196x : "");
        notifyPropertyChanged(BR.a521);
    }

    @Bindable
    public String getA52196x() {
        return a52196x;
    }

    public void setA52196x(String a52196x) {
        this.a52196x = a52196x;
        notifyPropertyChanged(BR.a52196x);
    }

    @Bindable
    public String getA5221() {
        return a5221;
    }

    public void setA5221(String a5221) {
        this.a5221 = a5221;
        setA5221ax(a5221.equals("1") ? this.a5221ax : "");
        setA5221bx(a5221.equals("2") ? this.a5221bx : "");
        setA5221cx(a5221.equals("3") ? this.a5221cx : "");
        notifyPropertyChanged(BR.a5221);
    }

    @Bindable
    public String getA5221ax() {
        return a5221ax;
    }

    public void setA5221ax(String a5221ax) {
        this.a5221ax = a5221ax;
        notifyPropertyChanged(BR.a5221ax);
    }

    @Bindable
    public String getA5221bx() {
        return a5221bx;
    }

    public void setA5221bx(String a5221bx) {
        this.a5221bx = a5221bx;
        notifyPropertyChanged(BR.a5221bx);
    }

    @Bindable
    public String getA5221cx() {
        return a5221cx;
    }

    public void setA5221cx(String a5221cx) {
        this.a5221cx = a5221cx;
        notifyPropertyChanged(BR.a5221cx);
    }

    @Bindable
    public String getA5222() {
        return a5222;
    }

    public void setA5222(String a5222) {
        this.a5222 = a5222;
        setA5222ax(a5222.equals("1") ? this.a5222ax : "");
        setA5222bx(a5222.equals("2") ? this.a5222bx : "");
        setA5222cx(a5222.equals("3") ? this.a5222cx : "");
        notifyPropertyChanged(BR.a5222);
    }

    @Bindable
    public String getA5222ax() {
        return a5222ax;
    }

    public void setA5222ax(String a5222ax) {
        this.a5222ax = a5222ax;
        notifyPropertyChanged(BR.a5222ax);
    }

    @Bindable
    public String getA5222bx() {
        return a5222bx;
    }

    public void setA5222bx(String a5222bx) {
        this.a5222bx = a5222bx;
        notifyPropertyChanged(BR.a5222bx);
    }

    @Bindable
    public String getA5222cx() {
        return a5222cx;
    }

    public void setA5222cx(String a5222cx) {
        this.a5222cx = a5222cx;
        notifyPropertyChanged(BR.a5222cx);
    }

    @Bindable
    public String getA5223() {
        return a5223;
    }

    public void setA5223(String a5223) {
        this.a5223 = a5223;
        setA5223ax(a5223.equals("1") ? this.a5223ax : "");
        setA5223bx(a5223.equals("2") ? this.a5223bx : "");
        setA5223cx(a5223.equals("3") ? this.a5223cx : "");
        notifyPropertyChanged(BR.a5223);
    }

    @Bindable
    public String getA5223ax() {
        return a5223ax;
    }

    public void setA5223ax(String a5223ax) {
        this.a5223ax = a5223ax;
        notifyPropertyChanged(BR.a5223ax);
    }

    @Bindable
    public String getA5223bx() {
        return a5223bx;
    }

    public void setA5223bx(String a5223bx) {
        this.a5223bx = a5223bx;
        notifyPropertyChanged(BR.a5223bx);
    }

    @Bindable
    public String getA5223cx() {
        return a5223cx;
    }

    public void setA5223cx(String a5223cx) {
        this.a5223cx = a5223cx;
        notifyPropertyChanged(BR.a5223cx);
    }

    @Bindable
    public String getA5224() {
        return a5224;
    }

    public void setA5224(String a5224) {
        this.a5224 = a5224;
        setA5224ax(a5224.equals("1") ? this.a5224ax : "");
        setA5224bx(a5224.equals("2") ? this.a5224bx : "");
        setA5224cx(a5224.equals("3") ? this.a5224cx : "");
        notifyPropertyChanged(BR.a5224);
    }

    @Bindable
    public String getA5224ax() {
        return a5224ax;
    }

    public void setA5224ax(String a5224ax) {
        this.a5224ax = a5224ax;
        notifyPropertyChanged(BR.a5224ax);
    }

    @Bindable
    public String getA5224bx() {
        return a5224bx;
    }

    public void setA5224bx(String a5224bx) {
        this.a5224bx = a5224bx;
        notifyPropertyChanged(BR.a5224bx);
    }

    @Bindable
    public String getA5224cx() {
        return a5224cx;
    }

    public void setA5224cx(String a5224cx) {
        this.a5224cx = a5224cx;
        notifyPropertyChanged(BR.a5224cx);
    }

    @Bindable
    public String getA5225() {
        return a5225;
    }

    public void setA5225(String a5225) {
        this.a5225 = a5225;
        setA5225ax(a5225.equals("1") ? this.a5225ax : "");
        setA5225bx(a5225.equals("2") ? this.a5225bx : "");
        setA5225cx(a5225.equals("3") ? this.a5225cx : "");
        notifyPropertyChanged(BR.a5225);
    }

    @Bindable
    public String getA5225ax() {
        return a5225ax;
    }

    public void setA5225ax(String a5225ax) {
        this.a5225ax = a5225ax;
        notifyPropertyChanged(BR.a5225ax);
    }

    @Bindable
    public String getA5225bx() {
        return a5225bx;
    }

    public void setA5225bx(String a5225bx) {
        this.a5225bx = a5225bx;
        notifyPropertyChanged(BR.a5225bx);
    }

    @Bindable
    public String getA5225cx() {
        return a5225cx;
    }

    public void setA5225cx(String a5225cx) {
        this.a5225cx = a5225cx;
        notifyPropertyChanged(BR.a5225cx);
    }

    @Bindable
    public String getA5226() {
        return a5226;
    }

    public void setA5226(String a5226) {
        this.a5226 = a5226;
        setA5226ax(a5226.equals("1") ? this.a5226ax : "");
        setA5226bx(a5226.equals("2") ? this.a5226bx : "");
        setA5226cx(a5226.equals("3") ? this.a5226cx : "");
        setA52296x(a5226.equals("96") ? this.a52296x : "");
        notifyPropertyChanged(BR.a5226);
    }

    @Bindable
    public String getA5226ax() {
        return a5226ax;
    }

    public void setA5226ax(String a5226ax) {
        this.a5226ax = a5226ax;
        notifyPropertyChanged(BR.a5226ax);
    }

    @Bindable
    public String getA5226bx() {
        return a5226bx;
    }

    public void setA5226bx(String a5226bx) {
        this.a5226bx = a5226bx;
        notifyPropertyChanged(BR.a5226bx);
    }

    @Bindable
    public String getA5226cx() {
        return a5226cx;
    }

    public void setA5226cx(String a5226cx) {
        this.a5226cx = a5226cx;
        notifyPropertyChanged(BR.a5226cx);
    }

    @Bindable
    public String getA52296x() {
        return a52296x;
    }

    public void setA52296x(String a52296x) {
        this.a52296x = a52296x;
        notifyPropertyChanged(BR.a52296x);
    }

    @Bindable
    public String getA523() {
        return a523;
    }

    public void setA523(String a523) {
        this.a523 = a523;
        notifyPropertyChanged(BR.a523);
    }

    @Bindable
    public String getA524() {
        return a524;
    }

    public void setA524(String a524) {
        this.a524 = a524;
        notifyPropertyChanged(BR.a524);
    }

    @Bindable
    public String getA52401() {
        return a52401;
    }

    public void setA52401(String a52401) {
        if (this.a52401.equals(a52401)) return; // for all checkboxes
        this.a52401 = a52401;
        setA52401x(a52401.equals("1") ? this.a52401x : "");
        notifyPropertyChanged(BR.a52401);
    }

    @Bindable
    public String getA52401x() {
        return a52401x;
    }

    public void setA52401x(String a52401x) {
        this.a52401x = a52401x;
        notifyPropertyChanged(BR.a52401x);
    }

    @Bindable
    public String getA52402() {
        return a52402;
    }

    public void setA52402(String a52402) {
        if (this.a52402.equals(a52402)) return; // for all checkboxes
        this.a52402 = a52402;
        setA52402x(a52402.equals("2") ? this.a52402x : "");
        notifyPropertyChanged(BR.a52402);
    }

    @Bindable
    public String getA52402x() {
        return a52402x;
    }

    public void setA52402x(String a52402x) {
        this.a52402x = a52402x;
        notifyPropertyChanged(BR.a52402x);
    }

    @Bindable
    public String getA52403() {
        return a52403;
    }

    public void setA52403(String a52403) {
        if (this.a52403.equals(a52403)) return; // for all checkboxes
        this.a52403 = a52403;
        setA52403x(a52403.equals("3") ? this.a52403x : "");
        notifyPropertyChanged(BR.a52403);
    }

    @Bindable
    public String getA52403x() {
        return a52403x;
    }

    public void setA52403x(String a52403x) {
        this.a52403x = a52403x;
        notifyPropertyChanged(BR.a52403x);
    }

    @Bindable
    public String getA52404() {
        return a52404;
    }

    public void setA52404(String a52404) {
        if (this.a52404.equals(a52404)) return; // for all checkboxes
        this.a52404 = a52404;
        setA52404x(a52404.equals("4") ? this.a52404x : "");
        notifyPropertyChanged(BR.a52404);
    }

    @Bindable
    public String getA52404x() {
        return a52404x;
    }

    public void setA52404x(String a52404x) {
        this.a52404x = a52404x;
        notifyPropertyChanged(BR.a52404x);
    }

    @Bindable
    public String getA52405() {
        return a52405;
    }

    public void setA52405(String a52405) {
        if (this.a52405.equals(a52405)) return; // for all checkboxes
        this.a52405 = a52405;
        setA52405x(a52405.equals("5") ? this.a52405x : "");
        notifyPropertyChanged(BR.a52405);
    }

    @Bindable
    public String getA52405x() {
        return a52405x;
    }

    public void setA52405x(String a52405x) {
        this.a52405x = a52405x;
        notifyPropertyChanged(BR.a52405x);
    }

    @Bindable
    public String getA52496() {
        return a52496;
    }

    public void setA52496(String a52496) {
        if (this.a52496.equals(a52496)) return; // for all checkboxes
        this.a52496 = a52496;
        setA52496x(a52496.equals("96") ? a52496x : "");
        notifyPropertyChanged(BR.a52496);
    }

    @Bindable
    public String getA52496x() {
        return a52496x;
    }

    public void setA52496x(String a52496x) {
        this.a52496x = a52496x;
        notifyPropertyChanged(BR.a52496x);
    }

    @Bindable
    public String getA52498() {
        return a52498;
    }

    public void setA52498(String a52498) {
        if (this.a52498.equals(a52498)) return; // for all checkboxes
        this.a52498 = a52498;
        setA52401(a52498.equals("98") ? "" : this.a52401);
        setA52402(a52498.equals("98") ? "" : this.a52402);
        setA52403(a52498.equals("98") ? "" : this.a52403);
        setA52404(a52498.equals("98") ? "" : this.a52404);
        setA52405(a52498.equals("98") ? "" : this.a52405);
        setA52496(a52498.equals("98") ? "" : this.a52496);

        setA525(a52498.equals("98") ? "" : this.a525);
        setA526(a52498.equals("98") ? "" : this.a526);
        setA527(a52498.equals("98") ? "" : this.a527);
        setA528(a52498.equals("98") ? "" : this.a528);
        notifyPropertyChanged(BR.a52498);
    }

    @Bindable
    public String getA525() {
        return a525;
    }

    public void setA525(String a525) {
        this.a525 = a525;
        notifyPropertyChanged(BR.a525);
    }

    @Bindable
    public String getA526() {
        return a526;
    }

    public void setA526(String a526) {
        this.a526 = a526;
        setA52696x(a526.equals("96") ? this.a52696x : "");
        notifyPropertyChanged(BR.a526);
    }

    @Bindable
    public String getA52696x() {
        return a52696x;
    }

    public void setA52696x(String a52696x) {
        this.a52696x = a52696x;
        notifyPropertyChanged(BR.a52696x);
    }

    @Bindable
    public String getA527() {
        return a527;
    }

    public void setA527(String a527) {
        this.a527 = a527;
        notifyPropertyChanged(BR.a527);
    }

    @Bindable
    public String getA528() {
        return a528;
    }

    public void setA528(String a528) {
        this.a528 = a528;
        setA52802x(a528.equals("2") ? this.a52802x : "");
        notifyPropertyChanged(BR.a528);
    }

    @Bindable
    public String getA52802x() {
        return a52802x;
    }

    public void setA52802x(String a52802x) {
        this.a52802x = a52802x;
        notifyPropertyChanged(BR.a52802x);
    }

    @Bindable
    public String getA52996() {
        return a52996;
    }

    public void setA52996(String a52996) {
        this.a52996 = a52996;
        setA52996x(a52996.equals("96") ? this.a52996x : "");
        notifyPropertyChanged(BR.a52996);
    }

    @Bindable
    public String getA52901() {
        return a52901;
    }

    public void setA52901(String a52901) {
        if (this.a52901.equals(a52901)) return; // for all checkboxes
        this.a52901 = a52901;
        notifyPropertyChanged(BR.a52901);
    }

    @Bindable
    public String getA52902() {
        return a52902;
    }

    public void setA52902(String a52902) {
        if (this.a52902.equals(a52902)) return; // for all checkboxes
        this.a52902 = a52902;
        notifyPropertyChanged(BR.a52902);
    }

    @Bindable
    public String getA52903() {
        return a52903;
    }

    public void setA52903(String a52903) {
        if (this.a52903.equals(a52903)) return; // for all checkboxes
        this.a52903 = a52903;
        notifyPropertyChanged(BR.a52903);
    }

    @Bindable
    public String getA52904() {
        return a52904;
    }

    public void setA52904(String a52904) {
        if (this.a52904.equals(a52904)) return; // for all checkboxes
        this.a52904 = a52904;
        notifyPropertyChanged(BR.a52904);
    }

    @Bindable
    public String getA52905() {
        return a52905;
    }

    public void setA52905(String a52905) {
        if (this.a52905.equals(a52905)) return; // for all checkboxes
        this.a52905 = a52905;
        notifyPropertyChanged(BR.a52905);
    }

    @Bindable
    public String getA52906() {
        return a52906;
    }

    public void setA52906(String a52906) {
        if (this.a52906.equals(a52906)) return; // for all checkboxes
        this.a52906 = a52906;
        notifyPropertyChanged(BR.a52906);
    }

    @Bindable
    public String getA52907() {
        return a52907;
    }

    public void setA52907(String a52907) {
        if (this.a52907.equals(a52907)) return; // for all checkboxes
        this.a52907 = a52907;
        notifyPropertyChanged(BR.a52907);
    }

    @Bindable
    public String getA52908() {
        return a52908;
    }

    public void setA52908(String a52908) {
        if (this.a52908.equals(a52908)) return; // for all checkboxes
        this.a52908 = a52908;
        notifyPropertyChanged(BR.a52908);
    }

    @Bindable
    public String getA52998() {
        return a52998;
    }

    public void setA52998(String a52998) {
        if (this.a52998.equals(a52998)) return; // for all checkboxes
        this.a52998 = a52998;
        setA52901(a52998.equals("98") ? "" : this.a52901);
        setA52902(a52998.equals("98") ? "" : this.a52902);
        setA52903(a52998.equals("98") ? "" : this.a52903);
        setA52904(a52998.equals("98") ? "" : this.a52904);
        setA52905(a52998.equals("98") ? "" : this.a52905);
        setA52906(a52998.equals("98") ? "" : this.a52906);
        setA52907(a52998.equals("98") ? "" : this.a52907);
        setA52908(a52998.equals("98") ? "" : this.a52908);
        setA52996(a52998.equals("98") ? "" : this.a52996);
        notifyPropertyChanged(BR.a52998);
    }

    @Bindable
    public String getA52996x() {
        return a52996x;
    }

    public void setA52996x(String a52996x) {
        this.a52996x = a52996x;
        notifyPropertyChanged(BR.a52996x);
    }

    @Bindable
    public String getA530() {
        return a530;
    }

    public void setA530(String a530) {
        this.a530 = a530;
        notifyPropertyChanged(BR.a530);
    }

    @Bindable
    public String getA53001() {
        return a53001;
    }

    public void setA53001(String a53001) {
        if (this.a53001.equals(a53001)) return; // for all checkboxes
        this.a53001 = a53001;
        notifyPropertyChanged(BR.a53001);
    }

    @Bindable
    public String getA53002() {
        return a53002;
    }

    public void setA53002(String a53002) {
        if (this.a53002.equals(a53002)) return; // for all checkboxes
        this.a53002 = a53002;
        notifyPropertyChanged(BR.a53002);
    }

    @Bindable
    public String getA53003() {
        return a53003;
    }

    public void setA53003(String a53003) {
        if (this.a53003.equals(a53003)) return; // for all checkboxes
        this.a53003 = a53003;
        notifyPropertyChanged(BR.a53003);
    }

    @Bindable
    public String getA53004() {
        return a53004;
    }

    public void setA53004(String a53004) {
        if (this.a53004.equals(a53004)) return; // for all checkboxes
        this.a53004 = a53004;
        notifyPropertyChanged(BR.a53004);
    }

    @Bindable
    public String getA53005() {
        return a53005;
    }

    public void setA53005(String a53005) {
        if (this.a53005.equals(a53005)) return; // for all checkboxes
        this.a53005 = a53005;
        notifyPropertyChanged(BR.a53005);
    }

    @Bindable
    public String getA53006() {
        return a53006;
    }

    public void setA53006(String a53006) {
        if (this.a53006.equals(a53006)) return; // for all checkboxes
        this.a53006 = a53006;
        notifyPropertyChanged(BR.a53006);
    }

    @Bindable
    public String getA53007() {
        return a53007;
    }

    public void setA53007(String a53007) {
        if (this.a53007.equals(a53007)) return; // for all checkboxes
        this.a53007 = a53007;
        notifyPropertyChanged(BR.a53007);
    }

    @Bindable
    public String getA53008() {
        return a53008;
    }

    public void setA53008(String a53008) {
        if (this.a53008.equals(a53008)) return; // for all checkboxes
        this.a53008 = a53008;
        notifyPropertyChanged(BR.a53008);
    }

    @Bindable
    public String getA53009() {
        return a53009;
    }

    public void setA53009(String a53009) {
        if (this.a53009.equals(a53009)) return; // for all checkboxes
        this.a53009 = a53009;
        notifyPropertyChanged(BR.a53009);
    }

    @Bindable
    public String getA53010() {
        return a53010;
    }

    public void setA53010(String a53010) {
        if (this.a53010.equals(a53010)) return; // for all checkboxes
        this.a53010 = a53010;
        notifyPropertyChanged(BR.a53010);
    }

    @Bindable
    public String getA53098() {
        return a53098;
    }

    public void setA53098(String a53098) {
        if (this.a53098.equals(a53098)) return; // for all checkboxes
        this.a53098 = a53098;
        setA53001(a53098.equals("98") ? "" : this.a53001);
        setA53002(a53098.equals("98") ? "" : this.a53002);
        setA53003(a53098.equals("98") ? "" : this.a53003);
        setA53004(a53098.equals("98") ? "" : this.a53004);
        setA53005(a53098.equals("98") ? "" : this.a53005);
        setA53006(a53098.equals("98") ? "" : this.a53006);
        setA53007(a53098.equals("98") ? "" : this.a53007);
        setA53008(a53098.equals("98") ? "" : this.a53008);
        setA53009(a53098.equals("98") ? "" : this.a53009);
        setA53010(a53098.equals("98") ? "" : this.a53010);
        setA53096(a53098.equals("98") ? "" : this.a53096);
        notifyPropertyChanged(BR.a53098);
    }

    @Bindable
    public String getA53096() {
        return a53096;
    }

    public void setA53096(String a53096) {
        if (this.a53096.equals(a53096)) return; // for all checkboxes
        this.a53096 = a53096;
        setA52096x(a53096.equals("96") ? this.a53096 : "");
        notifyPropertyChanged(BR.a53096);
    }

    @Bindable
    public String getA53096x() {
        return a53096x;
    }

    public void setA53096x(String a53096x) {
        this.a53096x = a53096x;
        notifyPropertyChanged(BR.a53096x);
    }

    @Bindable
    public String getA531() {
        return a531;
    }

    public void setA531(String a531) {
        this.a531 = a531;
        setA53196x(a531.equals("96") ? this.a53196x : "");
        notifyPropertyChanged(BR.a531);
    }

    @Bindable
    public String getA53196x() {
        return a53196x;
    }

    public void setA53196x(String a53196x) {
        this.a53196x = a53196x;
        notifyPropertyChanged(BR.a53196x);
    }

    @Bindable
    public String getA532() {
        return a532;
    }

    public void setA532(String a532) {
        this.a532 = a532;
        notifyPropertyChanged(BR.a532);
    }

    @Bindable
    public String getA533() {
        return a533;
    }

    public void setA533(String a533) {
        this.a533 = a533;
        notifyPropertyChanged(BR.a533);
    }

    @Bindable
    public String getA53301() {
        return a53301;
    }

    public void setA53301(String a53301) {
        if (this.a53301.equals(a53301)) return; // for all checkboxes
        this.a53301 = a53301;
        notifyPropertyChanged(BR.a53301);
    }

    @Bindable
    public String getA53302() {
        return a53302;
    }

    public void setA53302(String a53302) {
        if (this.a53302.equals(a53302)) return; // for all checkboxes
        this.a53302 = a53302;
        notifyPropertyChanged(BR.a53302);
    }

    @Bindable
    public String getA53303() {
        return a53303;
    }

    public void setA53303(String a53303) {
        if (this.a53303.equals(a53303)) return; // for all checkboxes
        this.a53303 = a53303;
        notifyPropertyChanged(BR.a53303);
    }

    @Bindable
    public String getA53304() {
        return a53304;
    }

    public void setA53304(String a53304) {
        if (this.a53304.equals(a53304)) return; // for all checkboxes
        this.a53304 = a53304;
        notifyPropertyChanged(BR.a53304);
    }

    @Bindable
    public String getA53398() {
        return a53398;
    }

    public void setA53398(String a53398) {
        if (this.a53398.equals(a53398)) return; // for all checkboxes
        this.a53398 = a53398;
        setA53301(a53398.equals("98") ? "" : this.a53301);
        setA53302(a53398.equals("98") ? "" : this.a53302);
        setA53303(a53398.equals("98") ? "" : this.a53303);
        setA53304(a53398.equals("98") ? "" : this.a53304);
        setA53396(a53398.equals("98") ? "" : this.a53396);
        notifyPropertyChanged(BR.a53398);
    }

    @Bindable
    public String getA53396() {
        return a53396;
    }

    public void setA53396(String a53396) {
        if (this.a53396.equals(a53396)) return; // for all checkboxes
        this.a53396 = a53396;
        setA53396x(a53396.equals("96") ? this.a53396x : "");
        notifyPropertyChanged(BR.a53396);
    }

    @Bindable
    public String getA53396x() {
        return a53396x;
    }

    public void setA53396x(String a53396x) {
        this.a53396x = a53396x;
        notifyPropertyChanged(BR.a53396x);
    }

    @Bindable
    public String getA534() {
        return a534;
    }

    public void setA534(String a534) {
        this.a534 = a534;
        notifyPropertyChanged(BR.a534);
    }

    @Bindable
    public String getA53401() {
        return a53401;
    }

    public void setA53401(String a53401) {
        if (this.a53401.equals(a53401)) return; // for all checkboxes
        this.a53401 = a53401;
        notifyPropertyChanged(BR.a53401);
    }

    @Bindable
    public String getA53402() {
        return a53402;
    }

    public void setA53402(String a53402) {
        if (this.a53402.equals(a53402)) return; // for all checkboxes
        this.a53402 = a53402;
        notifyPropertyChanged(BR.a53402);
    }

    @Bindable
    public String getA53403() {
        return a53403;
    }

    public void setA53403(String a53403) {
        if (this.a53403.equals(a53403)) return; // for all checkboxes
        this.a53403 = a53403;
        notifyPropertyChanged(BR.a53403);
    }

    @Bindable
    public String getA53404() {
        return a53404;
    }

    public void setA53404(String a53404) {
        if (this.a53404.equals(a53404)) return; // for all checkboxes
        this.a53404 = a53404;
        notifyPropertyChanged(BR.a53404);
    }

    @Bindable
    public String getA53405() {
        return a53405;
    }

    public void setA53405(String a53405) {
        if (this.a53405.equals(a53405)) return; // for all checkboxes
        this.a53405 = a53405;
        notifyPropertyChanged(BR.a53405);
    }

    @Bindable
    public String getA53406() {
        return a53406;
    }

    public void setA53406(String a53406) {
        if (this.a53406.equals(a53406)) return; // for all checkboxes
        this.a53406 = a53406;
        notifyPropertyChanged(BR.a53406);
    }

    @Bindable
    public String getA53407() {
        return a53407;
    }

    public void setA53407(String a53407) {
        if (this.a53407.equals(a53407)) return; // for all checkboxes
        this.a53407 = a53407;
        notifyPropertyChanged(BR.a53407);
    }

    @Bindable
    public String getA53408() {
        return a53408;
    }

    public void setA53408(String a53408) {
        if (this.a53408.equals(a53408)) return; // for all checkboxes
        this.a53408 = a53408;
        notifyPropertyChanged(BR.a53408);
    }

    @Bindable
    public String getA53409() {
        return a53409;
    }

    public void setA53409(String a53409) {
        if (this.a53409.equals(a53409)) return; // for all checkboxes
        this.a53409 = a53409;
        notifyPropertyChanged(BR.a53409);
    }

    @Bindable
    public String getA53410() {
        return a53410;
    }

    public void setA53410(String a53410) {
        if (this.a53410.equals(a53410)) return; // for all checkboxes
        this.a53410 = a53410;
        notifyPropertyChanged(BR.a53410);
    }

    @Bindable
    public String getA53498() {
        return a53498;
    }

    public void setA53498(String a53498) {
        if (this.a53498.equals(a53498)) return; // for all checkboxes
        this.a53498 = a53498;
        setA53401(a53498.equals("98") ? "" : this.a53401);
        setA53402(a53498.equals("98") ? "" : this.a53402);
        setA53403(a53498.equals("98") ? "" : this.a53403);
        setA53404(a53498.equals("98") ? "" : this.a53404);
        setA53405(a53498.equals("98") ? "" : this.a53405);
        setA53406(a53498.equals("98") ? "" : this.a53406);
        setA53407(a53498.equals("98") ? "" : this.a53407);
        setA53408(a53498.equals("98") ? "" : this.a53408);
        setA53409(a53498.equals("98") ? "" : this.a53409);
        setA53410(a53498.equals("98") ? "" : this.a53410);
        setA53496(a53498.equals("98") ? "" : this.a53496);
        notifyPropertyChanged(BR.a53498);
    }

    @Bindable
    public String getA53496() {
        return a53496;
    }

    public void setA53496(String a53496) {
        if (this.a53496.equals(a53496)) return; // for all checkboxes
        this.a53496 = a53496;
        setA53496x(a53496.equals("96") ? this.a53496x : "");
        notifyPropertyChanged(BR.a53496);
    }

    @Bindable
    public String getA53496x() {
        return a53496x;
    }

    public void setA53496x(String a53496x) {
        this.a53496x = a53496x;
        notifyPropertyChanged(BR.a53496x);
    }

    @Bindable
    public String getB101() {
        return b101;
    }

    public void setB101(String b101) {
        this.b101 = b101;
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB103() {
        return b103;
    }

    public void setB103(String b103) {
        this.b103 = b103;
        notifyPropertyChanged(BR.b103);
    }

    @Bindable
    public String getB104() {
        return b104;
    }

    public void setB104(String b104) {
        this.b104 = b104;
        notifyPropertyChanged(BR.b104);
    }

    @Bindable
    public String getB105() {
        return b105;
    }

    public void setB105(String b105) {
        this.b105 = b105;
        notifyPropertyChanged(BR.b105);
    }

    @Bindable
    public String getB106() {
        return b106;
    }

    public void setB106(String b106) {
        this.b106 = b106;
        notifyPropertyChanged(BR.b106);
    }

    @Bindable
    public String getB107() {
        return b107;
    }

    public void setB107(String b107) {
        this.b107 = b107;
        notifyPropertyChanged(BR.b107);
    }

    @Bindable
    public String getB108() {
        return b108;
    }

    public void setB108(String b108) {
        this.b108 = b108;
        notifyPropertyChanged(BR.b108);
    }

    @Bindable
    public String getB109() {
        return b109;
    }

    public void setB109(String b109) {
        this.b109 = b109;
        notifyPropertyChanged(BR.b109);
    }

    @Bindable
    public String getB110() {
        return b110;
    }

    public void setB110(String b110) {
        this.b110 = b110;
        notifyPropertyChanged(BR.b110);
    }

    @Bindable
    public String getB111() {
        return b111;
    }

    public void setB111(String b111) {
        this.b111 = b111;
        notifyPropertyChanged(BR.b111);
    }

    @Bindable
    public String getB112() {
        return b112;
    }

    public void setB112(String b112) {
        this.b112 = b112;
        notifyPropertyChanged(BR.b112);
    }

    @Bindable
    public String getB113() {
        return b113;
    }

    public void setB113(String b113) {
        this.b113 = b113;
        notifyPropertyChanged(BR.b113);
    }

    @Bindable
    public String getB114() {
        return b114;
    }

    public void setB114(String b114) {
        this.b114 = b114;
        notifyPropertyChanged(BR.b114);
    }

    @Bindable
    public String getB115() {
        return b115;
    }

    public void setB115(String b115) {
        this.b115 = b115;
        notifyPropertyChanged(BR.b115);
    }

    @Bindable
    public String getB116() {
        return b116;
    }

    public void setB116(String b116) {
        this.b116 = b116;
        notifyPropertyChanged(BR.b116);
    }

    @Bindable
    public String getB117() {
        return b117;
    }

    public void setB117(String b117) {
        this.b117 = b117;
        notifyPropertyChanged(BR.b117);
    }

    @Bindable
    public String getB118() {
        return b118;
    }

    public void setB118(String b118) {
        this.b118 = b118;
        notifyPropertyChanged(BR.b118);
    }

    @Bindable
    public String getB301() {
        return b301;
    }

    public void setB301(String b301) {
        this.b301 = b301;
        notifyPropertyChanged(BR.b301);
    }

    @Bindable
    public String getB301a() {
        return b301a;
    }

    public void setB301a(String b301a) {
        if (this.b301a.equals(b301a)) return; // for all checkboxes
        this.b301a = b301a;
        notifyPropertyChanged(BR.b301a);
    }

    @Bindable
    public String getB301b() {
        return b301b;
    }

    public void setB301b(String b301b) {
        if (this.b301b.equals(b301b)) return; // for all checkboxes
        this.b301b = b301b;
        notifyPropertyChanged(BR.b301b);
    }

    @Bindable
    public String getB301c() {
        return b301c;
    }

    public void setB301c(String b301c) {
        if (this.b301c.equals(b301c)) return; // for all checkboxes
        this.b301c = b301c;
        notifyPropertyChanged(BR.b301c);
    }

    @Bindable
    public String getB301d() {
        return b301d;
    }

    public void setB301d(String b301d) {
        if (this.b301d.equals(b301d)) return; // for all checkboxes
        this.b301d = b301d;
        notifyPropertyChanged(BR.b301d);
    }

    @Bindable
    public String getB301e() {
        return b301e;
    }

    public void setB301e(String b301e) {
        if (this.b301e.equals(b301e)) return; // for all checkboxes
        this.b301e = b301e;
        notifyPropertyChanged(BR.b301e);
    }

    @Bindable
    public String getB301f() {
        return b301f;
    }

    public void setB301f(String b301f) {
        if (this.b301f.equals(b301f)) return; // for all checkboxes
        this.b301f = b301f;
        notifyPropertyChanged(BR.b301f);
    }

    @Bindable
    public String getB301g() {
        return b301g;
    }

    public void setB301g(String b301g) {
        if (this.b301g.equals(b301g)) return; // for all checkboxes
        this.b301g = b301g;
        notifyPropertyChanged(BR.b301g);
    }

    @Bindable
    public String getB301h() {
        return b301h;
    }

    public void setB301h(String b301h) {
        if (this.b301h.equals(b301h)) return; // for all checkboxes
        this.b301h = b301h;
        notifyPropertyChanged(BR.b301h);
    }

    @Bindable
    public String getB30196() {
        return b30196;
    }

    public void setB30196(String b30196) {
        if (this.b30196.equals(b30196)) return; // for all checkboxes
        this.b30196 = b30196;
        setB30196x(b30196.equals("96") ? this.b30196x : "");
        notifyPropertyChanged(BR.b30196);
    }

    @Bindable
    public String getB30196x() {
        return b30196x;
    }

    public void setB30196x(String b30196x) {
        this.b30196x = b30196x;
        notifyPropertyChanged(BR.b30196x);
    }

    @Bindable
    public String getB302() {
        return b302;
    }

    public void setB302(String b302) {
        this.b302 = b302;
        notifyPropertyChanged(BR.b302);
    }

    @Bindable
    public String getB302a() {
        return b302a;
    }

    public void setB302a(String b302a) {
        if (this.b302a.equals(b302a)) return; // for all checkboxes
        this.b302a = b302a;
        notifyPropertyChanged(BR.b302a);
    }

    @Bindable
    public String getB302b() {
        return b302b;
    }

    public void setB302b(String b302b) {
        if (this.b302b.equals(b302b)) return; // for all checkboxes
        this.b302b = b302b;
        notifyPropertyChanged(BR.b302b);
    }

    @Bindable
    public String getB302c() {
        return b302c;
    }

    public void setB302c(String b302c) {
        if (this.b302c.equals(b302c)) return; // for all checkboxes
        this.b302c = b302c;
        notifyPropertyChanged(BR.b302c);
    }

    @Bindable
    public String getB302d() {
        return b302d;
    }

    public void setB302d(String b302d) {
        if (this.b302d.equals(b302d)) return; // for all checkboxes
        this.b302d = b302d;
        notifyPropertyChanged(BR.b302d);
    }

    @Bindable
    public String getB302e() {
        return b302e;
    }

    public void setB302e(String b302e) {
        if (this.b302e.equals(b302e)) return; // for all checkboxes
        this.b302e = b302e;
        notifyPropertyChanged(BR.b302e);
    }

    @Bindable
    public String getB302f() {
        return b302f;
    }

    public void setB302f(String b302f) {
        if (this.b302f.equals(b302f)) return; // for all checkboxes
        this.b302f = b302f;
        notifyPropertyChanged(BR.b302f);
    }

    @Bindable
    public String getB302g() {
        return b302g;
    }

    public void setB302g(String b302g) {
        if (this.b302g.equals(b302g)) return; // for all checkboxes
        this.b302g = b302g;
        notifyPropertyChanged(BR.b302g);
    }

    @Bindable
    public String getB302h() {
        return b302h;
    }

    public void setB302h(String b302h) {
        if (this.b302h.equals(b302h)) return; // for all checkboxes
        this.b302h = b302h;
        notifyPropertyChanged(BR.b302h);
    }

    @Bindable
    public String getB30296() {
        return b30296;
    }

    public void setB30296(String b30296) {
        if (this.b30296.equals(b30296)) return; // for all checkboxes
        this.b30296 = b30296;
        setB30296x(b30296.equals("96") ? this.b30296x : "");
        notifyPropertyChanged(BR.b30296);
    }

    @Bindable
    public String getB30296x() {
        return b30296x;
    }

    public void setB30296x(String b30296x) {
        this.b30296x = b30296x;
        notifyPropertyChanged(BR.b30296x);
    }

    @Bindable
    public String getB303() {
        return b303;
    }

    public void setB303(String b303) {
        this.b303 = b303;
        notifyPropertyChanged(BR.b303);
    }

    @Bindable
    public String getB303a() {
        return b303a;
    }

    public void setB303a(String b303a) {
        if (this.b303a.equals(b303a)) return; // for all checkboxes
        this.b303a = b303a;
        notifyPropertyChanged(BR.b303a);
    }

    @Bindable
    public String getB303b() {
        return b303b;
    }

    public void setB303b(String b303b) {
        if (this.b303b.equals(b303b)) return; // for all checkboxes
        this.b303b = b303b;
        notifyPropertyChanged(BR.b303b);
    }

    @Bindable
    public String getB303c() {
        return b303c;
    }

    public void setB303c(String b303c) {
        if (this.b303c.equals(b303c)) return; // for all checkboxes
        this.b303c = b303c;
        notifyPropertyChanged(BR.b303c);
    }

    @Bindable
    public String getB303d() {
        return b303d;
    }

    public void setB303d(String b303d) {
        if (this.b303d.equals(b303d)) return; // for all checkboxes
        this.b303d = b303d;
        notifyPropertyChanged(BR.b303d);
    }

    @Bindable
    public String getB303e() {
        return b303e;
    }

    public void setB303e(String b303e) {
        if (this.b303e.equals(b303e)) return; // for all checkboxes
        this.b303e = b303e;
        notifyPropertyChanged(BR.b303e);
    }

    @Bindable
    public String getB303f() {
        return b303f;
    }

    public void setB303f(String b303f) {
        if (this.b303f.equals(b303f)) return; // for all checkboxes
        this.b303f = b303f;
        notifyPropertyChanged(BR.b303f);
    }

    @Bindable
    public String getB303g() {
        return b303g;
    }

    public void setB303g(String b303g) {
        if (this.b303g.equals(b303g)) return; // for all checkboxes
        this.b303g = b303g;
        notifyPropertyChanged(BR.b303g);
    }

    @Bindable
    public String getB303h() {
        return b303h;
    }

    public void setB303h(String b303h) {
        if (this.b303h.equals(b303h)) return; // for all checkboxes
        this.b303h = b303h;
        notifyPropertyChanged(BR.b303h);
    }

    @Bindable
    public String getB30396() {
        return b30396;
    }

    public void setB30396(String b30396) {
        if (this.b30396.equals(b30396)) return; // for all checkboxes
        this.b30396 = b30396;
        setB30396x(b30396.equals("96") ? this.b30396x : "");
        notifyPropertyChanged(BR.b30396);
    }

    @Bindable
    public String getB30396x() {
        return b30396x;
    }

    public void setB30396x(String b30396x) {
        this.b30396x = b30396x;
        notifyPropertyChanged(BR.b30396x);
    }

    @Bindable
    public String getB304() {
        return b304;
    }

    public void setB304(String b304) {
        this.b304 = b304;
        notifyPropertyChanged(BR.b304);
    }

    @Bindable
    public String getB304a() {
        return b304a;
    }

    public void setB304a(String b304a) {
        if (this.b304a.equals(b304a)) return; // for all checkboxes
        this.b304a = b304a;
        notifyPropertyChanged(BR.b304a);
    }

    @Bindable
    public String getB304b() {
        return b304b;
    }

    public void setB304b(String b304b) {
        if (this.b304b.equals(b304b)) return; // for all checkboxes
        this.b304b = b304b;
        notifyPropertyChanged(BR.b304b);
    }

    @Bindable
    public String getB304c() {
        return b304c;
    }

    public void setB304c(String b304c) {
        if (this.b304c.equals(b304c)) return; // for all checkboxes
        this.b304c = b304c;
        notifyPropertyChanged(BR.b304c);
    }

    @Bindable
    public String getB304d() {
        return b304d;
    }

    public void setB304d(String b304d) {
        if (this.b304d.equals(b304d)) return; // for all checkboxes
        this.b304d = b304d;
        notifyPropertyChanged(BR.b304d);
    }

    @Bindable
    public String getB304e() {
        return b304e;
    }

    public void setB304e(String b304e) {
        if (this.b304e.equals(b304e)) return; // for all checkboxes
        this.b304e = b304e;
        notifyPropertyChanged(BR.b304e);
    }

    @Bindable
    public String getB304f() {
        return b304f;
    }

    public void setB304f(String b304f) {
        if (this.b304f.equals(b304f)) return; // for all checkboxes
        this.b304f = b304f;
        notifyPropertyChanged(BR.b304f);
    }

    @Bindable
    public String getB304g() {
        return b304g;
    }

    public void setB304g(String b304g) {
        if (this.b304g.equals(b304g)) return; // for all checkboxes
        this.b304g = b304g;
        notifyPropertyChanged(BR.b304g);
    }

    @Bindable
    public String getB304h() {
        return b304h;
    }

    public void setB304h(String b304h) {
        if (this.b304h.equals(b304h)) return; // for all checkboxes
        this.b304h = b304h;
        notifyPropertyChanged(BR.b304h);
    }

    @Bindable
    public String getB30496() {
        return b30496;
    }

    public void setB30496(String b30496) {
        if (this.b30496.equals(b30496)) return; // for all checkboxes
        this.b30496 = b30496;
        setB30496x(b30496.equals("96") ? this.b30496x : "");
        notifyPropertyChanged(BR.b30496);
    }

    @Bindable
    public String getB30496x() {
        return b30496x;
    }

    public void setB30496x(String b30496x) {
        this.b30496x = b30496x;
        notifyPropertyChanged(BR.b30496x);
    }

    @Bindable
    public String getB305() {
        return b305;
    }

    public void setB305(String b305) {
        this.b305 = b305;
        notifyPropertyChanged(BR.b305);
    }

    @Bindable
    public String getB305a() {
        return b305a;
    }

    public void setB305a(String b305a) {
        if (this.b305a.equals(b305a)) return; // for all checkboxes
        this.b305a = b305a;
        notifyPropertyChanged(BR.b305a);
    }

    @Bindable
    public String getB305b() {
        return b305b;
    }

    public void setB305b(String b305b) {
        if (this.b305b.equals(b305b)) return; // for all checkboxes
        this.b305b = b305b;
        notifyPropertyChanged(BR.b305b);
    }

    @Bindable
    public String getB305c() {
        return b305c;
    }

    public void setB305c(String b305c) {
        if (this.b305c.equals(b305c)) return; // for all checkboxes
        this.b305c = b305c;
        notifyPropertyChanged(BR.b305c);
    }

    @Bindable
    public String getB305d() {
        return b305d;
    }

    public void setB305d(String b305d) {
        if (this.b305d.equals(b305d)) return; // for all checkboxes
        this.b305d = b305d;
        notifyPropertyChanged(BR.b305d);
    }

    @Bindable
    public String getB305e() {
        return b305e;
    }

    public void setB305e(String b305e) {
        if (this.b305e.equals(b305e)) return; // for all checkboxes
        this.b305e = b305e;
        notifyPropertyChanged(BR.b305e);
    }

    @Bindable
    public String getB305f() {
        return b305f;
    }

    public void setB305f(String b305f) {
        if (this.b305f.equals(b305f)) return; // for all checkboxes
        this.b305f = b305f;
        notifyPropertyChanged(BR.b305f);
    }

    @Bindable
    public String getB305g() {
        return b305g;
    }

    public void setB305g(String b305g) {
        if (this.b305g.equals(b305g)) return; // for all checkboxes
        this.b305g = b305g;
        notifyPropertyChanged(BR.b305g);
    }

    @Bindable
    public String getB305h() {
        return b305h;
    }

    public void setB305h(String b305h) {
        if (this.b305h.equals(b305h)) return; // for all checkboxes
        this.b305h = b305h;
        notifyPropertyChanged(BR.b305h);
    }

    @Bindable
    public String getB30596() {
        return b30596;
    }

    public void setB30596(String b30596) {
        if (this.b30596.equals(b30596)) return; // for all checkboxes
        this.b30596 = b30596;
        setB30596x(b30596.equals("96") ? this.b30596x : "");
        notifyPropertyChanged(BR.b30596);
    }

    @Bindable
    public String getB30596x() {
        return b30596x;
    }

    public void setB30596x(String b30596x) {
        this.b30596x = b30596x;
        notifyPropertyChanged(BR.b30596x);
    }

    @Bindable
    public String getB306() {
        return b306;
    }

    public void setB306(String b306) {
        this.b306 = b306;
        notifyPropertyChanged(BR.b306);
    }

    @Bindable
    public String getB306a() {
        return b306a;
    }

    public void setB306a(String b306a) {
        if (this.b306a.equals(b306a)) return; // for all checkboxes
        this.b306a = b306a;
        notifyPropertyChanged(BR.b306a);
    }

    @Bindable
    public String getB306b() {
        return b306b;
    }

    public void setB306b(String b306b) {
        if (this.b306b.equals(b306b)) return; // for all checkboxes
        this.b306b = b306b;
        notifyPropertyChanged(BR.b306b);
    }

    @Bindable
    public String getB306c() {
        return b306c;
    }

    public void setB306c(String b306c) {
        if (this.b306c.equals(b306c)) return; // for all checkboxes
        this.b306c = b306c;
        notifyPropertyChanged(BR.b306c);
    }

    @Bindable
    public String getB306d() {
        return b306d;
    }

    public void setB306d(String b306d) {
        if (this.b306d.equals(b306d)) return; // for all checkboxes
        this.b306d = b306d;
        notifyPropertyChanged(BR.b306d);
    }

    @Bindable
    public String getB306e() {
        return b306e;
    }

    public void setB306e(String b306e) {
        if (this.b306e.equals(b306e)) return; // for all checkboxes
        this.b306e = b306e;
        notifyPropertyChanged(BR.b306e);
    }

    @Bindable
    public String getB306f() {
        return b306f;
    }

    public void setB306f(String b306f) {
        if (this.b306f.equals(b306f)) return; // for all checkboxes
        this.b306f = b306f;
        notifyPropertyChanged(BR.b306f);
    }

    @Bindable
    public String getB306g() {
        return b306g;
    }

    public void setB306g(String b306g) {
        if (this.b306g.equals(b306g)) return; // for all checkboxes
        this.b306g = b306g;
        notifyPropertyChanged(BR.b306g);
    }

    @Bindable
    public String getB306h() {
        return b306h;
    }

    public void setB306h(String b306h) {
        if (this.b306h.equals(b306h)) return; // for all checkboxes
        this.b306h = b306h;
        notifyPropertyChanged(BR.b306h);
    }

    @Bindable
    public String getB30696() {
        return b30696;
    }

    public void setB30696(String b30696) {
        if (this.b30696.equals(b30696)) return; // for all checkboxes
        this.b30696 = b30696;
        setB30696x(b30696.equals("96") ? this.b30696x : "");
        notifyPropertyChanged(BR.b30696);
    }

    @Bindable
    public String getB30696x() {
        return b30696x;
    }

    public void setB30696x(String b30696x) {
        this.b30696x = b30696x;
        notifyPropertyChanged(BR.b30696x);
    }

    @Bindable
    public String getB307() {
        return b307;
    }

    public void setB307(String b307) {
        this.b307 = b307;
        notifyPropertyChanged(BR.b307);
    }

    @Bindable
    public String getB307a() {
        return b307a;
    }

    public void setB307a(String b307a) {
        if (this.b307a.equals(b307a)) return; // for all checkboxes
        this.b307a = b307a;
        notifyPropertyChanged(BR.b307a);
    }

    @Bindable
    public String getB307b() {
        return b307b;
    }

    public void setB307b(String b307b) {
        if (this.b307b.equals(b307b)) return; // for all checkboxes
        this.b307b = b307b;
        notifyPropertyChanged(BR.b307b);
    }

    @Bindable
    public String getB307c() {
        return b307c;
    }

    public void setB307c(String b307c) {
        if (this.b307c.equals(b307c)) return; // for all checkboxes
        this.b307c = b307c;
        notifyPropertyChanged(BR.b307c);
    }

    @Bindable
    public String getB307d() {
        return b307d;
    }

    public void setB307d(String b307d) {
        if (this.b307d.equals(b307d)) return; // for all checkboxes
        this.b307d = b307d;
        notifyPropertyChanged(BR.b307d);
    }

    @Bindable
    public String getB307e() {
        return b307e;
    }

    public void setB307e(String b307e) {
        if (this.b307e.equals(b307e)) return; // for all checkboxes
        this.b307e = b307e;
        notifyPropertyChanged(BR.b307e);
    }

    @Bindable
    public String getB307f() {
        return b307f;
    }

    public void setB307f(String b307f) {
        if (this.b307f.equals(b307f)) return; // for all checkboxes
        this.b307f = b307f;
        notifyPropertyChanged(BR.b307f);
    }

    @Bindable
    public String getB307g() {
        return b307g;
    }

    public void setB307g(String b307g) {
        if (this.b307g.equals(b307g)) return; // for all checkboxes
        this.b307g = b307g;
        notifyPropertyChanged(BR.b307g);
    }

    @Bindable
    public String getB307h() {
        return b307h;
    }

    public void setB307h(String b307h) {
        if (this.b307h.equals(b307h)) return; // for all checkboxes
        this.b307h = b307h;
        notifyPropertyChanged(BR.b307h);
    }

    @Bindable
    public String getB30796() {
        return b30796;
    }

    public void setB30796(String b30796) {
        if (this.b30796.equals(b30796)) return; // for all checkboxes
        this.b30796 = b30796;
        setB30796x(b30796.equals("96") ? this.b30796x : "");
        notifyPropertyChanged(BR.b30796);
    }

    @Bindable
    public String getB30796x() {
        return b30796x;
    }

    public void setB30796x(String b30796x) {
        this.b30796x = b30796x;
        notifyPropertyChanged(BR.b30796x);
    }

    @Bindable
    public String getB308() {
        return b308;
    }

    public void setB308(String b308) {
        this.b308 = b308;
        notifyPropertyChanged(BR.b308);
    }

    @Bindable
    public String getB308a() {
        return b308a;
    }

    public void setB308a(String b308a) {
        if (this.b308a.equals(b308a)) return; // for all checkboxes
        this.b308a = b308a;
        notifyPropertyChanged(BR.b308a);
    }

    @Bindable
    public String getB308b() {
        return b308b;
    }

    public void setB308b(String b308b) {
        if (this.b308b.equals(b308b)) return; // for all checkboxes
        this.b308b = b308b;
        notifyPropertyChanged(BR.b308b);
    }

    @Bindable
    public String getB308c() {
        return b308c;
    }

    public void setB308c(String b308c) {
        if (this.b308c.equals(b308c)) return; // for all checkboxes
        this.b308c = b308c;
        notifyPropertyChanged(BR.b308c);
    }

    @Bindable
    public String getB308d() {
        return b308d;
    }

    public void setB308d(String b308d) {
        if (this.b308d.equals(b308d)) return; // for all checkboxes
        this.b308d = b308d;
        notifyPropertyChanged(BR.b308d);
    }

    @Bindable
    public String getB308e() {
        return b308e;
    }

    public void setB308e(String b308e) {
        if (this.b308e.equals(b308e)) return; // for all checkboxes
        this.b308e = b308e;
        notifyPropertyChanged(BR.b308e);
    }

    @Bindable
    public String getB308f() {
        return b308f;
    }

    public void setB308f(String b308f) {
        if (this.b308f.equals(b308f)) return; // for all checkboxes
        this.b308f = b308f;
        notifyPropertyChanged(BR.b308f);
    }

    @Bindable
    public String getB308g() {
        return b308g;
    }

    public void setB308g(String b308g) {
        if (this.b308g.equals(b308g)) return; // for all checkboxes
        this.b308g = b308g;
        notifyPropertyChanged(BR.b308g);
    }

    @Bindable
    public String getB308h() {
        return b308h;
    }

    public void setB308h(String b308h) {
        if (this.b308h.equals(b308h)) return; // for all checkboxes
        this.b308h = b308h;
        notifyPropertyChanged(BR.b308h);
    }

    @Bindable
    public String getB30896() {
        return b30896;
    }

    public void setB30896(String b30896) {
        if (this.b30896.equals(b30896)) return; // for all checkboxes
        this.b30896 = b30896;
        setB30896x(b30896.equals("96") ? this.b30896x : "");
        notifyPropertyChanged(BR.b30896);
    }

    @Bindable
    public String getB30896x() {
        return b30896x;
    }

    public void setB30896x(String b30896x) {
        this.b30896x = b30896x;
        notifyPropertyChanged(BR.b30896x);
    }

    @Bindable
    public String getB309() {
        return b309;
    }

    public void setB309(String b309) {
        this.b309 = b309;
        notifyPropertyChanged(BR.b309);
    }

    @Bindable
    public String getB309a() {
        return b309a;
    }

    public void setB309a(String b309a) {
        if (this.b309a.equals(b309a)) return; // for all checkboxes
        this.b309a = b309a;
        notifyPropertyChanged(BR.b309a);
    }

    @Bindable
    public String getB309b() {
        return b309b;
    }

    public void setB309b(String b309b) {
        if (this.b309b.equals(b309b)) return; // for all checkboxes
        this.b309b = b309b;
        notifyPropertyChanged(BR.b309b);
    }

    @Bindable
    public String getB309c() {
        return b309c;
    }

    public void setB309c(String b309c) {
        if (this.b309c.equals(b309c)) return; // for all checkboxes
        this.b309c = b309c;
        notifyPropertyChanged(BR.b309c);
    }

    @Bindable
    public String getB309d() {
        return b309d;
    }

    public void setB309d(String b309d) {
        if (this.b309d.equals(b309d)) return; // for all checkboxes
        this.b309d = b309d;
        notifyPropertyChanged(BR.b309d);
    }

    @Bindable
    public String getB309e() {
        return b309e;
    }

    public void setB309e(String b309e) {
        if (this.b309e.equals(b309e)) return; // for all checkboxes
        this.b309e = b309e;
        notifyPropertyChanged(BR.b309e);
    }

    @Bindable
    public String getB309f() {
        return b309f;
    }

    public void setB309f(String b309f) {
        if (this.b309f.equals(b309f)) return; // for all checkboxes
        this.b309f = b309f;
        notifyPropertyChanged(BR.b309f);
    }

    @Bindable
    public String getB309g() {
        return b309g;
    }

    public void setB309g(String b309g) {
        if (this.b309g.equals(b309g)) return; // for all checkboxes
        this.b309g = b309g;
        notifyPropertyChanged(BR.b309g);
    }

    @Bindable
    public String getB309h() {
        return b309h;
    }

    public void setB309h(String b309h) {
        if (this.b309h.equals(b309h)) return; // for all checkboxes
        this.b309h = b309h;
        notifyPropertyChanged(BR.b309h);
    }

    @Bindable
    public String getB30996() {
        return b30996;
    }

    public void setB30996(String b30996) {
        if (this.b30996.equals(b30996)) return; // for all checkboxes
        this.b30996 = b30996;
        setB30996x(b30996.equals("96") ? this.b30996x : "");
        notifyPropertyChanged(BR.b30996);
    }

    @Bindable
    public String getB30996x() {
        return b30996x;
    }

    public void setB30996x(String b30996x) {
        this.b30996x = b30996x;
        notifyPropertyChanged(BR.b30996x);
    }

    @Bindable
    public String getB310() {
        return b310;
    }

    public void setB310(String b310) {
        this.b310 = b310;
        notifyPropertyChanged(BR.b310);
    }

    @Bindable
    public String getB310a() {
        return b310a;
    }

    public void setB310a(String b310a) {
        if (this.b310a.equals(b310a)) return; // for all checkboxes
        this.b310a = b310a;
        notifyPropertyChanged(BR.b310a);
    }

    @Bindable
    public String getB310b() {
        return b310b;
    }

    public void setB310b(String b310b) {
        if (this.b310b.equals(b310b)) return; // for all checkboxes
        this.b310b = b310b;
        notifyPropertyChanged(BR.b310b);
    }

    @Bindable
    public String getB310c() {
        return b310c;
    }

    public void setB310c(String b310c) {
        if (this.b310c.equals(b310c)) return; // for all checkboxes
        this.b310c = b310c;
        notifyPropertyChanged(BR.b310c);
    }

    @Bindable
    public String getB310d() {
        return b310d;
    }

    public void setB310d(String b310d) {
        if (this.b310d.equals(b310d)) return; // for all checkboxes
        this.b310d = b310d;
        notifyPropertyChanged(BR.b310d);
    }

    @Bindable
    public String getB310e() {
        return b310e;
    }

    public void setB310e(String b310e) {
        if (this.b310e.equals(b310e)) return; // for all checkboxes
        this.b310e = b310e;
        notifyPropertyChanged(BR.b310e);
    }

    @Bindable
    public String getB310f() {
        return b310f;
    }

    public void setB310f(String b310f) {
        if (this.b310f.equals(b310f)) return; // for all checkboxes
        this.b310f = b310f;
        notifyPropertyChanged(BR.b310f);
    }

    @Bindable
    public String getB310g() {
        return b310g;
    }

    public void setB310g(String b310g) {
        if (this.b310g.equals(b310g)) return; // for all checkboxes
        this.b310g = b310g;
        notifyPropertyChanged(BR.b310g);
    }

    @Bindable
    public String getB310h() {
        return b310h;
    }

    public void setB310h(String b310h) {
        if (this.b310h.equals(b310h)) return; // for all checkboxes
        this.b310h = b310h;
        notifyPropertyChanged(BR.b310h);
    }

    @Bindable
    public String getB31096() {
        return b31096;
    }

    public void setB31096(String b31096) {
        if (this.b31096.equals(b31096)) return; // for all checkboxes
        this.b31096 = b31096;
        setB31096x(b31096.equals("96") ? this.b31096x : "");
        notifyPropertyChanged(BR.b31096);
    }

    @Bindable
    public String getB31096x() {
        return b31096x;
    }

    public void setB31096x(String b31096x) {
        this.b31096x = b31096x;
        notifyPropertyChanged(BR.b31096x);
    }

    @Bindable
    public String getB311() {
        return b311;
    }

    public void setB311(String b311) {
        this.b311 = b311;
        notifyPropertyChanged(BR.b311);
    }

    @Bindable
    public String getB311a() {
        return b311a;
    }

    public void setB311a(String b311a) {
        if (this.b311a.equals(b311a)) return; // for all checkboxes
        this.b311a = b311a;
        notifyPropertyChanged(BR.b311a);
    }

    @Bindable
    public String getB311b() {
        return b311b;
    }

    public void setB311b(String b311b) {
        if (this.b311b.equals(b311b)) return; // for all checkboxes
        this.b311b = b311b;
        notifyPropertyChanged(BR.b311b);
    }

    @Bindable
    public String getB311c() {
        return b311c;
    }

    public void setB311c(String b311c) {
        if (this.b311c.equals(b311c)) return; // for all checkboxes
        this.b311c = b311c;
        notifyPropertyChanged(BR.b311c);
    }

    @Bindable
    public String getB311d() {
        return b311d;
    }

    public void setB311d(String b311d) {
        if (this.b311d.equals(b311d)) return; // for all checkboxes
        this.b311d = b311d;
        notifyPropertyChanged(BR.b311d);
    }

    @Bindable
    public String getB311e() {
        return b311e;
    }

    public void setB311e(String b311e) {
        if (this.b311e.equals(b311e)) return; // for all checkboxes
        this.b311e = b311e;
        notifyPropertyChanged(BR.b311e);
    }

    @Bindable
    public String getB311f() {
        return b311f;
    }

    public void setB311f(String b311f) {
        if (this.b311f.equals(b311f)) return; // for all checkboxes
        this.b311f = b311f;
        notifyPropertyChanged(BR.b311f);
    }

    @Bindable
    public String getB311g() {
        return b311g;
    }

    public void setB311g(String b311g) {
        if (this.b311g.equals(b311g)) return; // for all checkboxes
        this.b311g = b311g;
        notifyPropertyChanged(BR.b311g);
    }

    @Bindable
    public String getB311h() {
        return b311h;
    }

    public void setB311h(String b311h) {
        if (this.b311h.equals(b311h)) return; // for all checkboxes
        this.b311h = b311h;
        notifyPropertyChanged(BR.b311h);
    }

    @Bindable
    public String getB31196() {
        return b31196;
    }

    public void setB31196(String b31196) {
        if (this.b31196.equals(b31196)) return; // for all checkboxes
        this.b31196 = b31196;
        setB31196x(b31196.equals("96") ? this.b31196x : "");
        notifyPropertyChanged(BR.b31196);
    }

    @Bindable
    public String getB31196x() {
        return b31196x;
    }

    public void setB31196x(String b31196x) {
        this.b31196x = b31196x;
        notifyPropertyChanged(BR.b31196x);
    }

    @Bindable
    public String getB312() {
        return b312;
    }

    public void setB312(String b312) {
        this.b312 = b312;
        notifyPropertyChanged(BR.b312);
    }

    @Bindable
    public String getB312a() {
        return b312a;
    }

    public void setB312a(String b312a) {
        if (this.b312a.equals(b312a)) return; // for all checkboxes
        this.b312a = b312a;
        notifyPropertyChanged(BR.b312a);
    }

    @Bindable
    public String getB312b() {
        return b312b;
    }

    public void setB312b(String b312b) {
        if (this.b312b.equals(b312b)) return; // for all checkboxes
        this.b312b = b312b;
        notifyPropertyChanged(BR.b312b);
    }

    @Bindable
    public String getB312c() {
        return b312c;
    }

    public void setB312c(String b312c) {
        if (this.b312c.equals(b312c)) return; // for all checkboxes
        this.b312c = b312c;
        notifyPropertyChanged(BR.b312c);
    }

    @Bindable
    public String getB312d() {
        return b312d;
    }

    public void setB312d(String b312d) {
        if (this.b312d.equals(b312d)) return; // for all checkboxes
        this.b312d = b312d;
        notifyPropertyChanged(BR.b312d);
    }

    @Bindable
    public String getB312e() {
        return b312e;
    }

    public void setB312e(String b312e) {
        if (this.b312e.equals(b312e)) return; // for all checkboxes
        this.b312e = b312e;
        notifyPropertyChanged(BR.b312e);
    }

    @Bindable
    public String getB312f() {
        return b312f;
    }

    public void setB312f(String b312f) {
        if (this.b312f.equals(b312f)) return; // for all checkboxes
        this.b312f = b312f;
        notifyPropertyChanged(BR.b312f);
    }

    @Bindable
    public String getB312g() {
        return b312g;
    }

    public void setB312g(String b312g) {
        if (this.b312g.equals(b312g)) return; // for all checkboxes
        this.b312g = b312g;
        notifyPropertyChanged(BR.b312g);
    }

    @Bindable
    public String getB312h() {
        return b312h;
    }

    public void setB312h(String b312h) {
        if (this.b312h.equals(b312h)) return; // for all checkboxes
        this.b312h = b312h;
        notifyPropertyChanged(BR.b312h);
    }

    @Bindable
    public String getB31296() {
        return b31296;
    }

    public void setB31296(String b31296) {
        if (this.b31296.equals(b31296)) return; // for all checkboxes
        this.b31296 = b31296;
        setB31296x(b31296.equals("96") ? this.b31296x : "");
        notifyPropertyChanged(BR.b31296);
    }

    @Bindable
    public String getB31296x() {
        return b31296x;
    }

    public void setB31296x(String b31296x) {
        this.b31296x = b31296x;
        notifyPropertyChanged(BR.b31296x);
    }

    @Bindable
    public String getB313() {
        return b313;
    }

    public void setB313(String b313) {
        this.b313 = b313;
        notifyPropertyChanged(BR.b313);
    }

    @Bindable
    public String getB313a() {
        return b313a;
    }

    public void setB313a(String b313a) {
        if (this.b313a.equals(b313a)) return; // for all checkboxes
        this.b313a = b313a;
        notifyPropertyChanged(BR.b313a);
    }

    @Bindable
    public String getB313b() {
        return b313b;
    }

    public void setB313b(String b313b) {
        if (this.b313b.equals(b313b)) return; // for all checkboxes
        this.b313b = b313b;
        notifyPropertyChanged(BR.b313b);
    }

    @Bindable
    public String getB313c() {
        return b313c;
    }

    public void setB313c(String b313c) {
        if (this.b313c.equals(b313c)) return; // for all checkboxes
        this.b313c = b313c;
        notifyPropertyChanged(BR.b313c);
    }

    @Bindable
    public String getB313d() {
        return b313d;
    }

    public void setB313d(String b313d) {
        if (this.b313d.equals(b313d)) return; // for all checkboxes
        this.b313d = b313d;
        notifyPropertyChanged(BR.b313d);
    }

    @Bindable
    public String getB313e() {
        return b313e;
    }

    public void setB313e(String b313e) {
        if (this.b313e.equals(b313e)) return; // for all checkboxes
        this.b313e = b313e;
        notifyPropertyChanged(BR.b313e);
    }

    @Bindable
    public String getB313f() {
        return b313f;
    }

    public void setB313f(String b313f) {
        if (this.b313f.equals(b313f)) return; // for all checkboxes
        this.b313f = b313f;
        notifyPropertyChanged(BR.b313f);
    }

    @Bindable
    public String getB313g() {
        return b313g;
    }

    public void setB313g(String b313g) {
        if (this.b313g.equals(b313g)) return; // for all checkboxes
        this.b313g = b313g;
        notifyPropertyChanged(BR.b313g);
    }

    @Bindable
    public String getB313h() {
        return b313h;
    }

    public void setB313h(String b313h) {
        if (this.b313h.equals(b313h)) return; // for all checkboxes
        this.b313h = b313h;
        notifyPropertyChanged(BR.b313h);
    }

    @Bindable
    public String getB31396() {
        return b31396;
    }

    public void setB31396(String b31396) {
        if (this.b31396.equals(b31396)) return; // for all checkboxes
        this.b31396 = b31396;
        setB31396x(b31396.equals("96") ? this.b31396x : "");
        notifyPropertyChanged(BR.b31396);
    }

    @Bindable
    public String getB31396x() {
        return b31396x;
    }

    public void setB31396x(String b31396x) {
        this.b31396x = b31396x;
        notifyPropertyChanged(BR.b31396x);
    }

    @Bindable
    public String getB314() {
        return b314;
    }

    public void setB314(String b314) {
        this.b314 = b314;
        notifyPropertyChanged(BR.b314);
    }

    @Bindable
    public String getB314a() {
        return b314a;
    }

    public void setB314a(String b314a) {
        if (this.b314a.equals(b314a)) return; // for all checkboxes
        this.b314a = b314a;
        notifyPropertyChanged(BR.b314a);
    }

    @Bindable
    public String getB314b() {
        return b314b;
    }

    public void setB314b(String b314b) {
        if (this.b314b.equals(b314b)) return; // for all checkboxes
        this.b314b = b314b;
        notifyPropertyChanged(BR.b314b);
    }

    @Bindable
    public String getB314c() {
        return b314c;
    }

    public void setB314c(String b314c) {
        if (this.b314c.equals(b314c)) return; // for all checkboxes
        this.b314c = b314c;
        notifyPropertyChanged(BR.b314c);
    }

    @Bindable
    public String getB314d() {
        return b314d;
    }

    public void setB314d(String b314d) {
        if (this.b314d.equals(b314d)) return; // for all checkboxes
        this.b314d = b314d;
        notifyPropertyChanged(BR.b314d);
    }

    @Bindable
    public String getB314e() {
        return b314e;
    }

    public void setB314e(String b314e) {
        if (this.b314e.equals(b314e)) return; // for all checkboxes
        this.b314e = b314e;
        notifyPropertyChanged(BR.b314e);
    }

    @Bindable
    public String getB314f() {
        return b314f;
    }

    public void setB314f(String b314f) {
        if (this.b314f.equals(b314f)) return; // for all checkboxes
        this.b314f = b314f;
        notifyPropertyChanged(BR.b314f);
    }

    @Bindable
    public String getB314g() {
        return b314g;
    }

    public void setB314g(String b314g) {
        if (this.b314g.equals(b314g)) return; // for all checkboxes
        this.b314g = b314g;
        notifyPropertyChanged(BR.b314g);
    }

    @Bindable
    public String getB314h() {
        return b314h;
    }

    public void setB314h(String b314h) {
        if (this.b314h.equals(b314h)) return; // for all checkboxes
        this.b314h = b314h;
        notifyPropertyChanged(BR.b314h);
    }

    @Bindable
    public String getB31496() {
        return b31496;
    }

    public void setB31496(String b31496) {
        if (this.b31496.equals(b31496)) return; // for all checkboxes
        this.b31496 = b31496;
        setB31496x(b31496.equals("96") ? this.b31496x : "");
        notifyPropertyChanged(BR.b31496);
    }

    @Bindable
    public String getB31496x() {
        return b31496x;
    }

    public void setB31496x(String b31496x) {
        this.b31496x = b31496x;
        notifyPropertyChanged(BR.b31496x);
    }

    public Forms Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_VILLAGE_CODE));
        this.childID = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CHILD_ID));
        this.childSno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CHILD_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS_96X));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNC_DATE));

        sA1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
//        sA2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA2)));
        sA3AHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3A)));
        sA3BHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3B)));
        sA4AHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA4A)));
        sA4BHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA4B)));
        sA4CHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA4C)));
        sA5AHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA5A)));
        sA5BHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA5B)));
        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB1)));
        sB3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB3)));
        return this;
    }

    public void sA1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
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
            this.a114 = json.getString("a114");
            this.a11496x = json.getString("a11496x");
        }
    }



    public void sA3AHydrate(String string) throws JSONException {
        Log.d(TAG, "sA3AHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a301 = json.getString("a301");
            this.a301xx = json.getString("a301xx");
            this.a302 = json.getString("a302");
            this.a302xx = json.getString("a302xx");
            this.a303 = json.getString("a303");
            this.a303xx = json.getString("a303xx");
            this.a304 = json.getString("a304");
            this.a304xx = json.getString("a304xx");
            this.a305 = json.getString("a305");
            this.a305xx = json.getString("a305xx");
            this.a306 = json.getString("a306");
            this.a306xx = json.getString("a306xx");
            this.a306aa = json.getString("a306aa");
            this.a307 = json.getString("a307");
            this.a307xx = json.getString("a307xx");
            this.a307aa = json.getString("a307aa");
            this.a308 = json.getString("a308");
            this.a309 = json.getString("a309");
            this.a309a = json.getString("a309a");
            this.a310 = json.getString("a310");
            this.a311 = json.getString("a311");
            this.a312 = json.getString("a312");
            this.a313 = json.getString("a313");
            this.a314 = json.getString("a314");
            this.a314xx = json.getString("a314xx");
            this.a315 = json.getString("a315");
            this.a316 = json.getString("a316");
            this.a316xx = json.getString("a316xx");
            this.a317 = json.getString("a317");
            this.a317xx = json.getString("a317xx");
            this.a318 = json.getString("a318");
            this.a318xx = json.getString("a318xx");
        }
    }

    public void sA3BHydrate(String string) throws JSONException {
        Log.d(TAG, "sA3BHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a319a = json.getString("a319a");
            this.a319b = json.getString("a319b");
            this.a319c = json.getString("a319c");
            this.a319d = json.getString("a319d");
            this.a319e = json.getString("a319e");
            this.a319f = json.getString("a319f");
            this.a319g = json.getString("a319g");
            this.a319h = json.getString("a319h");
            this.a319i = json.getString("a319i");
            this.a319j = json.getString("a319j");
            this.a319k = json.getString("a319k");
            this.a319l = json.getString("a319l");
            this.a319m = json.getString("a319m");
            this.a319n = json.getString("a319n");
            this.a319o = json.getString("a319o");
            this.a319p = json.getString("a319p");
            this.a319q = json.getString("a319q");
            this.a319r = json.getString("a319r");
            this.a320 = json.getString("a320");
            this.a321a = json.getString("a321a");
            this.a321b = json.getString("a321b");
            this.a321c = json.getString("a321c");
            this.a321d = json.getString("a321d");
            this.a321e = json.getString("a321e");
            this.a321f = json.getString("a321f");
            this.a321g = json.getString("a321g");
            this.a321h = json.getString("a321h");
            this.a321i = json.getString("a321i");
            this.a322 = json.getString("a322");
            this.a322xx = json.getString("a322xx");
            this.a323 = json.getString("a323");
            this.a324 = json.getString("a324");
            this.a325 = json.getString("a325");
            this.a326 = json.getString("a326");
            this.a327a = json.getString("a327a");
            this.a327b = json.getString("a327b");
            this.a327c = json.getString("a327c");
            this.a328 = json.getString("a328");
            this.a329a = json.getString("a329a");
            this.a329b = json.getString("a329b");
            this.a329c = json.getString("a329c");
            this.a329d = json.getString("a329d");
            this.a329e = json.getString("a329e");
            this.a329f = json.getString("a329f");
            this.a330 = json.getString("a330");
            this.a332 = json.getString("a332");
            this.a332ax = json.getString("a332ax");
            this.a331 = json.getString("a331");
            this.a331xx = json.getString("a331xx");
            this.a333 = json.getString("a333");
            this.a333xx = json.getString("a333xx");
            this.a334 = json.getString("a334");
            this.a334xx = json.getString("a334xx");
        }
    }

    public void sA4AHydrate(String string) throws JSONException {
        Log.d(TAG, "sA4AHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a401 = json.getString("a401");
            this.a402 = json.getString("a402");
            this.a403 = json.getString("a403");
            this.a404 = json.getString("a404");
            this.a405 = json.getString("a405");
            this.a40601 = json.getString("a40601");
            this.a40602 = json.getString("a40602");
            this.a40603 = json.getString("a40603");
            this.a40604 = json.getString("a40604");
            this.a40605 = json.getString("a40605");
            this.a40606 = json.getString("a40606");
            this.a40607 = json.getString("a40607");
            this.a40608 = json.getString("a40608");
            this.a40609 = json.getString("a40609");
            this.a40610 = json.getString("a40610");
            this.a40611 = json.getString("a40611");
            this.a40612 = json.getString("a40612");
            this.a40613 = json.getString("a40613");
            this.a40614 = json.getString("a40614");
            this.a40615 = json.getString("a40615");
            this.a407 = json.getString("a407");
            this.a40801 = json.getString("a40801");
            this.a40802 = json.getString("a40802");
            this.a40803 = json.getString("a40803");
            this.a40804 = json.getString("a40804");
            this.a40805 = json.getString("a40805");
            this.a40806 = json.getString("a40806");
            this.a40807 = json.getString("a40807");
            this.a40808 = json.getString("a40808");
            this.a40809 = json.getString("a40809");
            this.a40810 = json.getString("a40810");
            this.a40811 = json.getString("a40811");
            this.a40812 = json.getString("a40812");
            this.a40813 = json.getString("a40813");
            this.a40814 = json.getString("a40814");
            this.a40815 = json.getString("a40815");
            this.a409 = json.getString("a409");
            this.a40901 = json.getString("a40901");
            this.a40902 = json.getString("a40902");
            this.a40903 = json.getString("a40903");
            this.a40904 = json.getString("a40904");
            this.a40905 = json.getString("a40905");
            this.a40906 = json.getString("a40906");
            this.a40907 = json.getString("a40907");
            this.a40908 = json.getString("a40908");
            this.a40998 = json.getString("a40998");
            this.a40996 = json.getString("a40996");
            this.a40996x = json.getString("a40996x");
            this.a410 = json.getString("a410");
        }
    }

    public void sA4BHydrate(String string) throws JSONException {
        Log.d(TAG, "sA4BHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a41101 = json.getString("a41101");
            this.a41102 = json.getString("a41102");
            this.a41103 = json.getString("a41103");
            this.a41104 = json.getString("a41104");
            this.a41105 = json.getString("a41105");
            this.a41106 = json.getString("a41106");
            this.a41107 = json.getString("a41107");
            this.a41108 = json.getString("a41108");
            this.a41109 = json.getString("a41109");
            this.a41110 = json.getString("a41110");
            this.a41111 = json.getString("a41111");
            this.a412a = json.getString("a412a");
            this.a412b = json.getString("a412b");
            this.a412c = json.getString("a412c");
            this.a412d = json.getString("a412d");
            this.a412e = json.getString("a412e");
            this.a412f = json.getString("a412f");
            this.a412g = json.getString("a412g");
        }
    }

    public void sA4CHydrate(String string) throws JSONException {
        Log.d(TAG, "sA4CHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a412h = json.getString("a412h");
            this.a412i = json.getString("a412i");
            this.a412j = json.getString("a412j");
            this.a412k = json.getString("a412k");
            this.a412l = json.getString("a412l");
            this.a412m = json.getString("a412m");
            this.a412n = json.getString("a412n");
            this.a412o = json.getString("a412o");
            this.a413 = json.getString("a413");
            this.a41301 = json.getString("a41301");
            this.a41302 = json.getString("a41302");
            this.a41303 = json.getString("a41303");
            this.a41304 = json.getString("a41304");
            this.a41305 = json.getString("a41305");
            this.a41306 = json.getString("a41306");
            this.a41307 = json.getString("a41307");
            this.a41396 = json.getString("a41396");
            this.a41396x = json.getString("a41396x");
            this.a414 = json.getString("a414");
            this.a415 = json.getString("a415");
            this.a416 = json.getString("a416");
            this.a41601 = json.getString("a41601");
            this.a41602 = json.getString("a41602");
            this.a41603 = json.getString("a41603");
            this.a41604 = json.getString("a41604");
            this.a41605 = json.getString("a41605");
            this.a41606 = json.getString("a41606");
            this.a41607 = json.getString("a41607");
            this.a41608 = json.getString("a41608");
            this.a41609 = json.getString("a41609");
            this.a41698 = json.getString("a41698");
            this.a41696 = json.getString("a41696");
            this.a417 = json.getString("a417");
            this.a41701 = json.getString("a41701");
            this.a41702 = json.getString("a41702");
            this.a41703 = json.getString("a41703");
            this.a41704 = json.getString("a41704");
            this.a41705 = json.getString("a41705");
            this.a41706 = json.getString("a41706");
            this.a41707 = json.getString("a41707");
            this.a41708 = json.getString("a41708");
            this.a41709 = json.getString("a41709");
            this.a41710 = json.getString("a41710");
            this.a41711 = json.getString("a41711");
            this.a41712 = json.getString("a41712");
            this.a41713 = json.getString("a41713");
            this.a41798 = json.getString("a41798");
            this.a41796 = json.getString("a41796");
            this.a41796x = json.getString("a41796x");
            this.a418 = json.getString("a418");
            this.a41801 = json.getString("a41801");
            this.a41802 = json.getString("a41802");
            this.a41803 = json.getString("a41803");
            this.a41804 = json.getString("a41804");
            this.a41805 = json.getString("a41805");
            this.a41898 = json.getString("a41898");
            this.a41896 = json.getString("a41896");
            this.a41896x = json.getString("a41896x");
            this.a419 = json.getString("a419");
            this.a41901 = json.getString("a41901");
            this.a41902 = json.getString("a41902");
            this.a41903 = json.getString("a41903");
            this.a41904 = json.getString("a41904");
            this.a41905 = json.getString("a41905");
            this.a41906 = json.getString("a41906");
            this.a41907 = json.getString("a41907");
            this.a41908 = json.getString("a41908");
            this.a41909 = json.getString("a41909");
            this.a41910 = json.getString("a41910");
            this.a41911 = json.getString("a41911");
            this.a41912 = json.getString("a41912");
            this.a41913 = json.getString("a41913");
            this.a41914 = json.getString("a41914");
            this.a41915 = json.getString("a41915");
            this.a41998 = json.getString("a41998");
            this.a41996 = json.getString("a41996");
            this.a41996x = json.getString("a41996x");
        }
    }

    public void sA5AHydrate(String string) throws JSONException {
        Log.d(TAG, "sA5AHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a501 = json.getString("a501");
            this.a50101 = json.getString("a50101");
            this.a50102 = json.getString("a50102");
            this.a50103 = json.getString("a50103");
            this.a50198 = json.getString("a50198");
            this.a50105 = json.getString("a50105");
            this.a502 = json.getString("a502");
            this.a50301 = json.getString("a50301");
            this.a50302 = json.getString("a50302");
            this.a50303 = json.getString("a50303");
            this.a50304 = json.getString("a50304");
            this.a50305 = json.getString("a50305");
            this.a50401 = json.getString("a50401");
            this.a50402 = json.getString("a50402");
            this.a50403 = json.getString("a50403");
            this.a50404 = json.getString("a50404");
            this.a50497 = json.getString("a50497");
            this.a50501 = json.getString("a50501");
            this.a50502 = json.getString("a50502");
            this.a50503 = json.getString("a50503");
            this.a50504 = json.getString("a50504");
            this.a50597 = json.getString("a50597");
            this.a506 = json.getString("a506");
            this.a507 = json.getString("a507");
            this.a508 = json.getString("a508");
            this.a509 = json.getString("a509");
            this.a510 = json.getString("a510");
            this.a511 = json.getString("a511");
            this.a512 = json.getString("a512");
            this.a51201 = json.getString("a51201");
            this.a51202 = json.getString("a51202");
            this.a51203 = json.getString("a51203");
            this.a51204 = json.getString("a51204");
            this.a51205 = json.getString("a51205");
            this.a51298 = json.getString("a51298");
            this.a51296 = json.getString("a51296");
            this.a51296x = json.getString("a51296x");
            this.a513a = json.getString("a513a");
            this.a513b = json.getString("a513b");
            this.a513c = json.getString("a513c");
            this.a513d = json.getString("a513d");
            this.a513e = json.getString("a513e");
            this.a513f = json.getString("a513f");
            this.a513g = json.getString("a513g");
            this.a513h = json.getString("a513h");
            this.a513i = json.getString("a513i");
            this.a513j = json.getString("a513j");
            this.a513k = json.getString("a513k");
            this.a513l = json.getString("a513l");
            this.a513m = json.getString("a513m");
            this.a513n = json.getString("a513n");
            this.a513o = json.getString("a513o");
            this.a513p = json.getString("a513p");
        }
    }

    public void sA5BHydrate(String string) throws JSONException {
        Log.d(TAG, "sA5BHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a514 = json.getString("a514");
            this.a515 = json.getString("a515");
            this.a516 = json.getString("a516");
            this.a517 = json.getString("a517");
            this.a518 = json.getString("a518");
            this.a51801 = json.getString("a51801");
            this.a51802 = json.getString("a51802");
            this.a51803 = json.getString("a51803");
            this.a51804 = json.getString("a51804");
            this.a51805 = json.getString("a51805");
            this.a51806 = json.getString("a51806");
            this.a51807 = json.getString("a51807");
            this.a51808 = json.getString("a51808");
            this.a51809 = json.getString("a51809");
            this.a51810 = json.getString("a51810");
            this.a51811 = json.getString("a51811");
            this.a51812 = json.getString("a51812");
            this.a51813 = json.getString("a51813");
            this.a51814 = json.getString("a51814");
            this.a51896 = json.getString("a51896");
            this.a51896x = json.getString("a51896x");
            this.a51898 = json.getString("a51898");
            this.a519 = json.getString("a519");
            this.a51901x = json.getString("a51901x");
            this.a520 = json.getString("a520");
            this.a52001 = json.getString("a52001");
            this.a52001x = json.getString("a52001x");
            this.a52002 = json.getString("a52002");
            this.a52002x = json.getString("a52002x");
            this.a52003 = json.getString("a52003");
            this.a52003x = json.getString("a52003x");
            this.a52004 = json.getString("a52004");
            this.a52004x = json.getString("a52004x");
            this.a52005 = json.getString("a52005");
            this.a52005x = json.getString("a52005x");
            this.a52098 = json.getString("a52098");
            this.a52096 = json.getString("a52096");
            this.a52096x = json.getString("a52096x");
            this.a521 = json.getString("a521");
            this.a52196x = json.getString("a52196x");
            this.a5221 = json.getString("a5221");
            this.a5221ax = json.getString("a5221ax");
            this.a5221bx = json.getString("a5221bx");
            this.a5221cx = json.getString("a5221cx");
            this.a5222 = json.getString("a5222");
            this.a5222ax = json.getString("a5222ax");
            this.a5222bx = json.getString("a5222bx");
            this.a5222cx = json.getString("a5222cx");
            this.a5223 = json.getString("a5223");
            this.a5223ax = json.getString("a5223ax");
            this.a5223bx = json.getString("a5223bx");
            this.a5223cx = json.getString("a5223cx");
            this.a5224 = json.getString("a5224");
            this.a5224ax = json.getString("a5224ax");
            this.a5224bx = json.getString("a5224bx");
            this.a5224cx = json.getString("a5224cx");
            this.a5225 = json.getString("a5225");
            this.a5225ax = json.getString("a5225ax");
            this.a5225bx = json.getString("a5225bx");
            this.a5225cx = json.getString("a5225cx");
            this.a5226 = json.getString("a5226");
            this.a5226ax = json.getString("a5226ax");
            this.a5226bx = json.getString("a5226bx");
            this.a5226cx = json.getString("a5226cx");
            this.a52296x = json.getString("a52296x");
            this.a523 = json.getString("a523");
            this.a524 = json.getString("a524");
            this.a52401 = json.getString("a52401");
            this.a52401x = json.getString("a52401x");
            this.a52402 = json.getString("a52402");
            this.a52402x = json.getString("a52402x");
            this.a52403 = json.getString("a52403");
            this.a52403x = json.getString("a52403x");
            this.a52404 = json.getString("a52404");
            this.a52404x = json.getString("a52404x");
            this.a52405 = json.getString("a52405");
            this.a52405x = json.getString("a52405x");
            this.a52496 = json.getString("a52496");
            this.a52496x = json.getString("a52496x");
            this.a52498 = json.getString("a52498");
            this.a525 = json.getString("a525");
            this.a526 = json.getString("a526");
            this.a52696x = json.getString("a52696x");
            this.a527 = json.getString("a527");
            this.a528 = json.getString("a528");
            this.a52802x = json.getString("a52802x");
            this.a52901 = json.getString("a52901");
            this.a52902 = json.getString("a52902");
            this.a52903 = json.getString("a52903");
            this.a52904 = json.getString("a52904");
            this.a52905 = json.getString("a52905");
            this.a52906 = json.getString("a52906");
            this.a52907 = json.getString("a52907");
            this.a52908 = json.getString("a52908");
            this.a52998 = json.getString("a52998");
            this.a52996 = json.getString("a52996");
            this.a52996x = json.getString("a52996x");
            this.a530 = json.getString("a530");
            this.a53001 = json.getString("a53001");
            this.a53002 = json.getString("a53002");
            this.a53003 = json.getString("a53003");
            this.a53004 = json.getString("a53004");
            this.a53005 = json.getString("a53005");
            this.a53006 = json.getString("a53006");
            this.a53007 = json.getString("a53007");
            this.a53008 = json.getString("a53008");
            this.a53009 = json.getString("a53009");
            this.a53010 = json.getString("a53010");
            this.a53098 = json.getString("a53098");
            this.a53096 = json.getString("a53096");
            this.a53096x = json.getString("a53096x");
            this.a531 = json.getString("a531");
            this.a53196x = json.getString("a53196x");
            this.a532 = json.getString("a532");
            this.a533 = json.getString("a533");
            this.a53301 = json.getString("a53301");
            this.a53302 = json.getString("a53302");
            this.a53303 = json.getString("a53303");
            this.a53304 = json.getString("a53304");
            this.a53398 = json.getString("a53398");
            this.a53396 = json.getString("a53396");
            this.a53396x = json.getString("a53396x");
            this.a534 = json.getString("a534");
            this.a53401 = json.getString("a53401");
            this.a53402 = json.getString("a53402");
            this.a53403 = json.getString("a53403");
            this.a53404 = json.getString("a53404");
            this.a53405 = json.getString("a53405");
            this.a53406 = json.getString("a53406");
            this.a53407 = json.getString("a53407");
            this.a53408 = json.getString("a53408");
            this.a53409 = json.getString("a53409");
            this.a53410 = json.getString("a53410");
            this.a53498 = json.getString("a53498");
            this.a53496 = json.getString("a53496");
            this.a53496x = json.getString("a53496x");
        }
    }

    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b101 = json.getString("b101");
            this.b102 = json.getString("b102");
            this.b103 = json.getString("b103");
            this.b104 = json.getString("b104");
            this.b105 = json.getString("b105");
            this.b106 = json.getString("b106");
            this.b107 = json.getString("b107");
            this.b108 = json.getString("b108");
            this.b109 = json.getString("b109");
            this.b110 = json.getString("b110");
            this.b111 = json.getString("b111");
            this.b112 = json.getString("b112");
            this.b113 = json.getString("b113");
            this.b114 = json.getString("b114");
            this.b115 = json.getString("b115");
            this.b116 = json.getString("b116");
            this.b117 = json.getString("b117");
            this.b118 = json.getString("b118");
        }
    }

    public void sB3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b301 = json.getString("b301");
            this.b301a = json.getString("b301a");
            this.b301b = json.getString("b301b");
            this.b301c = json.getString("b301c");
            this.b301d = json.getString("b301d");
            this.b301e = json.getString("b301e");
            this.b301f = json.getString("b301f");
            this.b301g = json.getString("b301g");
            this.b301h = json.getString("b301h");
            this.b30196 = json.getString("b30196");
            this.b30196x = json.getString("b30196x");
            this.b302 = json.getString("b302");
            this.b302a = json.getString("b302a");
            this.b302b = json.getString("b302b");
            this.b302c = json.getString("b302c");
            this.b302d = json.getString("b302d");
            this.b302e = json.getString("b302e");
            this.b302f = json.getString("b302f");
            this.b302g = json.getString("b302g");
            this.b302h = json.getString("b302h");
            this.b30296 = json.getString("b30296");
            this.b30296x = json.getString("b30296x");
            this.b303 = json.getString("b303");
            this.b303a = json.getString("b303a");
            this.b303b = json.getString("b303b");
            this.b303c = json.getString("b303c");
            this.b303d = json.getString("b303d");
            this.b303e = json.getString("b303e");
            this.b303f = json.getString("b303f");
            this.b303g = json.getString("b303g");
            this.b303h = json.getString("b303h");
            this.b30396 = json.getString("b30396");
            this.b30396x = json.getString("b30396x");
            this.b304 = json.getString("b304");
            this.b304a = json.getString("b304a");
            this.b304b = json.getString("b304b");
            this.b304c = json.getString("b304c");
            this.b304d = json.getString("b304d");
            this.b304e = json.getString("b304e");
            this.b304f = json.getString("b304f");
            this.b304g = json.getString("b304g");
            this.b304h = json.getString("b304h");
            this.b30496 = json.getString("b30496");
            this.b30496x = json.getString("b30496x");
            this.b305 = json.getString("b305");
            this.b305a = json.getString("b305a");
            this.b305b = json.getString("b305b");
            this.b305c = json.getString("b305c");
            this.b305d = json.getString("b305d");
            this.b305e = json.getString("b305e");
            this.b305f = json.getString("b305f");
            this.b305g = json.getString("b305g");
            this.b305h = json.getString("b305h");
            this.b30596 = json.getString("b30596");
            this.b30596x = json.getString("b30596x");
            this.b306 = json.getString("b306");
            this.b306a = json.getString("b306a");
            this.b306b = json.getString("b306b");
            this.b306c = json.getString("b306c");
            this.b306d = json.getString("b306d");
            this.b306e = json.getString("b306e");
            this.b306f = json.getString("b306f");
            this.b306g = json.getString("b306g");
            this.b306h = json.getString("b306h");
            this.b30696 = json.getString("b30696");
            this.b30696x = json.getString("b30696x");
            this.b307 = json.getString("b307");
            this.b307a = json.getString("b307a");
            this.b307b = json.getString("b307b");
            this.b307c = json.getString("b307c");
            this.b307d = json.getString("b307d");
            this.b307e = json.getString("b307e");
            this.b307f = json.getString("b307f");
            this.b307g = json.getString("b307g");
            this.b307h = json.getString("b307h");
            this.b30796 = json.getString("b30796");
            this.b30796x = json.getString("b30796x");
            this.b308 = json.getString("b308");
            this.b308a = json.getString("b308a");
            this.b308b = json.getString("b308b");
            this.b308c = json.getString("b308c");
            this.b308d = json.getString("b308d");
            this.b308e = json.getString("b308e");
            this.b308f = json.getString("b308f");
            this.b308g = json.getString("b308g");
            this.b308h = json.getString("b308h");
            this.b30896 = json.getString("b30896");
            this.b30896x = json.getString("b30896x");
            this.b309 = json.getString("b309");
            this.b309a = json.getString("b309a");
            this.b309b = json.getString("b309b");
            this.b309c = json.getString("b309c");
            this.b309d = json.getString("b309d");
            this.b309e = json.getString("b309e");
            this.b309f = json.getString("b309f");
            this.b309g = json.getString("b309g");
            this.b309h = json.getString("b309h");
            this.b30996 = json.getString("b30996");
            this.b30996x = json.getString("b30996x");
            this.b310 = json.getString("b310");
            this.b310a = json.getString("b310a");
            this.b310b = json.getString("b310b");
            this.b310c = json.getString("b310c");
            this.b310d = json.getString("b310d");
            this.b310e = json.getString("b310e");
            this.b310f = json.getString("b310f");
            this.b310g = json.getString("b310g");
            this.b310h = json.getString("b310h");
            this.b31096 = json.getString("b31096");
            this.b31096x = json.getString("b31096x");
            this.b311 = json.getString("b311");
            this.b311a = json.getString("b311a");
            this.b311b = json.getString("b311b");
            this.b311c = json.getString("b311c");
            this.b311d = json.getString("b311d");
            this.b311e = json.getString("b311e");
            this.b311f = json.getString("b311f");
            this.b311g = json.getString("b311g");
            this.b311h = json.getString("b311h");
            this.b31196 = json.getString("b31196");
            this.b31196x = json.getString("b31196x");
            this.b312 = json.getString("b312");
            this.b312a = json.getString("b312a");
            this.b312b = json.getString("b312b");
            this.b312c = json.getString("b312c");
            this.b312d = json.getString("b312d");
            this.b312e = json.getString("b312e");
            this.b312f = json.getString("b312f");
            this.b312g = json.getString("b312g");
            this.b312h = json.getString("b312h");
            this.b31296 = json.getString("b31296");
            this.b31296x = json.getString("b31296x");
            this.b313 = json.getString("b313");
            this.b313a = json.getString("b313a");
            this.b313b = json.getString("b313b");
            this.b313c = json.getString("b313c");
            this.b313d = json.getString("b313d");
            this.b313e = json.getString("b313e");
            this.b313f = json.getString("b313f");
            this.b313g = json.getString("b313g");
            this.b313h = json.getString("b313h");
            this.b31396 = json.getString("b31396");
            this.b31396x = json.getString("b31396x");
            this.b314 = json.getString("b314");
            this.b314a = json.getString("b314a");
            this.b314b = json.getString("b314b");
            this.b314c = json.getString("b314c");
            this.b314d = json.getString("b314d");
            this.b314e = json.getString("b314e");
            this.b314f = json.getString("b314f");
            this.b314g = json.getString("b314g");
            this.b314h = json.getString("b314h");
            this.b31496 = json.getString("b31496");
            this.b31496x = json.getString("b31496x");
        }
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FormsTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(FormsTable.COLUMN_CHILD_ID, this.childID);
        json.put(FormsTable.COLUMN_CHILD_SNO, this.childSno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_ISTATUS_96X, this.iStatus96x);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sA1toString()));
//        json.put(FormsTable.COLUMN_SA2, new JSONObject(sA2toString()));
        json.put(FormsTable.COLUMN_SA3A, new JSONObject(sA3AtoString()));
        json.put(FormsTable.COLUMN_SA3B, new JSONObject(sA3BtoString()));
        json.put(FormsTable.COLUMN_SA4A, new JSONObject(sA4AtoString()));
        json.put(FormsTable.COLUMN_SA4B, new JSONObject(sA4BtoString()));
        json.put(FormsTable.COLUMN_SA4C, new JSONObject(sA4CtoString()));
        json.put(FormsTable.COLUMN_SA5A, new JSONObject(sA5AtoString()));
        json.put(FormsTable.COLUMN_SA5B, new JSONObject(sA5BtoString()));
        json.put(FormsTable.COLUMN_SB1, new JSONObject(sB1toString()));
        json.put(FormsTable.COLUMN_SB3, new JSONObject(sB3toString()));
        return json;
    }

    /*public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
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
                .put("a114", a114)
                .put("a11496x", a11496x)
                .put("a301", a301)
                .put("a301xx", a301xx)
                .put("a302", a302)
                .put("a302xx", a302xx)
                .put("a303", a303)
                .put("a303xx", a303xx)
                .put("a304", a304)
                .put("a304xx", a304xx)
                .put("a305", a305)
                .put("a305xx", a305xx)
                .put("a306", a306)
                .put("a306xx", a306xx)
                .put("a306aa", a306aa)
                .put("a307", a307)
                .put("a307xx", a307xx)
                .put("a307aa", a307aa)
                .put("a308", a308)
                .put("a309", a309)
                .put("a309a", a309a)
                .put("a310", a310)
                .put("a311", a311)
                .put("a312", a312)
                .put("a313", a313)
                .put("a314", a314)
                .put("a314xx", a314xx)
                .put("a315", a315)
                .put("a316", a316)
                .put("a316xx", a316xx)
                .put("a317", a317)
                .put("a317xx", a317xx)
                .put("a318", a318)
                .put("a318xx", a318xx)
                .put("a319a", a319a)
                .put("a319b", a319b)
                .put("a319c", a319c)
                .put("a319d", a319d)
                .put("a319e", a319e)
                .put("a319f", a319f)
                .put("a319g", a319g)
                .put("a319h", a319h)
                .put("a319i", a319i)
                .put("a319j", a319j)
                .put("a319k", a319k)
                .put("a319l", a319l)
                .put("a319m", a319m)
                .put("a319n", a319n)
                .put("a319o", a319o)
                .put("a319p", a319p)
                .put("a319q", a319q)
                .put("a319r", a319r)
                .put("a320", a320)
                .put("a321a", a321a)
                .put("a321b", a321b)
                .put("a321c", a321c)
                .put("a321d", a321d)
                .put("a321e", a321e)
                .put("a321f", a321f)
                .put("a321g", a321g)
                .put("a321h", a321h)
                .put("a321i", a321i)
                .put("a322", a322)
                .put("a322xx", a322xx)
                .put("a323", a323)
                .put("a324", a324)
                .put("a325", a325)
                .put("a326", a326)
                .put("a327a", a327a)
                .put("a327b", a327b)
                .put("a327c", a327c)
                .put("a328", a328)
                .put("a329a", a329a)
                .put("a329b", a329b)
                .put("a329c", a329c)
                .put("a329d", a329d)
                .put("a329e", a329e)
                .put("a329f", a329f)
                .put("a330", a330)
                .put("a332", a332)
                .put("a332ax", a332ax)
                .put("a331", a331)
                .put("a331xx", a331xx)
                .put("a333", a333)
                .put("a333xx", a333xx)
                .put("a334", a334)
                .put("a334xx", a334xx)
                .put("a401", a401)
                .put("a402", a402)
                .put("a403", a403)
                .put("a404", a404)
                .put("a405", a405)
                .put("a40601", a40601)
                .put("a40602", a40602)
                .put("a40603", a40603)
                .put("a40604", a40604)
                .put("a40605", a40605)
                .put("a40606", a40606)
                .put("a40607", a40607)
                .put("a40608", a40608)
                .put("a40609", a40609)
                .put("a40610", a40610)
                .put("a40611", a40611)
                .put("a40612", a40612)
                .put("a40613", a40613)
                .put("a40614", a40614)
                .put("a40615", a40615)
                .put("a407", a407)
                .put("a40801", a40801)
                .put("a40802", a40802)
                .put("a40803", a40803)
                .put("a40804", a40804)
                .put("a40805", a40805)
                .put("a40806", a40806)
                .put("a40807", a40807)
                .put("a40808", a40808)
                .put("a40809", a40809)
                .put("a40810", a40810)
                .put("a40811", a40811)
                .put("a40812", a40812)
                .put("a40813", a40813)
                .put("a40814", a40814)
                .put("a40815", a40815)
                .put("a409", a409)
                .put("a40901", a40901)
                .put("a40902", a40902)
                .put("a40903", a40903)
                .put("a40904", a40904)
                .put("a40905", a40905)
                .put("a40906", a40906)
                .put("a40907", a40907)
                .put("a40908", a40908)
                .put("a40998", a40998)
                .put("a40996", a40996)
                .put("a40996x", a40996x)
                .put("a410", a410)
                .put("a41101", a41101)
                .put("a41102", a41102)
                .put("a41103", a41103)
                .put("a41104", a41104)
                .put("a41105", a41105)
                .put("a41106", a41106)
                .put("a41107", a41107)
                .put("a41108", a41108)
                .put("a41109", a41109)
                .put("a41110", a41110)
                .put("a41111", a41111)
                .put("a412a", a412a)
                .put("a412b", a412b)
                .put("a412c", a412c)
                .put("a412d", a412d)
                .put("a412e", a412e)
                .put("a412f", a412f)
                .put("a412g", a412g)
                .put("a412h", a412h)
                .put("a412i", a412i)
                .put("a412j", a412j)
                .put("a412k", a412k)
                .put("a412l", a412l)
                .put("a412m", a412m)
                .put("a412n", a412n)
                .put("a412o", a412o)
                .put("a413", a413)
                .put("a41301", a41301)
                .put("a41302", a41302)
                .put("a41303", a41303)
                .put("a41304", a41304)
                .put("a41305", a41305)
                .put("a41306", a41306)
                .put("a41307", a41307)
                .put("a41396", a41396)
                .put("a41396x", a41396x)
                .put("a414", a414)
                .put("a415", a415)
                .put("a416", a416)
                .put("a41601", a41601)
                .put("a41602", a41602)
                .put("a41603", a41603)
                .put("a41604", a41604)
                .put("a41605", a41605)
                .put("a41606", a41606)
                .put("a41607", a41607)
                .put("a41608", a41608)
                .put("a41609", a41609)
                .put("a41698", a41698)
                .put("a41696", a41696)
                .put("a417", a417)
                .put("a41701", a41701)
                .put("a41702", a41702)
                .put("a41703", a41703)
                .put("a41704", a41704)
                .put("a41705", a41705)
                .put("a41706", a41706)
                .put("a41707", a41707)
                .put("a41708", a41708)
                .put("a41709", a41709)
                .put("a41710", a41710)
                .put("a41711", a41711)
                .put("a41712", a41712)
                .put("a41713", a41713)
                .put("a41798", a41798)
                .put("a41796", a41796)
                .put("a41796x", a41796x)
                .put("a418", a418)
                .put("a41801", a41801)
                .put("a41802", a41802)
                .put("a41803", a41803)
                .put("a41804", a41804)
                .put("a41805", a41805)
                .put("a41898", a41898)
                .put("a41896", a41896)
                .put("a41896x", a41896x)
                .put("a419", a419)
                .put("a41901", a41901)
                .put("a41902", a41902)
                .put("a41903", a41903)
                .put("a41904", a41904)
                .put("a41905", a41905)
                .put("a41906", a41906)
                .put("a41907", a41907)
                .put("a41908", a41908)
                .put("a41909", a41909)
                .put("a41910", a41910)
                .put("a41911", a41911)
                .put("a41912", a41912)
                .put("a41913", a41913)
                .put("a41914", a41914)
                .put("a41915", a41915)
                .put("a41998", a41998)
                .put("a41996", a41996)
                .put("a41996x", a41996x)
                .put("a501", a501)
                .put("a50101", a50101)
                .put("a50102", a50102)
                .put("a50103", a50103)
                .put("a50198", a50198)
                .put("a50105", a50105)
                .put("a502", a502)
                .put("a50301", a50301)
                .put("a50302", a50302)
                .put("a50303", a50303)
                .put("a50304", a50304)
                .put("a50305", a50305)
                .put("a50401", a50401)
                .put("a50402", a50402)
                .put("a50403", a50403)
                .put("a50404", a50404)
                .put("a50497", a50497)
                .put("a50501", a50501)
                .put("a50502", a50502)
                .put("a50503", a50503)
                .put("a50504", a50504)
                .put("a50597", a50597)
                .put("a506", a506)
                .put("a507", a507)
                .put("a508", a508)
                .put("a509", a509)
                .put("a510", a510)
                .put("a511", a511)
                .put("a512", a512)
                .put("a51201", a51201)
                .put("a51202", a51202)
                .put("a51203", a51203)
                .put("a51204", a51204)
                .put("a51205", a51205)
                .put("a51298", a51298)
                .put("a51296", a51296)
                .put("a51296x", a51296x)
                .put("a513a", a513a)
                .put("a513b", a513b)
                .put("a513c", a513c)
                .put("a513d", a513d)
                .put("a513e", a513e)
                .put("a513f", a513f)
                .put("a513g", a513g)
                .put("a513h", a513h)
                .put("a513i", a513i)
                .put("a513j", a513j)
                .put("a513k", a513k)
                .put("a513l", a513l)
                .put("a513m", a513m)
                .put("a513n", a513n)
                .put("a513o", a513o)
                .put("a513p", a513p)
                .put("a514", a514)
                .put("a515", a515)
                .put("a516", a516)
                .put("a517", a517)
                .put("a518", a518)
                .put("a51801", a51801)
                .put("a51802", a51802)
                .put("a51803", a51803)
                .put("a51804", a51804)
                .put("a51805", a51805)
                .put("a51806", a51806)
                .put("a51807", a51807)
                .put("a51808", a51808)
                .put("a51809", a51809)
                .put("a51810", a51810)
                .put("a51811", a51811)
                .put("a51812", a51812)
                .put("a51813", a51813)
                .put("a51814", a51814)
                .put("a51896", a51896)
                .put("a51896x", a51896x)
                .put("a51898", a51898)
                .put("a519", a519)
                .put("a51901x", a51901x)
                .put("a520", a520)
                .put("a52001", a52001)
                .put("a52001x", a52001x)
                .put("a52002", a52002)
                .put("a52002x", a52002x)
                .put("a52003", a52003)
                .put("a52003x", a52003x)
                .put("a52004", a52004)
                .put("a52004x", a52004x)
                .put("a52005", a52005)
                .put("a52005x", a52005x)
                .put("a52098", a52098)
                .put("a52096", a52096)
                .put("a52096x", a52096x)
                .put("a521", a521)
                .put("a52196x", a52196x)
                .put("a5221", a5221)
                .put("a5221ax", a5221ax)
                .put("a5221bx", a5221bx)
                .put("a5221cx", a5221cx)
                .put("a5222", a5222)
                .put("a5222ax", a5222ax)
                .put("a5222bx", a5222bx)
                .put("a5222cx", a5222cx)
                .put("a5223", a5223)
                .put("a5223ax", a5223ax)
                .put("a5223bx", a5223bx)
                .put("a5223cx", a5223cx)
                .put("a5224", a5224)
                .put("a5224ax", a5224ax)
                .put("a5224bx", a5224bx)
                .put("a5224cx", a5224cx)
                .put("a5225", a5225)
                .put("a5225ax", a5225ax)
                .put("a5225bx", a5225bx)
                .put("a5225cx", a5225cx)
                .put("a5226", a5226)
                .put("a5226ax", a5226ax)
                .put("a5226bx", a5226bx)
                .put("a5226cx", a5226cx)
                .put("a52296x", a52296x)
                .put("a523", a523)
                .put("a524", a524)
                .put("a52401", a52401)
                .put("a52401x", a52401x)
                .put("a52402", a52402)
                .put("a52402x", a52402x)
                .put("a52403", a52403)
                .put("a52403x", a52403x)
                .put("a52404", a52404)
                .put("a52404x", a52404x)
                .put("a52405", a52405)
                .put("a52405x", a52405x)
                .put("a52496", a52496)
                .put("a52496x", a52496x)
                .put("a52498", a52498)
                .put("a525", a525)
                .put("a526", a526)
                .put("a52696x", a52696x)
                .put("a527", a527)
                .put("a528", a528)
                .put("a52802x", a52802x)
                .put("a529", a529)
                .put("a52901", a52901)
                .put("a52902", a52902)
                .put("a52903", a52903)
                .put("a52904", a52904)
                .put("a52905", a52905)
                .put("a52906", a52906)
                .put("a52907", a52907)
                .put("a52908", a52908)
                .put("a52998", a52998)
                .put("a52996x", a52996x)
                .put("a530", a530)
                .put("a53001", a53001)
                .put("a53002", a53002)
                .put("a53003", a53003)
                .put("a53004", a53004)
                .put("a53005", a53005)
                .put("a53006", a53006)
                .put("a53007", a53007)
                .put("a53008", a53008)
                .put("a53009", a53009)
                .put("a53010", a53010)
                .put("a53098", a53098)
                .put("a53096", a53096)
                .put("a53096x", a53096x)
                .put("a531", a531)
                .put("a53196x", a53196x)
                .put("a532", a532)
                .put("a533", a533)
                .put("a53301", a53301)
                .put("a53302", a53302)
                .put("a53303", a53303)
                .put("a53304", a53304)
                .put("a53398", a53398)
                .put("a53396", a53396)
                .put("a53396x", a53396x)
                .put("a534", a534)
                .put("a53401", a53401)
                .put("a53402", a53402)
                .put("a53403", a53403)
                .put("a53404", a53404)
                .put("a53405", a53405)
                .put("a53406", a53406)
                .put("a53407", a53407)
                .put("a53408", a53408)
                .put("a53409", a53409)
                .put("a53410", a53410)
                .put("a53498", a53498)
                .put("a53496", a53496)
                .put("a53496x", a53496x)
                .put("iStatus96x", iStatus96x);
        return json.toString();
    }*/

    public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
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
                .put("a114", a114)
                .put("a11496x", a11496x);
        return json.toString();
    }

    /*public String sA2toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
        JSONObject json = new JSONObject();
        json.put("a201", a201)
                .put("a202", a202)
                .put("a203", a203)
                .put("a203xx", a203xx)
                .put("a204", a204)
                .put("a205dd", a205dd)
                .put("a205mm", a205mm)
                .put("a205yy", a205yy)
                .put("a206dd", a206dd)
                .put("a206mm", a206mm)
                .put("a206yy", a206yy)
                .put("a207", a207)
                .put("a208", a208)
                .put("a209", a209)
                .put("a210", a210)
                .put("a211", a211)
                .put("a212", a212);
        return json.toString();
    }*/

    public String sA3AtoString() throws JSONException {
        Log.d(TAG, "sA3AtoString: ");
        JSONObject json = new JSONObject();
        json.put("a301", a301)
                .put("a301xx", a301xx)
                .put("a302", a302)
                .put("a302xx", a302xx)
                .put("a303", a303)
                .put("a303xx", a303xx)
                .put("a304", a304)
                .put("a304xx", a304xx)
                .put("a305", a305)
                .put("a305xx", a305xx)
                .put("a306", a306)
                .put("a306xx", a306xx)
                .put("a306aa", a306aa)
                .put("a307", a307)
                .put("a307xx", a307xx)
                .put("a307aa", a307aa)
                .put("a308", a308)
                .put("a309", a309)
                .put("a309a", a309a)
                .put("a310", a310)
                .put("a311", a311)
                .put("a312", a312)
                .put("a313", a313)
                .put("a314", a314)
                .put("a314xx", a314xx)
                .put("a315", a315)
                .put("a316", a316)
                .put("a316xx", a316xx)
                .put("a317", a317)
                .put("a317xx", a317xx)
                .put("a318", a318)
                .put("a318xx", a318xx);
        return json.toString();
    }

    public String sA3BtoString() throws JSONException {
        Log.d(TAG, "sA3BtoString: ");
        JSONObject json = new JSONObject();
        json.put("a319a", a319a)
                .put("a319b", a319b)
                .put("a319c", a319c)
                .put("a319d", a319d)
                .put("a319e", a319e)
                .put("a319f", a319f)
                .put("a319g", a319g)
                .put("a319h", a319h)
                .put("a319i", a319i)
                .put("a319j", a319j)
                .put("a319k", a319k)
                .put("a319l", a319l)
                .put("a319m", a319m)
                .put("a319n", a319n)
                .put("a319o", a319o)
                .put("a319p", a319p)
                .put("a319q", a319q)
                .put("a319r", a319r)
                .put("a320", a320)
                .put("a321a", a321a)
                .put("a321b", a321b)
                .put("a321c", a321c)
                .put("a321d", a321d)
                .put("a321e", a321e)
                .put("a321f", a321f)
                .put("a321g", a321g)
                .put("a321h", a321h)
                .put("a321i", a321i)
                .put("a322", a322)
                .put("a322xx", a322xx)
                .put("a323", a323)
                .put("a324", a324)
                .put("a325", a325)
                .put("a326", a326)
                .put("a327a", a327a)
                .put("a327b", a327b)
                .put("a327c", a327c)
                .put("a328", a328)
                .put("a329a", a329a)
                .put("a329b", a329b)
                .put("a329c", a329c)
                .put("a329d", a329d)
                .put("a329e", a329e)
                .put("a329f", a329f)
                .put("a330", a330)
                .put("a332", a332)
                .put("a332ax", a332ax)
                .put("a331", a331)
                .put("a331xx", a331xx)
                .put("a333", a333)
                .put("a333xx", a333xx)
                .put("a334", a334)
                .put("a334xx", a334xx);
        return json.toString();
    }

    public String sA4AtoString() throws JSONException {
        Log.d(TAG, "sA4AtoString: ");
        JSONObject json = new JSONObject();
        json.put("a401", a401)
                .put("a402", a402)
                .put("a403", a403)
                .put("a404", a404)
                .put("a405", a405)
                .put("a40601", a40601)
                .put("a40602", a40602)
                .put("a40603", a40603)
                .put("a40604", a40604)
                .put("a40605", a40605)
                .put("a40606", a40606)
                .put("a40607", a40607)
                .put("a40608", a40608)
                .put("a40609", a40609)
                .put("a40610", a40610)
                .put("a40611", a40611)
                .put("a40612", a40612)
                .put("a40613", a40613)
                .put("a40614", a40614)
                .put("a40615", a40615)
                .put("a407", a407)
                .put("a40801", a40801)
                .put("a40802", a40802)
                .put("a40803", a40803)
                .put("a40804", a40804)
                .put("a40805", a40805)
                .put("a40806", a40806)
                .put("a40807", a40807)
                .put("a40808", a40808)
                .put("a40809", a40809)
                .put("a40810", a40810)
                .put("a40811", a40811)
                .put("a40812", a40812)
                .put("a40813", a40813)
                .put("a40814", a40814)
                .put("a40815", a40815)
                .put("a409", a409)
                .put("a40901", a40901)
                .put("a40902", a40902)
                .put("a40903", a40903)
                .put("a40904", a40904)
                .put("a40905", a40905)
                .put("a40906", a40906)
                .put("a40907", a40907)
                .put("a40908", a40908)
                .put("a40998", a40998)
                .put("a40996", a40996)
                .put("a40996x", a40996x)
                .put("a410", a410);
        return json.toString();
    }

    public String sA4BtoString() throws JSONException {
        Log.d(TAG, "sA4BtoString: ");
        JSONObject json = new JSONObject();
        json.put("a41101", a41101)
                .put("a41102", a41102)
                .put("a41103", a41103)
                .put("a41104", a41104)
                .put("a41105", a41105)
                .put("a41106", a41106)
                .put("a41107", a41107)
                .put("a41108", a41108)
                .put("a41109", a41109)
                .put("a41110", a41110)
                .put("a41111", a41111)
                .put("a412a", a412a)
                .put("a412b", a412b)
                .put("a412c", a412c)
                .put("a412d", a412d)
                .put("a412e", a412e)
                .put("a412f", a412f)
                .put("a412g", a412g);
        return json.toString();
    }

    public String sA4CtoString() throws JSONException {
        Log.d(TAG, "sA4CtoString: ");
        JSONObject json = new JSONObject();
        json.put("a412h", a412h)
                .put("a412i", a412i)
                .put("a412j", a412j)
                .put("a412k", a412k)
                .put("a412l", a412l)
                .put("a412m", a412m)
                .put("a412n", a412n)
                .put("a412o", a412o)
                .put("a413", a413)
                .put("a41301", a41301)
                .put("a41302", a41302)
                .put("a41303", a41303)
                .put("a41304", a41304)
                .put("a41305", a41305)
                .put("a41306", a41306)
                .put("a41307", a41307)
                .put("a41396", a41396)
                .put("a41396x", a41396x)
                .put("a414", a414)
                .put("a415", a415)
                .put("a416", a416)
                .put("a41601", a41601)
                .put("a41602", a41602)
                .put("a41603", a41603)
                .put("a41604", a41604)
                .put("a41605", a41605)
                .put("a41606", a41606)
                .put("a41607", a41607)
                .put("a41608", a41608)
                .put("a41609", a41609)
                .put("a41698", a41698)
                .put("a41696", a41696)
                .put("a417", a417)
                .put("a41701", a41701)
                .put("a41702", a41702)
                .put("a41703", a41703)
                .put("a41704", a41704)
                .put("a41705", a41705)
                .put("a41706", a41706)
                .put("a41707", a41707)
                .put("a41708", a41708)
                .put("a41709", a41709)
                .put("a41710", a41710)
                .put("a41711", a41711)
                .put("a41712", a41712)
                .put("a41713", a41713)
                .put("a41798", a41798)
                .put("a41796", a41796)
                .put("a41796x", a41796x)
                .put("a418", a418)
                .put("a41801", a41801)
                .put("a41802", a41802)
                .put("a41803", a41803)
                .put("a41804", a41804)
                .put("a41805", a41805)
                .put("a41898", a41898)
                .put("a41896", a41896)
                .put("a41896x", a41896x)
                .put("a419", a419)
                .put("a41901", a41901)
                .put("a41902", a41902)
                .put("a41903", a41903)
                .put("a41904", a41904)
                .put("a41905", a41905)
                .put("a41906", a41906)
                .put("a41907", a41907)
                .put("a41908", a41908)
                .put("a41909", a41909)
                .put("a41910", a41910)
                .put("a41911", a41911)
                .put("a41912", a41912)
                .put("a41913", a41913)
                .put("a41914", a41914)
                .put("a41915", a41915)
                .put("a41998", a41998)
                .put("a41996", a41996)
                .put("a41996x", a41996x);
        return json.toString();
    }

    public String sA5AtoString() throws JSONException {
        Log.d(TAG, "sA5AtoString: ");
        JSONObject json = new JSONObject();
        json.put("a501", a501)
                .put("a50101", a50101)
                .put("a50102", a50102)
                .put("a50103", a50103)
                .put("a50198", a50198)
                .put("a50105", a50105)
                .put("a502", a502)
                .put("a50301", a50301)
                .put("a50302", a50302)
                .put("a50303", a50303)
                .put("a50304", a50304)
                .put("a50305", a50305)
                .put("a50401", a50401)
                .put("a50402", a50402)
                .put("a50403", a50403)
                .put("a50404", a50404)
                .put("a50497", a50497)
                .put("a50501", a50501)
                .put("a50502", a50502)
                .put("a50503", a50503)
                .put("a50504", a50504)
                .put("a50597", a50597)
                .put("a506", a506)
                .put("a507", a507)
                .put("a508", a508)
                .put("a509", a509)
                .put("a510", a510)
                .put("a511", a511)
                .put("a512", a512)
                .put("a51201", a51201)
                .put("a51202", a51202)
                .put("a51203", a51203)
                .put("a51204", a51204)
                .put("a51205", a51205)
                .put("a51298", a51298)
                .put("a51296", a51296)
                .put("a51296x", a51296x)
                .put("a513a", a513a)
                .put("a513b", a513b)
                .put("a513c", a513c)
                .put("a513d", a513d)
                .put("a513e", a513e)
                .put("a513f", a513f)
                .put("a513g", a513g)
                .put("a513h", a513h)
                .put("a513i", a513i)
                .put("a513j", a513j)
                .put("a513k", a513k)
                .put("a513l", a513l)
                .put("a513m", a513m)
                .put("a513n", a513n)
                .put("a513o", a513o)
                .put("a513p", a513p);
        return json.toString();
    }

    public String sA5BtoString() throws JSONException {
        Log.d(TAG, "sA5BtoString: ");
        JSONObject json = new JSONObject();
        json.put("a514", a514)
                .put("a515", a515)
                .put("a516", a516)
                .put("a517", a517)
                .put("a518", a518)
                .put("a51801", a51801)
                .put("a51802", a51802)
                .put("a51803", a51803)
                .put("a51804", a51804)
                .put("a51805", a51805)
                .put("a51806", a51806)
                .put("a51807", a51807)
                .put("a51808", a51808)
                .put("a51809", a51809)
                .put("a51810", a51810)
                .put("a51811", a51811)
                .put("a51812", a51812)
                .put("a51813", a51813)
                .put("a51814", a51814)
                .put("a51896", a51896)
                .put("a51896x", a51896x)
                .put("a51898", a51898)
                .put("a519", a519)
                .put("a51901x", a51901x)
                .put("a520", a520)
                .put("a52001", a52001)
                .put("a52001x", a52001x)
                .put("a52002", a52002)
                .put("a52002x", a52002x)
                .put("a52003", a52003)
                .put("a52003x", a52003x)
                .put("a52004", a52004)
                .put("a52004x", a52004x)
                .put("a52005", a52005)
                .put("a52005x", a52005x)
                .put("a52098", a52098)
                .put("a52096", a52096)
                .put("a52096x", a52096x)
                .put("a521", a521)
                .put("a52196x", a52196x)
                .put("a5221", a5221)
                .put("a5221ax", a5221ax)
                .put("a5221bx", a5221bx)
                .put("a5221cx", a5221cx)
                .put("a5222", a5222)
                .put("a5222ax", a5222ax)
                .put("a5222bx", a5222bx)
                .put("a5222cx", a5222cx)
                .put("a5223", a5223)
                .put("a5223ax", a5223ax)
                .put("a5223bx", a5223bx)
                .put("a5223cx", a5223cx)
                .put("a5224", a5224)
                .put("a5224ax", a5224ax)
                .put("a5224bx", a5224bx)
                .put("a5224cx", a5224cx)
                .put("a5225", a5225)
                .put("a5225ax", a5225ax)
                .put("a5225bx", a5225bx)
                .put("a5225cx", a5225cx)
                .put("a5226", a5226)
                .put("a5226ax", a5226ax)
                .put("a5226bx", a5226bx)
                .put("a5226cx", a5226cx)
                .put("a52296x", a52296x)
                .put("a523", a523)
                .put("a524", a524)
                .put("a52401", a52401)
                .put("a52401x", a52401x)
                .put("a52402", a52402)
                .put("a52402x", a52402x)
                .put("a52403", a52403)
                .put("a52403x", a52403x)
                .put("a52404", a52404)
                .put("a52404x", a52404x)
                .put("a52405", a52405)
                .put("a52405x", a52405x)
                .put("a52496", a52496)
                .put("a52496x", a52496x)
                .put("a52498", a52498)
                .put("a525", a525)
                .put("a526", a526)
                .put("a52696x", a52696x)
                .put("a527", a527)
                .put("a528", a528)
                .put("a52802x", a52802x)
                .put("a52901", a52901)
                .put("a52902", a52902)
                .put("a52903", a52903)
                .put("a52904", a52904)
                .put("a52905", a52905)
                .put("a52906", a52906)
                .put("a52907", a52907)
                .put("a52908", a52908)
                .put("a52998", a52998)
                .put("a52996", a52996)
                .put("a52996x", a52996x)
                .put("a530", a530)
                .put("a53001", a53001)
                .put("a53002", a53002)
                .put("a53003", a53003)
                .put("a53004", a53004)
                .put("a53005", a53005)
                .put("a53006", a53006)
                .put("a53007", a53007)
                .put("a53008", a53008)
                .put("a53009", a53009)
                .put("a53010", a53010)
                .put("a53098", a53098)
                .put("a53096", a53096)
                .put("a53096x", a53096x)
                .put("a531", a531)
                .put("a53196x", a53196x)
                .put("a532", a532)
                .put("a533", a533)
                .put("a53301", a53301)
                .put("a53302", a53302)
                .put("a53303", a53303)
                .put("a53304", a53304)
                .put("a53398", a53398)
                .put("a53396", a53396)
                .put("a53396x", a53396x)
                .put("a534", a534)
                .put("a53401", a53401)
                .put("a53402", a53402)
                .put("a53403", a53403)
                .put("a53404", a53404)
                .put("a53405", a53405)
                .put("a53406", a53406)
                .put("a53407", a53407)
                .put("a53408", a53408)
                .put("a53409", a53409)
                .put("a53410", a53410)
                .put("a53498", a53498)
                .put("a53496", a53496)
                .put("a53496x", a53496x);
        return json.toString();
    }

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sB1toString: ");
        JSONObject json = new JSONObject();
        json.put("b101", b101)
                .put("b101", b101)
                .put("b102", b102)
                .put("b103", b103)
                .put("b104", b104)
                .put("b105", b105)
                .put("b106", b106)
                .put("b107", b107)
                .put("b108", b108)
                .put("b109", b109)
                .put("b110", b110)
                .put("b111", b111)
                .put("b112", b112)
                .put("b113", b113)
                .put("b114", b114)
                .put("b115", b115)
                .put("b116", b116)
                .put("b117", b117)
                .put("b118", b118);
        return json.toString();
    }

    public String sB3toString() throws JSONException {
        Log.d(TAG, "sB3toString: ");
        JSONObject json = new JSONObject();
        json.put("b301", b301)
                .put("b301a", b301a)
                .put("b301b", b301b)
                .put("b301c", b301c)
                .put("b301d", b301d)
                .put("b301e", b301e)
                .put("b301f", b301f)
                .put("b301g", b301g)
                .put("b301h", b301h)
                .put("b30196", b30196)
                .put("b30196x", b30196x)
                .put("b302", b302)
                .put("b302a", b302a)
                .put("b302b", b302b)
                .put("b302c", b302c)
                .put("b302d", b302d)
                .put("b302e", b302e)
                .put("b302f", b302f)
                .put("b302g", b302g)
                .put("b302h", b302h)
                .put("b30296", b30296)
                .put("b30296x", b30296x)
                .put("b303", b303)
                .put("b303a", b303a)
                .put("b303b", b303b)
                .put("b303c", b303c)
                .put("b303d", b303d)
                .put("b303e", b303e)
                .put("b303f", b303f)
                .put("b303g", b303g)
                .put("b303h", b303h)
                .put("b30396", b30396)
                .put("b30396x", b30396x)
                .put("b304", b304)
                .put("b304a", b304a)
                .put("b304b", b304b)
                .put("b304c", b304c)
                .put("b304d", b304d)
                .put("b304e", b304e)
                .put("b304f", b304f)
                .put("b304g", b304g)
                .put("b304h", b304h)
                .put("b30496", b30496)
                .put("b30496x", b30496x)
                .put("b305", b305)
                .put("b305a", b305a)
                .put("b305b", b305b)
                .put("b305c", b305c)
                .put("b305d", b305d)
                .put("b305e", b305e)
                .put("b305f", b305f)
                .put("b305g", b305g)
                .put("b305h", b305h)
                .put("b30596", b30596)
                .put("b30596x", b30596x)
                .put("b306", b306)
                .put("b306a", b306a)
                .put("b306b", b306b)
                .put("b306c", b306c)
                .put("b306d", b306d)
                .put("b306e", b306e)
                .put("b306f", b306f)
                .put("b306g", b306g)
                .put("b306h", b306h)
                .put("b30696", b30696)
                .put("b30696x", b30696x)
                .put("b307", b307)
                .put("b307a", b307a)
                .put("b307b", b307b)
                .put("b307c", b307c)
                .put("b307d", b307d)
                .put("b307e", b307e)
                .put("b307f", b307f)
                .put("b307g", b307g)
                .put("b307h", b307h)
                .put("b30796", b30796)
                .put("b30796x", b30796x)
                .put("b308", b308)
                .put("b308a", b308a)
                .put("b308b", b308b)
                .put("b308c", b308c)
                .put("b308d", b308d)
                .put("b308e", b308e)
                .put("b308f", b308f)
                .put("b308g", b308g)
                .put("b308h", b308h)
                .put("b30896", b30896)
                .put("b30896x", b30896x)
                .put("b309", b309)
                .put("b309a", b309a)
                .put("b309b", b309b)
                .put("b309c", b309c)
                .put("b309d", b309d)
                .put("b309e", b309e)
                .put("b309f", b309f)
                .put("b309g", b309g)
                .put("b309h", b309h)
                .put("b30996", b30996)
                .put("b30996x", b30996x)
                .put("b310", b310)
                .put("b310a", b310a)
                .put("b310b", b310b)
                .put("b310c", b310c)
                .put("b310d", b310d)
                .put("b310e", b310e)
                .put("b310f", b310f)
                .put("b310g", b310g)
                .put("b310h", b310h)
                .put("b31096", b31096)
                .put("b31096x", b31096x)
                .put("b311", b311)
                .put("b311a", b311a)
                .put("b311b", b311b)
                .put("b311c", b311c)
                .put("b311d", b311d)
                .put("b311e", b311e)
                .put("b311f", b311f)
                .put("b311g", b311g)
                .put("b311h", b311h)
                .put("b31196", b31196)
                .put("b31196x", b31196x)
                .put("b312", b312)
                .put("b312a", b312a)
                .put("b312b", b312b)
                .put("b312c", b312c)
                .put("b312d", b312d)
                .put("b312e", b312e)
                .put("b312f", b312f)
                .put("b312g", b312g)
                .put("b312h", b312h)
                .put("b31296", b31296)
                .put("b31296x", b31296x)
                .put("b313", b313)
                .put("b313a", b313a)
                .put("b313b", b313b)
                .put("b313c", b313c)
                .put("b313d", b313d)
                .put("b313e", b313e)
                .put("b313f", b313f)
                .put("b313g", b313g)
                .put("b313h", b313h)
                .put("b31396", b31396)
                .put("b31396x", b31396x)
                .put("b314", b314)
                .put("b314a", b314a)
                .put("b314b", b314b)
                .put("b314c", b314c)
                .put("b314d", b314d)
                .put("b314e", b314e)
                .put("b314f", b314f)
                .put("b314g", b314g)
                .put("b314h", b314h)
                .put("b31496", b31496)
                .put("b31496x", b31496x);
        return json.toString();
    }

    public PropertyChangeRegistry getPropertyChangeRegistry() {
        return propertyChangeRegistry;
    }

}