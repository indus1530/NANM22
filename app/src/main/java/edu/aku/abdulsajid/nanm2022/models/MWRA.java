package edu.aku.abdulsajid.nanm2022.models;

import static edu.aku.abdulsajid.nanm2022.core.MainApp.PROJECT_NAME;
import static edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedMWRA;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;

import edu.aku.abdulsajid.nanm2022.BR;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;
import edu.aku.abdulsajid.nanm2022.core.MainApp;


public class MWRA extends BaseObservable implements Observable {

    private final String TAG = "MWRA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    // private String muid = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
    private String name = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    // Field Variables bs1
    private String f101 = _EMPTY_;
    private String f101a = _EMPTY_;
    private String f101a01 = _EMPTY_;
    private String f101a02 = _EMPTY_;
    private String f101a03 = _EMPTY_;
    private String f101a04 = _EMPTY_;
    private String f101a05 = _EMPTY_;
    private String f101a06 = _EMPTY_;
    private String f101a07 = _EMPTY_;
    private String f101a08 = _EMPTY_;
    private String f101a09 = _EMPTY_;
    private String f101a10 = _EMPTY_;
    private String f101a11 = _EMPTY_;
    private String f101a12 = _EMPTY_;
    private String f101a13 = _EMPTY_;
    private String f101a14 = _EMPTY_;
    private String f101a96 = _EMPTY_;
    private String f101a96x = _EMPTY_;
    private String f101b = _EMPTY_;
    private String f101b01x = _EMPTY_;
    private String f102 = _EMPTY_;
    private String f10201 = _EMPTY_;
    private String f10202 = _EMPTY_;
    private String f10203 = _EMPTY_;
    private String f10204 = _EMPTY_;
    private String f10205 = _EMPTY_;
    private String f10206 = _EMPTY_;
    private String f10207 = _EMPTY_;
    private String f10208 = _EMPTY_;
    private String f10209 = _EMPTY_;
    private String f10210 = _EMPTY_;
    private String f10211 = _EMPTY_;
    private String f10296 = _EMPTY_;
    private String f10296x = _EMPTY_;
    private String f103 = _EMPTY_;
    private String f10301 = _EMPTY_;
    private String f10302 = _EMPTY_;
    private String f10303 = _EMPTY_;
    private String f10304 = _EMPTY_;
    private String f10305 = _EMPTY_;
    private String f104 = _EMPTY_;
    private String f105 = _EMPTY_;
    private String f106 = _EMPTY_;
    private String f107 = _EMPTY_;
    private String f10796x = _EMPTY_;
    private String f108 = _EMPTY_;
    private String f108wx = _EMPTY_;
    private String f108mx = _EMPTY_;

    private String f11001 = _EMPTY_;
    private String f11002 = _EMPTY_;
    private String f11003 = _EMPTY_;
    private String f11004 = _EMPTY_;
    private String f11005 = _EMPTY_;
    private String f11006 = _EMPTY_;
    private String f11007 = _EMPTY_;
    private String f11008 = _EMPTY_;
    private String f11009 = _EMPTY_;
    private String f11096 = _EMPTY_;
    private String f11096x = _EMPTY_;
    private String f111 = _EMPTY_;
    private String f112 = _EMPTY_;
    private String f113 = _EMPTY_;
    private String f11301x = _EMPTY_;
    private String f114 = _EMPTY_;
    private String f115 = _EMPTY_;
    private String f116 = _EMPTY_;
    private String f117 = _EMPTY_;
    private String f118 = _EMPTY_;
    private String f118mx = _EMPTY_;
    private String f118dx = _EMPTY_;
    private String f119 = _EMPTY_;
    private String f120 = _EMPTY_;
    private String f12001x = _EMPTY_;
    private String f121a = _EMPTY_;
    private String f121b = _EMPTY_;
    private String f12101 = _EMPTY_;
    private String f121b96x = _EMPTY_;
    private String f122 = _EMPTY_;
    private String f12201x = _EMPTY_;
    private String f123 = _EMPTY_;
    private String f12301 = _EMPTY_;
    private String f12302 = _EMPTY_;
    private String f12303 = _EMPTY_;
    private String f12304 = _EMPTY_;
    private String f12305 = _EMPTY_;
    private String f12306 = _EMPTY_;
    private String f12307 = _EMPTY_;
    private String f12308 = _EMPTY_;
    private String f12309 = _EMPTY_;
    private String f12310 = _EMPTY_;
    private String f12396 = _EMPTY_;
    private String f12396x = _EMPTY_;
    private String f124 = _EMPTY_;
    private String f125 = _EMPTY_;
    private String f12501 = _EMPTY_;
    private String f12502 = _EMPTY_;
    private String f12503 = _EMPTY_;
    private String f12504 = _EMPTY_;
    private String f12505 = _EMPTY_;
    private String f12506 = _EMPTY_;
    private String f12507 = _EMPTY_;
    private String f126 = _EMPTY_;
    private String f12601 = _EMPTY_;
    private String f12602 = _EMPTY_;
    private String f12603 = _EMPTY_;
    private String f12604 = _EMPTY_;
    private String f12605 = _EMPTY_;
    private String f12606 = _EMPTY_;
    private String f12607 = _EMPTY_;
    private String f12608 = _EMPTY_;
    private String f127 = _EMPTY_;
    private String f12796x = _EMPTY_;
    private String f128 = _EMPTY_;
    private String f12801 = _EMPTY_;
    private String f12802 = _EMPTY_;
    private String f12803 = _EMPTY_;
    private String f12804 = _EMPTY_;
    private String f12805 = _EMPTY_;
    private String f12806 = _EMPTY_;
    private String f12807 = _EMPTY_;
    private String f12808 = _EMPTY_;
    private String f129 = _EMPTY_;
    private String f130 = _EMPTY_;
    private String f13001 = _EMPTY_;
    private String f13002 = _EMPTY_;
    private String f13003 = _EMPTY_;
    private String f13004 = _EMPTY_;
    private String f13005 = _EMPTY_;
    private String f13006 = _EMPTY_;
    private String f13007 = _EMPTY_;
    private String f13008 = _EMPTY_;
    private String f13009 = _EMPTY_;
    private String f13010 = _EMPTY_;
    private String f13011 = _EMPTY_;
    private String f13012 = _EMPTY_;
    private String f13013 = _EMPTY_;
    private String f13014 = _EMPTY_;
    private String f13015 = _EMPTY_;
    private String f13096 = _EMPTY_;
    private String f13096x = _EMPTY_;
    private String f131 = _EMPTY_;
    private String f13196x = _EMPTY_;
    private String f131a = _EMPTY_;
    private String f134 = _EMPTY_;
    private String f13401 = _EMPTY_;
    private String f13402 = _EMPTY_;
    private String f13403 = _EMPTY_;
    private String f13404 = _EMPTY_;
    private String f13405 = _EMPTY_;
    private String f13406 = _EMPTY_;
    private String f13407 = _EMPTY_;
    private String f13408 = _EMPTY_;
    private String f13409 = _EMPTY_;
    private String f13410 = _EMPTY_;
    private String g101 = _EMPTY_;
    private String g102 = _EMPTY_;
    private String g10296x = _EMPTY_;
    private String g103 = _EMPTY_;
    private String g10301 = _EMPTY_;
    private String g10302 = _EMPTY_;
    private String g10303 = _EMPTY_;
    private String g10304 = _EMPTY_;
    private String g10305 = _EMPTY_;
    private String g10306 = _EMPTY_;
    private String g10307 = _EMPTY_;
    private String g10308 = _EMPTY_;
    private String g10309 = _EMPTY_;
    private String g10310 = _EMPTY_;
    private String g10311 = _EMPTY_;
    private String g10312 = _EMPTY_;
    private String g10313 = _EMPTY_;
    private String g10314 = _EMPTY_;
    private String g10315 = _EMPTY_;
    private String g10396 = _EMPTY_;
    private String g10396x = _EMPTY_;
    private String g104 = _EMPTY_;
    private String g10496x = _EMPTY_;
    private String g105 = _EMPTY_;
    private String g10501x = _EMPTY_;
    private String g106 = _EMPTY_;
    private String g107 = _EMPTY_;
    private String g10701x = _EMPTY_;
    private String g108 = _EMPTY_;
    private String g109 = _EMPTY_;
    private String g110 = _EMPTY_;
    private String g126 = _EMPTY_;
    private String g127 = _EMPTY_;
    private String g113 = _EMPTY_;
    private String g114 = _EMPTY_;
    private String g11496x = _EMPTY_;
    private String g115 = _EMPTY_;
    private String g116 = _EMPTY_;
    private String g117 = _EMPTY_;
    private String g117hx = _EMPTY_;
    private String g117mx = _EMPTY_;
    private String g117dx = _EMPTY_;
    private String g118 = _EMPTY_;
    private String g11801 = _EMPTY_;
    private String g11801x = _EMPTY_;
    private String g11802 = _EMPTY_;
    private String g11802x = _EMPTY_;
    private String g11803 = _EMPTY_;
    private String g11803x = _EMPTY_;
    private String g11804 = _EMPTY_;
    private String g11804x = _EMPTY_;
    private String g11896 = _EMPTY_;
    private String g11896x = _EMPTY_;
    private String g11898 = _EMPTY_;
    private String g119 = _EMPTY_;
    private String g120 = _EMPTY_;
    private String g12096x = _EMPTY_;
    private String g121 = _EMPTY_;
    private String g12196x = _EMPTY_;
    private String g122 = _EMPTY_;
    private String g123 = _EMPTY_;
    private String g12301 = _EMPTY_;
    private String g12302 = _EMPTY_;
    private String g12303 = _EMPTY_;
    private String g12304 = _EMPTY_;
    private String g12305 = _EMPTY_;
    private String g12306 = _EMPTY_;
    private String g12307 = _EMPTY_;
    private String g12308 = _EMPTY_;

    private String g124 = _EMPTY_;
    private String g1241 = _EMPTY_;
    private String g1242 = _EMPTY_;
    private String g1243 = _EMPTY_;
    private String g1244 = _EMPTY_;
    private String g1245 = _EMPTY_;
    private String g1246 = _EMPTY_;
    private String g1247 = _EMPTY_;
    private String g1248 = _EMPTY_;
    private String g1249 = _EMPTY_;
    private String g12410 = _EMPTY_;
    private String g12411 = _EMPTY_;
    private String g12412 = _EMPTY_;
    private String g12413 = _EMPTY_;
    private String g12401 = _EMPTY_;
    private String g1240101 = _EMPTY_;
    private String g1240102 = _EMPTY_;
    private String g1240103 = _EMPTY_;
    private String g1240104 = _EMPTY_;
    private String g1240105 = _EMPTY_;
    private String g1240106 = _EMPTY_;
    private String g1240107 = _EMPTY_;
    private String g1240108 = _EMPTY_;
    private String g1240109 = _EMPTY_;
    private String g1240110 = _EMPTY_;
    private String g1240111 = _EMPTY_;
    private String g1240112 = _EMPTY_;
    private String g1240113 = _EMPTY_;
    private String g1240114 = _EMPTY_;
    private String g12402 = _EMPTY_;
    private String g1240296x = _EMPTY_;
    private String g125 = _EMPTY_;
    private String g12501 = _EMPTY_;
    private String g1250101 = _EMPTY_;
    private String g1250102 = _EMPTY_;
    private String g1250103 = _EMPTY_;
    private String g1250104 = _EMPTY_;
    private String g1250105 = _EMPTY_;
    private String g1250106 = _EMPTY_;
    private String g1250107 = _EMPTY_;
    private String g1250108 = _EMPTY_;
    private String g128 = _EMPTY_;
    private String g129 = _EMPTY_;
    private String g130 = _EMPTY_;
    private String h101 = _EMPTY_;
    private String h101mx = _EMPTY_;
    private String h101wx = _EMPTY_;
    private String h102 = _EMPTY_;
    private String h103 = _EMPTY_;
    private String h10401 = _EMPTY_;
    private String h10402 = _EMPTY_;
    private String h10403 = _EMPTY_;
    private String h10496 = _EMPTY_;
    private String h10496x = _EMPTY_;
    private String h105 = _EMPTY_;
    private String h106 = _EMPTY_;
    private String h1061x = _EMPTY_;
    private String h107 = _EMPTY_;
    private String h10800 = _EMPTY_;
    private String h108a = _EMPTY_;
    private String h108 = _EMPTY_;
    private String h10896x = _EMPTY_;
    private String h10900 = _EMPTY_;
    private String h10901 = _EMPTY_;
    private String h109 = _EMPTY_;
    private String h1091 = _EMPTY_;
    private String h1092 = _EMPTY_;
    private String h1093 = _EMPTY_;
    private String h1094 = _EMPTY_;
    private String h1095 = _EMPTY_;
    private String h1096 = _EMPTY_;
    private String h1097 = _EMPTY_;
    private String h10997 = _EMPTY_;
    private String h10996 = _EMPTY_;
    private String h10996x = _EMPTY_;
    private String h11000 = _EMPTY_;
    private String h11001 = _EMPTY_;
    private String h110 = _EMPTY_;
    private String h111 = _EMPTY_;
    private String h11200 = _EMPTY_;
    private String h11201 = _EMPTY_;
    private String h11202 = _EMPTY_;
    private String h112 = _EMPTY_;
    private String h113 = _EMPTY_;
    private String h114 = _EMPTY_;
    private String h115 = _EMPTY_;
    private String h11501 = _EMPTY_;
    private String h11502 = _EMPTY_;
    private String h11503 = _EMPTY_;
    private String h11504 = _EMPTY_;
    private String h11505 = _EMPTY_;
    private String h11506 = _EMPTY_;
    private String h11507 = _EMPTY_;
    private String h11508 = _EMPTY_;
    private String h11509 = _EMPTY_;
    private String h11596 = _EMPTY_;
    private String h11596x = _EMPTY_;
    private String h116 = _EMPTY_;
    private String h11701 = _EMPTY_;
    private String h118 = _EMPTY_;
    private String h119 = _EMPTY_;
    private String h120 = _EMPTY_;
    private String h121 = _EMPTY_;
    private String h122 = _EMPTY_;
    private String h1221x = _EMPTY_;
    private String h123 = _EMPTY_;
    private String h124 = _EMPTY_;
    private String h125 = _EMPTY_;
    private String h126 = _EMPTY_;
    private String h127 = _EMPTY_;
    private String h12796x = _EMPTY_;
    private String h128 = _EMPTY_;
    private String h12896x = _EMPTY_;
    private String h12901 = _EMPTY_;
    private String h12902 = _EMPTY_;
    private String h12903 = _EMPTY_;
    private String h12904 = _EMPTY_;
    private String h12905 = _EMPTY_;
    private String h12906 = _EMPTY_;
    private String h130 = _EMPTY_;
    private String h131 = _EMPTY_;
    private String h13101 = _EMPTY_;
    private String h1310101 = _EMPTY_;
    private String h1310102 = _EMPTY_;
    private String h1310103 = _EMPTY_;
    private String h1310104 = _EMPTY_;
    private String h1310105 = _EMPTY_;
    private String h1310106 = _EMPTY_;
    private String h1310107 = _EMPTY_;

    private String h132 = _EMPTY_;
    private String h132a = _EMPTY_;
    private String h132a96x = _EMPTY_;
    private String h133 = _EMPTY_;
    private String h13301 = _EMPTY_;
    private String h13302 = _EMPTY_;
    private String h13303 = _EMPTY_;
    private String h13304 = _EMPTY_;
    private String h13305 = _EMPTY_;
    private String h13306 = _EMPTY_;
    private String h13307 = _EMPTY_;
    private String h13308 = _EMPTY_;
    private String h13309 = _EMPTY_;
    private String h13310 = _EMPTY_;
    private String h134 = _EMPTY_;
    private String h135 = _EMPTY_;
    private String h13501 = _EMPTY_;
    private String h13502 = _EMPTY_;
    private String h13503 = _EMPTY_;
    private String h13504 = _EMPTY_;
    private String h13505 = _EMPTY_;
    private String h13506 = _EMPTY_;
    private String h13507 = _EMPTY_;
    private String h13508 = _EMPTY_;
    private String h13509 = _EMPTY_;
    private String h13598 = _EMPTY_;
    private String h136a = _EMPTY_;
    private String h136b = _EMPTY_;
    private String h136c = _EMPTY_;
    private String h136d = _EMPTY_;
    private String h136e = _EMPTY_;
    private String h136f = _EMPTY_;
    private String h13696 = _EMPTY_;
    private String h13696x = _EMPTY_;

    private String h1361 = _EMPTY_;
    private String h1362a = _EMPTY_;
    private String h1362b = _EMPTY_;
    private String h1362c = _EMPTY_;
    private String h1362d = _EMPTY_;
    private String h1362e = _EMPTY_;
    private String h1362f = _EMPTY_;
    private String h1362g = _EMPTY_;
    private String h1362h = _EMPTY_;
    private String h1362i = _EMPTY_;
    private String h1362j = _EMPTY_;
    private String h136298 = _EMPTY_;
    private String h1363 = _EMPTY_;

    private String h137 = _EMPTY_;
    private String h1371 = _EMPTY_;
    private String h137196x = _EMPTY_;
    private String h1372 = _EMPTY_;
    private String h1373 = _EMPTY_;
    private String h137396x = _EMPTY_;
    private String h201 = _EMPTY_;
    private String h201hx = _EMPTY_;
    private String h201dx = _EMPTY_;
    private String h201wx = _EMPTY_;
    private String h202 = _EMPTY_;
    private String h203h = _EMPTY_;
    private String h203d = _EMPTY_;
    private String h203w = _EMPTY_;
    private String h204 = _EMPTY_;
    private String h20496x = _EMPTY_;
    private String h205 = _EMPTY_;
    private String h20596x = _EMPTY_;
    private String h2051a = _EMPTY_;
    private String h2051b = _EMPTY_;
    private String h2051c = _EMPTY_;
    private String h2051d = _EMPTY_;
    private String h2051e = _EMPTY_;
    private String h2051f = _EMPTY_;
    private String h2051g = _EMPTY_;
    private String h2051h = _EMPTY_;
    private String h2051i = _EMPTY_;
    private String h2051j = _EMPTY_;
    private String h205196 = _EMPTY_;
    private String h205196x = _EMPTY_;
    private String h206 = _EMPTY_;
    private String h207 = _EMPTY_;
    private String h20701 = _EMPTY_;
    private String h20702 = _EMPTY_;
    private String h20703 = _EMPTY_;
    private String h20704 = _EMPTY_;
    private String h20705 = _EMPTY_;
    private String h20706 = _EMPTY_;
    private String h20707 = _EMPTY_;
    private String h20708 = _EMPTY_;
    private String h20798 = _EMPTY_;
    private String h208 = _EMPTY_;
    private String h20801 = _EMPTY_;
    private String h20802 = _EMPTY_;
    private String h20803 = _EMPTY_;
    private String h20804 = _EMPTY_;
    private String h20805 = _EMPTY_;
    private String h20806 = _EMPTY_;
    private String h20896 = _EMPTY_;
    private String h20896x = _EMPTY_;
    private String h208a = _EMPTY_;
    private String h208b = _EMPTY_;
    private String h208b01 = _EMPTY_;
    private String h208b02 = _EMPTY_;
    private String h208b03 = _EMPTY_;
    private String h208b04 = _EMPTY_;
    private String h208b05 = _EMPTY_;
    private String h208b06 = _EMPTY_;
    private String h208b07 = _EMPTY_;
    private String h208b08 = _EMPTY_;
    private String h208b09 = _EMPTY_;
    private String h208b98 = _EMPTY_;
    private String h208c = _EMPTY_;
    private String h208d = _EMPTY_;
    private String h208d96x = _EMPTY_;
    private String h209 = _EMPTY_;
    private String h209a = _EMPTY_;
    private String h209a96x = _EMPTY_;
    private String h210 = _EMPTY_;
    private String h21101 = _EMPTY_;
    private String h21102 = _EMPTY_;
    private String h21103 = _EMPTY_;
    private String h21104 = _EMPTY_;
    private String h21105 = _EMPTY_;
    private String h21106 = _EMPTY_;
    private String h21107 = _EMPTY_;
    private String h21108 = _EMPTY_;
    private String h21109 = _EMPTY_;
    private String h21110 = _EMPTY_;
    private String h212 = _EMPTY_;
    private String h213 = _EMPTY_;
    private String h214 = _EMPTY_;
    private String h214a = _EMPTY_;
    private String h214b = _EMPTY_;
    private String h214b01 = _EMPTY_;
    private String h214b02 = _EMPTY_;
    private String h214b03 = _EMPTY_;
    private String h214b04 = _EMPTY_;
    private String h214b05 = _EMPTY_;
    private String h214b06 = _EMPTY_;
    private String h214b96 = _EMPTY_;
    private String h214b96x = _EMPTY_;
    private String h214b98 = _EMPTY_;
    private String h215 = _EMPTY_;
    private String h216 = _EMPTY_;
    private String h216a = _EMPTY_;
    private String h216a96x = _EMPTY_;
    private String h217 = _EMPTY_;
    private String h21701 = _EMPTY_;
    private String h21702 = _EMPTY_;
    private String h21703 = _EMPTY_;
    private String h21704 = _EMPTY_;
    private String h21705 = _EMPTY_;
    private String h21706 = _EMPTY_;
    private String h21796 = _EMPTY_;
    private String h21796x = _EMPTY_;
    private String h218 = _EMPTY_;
    private String h219 = _EMPTY_;
    private String h21996x = _EMPTY_;
    private String h220 = _EMPTY_;
    private String h2201 = _EMPTY_;
    private String h2201x = _EMPTY_;
    private String h2202 = _EMPTY_;
    private String h2202x = _EMPTY_;
    private String h2203 = _EMPTY_;
    private String h2203x = _EMPTY_;
    private String h2204 = _EMPTY_;
    private String h2204x = _EMPTY_;
    private String h2205 = _EMPTY_;
    private String h2205x = _EMPTY_;
    private String h2206 = _EMPTY_;
    private String h2206x = _EMPTY_;
    private String h22096 = _EMPTY_;
    private String h22096x = _EMPTY_;
    private String h221 = _EMPTY_;
    private String h222 = _EMPTY_;
    private String h22296x = _EMPTY_;
    private String h223 = _EMPTY_;
    private String k101 = _EMPTY_;
    private String k101a = _EMPTY_;
    private String k101a01 = _EMPTY_;
    private String k101a02 = _EMPTY_;
    private String k101a03 = _EMPTY_;
    private String k101a04 = _EMPTY_;
    private String k101a05 = _EMPTY_;
    private String k101a06 = _EMPTY_;
    private String k101a07 = _EMPTY_;
    private String k101a08 = _EMPTY_;
    private String k101a09 = _EMPTY_;
    private String k101a10 = _EMPTY_;
    private String k101a11 = _EMPTY_;
    private String k101a12 = _EMPTY_;
    private String k101a13 = _EMPTY_;
    private String k101a14 = _EMPTY_;
    private String k101a15 = _EMPTY_;
    private String k101a16 = _EMPTY_;
    private String k101a96 = _EMPTY_;
    private String k101a96x = _EMPTY_;
    private String k101b = _EMPTY_;
    private String k102 = _EMPTY_;
    private String k104 = _EMPTY_;
    private String k10401 = _EMPTY_;
    private String k10402 = _EMPTY_;
    private String k10403 = _EMPTY_;
    private String k10404 = _EMPTY_;
    private String k10405 = _EMPTY_;
    private String k10406 = _EMPTY_;
    private String k10477 = _EMPTY_;
    private String k10408 = _EMPTY_;
    private String k10409 = _EMPTY_;
    private String k10410 = _EMPTY_;
    private String k10411 = _EMPTY_;
    private String k10412 = _EMPTY_;
    private String k10413 = _EMPTY_;
    private String k103 = _EMPTY_;
    private String k103a01 = _EMPTY_;
    private String k103a02 = _EMPTY_;
    private String k103a03 = _EMPTY_;
    private String k103a04 = _EMPTY_;
    private String k103a05 = _EMPTY_;
    private String k103a06 = _EMPTY_;
    private String k103a07 = _EMPTY_;
    private String k103a08 = _EMPTY_;
    private String k103a09 = _EMPTY_;
    private String k103a10 = _EMPTY_;
    private String k103a11 = _EMPTY_;
    private String k103a12 = _EMPTY_;
    private String k103a13 = _EMPTY_;
    private String k105 = _EMPTY_;
    private String k105a = _EMPTY_;
    private String k105a01x = _EMPTY_;
    private String k105a02x = _EMPTY_;
    private String k105b = _EMPTY_;
    private String k105c01 = _EMPTY_;
    private String k105c02 = _EMPTY_;
    private String k105c03 = _EMPTY_;
    private String k105c04 = _EMPTY_;
    private String k105c05 = _EMPTY_;
    private String k105c06 = _EMPTY_;
    private String k105c07 = _EMPTY_;
    private String k105c08 = _EMPTY_;
    private String k105c09 = _EMPTY_;
    private String k105c96 = _EMPTY_;
    private String k105c96x = _EMPTY_;
    private String k105dm = _EMPTY_;
    private String k105dy = _EMPTY_;
    private String k106 = _EMPTY_;
    private String k10601 = _EMPTY_;
    private String k10602 = _EMPTY_;
    private String k10603 = _EMPTY_;
    private String k10604 = _EMPTY_;
    private String k10605 = _EMPTY_;
    private String k10606 = _EMPTY_;
    private String k10607 = _EMPTY_;
    private String k10608 = _EMPTY_;
    private String k10696 = _EMPTY_;
    private String k10696x = _EMPTY_;
    private String k107 = _EMPTY_;
    private String k107a = _EMPTY_;
    private String k107a01 = _EMPTY_;
    private String k107a02 = _EMPTY_;
    private String k107a03 = _EMPTY_;
    private String k107a04 = _EMPTY_;
    private String k107a05 = _EMPTY_;
    private String k107a06 = _EMPTY_;
    private String k107a07 = _EMPTY_;
    private String k107a08 = _EMPTY_;
    private String k107a99 = _EMPTY_;
    private String k108 = _EMPTY_;
    private String k108a = _EMPTY_;
    private String k109 = _EMPTY_;
    private String l101 = _EMPTY_;
    private String l102 = _EMPTY_;
    private String l102a = _EMPTY_;
    private String l102a96x = _EMPTY_;
    private String l103 = _EMPTY_;
    private String l104 = _EMPTY_;
    private String l10496x = _EMPTY_;
    private String l105 = _EMPTY_;
    private String l106 = _EMPTY_;
    private String l10696x = _EMPTY_;
    private String l107 = _EMPTY_;
    private String l10796x = _EMPTY_;
    private String l108 = _EMPTY_;
    private String l10896x = _EMPTY_;
    private String l109 = _EMPTY_;
    private String l10996x = _EMPTY_;
    private String l110 = _EMPTY_;
    private String l111 = _EMPTY_;
    private String l1121 = _EMPTY_;
    private String l1122 = _EMPTY_;
    private String l1123 = _EMPTY_;
    private String l1124 = _EMPTY_;
    private String l1125 = _EMPTY_;

    private String lg101 = _EMPTY_;
    private String lg102 = _EMPTY_;
    private String lg10201 = _EMPTY_;
    private String lg10202 = _EMPTY_;
    private String lg10203 = _EMPTY_;
    private String lg10204 = _EMPTY_;
    private String lg10205 = _EMPTY_;
    private String lg10206 = _EMPTY_;
    private String lg10207 = _EMPTY_;
    private String lg10208 = _EMPTY_;
    private String lg10209 = _EMPTY_;
    private String lg10296 = _EMPTY_;
    private String lg10296x = _EMPTY_;
    private String lg103 = _EMPTY_;
    private String lg104 = _EMPTY_;
    private String lg10401 = _EMPTY_;
    private String lg10402 = _EMPTY_;
    private String lg10403 = _EMPTY_;
    private String lg10404 = _EMPTY_;
    private String lg10405 = _EMPTY_;
    private String lg10406 = _EMPTY_;
    private String lg10407 = _EMPTY_;
    private String lg10408 = _EMPTY_;
    private String lg10409 = _EMPTY_;
    private String lg10410 = _EMPTY_;
    private String lg10411 = _EMPTY_;
    private String lg10412 = _EMPTY_;
    private String lg10413 = _EMPTY_;
    private String lg10414 = _EMPTY_;
    private String lg10415 = _EMPTY_;
    private String lg10416 = _EMPTY_;
    private String lg105 = _EMPTY_;
    private String lg106 = _EMPTY_;
    private String lg10601 = _EMPTY_;
    private String lg10602 = _EMPTY_;
    private String lg10603 = _EMPTY_;
    private String lg10604 = _EMPTY_;
    private String lg10605 = _EMPTY_;
    private String lg10606 = _EMPTY_;
    private String lg10607 = _EMPTY_;
    private String lg10696 = _EMPTY_;
    private String lg10696x = _EMPTY_;

    private String l1131 = _EMPTY_;
    private String l1132 = _EMPTY_;
    private String l1133 = _EMPTY_;
    private String l1134 = _EMPTY_;
    private String l114 = _EMPTY_;
    private String l11496x = _EMPTY_;
    private String l115 = _EMPTY_;
    private String l11596x = _EMPTY_;
    private String l116 = _EMPTY_;
    private String l11696x = _EMPTY_;
    private String l117 = _EMPTY_;
    private String l11796x = _EMPTY_;

    //    SectionUN
    private String un01 = _EMPTY_;
    private String un02 = _EMPTY_;
    private String un03 = _EMPTY_;
    private String un04 = _EMPTY_;
    private String un0401x = _EMPTY_;
    private String un0402x = _EMPTY_;
    private String un05 = _EMPTY_;
    private String un06 = _EMPTY_;
    private String un0696x = _EMPTY_;
    private String un07 = _EMPTY_;
    private String un0701x = _EMPTY_;
    private String un0702x = _EMPTY_;
    private String un0703x = _EMPTY_;
    private String un0704x = _EMPTY_;

    // Constructor
    public void Mwra() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getUid()); //// not applicable in Form table
        setSno(selectedMWRA);
        setIndexed(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getIndexed());
        setName(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getA202());
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
/*
    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }*/

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

    public String getpsuCode() {
        return psuCode;
    }

    private void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        // if F101 is yes
        setF101a01(f101.equals("1") ? "" : this.f101a01);
        setF101a02(f101.equals("1") ? "" : this.f101a02);
        setF101a03(f101.equals("1") ? "" : this.f101a03);
        setF101a04(f101.equals("1") ? "" : this.f101a04);
        setF101a05(f101.equals("1") ? "" : this.f101a05);
        setF101a06(f101.equals("1") ? "" : this.f101a06);
        setF101a07(f101.equals("1") ? "" : this.f101a07);
        setF101a08(f101.equals("1") ? "" : this.f101a08);
        setF101a09(f101.equals("1") ? "" : this.f101a09);
        setF101a10(f101.equals("1") ? "" : this.f101a10);
        setF101a11(f101.equals("1") ? "" : this.f101a11);
        setF101a12(f101.equals("1") ? "" : this.f101a12);
        setF101a13(f101.equals("1") ? "" : this.f101a13);
        setF101a14(f101.equals("1") ? "" : this.f101a14);
        setF101a96(f101.equals("1") ? "" : this.f101a96);

        // if F101 is No
        setF101b(f101.equals("2") ? "" : this.f101b);
        setF101b01x(f101.equals("2") ? "" : this.f101b01x);

        setF10201(f101.equals("2") ? "" : this.f10201);
        setF10202(f101.equals("2") ? "" : this.f10202);
        setF10203(f101.equals("2") ? "" : this.f10203);
        setF10204(f101.equals("2") ? "" : this.f10204);
        setF10205(f101.equals("2") ? "" : this.f10205);
        setF10206(f101.equals("2") ? "" : this.f10206);
        setF10207(f101.equals("2") ? "" : this.f10207);
        setF10208(f101.equals("2") ? "" : this.f10208);
        setF10209(f101.equals("2") ? "" : this.f10209);
        setF10210(f101.equals("2") ? "" : this.f10210);
        setF10211(f101.equals("2") ? "" : this.f10211);
        setF10296(f101.equals("2") ? "" : this.f10296);
        setF10296x(f101.equals("2") ? "" : this.f10296x);

        setF10301(f101.equals("2") ? "" : this.f10301);
        setF10302(f101.equals("2") ? "" : this.f10302);
        setF10303(f101.equals("2") ? "" : this.f10303);
        setF10304(f101.equals("2") ? "" : this.f10304);
        setF10305(f101.equals("2") ? "" : this.f10305);
        setF104(f101.equals("2") ? "" : this.f104);
        setF105(f101.equals("2") ? "" : this.f105);
        setF106(f101.equals("2") ? "" : this.f106);
        setF107(f101.equals("2") ? "" : this.f107);
        setF10796x(f101.equals("2") ? "" : this.f10796x);
        setF108(f101.equals("2") ? "" : this.f108);
        setF108wx(f101.equals("2") ? "" : this.f108wx);
        setF108mx(f101.equals("2") ? "" : this.f108mx);
        setF11001(f101.equals("2") ? "" : this.f11001);
        setF11002(f101.equals("2") ? "" : this.f11002);
        setF11003(f101.equals("2") ? "" : this.f11003);
        setF11004(f101.equals("2") ? "" : this.f11004);
        setF11005(f101.equals("2") ? "" : this.f11005);
        setF11006(f101.equals("2") ? "" : this.f11006);
        setF11007(f101.equals("2") ? "" : this.f11007);
        setF11008(f101.equals("2") ? "" : this.f11008);
        setF11009(f101.equals("2") ? "" : this.f11009);
        setF11096(f101.equals("2") ? "" : this.f11096);
        setF11096x(f101.equals("2") ? "" : this.f11096x);
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF101a() {
        return f101a;
    }

    public void setF101a(String f101a) {
        this.f101a = f101a;
        notifyPropertyChanged(BR.f101a);
    }

    @Bindable
    public String getF101a01() {
        return f101a01;
    }

    public void setF101a01(String f101a01) {
        if (this.f101a01.equals(f101a01)) return;     // For all checkboxes
        this.f101a01 = f101a01;
        notifyPropertyChanged(BR.f101a01);
    }

    @Bindable
    public String getF101a02() {
        return f101a02;
    }

    public void setF101a02(String f101a02) {
        if (this.f101a02.equals(f101a02)) return;     // For all checkboxes
        this.f101a02 = f101a02;
        notifyPropertyChanged(BR.f101a02);
    }

    @Bindable
    public String getF101a03() {
        return f101a03;
    }

    public void setF101a03(String f101a03) {
        if (this.f101a03.equals(f101a03)) return;     // For all checkboxes
        this.f101a03 = f101a03;
        notifyPropertyChanged(BR.f101a03);
    }

    @Bindable
    public String getF101a04() {
        return f101a04;
    }

    public void setF101a04(String f101a04) {
        if (this.f101a04.equals(f101a04)) return;     // For all checkboxes
        this.f101a04 = f101a04;
        notifyPropertyChanged(BR.f101a04);
    }

    @Bindable
    public String getF101a05() {
        return f101a05;
    }

    public void setF101a05(String f101a05) {
        if (this.f101a05.equals(f101a05)) return;     // For all checkboxes
        this.f101a05 = f101a05;
        notifyPropertyChanged(BR.f101a05);
    }

    @Bindable
    public String getF101a06() {
        return f101a06;
    }

    public void setF101a06(String f101a06) {
        if (this.f101a06.equals(f101a06)) return;     // For all checkboxes
        this.f101a06 = f101a06;
        notifyPropertyChanged(BR.f101a06);
    }

    @Bindable
    public String getF101a07() {
        return f101a07;
    }

    public void setF101a07(String f101a07) {
        if (this.f101a07.equals(f101a07)) return;     // For all checkboxes
        this.f101a07 = f101a07;
        notifyPropertyChanged(BR.f101a07);
    }

    @Bindable
    public String getF101a08() {
        return f101a08;
    }

    public void setF101a08(String f101a08) {
        if (this.f101a08.equals(f101a08)) return;     // For all checkboxes
        this.f101a08 = f101a08;
        notifyPropertyChanged(BR.f101a08);
    }

    @Bindable
    public String getF101a09() {
        return f101a09;
    }

    public void setF101a09(String f101a09) {
        if (this.f101a09.equals(f101a09)) return;     // For all checkboxes
        this.f101a09 = f101a09;
        notifyPropertyChanged(BR.f101a09);
    }

    @Bindable
    public String getF101a10() {
        return f101a10;
    }

    public void setF101a10(String f101a10) {
        if (this.f101a10.equals(f101a10)) return;     // For all checkboxes
        this.f101a10 = f101a10;
        notifyPropertyChanged(BR.f101a10);
    }

    @Bindable
    public String getF101a11() {
        return f101a11;
    }

    public void setF101a11(String f101a11) {
        if (this.f101a11.equals(f101a11)) return;     // For all checkboxes
        this.f101a11 = f101a11;
        notifyPropertyChanged(BR.f101a11);
    }

    @Bindable
    public String getF101a12() {
        return f101a12;
    }

    public void setF101a12(String f101a12) {
        if (this.f101a12.equals(f101a12)) return;     // For all checkboxes
        this.f101a12 = f101a12;
        notifyPropertyChanged(BR.f101a12);
    }

    @Bindable
    public String getF101a13() {
        return f101a13;
    }

    public void setF101a13(String f101a13) {
        if (this.f101a13.equals(f101a13)) return;     // For all checkboxes
        this.f101a13 = f101a13;
        notifyPropertyChanged(BR.f101a13);
    }

    @Bindable
    public String getF101a14() {
        return f101a14;
    }

    public void setF101a14(String f101a14) {
        if (this.f101a14.equals(f101a14)) return;     // For all checkboxes
        this.f101a14 = f101a14;
        notifyPropertyChanged(BR.f101a14);
    }

    @Bindable
    public String getF101a96() {
        return f101a96;
    }

    public void setF101a96(String f101a96) {
        if (this.f101a96.equals(f101a96)) return;     // For all checkboxes
        this.f101a96 = f101a96;
        setF101a96x(f101a96.equals("96") ? this.f101a96x : "");
        notifyPropertyChanged(BR.f101a96);
    }

    @Bindable
    public String getF101a96x() {
        return f101a96x;
    }

    public void setF101a96x(String f101a96x) {
        this.f101a96x = f101a96x;
        notifyPropertyChanged(BR.f101a96x);
    }

    @Bindable
    public String getF101b() {
        return f101b;
    }

    public void setF101b(String f101b) {
        this.f101b = f101b;
        setF101b01x(f101b.equals("1") ? this.f101b01x : "");

        /*setF10201(f101b.equals("1") ? this.f10201 : "");
        setF10202(f101b.equals("1") ? this.f10202 : "");
        setF10203(f101b.equals("1") ? this.f10203 : "");
        setF10204(f101b.equals("1") ? this.f10204 : "");
        setF10205(f101b.equals("1") ? this.f10205 : "");
        setF10206(f101b.equals("1") ? this.f10206 : "");
        setF10207(f101b.equals("1") ? this.f10207 : "");
        setF10208(f101b.equals("1") ? this.f10208 : "");
        setF10209(f101b.equals("1") ? this.f10209 : "");
        setF10210(f101b.equals("1") ? this.f10210 : "");
        setF10296(f101b.equals("1") ? this.f10296 : "");
        setF10296x(f101b.equals("1") ? this.f10296x : "");
        setF10301(f101b.equals("1") ? this.f10301 : "");
        setF10302(f101b.equals("1") ? this.f10302 : "");
        setF10303(f101b.equals("1") ? this.f10303 : "");
        setF10304(f101b.equals("1") ? this.f10304 : "");
        setF10305(f101b.equals("1") ? this.f10305 : "");
        setF107(f101b.equals("1") ? this.f107 : "");
        setF10796x(f101b.equals("1") ? this.f10796x : "");
        setF108(f101b.equals("1") ? this.f108 : "");
        setF108wx(f101b.equals("1") ? this.f108wx : "");
        setF108mx(f101b.equals("1") ? this.f108mx : "");
        setF11001(f101b.equals("1") ? this.f11001 : "");
        setF11002(f101b.equals("1") ? this.f11002 : "");
        setF11003(f101b.equals("1") ? this.f11003 : "");
        setF11004(f101b.equals("1") ? this.f11004 : "");
        setF11005(f101b.equals("1") ? this.f11005 : "");
        setF11006(f101b.equals("1") ? this.f11006 : "");
        setF11007(f101b.equals("1") ? this.f11007 : "");
        setF11008(f101b.equals("1") ? this.f11008 : "");
        setF11009(f101b.equals("1") ? this.f11009 : "");
        setF11096(f101b.equals("1") ? this.f11096 : "");
        setF1109696x(f101b.equals("1") ? this.f1109696x : "");*/
        notifyPropertyChanged(BR.f101b);
    }

    @Bindable
    public String getF101b01x() {
        return f101b01x;
    }

    public void setF101b01x(String f101b01x) {
        this.f101b01x = f101b01x;

        notifyPropertyChanged(BR.f101b01x);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF10201() {
        return f10201;
    }

    public void setF10201(String f10201) {
        if (this.f10201.equals(f10201)) return;     // For all checkboxes
        this.f10201 = f10201;
        notifyPropertyChanged(BR.f10201);
    }

    @Bindable
    public String getF10202() {
        return f10202;
    }

    public void setF10202(String f10202) {
        if (this.f10202.equals(f10202)) return;     // For all checkboxes
        this.f10202 = f10202;
        notifyPropertyChanged(BR.f10202);
    }

    @Bindable
    public String getF10203() {
        return f10203;
    }

    public void setF10203(String f10203) {
        if (this.f10203.equals(f10203)) return;     // For all checkboxes
        this.f10203 = f10203;
        notifyPropertyChanged(BR.f10203);
    }

    @Bindable
    public String getF10204() {
        return f10204;
    }

    public void setF10204(String f10204) {
        if (this.f10204.equals(f10204)) return;     // For all checkboxes
        this.f10204 = f10204;
        notifyPropertyChanged(BR.f10204);
    }

    @Bindable
    public String getF10205() {
        return f10205;
    }

    public void setF10205(String f10205) {
        if (this.f10205.equals(f10205)) return;     // For all checkboxes
        this.f10205 = f10205;
        notifyPropertyChanged(BR.f10205);
    }

    @Bindable
    public String getF10206() {
        return f10206;
    }

    public void setF10206(String f10206) {
        if (this.f10206.equals(f10206)) return;     // For all checkboxes
        this.f10206 = f10206;
        notifyPropertyChanged(BR.f10206);
    }

    @Bindable
    public String getF10207() {
        return f10207;
    }

    public void setF10207(String f10207) {
        if (this.f10207.equals(f10207)) return;     // For all checkboxes
        this.f10207 = f10207;
        notifyPropertyChanged(BR.f10207);
    }

    @Bindable
    public String getF10208() {
        return f10208;
    }

    public void setF10208(String f10208) {
        if (this.f10208.equals(f10208)) return;     // For all checkboxes
        this.f10208 = f10208;
        notifyPropertyChanged(BR.f10208);
    }

    @Bindable
    public String getF10209() {
        return f10209;
    }

    public void setF10209(String f10209) {
        if (this.f10209.equals(f10209)) return;     // For all checkboxes
        this.f10209 = f10209;
        notifyPropertyChanged(BR.f10209);
    }

    @Bindable
    public String getF10210() {
        return f10210;
    }

    public void setF10210(String f10210) {
        if (this.f10210.equals(f10210)) return;     // For all checkboxes
        this.f10210 = f10210;
        notifyPropertyChanged(BR.f10210);
    }

    @Bindable
    public String getF10211() {
        return f10211;
    }

    public void setF10211(String f10211) {
        if (this.f10211.equals(f10211)) return;     // For all checkboxes
        this.f10211 = f10211;
        notifyPropertyChanged(BR.f10211);
    }

    @Bindable
    public String getF10296() {
        return f10296;
    }

    public void setF10296(String f10296) {
        if (this.f10296.equals(f10296)) return;     // For all checkboxes
        this.f10296 = f10296;
        setF10296x(f10296.equals("96") ? this.f10296x : "");
        notifyPropertyChanged(BR.f10296);
    }

    @Bindable
    public String getF10296x() {
        return f10296x;
    }

    public void setF10296x(String f10296x) {
        this.f10296x = f10296x;
        notifyPropertyChanged(BR.f10296x);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF10301() {
        return f10301;
    }

    public void setF10301(String f10301) {
        if (this.f10301.equals(f10301)) return;     // For all checkboxes
        this.f10301 = f10301;
        notifyPropertyChanged(BR.f10301);
    }

    @Bindable
    public String getF10302() {
        return f10302;
    }

    public void setF10302(String f10302) {
        if (this.f10302.equals(f10302)) return;     // For all checkboxes
        this.f10302 = f10302;
        notifyPropertyChanged(BR.f10302);
    }

    @Bindable
    public String getF10303() {
        return f10303;
    }

    public void setF10303(String f10303) {
        if (this.f10303.equals(f10303)) return;     // For all checkboxes
        this.f10303 = f10303;
        notifyPropertyChanged(BR.f10303);
    }

    @Bindable
    public String getF10304() {
        return f10304;
    }

    public void setF10304(String f10304) {
        if (this.f10304.equals(f10304)) return;     // For all checkboxes
        this.f10304 = f10304;
        notifyPropertyChanged(BR.f10304);
    }

    @Bindable
    public String getF10305() {
        return f10305;
    }

    public void setF10305(String f10305) {
        if (this.f10305.equals(f10305)) return;     // For all checkboxes
        this.f10305 = f10305;
        notifyPropertyChanged(BR.f10305);
    }

    @Bindable
    public String getF104() {
        return f104;
    }

    public void setF104(String f104) {
        this.f104 = f104;
        notifyPropertyChanged(BR.f104);
    }

    @Bindable
    public String getF105() {
        return f105;
    }

    public void setF105(String f105) {
        this.f105 = f105;
        notifyPropertyChanged(BR.f105);
    }

    @Bindable
    public String getF106() {
        return f106;
    }

    public void setF106(String f106) {
        this.f106 = f106;
        notifyPropertyChanged(BR.f106);
    }

    @Bindable
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
        setF10796x(f107.equals("96") ? this.f10796x : "");
        notifyPropertyChanged(BR.f107);
    }

    @Bindable
    public String getF10796x() {
        return f10796x;
    }

    public void setF10796x(String f10796x) {
        this.f10796x = f10796x;
        notifyPropertyChanged(BR.f10796x);
    }

    @Bindable
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
        setF108wx(f108.equals("1") ? this.f108wx : "");
        setF108mx(f108.equals("2") ? this.f108mx : "");

        notifyPropertyChanged(BR.f108);
    }

    @Bindable
    public String getF108wx() {
        return f108wx;
    }

    public void setF108wx(String f108wx) {
        this.f108wx = f108wx;
        notifyPropertyChanged(BR.f108wx);
    }

    @Bindable
    public String getF108mx() {
        return f108mx;
    }

    public void setF108mx(String f108mx) {
        this.f108mx = f108mx;
        notifyPropertyChanged(BR.f108mx);
    }

    @Bindable
    public String getF11001() {
        return f11001;
    }

    public void setF11001(String f11001) {
        this.f11001 = f11001;
        notifyPropertyChanged(BR.f11001);
    }

    @Bindable
    public String getF11002() {
        return f11002;
    }

    public void setF11002(String f11002) {
        this.f11002 = f11002;
        notifyPropertyChanged(BR.f11002);
    }

    @Bindable
    public String getF11003() {
        return f11003;
    }

    public void setF11003(String f11003) {
        this.f11003 = f11003;
        notifyPropertyChanged(BR.f11003);
    }

    @Bindable
    public String getF11004() {
        return f11004;
    }

    public void setF11004(String f11004) {
        this.f11004 = f11004;
        notifyPropertyChanged(BR.f11004);
    }

    @Bindable
    public String getF11005() {
        return f11005;
    }

    public void setF11005(String f11005) {
        this.f11005 = f11005;
        notifyPropertyChanged(BR.f11005);
    }

    @Bindable
    public String getF11006() {
        return f11006;
    }

    public void setF11006(String f11006) {
        this.f11006 = f11006;
        notifyPropertyChanged(BR.f11006);
    }

    @Bindable
    public String getF11007() {
        return f11007;
    }

    public void setF11007(String f11007) {
        this.f11007 = f11007;
        notifyPropertyChanged(BR.f11007);
    }

    @Bindable
    public String getF11008() {
        return f11008;
    }

    public void setF11008(String f11008) {
        this.f11008 = f11008;
        setF11009(f11008.equals("1") ? this.f11009 : "");
        notifyPropertyChanged(BR.f11008);
    }

    @Bindable
    public String getF11009() {
        return f11009;
    }

    public void setF11009(String f11009) {
        this.f11009 = f11009;
        notifyPropertyChanged(BR.f11009);
    }


    @Bindable
    public String getF11096() {
        return f11096;
    }

    public void setF11096(String f11096) {
        this.f11096 = f11096;
        setF11096x(f11096.equals("1") ? this.f11096x : "");
        notifyPropertyChanged(BR.f11096);
    }

    @Bindable
    public String getF11096x() {
        return f11096x;
    }

    public void setF11096x(String f11096x) {
        this.f11096x = f11096x;
        notifyPropertyChanged(BR.f11096x);
    }

    @Bindable
    public String getF111() {
        return f111;
    }

    public void setF111(String f111) {
        this.f111 = f111;
        notifyPropertyChanged(BR.f111);
    }

    @Bindable
    public String getF112() {
        return f112;
    }

    public void setF112(String f112) {
        this.f112 = f112;
        setF113(f112.equals("1") ? this.f113 : "");
        setF11301x(f112.equals("1") ? this.f11301x : "");
        notifyPropertyChanged(BR.f112);
    }

    @Bindable
    public String getF113() {
        return f113;
    }

    public void setF113(String f113) {
        this.f113 = f113;
        setF11301x(f113.equals("1") ? this.f11301x : "");
        notifyPropertyChanged(BR.f113);
    }

    @Bindable
    public String getF11301x() {
        return f11301x;
    }

    public void setF11301x(String f11301x) {
        this.f11301x = f11301x;
        notifyPropertyChanged(BR.f11301x);
    }

    @Bindable
    public String getF114() {
        return f114;
    }

    public void setF114(String f114) {
        this.f114 = f114;
        setF115(f114.equals("1") ? this.f115 : "");
        setF116(f114.equals("1") ? this.f116 : "");
        setF117(f114.equals("1") ? this.f117 : "");
        setF118(f114.equals("1") ? this.f118 : "");
        setF119(f114.equals("1") ? this.f119 : "");
        setF120(f114.equals("1") ? this.f120 : "");
        notifyPropertyChanged(BR.f114);
    }

    @Bindable
    public String getF115() {
        return f115;
    }

    public void setF115(String f115) {
        this.f115 = f115;
        notifyPropertyChanged(BR.f115);
    }

    @Bindable
    public String getF116() {
        return f116;
    }

    public void setF116(String f116) {
        this.f116 = f116;
        notifyPropertyChanged(BR.f116);
    }


    @Bindable
    public String getF117() {
        return f117;
    }

    public void setF117(String f117) {
        this.f117 = f117;
        notifyPropertyChanged(BR.f117);
    }

    @Bindable
    public String getF118() {
        return f118;
    }

    public void setF118(String f118) {
        this.f118 = f118;
        setF118mx(f118.equals("1") ? this.f118mx : ""); // for all skips, mention all skipped questions
        setF118dx(f118.equals("2") ? this.f118dx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f118);
    }

    @Bindable
    public String getF118mx() {
        return f118mx;
    }

    public void setF118mx(String f118mx) {
        this.f118mx = f118mx;
        notifyPropertyChanged(BR.f118mx);
    }

    @Bindable
    public String getF118dx() {
        return f118dx;
    }

    public void setF118dx(String f118dx) {
        this.f118dx = f118dx;
        notifyPropertyChanged(BR.f118dx);
    }

    @Bindable
    public String getF119() {
        return f119;
    }

    public void setF119(String f119) {
        this.f119 = f119;
        setF120(f119.equals("1") ? this.f120 : "");
        notifyPropertyChanged(BR.f119);
    }

    @Bindable
    public String getF120() {
        return f120;
    }

    public void setF120(String f120) {
        setF12001x(f120.equals("1") ? this.f12001x : "");
        this.f120 = f120;
        notifyPropertyChanged(BR.f120);
    }

    @Bindable
    public String getF12001x() {
        return f12001x;
    }

    public void setF12001x(String f12001x) {
        this.f12001x = f12001x;
        notifyPropertyChanged(BR.f12001x);
    }

    @Bindable
    public String getF121a() {
        return f121a;
    }

    public void setF121a(String f121a) {
        this.f121a = f121a;
        setF12101(f121a.equals("1") ? "" : this.f12101);
        setF121b(f121a.equals("1") ? "" : this.f121b);
        notifyPropertyChanged(BR.f121a);
    }

    @Bindable
    public String getF12101() {
        return f12101;
    }

    public void setF12101(String f12101) {
        this.f12101 = f12101;
        setF121b(f12101.equals("2") ? this.f121b : "");
        setF122(f12101.equals("1") ? this.f122 : "");
        setF12301(f12101.equals("1") ? this.f12301 : "");
        setF12302(f12101.equals("1") ? this.f12302 : "");
        setF12303(f12101.equals("1") ? this.f12303 : "");
        setF12304(f12101.equals("1") ? this.f12304 : "");
        setF12305(f12101.equals("1") ? this.f12305 : "");
        setF12306(f12101.equals("1") ? this.f12306 : "");
        setF12307(f12101.equals("1") ? this.f12307 : "");
        setF12308(f12101.equals("1") ? this.f12308 : "");
        setF12309(f12101.equals("1") ? this.f12309 : "");
        setF12310(f12101.equals("1") ? this.f12310 : "");
        setF12396(f12101.equals("1") ? this.f12396 : "");
        notifyPropertyChanged(BR.f12101);
    }

    @Bindable
    public String getF121b() {
        return f121b;
    }

    public void setF121b(String f121b) {
        this.f121b = f121b;
        setF121b96x(f121b.equals("96") ? this.f121b96x : "");
        notifyPropertyChanged(BR.f121b);
    }

    @Bindable
    public String getF121b96x() {
        return f121b96x;
    }

    public void setF121b96x(String f121b96x) {
        this.f121b96x = f121b96x;
        notifyPropertyChanged(BR.f121b96x);
    }

    @Bindable
    public String getF122() {
        return f122;
    }

    public void setF122(String f122) {
        this.f122 = f122;
        setF12201x(f122.equals("1") ? this.f12201x : "");
        notifyPropertyChanged(BR.f122);
    }

    @Bindable
    public String getF12201x() {
        return f12201x;
    }

    public void setF12201x(String f12201x) {
        this.f12201x = f12201x;
        notifyPropertyChanged(BR.f12201x);
    }

    @Bindable
    public String getF123() {
        return f123;
    }

    public void setF123(String f123) {
        this.f123 = f123;
        notifyPropertyChanged(BR.f123);
    }

    @Bindable
    public String getF12301() {
        return f12301;
    }

    public void setF12301(String f12301) {
        if (this.f12301.equals(f12301)) return;     // For all checkboxes
        this.f12301 = f12301;
        notifyPropertyChanged(BR.f12301);
    }

    @Bindable
    public String getF12302() {
        return f12302;
    }

    public void setF12302(String f12302) {
        if (this.f12302.equals(f12302)) return;     // For all checkboxes
        this.f12302 = f12302;
        notifyPropertyChanged(BR.f12302);
    }

    @Bindable
    public String getF12303() {
        return f12303;
    }

    public void setF12303(String f12303) {
        if (this.f12303.equals(f12303)) return;     // For all checkboxes
        this.f12303 = f12303;
        notifyPropertyChanged(BR.f12303);
    }

    @Bindable
    public String getF12304() {
        return f12304;
    }

    public void setF12304(String f12304) {
        if (this.f12304.equals(f12304)) return;     // For all checkboxes
        this.f12304 = f12304;
        notifyPropertyChanged(BR.f12304);
    }

    @Bindable
    public String getF12305() {
        return f12305;
    }

    public void setF12305(String f12305) {
        if (this.f12305.equals(f12305)) return;     // For all checkboxes
        this.f12305 = f12305;
        notifyPropertyChanged(BR.f12305);
    }

    @Bindable
    public String getF12306() {
        return f12306;
    }

    public void setF12306(String f12306) {
        if (this.f12306.equals(f12306)) return;     // For all checkboxes
        this.f12306 = f12306;
        notifyPropertyChanged(BR.f12306);
    }

    @Bindable
    public String getF12307() {
        return f12307;
    }

    public void setF12307(String f12307) {
        if (this.f12307.equals(f12307)) return;     // For all checkboxes
        this.f12307 = f12307;
        notifyPropertyChanged(BR.f12307);
    }

    @Bindable
    public String getF12308() {
        return f12308;
    }

    public void setF12308(String f12308) {
        if (this.f12308.equals(f12308)) return;     // For all checkboxes
        this.f12308 = f12308;
        notifyPropertyChanged(BR.f12308);
    }

    @Bindable
    public String getF12309() {
        return f12309;
    }

    public void setF12309(String f12309) {
        if (this.f12309.equals(f12309)) return;
        this.f12309 = f12309;
        notifyPropertyChanged(BR.f12309);
    }

    @Bindable
    public String getF12310() {
        return f12310;
    }

    public void setF12310(String f12310) {
        if (this.f12310.equals(f12310)) return;
        this.f12310 = f12310;
        notifyPropertyChanged(BR.f12310);
    }

    @Bindable
    public String getF12396() {
        return f12396;
    }

    public void setF12396(String f12396) {
        if (this.f12396.equals(f12396)) return;
        this.f12396 = f12396;
        setF12396x(f12396.equals("96") ? this.f12396x : "");
        notifyPropertyChanged(BR.f12396);
    }

    @Bindable
    public String getF12396x() {
        return f12396x;
    }

    public void setF12396x(String f12396x) {
        this.f12396x = f12396x;
        notifyPropertyChanged(BR.f12396x);
    }

    @Bindable
    public String getF124() {
        return f124;
    }

    public void setF124(String f124) {
        this.f124 = f124;
        setF12501(f124.equals("2") ? "" : this.f12501);
        setF12502(f124.equals("2") ? "" : this.f12502);
        setF12503(f124.equals("2") ? "" : this.f12503);
        setF12504(f124.equals("2") ? "" : this.f12504);
        setF12505(f124.equals("2") ? "" : this.f12505);
        setF12506(f124.equals("2") ? "" : this.f12506);
        setF12507(f124.equals("2") ? "" : this.f12507);

        setF12601(f124.equals("2") ? "" : this.f12601);
        setF12602(f124.equals("2") ? "" : this.f12602);
        setF12603(f124.equals("2") ? "" : this.f12603);
        setF12604(f124.equals("2") ? "" : this.f12604);
        setF12605(f124.equals("2") ? "" : this.f12605);
        setF12606(f124.equals("2") ? "" : this.f12606);
        setF12607(f124.equals("2") ? "" : this.f12607);
        setF12608(f124.equals("2") ? "" : this.f12608);

        setF127(f124.equals("2") ? "" : this.f127);
        notifyPropertyChanged(BR.f124);
    }

    @Bindable
    public String getF125() {
        return f125;
    }

    public void setF125(String f125) {
        this.f125 = f125;
        notifyPropertyChanged(BR.f125);
    }

    @Bindable
    public String getF12501() {
        return f12501;
    }

    public void setF12501(String f12501) {
        if (this.f12501.equals(f12501)) return;     // For all checkboxes
        this.f12501 = f12501;
        notifyPropertyChanged(BR.f12501);
    }

    @Bindable
    public String getF12502() {
        return f12502;
    }

    public void setF12502(String f12502) {
        if (this.f12502.equals(f12502)) return;     // For all checkboxes
        this.f12502 = f12502;
        notifyPropertyChanged(BR.f12502);
    }

    @Bindable
    public String getF12503() {
        return f12503;
    }

    public void setF12503(String f12503) {
        if (this.f12503.equals(f12503)) return;     // For all checkboxes
        this.f12503 = f12503;
        notifyPropertyChanged(BR.f12503);
    }

    @Bindable
    public String getF12504() {
        return f12504;
    }

    public void setF12504(String f12504) {
        if (this.f12504.equals(f12504)) return;     // For all checkboxes
        this.f12504 = f12504;
        notifyPropertyChanged(BR.f12504);
    }

    @Bindable
    public String getF12505() {
        return f12505;
    }

    public void setF12505(String f12505) {
        if (this.f12505.equals(f12505)) return;     // For all checkboxes
        this.f12505 = f12505;
        notifyPropertyChanged(BR.f12505);
    }

    @Bindable
    public String getF12506() {
        return f12506;
    }

    public void setF12506(String f12506) {
        if (this.f12506.equals(f12506)) return;     // For all checkboxes
        this.f12506 = f12506;
        notifyPropertyChanged(BR.f12506);
    }

    @Bindable
    public String getF12507() {
        return f12507;
    }

    public void setF12507(String f12507) {
        if (this.f12507.equals(f12507)) return;     // For all checkboxes
        this.f12507 = f12507;
        notifyPropertyChanged(BR.f12507);
    }

    @Bindable
    public String getF126() {
        return f126;
    }

    public void setF126(String f126) {
        this.f126 = f126;
        notifyPropertyChanged(BR.f126);
    }

    @Bindable
    public String getF12601() {
        return f12601;
    }

    public void setF12601(String f12601) {
        if (this.f12601.equals(f12601)) return;     // For all checkboxes
        this.f12601 = f12601;
        notifyPropertyChanged(BR.f12601);
    }

    @Bindable
    public String getF12602() {
        return f12602;
    }

    public void setF12602(String f12602) {
        if (this.f12602.equals(f12602)) return;     // For all checkboxes
        this.f12602 = f12602;
        notifyPropertyChanged(BR.f12602);
    }

    @Bindable
    public String getF12603() {
        return f12603;
    }

    public void setF12603(String f12603) {
        if (this.f12603.equals(f12603)) return;     // For all checkboxes
        this.f12603 = f12603;
        notifyPropertyChanged(BR.f12603);
    }

    @Bindable
    public String getF12604() {
        return f12604;
    }

    public void setF12604(String f12604) {
        if (this.f12604.equals(f12604)) return;     // For all checkboxes
        this.f12604 = f12604;
        notifyPropertyChanged(BR.f12604);
    }

    @Bindable
    public String getF12605() {
        return f12605;
    }

    public void setF12605(String f12605) {
        if (this.f12605.equals(f12605)) return;     // For all checkboxes
        this.f12605 = f12605;
        notifyPropertyChanged(BR.f12605);
    }

    @Bindable
    public String getF12606() {
        return f12606;
    }

    public void setF12606(String f12606) {
        if (this.f12606.equals(f12606)) return;     // For all checkboxes
        this.f12606 = f12606;
        notifyPropertyChanged(BR.f12606);
    }

    @Bindable
    public String getF12607() {
        return f12607;
    }

    public void setF12607(String f12607) {
        if (this.f12607.equals(f12607)) return;     // For all checkboxes
        this.f12607 = f12607;
        notifyPropertyChanged(BR.f12607);
    }

    @Bindable
    public String getF12608() {
        return f12608;
    }

    public void setF12608(String f12608) {
        if (this.f12608.equals(f12608)) return;     // For all checkboxes
        this.f12608 = f12608;
        notifyPropertyChanged(BR.f12608);
    }

    @Bindable
    public String getF127() {
        return f127;
    }

    public void setF127(String f127) {
        this.f127 = f127;
        setF12796x(this.f127.equals("96") ? this.f12796x : "");
        notifyPropertyChanged(BR.f127);
    }

    @Bindable
    public String getF12796x() {
        return f12796x;
    }

    public void setF12796x(String f12796x) {
        this.f12796x = f12796x;
        notifyPropertyChanged(BR.f12796x);
    }

    @Bindable
    public String getF128() {
        return f128;
    }

    public void setF128(String f128) {
        this.f128 = f128;
        notifyPropertyChanged(BR.f128);
    }

    @Bindable
    public String getF12801() {
        return f12801;
    }

    public void setF12801(String f12801) {
        if (this.f12801.equals(f12801)) return;
        this.f12801 = f12801;
        notifyPropertyChanged(BR.f12801);
    }

    @Bindable
    public String getF12802() {
        return f12802;
    }

    public void setF12802(String f12802) {
        if (this.f12802.equals(f12802)) return;
        this.f12802 = f12802;
        notifyPropertyChanged(BR.f12802);
    }

    @Bindable
    public String getF12803() {
        return f12803;
    }

    public void setF12803(String f12803) {
        if (this.f12803.equals(f12803)) return;
        this.f12803 = f12803;
        notifyPropertyChanged(BR.f12803);
    }

    @Bindable
    public String getF12804() {
        return f12804;
    }

    public void setF12804(String f12804) {
        if (this.f12804.equals(f12804)) return;
        this.f12804 = f12804;
        notifyPropertyChanged(BR.f12804);
    }

    @Bindable
    public String getF12805() {
        return f12805;
    }

    public void setF12805(String f12805) {
        if (this.f12805.equals(f12805)) return;
        this.f12805 = f12805;
        notifyPropertyChanged(BR.f12805);
    }

    @Bindable
    public String getF12806() {
        return f12806;
    }

    public void setF12806(String f12806) {
        if (this.f12806.equals(f12806)) return;
        this.f12806 = f12806;
        notifyPropertyChanged(BR.f12806);
    }

    @Bindable
    public String getF12807() {
        return f12807;
    }

    public void setF12807(String f12807) {
        if (this.f12807.equals(f12807)) return;
        this.f12807 = f12807;
        notifyPropertyChanged(BR.f12807);
    }

    @Bindable
    public String getF12808() {
        return f12808;
    }

    public void setF12808(String f12808) {
        if (this.f12808.equals(f12808)) return;     // For all checkboxes
        this.f12808 = f12808;
        setF12801(f12808.equals("8") ? "" : this.f12801);
        setF12802(f12808.equals("8") ? "" : this.f12802);
        setF12803(f12808.equals("8") ? "" : this.f12803);
        setF12804(f12808.equals("8") ? "" : this.f12804);
        setF12805(f12808.equals("8") ? "" : this.f12805);
        setF12806(f12808.equals("8") ? "" : this.f12806);
        setF12807(f12808.equals("8") ? "" : this.f12807);
        setF129(f12808.equals("8") ? "" : this.f129);
        setF13001(f12808.equals("8") ? "" : this.f13001);
        setF13002(f12808.equals("8") ? "" : this.f13002);
        setF13003(f12808.equals("8") ? "" : this.f13003);
        setF13004(f12808.equals("8") ? "" : this.f13004);
        setF13005(f12808.equals("8") ? "" : this.f13005);
        setF13006(f12808.equals("8") ? "" : this.f13006);
        setF13007(f12808.equals("8") ? "" : this.f13007);
        setF13008(f12808.equals("8") ? "" : this.f13008);
        setF13009(f12808.equals("8") ? "" : this.f13009);
        setF13010(f12808.equals("8") ? "" : this.f13010);
        setF13011(f12808.equals("8") ? "" : this.f13011);
        setF13012(f12808.equals("8") ? "" : this.f13012);
        setF13013(f12808.equals("8") ? "" : this.f13013);
        setF13014(f12808.equals("8") ? "" : this.f13014);
        setF13015(f12808.equals("8") ? "" : this.f13015);
        setF13096(f12808.equals("8") ? "" : this.f13096);
        setF131(f12808.equals("8") ? "" : this.f131);
        setF131a(f12808.equals("8") ? "" : this.f131a);
        notifyPropertyChanged(BR.f12808);
    }

    @Bindable
    public String getF129() {
        return f129;
    }

    public void setF129(String f129) {
        this.f129 = f129;
        setF13001(f129.equals("2") ? this.f13001 : "");
        setF13002(f129.equals("2") ? this.f13002 : "");
        setF13003(f129.equals("2") ? this.f13003 : "");
        setF13004(f129.equals("2") ? this.f13004 : "");
        setF13005(f129.equals("2") ? this.f13005 : "");
        setF13006(f129.equals("2") ? this.f13006 : "");
        setF13007(f129.equals("2") ? this.f13007 : "");
        setF13008(f129.equals("2") ? this.f13008 : "");
        setF13009(f129.equals("2") ? this.f13009 : "");
        setF13010(f129.equals("2") ? this.f13010 : "");
        setF13011(f129.equals("2") ? this.f13011 : "");
        setF13012(f129.equals("2") ? this.f13012 : "");
        setF13013(f129.equals("2") ? this.f13013 : "");
        setF13014(f129.equals("2") ? this.f13014 : "");
        setF13015(f129.equals("2") ? this.f13015 : "");
        setF13096(f129.equals("2") ? this.f13096 : "");
        setF131(f129.equals("1") ? this.f131 : "");
        setF131a(f129.equals("1") ? this.f131a : "");
        notifyPropertyChanged(BR.f129);
    }

    @Bindable
    public String getF130() {
        return f130;
    }

    public void setF130(String f130) {
        this.f130 = f130;
        notifyPropertyChanged(BR.f130);
    }

    @Bindable
    public String getF13001() {
        return f13001;
    }

    public void setF13001(String f13001) {
        if (this.f13001.equals(f13001)) return;     // For all checkboxes
        this.f13001 = f13001;
        notifyPropertyChanged(BR.f13001);
    }

    @Bindable
    public String getF13002() {
        return f13002;
    }

    public void setF13002(String f13002) {
        if (this.f13002.equals(f13002)) return;     // For all checkboxes
        this.f13002 = f13002;
        notifyPropertyChanged(BR.f13002);
    }

    @Bindable
    public String getF13003() {
        return f13003;
    }

    public void setF13003(String f13003) {
        if (this.f13003.equals(f13003)) return;     // For all checkboxes
        this.f13003 = f13003;
        notifyPropertyChanged(BR.f13003);
    }

    @Bindable
    public String getF13004() {
        return f13004;
    }

    public void setF13004(String f13004) {
        if (this.f13004.equals(f13004)) return;     // For all checkboxes
        this.f13004 = f13004;
        notifyPropertyChanged(BR.f13004);
    }

    @Bindable
    public String getF13005() {
        return f13005;
    }

    public void setF13005(String f13005) {
        if (this.f13005.equals(f13005)) return;     // For all checkboxes
        this.f13005 = f13005;
        notifyPropertyChanged(BR.f13005);
    }

    @Bindable
    public String getF13006() {
        return f13006;
    }

    public void setF13006(String f13006) {
        if (this.f13006.equals(f13006)) return;     // For all checkboxes
        this.f13006 = f13006;
        notifyPropertyChanged(BR.f13006);
    }

    @Bindable
    public String getF13007() {
        return f13007;
    }

    public void setF13007(String f13007) {
        if (this.f13007.equals(f13007)) return;     // For all checkboxes
        this.f13007 = f13007;
        notifyPropertyChanged(BR.f13007);
    }

    @Bindable
    public String getF13008() {
        return f13008;
    }

    public void setF13008(String f13008) {
        if (this.f13008.equals(f13008)) return;     // For all checkboxes
        this.f13008 = f13008;
        notifyPropertyChanged(BR.f13008);
    }

    @Bindable
    public String getF13009() {
        return f13009;
    }

    public void setF13009(String f13009) {
        if (this.f13009.equals(f13009)) return;     // For all checkboxes
        this.f13009 = f13009;
        notifyPropertyChanged(BR.f13009);
    }

    @Bindable
    public String getF13010() {
        return f13010;
    }

    public void setF13010(String f13010) {
        if (this.f13010.equals(f13010)) return;     // For all checkboxes
        this.f13010 = f13010;
        notifyPropertyChanged(BR.f13010);
    }

    @Bindable
    public String getF13011() {
        return f13011;
    }

    public void setF13011(String f13011) {
        if (this.f13011.equals(f13011)) return;     // For all checkboxes
        this.f13011 = f13011;
        notifyPropertyChanged(BR.f13011);
    }

    @Bindable
    public String getF13012() {
        return f13012;
    }

    public void setF13012(String f13012) {
        if (this.f13012.equals(f13012)) return;     // For all checkboxes
        this.f13012 = f13012;
        notifyPropertyChanged(BR.f13012);
    }

    @Bindable
    public String getF13013() {
        return f13013;
    }

    public void setF13013(String f13013) {
        if (this.f13013.equals(f13013)) return;     // For all checkboxes
        this.f13013 = f13013;
        notifyPropertyChanged(BR.f13013);
    }

    @Bindable
    public String getF13014() {
        return f13014;
    }

    public void setF13014(String f13014) {
        if (this.f13014.equals(f13014)) return;
        this.f13014 = f13014;
        notifyPropertyChanged(BR.f13014);
    }

    @Bindable
    public String getF13015() {
        return f13015;
    }

    public void setF13015(String f13015) {
        if (this.f13015.equals(f13015)) return;
        this.f13015 = f13015;
        notifyPropertyChanged(BR.f13015);
    }

    @Bindable
    public String getF13096() {
        return f13096;
    }

    public void setF13096(String f13096) {
        if (this.f13096.equals(f13096)) return;     // For all checkboxes
        this.f13096 = f13096;
        setF13096x(f13096.equals("96") ? this.f13096x : "");
        notifyPropertyChanged(BR.f13096);
    }

    @Bindable
    public String getF13096x() {
        return f13096x;
    }

    public void setF13096x(String f13096x) {
        this.f13096x = f13096x;
        notifyPropertyChanged(BR.f13096x);
    }

    @Bindable
    public String getF131() {
        return f131;
    }

    public void setF131(String f131) {
        this.f131 = f131;
        setF13196x(f131.equals("96") ? this.f13196x : "");
        notifyPropertyChanged(BR.f131);
    }

    @Bindable
    public String getF13196x() {
        return f13196x;
    }

    public void setF13196x(String f13196x) {
        this.f13196x = f13196x;
        notifyPropertyChanged(BR.f13196x);
    }

    @Bindable
    public String getF131a() {
        return f131a;
    }

    public void setF131a(String f131a) {
        this.f131a = f131a;
        notifyPropertyChanged(BR.f131a);
    }

    @Bindable
    public String getF134() {
        return f134;
    }

    public void setF134(String f134) {
        this.f134 = f134;
        notifyPropertyChanged(BR.f134);
    }

    @Bindable
    public String getF13401() {
        return f13401;
    }

    public void setF13401(String f13401) {
        if (this.f13401.equals(f13401)) return;     // For all checkboxes
        this.f13401 = f13401;
        notifyPropertyChanged(BR.f13401);
    }

    @Bindable
    public String getF13402() {
        return f13402;
    }

    public void setF13402(String f13402) {
        if (this.f13402.equals(f13402)) return;     // For all checkboxes
        this.f13402 = f13402;
        notifyPropertyChanged(BR.f13402);
    }

    @Bindable
    public String getF13403() {
        return f13403;
    }

    public void setF13403(String f13403) {
        if (this.f13403.equals(f13403)) return;     // For all checkboxes
        this.f13403 = f13403;
        notifyPropertyChanged(BR.f13403);
    }

    @Bindable
    public String getF13404() {
        return f13404;
    }

    public void setF13404(String f13404) {
        if (this.f13404.equals(f13404)) return;     // For all checkboxes
        this.f13404 = f13404;
        notifyPropertyChanged(BR.f13404);
    }

    @Bindable
    public String getF13405() {
        return f13405;
    }

    public void setF13405(String f13405) {
        if (this.f13405.equals(f13405)) return;     // For all checkboxes
        this.f13405 = f13405;
        notifyPropertyChanged(BR.f13405);
    }

    @Bindable
    public String getF13406() {
        return f13406;
    }

    public void setF13406(String f13406) {
        if (this.f13406.equals(f13406)) return;     // For all checkboxes
        this.f13406 = f13406;
        notifyPropertyChanged(BR.f13406);
    }

    @Bindable
    public String getF13407() {
        return f13407;
    }

    public void setF13407(String f13407) {
        if (this.f13407.equals(f13407)) return;
        this.f13407 = f13407;
        notifyPropertyChanged(BR.f13407);
    }

    @Bindable
    public String getF13408() {
        return f13408;
    }

    public void setF13408(String f13408) {
        if (this.f13408.equals(f13408)) return;
        this.f13408 = f13408;
        setF13401(f13408.equals("8") ? "" : this.f13401);
        setF13402(f13408.equals("8") ? "" : this.f13402);
        setF13403(f13408.equals("8") ? "" : this.f13403);
        setF13404(f13408.equals("8") ? "" : this.f13404);
        setF13405(f13408.equals("8") ? "" : this.f13405);
        setF13406(f13408.equals("8") ? "" : this.f13406);
        setF13407(f13408.equals("8") ? "" : this.f13407);
        setF13409(f13408.equals("8") ? "" : this.f13409);
        setF13410(f13408.equals("8") ? "" : this.f13410);
        notifyPropertyChanged(BR.f13408);
    }

    @Bindable
    public String getF13409() {
        return f13409;
    }

    public void setF13409(String f13409) {
        if (this.f13409.equals(f13409)) return;
        this.f13409 = f13409;
        setF13401(f13409.equals("9") ? "" : this.f13401);
        setF13402(f13409.equals("9") ? "" : this.f13402);
        setF13403(f13409.equals("9") ? "" : this.f13403);
        setF13404(f13409.equals("9") ? "" : this.f13404);
        setF13405(f13409.equals("9") ? "" : this.f13405);
        setF13406(f13409.equals("9") ? "" : this.f13406);
        setF13407(f13409.equals("9") ? "" : this.f13407);
        setF13408(f13409.equals("9") ? "" : this.f13408);
        setF13410(f13409.equals("9") ? "" : this.f13410);
        notifyPropertyChanged(BR.f13409);
    }

    @Bindable
    public String getF13410() {
        return f13410;
    }

    public void setF13410(String f13410) {
        if (this.f13410.equals(f13410)) return;
        this.f13410 = f13410;
        notifyPropertyChanged(BR.f13410);
    }

    @Bindable
    public String getG101() {
        return g101;
    }

    public void setG101(String g101) {
        this.g101 = g101;
        notifyPropertyChanged(BR.g101);
    }

    @Bindable
    public String getG102() {
        return g102;
    }

    public void setG102(String g102) {
        this.g102 = g102;
        setG10296x(g102.equals("96") ? this.g10296x : "");
        setG10301(g102.equals("1") ? "" : this.g10301);
        setG10302(g102.equals("1") ? "" : this.g10302);
        setG10303(g102.equals("1") ? "" : this.g10303);
        setG10304(g102.equals("1") ? "" : this.g10304);
        setG10305(g102.equals("1") ? "" : this.g10305);
        setG10306(g102.equals("1") ? "" : this.g10306);
        setG10307(g102.equals("1") ? "" : this.g10307);
        setG10308(g102.equals("1") ? "" : this.g10308);
        setG10309(g102.equals("1") ? "" : this.g10309);
        setG10310(g102.equals("1") ? "" : this.g10310);
        setG10311(g102.equals("1") ? "" : this.g10311);
        setG10312(g102.equals("1") ? "" : this.g10312);
        setG10313(g102.equals("1") ? "" : this.g10313);
        setG10314(g102.equals("1") ? "" : this.g10314);
        setG10396(g102.equals("1") ? "" : this.g10396);
        setG105(g102.equals("1") ? this.g105 : "");
        setG106(g102.equals("1") ? this.g106 : "");
        setG107(g102.equals("1") ? this.g107 : "");
        setH201(g102.equals("1") ? "" : this.h201);
        notifyPropertyChanged(BR.g102);
    }

    @Bindable
    public String getG10296x() {
        return g10296x;
    }

    public void setG10296x(String g10296x) {
        this.g10296x = g10296x;
        notifyPropertyChanged(BR.g10296x);
    }

    @Bindable
    public String getG103() {
        return g103;
    }

    public void setG103(String g103) {
        this.g103 = g103;
        notifyPropertyChanged(BR.g103);
    }

    @Bindable
    public String getG10301() {
        return g10301;
    }

    public void setG10301(String g10301) {
        if (this.g10301.equals(g10301)) return;     // For all checkboxes
        this.g10301 = g10301;
        notifyPropertyChanged(BR.g10301);
    }

    @Bindable
    public String getG10302() {
        return g10302;
    }

    public void setG10302(String g10302) {
        if (this.g10302.equals(g10302)) return;     // For all checkboxes
        this.g10302 = g10302;
        notifyPropertyChanged(BR.g10302);
    }

    @Bindable
    public String getG10303() {
        return g10303;
    }

    public void setG10303(String g10303) {
        if (this.g10303.equals(g10303)) return;     // For all checkboxes
        this.g10303 = g10303;
        notifyPropertyChanged(BR.g10303);
    }

    @Bindable
    public String getG10304() {
        return g10304;
    }

    public void setG10304(String g10304) {
        if (this.g10304.equals(g10304)) return;     // For all checkboxes
        this.g10304 = g10304;
        notifyPropertyChanged(BR.g10304);
    }

    @Bindable
    public String getG10305() {
        return g10305;
    }

    public void setG10305(String g10305) {
        if (this.g10305.equals(g10305)) return;     // For all checkboxes
        this.g10305 = g10305;
        notifyPropertyChanged(BR.g10305);
    }

    @Bindable
    public String getG10306() {
        return g10306;
    }

    public void setG10306(String g10306) {
        if (this.g10306.equals(g10306)) return;     // For all checkboxes
        this.g10306 = g10306;
        notifyPropertyChanged(BR.g10306);
    }

    @Bindable
    public String getG10307() {
        return g10307;
    }

    public void setG10307(String g10307) {
        if (this.g10307.equals(g10307)) return;     // For all checkboxes
        this.g10307 = g10307;
        notifyPropertyChanged(BR.g10307);
    }

    @Bindable
    public String getG10308() {
        return g10308;
    }

    public void setG10308(String g10308) {
        if (this.g10308.equals(g10308)) return;     // For all checkboxes
        this.g10308 = g10308;
        notifyPropertyChanged(BR.g10308);
    }

    @Bindable
    public String getG10309() {
        return g10309;
    }

    public void setG10309(String g10309) {
        if (this.g10309.equals(g10309)) return;     // For all checkboxes
        this.g10309 = g10309;
        notifyPropertyChanged(BR.g10309);
    }

    @Bindable
    public String getG10310() {
        return g10310;
    }

    public void setG10310(String g10310) {
        if (this.g10310.equals(g10310)) return;     // For all checkboxes
        this.g10310 = g10310;
        notifyPropertyChanged(BR.g10310);
    }

    @Bindable
    public String getG10311() {
        return g10311;
    }

    public void setG10311(String g10311) {
        if (this.g10311.equals(g10311)) return;     // For all checkboxes
        this.g10311 = g10311;
        notifyPropertyChanged(BR.g10311);
    }

    @Bindable
    public String getG10312() {
        return g10312;
    }

    public void setG10312(String g10312) {
        if (this.g10312.equals(g10312)) return;     // For all checkboxes
        this.g10312 = g10312;
        notifyPropertyChanged(BR.g10312);
    }

    @Bindable
    public String getG10313() {
        return g10313;
    }

    public void setG10313(String g10313) {
        if (this.g10313.equals(g10313)) return;     // For all checkboxes
        this.g10313 = g10313;
        notifyPropertyChanged(BR.g10313);
    }

    @Bindable
    public String getG10314() {
        return g10314;
    }

    public void setG10314(String g10314) {
        if (this.g10314.equals(g10314)) return;
        this.g10314 = g10314;
        notifyPropertyChanged(BR.g10314);
    }

    @Bindable
    public String getG10315() {
        return g10315;
    }

    public void setG10315(String g10315) {
        if (this.g10315.equals(g10315)) return;
        this.g10315 = g10315;
        notifyPropertyChanged(BR.g10315);
    }

    @Bindable
    public String getG10396() {
        return g10396;
    }

    public void setG10396(String g10396) {
        if (this.g10396.equals(g10396)) return;     // For all checkboxes
        this.g10396 = g10396;
        setG10396x(g10396.equals("96") ? this.g10396x : "");
        notifyPropertyChanged(BR.g10396);
    }

    @Bindable
    public String getG10396x() {
        return g10396x;
    }

    public void setG10396x(String g10396x) {
        this.g10396x = g10396x;
        notifyPropertyChanged(BR.g10396x);
    }

    @Bindable
    public String getG104() {
        return g104;
    }

    public void setG104(String g104) {
        this.g104 = g104;
        setG10496x(g104.equals("96") ? this.g10496x : "");
        notifyPropertyChanged(BR.g104);
    }

    @Bindable
    public String getG10496x() {
        return g10496x;
    }

    public void setG10496x(String g10496x) {
        this.g10496x = g10496x;
        notifyPropertyChanged(BR.g10496x);
    }

    @Bindable
    public String getG105() {
        return g105;
    }

    public void setG105(String g105) {
        this.g105 = g105;
        setG10501x(g105.equals("1") ? this.g10501x : "");
        notifyPropertyChanged(BR.g105);
    }

    @Bindable
    public String getG10501x() {
        return g10501x;
    }

    public void setG10501x(String g10501x) {
        this.g10501x = g10501x;
        notifyPropertyChanged(BR.g10501x);
    }

    @Bindable
    public String getG106() {
        return g106;
    }

    public void setG106(String g106) {
        this.g106 = g106;
        notifyPropertyChanged(BR.g106);
    }

    @Bindable
    public String getG107() {
        return g107;
    }

    public void setG107(String g107) {
        this.g107 = g107;
        setG10701x(g107.equals("1") ? this.g10701x : "");
        notifyPropertyChanged(BR.g107);
    }

    @Bindable
    public String getG10701x() {
        return g10701x;
    }

    public void setG10701x(String g10701x) {
        this.g10701x = g10701x;
        notifyPropertyChanged(BR.g10701x);
    }

    @Bindable
    public String getG108() {
        return g108;
    }

    public void setG108(String g108) {
        this.g108 = g108;
        notifyPropertyChanged(BR.g108);
    }

    @Bindable
    public String getG109() {
        return g109;
    }

    public void setG109(String g109) {
        this.g109 = g109;
        notifyPropertyChanged(BR.g109);
    }

    @Bindable
    public String getG110() {
        return g110;
    }

    public void setG110(String g110) {
        this.g110 = g110;
        setG126(g110.equals("1") ? this.g126 : "");
        notifyPropertyChanged(BR.g110);
    }

    @Bindable
    public String getG126() {
        return g126;
    }

    public void setG126(String g126) {
        this.g126 = g126;
        setG127(g126.equals("1") ? this.g127 : "");
        notifyPropertyChanged(BR.g126);
    }

    @Bindable
    public String getG127() {
        return g127;
    }

    public void setG127(String g127) {
        this.g127 = g127;
        notifyPropertyChanged(BR.g127);
    }

    @Bindable
    public String getG113() {
        return g113;
    }

    public void setG113(String g113) {
        this.g113 = g113;
        setG114(g113.equals("1") ? this.g114 : "");
        setG115(g113.equals("1") ? this.g115 : "");
        setG116(g113.equals("1") ? this.g116 : "");
        notifyPropertyChanged(BR.g113);
    }

    @Bindable
    public String getG114() {
        return g114;
    }

    public void setG114(String g114) {
        this.g114 = g114;
        setG11496x(g114.equals("96") ? this.g11496x : "");
        notifyPropertyChanged(BR.g114);
    }

    @Bindable
    public String getG11496x() {
        return g11496x;
    }

    public void setG11496x(String g11496x) {
        this.g11496x = g11496x;
        notifyPropertyChanged(BR.g11496x);
    }

    @Bindable
    public String getG115() {
        return g115;
    }

    public void setG115(String g115) {
        this.g115 = g115;
        setG116(g115.equals("1") ? this.g116 : "");
        notifyPropertyChanged(BR.g115);
    }

    @Bindable
    public String getG116() {
        return g116;
    }

    public void setG116(String g116) {
        this.g116 = g116;
        notifyPropertyChanged(BR.g116);
    }

    @Bindable
    public String getG117() {
        return g117;
    }

    public void setG117(String g117) {
        this.g117 = g117;
        setG117hx(g117.equals("1") ? this.g117hx : "");
        setG117mx(g117.equals("2") ? this.g117mx : "");
        setG117dx(g117.equals("3") ? this.g117dx : "");
        notifyPropertyChanged(BR.g117);
    }

    @Bindable
    public String getG117hx() {
        return g117hx;
    }

    public void setG117hx(String g117hx) {
        this.g117hx = g117hx;
        notifyPropertyChanged(BR.g117hx);
    }

    @Bindable
    public String getG117mx() {
        return g117mx;
    }

    public void setG117mx(String g117mx) {
        this.g117mx = g117mx;
        notifyPropertyChanged(BR.g117mx);
    }

    @Bindable
    public String getG117dx() {
        return g117dx;
    }

    public void setG117dx(String g117dx) {
        this.g117dx = g117dx;
        notifyPropertyChanged(BR.g117dx);
    }

    @Bindable
    public String getG118() {
        return g118;
    }

    public void setG118(String g118) {
        this.g118 = g118;
        notifyPropertyChanged(BR.g118);
    }

    @Bindable
    public String getG11801() {
        return g11801;
    }

    public void setG11801(String g11801) {
        if (this.g11801.equals(g11801)) return;     // For all checkboxes
        this.g11801 = g11801;
        setG11801x(g11801.equals("1") ? this.g11801x : "");
        notifyPropertyChanged(BR.g11801);
    }

    @Bindable
    public String getG11801x() {
        return g11801x;
    }

    public void setG11801x(String g11801x) {
        this.g11801x = g11801x;
        notifyPropertyChanged(BR.g11801x);
    }

    @Bindable
    public String getG11802() {
        return g11802;
    }

    public void setG11802(String g11802) {
        if (this.g11802.equals(g11802)) return;     // For all checkboxes
        this.g11802 = g11802;
        setG11802x(g11802.equals("2") ? this.g11802x : "");
        notifyPropertyChanged(BR.g11802);
    }

    @Bindable
    public String getG11802x() {
        return g11802x;
    }

    public void setG11802x(String g11802x) {

        this.g11802x = g11802x;
        notifyPropertyChanged(BR.g11802x);
    }

    @Bindable
    public String getG11803() {
        return g11803;
    }

    public void setG11803(String g11803) {
        if (this.g11803.equals(g11803)) return;     // For all checkboxes
        this.g11803 = g11803;
        setG11803x(g11803.equals("3") ? this.g11803x : "");
        notifyPropertyChanged(BR.g11803);
    }

    @Bindable
    public String getG11803x() {
        return g11803x;
    }

    public void setG11803x(String g11803x) {
        this.g11803x = g11803x;
        notifyPropertyChanged(BR.g11803x);
    }

    @Bindable
    public String getG11804() {
        return g11804;
    }

    public void setG11804(String g11804) {
        setG11804x(g11804.equals("4") ? this.g11804x : "");
        this.g11804 = g11804;
        notifyPropertyChanged(BR.g11804);
    }

    @Bindable
    public String getG11804x() {
        return g11804x;
    }

    public void setG11804x(String g11804x) {
        this.g11804x = g11804x;
        notifyPropertyChanged(BR.g11804x);
    }

    @Bindable
    public String getG11896() {
        return g11896;
    }

    public void setG11896(String g11896) {
        this.g11896 = g11896;
        setG11896x(g11896.equals("96") ? this.g11896x : "");
        notifyPropertyChanged(BR.g11896);
    }

    @Bindable
    public String getG11896x() {
        return g11896x;
    }

    public void setG11896x(String g11896x) {
        this.g11896x = g11896x;
        notifyPropertyChanged(BR.g11896x);
    }

    @Bindable
    public String getG11898() {
        return g11898;
    }

    public void setG11898(String g11898) {
        if (this.g11898.equals(g11898)) return;     // For all checkboxes
        this.g11898 = g11898;

        setG11801(g11898.equals("98") ? "" : this.g11801);
        setG11802(g11898.equals("98") ? "" : this.g11802);
        setG11803(g11898.equals("98") ? "" : this.g11803);
        setG11804(g11898.equals("98") ? "" : this.g11804);
        setG11896(g11898.equals("98") ? "" : this.g11896);

        notifyPropertyChanged(BR.g11898);
    }

    @Bindable
    public String getG119() {
        return g119;
    }

    public void setG119(String g119) {
        this.g119 = g119;
        setG120(g119.equals("1") ? this.g120 : "");
        setG121(g119.equals("2") || g119.equals("3") ? this.g121 : "");
        notifyPropertyChanged(BR.g119);
    }

    @Bindable
    public String getG120() {
        return g120;
    }

    public void setG120(String g120) {
        this.g120 = g120;
        setG12096x(g120.equals("96") ? this.g12096x : "");
        notifyPropertyChanged(BR.g120);
    }

    @Bindable
    public String getG12096x() {
        return g12096x;
    }

    public void setG12096x(String g12096x) {
        this.g12096x = g12096x;
        notifyPropertyChanged(BR.g12096x);
    }

    @Bindable
    public String getG121() {
        return g121;
    }

    public void setG121(String g121) {
        this.g121 = g121;
        setG12196x(g121.equals("96") ? this.g12196x : "");
        notifyPropertyChanged(BR.g121);
    }

    @Bindable
    public String getG12196x() {
        return g12196x;
    }

    public void setG12196x(String g12196x) {
        this.g12196x = g12196x;
        notifyPropertyChanged(BR.g12196x);
    }

    @Bindable
    public String getG122() {
        return g122;
    }

    public void setG122(String g122) {
        this.g122 = g122;
        setG12301(g122.equals("1") ? this.g12301 : "");
        setG12302(g122.equals("1") ? this.g12302 : "");
        setG12303(g122.equals("1") ? this.g12303 : "");
        setG12304(g122.equals("1") ? this.g12304 : "");
        setG12305(g122.equals("1") ? this.g12305 : "");
        setG12306(g122.equals("1") ? this.g12306 : "");
        setG12307(g122.equals("1") ? this.g12307 : "");
        setG12308(g122.equals("1") ? this.g12308 : "");

        setG1241(g122.equals("1") ? this.g1241 : "");
        setG1242(g122.equals("1") ? this.g1242 : "");
        setG1243(g122.equals("1") ? this.g1243 : "");
        setG1244(g122.equals("1") ? this.g1244 : "");
        setG1245(g122.equals("1") ? this.g1245 : "");
        setG1246(g122.equals("1") ? this.g1246 : "");
        setG1247(g122.equals("1") ? this.g1247 : "");
        setG1248(g122.equals("1") ? this.g1248 : "");
        setG1249(g122.equals("1") ? this.g1249 : "");
        setG12410(g122.equals("1") ? this.g12410 : "");
        setG12411(g122.equals("1") ? this.g12411 : "");
        setG12412(g122.equals("1") ? this.g12412 : "");
        setG12413(g122.equals("1") ? this.g12413 : "");
        notifyPropertyChanged(BR.g122);
    }

    @Bindable
    public String getG123() {
        return g123;
    }

    public void setG123(String g123) {
        this.g123 = g123;
        notifyPropertyChanged(BR.g123);
    }

    @Bindable
    public String getG12301() {
        return g12301;
    }

    public void setG12301(String g12301) {
        if (this.g12301.equals(g12301)) return;     // For all checkboxes
        this.g12301 = g12301;
        notifyPropertyChanged(BR.g12301);
    }

    @Bindable
    public String getG12302() {
        return g12302;
    }

    public void setG12302(String g12302) {
        if (this.g12302.equals(g12302)) return;     // For all checkboxes
        this.g12302 = g12302;
        notifyPropertyChanged(BR.g12302);
    }

    @Bindable
    public String getG12303() {
        return g12303;
    }

    public void setG12303(String g12303) {
        if (this.g12303.equals(g12303)) return;     // For all checkboxes
        this.g12303 = g12303;
        notifyPropertyChanged(BR.g12303);
    }

    @Bindable
    public String getG12304() {
        return g12304;
    }

    public void setG12304(String g12304) {
        if (this.g12304.equals(g12304)) return;     // For all checkboxes
        this.g12304 = g12304;
        notifyPropertyChanged(BR.g12304);
    }

    @Bindable
    public String getG12305() {
        return g12305;
    }

    public void setG12305(String g12305) {
        if (this.g12305.equals(g12305)) return;     // For all checkboxes
        this.g12305 = g12305;
        notifyPropertyChanged(BR.g12305);
    }

    @Bindable
    public String getG12306() {
        return g12306;
    }

    public void setG12306(String g12306) {
        if (this.g12306.equals(g12306)) return;     // For all checkboxes
        this.g12306 = g12306;
        notifyPropertyChanged(BR.g12306);
    }

    @Bindable
    public String getG12307() {
        return g12307;
    }

    public void setG12307(String g12307) {
        if (this.g12307.equals(g12307)) return;     // For all checkboxes
        this.g12307 = g12307;
        notifyPropertyChanged(BR.g12307);
    }

    @Bindable
    public String getG12308() {
        return g12308;
    }

    public void setG12308(String g12308) {
        if (this.g12308.equals(g12308)) return;     // For all checkboxes
        this.g12308 = g12308;
        notifyPropertyChanged(BR.g12308);
    }

    @Bindable
    public String getG124() {
        return g124;
    }

    public void setG124(String g124) {
        this.g124 = g124;
        notifyPropertyChanged(BR.g124);
    }

    @Bindable
    public String getG1241() {
        return g1241;
    }

    public void setG1241(String g1241) {
        if (this.g1241.equals(g1241)) return;     // For all checkboxes
        this.g1241 = g1241;
        notifyPropertyChanged(BR.g1241);
    }

    @Bindable
    public String getG1242() {
        return g1242;
    }

    public void setG1242(String g1242) {
        if (this.g1242.equals(g1242)) return;     // For all checkboxes
        this.g1242 = g1242;
        notifyPropertyChanged(BR.g1242);
    }

    @Bindable
    public String getG1243() {
        return g1243;
    }

    public void setG1243(String g1243) {
        if (this.g1243.equals(g1243)) return;     // For all checkboxes
        this.g1243 = g1243;
        notifyPropertyChanged(BR.g1243);
    }

    @Bindable
    public String getG1244() {
        return g1244;
    }

    public void setG1244(String g1244) {
        if (this.g1244.equals(g1244)) return;     // For all checkboxes
        this.g1244 = g1244;
        notifyPropertyChanged(BR.g1244);
    }

    @Bindable
    public String getG1245() {
        return g1245;
    }

    public void setG1245(String g1245) {
        if (this.g1245.equals(g1245)) return;     // For all checkboxes
        this.g1245 = g1245;
        notifyPropertyChanged(BR.g1245);
    }

    @Bindable
    public String getG1246() {
        return g1246;
    }

    public void setG1246(String g1246) {
        if (this.g1246.equals(g1246)) return;     // For all checkboxes
        this.g1246 = g1246;
        notifyPropertyChanged(BR.g1246);
    }

    @Bindable
    public String getG1247() {
        return g1247;
    }

    public void setG1247(String g1247) {
        if (this.g1247.equals(g1247)) return;     // For all checkboxes
        this.g1247 = g1247;
        notifyPropertyChanged(BR.g1247);
    }

    @Bindable
    public String getG1248() {
        return g1248;
    }

    public void setG1248(String g1248) {
        if (this.g1248.equals(g1248)) return;     // For all checkboxes
        this.g1248 = g1248;
        notifyPropertyChanged(BR.g1248);
    }

    @Bindable
    public String getG1249() {
        return g1249;
    }

    public void setG1249(String g1249) {
        if (this.g1249.equals(g1249)) return;     // For all checkboxes
        this.g1249 = g1249;
        notifyPropertyChanged(BR.g1249);
    }

    @Bindable
    public String getG12410() {
        return g12410;
    }

    public void setG12410(String g12410) {
        if (this.g12410.equals(g12410)) return;     // For all checkboxes
        this.g12410 = g12410;
        notifyPropertyChanged(BR.g12410);
    }

    @Bindable
    public String getG12411() {
        return g12411;
    }

    public void setG12411(String g12411) {
        if (this.g12411.equals(g12411)) return;     // For all checkboxes
        this.g12411 = g12411;
        notifyPropertyChanged(BR.g12411);
    }

    @Bindable
    public String getG12412() {
        return g12412;
    }

    public void setG12412(String g12412) {
        if (this.g12412.equals(g12412)) return;     // For all checkboxes
        this.g12412 = g12412;
        notifyPropertyChanged(BR.g12412);
    }

    @Bindable
    public String getG12413() {
        return g12413;
    }

    public void setG12413(String g12413) {
        if (this.g12413.equals(g12413)) return;     // For all checkboxes
        this.g12413 = g12413;
        notifyPropertyChanged(BR.g12413);
    }

    @Bindable
    public String getG12401() {
        return g12401;
    }

    public void setG12401(String g12401) {
        this.g12401 = g12401;
        notifyPropertyChanged(BR.g12401);
    }

    @Bindable
    public String getG1240101() {
        return g1240101;
    }

    public void setG1240101(String g1240101) {
        if (this.g1240101.equals(g1240101)) return;     // For all checkboxes
        this.g1240101 = g1240101;
        notifyPropertyChanged(BR.g1240101);
    }

    @Bindable
    public String getG1240102() {
        return g1240102;
    }

    public void setG1240102(String g1240102) {
        if (this.g1240102.equals(g1240102)) return;     // For all checkboxes
        this.g1240102 = g1240102;
        notifyPropertyChanged(BR.g1240102);
    }

    @Bindable
    public String getG1240103() {
        return g1240103;
    }

    public void setG1240103(String g1240103) {
        if (this.g1240103.equals(g1240103)) return;     // For all checkboxes
        this.g1240103 = g1240103;
        notifyPropertyChanged(BR.g1240103);
    }

    @Bindable
    public String getG1240104() {
        return g1240104;
    }

    public void setG1240104(String g1240104) {
        if (this.g1240104.equals(g1240104)) return;     // For all checkboxes
        this.g1240104 = g1240104;
        notifyPropertyChanged(BR.g1240104);
    }

    @Bindable
    public String getG1240105() {
        return g1240105;
    }

    public void setG1240105(String g1240105) {
        if (this.g1240105.equals(g1240105)) return;     // For all checkboxes
        this.g1240105 = g1240105;
        notifyPropertyChanged(BR.g1240105);
    }

    @Bindable
    public String getG1240106() {
        return g1240106;
    }

    public void setG1240106(String g1240106) {
        if (this.g1240106.equals(g1240106)) return;     // For all checkboxes
        this.g1240106 = g1240106;
        notifyPropertyChanged(BR.g1240106);
    }

    @Bindable
    public String getG1240107() {
        return g1240107;
    }

    public void setG1240107(String g1240107) {
        if (this.g1240107.equals(g1240107)) return;     // For all checkboxes
        this.g1240107 = g1240107;
        notifyPropertyChanged(BR.g1240107);
    }

    @Bindable
    public String getG1240108() {
        return g1240108;
    }

    public void setG1240108(String g1240108) {
        if (this.g1240108.equals(g1240108)) return;     // For all checkboxes
        this.g1240108 = g1240108;
        notifyPropertyChanged(BR.g1240108);
    }

    @Bindable
    public String getG1240109() {
        return g1240109;
    }

    public void setG1240109(String g1240109) {
        if (this.g1240109.equals(g1240109)) return;     // For all checkboxes
        this.g1240109 = g1240109;
        notifyPropertyChanged(BR.g1240109);
    }

    @Bindable
    public String getG1240110() {
        return g1240110;
    }

    public void setG1240110(String g1240110) {
        if (this.g1240110.equals(g1240110)) return;     // For all checkboxes
        this.g1240110 = g1240110;
        notifyPropertyChanged(BR.g1240110);
    }

    @Bindable
    public String getG1240111() {
        return g1240111;
    }

    public void setG1240111(String g1240111) {
        if (this.g1240111.equals(g1240111)) return;     // For all checkboxes
        this.g1240111 = g1240111;
        notifyPropertyChanged(BR.g1240111);
    }

    @Bindable
    public String getG1240112() {
        return g1240112;
    }

    public void setG1240112(String g1240112) {
        if (this.g1240112.equals(g1240112)) return;     // For all checkboxes
        this.g1240112 = g1240112;
        notifyPropertyChanged(BR.g1240112);
    }

    @Bindable
    public String getG1240113() {
        return g1240113;
    }

    public void setG1240113(String g1240113) {
        if (this.g1240113.equals(g1240113)) return;     // For all checkboxes
        this.g1240113 = g1240113;
        notifyPropertyChanged(BR.g1240113);
    }

    @Bindable
    public String getG1240114() {
        return g1240114;
    }

    public void setG1240114(String g1240114) {
        if (this.g1240114.equals(g1240114)) return;
        this.g1240114 = g1240114;
        setG1240101(g1240114.equals("14") ? "" : this.g1240101);
        setG1240102(g1240114.equals("14") ? "" : this.g1240102);
        setG1240103(g1240114.equals("14") ? "" : this.g1240103);
        setG1240104(g1240114.equals("14") ? "" : this.g1240104);
        setG1240105(g1240114.equals("14") ? "" : this.g1240105);
        setG1240106(g1240114.equals("14") ? "" : this.g1240106);
        setG1240107(g1240114.equals("14") ? "" : this.g1240107);
        setG1240108(g1240114.equals("14") ? "" : this.g1240108);
        setG1240109(g1240114.equals("14") ? "" : this.g1240109);
        setG1240110(g1240114.equals("14") ? "" : this.g1240110);
        setG1240111(g1240114.equals("14") ? "" : this.g1240111);
        setG1240112(g1240114.equals("14") ? "" : this.g1240112);
        setG1240113(g1240114.equals("14") ? "" : this.g1240113);
        setG12402(g1240114.equals("14") ? "" : this.g12402);
        notifyPropertyChanged(BR.g1240114);
    }


    @Bindable
    public String getG12402() {
        return g12402;
    }

    public void setG12402(String g12402) {
        this.g12402 = g12402;
        setG1240296x(g12402.equals("96") ? this.g1240296x : "");
        notifyPropertyChanged(BR.g12402);
    }


    @Bindable
    public String getG1240296x() {
        return g1240296x;
    }

    public void setG1240296x(String g1240296x) {
        this.g1240296x = g1240296x;
        notifyPropertyChanged(BR.g1240296x);
    }


    @Bindable
    public String getG125() {
        return g125;
    }

    public void setG125(String g125) {
        this.g125 = g125;
        setG1250101(g125.equals("2") || g125.equals("3") ? this.g1250101 : "");
        setG1250102(g125.equals("2") || g125.equals("3") ? this.g1250102 : "");
        setG1250103(g125.equals("2") || g125.equals("3") ? this.g1250103 : "");
        setG1250104(g125.equals("2") || g125.equals("3") ? this.g1250104 : "");
        setG1250105(g125.equals("2") || g125.equals("3") ? this.g1250105 : "");
        setG1250106(g125.equals("2") || g125.equals("3") ? this.g1250106 : "");
        setG1250107(g125.equals("2") || g125.equals("3") ? this.g1250107 : "");
        setG1250108(g125.equals("2") || g125.equals("3") ? this.g1250108 : "");
        notifyPropertyChanged(BR.g125);
    }

    @Bindable
    public String getG12501() {
        return g12501;
    }

    public void setG12501(String g12501) {
        this.g12501 = g12501;
        notifyPropertyChanged(BR.g12501);
    }

    @Bindable
    public String getG1250101() {
        return g1250101;
    }

    public void setG1250101(String g1250101) {
        if (this.g1250101.equals(g1250101)) return;     // For all checkboxes
        this.g1250101 = g1250101;
        notifyPropertyChanged(BR.g1250101);
    }

    @Bindable
    public String getG1250102() {
        return g1250102;
    }

    public void setG1250102(String g1250102) {
        if (this.g1250102.equals(g1250102)) return;     // For all checkboxes
        this.g1250102 = g1250102;
        notifyPropertyChanged(BR.g1250102);
    }

    @Bindable
    public String getG1250103() {
        return g1250103;
    }

    public void setG1250103(String g1250103) {
        if (this.g1250103.equals(g1250103)) return;     // For all checkboxes
        this.g1250103 = g1250103;
        notifyPropertyChanged(BR.g1250103);
    }

    @Bindable
    public String getG1250104() {
        return g1250104;
    }

    public void setG1250104(String g1250104) {
        if (this.g1250104.equals(g1250104)) return;     // For all checkboxes
        this.g1250104 = g1250104;
        notifyPropertyChanged(BR.g1250104);
    }

    @Bindable
    public String getG1250105() {
        return g1250105;
    }

    public void setG1250105(String g1250105) {
        if (this.g1250105.equals(g1250105)) return;     // For all checkboxes
        this.g1250105 = g1250105;
        notifyPropertyChanged(BR.g1250105);
    }

    @Bindable
    public String getG1250106() {
        return g1250106;
    }

    public void setG1250106(String g1250106) {
        if (this.g1250106.equals(g1250106)) return;     // For all checkboxes
        this.g1250106 = g1250106;
        notifyPropertyChanged(BR.g1250106);
    }

    @Bindable
    public String getG1250107() {
        return g1250107;
    }

    public void setG1250107(String g1250107) {
        if (this.g1250107.equals(g1250107)) return;     // For all checkboxes
        this.g1250107 = g1250107;
        notifyPropertyChanged(BR.g1250107);
    }

    @Bindable
    public String getG1250108() {
        return g1250108;
    }

    public void setG1250108(String g1250108) {
        if (this.g1250108.equals(g1250108)) return;     // For all checkboxes
        this.g1250108 = g1250108;
        setG1250101(g1250108.equals("8") ? "" : this.g1250101);
        setG1250102(g1250108.equals("8") ? "" : this.g1250102);
        setG1250103(g1250108.equals("8") ? "" : this.g1250103);
        setG1250104(g1250108.equals("8") ? "" : this.g1250104);
        setG1250105(g1250108.equals("8") ? "" : this.g1250105);
        setG1250106(g1250108.equals("8") ? "" : this.g1250106);
        setG1250107(g1250108.equals("8") ? "" : this.g1250107);
        notifyPropertyChanged(BR.g1250108);
    }


    @Bindable
    public String getG128() {
        return g128;
    }

    public void setG128(String g128) {
        this.g128 = g128;
        notifyPropertyChanged(BR.g128);
    }

    @Bindable
    public String getG129() {
        return g129;
    }

    public void setG129(String g129) {
        this.g129 = g129;
        notifyPropertyChanged(BR.g129);
    }

    @Bindable
    public String getG130() {
        return g130;
    }

    public void setG130(String g130) {
        this.g130 = g130;
        notifyPropertyChanged(BR.g130);
    }

    @Bindable
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        setH101mx(h101.equals("1") ? this.h101mx : "");
        setH101wx(h101.equals("2") ? this.h101wx : "");
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH101mx() {
        return h101mx;
    }

    public void setH101mx(String h101mx) {
        this.h101mx = h101mx;
        notifyPropertyChanged(BR.h101mx);
    }

    @Bindable
    public String getH101wx() {
        return h101wx;
    }

    public void setH101wx(String h101wx) {
        this.h101wx = h101wx;
        notifyPropertyChanged(BR.h101wx);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        setH103(h102.equals("1") ? "" : this.h103);
        setH10401(h102.equals("1") ? "" : this.h10401);
        setH10402(h102.equals("1") ? "" : this.h10402);
        setH10403(h102.equals("1") ? "" : this.h10403);
        setH10496(h102.equals("1") ? "" : this.h10496);
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        setH10401(h103.equals("1") ? this.h10401 : "");
        setH10402(h103.equals("1") ? this.h10402 : "");
        setH10403(h103.equals("1") ? this.h10403 : "");
        setH10496(h103.equals("1") ? this.h10496 : "");
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH10401() {
        return h10401;
    }

    public void setH10401(String h10401) {
        if (this.h10401.equals(h10401)) return;
        this.h10401 = h10401;
        notifyPropertyChanged(BR.h10401);
    }

    @Bindable
    public String getH10402() {
        return h10402;
    }

    public void setH10402(String h10402) {
        if (this.h10402.equals(h10402)) return;
        this.h10402 = h10402;
        notifyPropertyChanged(BR.h10402);
    }

    @Bindable
    public String getH10403() {
        return h10403;
    }

    public void setH10403(String h10403) {
        if (this.h10403.equals(h10403)) return;
        this.h10403 = h10403;
        notifyPropertyChanged(BR.h10403);
    }

    @Bindable
    public String getH10496() {
        return h10496;
    }

    public void setH10496(String h10496) {
        if (this.h10496.equals(h10496)) return;
        this.h10496 = h10496;
        setH10496x(h10496.equals("96") ? this.h10496x : "");
        notifyPropertyChanged(BR.h10496);
    }

    @Bindable
    public String getH10496x() {
        return h10496x;
    }

    public void setH10496x(String h10496x) {
        this.h10496x = h10496x;
        notifyPropertyChanged(BR.h10496x);
    }

    @Bindable
    public String getH105() {
        return h105;
    }

    public void setH105(String h105) {
        this.h105 = h105;
        setH106(h105.equals("1") ? this.h106 : "");
        setH107(h105.equals("1") ? this.h107 : "");
        notifyPropertyChanged(BR.h105);
    }

    @Bindable
    public String getH106() {
        return h106;
    }

    public void setH106(String h106) {
        this.h106 = h106;
        setH1061x(h106.equals("1") ? this.h1061x : "");
        notifyPropertyChanged(BR.h106);
    }

    @Bindable
    public String getH1061x() {
        return h1061x;
    }

    public void setH1061x(String h1061x) {
        this.h1061x = h1061x;
        notifyPropertyChanged(BR.h1061x);
    }

    @Bindable
    public String getH107() {
        return h107;
    }

    public void setH107(String h107) {
        this.h107 = h107;
        notifyPropertyChanged(BR.h107);
    }

    @Bindable
    public String getH10800() {
        return h10800;
    }

    public void setH10800(String h10800) {
        this.h10800 = h10800;
        notifyPropertyChanged(BR.h10800);
    }

    @Bindable
    public String getH108a() {
        return h108a;
    }

    public void setH108a(String h108a) {
        this.h108a = h108a;
        notifyPropertyChanged(BR.h108a);
    }

    @Bindable
    public String getH108() {
        return h108;
    }

    public void setH108(String h108) {
        this.h108 = h108;
        setH10896x(h108.equals("96") ? this.h10896x : "");
        notifyPropertyChanged(BR.h108);
    }

    @Bindable
    public String getH10896x() {
        return h10896x;
    }

    public void setH10896x(String h10896x) {
        this.h10896x = h10896x;
        notifyPropertyChanged(BR.h10896x);
    }

    @Bindable
    public String getH10900() {
        return h10900;
    }

    public void setH10900(String h10900) {
        this.h10900 = h10900;
        setH1091(h10900.equals("1") ? this.h1091 : "");
        setH1092(h10900.equals("1") ? this.h1092 : "");
        setH1093(h10900.equals("1") ? this.h1093 : "");
        setH1094(h10900.equals("1") ? this.h1094 : "");
        setH1095(h10900.equals("1") ? this.h1095 : "");
        setH1096(h10900.equals("1") ? this.h1096 : "");
        setH1097(h10900.equals("1") ? this.h1097 : "");
        setH10996(h10900.equals("1") ? this.h10996 : "");
        setH10997(h10900.equals("1") ? this.h10997 : "");
        notifyPropertyChanged(BR.h10900);
    }

    @Bindable
    public String getH10901() {
        return h10901;
    }

    public void setH10901(String h10901) {
        this.h10901 = h10901;
        notifyPropertyChanged(BR.h10901);
    }

    @Bindable
    public String getH109() {
        return h109;
    }

    public void setH109(String h109) {
        this.h109 = h109;
        notifyPropertyChanged(BR.h109);
    }

    @Bindable
    public String getH1091() {
        return h1091;
    }

    public void setH1091(String h1091) {
        if (this.h1091.equals(h1091)) return;
        this.h1091 = h1091;
        notifyPropertyChanged(BR.h1091);
    }

    @Bindable
    public String getH1092() {
        return h1092;
    }

    public void setH1092(String h1092) {
        if (this.h1092.equals(h1092)) return;
        this.h1092 = h1092;
        notifyPropertyChanged(BR.h1092);
    }

    @Bindable
    public String getH1093() {
        return h1093;
    }

    public void setH1093(String h1093) {
        if (this.h1093.equals(h1093)) return;
        this.h1093 = h1093;
        notifyPropertyChanged(BR.h1093);
    }

    @Bindable
    public String getH1094() {
        return h1094;
    }

    public void setH1094(String h1094) {
        if (this.h1094.equals(h1094)) return;
        this.h1094 = h1094;
        notifyPropertyChanged(BR.h1094);
    }

    @Bindable
    public String getH1095() {
        return h1095;
    }

    public void setH1095(String h1095) {
        if (this.h1095.equals(h1095)) return;
        this.h1095 = h1095;
        notifyPropertyChanged(BR.h1095);
    }

    @Bindable
    public String getH1096() {
        return h1096;
    }

    public void setH1096(String h1096) {
        if (this.h1096.equals(h1096)) return;
        this.h1096 = h1096;
        notifyPropertyChanged(BR.h1096);
    }

    @Bindable
    public String getH1097() {
        return h1097;
    }

    public void setH1097(String h1097) {
        if (this.h1097.equals(h1097)) return;
        this.h1097 = h1097;
        notifyPropertyChanged(BR.h1097);
    }

    @Bindable
    public String getH10997() {
        return h10997;
    }

    public void setH10997(String h10997) {
        if (this.h10997.equals(h10997)) return;
        this.h10997 = h10997;
        setH1091(h10997.equals("97") ? "" : this.h1091);
        setH1092(h10997.equals("97") ? "" : this.h1092);
        setH1093(h10997.equals("97") ? "" : this.h1093);
        setH1094(h10997.equals("97") ? "" : this.h1094);
        setH1095(h10997.equals("97") ? "" : this.h1095);
        setH1096(h10997.equals("97") ? "" : this.h1096);
        setH1097(h10997.equals("97") ? "" : this.h1097);
        setH10996(h10997.equals("97") ? "" : this.h10996);
        notifyPropertyChanged(BR.h10997);
    }

    @Bindable
    public String getH10996() {
        return h10996;
    }

    public void setH10996(String h10996) {
        if (this.h10996.equals(h10996)) return;
        this.h10996 = h10996;
        setH10996x(h10996.equals("96") ? this.h10996x : "");
        notifyPropertyChanged(BR.h10996);
    }

    @Bindable
    public String getH10996x() {
        return h10996x;
    }

    public void setH10996x(String h10996x) {
        this.h10996x = h10996x;
        notifyPropertyChanged(BR.h10996x);
    }

    @Bindable
    public String getH110() {
        return h110;
    }

    public void setH110(String h110) {
        this.h110 = h110;
        setH111(h110.equals("1") ? this.h111 : "");
        notifyPropertyChanged(BR.h110);
    }

    @Bindable
    public String getH111() {
        return h111;
    }

    public void setH111(String h111) {
        this.h111 = h111;
        notifyPropertyChanged(BR.h111);
    }

    @Bindable
    public String getH11000() {
        return h11000;
    }

    public void setH11000(String h11000) {
        this.h11000 = h11000;
        notifyPropertyChanged(BR.h11000);
    }

    @Bindable
    public String getH11001() {
        return h11001;
    }

    public void setH11001(String h11001) {
        this.h11001 = h11001;
        notifyPropertyChanged(BR.h11001);
    }

    @Bindable
    public String getH11200() {
        return h11200;
    }

    public void setH11200(String h11200) {
        this.h11200 = h11200;
        notifyPropertyChanged(BR.h11200);
    }

    @Bindable
    public String getH11201() {
        return h11201;
    }

    public void setH11201(String h11201) {
        this.h11201 = h11201;
        notifyPropertyChanged(BR.h11201);
    }

    @Bindable
    public String getH11202() {
        return h11202;
    }

    public void setH11202(String h11202) {
        this.h11202 = h11202;
        setH112(h11202.equals("1") ? this.h112 : "");
        setH113(h11202.equals("1") ? this.h113 : "");
        setH114(h11202.equals("1") ? this.h114 : "");
        setH116(h11202.equals("1") ? this.h116 : "");
        setH11701(h11202.equals("1") ? this.h11701 : "");
        setH118(h11202.equals("1") ? this.h118 : "");
        setH119(h11202.equals("1") ? this.h119 : "");
        notifyPropertyChanged(BR.h11202);
    }

    @Bindable
    public String getH112() {
        return h112;
    }

    public void setH112(String h112) {
        this.h112 = h112;
        notifyPropertyChanged(BR.h112);
    }

    @Bindable
    public String getH113() {
        return h113;
    }

    public void setH113(String h113) {
        this.h113 = h113;
        setH114(h113.equals("1") ? this.h114 : "");
        notifyPropertyChanged(BR.h113);
    }

    @Bindable
    public String getH114() {
        return h114;
    }

    public void setH114(String h114) {
        this.h114 = h114;
        notifyPropertyChanged(BR.h114);
    }

    @Bindable
    public String getH115() {
        return h115;
    }

    public void setH115(String h115) {
        this.h115 = h115;
        setH11501(h115.equals("1") ? this.h11501 : "");
        setH11502(h115.equals("1") ? this.h11502 : "");
        setH11503(h115.equals("1") ? this.h11503 : "");
        setH11504(h115.equals("1") ? this.h11504 : "");
        setH11505(h115.equals("1") ? this.h11505 : "");
        setH11506(h115.equals("1") ? this.h11506 : "");
        setH11507(h115.equals("1") ? this.h11507 : "");
        setH11508(h115.equals("1") ? this.h11508 : "");
        setH11509(h115.equals("1") ? this.h11509 : "");
        setH11596(h115.equals("1") ? this.h11596 : "");
        notifyPropertyChanged(BR.h115);
    }

    @Bindable
    public String getH11501() {
        return h11501;
    }

    public void setH11501(String h11501) {
        if (this.h11501.equals(h11501)) return;
        this.h11501 = h11501;
        notifyPropertyChanged(BR.h11501);
    }

    @Bindable
    public String getH11502() {
        return h11502;
    }

    public void setH11502(String h11502) {
        if (this.h11502.equals(h11502)) return;     // For all checkboxes
        this.h11502 = h11502;
        notifyPropertyChanged(BR.h11502);
    }

    @Bindable
    public String getH11503() {
        return h11503;
    }

    public void setH11503(String h11503) {
        if (this.h11503.equals(h11503)) return;     // For all checkboxes
        this.h11503 = h11503;
        notifyPropertyChanged(BR.h11503);
    }

    @Bindable
    public String getH11504() {
        return h11504;
    }

    public void setH11504(String h11504) {
        if (this.h11504.equals(h11504)) return;     // For all checkboxes
        this.h11504 = h11504;
        notifyPropertyChanged(BR.h11504);
    }

    @Bindable
    public String getH11505() {
        return h11505;
    }

    public void setH11505(String h11505) {
        if (this.h11505.equals(h11505)) return;     // For all checkboxes
        this.h11505 = h11505;
        notifyPropertyChanged(BR.h11505);
    }

    @Bindable
    public String getH11506() {
        return h11506;
    }

    public void setH11506(String h11506) {
        if (this.h11506.equals(h11506)) return;     // For all checkboxes
        this.h11506 = h11506;
        notifyPropertyChanged(BR.h11506);
    }

    @Bindable
    public String getH11507() {
        return h11507;
    }

    public void setH11507(String h11507) {
        if (this.h11507.equals(h11507)) return;     // For all checkboxes
        this.h11507 = h11507;
        notifyPropertyChanged(BR.h11507);
    }

    @Bindable
    public String getH11508() {
        return h11508;
    }

    public void setH11508(String h11508) {
        if (this.h11508.equals(h11508)) return;     // For all checkboxes
        this.h11508 = h11508;
        notifyPropertyChanged(BR.h11508);
    }

    @Bindable
    public String getH11509() {
        return h11509;
    }

    public void setH11509(String h11509) {
        if (this.h11509.equals(h11509)) return;     // For all checkboxes
        this.h11509 = h11509;
        notifyPropertyChanged(BR.h11509);
    }

    @Bindable
    public String getH11596() {
        return h11596;
    }

    public void setH11596(String h11596) {
        if (this.h11596.equals(h11596)) return;     // For all checkboxes
        this.h11596 = h11596;
        setH11596x(h11596.equals("96") ? this.h11596x : "");
        notifyPropertyChanged(BR.h11596);
    }

    @Bindable
    public String getH11596x() {
        return h11596x;
    }

    public void setH11596x(String h11596x) {
        this.h11596x = h11596x;
        notifyPropertyChanged(BR.h11596x);
    }

    @Bindable
    public String getH116() {
        return h116;
    }

    public void setH116(String h116) {
        this.h116 = h116;
        setH11701(h116.equals("1") ? this.h11701 : "");
        setH118(h116.equals("1") || h116.equals("2") ? this.h118 : "");
        setH119(h116.equals("3") ? "" : this.h119);
        notifyPropertyChanged(BR.h116);
    }

    @Bindable
    public String getH11701() {
        return h11701;
    }

    public void setH11701(String h11701) {
        this.h11701 = h11701;
        notifyPropertyChanged(BR.h11701);
    }

    @Bindable
    public String getH118() {
        return h118;
    }

    public void setH118(String h118) {
        this.h118 = h118;
        setH119(h118.equals("2") ? "" : this.h119);
        notifyPropertyChanged(BR.h118);
    }

    @Bindable
    public String getH119() {
        return h119;
    }

    public void setH119(String h119) {
        this.h119 = h119;
        notifyPropertyChanged(BR.h119);
    }

    @Bindable
    public String getH120() {
        return h120;
    }

    public void setH120(String h120) {
        this.h120 = h120;
        notifyPropertyChanged(BR.h120);
    }

    @Bindable
    public String getH121() {
        return h121;
    }

    public void setH121(String h121) {
        this.h121 = h121;
        setH122(h121.equals("2") ? "" : this.h122);
        setH123(h121.equals("2") ? "" : this.h123);
        setH124(h121.equals("1") ? "" : this.h124);
        notifyPropertyChanged(BR.h121);
    }

    @Bindable
    public String getH122() {
        return h122;
    }

    public void setH122(String h122) {
        this.h122 = h122;
        setH1221x(h122.equals("1") ? this.h1221x : "");
        setH123(h122.equals("98") ? "" : this.h123);
        notifyPropertyChanged(BR.h122);
    }

    @Bindable
    public String getH1221x() {
        return h1221x;
    }

    public void setH1221x(String h1221x) {
        this.h1221x = h1221x;
        notifyPropertyChanged(BR.h1221x);
    }

    @Bindable
    public String getH123() {
        return h123;
    }

    public void setH123(String h123) {
        this.h123 = h123;
        setH124(h123.equals("1") ? this.h124 : "");
        notifyPropertyChanged(BR.h123);
    }

    @Bindable
    public String getH124() {
        return h124;
    }

    public void setH124(String h124) {
        this.h124 = h124;
        notifyPropertyChanged(BR.h124);
    }

    @Bindable
    public String getH125() {
        return h125;
    }

    public void setH125(String h125) {
        this.h125 = h125;
        setH126(h125.equals("2") ? "" : this.h126);
        setH127(h125.equals("2") ? "" : this.h127);
        setH128(h125.equals("2") ? "" : this.h128);
        setH12901(h125.equals("2") ? "" : this.h12901);
        setH12902(h125.equals("2") ? "" : this.h12902);
        setH12903(h125.equals("2") ? "" : this.h12903);
        setH12904(h125.equals("2") ? "" : this.h12904);
        setH12905(h125.equals("2") ? "" : this.h12905);
        setH12906(h125.equals("2") ? "" : this.h12906);
        notifyPropertyChanged(BR.h125);
    }

    @Bindable
    public String getH126() {
        return h126;
    }

    public void setH126(String h126) {
        this.h126 = h126;
        notifyPropertyChanged(BR.h126);
    }

    @Bindable
    public String getH127() {
        return h127;
    }

    public void setH127(String h127) {
        this.h127 = h127;
        setH12796x(h127.equals("96") ? this.h12796x : "");
        notifyPropertyChanged(BR.h127);
    }

    @Bindable
    public String getH12796x() {
        return h12796x;
    }

    public void setH12796x(String h12796x) {
        this.h12796x = h12796x;
        notifyPropertyChanged(BR.h12796x);
    }


    @Bindable
    public String getH128() {
        return h128;
    }

    public void setH128(String h128) {
        this.h128 = h128;
        setH12896x(h128.equals("96") ? this.h12896x : "");
        notifyPropertyChanged(BR.h128);
    }


    @Bindable
    public String getH12896x() {
        return h12896x;
    }

    public void setH12896x(String h12896x) {
        this.h12896x = h12896x;
        notifyPropertyChanged(BR.h12896x);
    }

    @Bindable
    public String getH12901() {
        return h12901;
    }

    public void setH12901(String h12901) {
        this.h12901 = h12901;
        notifyPropertyChanged(BR.h12901);
    }

    @Bindable
    public String getH12902() {
        return h12902;
    }

    public void setH12902(String h12902) {
        this.h12902 = h12902;
        notifyPropertyChanged(BR.h12902);
    }

    @Bindable
    public String getH12903() {
        return h12903;
    }

    public void setH12903(String h12903) {
        this.h12903 = h12903;
        notifyPropertyChanged(BR.h12903);
    }

    @Bindable
    public String getH12904() {
        return h12904;
    }

    public void setH12904(String h12904) {
        this.h12904 = h12904;
        notifyPropertyChanged(BR.h12904);
    }

    @Bindable
    public String getH12905() {
        return h12905;
    }

    public void setH12905(String h12905) {
        this.h12905 = h12905;
        notifyPropertyChanged(BR.h12905);
    }

    @Bindable
    public String getH12906() {
        return h12906;
    }

    public void setH12906(String h12906) {
        this.h12906 = h12906;
        notifyPropertyChanged(BR.h12906);
    }

    @Bindable
    public String getH130() {
        return h130;
    }

    public void setH130(String h130) {
        this.h130 = h130;
        notifyPropertyChanged(BR.h130);
    }

    @Bindable
    public String getH131() {
        return h131;
    }

    public void setH131(String h131) {
        this.h131 = h131;
        setH1310101(h131.equals("2") ? this.h1310101 : "");
        setH1310102(h131.equals("2") ? this.h1310102 : "");
        setH1310103(h131.equals("2") ? this.h1310103 : "");
        setH1310104(h131.equals("2") ? this.h1310104 : "");
        setH1310105(h131.equals("2") ? this.h1310105 : "");
        setH1310106(h131.equals("2") ? this.h1310106 : "");
        setH1310107(h131.equals("2") ? this.h1310107 : "");
        notifyPropertyChanged(BR.h131);
    }

    @Bindable
    public String getH13101() {
        return h13101;
    }

    public void setH13101(String h13101) {
        this.h13101 = h13101;
        notifyPropertyChanged(BR.h13101);
    }

    @Bindable
    public String getH1310101() {
        return h1310101;
    }

    public void setH1310101(String h1310101) {
        if (this.h1310101.equals(h1310101)) return;     // For all checkboxes
        this.h1310101 = h1310101;
        notifyPropertyChanged(BR.h1310101);
    }

    @Bindable
    public String getH1310102() {
        return h1310102;
    }

    public void setH1310102(String h1310102) {
        if (this.h1310102.equals(h1310102)) return;     // For all checkboxes
        this.h1310102 = h1310102;
        notifyPropertyChanged(BR.h1310102);
    }

    @Bindable
    public String getH1310103() {
        return h1310103;
    }

    public void setH1310103(String h1310103) {
        if (this.h1310103.equals(h1310103)) return;     // For all checkboxes
        this.h1310103 = h1310103;
        notifyPropertyChanged(BR.h1310103);
    }

    @Bindable
    public String getH1310104() {
        return h1310104;
    }

    public void setH1310104(String h1310104) {
        if (this.h1310104.equals(h1310104)) return;     // For all checkboxes
        this.h1310104 = h1310104;
        notifyPropertyChanged(BR.h1310104);
    }

    @Bindable
    public String getH1310105() {
        return h1310105;
    }

    public void setH1310105(String h1310105) {
        if (this.h1310105.equals(h1310105)) return;     // For all checkboxes
        this.h1310105 = h1310105;
        notifyPropertyChanged(BR.h1310105);
    }

    @Bindable
    public String getH1310106() {
        return h1310106;
    }

    public void setH1310106(String h1310106) {
        if (this.h1310106.equals(h1310106)) return;     // For all checkboxes
        this.h1310106 = h1310106;
        notifyPropertyChanged(BR.h1310106);
    }

    @Bindable
    public String getH1310107() {
        return h1310107;
    }

    public void setH1310107(String h1310107) {
        if (this.h1310107.equals(h1310107)) return;     // For all checkboxes
        this.h1310107 = h1310107;
        notifyPropertyChanged(BR.h1310107);
    }

    @Bindable
    public String getH132() {
        return h132;
    }

    public void setH132(String h132) {
        this.h132 = h132;
        setH132a(h132.equals("2") ? this.h132a : "");
        setH13301(h132.equals("1") ? this.h13301 : "");
        setH13302(h132.equals("1") ? this.h13302 : "");
        setH13303(h132.equals("1") ? this.h13303 : "");
        setH13304(h132.equals("1") ? this.h13304 : "");
        setH13305(h132.equals("1") ? this.h13305 : "");
        setH13306(h132.equals("1") ? this.h13306 : "");
        setH13307(h132.equals("1") ? this.h13307 : "");
        setH13308(h132.equals("1") ? this.h13308 : "");
        setH13309(h132.equals("1") ? this.h13309 : "");
        setH13310(h132.equals("1") ? this.h13310 : "");
        notifyPropertyChanged(BR.h132);
    }

    @Bindable
    public String getH132a() {
        return h132a;
    }

    public void setH132a(String h132a) {
        this.h132a = h132a;
        setH132a96x(h132a.equals("96") ? this.h132a96x : "");
        notifyPropertyChanged(BR.h132a);
    }

    @Bindable
    public String getH132a96x() {
        return h132a96x;
    }

    public void setH132a96x(String h132a96x) {
        this.h132a96x = h132a96x;
        notifyPropertyChanged(BR.h132a96x);
    }

    @Bindable
    public String getH133() {
        return h133;
    }

    public void setH133(String h133) {
        this.h133 = h133;
        notifyPropertyChanged(BR.h133);
    }

    @Bindable
    public String getH13301() {
        return h13301;
    }

    public void setH13301(String h13301) {
        if (this.h13301.equals(h13301)) return;     // For all checkboxes
        this.h13301 = h13301;
        notifyPropertyChanged(BR.h13301);
    }

    @Bindable
    public String getH13302() {
        return h13302;
    }

    public void setH13302(String h13302) {
        if (this.h13302.equals(h13302)) return;     // For all checkboxes
        this.h13302 = h13302;
        notifyPropertyChanged(BR.h13302);
    }

    @Bindable
    public String getH13303() {
        return h13303;
    }

    public void setH13303(String h13303) {
        if (this.h13303.equals(h13303)) return;     // For all checkboxes
        this.h13303 = h13303;
        notifyPropertyChanged(BR.h13303);
    }

    @Bindable
    public String getH13304() {
        return h13304;
    }

    public void setH13304(String h13304) {
        if (this.h13304.equals(h13304)) return;     // For all checkboxes
        this.h13304 = h13304;
        notifyPropertyChanged(BR.h13304);
    }

    @Bindable
    public String getH13305() {
        return h13305;
    }

    public void setH13305(String h13305) {
        if (this.h13305.equals(h13305)) return;     // For all checkboxes
        this.h13305 = h13305;
        notifyPropertyChanged(BR.h13305);
    }

    @Bindable
    public String getH13306() {
        return h13306;
    }

    public void setH13306(String h13306) {
        if (this.h13306.equals(h13306)) return;     // For all checkboxes
        this.h13306 = h13306;
        notifyPropertyChanged(BR.h13306);
    }

    @Bindable
    public String getH13307() {
        return h13307;
    }

    public void setH13307(String h13307) {
        if (this.h13307.equals(h13307)) return;     // For all checkboxes
        this.h13307 = h13307;
        notifyPropertyChanged(BR.h13307);
    }

    @Bindable
    public String getH13308() {
        return h13308;
    }

    public void setH13308(String h13308) {
        if (this.h13308.equals(h13308)) return;     // For all checkboxes
        this.h13308 = h13308;
        notifyPropertyChanged(BR.h13308);
    }

    @Bindable
    public String getH13309() {
        return h13309;
    }

    public void setH13309(String h13309) {
        if (this.h13309.equals(h13309)) return;
        this.h13309 = h13309;
        notifyPropertyChanged(BR.h13309);
    }

    @Bindable
    public String getH13310() {
        return h13310;
    }

    public void setH13310(String h13310) {
        if (this.h13310.equals(h13310)) return;
        this.h13310 = h13310;
        notifyPropertyChanged(BR.h13310);
    }


    @Bindable
    public String getH134() {
        return h134;
    }

    public void setH134(String h134) {
        this.h134 = h134;
        setH13501(h134.equals("1") ? this.h13501 : "");
        setH13502(h134.equals("1") ? this.h13502 : "");
        setH13503(h134.equals("1") ? this.h13503 : "");
        setH13504(h134.equals("1") ? this.h13504 : "");
        setH13505(h134.equals("1") ? this.h13505 : "");
        setH13506(h134.equals("1") ? this.h13506 : "");
        setH13507(h134.equals("1") ? this.h13507 : "");
        setH13508(h134.equals("1") ? this.h13508 : "");
        setH13509(h134.equals("1") ? this.h13509 : "");
        setH13598(h134.equals("1") ? this.h13598 : "");
        setH136a(h134.equals("1") ? this.h136a : "");
        setH136b(h134.equals("1") ? this.h136b : "");
        setH136c(h134.equals("1") ? this.h136c : "");
        setH136d(h134.equals("1") ? this.h136d : "");
        setH136e(h134.equals("1") ? this.h136e : "");
        setH136f(h134.equals("1") ? this.h136f : "");
        setH13696(h134.equals("1") ? this.h13696 : "");
        notifyPropertyChanged(BR.h134);
    }

    @Bindable
    public String getH135() {
        return h135;
    }

    public void setH135(String h135) {
        this.h135 = h135;
        notifyPropertyChanged(BR.h135);
    }

    @Bindable
    public String getH13501() {
        return h13501;
    }

    public void setH13501(String h13501) {
        if (this.h13501.equals(h13501)) return;     // For all checkboxes
        this.h13501 = h13501;
        notifyPropertyChanged(BR.h13501);
    }

    @Bindable
    public String getH13502() {
        return h13502;
    }

    public void setH13502(String h13502) {
        if (this.h13502.equals(h13502)) return;     // For all checkboxes
        this.h13502 = h13502;
        notifyPropertyChanged(BR.h13502);
    }

    @Bindable
    public String getH13503() {
        return h13503;
    }

    public void setH13503(String h13503) {
        if (this.h13503.equals(h13503)) return;     // For all checkboxes
        this.h13503 = h13503;
        notifyPropertyChanged(BR.h13503);
    }

    @Bindable
    public String getH13504() {
        return h13504;
    }

    public void setH13504(String h13504) {
        if (this.h13504.equals(h13504)) return;     // For all checkboxes
        this.h13504 = h13504;
        notifyPropertyChanged(BR.h13504);
    }

    @Bindable
    public String getH13505() {
        return h13505;
    }

    public void setH13505(String h13505) {
        if (this.h13505.equals(h13505)) return;     // For all checkboxes
        this.h13505 = h13505;
        notifyPropertyChanged(BR.h13505);
    }

    @Bindable
    public String getH13506() {
        return h13506;
    }

    public void setH13506(String h13506) {
        if (this.h13506.equals(h13506)) return;     // For all checkboxes
        this.h13506 = h13506;
        notifyPropertyChanged(BR.h13506);
    }

    @Bindable
    public String getH13507() {
        return h13507;
    }

    public void setH13507(String h13507) {
        if (this.h13507.equals(h13507)) return;     // For all checkboxes
        this.h13507 = h13507;
        notifyPropertyChanged(BR.h13507);
    }

    @Bindable
    public String getH13508() {
        return h13508;
    }

    public void setH13508(String h13508) {
        if (this.h13508.equals(h13508)) return;     // For all checkboxes
        this.h13508 = h13508;
        notifyPropertyChanged(BR.h13508);
    }

    @Bindable
    public String getH13509() {
        return h13509;
    }

    public void setH13509(String h13509) {
        if (this.h13509.equals(h13509)) return;     // For all checkboxes
        this.h13509 = h13509;
        notifyPropertyChanged(BR.h13509);
    }

    @Bindable
    public String getH13598() {
        return h13598;
    }

    public void setH13598(String h13598) {
        if (this.h13598.equals(h13598)) return;     // For all checkboxes
        this.h13598 = h13598;
        setH13501(h13598.equals("98") ? "" : this.h13501);
        setH13502(h13598.equals("98") ? "" : this.h13502);
        setH13503(h13598.equals("98") ? "" : this.h13503);
        setH13504(h13598.equals("98") ? "" : this.h13504);
        setH13505(h13598.equals("98") ? "" : this.h13505);
        setH13506(h13598.equals("98") ? "" : this.h13506);
        setH13507(h13598.equals("98") ? "" : this.h13507);
        setH13508(h13598.equals("98") ? "" : this.h13508);
        setH13509(h13598.equals("98") ? "" : this.h13509);
        setH136a(h13598.equals("98") ? "" : this.h136a);
        setH136b(h13598.equals("98") ? "" : this.h136b);
        setH136c(h13598.equals("98") ? "" : this.h136c);
        setH136d(h13598.equals("98") ? "" : this.h136d);
        setH136e(h13598.equals("98") ? "" : this.h136e);
        setH136f(h13598.equals("98") ? "" : this.h136f);
        setH13696(h13598.equals("98") ? "" : this.h13696);
        setH1361(h13598.equals("98") ? "" : this.h1361);
        setH1362a(h13598.equals("98") ? "" : this.h1362a);
        setH1362b(h13598.equals("98") ? "" : this.h1362b);
        setH1362c(h13598.equals("98") ? "" : this.h1362c);
        setH1362d(h13598.equals("98") ? "" : this.h1362d);
        setH1362e(h13598.equals("98") ? "" : this.h1362e);
        setH1362f(h13598.equals("98") ? "" : this.h1362f);
        setH1362g(h13598.equals("98") ? "" : this.h1362g);
        setH1362h(h13598.equals("98") ? "" : this.h1362h);
        setH1362i(h13598.equals("98") ? "" : this.h1362i);
        setH1362j(h13598.equals("98") ? "" : this.h1362j);
        setH136298(h13598.equals("98") ? "" : this.h136298);
        setH1363(h13598.equals("98") ? "" : this.h1363);
        notifyPropertyChanged(BR.h13598);
    }


    @Bindable
    public String getH136a() {
        return h136a;
    }

    public void setH136a(String h136a) {
        if (this.h136a.equals(h136a)) return;     // For all checkboxes
        this.h136a = h136a;
        notifyPropertyChanged(BR.h1361);
    }

    @Bindable
    public String getH136b() {
        return h136b;
    }

    public void setH136b(String h136b) {
        if (this.h136b.equals(h136b)) return;     // For all checkboxes
        this.h136b = h136b;
        notifyPropertyChanged(BR.h136b);
    }

    @Bindable
    public String getH136c() {
        return h136c;
    }

    public void setH136c(String h136c) {
        if (this.h136c.equals(h136c)) return;     // For all checkboxes
        this.h136c = h136c;
        notifyPropertyChanged(BR.h136c);
    }

    @Bindable
    public String getH136d() {
        return h136d;
    }

    public void setH136d(String h136d) {
        if (this.h136d.equals(h136d)) return;     // For all checkboxes
        this.h136d = h136d;
        notifyPropertyChanged(BR.h136d);
    }

    @Bindable
    public String getH136e() {
        return h136e;
    }

    public void setH136e(String h136e) {
        if (this.h136e.equals(h136e)) return;     // For all checkboxes
        this.h136e = h136e;
        notifyPropertyChanged(BR.h136e);
    }

    @Bindable
    public String getH136f() {
        return h136f;
    }

    public void setH136f(String h136f) {
        if (this.h136f.equals(h136f)) return;     // For all checkboxes
        this.h136f = h136f;
        notifyPropertyChanged(BR.h136f);
    }

    @Bindable
    public String getH13696() {
        return h13696;
    }

    public void setH13696(String h13696) {
        if (this.h13696.equals(h13696)) return;
        this.h13696 = h13696;
        setH13696x(h13696.equals("96") ? this.h13696x : "");
        notifyPropertyChanged(BR.h13696);
    }

    @Bindable
    public String getH13696x() {
        return h13696x;
    }

    public void setH13696x(String h13696x) {
        this.h13696x = h13696x;
        notifyPropertyChanged(BR.h13696x);
    }

    @Bindable
    public String getH1361() {
        return h1361;
    }

    public void setH1361(String h1361) {
        this.h1361 = h1361;
        notifyPropertyChanged(BR.h1361);
    }


    @Bindable
    public String getH1362a() {
        return h1362a;
    }

    public void setH1362a(String h1362a) {
        if (this.h1362a.equals(h1362a)) return;
        this.h1362a = h1362a;
        notifyPropertyChanged(BR.h1362a);
    }

    @Bindable
    public String getH1362b() {
        return h1362b;
    }

    public void setH1362b(String h1362b) {
        if (this.h1362b.equals(h1362b)) return;     // For all checkboxes
        this.h1362b = h1362b;
        notifyPropertyChanged(BR.h1362b);
    }

    @Bindable
    public String getH1362c() {
        return h1362c;
    }

    public void setH1362c(String h1362c) {
        if (this.h1362c.equals(h1362c)) return;     // For all checkboxes
        this.h1362c = h1362c;
        notifyPropertyChanged(BR.h1362c);
    }

    @Bindable
    public String getH1362d() {
        return h1362d;
    }

    public void setH1362d(String h1362d) {
        if (this.h1362d.equals(h1362d)) return;     // For all checkboxes
        this.h1362d = h1362d;
        notifyPropertyChanged(BR.h1362d);
    }

    @Bindable
    public String getH1362e() {
        return h1362e;
    }

    public void setH1362e(String h1362e) {
        if (this.h1362e.equals(h1362e)) return;     // For all checkboxes
        this.h1362e = h1362e;
        notifyPropertyChanged(BR.h1362e);
    }

    @Bindable
    public String getH1362f() {
        return h1362f;
    }

    public void setH1362f(String h1362f) {
        if (this.h1362f.equals(h1362f)) return;     // For all checkboxes
        this.h1362f = h1362f;
        notifyPropertyChanged(BR.h1362f);
    }

    @Bindable
    public String getH1362g() {
        return h1362g;
    }

    public void setH1362g(String h1362g) {
        if (this.h1362g.equals(h1362g)) return;     // For all checkboxes
        this.h1362g = h1362g;
        notifyPropertyChanged(BR.h1362g);
    }

    @Bindable
    public String getH1362h() {
        return h1362h;
    }

    public void setH1362h(String h1362h) {
        if (this.h1362h.equals(h1362h)) return;     // For all checkboxes
        this.h1362h = h1362h;
        notifyPropertyChanged(BR.h1362h);
    }

    @Bindable
    public String getH1362i() {
        return h1362i;
    }

    public void setH1362i(String h1362i) {
        if (this.h1362i.equals(h1362i)) return;     // For all checkboxes
        this.h1362i = h1362i;
        notifyPropertyChanged(BR.h1362i);
    }

    @Bindable
    public String getH1362j() {
        return h1362j;
    }

    public void setH1362j(String h1362j) {
        if (this.h1362j.equals(h1362j)) return;
        this.h1362j = h1362j;
        setH1362a(h1362j.equals("10") ? "" : this.h1362a);
        setH1362b(h1362j.equals("10") ? "" : this.h1362b);
        setH1362c(h1362j.equals("10") ? "" : this.h1362c);
        setH1362d(h1362j.equals("10") ? "" : this.h1362d);
        setH1362e(h1362j.equals("10") ? "" : this.h1362e);
        setH1362f(h1362j.equals("10") ? "" : this.h1362f);
        setH1362g(h1362j.equals("10") ? "" : this.h1362g);
        setH1362h(h1362j.equals("10") ? "" : this.h1362h);
        setH1362i(h1362j.equals("10") ? "" : this.h1362i);
        setH136298(h1362j.equals("10") ? "" : this.h136298);
        setH1363(h1362j.equals("10") ? "" : this.h1363);
        notifyPropertyChanged(BR.h1362j);
    }

    @Bindable
    public String getH136298() {
        return h136298;
    }

    public void setH136298(String h136298) {
        if (this.h136298.equals(h136298)) return;
        this.h136298 = h136298;
        setH1362a(h136298.equals("98") ? "" : this.h1362a);
        setH1362b(h136298.equals("98") ? "" : this.h1362b);
        setH1362c(h136298.equals("98") ? "" : this.h1362c);
        setH1362d(h136298.equals("98") ? "" : this.h1362d);
        setH1362e(h136298.equals("98") ? "" : this.h1362e);
        setH1362f(h136298.equals("98") ? "" : this.h1362f);
        setH1362g(h136298.equals("98") ? "" : this.h1362g);
        setH1362h(h136298.equals("98") ? "" : this.h1362h);
        setH1362i(h136298.equals("98") ? "" : this.h1362i);
        setH1362j(h136298.equals("98") ? "" : this.h1362j);
        setH1363(h136298.equals("98") ? "" : this.h1363);
        notifyPropertyChanged(BR.h136298);
    }

    @Bindable
    public String getH1363() {
        return h1363;
    }

    public void setH1363(String h1363) {
        this.h1363 = h1363;
        notifyPropertyChanged(BR.h1363);
    }

    @Bindable
    public String getH137() {
        return h137;
    }

    public void setH137(String h137) {
        this.h137 = h137;
        setH1371(h137.equals("1") ? this.h1371 : "");
        setH1372(h137.equals("1") ? this.h1372 : "");
        setH1373(h137.equals("2") ? this.h1373 : "");
        notifyPropertyChanged(BR.h137);
    }

    @Bindable
    public String getH1371() {
        return h1371;
    }

    public void setH1371(String h1371) {
        this.h1371 = h1371;
        setH137196x(h1371.equals("96") ? this.h137196x : "");
        notifyPropertyChanged(BR.h1371);
    }

    @Bindable
    public String getH137196x() {
        return h137196x;
    }

    public void setH137196x(String h137196x) {
        this.h137196x = h137196x;
        notifyPropertyChanged(BR.h137196x);
    }

    @Bindable
    public String getH1372() {
        return h1372;
    }

    public void setH1372(String h1372) {
        this.h1372 = h1372;
        notifyPropertyChanged(BR.h1372);
    }


    @Bindable
    public String getH1373() {
        return h1373;
    }

    public void setH1373(String h1373) {
        this.h1373 = h1373;
        setH137396x(h1373.equals("96") ? this.h137396x : "");
        notifyPropertyChanged(BR.h1373);
    }

    @Bindable
    public String getH137396x() {
        return h137396x;
    }

    public void setH137396x(String h137396x) {
        this.h137396x = h137396x;
        notifyPropertyChanged(BR.h137396x);
    }

    @Bindable
    public String getH201() {
        return h201;
    }

    public void setH201(String h201) {
        this.h201 = h201;
        setH201hx(h201.equals("1") ? this.h201hx : "");
        setH201dx(h201.equals("2") ? this.h201dx : "");
        setH201wx(h201.equals("3") ? this.h201wx : "");
        notifyPropertyChanged(BR.h201);
    }

    @Bindable
    public String getH201hx() {
        return h201hx;
    }

    public void setH201hx(String h201hx) {
        this.h201hx = h201hx;
        notifyPropertyChanged(BR.h201hx);
    }

    @Bindable
    public String getH201dx() {
        return h201dx;
    }

    public void setH201dx(String h201dx) {
        this.h201dx = h201dx;
        notifyPropertyChanged(BR.h201dx);
    }

    @Bindable
    public String getH201wx() {
        return h201wx;
    }

    public void setH201wx(String h201wx) {
        this.h201wx = h201wx;
        notifyPropertyChanged(BR.h201wx);
    }

    @Bindable
    public String getH202() {
        return h202;
    }

    public void setH202(String h202) {
        this.h202 = h202;
        setH203h(h202.equals("1") ? this.h203h : "");
        setH203d(h202.equals("1") ? this.h203d : "");
        setH203w(h202.equals("1") ? this.h203w : "");
        setH204(h202.equals("1") ? this.h204 : "");
        setH205(h202.equals("1") ? this.h205 : "");
        setH2051a(h202.equals("1") ? this.h2051a : "");
        setH2051b(h202.equals("1") ? this.h2051b : "");
        setH2051c(h202.equals("1") ? this.h2051c : "");
        setH2051d(h202.equals("1") ? this.h2051d : "");
        setH2051e(h202.equals("1") ? this.h2051e : "");
        setH2051f(h202.equals("1") ? this.h2051f : "");
        setH2051g(h202.equals("1") ? this.h2051g : "");
        setH2051h(h202.equals("1") ? this.h2051h : "");
        setH2051i(h202.equals("1") ? this.h2051i : "");
        setH2051j(h202.equals("1") ? this.h2051j : "");
        setH205196(h202.equals("1") ? this.h205196 : "");
        notifyPropertyChanged(BR.h202);
    }

    @Bindable
    public String getH203h() {
        return h203h;
    }

    public void setH203h(String h203h) {
        this.h203h = h203h;
        notifyPropertyChanged(BR.h203h);
    }

    @Bindable
    public String getH203d() {
        return h203d;
    }

    public void setH203d(String h203d) {
        this.h203d = h203d;
        notifyPropertyChanged(BR.h203d);
    }

    @Bindable
    public String getH203w() {
        return h203w;
    }

    public void setH203w(String h203w) {
        this.h203w = h203w;
        notifyPropertyChanged(BR.h203w);
    }

    @Bindable
    public String getH204() {
        return h204;
    }

    public void setH204(String h204) {
        this.h204 = h204;
        setH20496x(h204.equals("96") ? this.h20496x : "");
        notifyPropertyChanged(BR.h204);
    }


    @Bindable
    public String getH20496x() {
        return h20496x;
    }

    public void setH20496x(String h20496x) {
        this.h20496x = h20496x;
        notifyPropertyChanged(BR.h20496x);
    }

    @Bindable
    public String getH205() {
        return h205;
    }

    public void setH205(String h205) {
        this.h205 = h205;
        setH20596x(h205.equals("96") ? this.h20596x : "");
        notifyPropertyChanged(BR.h205);
    }

    @Bindable
    public String getH20596x() {
        return h20596x;
    }

    public void setH20596x(String h20596x) {
        this.h20596x = h20596x;
        notifyPropertyChanged(BR.h20596x);
    }


    @Bindable
    public String getH2051a() {
        return h2051a;
    }

    public void setH2051a(String h2051a) {
        this.h2051a = h2051a;
        notifyPropertyChanged(BR.h2051a);
    }

    @Bindable
    public String getH2051b() {
        return h2051b;
    }

    public void setH2051b(String h2051b) {
        this.h2051b = h2051b;
        notifyPropertyChanged(BR.h2051b);
    }

    @Bindable
    public String getH2051c() {
        return h2051c;
    }

    public void setH2051c(String h2051c) {
        this.h2051c = h2051c;
        notifyPropertyChanged(BR.h2051c);
    }

    @Bindable
    public String getH2051d() {
        return h2051d;
    }

    public void setH2051d(String h2051d) {
        this.h2051d = h2051d;
        notifyPropertyChanged(BR.h2051d);
    }

    @Bindable
    public String getH2051e() {
        return h2051e;
    }

    public void setH2051e(String h2051e) {
        this.h2051e = h2051e;
        notifyPropertyChanged(BR.h2051e);
    }

    @Bindable
    public String getH2051f() {
        return h2051f;
    }

    public void setH2051f(String h2051f) {
        this.h2051f = h2051f;
        notifyPropertyChanged(BR.h2051f);
    }

    @Bindable
    public String getH2051g() {
        return h2051g;
    }

    public void setH2051g(String h2051g) {
        this.h2051g = h2051g;
        notifyPropertyChanged(BR.h2051g);
    }

    @Bindable
    public String getH2051h() {
        return h2051h;
    }

    public void setH2051h(String h2051h) {
        this.h2051h = h2051h;
        notifyPropertyChanged(BR.h2051h);
    }

    @Bindable
    public String getH2051i() {
        return h2051i;
    }

    public void setH2051i(String h2051i) {
        this.h2051i = h2051i;
        notifyPropertyChanged(BR.h2051i);
    }

    @Bindable
    public String getH2051j() {
        return h2051j;
    }

    public void setH2051j(String h2051j) {
        this.h2051j = h2051j;
        notifyPropertyChanged(BR.h2051j);
    }

    @Bindable
    public String getH205196() {
        return h205196;
    }

    public void setH205196(String h205196) {
        this.h205196 = h205196;
        setH205196x(h205196.equals("96") ? this.h205196x : "");
        notifyPropertyChanged(BR.h205196);
    }

    @Bindable
    public String getH205196x() {
        return h205196x;
    }

    public void setH205196x(String h205196x) {
        this.h205196x = h205196x;
        notifyPropertyChanged(BR.h205196x);
    }


    @Bindable
    public String getH206() {
        return h206;
    }

    public void setH206(String h206) {
        this.h206 = h206;
        setH20701(h206.equals("1") ? this.h20701 : "");
        setH20702(h206.equals("1") ? this.h20702 : "");
        setH20703(h206.equals("1") ? this.h20703 : "");
        setH20704(h206.equals("1") ? this.h20704 : "");
        setH20705(h206.equals("1") ? this.h20705 : "");
        setH20706(h206.equals("1") ? this.h20706 : "");
        setH20707(h206.equals("1") ? this.h20707 : "");
        setH20708(h206.equals("1") ? this.h20708 : "");
        setH20798(h206.equals("1") ? this.h20798 : "");
        setH20801(h206.equals("1") ? this.h20801 : "");
        setH20802(h206.equals("1") ? this.h20802 : "");
        setH20803(h206.equals("1") ? this.h20803 : "");
        setH20804(h206.equals("1") ? this.h20804 : "");
        setH20805(h206.equals("1") ? this.h20805 : "");
        setH20806(h206.equals("1") ? this.h20806 : "");
        setH20896(h206.equals("1") ? this.h20896 : "");
        setH208a(h206.equals("1") ? this.h208a : "");
        notifyPropertyChanged(BR.h206);
    }


    @Bindable
    public String getH207() {
        return h207;
    }

    public void setH207(String h207) {
        this.h207 = h207;
        notifyPropertyChanged(BR.h207);
    }

    @Bindable
    public String getH20701() {
        return h20701;
    }

    public void setH20701(String h20701) {
        if (this.h20701.equals(h20701)) return;     // For all checkboxes
        this.h20701 = h20701;
        notifyPropertyChanged(BR.h20701);
    }

    @Bindable
    public String getH20702() {
        return h20702;
    }

    public void setH20702(String h20702) {
        if (this.h20702.equals(h20702)) return;     // For all checkboxes
        this.h20702 = h20702;
        notifyPropertyChanged(BR.h20702);
    }

    @Bindable
    public String getH20703() {
        return h20703;
    }

    public void setH20703(String h20703) {
        if (this.h20703.equals(h20703)) return;     // For all checkboxes
        this.h20703 = h20703;
        notifyPropertyChanged(BR.h20703);
    }

    @Bindable
    public String getH20704() {
        return h20704;
    }

    public void setH20704(String h20704) {
        if (this.h20704.equals(h20704)) return;     // For all checkboxes
        this.h20704 = h20704;
        notifyPropertyChanged(BR.h20704);
    }

    @Bindable
    public String getH20705() {
        return h20705;
    }

    public void setH20705(String h20705) {
        if (this.h20705.equals(h20705)) return;     // For all checkboxes
        this.h20705 = h20705;
        notifyPropertyChanged(BR.h20705);
    }

    @Bindable
    public String getH20706() {
        return h20706;
    }

    public void setH20706(String h20706) {
        if (this.h20706.equals(h20706)) return;     // For all checkboxes
        this.h20706 = h20706;
        notifyPropertyChanged(BR.h20706);
    }

    @Bindable
    public String getH20707() {
        return h20707;
    }

    public void setH20707(String h20707) {
        if (this.h20707.equals(h20707)) return;     // For all checkboxes
        this.h20707 = h20707;
        notifyPropertyChanged(BR.h20707);
    }

    @Bindable
    public String getH20708() {
        return h20708;
    }

    public void setH20708(String h20708) {
        if (this.h20708.equals(h20708)) return;     // For all checkboxes
        this.h20708 = h20708;
        notifyPropertyChanged(BR.h20708);
    }

    @Bindable
    public String getH20798() {
        return h20798;
    }

    public void setH20798(String h20798) {
        if (this.h20798.equals(h20798)) return;     // For all checkboxes
        this.h20798 = h20798;
        setH20701(h20798.equals("98") ? "" : this.h20701);
        setH20702(h20798.equals("98") ? "" : this.h20702);
        setH20703(h20798.equals("98") ? "" : this.h20703);
        setH20704(h20798.equals("98") ? "" : this.h20704);
        setH20705(h20798.equals("98") ? "" : this.h20705);
        setH20706(h20798.equals("98") ? "" : this.h20706);
        setH20707(h20798.equals("98") ? "" : this.h20707);
        setH20708(h20798.equals("98") ? "" : this.h20708);
        notifyPropertyChanged(BR.h20798);
    }

    @Bindable
    public String getH208() {
        return h208;
    }

    public void setH208(String h208) {
        this.h208 = h208;
        notifyPropertyChanged(BR.h208);
    }

    @Bindable
    public String getH20801() {
        return h20801;
    }

    public void setH20801(String h20801) {
        if (this.h20801.equals(h20801)) return;     // For all checkboxes
        this.h20801 = h20801;
        notifyPropertyChanged(BR.h20801);
    }

    @Bindable
    public String getH20802() {
        return h20802;
    }

    public void setH20802(String h20802) {
        if (this.h20802.equals(h20802)) return;     // For all checkboxes
        this.h20802 = h20802;
        notifyPropertyChanged(BR.h20802);
    }

    @Bindable
    public String getH20803() {
        return h20803;
    }

    public void setH20803(String h20803) {
        if (this.h20803.equals(h20803)) return;     // For all checkboxes
        this.h20803 = h20803;
        notifyPropertyChanged(BR.h20803);
    }

    @Bindable
    public String getH20804() {
        return h20804;
    }

    public void setH20804(String h20804) {
        if (this.h20804.equals(h20804)) return;     // For all checkboxes
        this.h20804 = h20804;
        notifyPropertyChanged(BR.h20804);
    }

    @Bindable
    public String getH20805() {
        return h20805;
    }

    public void setH20805(String h20805) {
        if (this.h20805.equals(h20805)) return;     // For all checkboxes
        this.h20805 = h20805;
        notifyPropertyChanged(BR.h20805);
    }

    @Bindable
    public String getH20806() {
        return h20806;
    }

    public void setH20806(String h20806) {
        if (this.h20806.equals(h20806)) return;     // For all checkboxes
        this.h20806 = h20806;
        notifyPropertyChanged(BR.h20806);
    }

    @Bindable
    public String getH20896() {
        return h20896;
    }

    public void setH20896(String h20896) {
        if (this.h20896.equals(h20896)) return;     // For all checkboxes
        this.h20896 = h20896;
        setH20896x(h20896.equals("96") ? this.h20896x : "");
        notifyPropertyChanged(BR.h20896);
    }

    @Bindable
    public String getH20896x() {
        return h20896x;
    }

    public void setH20896x(String h20896x) {
        this.h20896x = h20896x;
        notifyPropertyChanged(BR.h20896x);
    }


    @Bindable
    public String getH208a() {
        return h208a;
    }

    public void setH208a(String h208a) {
        this.h208a = h208a;
        notifyPropertyChanged(BR.h208a);
    }

    @Bindable
    public String getH208b() {
        return h208b;
    }

    public void setH208b(String h208b) {
        this.h208b = h208b;
        notifyPropertyChanged(BR.h208b);
    }

    @Bindable
    public String getH208b01() {
        return h208b01;
    }

    public void setH208b01(String h208b01) {
        if (this.h208b01.equals(h208b01)) return;
        this.h208b01 = h208b01;
        notifyPropertyChanged(BR.h208b01);
    }

    @Bindable
    public String getH208b02() {
        return h208b02;
    }

    public void setH208b02(String h208b02) {
        if (this.h208b02.equals(h208b02)) return;
        this.h208b02 = h208b02;
        notifyPropertyChanged(BR.h208b02);
    }

    @Bindable
    public String getH208b03() {
        return h208b03;
    }

    public void setH208b03(String h208b03) {
        if (this.h208b03.equals(h208b03)) return;
        this.h208b03 = h208b03;
        notifyPropertyChanged(BR.h208b03);
    }

    @Bindable
    public String getH208b04() {
        return h208b04;
    }

    public void setH208b04(String h208b04) {
        if (this.h208b04.equals(h208b04)) return;
        this.h208b04 = h208b04;
        notifyPropertyChanged(BR.h208b04);
    }

    @Bindable
    public String getH208b05() {
        return h208b05;
    }

    public void setH208b05(String h208b05) {
        if (this.h208b05.equals(h208b05)) return;
        this.h208b05 = h208b05;
        notifyPropertyChanged(BR.h208b05);
    }

    @Bindable
    public String getH208b06() {
        return h208b06;
    }

    public void setH208b06(String h208b06) {
        if (this.h208b06.equals(h208b06)) return;
        this.h208b06 = h208b06;
        notifyPropertyChanged(BR.h208b06);
    }

    @Bindable
    public String getH208b07() {
        return h208b07;
    }

    public void setH208b07(String h208b07) {
        if (this.h208b07.equals(h208b07)) return;
        this.h208b07 = h208b07;
        notifyPropertyChanged(BR.h208b07);
    }

    @Bindable
    public String getH208b08() {
        return h208b08;
    }

    public void setH208b08(String h208b08) {
        if (this.h208b08.equals(h208b08)) return;
        this.h208b08 = h208b08;
        notifyPropertyChanged(BR.h208b08);
    }

    @Bindable
    public String getH208b09() {
        return h208b09;
    }

    public void setH208b09(String h208b09) {
        if (this.h208b09.equals(h208b09)) return;
        this.h208b09 = h208b09;
        setH208b01(h208b09.equals("9") ? "" : this.h208b01);
        setH208b02(h208b09.equals("9") ? "" : this.h208b02);
        setH208b03(h208b09.equals("9") ? "" : this.h208b03);
        setH208b04(h208b09.equals("9") ? "" : this.h208b04);
        setH208b05(h208b09.equals("9") ? "" : this.h208b05);
        setH208b06(h208b09.equals("9") ? "" : this.h208b06);
        setH208b07(h208b09.equals("9") ? "" : this.h208b07);
        setH208b08(h208b09.equals("9") ? "" : this.h208b08);
        setH208b98(h208b09.equals("9") ? "" : this.h208b98);
        setH208c(h208b09.equals("9") ? "" : this.h208c);
        setH208d(h208b09.equals("9") ? "" : this.h208d);
        notifyPropertyChanged(BR.h208b09);
    }

    @Bindable
    public String getH208b98() {
        return h208b98;
    }

    public void setH208b98(String h208b98) {
        if (this.h208b98.equals(h208b98)) return;
        this.h208b98 = h208b98;
        setH208b01(h208b98.equals("98") ? "" : this.h208b01);
        setH208b02(h208b98.equals("98") ? "" : this.h208b02);
        setH208b03(h208b98.equals("98") ? "" : this.h208b03);
        setH208b04(h208b98.equals("98") ? "" : this.h208b04);
        setH208b05(h208b98.equals("98") ? "" : this.h208b05);
        setH208b06(h208b98.equals("98") ? "" : this.h208b06);
        setH208b07(h208b98.equals("98") ? "" : this.h208b07);
        setH208b08(h208b98.equals("98") ? "" : this.h208b08);
        setH208b09(h208b98.equals("98") ? "" : this.h208b09);
        setH208c(h208b98.equals("98") ? "" : this.h208c);
        setH208d(h208b98.equals("98") ? "" : this.h208d);
        notifyPropertyChanged(BR.h208b98);
    }

    @Bindable
    public String getH208c() {
        return h208c;
    }

    public void setH208c(String h208c) {
        this.h208c = h208c;
        setH208d(h208c.equals("1") ? this.h208d : "");
        notifyPropertyChanged(BR.h208c);
    }

    @Bindable
    public String getH208d() {
        return h208d;
    }

    public void setH208d(String h208d) {
        this.h208d = h208d;
        setH208d96x(h208d.equals("96") ? this.h208d96x : "");
        notifyPropertyChanged(BR.h208d);
    }

    @Bindable
    public String getH208d96x() {
        return h208d96x;
    }

    public void setH208d96x(String h208d96x) {
        this.h208d96x = h208d96x;
        notifyPropertyChanged(BR.h208d96x);
    }


    @Bindable
    public String getH209() {
        return h209;
    }

    public void setH209(String h209) {
        this.h209 = h209;
        setH209a(h209.equals("2") ? this.h209a : "");
        setH210(h209.equals("1") ? this.h210 : "");
        setH21101(h209.equals("1") ? this.h21101 : "");
        setH21102(h209.equals("1") ? this.h21102 : "");
        setH21103(h209.equals("1") ? this.h21103 : "");
        setH21104(h209.equals("1") ? this.h21104 : "");
        setH21105(h209.equals("1") ? this.h21105 : "");
        setH21106(h209.equals("1") ? this.h21106 : "");
        setH21107(h209.equals("1") ? this.h21107 : "");
        setH21108(h209.equals("1") ? this.h21108 : "");
        setH21109(h209.equals("1") ? this.h21109 : "");
        setH21110(h209.equals("1") ? this.h21110 : "");
        setH212(h209.equals("1") ? this.h212 : "");
        setH213(h209.equals("1") ? this.h213 : "");
        notifyPropertyChanged(BR.h209);
    }

    @Bindable
    public String getH209a() {
        return h209a;
    }

    public void setH209a(String h209a) {
        this.h209a = h209a;
        setH209a96x(h209a.equals("96") ? this.h209a96x : "");
        notifyPropertyChanged(BR.h209a);
    }

    @Bindable
    public String getH209a96x() {
        return h209a96x;
    }

    public void setH209a96x(String h209a96x) {
        this.h209a96x = h209a96x;
        notifyPropertyChanged(BR.h209a96x);
    }

    @Bindable
    public String getH210() {
        return h210;
    }

    public void setH210(String h210) {
        this.h210 = h210;
        notifyPropertyChanged(BR.h210);
    }

    @Bindable
    public String getH21101() {
        return h21101;
    }

    public void setH21101(String h21101) {
        if (this.h21101.equals(h21101)) return; // for all checkboxes
        this.h21101 = h21101;
        notifyPropertyChanged(BR.h21101);
    }

    @Bindable
    public String getH21102() {
        return h21102;
    }

    public void setH21102(String h21102) {
        if (this.h21102.equals(h21102)) return; // for all checkboxes
        this.h21102 = h21102;
        notifyPropertyChanged(BR.h21102);
    }

    @Bindable
    public String getH21103() {
        return h21103;
    }

    public void setH21103(String h21103) {
        if (this.h21103.equals(h21103)) return; // for all checkboxes
        this.h21103 = h21103;
        notifyPropertyChanged(BR.h21103);
    }

    @Bindable
    public String getH21104() {
        return h21104;
    }

    public void setH21104(String h21104) {
        if (this.h21104.equals(h21104)) return; // for all checkboxes
        this.h21104 = h21104;
        notifyPropertyChanged(BR.h21104);
    }

    @Bindable
    public String getH21105() {
        return h21105;
    }

    public void setH21105(String h21105) {
        if (this.h21105.equals(h21105)) return; // for all checkboxes
        this.h21105 = h21105;
        notifyPropertyChanged(BR.h21105);
    }

    @Bindable
    public String getH21106() {
        return h21106;
    }

    public void setH21106(String h21106) {
        if (this.h21106.equals(h21106)) return; // for all checkboxes
        this.h21106 = h21106;
        notifyPropertyChanged(BR.h21106);
    }

    @Bindable
    public String getH21107() {
        return h21107;
    }

    public void setH21107(String h21107) {
        if (this.h21107.equals(h21107)) return; // for all checkboxes
        this.h21107 = h21107;
        notifyPropertyChanged(BR.h21107);
    }

    @Bindable
    public String getH21108() {
        return h21108;
    }

    public void setH21108(String h21108) {
        if (this.h21108.equals(h21108)) return; // for all checkboxes
        this.h21108 = h21108;
        notifyPropertyChanged(BR.h21108);
    }

    @Bindable
    public String getH21109() {
        return h21109;
    }

    public void setH21109(String h21109) {
        if (this.h21109.equals(h21109)) return; // for all checkboxes
        this.h21109 = h21109;
        notifyPropertyChanged(BR.h21109);
    }

    @Bindable
    public String getH21110() {
        return h21110;
    }

    public void setH21110(String h21110) {
        if (this.h21110.equals(h21110)) return; // for all checkboxes
        this.h21110 = h21110;
        notifyPropertyChanged(BR.h21110);
    }

    @Bindable
    public String getH212() {
        return h212;
    }

    public void setH212(String h212) {
        this.h212 = h212;
        notifyPropertyChanged(BR.h212);
    }

    @Bindable
    public String getH213() {
        return h213;
    }

    public void setH213(String h213) {
        this.h213 = h213;
        notifyPropertyChanged(BR.h213);
    }

    @Bindable
    public String getH214() {
        return h214;
    }

    public void setH214(String h214) {
        this.h214 = h214;
        setH214a(h214.equals("98") ? "" : this.h214a);
        setH214b01(h214.equals("98") ? "" : this.h214b01);
        setH214b02(h214.equals("98") ? "" : this.h214b02);
        setH214b03(h214.equals("98") ? "" : this.h214b03);
        setH214b04(h214.equals("98") ? "" : this.h214b04);
        setH214b05(h214.equals("98") ? "" : this.h214b05);
        setH214b06(h214.equals("98") ? "" : this.h214b06);
        setH214b96(h214.equals("98") ? "" : this.h214b96);
        setH214b98(h214.equals("98") ? "" : this.h214b98);
        notifyPropertyChanged(BR.h214);
    }

    @Bindable
    public String getH214a() {
        return h214a;
    }

    public void setH214a(String h214a) {
        this.h214a = h214a;
        setH214b01(h214a.equals("2") ? this.h214b01 : "");
        setH214b02(h214a.equals("2") ? this.h214b02 : "");
        setH214b03(h214a.equals("2") ? this.h214b03 : "");
        setH214b04(h214a.equals("2") ? this.h214b04 : "");
        setH214b05(h214a.equals("2") ? this.h214b05 : "");
        setH214b06(h214a.equals("2") ? this.h214b06 : "");
        setH214b96(h214a.equals("2") ? this.h214b96 : "");
        setH214b98(h214a.equals("2") ? this.h214b98 : "");
        notifyPropertyChanged(BR.h214a);
    }

    @Bindable
    public String getH214b() {
        return h214b;
    }

    public void setH214b(String h214b) {
        this.h214b = h214b;
        notifyPropertyChanged(BR.h214b);
    }

    @Bindable
    public String getH214b01() {
        return h214b01;
    }

    public void setH214b01(String h214b01) {
        if (this.h214b01.equals(h214b01)) return;     // For all checkboxes
        this.h214b01 = h214b01;
        notifyPropertyChanged(BR.h214b01);
    }

    @Bindable
    public String getH214b02() {
        return h214b02;
    }

    public void setH214b02(String h214b02) {
        if (this.h214b02.equals(h214b02)) return;     // For all checkboxes
        this.h214b02 = h214b02;
        notifyPropertyChanged(BR.h214b02);
    }

    @Bindable
    public String getH214b03() {
        return h214b03;
    }

    public void setH214b03(String h214b03) {
        if (this.h214b03.equals(h214b03)) return;     // For all checkboxes
        this.h214b03 = h214b03;
        notifyPropertyChanged(BR.h214b03);
    }

    @Bindable
    public String getH214b04() {
        return h214b04;
    }

    public void setH214b04(String h214b04) {
        if (this.h214b04.equals(h214b04)) return;     // For all checkboxes
        this.h214b04 = h214b04;
        notifyPropertyChanged(BR.h214b04);
    }

    @Bindable
    public String getH214b05() {
        return h214b05;
    }

    public void setH214b05(String h214b05) {
        if (this.h214b05.equals(h214b05)) return;     // For all checkboxes
        this.h214b05 = h214b05;
        notifyPropertyChanged(BR.h214b05);
    }

    @Bindable
    public String getH214b06() {
        return h214b06;
    }

    public void setH214b06(String h214b06) {
        if (this.h214b06.equals(h214b06)) return;     // For all checkboxes
        this.h214b06 = h214b06;
        notifyPropertyChanged(BR.h214b06);
    }

    @Bindable
    public String getH214b96() {
        return h214b96;
    }

    public void setH214b96(String h214b96) {
        if (this.h214b96.equals(h214b96)) return;     // For all checkboxes
        this.h214b96 = h214b96;
        setH214b96x(h214b96.equals("96") ? this.h214b96x : "");
        notifyPropertyChanged(BR.h214b96);
    }

    @Bindable
    public String getH214b96x() {
        return h214b96x;
    }

    public void setH214b96x(String h214b96x) {
        this.h214b96x = h214b96x;
        notifyPropertyChanged(BR.h214b96x);
    }

    @Bindable
    public String getH214b98() {
        return h214b98;
    }

    public void setH214b98(String h214b98) {
        if (this.h214b98.equals(h214b98)) return;     // For all checkboxes
        this.h214b98 = h214b98;
        setH214b01(h214b98.equals("98") ? "" : this.h214b01);
        setH214b02(h214b98.equals("98") ? "" : this.h214b02);
        setH214b03(h214b98.equals("98") ? "" : this.h214b03);
        setH214b04(h214b98.equals("98") ? "" : this.h214b04);
        setH214b05(h214b98.equals("98") ? "" : this.h214b05);
        setH214b06(h214b98.equals("98") ? "" : this.h214b06);
        setH214b96(h214b98.equals("98") ? "" : this.h214b96);
        notifyPropertyChanged(BR.h214b98);
    }

    @Bindable
    public String getH215() {
        return h215;
    }

    public void setH215(String h215) {
        this.h215 = h215;
        notifyPropertyChanged(BR.h215);
    }

    @Bindable
    public String getH216() {
        return h216;
    }

    public void setH216(String h216) {
        this.h216 = h216;
        setH216a(h216.equals("1") ? "" : this.h216a);
        notifyPropertyChanged(BR.h216);
    }

    @Bindable
    public String getH216a() {
        return h216a;
    }

    public void setH216a(String h216a) {
        this.h216a = h216a;
        setH216a96x(h216a.equals("96") ? this.h216a96x : "");
        notifyPropertyChanged(BR.h216a);
    }

    @Bindable
    public String getH216a96x() {
        return h216a96x;
    }

    public void setH216a96x(String h216a96x) {
        this.h216a96x = h216a96x;
        notifyPropertyChanged(BR.h216a96x);
    }

    @Bindable
    public String getH217() {
        return h217;
    }

    public void setH217(String h217) {
        this.h217 = h217;
        notifyPropertyChanged(BR.h217);
    }

    @Bindable
    public String getH21701() {
        return h21701;
    }

    public void setH21701(String h21701) {
        if (this.h21701.equals(h21701)) return;     // For all checkboxes
        this.h21701 = h21701;
        notifyPropertyChanged(BR.h21701);
    }

    @Bindable
    public String getH21702() {
        return h21702;
    }

    public void setH21702(String h21702) {
        if (this.h21702.equals(h21702)) return;
        this.h21702 = h21702;
        setH221(h21702.equals("2") || this.h21703.equals("3") || this.h21704.equals("4") ? this.h221 : "");
        setH222(h21702.equals("2") || this.h21703.equals("3") || this.h21704.equals("4") ? this.h222 : "");
        setH223(h21702.equals("2") || this.h21703.equals("3") || this.h21704.equals("4") ? this.h223 : "");
        notifyPropertyChanged(BR.h21702);
    }

    @Bindable
    public String getH21703() {
        return h21703;
    }

    public void setH21703(String h21703) {
        if (this.h21703.equals(h21703)) return;
        this.h21703 = h21703;
        setH221(h21703.equals("3") || this.h21702.equals("2") || this.h21704.equals("4") ? this.h221 : "");
        setH222(h21703.equals("3") || this.h21702.equals("2") || this.h21704.equals("4") ? this.h222 : "");
        setH223(h21703.equals("3") || this.h21702.equals("2") || this.h21704.equals("4") ? this.h223 : "");
        notifyPropertyChanged(BR.h21703);
    }

    @Bindable
    public String getH21704() {
        return h21704;
    }

    public void setH21704(String h21704) {
        if (this.h21704.equals(h21704)) return;
        this.h21704 = h21704;
        setH221(h21704.equals("4") || this.h21702.equals("2") || this.h21703.equals("3") ? this.h221 : "");
        setH222(h21704.equals("4") || this.h21702.equals("2") || this.h21703.equals("3") ? this.h222 : "");
        setH223(h21704.equals("4") || this.h21702.equals("2") || this.h21703.equals("3") ? this.h223 : "");
        notifyPropertyChanged(BR.h21704);
    }

    @Bindable
    public String getH21705() {
        return h21705;
    }

    public void setH21705(String h21705) {
        if (this.h21705.equals(h21705)) return;     // For all checkboxes
        this.h21705 = h21705;
        notifyPropertyChanged(BR.h21705);
    }

    @Bindable
    public String getH21706() {
        return h21706;
    }

    public void setH21706(String h21706) {
        if (this.h21706.equals(h21706)) return;     // For all checkboxes
        this.h21706 = h21706;
        notifyPropertyChanged(BR.h21706);
    }

    @Bindable
    public String getH21796() {
        return h21796;
    }

    public void setH21796(String h21796) {
        if (this.h21796.equals(h21796)) return;     // For all checkboxes
        this.h21796 = h21796;
        setH21796x(h21796.equals("96") ? this.h21796x : "");
        notifyPropertyChanged(BR.h21796);
    }

    @Bindable
    public String getH21796x() {
        return h21796x;
    }

    public void setH21796x(String h21796x) {
        this.h21796x = h21796x;
        notifyPropertyChanged(BR.h21796x);
    }

    @Bindable
    public String getH218() {
        return h218;
    }

    public void setH218(String h218) {
        this.h218 = h218;
        setH219(h218.equals("1") ? this.h219 : "");
        setH2201(h218.equals("1") ? this.h2201 : "");
        setH2202(h218.equals("1") ? this.h2202 : "");
        setH2203(h218.equals("1") ? this.h2203 : "");
        setH2204(h218.equals("1") ? this.h2204 : "");
        setH2205(h218.equals("1") ? this.h2205 : "");
        setH2206(h218.equals("1") ? this.h2206 : "");
        setH22096(h218.equals("1") ? this.h22096 : "");
        setH221(h218.equals("1") ? this.h221 : "");
        setH222(h218.equals("1") ? this.h222 : "");
        setH223(h218.equals("1") ? this.h223 : "");
        notifyPropertyChanged(BR.h218);
    }

    @Bindable
    public String getH219() {
        return h219;
    }

    public void setH219(String h219) {
        this.h219 = h219;
        setH21996x(h219.equals("96") ? this.h21996x : "");
        notifyPropertyChanged(BR.h219);
    }

    @Bindable
    public String getH21996x() {
        return h21996x;
    }

    public void setH21996x(String h21996x) {
        this.h21996x = h21996x;
        notifyPropertyChanged(BR.h21996x);
    }

    @Bindable
    public String getH220() {
        return h220;
    }

    public void setH220(String h220) {
        this.h220 = h220;
        notifyPropertyChanged(BR.h220);
    }

    @Bindable
    public String getH2201() {
        return h2201;
    }

    public void setH2201(String h2201) {
        if (this.h2201.equals(h2201)) return;     // For all checkboxes
        this.h2201 = h2201;
        setH2201x(h2201.equals("1") ? this.h2201x : "");
        notifyPropertyChanged(BR.h2201);
    }

    @Bindable
    public String getH2201x() {
        return h2201x;
    }

    public void setH2201x(String h2201x) {
        this.h2201x = h2201x;
        notifyPropertyChanged(BR.h2201x);
    }

    @Bindable
    public String getH2202() {
        return h2202;
    }

    public void setH2202(String h2202) {
        if (this.h2202.equals(h2202)) return;     // For all checkboxes
        this.h2202 = h2202;
        setH2202x(h2202.equals("2") ? this.h2202x : "");
        notifyPropertyChanged(BR.h2202);
    }

    @Bindable
    public String getH2202x() {
        return h2202x;
    }

    public void setH2202x(String h2202x) {
        this.h2202x = h2202x;
        notifyPropertyChanged(BR.h2202x);
    }

    @Bindable
    public String getH2203() {
        return h2203;
    }

    public void setH2203(String h2203) {
        if (this.h2203.equals(h2203)) return;     // For all checkboxes
        this.h2203 = h2203;
        setH2203x(h2203.equals("3") ? this.h2203x : "");
        notifyPropertyChanged(BR.h2203);
    }

    @Bindable
    public String getH2203x() {
        return h2203x;
    }

    public void setH2203x(String h2203x) {
        this.h2203x = h2203x;
        notifyPropertyChanged(BR.h2203x);
    }

    @Bindable
    public String getH2204() {
        return h2204;
    }

    public void setH2204(String h2204) {
        if (this.h2204.equals(h2204)) return;     // For all checkboxes
        this.h2204 = h2204;
        setH2204x(h2204.equals("4") ? this.h2204x : "");
        notifyPropertyChanged(BR.h2204);
    }

    @Bindable
    public String getH2204x() {
        return h2204x;
    }

    public void setH2204x(String h2204x) {
        this.h2204x = h2204x;
        notifyPropertyChanged(BR.h2204x);
    }

    @Bindable
    public String getH2205() {
        return h2205;
    }

    public void setH2205(String h2205) {
        if (this.h2205.equals(h2205)) return;     // For all checkboxes
        this.h2205 = h2205;
        setH2205x(h2205.equals("5") ? this.h2205x : "");
        notifyPropertyChanged(BR.h2205);
    }

    @Bindable
    public String getH2205x() {
        return h2205x;
    }

    public void setH2205x(String h2205x) {
        this.h2205x = h2205x;
        notifyPropertyChanged(BR.h2205x);
    }

    @Bindable
    public String getH2206() {
        return h2206;
    }

    public void setH2206(String h2206) {
        if (this.h2206.equals(h2206)) return;     // For all checkboxes
        this.h2206 = h2206;
        setH2206x(h2206.equals("6") ? this.h2206x : "");
        notifyPropertyChanged(BR.h2206);
    }

    @Bindable
    public String getH2206x() {
        return h2206x;
    }

    public void setH2206x(String h2206x) {
        this.h2206x = h2206x;
        notifyPropertyChanged(BR.h2206x);
    }

    @Bindable
    public String getH22096() {
        return h22096;
    }

    public void setH22096(String h22096) {
        if (this.h22096.equals(h22096)) return;     // For all checkboxes
        this.h22096 = h22096;
        setH22096x(h22096.equals("96") ? this.h22096x : "");
        notifyPropertyChanged(BR.h22096);
    }

    @Bindable
    public String getH22096x() {
        return h22096x;
    }

    public void setH22096x(String h22096x) {
        this.h22096x = h22096x;
        notifyPropertyChanged(BR.h22096x);
    }

    @Bindable
    public String getH221() {
        return h221;
    }

    public void setH221(String h221) {
        this.h221 = h221;
        setH222(h221.equals("1") ? this.h222 : "");
        setH223(h221.equals("1") ? "" : this.h223);
        notifyPropertyChanged(BR.h221);
    }

    @Bindable
    public String getH222() {
        return h222;
    }

    public void setH222(String h222) {
        this.h222 = h222;
        setH22296x(h222.equals("96") ? this.h22296x : "");
        notifyPropertyChanged(BR.h222);
    }

    @Bindable
    public String getH22296x() {
        return h22296x;
    }

    public void setH22296x(String h22296x) {
        this.h22296x = h22296x;
        notifyPropertyChanged(BR.h22296x);
    }

    @Bindable
    public String getH223() {
        return h223;
    }

    public void setH223(String h223) {
        this.h223 = h223;
        notifyPropertyChanged(BR.h223);
    }

    @Bindable
    public String getK101() {
        return k101;
    }

    public void setK101(String k101) {
        this.k101 = k101;
        setK101a01(k101.equals("1") ? this.k101a01 : "");
        setK101a02(k101.equals("1") ? this.k101a02 : "");
        setK101a03(k101.equals("1") ? this.k101a03 : "");
        setK101a04(k101.equals("1") ? this.k101a04 : "");
        setK101a05(k101.equals("1") ? this.k101a05 : "");
        setK101a06(k101.equals("1") ? this.k101a06 : "");
        setK101a07(k101.equals("1") ? this.k101a07 : "");
        setK101a08(k101.equals("1") ? this.k101a08 : "");
        setK101a09(k101.equals("1") ? this.k101a09 : "");
        setK101a10(k101.equals("1") ? this.k101a10 : "");
        setK101a11(k101.equals("1") ? this.k101a11 : "");
        setK101a12(k101.equals("1") ? this.k101a12 : "");
        setK101a13(k101.equals("1") ? this.k101a13 : "");
        setK101a14(k101.equals("1") ? this.k101a14 : "");
        setK101a15(k101.equals("1") ? this.k101a15 : "");
        setK101a16(k101.equals("1") ? this.k101a16 : "");
        setK101a96(k101.equals("1") ? this.k101a96 : "");
        notifyPropertyChanged(BR.k101);
    }

    @Bindable
    public String getK101a() {
        return k101a;
    }

    public void setK101a(String k101a) {
        this.k101a = k101a;
        notifyPropertyChanged(BR.k101a);
    }

    @Bindable
    public String getK101a01() {
        return k101a01;
    }

    public void setK101a01(String k101a01) {
        if (this.k101a01.equals(k101a01)) return; // for all checkboxes
        this.k101a01 = k101a01;
        notifyPropertyChanged(BR.k101a01);
    }

    @Bindable
    public String getK101a02() {
        return k101a02;
    }

    public void setK101a02(String k101a02) {
        if (this.k101a02.equals(k101a02)) return; // for all checkboxes
        this.k101a02 = k101a02;
        notifyPropertyChanged(BR.k101a02);
    }

    @Bindable
    public String getK101a03() {
        return k101a03;
    }

    public void setK101a03(String k101a03) {
        if (this.k101a03.equals(k101a03)) return; // for all checkboxes
        this.k101a03 = k101a03;
        notifyPropertyChanged(BR.k101a03);
    }

    @Bindable
    public String getK101a04() {
        return k101a04;
    }

    public void setK101a04(String k101a04) {
        if (this.k101a04.equals(k101a04)) return; // for all checkboxes
        this.k101a04 = k101a04;
        notifyPropertyChanged(BR.k101a04);
    }

    @Bindable
    public String getK101a05() {
        return k101a05;
    }

    public void setK101a05(String k101a05) {
        if (this.k101a05.equals(k101a05)) return; // for all checkboxes
        this.k101a05 = k101a05;
        notifyPropertyChanged(BR.k101a05);
    }

    @Bindable
    public String getK101a06() {
        return k101a06;
    }

    public void setK101a06(String k101a06) {
        if (this.k101a06.equals(k101a06)) return; // for all checkboxes
        this.k101a06 = k101a06;
        notifyPropertyChanged(BR.k101a06);
    }

    @Bindable
    public String getK101a07() {
        return k101a07;
    }

    public void setK101a07(String k101a07) {
        if (this.k101a07.equals(k101a07)) return; // for all checkboxes
        this.k101a07 = k101a07;
        notifyPropertyChanged(BR.k101a07);
    }

    @Bindable
    public String getK101a08() {
        return k101a08;
    }

    public void setK101a08(String k101a08) {
        if (this.k101a08.equals(k101a08)) return; // for all checkboxes
        this.k101a08 = k101a08;
        notifyPropertyChanged(BR.k101a08);
    }

    @Bindable
    public String getK101a09() {
        return k101a09;
    }

    public void setK101a09(String k101a09) {
        if (this.k101a09.equals(k101a09)) return; // for all checkboxes
        this.k101a09 = k101a09;
        notifyPropertyChanged(BR.k101a09);
    }

    @Bindable
    public String getK101a10() {
        return k101a10;
    }

    public void setK101a10(String k101a10) {
        if (this.k101a10.equals(k101a10)) return; // for all checkboxes
        this.k101a10 = k101a10;
        notifyPropertyChanged(BR.k101a10);
    }

    @Bindable
    public String getK101a11() {
        return k101a11;
    }

    public void setK101a11(String k101a11) {
        if (this.k101a11.equals(k101a11)) return; // for all checkboxes
        this.k101a11 = k101a11;
        notifyPropertyChanged(BR.k101a11);
    }

    @Bindable
    public String getK101a12() {
        return k101a12;
    }

    public void setK101a12(String k101a12) {
        if (this.k101a12.equals(k101a12)) return; // for all checkboxes
        this.k101a12 = k101a12;
        notifyPropertyChanged(BR.k101a12);
    }

    @Bindable
    public String getK101a13() {
        return k101a13;
    }

    public void setK101a13(String k101a13) {
        if (this.k101a13.equals(k101a13)) return; // for all checkboxes
        this.k101a13 = k101a13;
        notifyPropertyChanged(BR.k101a13);
    }

    @Bindable
    public String getK101a14() {
        return k101a14;
    }

    public void setK101a14(String k101a14) {
        if (this.k101a14.equals(k101a14)) return; // for all checkboxes
        this.k101a14 = k101a14;
        notifyPropertyChanged(BR.k101a14);
    }

    @Bindable
    public String getK101a15() {
        return k101a15;
    }

    public void setK101a15(String k101a15) {
        if (this.k101a15.equals(k101a15)) return; // for all checkboxes
        this.k101a15 = k101a15;
        notifyPropertyChanged(BR.k101a15);
    }

    @Bindable
    public String getK101a16() {
        return k101a16;
    }

    public void setK101a16(String k101a16) {
        if (this.k101a16.equals(k101a16)) return; // for all checkboxes
        this.k101a16 = k101a16;
        notifyPropertyChanged(BR.k101a16);
    }

    @Bindable
    public String getK101a96() {
        return k101a96;
    }

    public void setK101a96(String k101a96) {
        if (this.k101a96.equals(k101a96)) return; // for all checkboxes
        this.k101a96 = k101a96;
        setK101a96x(k101a96.equals("96") ? this.k101a96x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k101a96);
    }

    @Bindable
    public String getK101a96x() {
        return k101a96x;
    }

    public void setK101a96x(String k101a96x) {
        this.k101a96x = k101a96x;
        notifyPropertyChanged(BR.k101a96x);
    }

    @Bindable
    public String getK101b() {
        return k101b;
    }

    public void setK101b(String k101b) {
        this.k101b = k101b;
        notifyPropertyChanged(BR.k101b);
    }

    @Bindable
    public String getK102() {
        return k102;
    }

    public void setK102(String k102) {
        this.k102 = k102;
        setK103(k102.equals("1") ? this.k103 : "");
        setK10401(k102.equals("1") ? this.k10401 : "");
        setK10402(k102.equals("1") ? this.k10402 : "");
        setK10403(k102.equals("1") ? this.k10403 : "");
        setK10404(k102.equals("1") ? this.k10404 : "");
        setK10405(k102.equals("1") ? this.k10405 : "");
        setK10406(k102.equals("1") ? this.k10406 : "");
        setK10477(k102.equals("1") ? this.k10477 : "");
        setK10408(k102.equals("1") ? this.k10408 : "");
        setK10409(k102.equals("1") ? this.k10409 : "");
        setK10410(k102.equals("1") ? this.k10410 : "");
        setK10411(k102.equals("1") ? this.k10411 : "");
        setK10412(k102.equals("1") ? this.k10412 : "");
        setK10413(k102.equals("1") ? this.k10413 : "");
        setK105(k102.equals("1") ? this.k105 : "");
        setK105a(k102.equals("1") ? this.k105a : "");
        setK10601(k102.equals("2") || this.k105a.equals("99") ? this.k10601 : "");
        setK10602(k102.equals("2") || this.k105a.equals("99") ? this.k10602 : "");
        setK10603(k102.equals("2") || this.k105a.equals("99") ? this.k10603 : "");
        setK10604(k102.equals("2") || this.k105a.equals("99") ? this.k10604 : "");
        setK10605(k102.equals("2") || this.k105a.equals("99") ? this.k10605 : "");
        setK10606(k102.equals("2") || this.k105a.equals("99") ? this.k10606 : "");
        setK10607(k102.equals("2") || this.k105a.equals("99") ? this.k10607 : "");
        setK10608(k102.equals("2") || this.k105a.equals("99") ? this.k10608 : "");
        setK10696(k102.equals("2") || this.k105a.equals("99") ? this.k10696 : "");
        notifyPropertyChanged(BR.k102);
    }

    @Bindable
    public String getK103() {
        return k103;
    }

    public void setK103(String k103) {
        this.k103 = k103;
        setK103a01(k103.equals("1") ? this.k103a01 : "");
        setK103a02(k103.equals("1") ? this.k103a02 : "");
        setK103a03(k103.equals("1") ? this.k103a03 : "");
        setK103a04(k103.equals("1") ? this.k103a04 : "");
        setK103a05(k103.equals("1") ? this.k103a05 : "");
        setK103a06(k103.equals("1") ? this.k103a06 : "");
        setK103a07(k103.equals("1") ? this.k103a07 : "");
        setK103a08(k103.equals("1") ? this.k103a08 : "");
        setK103a09(k103.equals("1") ? this.k103a09 : "");
        setK103a10(k103.equals("1") ? this.k103a10 : "");
        setK103a11(k103.equals("1") ? this.k103a11 : "");
        setK103a12(k103.equals("1") ? this.k103a12 : "");
        setK103a13(k103.equals("1") ? this.k103a13 : "");
        notifyPropertyChanged(BR.k103);
    }

    @Bindable
    public String getK103a01() {
        return k103a01;
    }

    public void setK103a01(String k103a01) {
        if (this.k103a01.equals(k103a01)) return; // for all checkboxes
        this.k103a01 = k103a01;
        notifyPropertyChanged(BR.k103a01);
    }

    @Bindable
    public String getK103a02() {
        return k103a02;
    }

    public void setK103a02(String k103a02) {
        if (this.k103a02.equals(k103a02)) return; // for all checkboxes
        this.k103a02 = k103a02;
        notifyPropertyChanged(BR.k103a02);
    }

    @Bindable
    public String getK103a03() {
        return k103a03;
    }

    public void setK103a03(String k103a03) {
        if (this.k103a03.equals(k103a03)) return; // for all checkboxes
        this.k103a03 = k103a03;
        notifyPropertyChanged(BR.k103a03);
    }

    @Bindable
    public String getK103a04() {
        return k103a04;
    }

    public void setK103a04(String k103a04) {
        if (this.k103a04.equals(k103a04)) return; // for all checkboxes
        this.k103a04 = k103a04;
        notifyPropertyChanged(BR.k103a04);
    }

    @Bindable
    public String getK103a05() {
        return k103a05;
    }

    public void setK103a05(String k103a05) {
        if (this.k103a05.equals(k103a05)) return; // for all checkboxes
        this.k103a05 = k103a05;
        notifyPropertyChanged(BR.k103a05);
    }

    @Bindable
    public String getK103a06() {
        return k103a06;
    }

    public void setK103a06(String k103a06) {
        if (this.k103a06.equals(k103a06)) return; // for all checkboxes
        this.k103a06 = k103a06;
        notifyPropertyChanged(BR.k103a06);
    }

    @Bindable
    public String getK103a07() {
        return k103a07;
    }

    public void setK103a07(String k103a07) {
        if (this.k103a07.equals(k103a07)) return; // for all checkboxes
        this.k103a07 = k103a07;
        notifyPropertyChanged(BR.k103a07);
    }

    @Bindable
    public String getK103a08() {
        return k103a08;
    }

    public void setK103a08(String k103a08) {
        if (this.k103a08.equals(k103a08)) return; // for all checkboxes
        this.k103a08 = k103a08;
        notifyPropertyChanged(BR.k103a08);
    }

    @Bindable
    public String getK103a09() {
        return k103a09;
    }

    public void setK103a09(String k103a09) {
        if (this.k103a09.equals(k103a09)) return; // for all checkboxes
        this.k103a09 = k103a09;
        notifyPropertyChanged(BR.k103a09);
    }

    @Bindable
    public String getK103a10() {
        return k103a10;
    }

    public void setK103a10(String k103a10) {
        if (this.k103a10.equals(k103a10)) return; // for all checkboxes
        this.k103a10 = k103a10;
        notifyPropertyChanged(BR.k103a10);
    }

    @Bindable
    public String getK103a11() {
        return k103a11;
    }

    public void setK103a11(String k103a11) {
        if (this.k103a11.equals(k103a11)) return; // for all checkboxes
        this.k103a11 = k103a11;
        notifyPropertyChanged(BR.k103a11);
    }

    @Bindable
    public String getK103a12() {
        return k103a12;
    }

    public void setK103a12(String k103a12) {
        if (this.k103a12.equals(k103a12)) return; // for all checkboxes
        this.k103a12 = k103a12;
        notifyPropertyChanged(BR.k103a12);
    }

    @Bindable
    public String getK103a13() {
        return k103a13;
    }

    public void setK103a13(String k103a13) {
        if (this.k103a13.equals(k103a13)) return; // for all checkboxes
        this.k103a13 = k103a13;
        notifyPropertyChanged(BR.k103a13);
    }


    @Bindable
    public String getK104() {
        return k104;
    }

    public void setK104(String k104) {
        this.k104 = k104;
        notifyPropertyChanged(BR.k104);
    }

    @Bindable
    public String getK10401() {
        return k10401;
    }

    public void setK10401(String k10401) {
        if (this.k10401.equals(k10401)) return; // for all checkboxes
        this.k10401 = k10401;
        notifyPropertyChanged(BR.k10401);
    }

    @Bindable
    public String getK10402() {
        return k10402;
    }

    public void setK10402(String k10402) {
        if (this.k10402.equals(k10402)) return; // for all checkboxes
        this.k10402 = k10402;
        notifyPropertyChanged(BR.k10402);
    }

    @Bindable
    public String getK10403() {
        return k10403;
    }

    public void setK10403(String k10403) {
        if (this.k10403.equals(k10403)) return; // for all checkboxes
        this.k10403 = k10403;
        notifyPropertyChanged(BR.k10403);
    }

    @Bindable
    public String getK10404() {
        return k10404;
    }

    public void setK10404(String k10404) {
        if (this.k10404.equals(k10404)) return; // for all checkboxes
        this.k10404 = k10404;
        notifyPropertyChanged(BR.k10404);
    }

    @Bindable
    public String getK10405() {
        return k10405;
    }

    public void setK10405(String k10405) {
        if (this.k10405.equals(k10405)) return; // for all checkboxes
        this.k10405 = k10405;
        notifyPropertyChanged(BR.k10405);
    }

    @Bindable
    public String getK10406() {
        return k10406;
    }

    public void setK10406(String k10406) {
        if (this.k10406.equals(k10406)) return; // for all checkboxes
        this.k10406 = k10406;
        notifyPropertyChanged(BR.k10406);
    }

    @Bindable
    public String getK10477() {
        return k10477;
    }

    public void setK10477(String k10477) {
        if (this.k10477.equals(k10477)) return; // for all checkboxes
        this.k10477 = k10477;
        notifyPropertyChanged(BR.k10477);
    }

    @Bindable
    public String getK10408() {
        return k10408;
    }

    public void setK10408(String k10408) {
        if (this.k10408.equals(k10408)) return; // for all checkboxes
        this.k10408 = k10408;
        notifyPropertyChanged(BR.k10408);
    }

    @Bindable
    public String getK10409() {
        return k10409;
    }

    public void setK10409(String k10409) {
        if (this.k10409.equals(k10409)) return; // for all checkboxes
        this.k10409 = k10409;
        notifyPropertyChanged(BR.k10409);
    }

    @Bindable
    public String getK10410() {
        return k10410;
    }

    public void setK10410(String k10410) {
        if (this.k10410.equals(k10410)) return; // for all checkboxes
        this.k10410 = k10410;
        notifyPropertyChanged(BR.k10410);
    }

    @Bindable
    public String getK10411() {
        return k10411;
    }

    public void setK10411(String k10411) {
        if (this.k10411.equals(k10411)) return; // for all checkboxes
        this.k10411 = k10411;
        notifyPropertyChanged(BR.k10411);
    }

    @Bindable
    public String getK10412() {
        return k10412;
    }

    public void setK10412(String k10412) {
        if (this.k10412.equals(k10412)) return; // for all checkboxes
        this.k10412 = k10412;
        notifyPropertyChanged(BR.k10412);
    }

    @Bindable
    public String getK10413() {
        return k10413;
    }

    public void setK10413(String k10413) {
        if (this.k10413.equals(k10413)) return; // for all checkboxes
        this.k10413 = k10413;
        notifyPropertyChanged(BR.k10413);
    }

    @Bindable
    public String getK105() {
        return k105;
    }

    public void setK105(String k105) {
        this.k105 = k105;
        notifyPropertyChanged(BR.k105);
    }

    @Bindable
    public String getK105a() {
        return k105a;
    }

    public void setK105a(String k105a) {
        this.k105a = k105a;
        setK105a01x(k105a.equals("1") ? this.k105a01x : "");
        setK105a02x(k105a.equals("2") ? this.k105a02x : "");
        setK105b(k105a.equals("1") || k105a.equals("2") ? this.k105b : "");
        setK105dm(k105a.equals("99") ? this.k105dm : "");
        setK105dy(k105a.equals("99") ? this.k105dy : "");
        setK10601(k105a.equals("99") || this.k102.equals("2") ? this.k10601 : "");
        setK10602(k105a.equals("99") || this.k102.equals("2") ? this.k10602 : "");
        setK10603(k105a.equals("99") || this.k102.equals("2") ? this.k10603 : "");
        setK10604(k105a.equals("99") || this.k102.equals("2") ? this.k10604 : "");
        setK10605(k105a.equals("99") || this.k102.equals("2") ? this.k10605 : "");
        setK10606(k105a.equals("99") || this.k102.equals("2") ? this.k10606 : "");
        setK10607(k105a.equals("99") || this.k102.equals("2") ? this.k10607 : "");
        setK10608(k105a.equals("99") || this.k102.equals("2") ? this.k10608 : "");
        setK10696(k105a.equals("99") || this.k102.equals("2") ? this.k10696 : "");
        notifyPropertyChanged(BR.k105a);
    }

    @Bindable
    public String getK105a01x() {
        return k105a01x;
    }

    public void setK105a01x(String k105a01x) {
        this.k105a01x = k105a01x;
        notifyPropertyChanged(BR.k105a01x);
    }

    @Bindable
    public String getK105a02x() {
        return k105a02x;
    }

    public void setK105a02x(String k105a02x) {
        this.k105a02x = k105a02x;
        notifyPropertyChanged(BR.k105a02x);
    }


    @Bindable
    public String getK105b() {
        return k105b;
    }

    public void setK105b(String k105b) {
        this.k105b = k105b;
        setK105c01(k105b.equals("1") ? this.k105c01 : "");
        setK105c02(k105b.equals("1") ? this.k105c02 : "");
        setK105c03(k105b.equals("1") ? this.k105c03 : "");
        setK105c04(k105b.equals("1") ? this.k105c04 : "");
        setK105c05(k105b.equals("1") ? this.k105c05 : "");
        setK105c06(k105b.equals("1") ? this.k105c06 : "");
        setK105c07(k105b.equals("1") ? this.k105c07 : "");
        setK105c08(k105b.equals("1") ? this.k105c08 : "");
        setK105c09(k105b.equals("1") ? this.k105c09 : "");
        setK105c96(k105b.equals("1") ? this.k105c96 : "");
        notifyPropertyChanged(BR.k105b);
    }

    @Bindable
    public String getK105c01() {
        return k105c01;
    }

    public void setK105c01(String k105c01) {
        if (this.k105c01.equals(k105c01)) return; // for all checkboxes
        this.k105c01 = k105c01;
        notifyPropertyChanged(BR.k105c01);
    }

    @Bindable
    public String getK105c02() {
        return k105c02;
    }

    public void setK105c02(String k105c02) {
        if (this.k105c02.equals(k105c02)) return; // for all checkboxes
        this.k105c02 = k105c02;
        notifyPropertyChanged(BR.k105c02);
    }

    @Bindable
    public String getK105c03() {
        return k105c03;
    }

    public void setK105c03(String k105c03) {
        if (this.k105c03.equals(k105c03)) return; // for all checkboxes
        this.k105c03 = k105c03;
        notifyPropertyChanged(BR.k105c03);
    }

    @Bindable
    public String getK105c04() {
        return k105c04;
    }

    public void setK105c04(String k105c04) {
        if (this.k105c04.equals(k105c04)) return; // for all checkboxes
        this.k105c04 = k105c04;
        notifyPropertyChanged(BR.k105c04);
    }

    @Bindable
    public String getK105c05() {
        return k105c05;
    }

    public void setK105c05(String k105c05) {
        if (this.k105c05.equals(k105c05)) return; // for all checkboxes
        this.k105c05 = k105c05;
        notifyPropertyChanged(BR.k105c05);
    }

    @Bindable
    public String getK105c06() {
        return k105c06;
    }

    public void setK105c06(String k105c06) {
        if (this.k105c06.equals(k105c06)) return; // for all checkboxes
        this.k105c06 = k105c06;
        notifyPropertyChanged(BR.k105c06);
    }

    @Bindable
    public String getK105c07() {
        return k105c07;
    }

    public void setK105c07(String k105c07) {
        if (this.k105c07.equals(k105c07)) return; // for all checkboxes
        this.k105c07 = k105c07;
        notifyPropertyChanged(BR.k105c07);
    }

    @Bindable
    public String getK105c08() {
        return k105c08;
    }

    public void setK105c08(String k105c08) {
        if (this.k105c08.equals(k105c08)) return; // for all checkboxes
        this.k105c08 = k105c08;
        notifyPropertyChanged(BR.k105c08);
    }

    @Bindable
    public String getK105c09() {
        return k105c09;
    }

    public void setK105c09(String k105c09) {
        if (this.k105c09.equals(k105c09)) return; // for all checkboxes
        this.k105c09 = k105c09;
        notifyPropertyChanged(BR.k105c09);
    }

    @Bindable
    public String getK105c96() {
        return k105c96;
    }

    public void setK105c96(String k105c96) {
        if (this.k105c96.equals(k105c96)) return;
        this.k105c96 = k105c96;
        setK105c96x(k105c96.equals("96") ? this.k105c96x : "");
        notifyPropertyChanged(BR.k105c96);
    }

    @Bindable
    public String getK105c96x() {
        return k105c96x;
    }

    public void setK105c96x(String k105c96x) {
        this.k105c96x = k105c96x;
        notifyPropertyChanged(BR.k105c96x);
    }

    @Bindable
    public String getK105dm() {
        return k105dm;
    }

    public void setK105dm(String k105dm) {
        this.k105dm = k105dm;
        notifyPropertyChanged(BR.k105dm);
    }

    @Bindable
    public String getK105dy() {
        return k105dy;
    }

    public void setK105dy(String k105dy) {
        this.k105dy = k105dy;
        notifyPropertyChanged(BR.k105dy);
    }

    @Bindable
    public String getK106() {
        return k106;
    }

    public void setK106(String k106) {
        this.k106 = k106;
        notifyPropertyChanged(BR.k106);
    }

    @Bindable
    public String getK10601() {
        return k10601;
    }

    public void setK10601(String k10601) {
        if (this.k10601.equals(k10601)) return; // for all checkboxes
        this.k10601 = k10601;
        notifyPropertyChanged(BR.k10601);
    }

    @Bindable
    public String getK10602() {
        return k10602;
    }

    public void setK10602(String k10602) {
        if (this.k10602.equals(k10602)) return; // for all checkboxes
        this.k10602 = k10602;
        notifyPropertyChanged(BR.k10602);
    }

    @Bindable
    public String getK10603() {
        return k10603;
    }

    public void setK10603(String k10603) {
        if (this.k10603.equals(k10603)) return; // for all checkboxes
        this.k10603 = k10603;
        notifyPropertyChanged(BR.k10603);
    }

    @Bindable
    public String getK10604() {
        return k10604;
    }

    public void setK10604(String k10604) {
        if (this.k10604.equals(k10604)) return; // for all checkboxes
        this.k10604 = k10604;
        notifyPropertyChanged(BR.k10604);
    }

    @Bindable
    public String getK10605() {
        return k10605;
    }

    public void setK10605(String k10605) {
        if (this.k10605.equals(k10605)) return; // for all checkboxes
        this.k10605 = k10605;
        notifyPropertyChanged(BR.k10605);
    }

    @Bindable
    public String getK10606() {
        return k10606;
    }

    public void setK10606(String k10606) {
        if (this.k10606.equals(k10606)) return; // for all checkboxes
        this.k10606 = k10606;
        notifyPropertyChanged(BR.k10606);
    }

    @Bindable
    public String getK10607() {
        return k10607;
    }

    public void setK10607(String k10607) {
        if (this.k10607.equals(k10607)) return; // for all checkboxes
        this.k10607 = k10607;
        notifyPropertyChanged(BR.k10607);
    }

    @Bindable
    public String getK10608() {
        return k10608;
    }

    public void setK10608(String k10608) {
        if (this.k10608.equals(k10608)) return; // for all checkboxes
        this.k10608 = k10608;
        notifyPropertyChanged(BR.k10608);
    }

    @Bindable
    public String getK10696() {
        return k10696;
    }

    public void setK10696(String k10696) {
        if (this.k10696.equals(k10696)) return; // for all checkboxes
        this.k10696 = k10696;
        setK10696x(k10696.equals("96") ? this.k10696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k10696);
    }

    @Bindable
    public String getK10696x() {
        return k10696x;
    }

    public void setK10696x(String k10696x) {
        this.k10696x = k10696x;
        notifyPropertyChanged(BR.k10696x);
    }


    @Bindable
    public String getK107() {
        return k107;
    }

    public void setK107(String k107) {
        this.k107 = k107;
        setK107a01(k107.equals("1") ? "" : this.k107a01);
        setK107a02(k107.equals("1") ? "" : this.k107a02);
        setK107a03(k107.equals("1") ? "" : this.k107a03);
        setK107a04(k107.equals("1") ? "" : this.k107a04);
        setK107a05(k107.equals("1") ? "" : this.k107a05);
        setK107a06(k107.equals("1") ? "" : this.k107a06);
        setK107a07(k107.equals("1") ? "" : this.k107a07);
        setK107a08(k107.equals("1") ? "" : this.k107a08);
        setK107a99(k107.equals("1") ? "" : this.k107a99);
        notifyPropertyChanged(BR.k107);
    }

    @Bindable
    public String getK107a() {
        return k107a;
    }

    public void setK107a(String k107a) {
        this.k107a = k107a;
        notifyPropertyChanged(BR.k107a);
    }

    @Bindable
    public String getK107a01() {
        return k107a01;
    }

    public void setK107a01(String k107a01) {
        if (this.k107a01.equals(k107a01)) return;
        this.k107a01 = k107a01;
        notifyPropertyChanged(BR.k107a01);
    }

    @Bindable
    public String getK107a02() {
        return k107a02;
    }

    public void setK107a02(String k107a02) {
        if (this.k107a02.equals(k107a02)) return;
        this.k107a02 = k107a02;
        notifyPropertyChanged(BR.k107a02);
    }

    @Bindable
    public String getK107a03() {
        return k107a03;
    }

    public void setK107a03(String k107a03) {
        if (this.k107a03.equals(k107a03)) return;
        this.k107a03 = k107a03;
        notifyPropertyChanged(BR.k107a03);
    }

    @Bindable
    public String getK107a04() {
        return k107a04;
    }

    public void setK107a04(String k107a04) {
        if (this.k107a04.equals(k107a04)) return;
        this.k107a04 = k107a04;
        notifyPropertyChanged(BR.k107a04);
    }

    @Bindable
    public String getK107a05() {
        return k107a05;
    }

    public void setK107a05(String k107a05) {
        if (this.k107a05.equals(k107a05)) return;
        this.k107a05 = k107a05;
        notifyPropertyChanged(BR.k107a05);
    }

    @Bindable
    public String getK107a06() {
        return k107a06;
    }

    public void setK107a06(String k107a06) {
        if (this.k107a06.equals(k107a06)) return;
        this.k107a06 = k107a06;
        notifyPropertyChanged(BR.k107a06);
    }

    @Bindable
    public String getK107a07() {
        return k107a07;
    }

    public void setK107a07(String k107a07) {
        if (this.k107a07.equals(k107a07)) return;
        this.k107a07 = k107a07;
        notifyPropertyChanged(BR.k107a07);
    }

    @Bindable
    public String getK107a08() {
        return k107a08;
    }

    public void setK107a08(String k107a08) {
        if (this.k107a08.equals(k107a08)) return;
        this.k107a08 = k107a08;
        notifyPropertyChanged(BR.k107a08);
    }

    @Bindable
    public String getK107a99() {
        return k107a99;
    }

    public void setK107a99(String k107a99) {
        if (this.k107a99.equals(k107a99)) return;
        this.k107a99 = k107a99;
        setK107a01(k107a99.equals("99") ? "" : this.k107a01);
        setK107a02(k107a99.equals("99") ? "" : this.k107a02);
        setK107a03(k107a99.equals("99") ? "" : this.k107a03);
        setK107a04(k107a99.equals("99") ? "" : this.k107a04);
        setK107a05(k107a99.equals("99") ? "" : this.k107a05);
        setK107a06(k107a99.equals("99") ? "" : this.k107a06);
        setK107a07(k107a99.equals("99") ? "" : this.k107a07);
        setK107a08(k107a99.equals("99") ? "" : this.k107a08);
        notifyPropertyChanged(BR.k107a99);
    }

    @Bindable
    public String getK108() {
        return k108;
    }

    public void setK108(String k108) {
        this.k108 = k108;
        setK108a(k108.equals("1") ? "" : this.k108a);
        notifyPropertyChanged(BR.k108);
    }

    @Bindable
    public String getK108a() {
        return k108a;
    }

    public void setK108a(String k108a) {
        this.k108a = k108a;
        notifyPropertyChanged(BR.k108a);
    }

    @Bindable
    public String getK109() {
        return k109;
    }

    public void setK109(String k109) {
        this.k109 = k109;
        notifyPropertyChanged(BR.k109);
    }


    @Bindable
    public String getL101() {
        return l101;
    }

    public void setL101(String l101) {
        this.l101 = l101;
        notifyPropertyChanged(BR.l101);
    }

    @Bindable
    public String getL102() {
        return l102;
    }

    public void setL102(String l102) {
        this.l102 = l102;
        setL102a(l102.equals("2") ? this.l102a : "");
        setL103(l102.equals("2") ? this.l103 : "");
        notifyPropertyChanged(BR.l102);
    }

    @Bindable
    public String getL102a() {
        return l102a;
    }

    public void setL102a(String l102a) {
        this.l102a = l102a;
        setL102a96x(l102a.equals("96") ? this.l102a96x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l102a);
    }

    @Bindable
    public String getL102a96x() {
        return l102a96x;
    }

    public void setL102a96x(String l102a96x) {
        this.l102a96x = l102a96x;
        notifyPropertyChanged(BR.l102a96x);
    }

    @Bindable
    public String getL103() {
        return l103;
    }

    public void setL103(String l103) {
        this.l103 = l103;
        setL104(l103.equals("1") ? this.l104 : "");
        setL105(l103.equals("1") ? this.l105 : "");
        setL106(l103.equals("1") ? this.l106 : "");
        notifyPropertyChanged(BR.l103);
    }

    @Bindable
    public String getL104() {
        return l104;
    }

    public void setL104(String l104) {
        this.l104 = l104;
        setL10496x(l104.equals("96") ? this.l10496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l104);
    }

    @Bindable
    public String getL10496x() {
        return l10496x;
    }

    public void setL10496x(String l10496x) {
        this.l10496x = l10496x;
        notifyPropertyChanged(BR.l10496x);
    }

    @Bindable
    public String getL105() {
        return l105;
    }

    public void setL105(String l105) {
        this.l105 = l105;
        setL106(l105.equals("3") || l105.equals("1") ? this.l106 : "");
        setL107(l105.equals("3") || l105.equals("1") ? this.l107 : "");
        notifyPropertyChanged(BR.l105);
    }

    @Bindable
    public String getL106() {
        return l106;
    }

    public void setL106(String l106) {
        this.l106 = l106;
        setL10696x(l106.equals("96") ? this.l10696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l106);
    }

    @Bindable
    public String getL10696x() {
        return l10696x;
    }

    public void setL10696x(String l10696x) {
        this.l10696x = l10696x;
        notifyPropertyChanged(BR.l10696x);
    }

    @Bindable
    public String getL107() {
        return l107;
    }

    public void setL107(String l107) {
        this.l107 = l107;
        setL10796x(l107.equals("96") ? this.l10796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l107);
    }

    @Bindable
    public String getL10796x() {
        return l10796x;
    }

    public void setL10796x(String l10796x) {
        this.l10796x = l10796x;
        notifyPropertyChanged(BR.l10796x);
    }

    @Bindable
    public String getL108() {
        return l108;
    }

    public void setL108(String l108) {
        this.l108 = l108;
        setL10896x(l108.equals("96") ? this.l10896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l108);
    }

    @Bindable
    public String getL10896x() {
        return l10896x;
    }

    public void setL10896x(String l10896x) {
        this.l10896x = l10896x;
        notifyPropertyChanged(BR.l10896x);
    }

    @Bindable
    public String getL109() {
        return l109;
    }

    public void setL109(String l109) {
        this.l109 = l109;
        setL10996x(l109.equals("96") ? this.l10996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l109);
    }

    @Bindable
    public String getL10996x() {
        return l10996x;
    }

    public void setL10996x(String l10996x) {
        this.l10996x = l10996x;
        notifyPropertyChanged(BR.l10996x);
    }

    @Bindable
    public String getL110() {
        return l110;
    }

    public void setL110(String l110) {
        this.l110 = l110;
        setL111(l110.equals("4") ? "" : this.l111);
        notifyPropertyChanged(BR.l110);
    }

    @Bindable
    public String getL111() {
        return l111;
    }

    public void setL111(String l111) {
        this.l111 = l111;
        notifyPropertyChanged(BR.l111);
    }

    @Bindable
    public String getL1121() {
        return l1121;
    }

    public void setL1121(String l1121) {
        this.l1121 = l1121;
        notifyPropertyChanged(BR.l1121);
    }

    @Bindable
    public String getL1122() {
        return l1122;
    }

    public void setL1122(String l1122) {
        this.l1122 = l1122;
        notifyPropertyChanged(BR.l1122);
    }

    @Bindable
    public String getL1123() {
        return l1123;
    }

    public void setL1123(String l1123) {
        this.l1123 = l1123;
        notifyPropertyChanged(BR.l1123);
    }

    @Bindable
    public String getL1124() {
        return l1124;
    }

    public void setL1124(String l1124) {
        this.l1124 = l1124;
        notifyPropertyChanged(BR.l1124);
    }

    @Bindable
    public String getL1125() {
        return l1125;
    }

    public void setL1125(String l1125) {
        this.l1125 = l1125;
        notifyPropertyChanged(BR.l1125);
    }

    @Bindable
    public String getLg101() {
        return lg101;
    }

    public void setLg101(String lg101) {
        this.lg101 = lg101;
        setLg10201(lg101.equals("1") ? this.lg10201 : "");
        setLg10202(lg101.equals("1") ? this.lg10202 : "");
        setLg10203(lg101.equals("1") ? this.lg10203 : "");
        setLg10204(lg101.equals("1") ? this.lg10204 : "");
        setLg10205(lg101.equals("1") ? this.lg10205 : "");
        setLg10206(lg101.equals("1") ? this.lg10206 : "");
        setLg10207(lg101.equals("1") ? this.lg10207 : "");
        setLg10208(lg101.equals("1") ? this.lg10208 : "");
        setLg10209(lg101.equals("1") ? this.lg10209 : "");
        setLg10296(lg101.equals("1") ? this.lg10296 : "");

        setLg103(lg101.equals("1") ? this.lg103 : "");

        setLg10401(lg101.equals("1") ? this.lg10401 : "");
        setLg10402(lg101.equals("1") ? this.lg10402 : "");
        setLg10403(lg101.equals("1") ? this.lg10403 : "");
        setLg10404(lg101.equals("1") ? this.lg10404 : "");
        setLg10405(lg101.equals("1") ? this.lg10405 : "");
        setLg10406(lg101.equals("1") ? this.lg10406 : "");
        setLg10407(lg101.equals("1") ? this.lg10407 : "");
        setLg10408(lg101.equals("1") ? this.lg10408 : "");
        setLg10409(lg101.equals("1") ? this.lg10409 : "");
        setLg10410(lg101.equals("1") ? this.lg10410 : "");
        setLg10411(lg101.equals("1") ? this.lg10411 : "");
        setLg10412(lg101.equals("1") ? this.lg10412 : "");
        setLg10413(lg101.equals("1") ? this.lg10413 : "");
        setLg10414(lg101.equals("1") ? this.lg10414 : "");
        setLg10415(lg101.equals("1") ? this.lg10415 : "");
        setLg10416(lg101.equals("1") ? this.lg10416 : "");

        setLg105(lg101.equals("1") ? this.lg105 : "");

        setLg10601(lg101.equals("1") ? this.lg10601 : "");
        setLg10602(lg101.equals("1") ? this.lg10602 : "");
        setLg10603(lg101.equals("1") ? this.lg10603 : "");
        setLg10604(lg101.equals("1") ? this.lg10604 : "");
        setLg10605(lg101.equals("1") ? this.lg10605 : "");
        setLg10606(lg101.equals("1") ? this.lg10606 : "");
        setLg10607(lg101.equals("1") ? this.lg10607 : "");
        setLg10696(lg101.equals("1") ? this.lg10696 : "");
        notifyPropertyChanged(BR.lg101);
    }

    @Bindable
    public String getLg102() {
        return lg102;
    }

    public void setLg102(String lg102) {
        this.lg102 = lg102;
        notifyPropertyChanged(BR.lg102);
    }

    @Bindable
    public String getLg10201() {
        return lg10201;
    }

    public void setLg10201(String lg10201) {
        if (this.lg10201.equals(lg10201)) return; // for all checkboxes
        this.lg10201 = lg10201;
        notifyPropertyChanged(BR.lg10201);
    }

    @Bindable
    public String getLg10202() {
        return lg10202;
    }

    public void setLg10202(String lg10202) {
        if (this.lg10202.equals(lg10202)) return; // for all checkboxes
        this.lg10202 = lg10202;
        notifyPropertyChanged(BR.lg10202);
    }

    @Bindable
    public String getLg10203() {
        return lg10203;
    }

    public void setLg10203(String lg10203) {
        if (this.lg10203.equals(lg10203)) return; // for all checkboxes
        this.lg10203 = lg10203;
        notifyPropertyChanged(BR.lg10203);
    }

    @Bindable
    public String getLg10204() {
        return lg10204;
    }

    public void setLg10204(String lg10204) {
        if (this.lg10204.equals(lg10204)) return; // for all checkboxes
        this.lg10204 = lg10204;
        notifyPropertyChanged(BR.lg10204);
    }

    @Bindable
    public String getLg10205() {
        return lg10205;
    }

    public void setLg10205(String lg10205) {
        if (this.lg10205.equals(lg10205)) return; // for all checkboxes
        this.lg10205 = lg10205;
        notifyPropertyChanged(BR.lg10205);
    }

    @Bindable
    public String getLg10206() {
        return lg10206;
    }

    public void setLg10206(String lg10206) {
        if (this.lg10206.equals(lg10206)) return; // for all checkboxes
        this.lg10206 = lg10206;
        notifyPropertyChanged(BR.lg10206);
    }

    @Bindable
    public String getLg10207() {
        return lg10207;
    }

    public void setLg10207(String lg10207) {
        if (this.lg10207.equals(lg10207)) return; // for all checkboxes
        this.lg10207 = lg10207;
        notifyPropertyChanged(BR.lg10207);
    }

    @Bindable
    public String getLg10208() {
        return lg10208;
    }

    public void setLg10208(String lg10208) {
        if (this.lg10208.equals(lg10208)) return; // for all checkboxes
        this.lg10208 = lg10208;
        notifyPropertyChanged(BR.lg10208);
    }

    @Bindable
    public String getLg10209() {
        return lg10209;
    }

    public void setLg10209(String lg10209) {
        if (this.lg10209.equals(lg10209)) return; // for all checkboxes
        this.lg10209 = lg10209;
        notifyPropertyChanged(BR.lg10209);
    }

    @Bindable
    public String getLg10296() {
        return lg10296;
    }

    public void setLg10296(String lg10296) {
        if (this.lg10296.equals(lg10296)) return; // for all checkboxes
        this.lg10296 = lg10296;
        setLg10296x(lg10296.equals("96") ? this.lg10296x : "");
        notifyPropertyChanged(BR.lg10296);
    }

    @Bindable
    public String getLg10296x() {
        return lg10296x;
    }

    public void setLg10296x(String lg10296x) {
        this.lg10296x = lg10296x;
        notifyPropertyChanged(BR.lg10296x);
    }

    @Bindable
    public String getLg103() {
        return lg103;
    }

    public void setLg103(String lg103) {
        this.lg103 = lg103;
        notifyPropertyChanged(BR.lg103);
    }

    @Bindable
    public String getLg104() {
        return lg104;
    }

    public void setLg104(String lg104) {
        this.lg104 = lg104;
        notifyPropertyChanged(BR.lg104);
    }

    @Bindable
    public String getLg10401() {
        return lg10401;
    }

    public void setLg10401(String lg10401) {
        if (this.lg10401.equals(lg10401)) return; // for all checkboxes
        this.lg10401 = lg10401;
        notifyPropertyChanged(BR.lg10401);
    }

    @Bindable
    public String getLg10402() {
        return lg10402;
    }

    public void setLg10402(String lg10402) {
        if (this.lg10402.equals(lg10402)) return; // for all checkboxes
        this.lg10402 = lg10402;
        notifyPropertyChanged(BR.lg10402);
    }

    @Bindable
    public String getLg10403() {
        return lg10403;
    }

    public void setLg10403(String lg10403) {
        if (this.lg10403.equals(lg10403)) return; // for all checkboxes
        this.lg10403 = lg10403;
        notifyPropertyChanged(BR.lg10403);
    }

    @Bindable
    public String getLg10404() {
        return lg10404;
    }

    public void setLg10404(String lg10404) {
        if (this.lg10404.equals(lg10404)) return; // for all checkboxes
        this.lg10404 = lg10404;
        notifyPropertyChanged(BR.lg10404);
    }

    @Bindable
    public String getLg10405() {
        return lg10405;
    }

    public void setLg10405(String lg10405) {
        if (this.lg10405.equals(lg10405)) return; // for all checkboxes
        this.lg10405 = lg10405;
        notifyPropertyChanged(BR.lg10405);
    }

    @Bindable
    public String getLg10406() {
        return lg10406;
    }

    public void setLg10406(String lg10406) {
        if (this.lg10406.equals(lg10406)) return; // for all checkboxes
        this.lg10406 = lg10406;
        notifyPropertyChanged(BR.lg10406);
    }

    @Bindable
    public String getLg10407() {
        return lg10407;
    }

    public void setLg10407(String lg10407) {
        if (this.lg10407.equals(lg10407)) return; // for all checkboxes
        this.lg10407 = lg10407;
        notifyPropertyChanged(BR.lg10407);
    }

    @Bindable
    public String getLg10408() {
        return lg10408;
    }

    public void setLg10408(String lg10408) {
        if (this.lg10408.equals(lg10408)) return; // for all checkboxes
        this.lg10408 = lg10408;
        notifyPropertyChanged(BR.lg10408);
    }

    @Bindable
    public String getLg10409() {
        return lg10409;
    }

    public void setLg10409(String lg10409) {
        if (this.lg10409.equals(lg10409)) return; // for all checkboxes
        this.lg10409 = lg10409;
        notifyPropertyChanged(BR.lg10409);
    }

    @Bindable
    public String getLg10410() {
        return lg10410;
    }

    public void setLg10410(String lg10410) {
        if (this.lg10410.equals(lg10410)) return; // for all checkboxes
        this.lg10410 = lg10410;
        notifyPropertyChanged(BR.lg10410);
    }

    @Bindable
    public String getLg10411() {
        return lg10411;
    }

    public void setLg10411(String lg10411) {
        if (this.lg10411.equals(lg10411)) return; // for all checkboxes
        this.lg10411 = lg10411;
        notifyPropertyChanged(BR.lg10411);
    }

    @Bindable
    public String getLg10412() {
        return lg10412;
    }

    public void setLg10412(String lg10412) {
        if (this.lg10412.equals(lg10412)) return; // for all checkboxes
        this.lg10412 = lg10412;
        notifyPropertyChanged(BR.lg10412);
    }

    @Bindable
    public String getLg10413() {
        return lg10413;
    }

    public void setLg10413(String lg10413) {
        if (this.lg10413.equals(lg10413)) return; // for all checkboxes
        this.lg10413 = lg10413;
        notifyPropertyChanged(BR.lg10413);
    }

    @Bindable
    public String getLg10414() {
        return lg10414;
    }

    public void setLg10414(String lg10414) {
        if (this.lg10414.equals(lg10414)) return; // for all checkboxes
        this.lg10414 = lg10414;
        notifyPropertyChanged(BR.lg10414);
    }

    @Bindable
    public String getLg10415() {
        return lg10415;
    }

    public void setLg10415(String lg10415) {
        if (this.lg10415.equals(lg10415)) return; // for all checkboxes
        this.lg10415 = lg10415;
        notifyPropertyChanged(BR.lg10415);
    }

    @Bindable
    public String getLg10416() {
        return lg10416;
    }

    public void setLg10416(String lg10416) {
        if (this.lg10416.equals(lg10416)) return; // for all checkboxes
        this.lg10416 = lg10416;
        notifyPropertyChanged(BR.lg10416);
    }

    @Bindable
    public String getLg105() {
        return lg105;
    }

    public void setLg105(String lg105) {
        this.lg105 = lg105;
        setLg10601(lg105.equals("1") ? this.lg10601 : "");
        setLg10602(lg105.equals("1") ? this.lg10602 : "");
        setLg10603(lg105.equals("1") ? this.lg10603 : "");
        setLg10604(lg105.equals("1") ? this.lg10604 : "");
        setLg10605(lg105.equals("1") ? this.lg10605 : "");
        setLg10606(lg105.equals("1") ? this.lg10606 : "");
        setLg10607(lg105.equals("1") ? this.lg10607 : "");
        setLg10696(lg105.equals("1") ? this.lg10696 : "");
        notifyPropertyChanged(BR.lg105);
    }

    @Bindable
    public String getLg106() {
        return lg106;
    }

    public void setLg106(String lg106) {
        this.lg106 = lg106;
        notifyPropertyChanged(BR.lg106);
    }

    @Bindable
    public String getLg10601() {
        return lg10601;
    }

    public void setLg10601(String lg10601) {
        if (this.lg10601.equals(lg10601)) return; // for all checkboxes
        this.lg10601 = lg10601;
        notifyPropertyChanged(BR.lg10601);
    }

    @Bindable
    public String getLg10602() {
        return lg10602;
    }

    public void setLg10602(String lg10602) {
        if (this.lg10602.equals(lg10602)) return; // for all checkboxes
        this.lg10602 = lg10602;
        notifyPropertyChanged(BR.lg10602);
    }

    @Bindable
    public String getLg10603() {
        return lg10603;
    }

    public void setLg10603(String lg10603) {
        if (this.lg10603.equals(lg10603)) return; // for all checkboxes
        this.lg10603 = lg10603;
        notifyPropertyChanged(BR.lg10603);
    }

    @Bindable
    public String getLg10604() {
        return lg10604;
    }

    public void setLg10604(String lg10604) {
        if (this.lg10604.equals(lg10604)) return; // for all checkboxes
        this.lg10604 = lg10604;
        notifyPropertyChanged(BR.lg10604);
    }

    @Bindable
    public String getLg10605() {
        return lg10605;
    }

    public void setLg10605(String lg10605) {
        if (this.lg10605.equals(lg10605)) return; // for all checkboxes
        this.lg10605 = lg10605;
        notifyPropertyChanged(BR.lg10605);
    }

    @Bindable
    public String getLg10606() {
        return lg10606;
    }

    public void setLg10606(String lg10606) {
        if (this.lg10606.equals(lg10606)) return; // for all checkboxes
        this.lg10606 = lg10606;
        notifyPropertyChanged(BR.lg10606);
    }

    @Bindable
    public String getLg10607() {
        return lg10607;
    }

    public void setLg10607(String lg10607) {
        if (this.lg10607.equals(lg10607)) return; // for all checkboxes
        this.lg10607 = lg10607;
        notifyPropertyChanged(BR.lg10607);
    }

    @Bindable
    public String getLg10696() {
        return lg10696;
    }

    public void setLg10696(String lg10696) {
        if (this.lg10696.equals(lg10696)) return; // for all checkboxes
        this.lg10696 = lg10696;
        setLg10696x(lg10696.equals("96") ? this.l10696x : "");

        notifyPropertyChanged(BR.lg10696);
    }

    @Bindable
    public String getLg10696x() {
        return lg10696x;
    }

    public void setLg10696x(String lg10696x) {
        this.lg10696x = lg10696x;
        notifyPropertyChanged(BR.lg10696x);
    }

    @Bindable
    public String getL1131() {
        return l1131;
    }

    public void setL1131(String l1131) {
        this.l1131 = l1131;
        notifyPropertyChanged(BR.l1131);
    }

    @Bindable
    public String getL1132() {
        return l1132;
    }

    public void setL1132(String l1132) {
        this.l1132 = l1132;
        notifyPropertyChanged(BR.l1132);
    }

    @Bindable
    public String getL1133() {
        return l1133;
    }

    public void setL1133(String l1133) {
        this.l1133 = l1133;
        notifyPropertyChanged(BR.l1133);
    }

    @Bindable
    public String getL1134() {
        return l1134;
    }

    public void setL1134(String l1134) {
        this.l1134 = l1134;
        notifyPropertyChanged(BR.l1134);
    }

    @Bindable
    public String getL114() {
        return l114;
    }

    public void setL114(String l114) {
        this.l114 = l114;
        setL11496x(l114.equals("96") ? this.l11496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l114);
    }

    @Bindable
    public String getL11496x() {
        return l11496x;
    }

    public void setL11496x(String l11496x) {
        this.l11496x = l11496x;
        notifyPropertyChanged(BR.l11496x);
    }

    @Bindable
    public String getL115() {
        return l115;
    }

    public void setL115(String l115) {
        this.l115 = l115;
        setL11596x(l115.equals("96") ? this.l11596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l115);
    }

    @Bindable
    public String getL11596x() {
        return l11596x;
    }

    public void setL11596x(String l11596x) {
        this.l11596x = l11596x;
        notifyPropertyChanged(BR.l11596x);
    }

    @Bindable
    public String getL116() {
        return l116;
    }

    public void setL116(String l116) {
        this.l116 = l116;
        setL11696x(l116.equals("96") ? this.l11696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l116);
    }

    @Bindable
    public String getL11696x() {
        return l11696x;
    }

    public void setL11696x(String l11696x) {
        this.l11696x = l11696x;
        notifyPropertyChanged(BR.l11696x);
    }

    @Bindable
    public String getL117() {
        return l117;
    }

    public void setL117(String l117) {
        this.l117 = l117;
        setL11796x(l117.equals("96") ? this.l11796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l117);
    }

    @Bindable
    public String getL11796x() {
        return l11796x;
    }

    public void setL11796x(String l11796x) {
        this.l11796x = l11796x;
        notifyPropertyChanged(BR.l11796x);
    }


    @Bindable
    public String getUn01() {
        return un01;
    }

    public void setUn01(String un01) {
        this.un01 = un01;
        setUn02(un01.equals("2") ? this.un02 : "");
        notifyPropertyChanged(BR.un01);
    }

    @Bindable
    public String getUn02() {
        return un02;
    }

    public void setUn02(String un02) {
        this.un02 = un02;
        notifyPropertyChanged(BR.un02);
    }

    @Bindable
    public String getUn03() {
        return un03;
    }

    public void setUn03(String un03) {
        this.un03 = un03;
        setUn04(un03.equals("1") ? this.un04 : "");
        setUn05(un03.equals("1") ? this.un05 : "");
        setUn06(un03.equals("1") ? this.un06 : "");

        setUn04(un03.equals("2") || un03.equals("4") ? "" : this.un04);
        setUn05(un03.equals("2") || un03.equals("4") ? "" : this.un05);
        setUn06(un03.equals("2") || un03.equals("4") ? "" : this.un06);

        setUn04(un03.equals("3") ? "" : this.un04);
        setUn05(un03.equals("3") ? "" : this.un05);
        notifyPropertyChanged(BR.un03);
    }

    @Bindable
    public String getUn04() {
        return un04;
    }

    public void setUn04(String un04) {
        this.un04 = un04;
        setUn0401x(un04.equals("1") ? this.un0401x : "");
        setUn0402x(un04.equals("2") ? this.un0402x : "");
        setUn05(un04.equals("4") ? "" : this.un05);
        notifyPropertyChanged(BR.un04);
    }

    @Bindable
    public String getUn0401x() {
        return un0401x;
    }

    public void setUn0401x(String un0401x) {
        this.un0401x = un0401x;
        notifyPropertyChanged(BR.un0401x);
    }

    @Bindable
    public String getUn0402x() {
        return un0402x;
    }

    public void setUn0402x(String un0402x) {
        this.un0402x = un0402x;
        notifyPropertyChanged(BR.un0402x);
    }

    @Bindable
    public String getUn05() {
        return un05;
    }

    public void setUn05(String un05) {
        this.un05 = un05;
        setUn06(un05.equals("2") ? this.un06 : "");
        notifyPropertyChanged(BR.un05);
    }

    @Bindable
    public String getUn06() {
        return un06;
    }

    public void setUn06(String un06) {
        this.un06 = un06;
        setUn0696x(un06.equals("96") ? this.un0696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.un06);
    }

    @Bindable
    public String getUn0696x() {
        return un0696x;
    }

    public void setUn0696x(String un0696x) {
        this.un0696x = un0696x;
        notifyPropertyChanged(BR.un0696x);
    }

    @Bindable
    public String getUn07() {
        return un07;
    }

    public void setUn07(String un07) {
        this.un07 = un07;
        setUn0701x(un07.equals("1") ? this.un0701x : ""); // for all skips, mention all skipped questions
        setUn0702x(un07.equals("2") ? this.un0702x : ""); // for all skips, mention all skipped questions
        setUn0703x(un07.equals("3") ? this.un0703x : ""); // for all skips, mention all skipped questions
        setUn0704x(un07.equals("4") ? this.un0704x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.un07);
    }

    @Bindable
    public String getUn0701x() {
        return un0701x;
    }

    public void setUn0701x(String un0701x) {
        this.un0701x = un0701x;
        notifyPropertyChanged(BR.un0701x);
    }

    @Bindable
    public String getUn0702x() {
        return un0702x;
    }

    public void setUn0702x(String un0702x) {
        this.un0702x = un0702x;
        notifyPropertyChanged(BR.un0702x);
    }

    @Bindable
    public String getUn0703x() {
        return un0703x;
    }

    public void setUn0703x(String un0703x) {
        this.un0703x = un0703x;
        notifyPropertyChanged(BR.un0703x);
    }

    @Bindable
    public String getUn0704x() {
        return un0704x;
    }

    public void setUn0704x(String un0704x) {
        this.un0704x = un0704x;
        notifyPropertyChanged(BR.un0704x);
    }


    public MWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UUID));
        // this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_MUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_HHID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_INDEXED));
        this.name = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNC_DATE));


        sF1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SF1)));
        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SF2)));
        sGHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SG)));
        sH1AHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SH1A)));
        sH1BHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SH1B)));
        sH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SH2)));
        sKHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SK)));
        sLHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SL)));
        uNHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UN)));

        return this;
    }


    public void sF1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f101 = json.getString("f101");
            this.f101a01 = json.getString("f101a01");
            this.f101a02 = json.getString("f101a02");
            this.f101a03 = json.getString("f101a03");
            this.f101a04 = json.getString("f101a04");
            this.f101a05 = json.getString("f101a05");
            this.f101a06 = json.getString("f101a06");
            this.f101a07 = json.getString("f101a07");
            this.f101a08 = json.getString("f101a08");
            this.f101a09 = json.getString("f101a09");
            this.f101a10 = json.getString("f101a10");
            this.f101a11 = json.getString("f101a11");
            this.f101a12 = json.getString("f101a12");
            this.f101a13 = json.getString("f101a13");
            this.f101a14 = json.getString("f101a14");
            this.f101a96 = json.getString("f101a96");
            this.f101a96x = json.getString("f101a96x");
            this.f101b = json.getString("f101b");
            this.f101b01x = json.getString("f101b01x");
            this.f10201 = json.getString("f10201");
            this.f10202 = json.getString("f10202");
            this.f10203 = json.getString("f10203");
            this.f10204 = json.getString("f10204");
            this.f10205 = json.getString("f10205");
            this.f10206 = json.getString("f10206");
            this.f10207 = json.getString("f10207");
            this.f10208 = json.getString("f10208");
            this.f10209 = json.getString("f10209");
            this.f10210 = json.getString("f10210");
            this.f10211 = json.getString("f10211");
            this.f10296 = json.getString("f10296");
            this.f10296x = json.getString("f10296x");
            this.f10301 = json.getString("f10301");
            this.f10302 = json.getString("f10302");
            this.f10303 = json.getString("f10303");
            this.f10304 = json.getString("f10304");
            this.f10305 = json.getString("f10305");
            this.f104 = json.getString("f104");
            this.f105 = json.getString("f105");
            this.f106 = json.getString("f106");
            this.f107 = json.getString("f107");
            this.f10796x = json.getString("f10796x");
            this.f108 = json.getString("f108");
            this.f108wx = json.getString("f108wx");
            this.f108mx = json.getString("f108mx");
            this.f11001 = json.getString("f11001");
            this.f11002 = json.getString("f11002");
            this.f11003 = json.getString("f11003");
            this.f11004 = json.getString("f11004");
            this.f11005 = json.getString("f11005");
            this.f11006 = json.getString("f11006");
            this.f11007 = json.getString("f11007");
            this.f11008 = json.getString("f11008");
            this.f11009 = json.getString("f11009");
            this.f11096 = json.getString("f11096");
            this.f11096x = json.getString("f11096x");
            this.f111 = json.getString("f111");
            this.f112 = json.getString("f112");
            this.f113 = json.getString("f113");
            this.f11301x = json.getString("f11301x");
            this.f114 = json.getString("f114");
            this.f115 = json.getString("f115");
            this.f116 = json.getString("f116");
            this.f117 = json.getString("f117");
            this.f118 = json.getString("f118");
            this.f118mx = json.getString("f118mx");
            this.f118dx = json.getString("f118dx");
            this.f119 = json.getString("f119");
            this.f120 = json.getString("f120");
            this.f12001x = json.getString("f12001x");
        }
    }


    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f121a = json.getString("f121a");
            this.f12101 = json.getString("f12101");
            this.f121b = json.getString("f121b");
            this.f121b96x = json.getString("f121b96x");
            this.f122 = json.getString("f122");
            this.f12201x = json.getString("f12201x");
            this.f12301 = json.getString("f12301");
            this.f12302 = json.getString("f12302");
            this.f12303 = json.getString("f12303");
            this.f12304 = json.getString("f12304");
            this.f12305 = json.getString("f12305");
            this.f12306 = json.getString("f12306");
            this.f12307 = json.getString("f12307");
            this.f12308 = json.getString("f12308");
            this.f12309 = json.getString("f12309");
            this.f12310 = json.getString("f12310");
            this.f12396 = json.getString("f12396");
            this.f12396x = json.getString("f12396x");
            this.f12801 = json.getString("f12801");
            this.f12802 = json.getString("f12802");
            this.f12803 = json.getString("f12803");
            this.f12804 = json.getString("f12804");
            this.f12805 = json.getString("f12805");
            this.f12806 = json.getString("f12806");
            this.f12807 = json.getString("f12807");
            this.f124 = json.getString("f124");
            this.f12501 = json.getString("f12501");
            this.f12502 = json.getString("f12502");
            this.f12503 = json.getString("f12503");
            this.f12504 = json.getString("f12504");
            this.f12505 = json.getString("f12505");
            this.f12506 = json.getString("f12506");
            this.f12507 = json.getString("f12507");
            this.f12601 = json.getString("f12601");
            this.f12602 = json.getString("f12602");
            this.f12603 = json.getString("f12603");
            this.f12604 = json.getString("f12604");
            this.f12605 = json.getString("f12605");
            this.f12606 = json.getString("f12606");
            this.f12607 = json.getString("f12607");
            this.f12608 = json.getString("f12608");
            this.f127 = json.getString("f127");
            this.f12796x = json.getString("f12796x");
            this.f12801 = json.getString("f12801");
            this.f12802 = json.getString("f12802");
            this.f12803 = json.getString("f12803");
            this.f12804 = json.getString("f12804");
            this.f12805 = json.getString("f12805");
            this.f12806 = json.getString("f12806");
            this.f12807 = json.getString("f12807");
            this.f12808 = json.getString("f12808");
            this.f129 = json.getString("f129");
            this.f13001 = json.getString("f13001");
            this.f13002 = json.getString("f13002");
            this.f13003 = json.getString("f13003");
            this.f13004 = json.getString("f13004");
            this.f13005 = json.getString("f13005");
            this.f13006 = json.getString("f13006");
            this.f13007 = json.getString("f13007");
            this.f13008 = json.getString("f13008");
            this.f13009 = json.getString("f13009");
            this.f13010 = json.getString("f13010");
            this.f13011 = json.getString("f13011");
            this.f13012 = json.getString("f13012");
            this.f13013 = json.getString("f13013");
            this.f13014 = json.getString("f13014");
            this.f13015 = json.getString("f13015");
            this.f13096 = json.getString("f13096");
            this.f13096x = json.getString("f13096x");
            this.f131 = json.getString("f131");
            this.f13196x = json.getString("f13196x");
            this.f131a = json.getString("f131a");
            this.f13401 = json.getString("f13401");
            this.f13402 = json.getString("f13402");
            this.f13403 = json.getString("f13403");
            this.f13404 = json.getString("f13404");
            this.f13405 = json.getString("f13405");
            this.f13406 = json.getString("f13406");
            this.f13407 = json.getString("f13407");
            this.f13408 = json.getString("f13408");
            this.f13409 = json.getString("f13409");
            this.f13410 = json.getString("f13410");
        }
    }


    public void sGHydrate(String string) throws JSONException {
        Log.d(TAG, "sGHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g101 = json.getString("g101");
            this.g102 = json.getString("g102");
            this.g10296x = json.getString("g10296x");
            this.g10301 = json.getString("g10301");
            this.g10302 = json.getString("g10302");
            this.g10303 = json.getString("g10303");
            this.g10304 = json.getString("g10304");
            this.g10305 = json.getString("g10305");
            this.g10306 = json.getString("g10306");
            this.g10307 = json.getString("g10307");
            this.g10308 = json.getString("g10308");
            this.g10309 = json.getString("g10309");
            this.g10310 = json.getString("g10310");
            this.g10311 = json.getString("g10311");
            this.g10312 = json.getString("g10312");
            this.g10313 = json.getString("g10313");
            this.g10314 = json.getString("g10314");
            this.g10315 = json.getString("g10315");
            this.g10396 = json.getString("g10396");
            this.g10396x = json.getString("g10396x");
            this.g104 = json.getString("g104");
            this.g10496x = json.getString("g10496x");
            this.g105 = json.getString("g105");
            this.g10501x = json.getString("g10501x");
            this.g106 = json.getString("g106");
            this.g107 = json.getString("g107");
            this.g10701x = json.getString("g10701x");
            this.g108 = json.getString("g108");
            this.g109 = json.getString("g109");
            this.g110 = json.getString("g110");
            this.g126 = json.getString("g126");
            this.g127 = json.getString("g127");
            this.g113 = json.getString("g113");
            this.g114 = json.getString("g114");
            this.g11496x = json.getString("g11496x");
            this.g115 = json.getString("g115");
            this.g116 = json.getString("g116");
            this.g117 = json.getString("g117");
            this.g117hx = json.getString("g117hx");
            this.g117mx = json.getString("g117mx");
            this.g117dx = json.getString("g117dx");
            this.g11801 = json.getString("g11801");
            this.g11801x = json.getString("g11801x");
            this.g11802 = json.getString("g11802");
            this.g11802x = json.getString("g11802x");
            this.g11803 = json.getString("g11803");
            this.g11803x = json.getString("g11803x");
            this.g11804 = json.getString("g11804");
            this.g11804x = json.getString("g11804x");
            this.g11896 = json.getString("g11896");
            this.g11896x = json.getString("g11896x");
            this.g11898 = json.getString("g11898");
            this.g119 = json.getString("g119");
            this.g120 = json.getString("g120");
            this.g12096x = json.getString("g12096x");
            this.g121 = json.getString("g121");
            this.g12196x = json.getString("g12196x");
            this.g122 = json.getString("g122");
            this.g12301 = json.getString("g12301");
            this.g12302 = json.getString("g12302");
            this.g12303 = json.getString("g12303");
            this.g12304 = json.getString("g12304");
            this.g12305 = json.getString("g12305");
            this.g12306 = json.getString("g12306");
            this.g12307 = json.getString("g12307");
            this.g12308 = json.getString("g12308");
            this.g124 = json.getString("g124");
            this.g1241 = json.getString("g1241");
            this.g1242 = json.getString("g1242");
            this.g1243 = json.getString("g1243");
            this.g1244 = json.getString("g1244");
            this.g1245 = json.getString("g1245");
            this.g1246 = json.getString("g1246");
            this.g1247 = json.getString("g1247");
            this.g1248 = json.getString("g1248");
            this.g1249 = json.getString("g1249");
            this.g12410 = json.getString("g12410");
            this.g12411 = json.getString("g12411");
            this.g12412 = json.getString("g12412");
            this.g12413 = json.getString("g12413");
            this.g12401 = json.getString("g12401");
            this.g1240101 = json.getString("g1240101");
            this.g1240102 = json.getString("g1240102");
            this.g1240103 = json.getString("g1240103");
            this.g1240104 = json.getString("g1240104");
            this.g1240105 = json.getString("g1240105");
            this.g1240106 = json.getString("g1240106");
            this.g1240107 = json.getString("g1240107");
            this.g1240108 = json.getString("g1240108");
            this.g1240109 = json.getString("g1240109");
            this.g1240110 = json.getString("g1240110");
            this.g1240111 = json.getString("g1240111");
            this.g1240112 = json.getString("g1240112");
            this.g1240113 = json.getString("g1240113");
            this.g1240114 = json.getString("g1240114");
            this.g12402 = json.getString("g12402");
            this.g1240296x = json.getString("g1240296x");
            this.g125 = json.getString("g125");
            this.g12501 = json.getString("g12501");
            this.g1250101 = json.getString("g1250101");
            this.g1250102 = json.getString("g1250102");
            this.g1250103 = json.getString("g1250103");
            this.g1250104 = json.getString("g1250104");
            this.g1250105 = json.getString("g1250105");
            this.g1250106 = json.getString("g1250106");
            this.g1250107 = json.getString("g1250107");
            this.g1250108 = json.getString("g1250108");
            this.g128 = json.getString("g128");
            this.g129 = json.getString("g129");
            this.g130 = json.getString("g130");

        }
    }


    public void sH1AHydrate(String string) throws JSONException {
        Log.d(TAG, "sH1AHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h101 = json.getString("h101");
            this.h101mx = json.getString("h101mx");
            this.h101wx = json.getString("h101wx");
            this.h102 = json.getString("h102");
            this.h103 = json.getString("h103");
            this.h10401 = json.getString("h10401");
            this.h10402 = json.getString("h10402");
            this.h10403 = json.getString("h10403");
            this.h10496 = json.getString("h10496");
            this.h10496x = json.getString("h10496x");
            this.h105 = json.getString("h105");
            this.h106 = json.getString("h106");
            this.h1061x = json.getString("h1061x");
            this.h107 = json.getString("h107");
            this.h10800 = json.getString("h10800");
            this.h108a = json.getString("h108a");
            this.h108 = json.getString("h108");
            this.h10896x = json.getString("h10896x");
            this.h10900 = json.getString("h10900");
            this.h10901 = json.getString("h10901");
            this.h1091 = json.getString("h1091");
            this.h1092 = json.getString("h1092");
            this.h1093 = json.getString("h1093");
            this.h1094 = json.getString("h1094");
            this.h1095 = json.getString("h1095");
            this.h1096 = json.getString("h1096");
            this.h1097 = json.getString("h1097");
            this.h10997 = json.getString("h10997");
            this.h10996 = json.getString("h10996");
            this.h10996x = json.getString("h10996x");
            this.h11000 = json.has("h11000") ? json.getString("h11000") : "";
            this.h11001 = json.has("h11001") ? json.getString("h11001") : "";
            this.h110 = json.getString("h110");
            this.h111 = json.getString("h111");
            this.h11200 = json.getString("h11200");
            this.h11201 = json.getString("h11201");
            this.h11202 = json.getString("h11202");
            this.h112 = json.getString("h112");
            this.h113 = json.getString("h113");
            this.h114 = json.getString("h114");
            this.h115 = json.getString("h115");
            this.h11501 = json.getString("h11501");
            this.h11502 = json.getString("h11502");
            this.h11503 = json.getString("h11503");
            this.h11504 = json.getString("h11504");
            this.h11505 = json.getString("h11505");
            this.h11506 = json.getString("h11506");
            this.h11507 = json.getString("h11507");
            this.h11508 = json.getString("h11508");
            this.h11509 = json.getString("h11509");
            this.h11596 = json.getString("h11596");
            this.h11596x = json.getString("h11596x");
            this.h116 = json.getString("h116");
            this.h11701 = json.getString("h11701");
            this.h118 = json.getString("h118");
            this.h119 = json.getString("h119");
            this.h120 = json.getString("h120");
            this.h121 = json.getString("h121");
            this.h122 = json.getString("h122");
            this.h1221x = json.getString("h1221x");
            this.h123 = json.getString("h123");
            this.h124 = json.getString("h124");
        }
    }


    public void sH1BHydrate(String string) throws JSONException {
        Log.d(TAG, "sH1BHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h125 = json.getString("h125");
            this.h126 = json.getString("h126");
            this.h127 = json.getString("h127");
            this.h12796x = json.getString("h12796x");
            this.h128 = json.getString("h128");
            this.h12896x = json.getString("h12896x");
            this.h12901 = json.getString("h12901");
            this.h12902 = json.getString("h12902");
            this.h12903 = json.getString("h12903");
            this.h12904 = json.getString("h12904");
            this.h12905 = json.getString("h12905");
            this.h12906 = json.getString("h12906");
            this.h130 = json.getString("h130");
            this.h131 = json.getString("h131");
            this.h1310101 = json.getString("h1310101");
            this.h1310102 = json.getString("h1310102");
            this.h1310103 = json.getString("h1310103");
            this.h1310104 = json.getString("h1310104");
            this.h1310105 = json.getString("h1310105");
            this.h1310106 = json.getString("h1310106");
            this.h1310107 = json.getString("h1310107");
            this.h132 = json.getString("h132");
            this.h132a = json.getString("h132a");
            this.h132a96x = json.getString("h132a96x");
            this.h13301 = json.getString("h13301");
            this.h13302 = json.getString("h13302");
            this.h13303 = json.getString("h13303");
            this.h13304 = json.getString("h13304");
            this.h13305 = json.getString("h13305");
            this.h13306 = json.getString("h13306");
            this.h13307 = json.getString("h13307");
            this.h13308 = json.getString("h13308");
            this.h13309 = json.getString("h13309");
            this.h13310 = json.getString("h13310");
            this.h134 = json.getString("h134");
            this.h13501 = json.getString("h13501");
            this.h13502 = json.getString("h13502");
            this.h13503 = json.getString("h13503");
            this.h13504 = json.getString("h13504");
            this.h13505 = json.getString("h13505");
            this.h13506 = json.getString("h13506");
            this.h13507 = json.getString("h13507");
            this.h13508 = json.getString("h13508");
            this.h13509 = json.getString("h13509");
            this.h13598 = json.getString("h13598");
            this.h136a = json.has("h136a") ? json.getString("h136a") : "";
            this.h136b = json.has("h136b") ? json.getString("h136b") : "";
            this.h136c = json.has("h136c") ? json.getString("h136c") : "";
            this.h136d = json.getString("h136d");
            this.h136e = json.getString("h136e");
            this.h136f = json.getString("h136f");
            this.h13696 = json.getString("h13696");
            this.h13696x = json.getString("h13696x");
            this.h1361 = json.getString("h1361");
            this.h1362a = json.getString("h1362a");
            this.h1362b = json.getString("h1362b");
            this.h1362c = json.getString("h1362c");
            this.h1362d = json.getString("h1362d");
            this.h1362e = json.getString("h1362e");
            this.h1362f = json.getString("h1362f");
            this.h1362g = json.getString("h1362g");
            this.h1362h = json.getString("h1362h");
            this.h1362i = json.getString("h1362i");
            this.h1362j = json.getString("h1362j");
            this.h136298 = json.getString("h136298");
            this.h1363 = json.has("h1363") ? json.getString("h1363") : "";
            this.h137 = json.getString("h137");
            this.h1371 = json.getString("h1371");
            this.h137196x = json.getString("h137196x");
            this.h1372 = json.getString("h1372");
            this.h1373 = json.getString("h1373");
            this.h137396x = json.getString("h137396x");
        }
    }


    public void sH2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h201 = json.getString("h201");
            this.h201hx = json.getString("h201hx");
            this.h201dx = json.getString("h201dx");
            this.h201wx = json.getString("h201wx");
            this.h202 = json.getString("h202");
            this.h203h = json.getString("h203h");
            this.h203d = json.getString("h203d");
            this.h203w = json.getString("h203w");
            this.h204 = json.getString("h204");
            this.h20496x = json.getString("h20496x");
            this.h205 = json.getString("h205");
            this.h20596x = json.getString("h20596x");
            this.h2051a = json.getString("h2051a");
            this.h2051b = json.getString("h2051b");
            this.h2051c = json.getString("h2051c");
            this.h2051d = json.getString("h2051d");
            this.h2051e = json.getString("h2051e");
            this.h2051f = json.getString("h2051f");
            this.h2051g = json.getString("h2051g");
            this.h2051h = json.getString("h2051h");
            this.h2051i = json.getString("h2051i");
            this.h2051j = json.getString("h2051j");
            this.h205196 = json.getString("h205196");
            this.h205196x = json.getString("h205196x");
            this.h206 = json.getString("h206");
            this.h20701 = json.getString("h20701");
            this.h20702 = json.getString("h20702");
            this.h20703 = json.getString("h20703");
            this.h20704 = json.getString("h20704");
            this.h20705 = json.getString("h20705");
            this.h20706 = json.getString("h20706");
            this.h20707 = json.getString("h20707");
            this.h20708 = json.getString("h20708");
            this.h20798 = json.getString("h20798");
            this.h20801 = json.getString("h20801");
            this.h20802 = json.getString("h20802");
            this.h20803 = json.getString("h20803");
            this.h20804 = json.getString("h20804");
            this.h20805 = json.getString("h20805");
            this.h20806 = json.getString("h20806");
            this.h20896 = json.getString("h20896");
            this.h20896x = json.getString("h20896x");
            this.h208a = json.getString("h208a");
            this.h208b = json.getString("h208b");
            this.h208b01 = json.getString("h208b01");
            this.h208b02 = json.getString("h208b02");
            this.h208b03 = json.getString("h208b03");
            this.h208b04 = json.getString("h208b04");
            this.h208b05 = json.getString("h208b05");
            this.h208b06 = json.getString("h208b06");
            this.h208b07 = json.getString("h208b07");
            this.h208b08 = json.getString("h208b08");
            this.h208b09 = json.getString("h208b09");
            this.h208b98 = json.getString("h208b98");
            this.h208c = json.getString("h208c");
            this.h208d = json.getString("h208d");
            this.h208d96x = json.getString("h208d96x");
            this.h209 = json.getString("h209");
            this.h209a = json.getString("h209a");
            this.h209a96x = json.getString("h209a96x");
            this.h210 = json.getString("h210");
            this.h21101 = json.has("h21101") ? json.getString("h21101") : "";
            this.h21102 = json.has("h21102") ? json.getString("h21102") : "";
            this.h21103 = json.has("h21103") ? json.getString("h21103") : "";
            this.h21105 = json.has("h21104") ? json.getString("h21104") : "";
            this.h21105 = json.has("h21105") ? json.getString("h21105") : "";
            this.h21106 = json.has("h21106") ? json.getString("h21106") : "";
            this.h21107 = json.has("h21107") ? json.getString("h21107") : "";
            this.h21108 = json.has("h21108") ? json.getString("h21108") : "";
            this.h21109 = json.has("h21109") ? json.getString("h21109") : "";
            this.h21110 = json.has("h21110") ? json.getString("h21110") : "";
            this.h212 = json.getString("h212");
            this.h213 = json.getString("h213");
            this.h214 = json.getString("h214");
            this.h214a = json.getString("h214a");
            this.h214b01 = json.getString("h214b01");
            this.h214b02 = json.getString("h214b02");
            this.h214b03 = json.getString("h214b03");
            this.h214b04 = json.getString("h214b04");
            this.h214b05 = json.getString("h214b05");
            this.h214b06 = json.getString("h214b06");
            this.h214b96 = json.getString("h214b96");
            this.h214b96x = json.getString("h214b96x");
            this.h214b98 = json.getString("h214b98");
            this.h215 = json.getString("h215");
            this.h216 = json.getString("h216");
            this.h216a = json.getString("h216a");
            this.h216a96x = json.getString("h216a96x");
            this.h21701 = json.getString("h21701");
            this.h21702 = json.getString("h21702");
            this.h21703 = json.getString("h21703");
            this.h21704 = json.getString("h21704");
            this.h21705 = json.getString("h21705");
            this.h21706 = json.getString("h21706");
            this.h21796 = json.getString("h21796");
            this.h21796x = json.getString("h21796x");
            this.h218 = json.getString("h218");
            this.h219 = json.getString("h219");
            this.h21996x = json.getString("h21996x");
            this.h2201 = json.getString("h2201");
            this.h2201x = json.getString("h2201x");
            this.h2202 = json.getString("h2202");
            this.h2202x = json.getString("h2202x");
            this.h2203 = json.getString("h2203");
            this.h2203x = json.getString("h2203x");
            this.h2204 = json.getString("h2204");
            this.h2204x = json.getString("h2204x");
            this.h2205 = json.getString("h2205");
            this.h2205x = json.getString("h2205x");
            this.h2206 = json.getString("h2206");
            this.h2206x = json.getString("h2206x");
            this.h22096 = json.getString("h22096");
            this.h22096x = json.getString("h22096x");
            this.h221 = json.getString("h221");
            this.h222 = json.getString("h222");
            this.h22296x = json.getString("h22296x");
            this.h223 = json.getString("h223");

        }
    }


    public void sKHydrate(String string) throws JSONException {
        Log.d(TAG, "sKHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k101 = json.getString("k101");
            this.k101a01 = json.getString("k101a01");
            this.k101a02 = json.getString("k101a02");
            this.k101a03 = json.getString("k101a03");
            this.k101a04 = json.getString("k101a04");
            this.k101a05 = json.getString("k101a05");
            this.k101a06 = json.getString("k101a06");
            this.k101a07 = json.getString("k101a07");
            this.k101a08 = json.getString("k101a08");
            this.k101a09 = json.getString("k101a09");
            this.k101a10 = json.getString("k101a10");
            this.k101a11 = json.getString("k101a11");
            this.k101a12 = json.getString("k101a12");
            this.k101a13 = json.getString("k101a13");
            this.k101a14 = json.getString("k101a14");
            this.k101a15 = json.getString("k101a15");
            this.k101a16 = json.getString("k101a16");
            this.k101a96 = json.getString("k101a96");
            this.k101a96x = json.getString("k101a96x");
            this.k101b = json.getString("k101b");
            this.k102 = json.getString("k102");
            this.k103 = json.getString("k103");
            this.k103a01 = json.getString("k103a01");
            this.k103a02 = json.getString("k103a02");
            this.k103a03 = json.getString("k103a03");
            this.k103a04 = json.getString("k103a04");
            this.k103a05 = json.getString("k103a05");
            this.k103a06 = json.getString("k103a06");
            this.k103a07 = json.getString("k103a07");
            this.k103a08 = json.getString("k103a08");
            this.k103a09 = json.getString("k103a09");
            this.k103a10 = json.getString("k103a10");
            this.k103a11 = json.getString("k103a11");
            this.k103a12 = json.getString("k103a12");
            this.k103a13 = json.getString("k103a13");
            this.k10401 = json.getString("k10401");
            this.k10402 = json.getString("k10402");
            this.k10403 = json.getString("k10403");
            this.k10404 = json.getString("k10404");
            this.k10405 = json.getString("k10405");
            this.k10406 = json.getString("k10406");
            this.k10477 = json.getString("k10477");
            this.k10408 = json.getString("k10408");
            this.k10409 = json.getString("k10409");
            this.k10410 = json.getString("k10410");
            this.k10411 = json.getString("k10411");
            this.k10412 = json.getString("k10412");
            this.k10413 = json.getString("k10413");
            this.k105 = json.getString("k105");
            this.k105a = json.getString("k105a");
            this.k105a01x = json.getString("k105a01x");
            this.k105a02x = json.getString("k105a02x");
            this.k105b = json.getString("k105b");
            this.k105c01 = json.getString("k105c01");
            this.k105c02 = json.getString("k105c02");
            this.k105c03 = json.getString("k105c03");
            this.k105c04 = json.getString("k105c04");
            this.k105c05 = json.getString("k105c05");
            this.k105c06 = json.getString("k105c06");
            this.k105c07 = json.getString("k105c07");
            this.k105c08 = json.getString("k105c08");
            this.k105c09 = json.getString("k105c09");
            this.k105c96 = json.getString("k105c96");
            this.k105c96x = json.getString("k105c96x");
            this.k105dm = json.has("k105dm") ? json.getString("k105dm") : "";
            this.k105dy = json.has("k105dy") ? json.getString("k105dy") : "";
            this.k10601 = json.getString("k10601");
            this.k10602 = json.getString("k10602");
            this.k10603 = json.getString("k10603");
            this.k10604 = json.getString("k10604");
            this.k10605 = json.getString("k10605");
            this.k10606 = json.getString("k10606");
            this.k10607 = json.getString("k10607");
            this.k10608 = json.getString("k10608");
            this.k10696 = json.getString("k10696");
            this.k10696x = json.getString("k10696x");
            this.k107 = json.getString("k107");
            this.k107a = json.getString("k107a");
            this.k107a01 = json.getString("k107a01");
            this.k107a02 = json.getString("k107a02");
            this.k107a03 = json.getString("k107a03");
            this.k107a04 = json.getString("k107a04");
            this.k107a05 = json.getString("k107a05");
            this.k107a06 = json.getString("k107a06");
            this.k107a07 = json.getString("k107a07");
            this.k107a08 = json.getString("k107a08");
            this.k107a99 = json.getString("k107a99");
            this.k108 = json.getString("k108");
            this.k108a = json.getString("k108a");
            this.k109 = json.getString("k109");

        }
    }


    public void sLHydrate(String string) throws JSONException {
        Log.d(TAG, "sLHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.l101 = json.getString("l101");
            this.l102 = json.getString("l102");
            this.l102a = json.getString("l102a");
            this.l102a96x = json.getString("l102a96x");
            this.l103 = json.getString("l103");
            this.l104 = json.getString("l104");
            this.l10496x = json.getString("l10496x");
            this.l105 = json.getString("l105");
            this.l106 = json.getString("l106");
            this.l10696x = json.getString("l10696x");
            this.l107 = json.getString("l107");
            this.l10796x = json.getString("l10796x");
            this.l108 = json.getString("l108");
            this.l10896x = json.getString("l10896x");
            this.l109 = json.getString("l109");
            this.l10996x = json.getString("l10996x");
            this.l110 = json.getString("l110");
            this.l111 = json.getString("l111");
            this.l1121 = json.getString("l1121");
            this.l1122 = json.getString("l1122");
            this.l1123 = json.getString("l1123");
            this.l1124 = json.getString("l1124");
            this.l1125 = json.getString("l1125");
            this.lg101 = json.getString("lg101");
            this.lg10201 = json.getString("lg10201");
            this.lg10202 = json.getString("lg10202");
            this.lg10203 = json.getString("lg10203");
            this.lg10204 = json.getString("lg10204");
            this.lg10205 = json.getString("lg10205");
            this.lg10206 = json.getString("lg10206");
            this.lg10207 = json.getString("lg10207");
            this.lg10208 = json.getString("lg10208");
            this.lg10209 = json.getString("lg10209");
            this.lg10296 = json.getString("lg10296");
            this.lg10296x = json.getString("lg10296x");
            this.lg103 = json.getString("lg103");
            this.lg10401 = json.getString("lg10401");
            this.lg10402 = json.getString("lg10402");
            this.lg10403 = json.getString("lg10403");
            this.lg10404 = json.getString("lg10404");
            this.lg10405 = json.getString("lg10405");
            this.lg10406 = json.getString("lg10406");
            this.lg10407 = json.getString("lg10407");
            this.lg10408 = json.getString("lg10408");
            this.lg10409 = json.getString("lg10409");
            this.lg10410 = json.getString("lg10410");
            this.lg10411 = json.getString("lg10411");
            this.lg10412 = json.getString("lg10412");
            this.lg10413 = json.getString("lg10413");
            this.lg10414 = json.getString("lg10414");
            this.lg10415 = json.getString("lg10415");
            this.lg10416 = json.getString("lg10416");
            this.lg105 = json.getString("lg105");
            this.lg10601 = json.getString("lg10601");
            this.lg10602 = json.getString("lg10602");
            this.lg10603 = json.getString("lg10603");
            this.lg10604 = json.getString("lg10604");
            this.lg10605 = json.getString("lg10605");
            this.lg10606 = json.getString("lg10606");
            this.lg10607 = json.getString("lg10607");
            this.lg10696 = json.getString("lg10696");
            this.lg10696x = json.getString("lg10696x");
            this.l1131 = json.getString("l1131");
            this.l1132 = json.getString("l1132");
            this.l1133 = json.getString("l1133");
            this.l1134 = json.getString("l1134");
            this.l114 = json.getString("l114");
            this.l11496x = json.getString("l11496x");
            this.l115 = json.getString("l115");
            this.l11596x = json.getString("l11596x");
            this.l116 = json.getString("l116");
            this.l11696x = json.getString("l11696x");
            this.l117 = json.getString("l117");
            this.l11796x = json.getString("l11796x");

        }
    }


    public void uNHydrate(String string) throws JSONException {
        Log.d(TAG, "uNHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.un01 = json.getString("un01");
            this.un02 = json.getString("un02");
            this.un03 = json.getString("un03");
            this.un04 = json.getString("un04");
            this.un0401x = json.getString("un0401x");
            this.un0402x = json.getString("un0402x");
            this.un05 = json.getString("un05");
            this.un06 = json.getString("un06");
            this.un0696x = json.getString("un0696x");
            this.un07 = json.getString("un07");
            this.un0701x = json.getString("un0701x");
            this.un0702x = json.getString("un0702x");
            this.un0703x = json.getString("un0703x");
            this.un0704x = json.getString("un0704x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MwraTable.COLUMN_ID, this.id);
        json.put(TableContracts.MwraTable.COLUMN_UID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.MwraTable.COLUMN_APPVERSION, this.appver);

        json.put(TableContracts.MwraTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.MwraTable.COLUMN_HHID, this.hhid);
        // json.put(TableContracts.MwraTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.MwraTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.MwraTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.MwraTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.MwraTable.COLUMN_NAME, this.name);
        json.put(TableContracts.MwraTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.MwraTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MwraTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MwraTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MwraTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MwraTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.MwraTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.MwraTable.COLUMN_SF1, new JSONObject(sF1toString()));
        json.put(TableContracts.MwraTable.COLUMN_SF2, new JSONObject(sF2toString()));
        json.put(TableContracts.MwraTable.COLUMN_SG, new JSONObject(sGtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SH1A, new JSONObject(sH1AtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SH1B, new JSONObject(sH1BtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SH2, new JSONObject(sH2toString()));
        json.put(TableContracts.MwraTable.COLUMN_SK, new JSONObject(sKtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SL, new JSONObject(sLtoString()));
        json.put(TableContracts.MwraTable.COLUMN_UN, new JSONObject(uNtoString()));

        return json;
    }


    public String sF1toString() throws JSONException {
        Log.d(TAG, "sF1toString: ");
        JSONObject json = new JSONObject();
        json.put("f101", f101)
                .put("f101a01", f101a01)
                .put("f101a02", f101a02)
                .put("f101a03", f101a03)
                .put("f101a04", f101a04)
                .put("f101a05", f101a05)
                .put("f101a06", f101a06)
                .put("f101a07", f101a07)
                .put("f101a08", f101a08)
                .put("f101a09", f101a09)
                .put("f101a10", f101a10)
                .put("f101a11", f101a11)
                .put("f101a12", f101a12)
                .put("f101a13", f101a13)
                .put("f101a14", f101a14)
                .put("f101a96", f101a96)
                .put("f101a96x", f101a96x)
                .put("f101b", f101b)
                .put("f101b01x", f101b01x)
                .put("f10201", f10201)
                .put("f10202", f10202)
                .put("f10203", f10203)
                .put("f10204", f10204)
                .put("f10205", f10205)
                .put("f10206", f10206)
                .put("f10207", f10207)
                .put("f10208", f10208)
                .put("f10209", f10209)
                .put("f10210", f10210)
                .put("f10211", f10211)
                .put("f10296", f10296)
                .put("f10296x", f10296x)
                .put("f10301", f10301)
                .put("f10302", f10302)
                .put("f10303", f10303)
                .put("f10304", f10304)
                .put("f10305", f10305)
                .put("f104", f104)
                .put("f105", f105)
                .put("f106", f106)
                .put("f107", f107)
                .put("f10796x", f10796x)
                .put("f108", f108)
                .put("f108wx", f108wx)
                .put("f108mx", f108mx)
                .put("f11001", f11001)
                .put("f11002", f11002)
                .put("f11003", f11003)
                .put("f11004", f11004)
                .put("f11005", f11005)
                .put("f11006", f11006)
                .put("f11007", f11007)
                .put("f11008", f11008)
                .put("f11009", f11009)
                .put("f11096", f11096)
                .put("f11096x", f11096x)
                .put("f111", f111)
                .put("f112", f112)
                .put("f113", f113)
                .put("f11301x", f11301x)
                .put("f114", f114)
                .put("f115", f115)
                .put("f116", f116)
                .put("f117", f117)
                .put("f118", f118)
                .put("f118mx", f118mx)
                .put("f118dx", f118dx)
                .put("f119", f119)
                .put("f120", f120)
                .put("f12001x", f12001x);
        return json.toString();
    }


    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f121a", f121a)
                .put("f121b", f121b)
                .put("f121b96x", f121b96x)
                .put("f12101", f12101)
                .put("f122", f122)
                .put("f12201x", f12201x)
                .put("f12301", f12301)
                .put("f12302", f12302)
                .put("f12303", f12303)
                .put("f12304", f12304)
                .put("f12305", f12305)
                .put("f12306", f12306)
                .put("f12307", f12307)
                .put("f12308", f12308)
                .put("f12309", f12309)
                .put("f12310", f12310)
                .put("f12396", f12396)
                .put("f12396x", f12396x)
                .put("f124", f124)
                .put("f12501", f12501)
                .put("f12502", f12502)
                .put("f12503", f12503)
                .put("f12504", f12504)
                .put("f12505", f12505)
                .put("f12506", f12506)
                .put("f12507", f12507)
                .put("f12601", f12601)
                .put("f12602", f12602)
                .put("f12603", f12603)
                .put("f12604", f12604)
                .put("f12605", f12605)
                .put("f12606", f12606)
                .put("f12607", f12607)
                .put("f12608", f12608)
                .put("f127", f127)
                .put("f12796x", f12796x)
                .put("f12801", f12801)
                .put("f12802", f12802)
                .put("f12803", f12803)
                .put("f12804", f12804)
                .put("f12805", f12805)
                .put("f12806", f12806)
                .put("f12807", f12807)
                .put("f12808", f12808)
                .put("f129", f129)
                .put("f13001", f13001)
                .put("f13002", f13002)
                .put("f13003", f13003)
                .put("f13004", f13004)
                .put("f13005", f13005)
                .put("f13006", f13006)
                .put("f13007", f13007)
                .put("f13008", f13008)
                .put("f13009", f13009)
                .put("f13010", f13010)
                .put("f13011", f13011)
                .put("f13012", f13012)
                .put("f13013", f13013)
                .put("f13014", f13014)
                .put("f13015", f13015)
                .put("f13096", f13096)
                .put("f13096x", f13096x)
                .put("f131", f131)
                .put("f13196x", f13196x)
                .put("f131a", f131a)
                .put("f13401", f13401)
                .put("f13402", f13402)
                .put("f13403", f13403)
                .put("f13404", f13404)
                .put("f13405", f13405)
                .put("f13406", f13406)
                .put("f13407", f13407)
                .put("f13408", f13408)
                .put("f13409", f13409)
                .put("f13410", f13410);
        return json.toString();
    }


    public String sGtoString() throws JSONException {
        Log.d(TAG, "sGtoString: ");
        JSONObject json = new JSONObject();
        json.put("g101", g101)
                .put("g102", g102)
                .put("g10296x", g10296x)
                .put("g10301", g10301)
                .put("g10302", g10302)
                .put("g10303", g10303)
                .put("g10304", g10304)
                .put("g10305", g10305)
                .put("g10306", g10306)
                .put("g10307", g10307)
                .put("g10308", g10308)
                .put("g10309", g10309)
                .put("g10310", g10310)
                .put("g10311", g10311)
                .put("g10312", g10312)
                .put("g10313", g10313)
                .put("g10314", g10314)
                .put("g10315", g10315)
                .put("g10396", g10396)
                .put("g10396x", g10396x)
                .put("g104", g104)
                .put("g10496x", g10496x)
                .put("g105", g105)
                .put("g10501x", g10501x)
                .put("g106", g106)
                .put("g107", g107)
                .put("g10701x", g10701x)
                .put("g108", g108)
                .put("g109", g109)
                .put("g110", g110)
                .put("g126", g126)
                .put("g127", g127)
                .put("g113", g113)
                .put("g114", g114)
                .put("g11496x", g11496x)
                .put("g115", g115)
                .put("g116", g116)
                .put("g117", g117)
                .put("g117hx", g117hx)
                .put("g117mx", g117mx)
                .put("g117dx", g117dx)
                .put("g11801", g11801)
                .put("g11801x", g11801x)
                .put("g11802", g11802)
                .put("g11802x", g11802x)
                .put("g11803", g11803)
                .put("g11803x", g11803x)
                .put("g11804", g11804)
                .put("g11804x", g11804x)
                .put("g11896", g11896)
                .put("g11896x", g11896x)
                .put("g11898", g11898)
                .put("g119", g119)
                .put("g120", g120)
                .put("g12096x", g12096x)
                .put("g121", g121)
                .put("g12196x", g12196x)
                .put("g122", g122)
                .put("g12301", g12301)
                .put("g12302", g12302)
                .put("g12303", g12303)
                .put("g12304", g12304)
                .put("g12305", g12305)
                .put("g12306", g12306)
                .put("g12307", g12307)
                .put("g12308", g12308)
                .put("g124", g124)
                .put("g1241", g1241)
                .put("g1242", g1242)
                .put("g1243", g1243)
                .put("g1244", g1244)
                .put("g1245", g1245)
                .put("g1246", g1246)
                .put("g1247", g1247)
                .put("g1248", g1248)
                .put("g1249", g1249)
                .put("g12410", g12410)
                .put("g12411", g12411)
                .put("g12412", g12412)
                .put("g12413", g12413)
                .put("g12401", g12401)
                .put("g1240101", g1240101)
                .put("g1240102", g1240102)
                .put("g1240103", g1240103)
                .put("g1240104", g1240104)
                .put("g1240105", g1240105)
                .put("g1240106", g1240106)
                .put("g1240107", g1240107)
                .put("g1240108", g1240108)
                .put("g1240109", g1240109)
                .put("g1240110", g1240110)
                .put("g1240111", g1240111)
                .put("g1240112", g1240112)
                .put("g1240113", g1240113)
                .put("g1240114", g1240114)
                .put("g12402", g12402)
                .put("g1240296x", g1240296x)
                .put("g125", g125)
                .put("g12501", g12501)
                .put("g1250101", g1250101)
                .put("g1250102", g1250102)
                .put("g1250103", g1250103)
                .put("g1250104", g1250104)
                .put("g1250105", g1250105)
                .put("g1250106", g1250106)
                .put("g1250107", g1250107)
                .put("g1250108", g1250108)
                .put("g128", g128)
                .put("g129", g129)
                .put("g130", g130);
        return json.toString();
    }


    public String sH1AtoString() throws JSONException {
        Log.d(TAG, "sH1AtoString: ");
        JSONObject json = new JSONObject();
        json.put("h101", h101)
                .put("h101mx", h101mx)
                .put("h101wx", h101wx)
                .put("h102", h102)
                .put("h103", h103)
                .put("h10401", h10401)
                .put("h10402", h10402)
                .put("h10403", h10403)
                .put("h10496", h10496)
                .put("h10496x", h10496x)
                .put("h105", h105)
                .put("h106", h106)
                .put("h1061x", h1061x)
                .put("h107", h107)
                .put("h10800", h10800)
                .put("h108a", h108a)
                .put("h108", h108)
                .put("h10896x", h10896x)
                .put("h10900", h10900)
                .put("h10901", h10901)
                .put("h1091", h1091)
                .put("h1092", h1092)
                .put("h1093", h1093)
                .put("h1094", h1094)
                .put("h1095", h1095)
                .put("h1096", h1096)
                .put("h1097", h1097)
                .put("h10997", h10997)
                .put("h10996", h10996)
                .put("h10996x", h10996x)
                .put("h11000", h11000)
                .put("h11001", h11001)
                .put("h110", h110)
                .put("h111", h111)
                .put("h11200", h11200)
                .put("h11201", h11201)
                .put("h11202", h11202)
                .put("h112", h112)
                .put("h113", h113)
                .put("h114", h114)
                .put("h115", h115)
                .put("h11501", h11501)
                .put("h11502", h11502)
                .put("h11503", h11503)
                .put("h11504", h11504)
                .put("h11505", h11505)
                .put("h11506", h11506)
                .put("h11507", h11507)
                .put("h11508", h11508)
                .put("h11509", h11509)
                .put("h11596", h11596)
                .put("h11596x", h11596x)
                .put("h116", h116)
                .put("h11701", h11701)
                .put("h118", h118)
                .put("h119", h119)
                .put("h120", h120)
                .put("h121", h121)
                .put("h122", h122)
                .put("h1221x", h1221x)
                .put("h123", h123)
                .put("h124", h124);
        return json.toString();
    }


    public String sH1BtoString() throws JSONException {
        Log.d(TAG, "sH1BtoString: ");
        JSONObject json = new JSONObject();
        json.put("h125", h125)
                .put("h126", h126)
                .put("h127", h127)
                .put("h12796x", h12796x)
                .put("h128", h128)
                .put("h12896x", h12896x)
                .put("h12901", h12901)
                .put("h12902", h12902)
                .put("h12903", h12903)
                .put("h12904", h12904)
                .put("h12905", h12905)
                .put("h12906", h12906)
                .put("h130", h130)
                .put("h131", h131)
                .put("h1310101", h1310101)
                .put("h1310102", h1310102)
                .put("h1310103", h1310103)
                .put("h1310104", h1310104)
                .put("h1310105", h1310105)
                .put("h1310106", h1310106)
                .put("h1310107", h1310107)
                .put("h132", h132)
                .put("h132a", h132a)
                .put("h132a96x", h132a96x)
                .put("h13301", h13301)
                .put("h13302", h13302)
                .put("h13303", h13303)
                .put("h13304", h13304)
                .put("h13305", h13305)
                .put("h13306", h13306)
                .put("h13307", h13307)
                .put("h13308", h13308)
                .put("h13309", h13309)
                .put("h13310", h13310)
                .put("h134", h134)
                .put("h13501", h13501)
                .put("h13502", h13502)
                .put("h13503", h13503)
                .put("h13504", h13504)
                .put("h13505", h13505)
                .put("h13506", h13506)
                .put("h13507", h13507)
                .put("h13508", h13508)
                .put("h13509", h13509)
                .put("h13598", h13598)
                .put("h136a", h136a)
                .put("h136b", h136b)
                .put("h136c", h136c)
                .put("h136d", h136d)
                .put("h136e", h136e)
                .put("h136f", h136f)
                .put("h13696", h13696)
                .put("h13696x", h13696x)
                .put("h1361", h1361)
                .put("h1362a", h1362a)
                .put("h1362b", h1362b)
                .put("h1362c", h1362c)
                .put("h1362d", h1362d)
                .put("h1362e", h1362e)
                .put("h1362f", h1362f)
                .put("h1362g", h1362g)
                .put("h1362h", h1362h)
                .put("h1362i", h1362i)
                .put("h1362j", h1362j)
                .put("h136298", h136298)
                .put("h1363", h1363)
                .put("h137", h137)
                .put("h1371", h1371)
                .put("h137196x", h137196x)
                .put("h1372", h1372)
                .put("h1373", h1373)
                .put("h137396x", h137396x);
        return json.toString();
    }


    public String sH2toString() throws JSONException {
        Log.d(TAG, "sH2toString: ");
        JSONObject json = new JSONObject();
        json.put("h201", h201)
                .put("h201hx", h201hx)
                .put("h201dx", h201dx)
                .put("h201wx", h201wx)
                .put("h202", h202)
                .put("h203h", h203h)
                .put("h203d", h203d)
                .put("h203w", h203w)
                .put("h204", h204)
                .put("h20496x", h20496x)
                .put("h205", h205)
                .put("h20596x", h20596x)
                .put("h2051a", h2051a)
                .put("h2051b", h2051b)
                .put("h2051c", h2051c)
                .put("h2051d", h2051d)
                .put("h2051e", h2051e)
                .put("h2051f", h2051f)
                .put("h2051g", h2051g)
                .put("h2051h", h2051h)
                .put("h2051i", h2051i)
                .put("h2051j", h2051j)
                .put("h205196", h205196)
                .put("h205196x", h205196x)
                .put("h206", h206)
                .put("h20701", h20701)
                .put("h20702", h20702)
                .put("h20703", h20703)
                .put("h20704", h20704)
                .put("h20705", h20705)
                .put("h20706", h20706)
                .put("h20707", h20707)
                .put("h20708", h20708)
                .put("h20798", h20798)
                .put("h20801", h20801)
                .put("h20802", h20802)
                .put("h20803", h20803)
                .put("h20804", h20804)
                .put("h20805", h20805)
                .put("h20806", h20806)
                .put("h20896", h20896)
                .put("h20896x", h20896x)
                .put("h208a", h208a)
                .put("h208b", h208b)
                .put("h208b01", h208b01)
                .put("h208b02", h208b02)
                .put("h208b03", h208b03)
                .put("h208b04", h208b04)
                .put("h208b05", h208b05)
                .put("h208b06", h208b06)
                .put("h208b07", h208b07)
                .put("h208b08", h208b08)
                .put("h208b09", h208b09)
                .put("h208b98", h208b98)
                .put("h208c", h208c)
                .put("h208d", h208d)
                .put("h208d96x", h208d96x)
                .put("h209", h209)
                .put("h209a", h209a)
                .put("h209a96x", h209a96x)
                .put("h210", h210)
                .put("h21101", h21101)
                .put("h21102", h21102)
                .put("h21103", h21103)
                .put("h21104", h21104)
                .put("h21105", h21105)
                .put("h21106", h21106)
                .put("h21107", h21107)
                .put("h21108", h21108)
                .put("h21109", h21109)
                .put("h21110", h21110)
                .put("h212", h212)
                .put("h213", h213)
                .put("h214", h214)
                .put("h214a", h214a)
                .put("h214b01", h214b01)
                .put("h214b02", h214b02)
                .put("h214b03", h214b03)
                .put("h214b04", h214b04)
                .put("h214b05", h214b05)
                .put("h214b06", h214b06)
                .put("h214b96", h214b96)
                .put("h214b96x", h214b96x)
                .put("h214b98", h214b98)
                .put("h215", h215)
                .put("h216", h216)
                .put("h216a", h216a)
                .put("h216a96x", h216a96x)
                .put("h21701", h21701)
                .put("h21702", h21702)
                .put("h21703", h21703)
                .put("h21704", h21704)
                .put("h21705", h21705)
                .put("h21706", h21706)
                .put("h21796", h21796)
                .put("h21796x", h21796x)
                .put("h218", h218)
                .put("h219", h219)
                .put("h21996x", h21996x)
                .put("h2201", h2201)
                .put("h2201x", h2201x)
                .put("h2202", h2202)
                .put("h2202x", h2202x)
                .put("h2203", h2203)
                .put("h2203x", h2203x)
                .put("h2204", h2204)
                .put("h2204x", h2204x)
                .put("h2205", h2205)
                .put("h2205x", h2205x)
                .put("h2206", h2206)
                .put("h2206x", h2206x)
                .put("h22096", h22096)
                .put("h22096x", h22096x)
                .put("h221", h221)
                .put("h222", h222)
                .put("h22296x", h22296x)
                .put("h223", h223);
        return json.toString();
    }


    public String sKtoString() throws JSONException {
        Log.d(TAG, "sKtoString: ");
        JSONObject json = new JSONObject();
        json.put("k101", k101)
                .put("k101a01", k101a01)
                .put("k101a02", k101a02)
                .put("k101a03", k101a03)
                .put("k101a04", k101a04)
                .put("k101a05", k101a05)
                .put("k101a06", k101a06)
                .put("k101a07", k101a07)
                .put("k101a08", k101a08)
                .put("k101a09", k101a09)
                .put("k101a10", k101a10)
                .put("k101a11", k101a11)
                .put("k101a12", k101a12)
                .put("k101a13", k101a13)
                .put("k101a14", k101a14)
                .put("k101a15", k101a15)
                .put("k101a16", k101a16)
                .put("k101a96", k101a96)
                .put("k101a96x", k101a96x)
                .put("k101b", k101b)
                .put("k102", k102)
                .put("k103", k103)
                .put("k103a01", k103a01)
                .put("k103a02", k103a02)
                .put("k103a03", k103a03)
                .put("k103a04", k103a04)
                .put("k103a05", k103a05)
                .put("k103a06", k103a06)
                .put("k103a07", k103a07)
                .put("k103a08", k103a08)
                .put("k103a09", k103a09)
                .put("k103a10", k103a10)
                .put("k103a11", k103a11)
                .put("k103a12", k103a12)
                .put("k103a13", k103a13)
                .put("k10401", k10401)
                .put("k10402", k10402)
                .put("k10403", k10403)
                .put("k10404", k10404)
                .put("k10405", k10405)
                .put("k10406", k10406)
                .put("k10477", k10477)
                .put("k10408", k10408)
                .put("k10409", k10409)
                .put("k10410", k10410)
                .put("k10411", k10411)
                .put("k10412", k10412)
                .put("k10413", k10413)
                .put("k105", k105)
                .put("k105a", k105a)
                .put("k105a01x", k105a01x)
                .put("k105a02x", k105a02x)
                .put("k105b", k105b)
                .put("k105c01", k105c01)
                .put("k105c02", k105c02)
                .put("k105c03", k105c03)
                .put("k105c04", k105c04)
                .put("k105c05", k105c05)
                .put("k105c06", k105c06)
                .put("k105c07", k105c07)
                .put("k105c08", k105c08)
                .put("k105c09", k105c09)
                .put("k105c96", k105c96)
                .put("k105c96x", k105c96x)
                .put("k105dm", k105dm)
                .put("k105dy", k105dy)
                .put("k10601", k10601)
                .put("k10602", k10602)
                .put("k10603", k10603)
                .put("k10604", k10604)
                .put("k10605", k10605)
                .put("k10606", k10606)
                .put("k10607", k10607)
                .put("k10608", k10608)
                .put("k10696", k10696)
                .put("k10696x", k10696x)
                .put("k107", k107)
                .put("k107a", k107a)
                .put("k107a01", k107a01)
                .put("k107a02", k107a02)
                .put("k107a03", k107a03)
                .put("k107a04", k107a04)
                .put("k107a05", k107a05)
                .put("k107a06", k107a06)
                .put("k107a07", k107a07)
                .put("k107a08", k107a08)
                .put("k107a99", k107a99)
                .put("k108", k108)
                .put("k108a", k108a)
                .put("k109", k109);
        return json.toString();
    }


    public String sLtoString() throws JSONException {
        Log.d(TAG, "sLtoString: ");
        JSONObject json = new JSONObject();
        json.put("l101", l101)
                .put("l102", l102)
                .put("l102a", l102a)
                .put("l102a96x", l102a96x)
                .put("l103", l103)
                .put("l104", l104)
                .put("l10496x", l10496x)
                .put("l105", l105)
                .put("l106", l106)
                .put("l10696x", l10696x)
                .put("l107", l107)
                .put("l10796x", l10796x)
                .put("l108", l108)
                .put("l10896x", l10896x)
                .put("l109", l109)
                .put("l10996x", l10996x)
                .put("l110", l110)
                .put("l111", l111)
                .put("l1121", l1121)
                .put("l1122", l1122)
                .put("l1123", l1123)
                .put("l1124", l1124)
                .put("l1125", l1125)
                .put("lg101", lg101)
                .put("lg10201", lg10201)
                .put("lg10202", lg10202)
                .put("lg10203", lg10203)
                .put("lg10204", lg10204)
                .put("lg10205", lg10205)
                .put("lg10206", lg10206)
                .put("lg10207", lg10207)
                .put("lg10208", lg10208)
                .put("lg10209", lg10209)
                .put("lg10296", lg10296)
                .put("lg10296x", lg10296x)
                .put("lg103", lg103)
                .put("lg10401", lg10401)
                .put("lg10402", lg10402)
                .put("lg10403", lg10403)
                .put("lg10404", lg10404)
                .put("lg10405", lg10405)
                .put("lg10406", lg10406)
                .put("lg10407", lg10407)
                .put("lg10408", lg10408)
                .put("lg10409", lg10409)
                .put("lg10410", lg10410)
                .put("lg10411", lg10411)
                .put("lg10412", lg10412)
                .put("lg10413", lg10413)
                .put("lg10414", lg10414)
                .put("lg10415", lg10415)
                .put("lg10416", lg10416)
                .put("lg105", lg105)
                .put("lg10601", lg10601)
                .put("lg10602", lg10602)
                .put("lg10603", lg10603)
                .put("lg10604", lg10604)
                .put("lg10605", lg10605)
                .put("lg10606", lg10606)
                .put("lg10607", lg10607)
                .put("lg10696", lg10696)
                .put("lg10696x", lg10696x)
                .put("l1131", l1131)
                .put("l1132", l1132)
                .put("l1133", l1133)
                .put("l1134", l1134)
                .put("l114", l114)
                .put("l11496x", l11496x)
                .put("l115", l115)
                .put("l11596x", l11596x)
                .put("l116", l116)
                .put("l11696x", l11696x)
                .put("l117", l117)
                .put("l11796x", l11796x);
        return json.toString();
    }


    public String uNtoString() throws JSONException {
        Log.d(TAG, "uNtoString: ");
        JSONObject json = new JSONObject();
        json.put("un01", un01)
                .put("un02", un02)
                .put("un03", un03)
                .put("un04", un04)
                .put("un0401x", un0401x)
                .put("un0402x", un0402x)
                .put("un05", un05)
                .put("un06", un06)
                .put("un0696x", un0696x)
                .put("un07", un07)
                .put("un0701x", un0701x)
                .put("un0702x", un0702x)
                .put("un0703x", un0703x)
                .put("un0704x", un0704x);
        return json.toString();
    }

}
