package edu.aku.abdulsajid.nanm2022.database;


import static edu.aku.abdulsajid.nanm2022.core.MainApp.IBAHC;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.PROJECT_NAME;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.adol;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.child;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedCluster;
import static edu.aku.abdulsajid.nanm2022.core.MainApp.selectedHousehold;
import static edu.aku.abdulsajid.nanm2022.core.UserAuth.checkPassword;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.AdolescentTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.ChildTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.ClusterTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.EntryLogTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.FamilyMembersTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.FormsTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.MaternalMortalityTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.MwraTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.PregnancyDetailsTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.PregnancyMasterTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.RandomHHTable;
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.UsersTable;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.models.Adolescent;
import edu.aku.abdulsajid.nanm2022.models.Child;
import edu.aku.abdulsajid.nanm2022.models.Clusters;
import edu.aku.abdulsajid.nanm2022.models.EntryLog;
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.models.MWRA;
import edu.aku.abdulsajid.nanm2022.models.MaternalMortality;
import edu.aku.abdulsajid.nanm2022.models.PregnancyDetails;
import edu.aku.abdulsajid.nanm2022.models.PregnancyMaster;
import edu.aku.abdulsajid.nanm2022.models.RandomHH;
import edu.aku.abdulsajid.nanm2022.models.Users;
/*
import edu.aku.abdulsajid.smkHhMl2022.models.Villages;
*/



/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    public static final String DATABASE_PASSWORD = IBAHC;
    private static final int DATABASE_VERSION = 2;
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CreateTable.SQL_CREATE_USERS);
        db.execSQL(CreateTable.SQL_CREATE_CLUSTERS);
        db.execSQL(CreateTable.SQL_CREATE_RANDOM_HH);

        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        db.execSQL(CreateTable.SQL_CREATE_FAMILYMEMBERS);
        db.execSQL(CreateTable.SQL_CREATE_ENTRYLOGS);
        db.execSQL(CreateTable.SQL_CREATE_MWRA);
        db.execSQL(CreateTable.SQL_CREATE_PREGNANCY_DETAILS);
        db.execSQL(CreateTable.SQL_CREATE_PREGNANCY_MASTER);
        db.execSQL(CreateTable.SQL_CREATE_MATERNAL_MORTIALITY);
        db.execSQL(CreateTable.SQL_CREATE_CHILD);
        db.execSQL(CreateTable.SQL_CREATE_ADOLESCENT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
                /*db.execSQL(CreateTable.SQL_ALTER_FORMS_GPS_LAT);
                db.execSQL(CreateTable.SQL_ALTER_FORMS_GPS_LNG);
                db.execSQL(CreateTable.SQL_ALTER_FORMS_GPS_DATE);
                db.execSQL(CreateTable.SQL_ALTER_FORMS_GPS_ACC);

                db.execSQL(CreateTable.SQL_ALTER_CHILD_GPS_LAT);
                db.execSQL(CreateTable.SQL_ALTER_CHILD_GPS_LNG);
                db.execSQL(CreateTable.SQL_ALTER_CHILD_GPS_DATE);
                db.execSQL(CreateTable.SQL_ALTER_CHILD_GPS_ACC);*/
                // DO NOT BREAK AFTER EACH VERSION
                //break;
            case 2:

            default:

        }
    }


    //ADDITION in DB
    public Long addForm(Forms form) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsTable.COLUMN_CLUSTER_CODE, form.getClusterCode());
        values.put(FormsTable.COLUMN_HHID, form.getHhid());
        values.put(FormsTable.COLUMN_SNO, form.getSno());
        values.put(FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsTable.COLUMN_SA, form.sAtoString());
        values.put(FormsTable.COLUMN_SM, form.sMtoString());
        values.put(FormsTable.COLUMN_SN, form.sNtoString());
        values.put(FormsTable.COLUMN_SO, form.sOtoString());
        values.put(FormsTable.COLUMN_SE2, form.sE2toString());
        values.put(FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppver());
        values.put(FormsTable.COLUMN_SYNCED, form.getSynced());
        values.put(FormsTable.COLUMN_SYNC_DATE, form.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addFamilyMembers(FamilyMembers members) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_PROJECT_NAME, members.getProjectName());
        values.put(FamilyMembersTable.COLUMN_UID, members.getUid());
        values.put(FamilyMembersTable.COLUMN_UUID, members.getUuid());
        values.put(FamilyMembersTable.COLUMN_CLUSTER_CODE, members.getClusterCode());
        values.put(FamilyMembersTable.COLUMN_HHID, members.getHhid());
        values.put(FamilyMembersTable.COLUMN_AGE_MONTHS, members.getAgeInMonths());
        values.put(FamilyMembersTable.COLUMN_MUID, members.getMuid());
        values.put(FamilyMembersTable.COLUMN_MOTHER_PRESENT, members.getMotherPresent());
        values.put(FamilyMembersTable.COLUMN_USERNAME, members.getUserName());
        values.put(FamilyMembersTable.COLUMN_SYSDATE, members.getSysDate());
        values.put(FamilyMembersTable.COLUMN_INDEXED, members.getIndexed());
        values.put(FamilyMembersTable.COLUMN_SD, members.sDtoString());
        values.put(FamilyMembersTable.COLUMN_ISTATUS, members.getiStatus());
        values.put(FamilyMembersTable.COLUMN_DEVICETAGID, members.getDeviceTag());
        values.put(FamilyMembersTable.COLUMN_DEVICEID, members.getDeviceId());
        values.put(FamilyMembersTable.COLUMN_APPVERSION, members.getAppver());
        values.put(FamilyMembersTable.COLUMN_SYNCED, members.getSynced());
        values.put(FamilyMembersTable.COLUMN_SYNC_DATE, members.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                FamilyMembersTable.TABLE_NAME,
                FamilyMembersTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMWRA(MWRA mwra) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MwraTable.COLUMN_PROJECT_NAME, mwra.getProjectName());
        values.put(MwraTable.COLUMN_UID, mwra.getUid());
        values.put(MwraTable.COLUMN_UUID, mwra.getUuid());
        values.put(MwraTable.COLUMN_FMUID, mwra.getFmuid());
        //  values.put(MwraTable.COLUMN_MUID, mwra.getMuid());
        values.put(MwraTable.COLUMN_SNO, mwra.getSno());
        values.put(MwraTable.COLUMN_PSU_CODE, mwra.getpsuCode());
        values.put(MwraTable.COLUMN_HHID, mwra.getHhid());
        values.put(MwraTable.COLUMN_USERNAME, mwra.getUserName());
        values.put(MwraTable.COLUMN_SYSDATE, mwra.getSysDate());
        values.put(MwraTable.COLUMN_INDEXED, mwra.getIndexed());
        values.put(MwraTable.COLUMN_NAME, mwra.getName());
        values.put(MwraTable.COLUMN_SF1, mwra.sF1toString());
        values.put(MwraTable.COLUMN_SF2, mwra.sF2toString());
        values.put(MwraTable.COLUMN_SG, mwra.sGtoString());
        values.put(MwraTable.COLUMN_SH1A, mwra.sH1AtoString());
        values.put(MwraTable.COLUMN_SH1B, mwra.sH1BtoString());
        values.put(MwraTable.COLUMN_SH2, mwra.sH2toString());
        values.put(MwraTable.COLUMN_SK, mwra.sKtoString());
        values.put(MwraTable.COLUMN_SL, mwra.sLtoString());
        values.put(MwraTable.COLUMN_UN, mwra.uNtoString());
        values.put(MwraTable.COLUMN_ISTATUS, mwra.getiStatus());
        values.put(MwraTable.COLUMN_DEVICETAGID, mwra.getDeviceTag());
        values.put(MwraTable.COLUMN_DEVICEID, mwra.getDeviceId());
        values.put(MwraTable.COLUMN_APPVERSION, mwra.getAppver());
        values.put(MwraTable.COLUMN_SYNCED, mwra.getSynced());
        values.put(MwraTable.COLUMN_SYNC_DATE, mwra.getSyncDate());

        long newRowId;
        newRowId = db.insertOrThrow(
                MwraTable.TABLE_NAME,
                MwraTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addChild(Child child) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ChildTable.COLUMN_PROJECT_NAME, child.getProjectName());
        values.put(ChildTable.COLUMN_UID, child.getUid());
        values.put(ChildTable.COLUMN_UUID, child.getUuid());
        values.put(ChildTable.COLUMN_FMUID, child.getFmuid());
        values.put(ChildTable.COLUMN_MUID, child.getMuid());
        values.put(ChildTable.COLUMN_SNO, child.getSno());
        values.put(ChildTable.COLUMN_PSU_CODE, child.getpsuCode());
        values.put(ChildTable.COLUMN_HHID, child.getHhid());
        values.put(ChildTable.COLUMN_USERNAME, child.getUserName());
        values.put(ChildTable.COLUMN_SYSDATE, child.getSysDate());
        values.put(ChildTable.COLUMN_INDEXED, child.getIndexed());
        values.put(ChildTable.COLUMN_NAME, child.getName());
        values.put(ChildTable.COLUMN_SIM, child.sIMtoString());
        values.put(ChildTable.COLUMN_ISTATUS, child.getiStatus());
        values.put(ChildTable.COLUMN_DEVICETAGID, child.getDeviceTag());
        values.put(ChildTable.COLUMN_DEVICEID, child.getDeviceId());
        values.put(ChildTable.COLUMN_APPVERSION, child.getAppver());
        values.put(ChildTable.COLUMN_SYNCED, child.getSynced());
        values.put(ChildTable.COLUMN_SYNC_DATE, child.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                ChildTable.TABLE_NAME,
                ChildTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addAdolescent(Adolescent adol) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AdolescentTable.COLUMN_PROJECT_NAME, adol.getProjectName());
        values.put(AdolescentTable.COLUMN_UID, adol.getUid());
        values.put(AdolescentTable.COLUMN_UUID, adol.getUuid());
        values.put(AdolescentTable.COLUMN_FMUID, adol.getFmuid());
        values.put(AdolescentTable.COLUMN_MUID, adol.getMuid());
        values.put(AdolescentTable.COLUMN_SNO, adol.getSno());
        values.put(AdolescentTable.COLUMN_PSU_CODE, adol.getpsuCode());
        values.put(AdolescentTable.COLUMN_HHID, adol.getHhid());
        values.put(AdolescentTable.COLUMN_USERNAME, adol.getUserName());
        values.put(AdolescentTable.COLUMN_SYSDATE, adol.getSysDate());
        values.put(AdolescentTable.COLUMN_INDEXED, adol.getIndexed());
        values.put(AdolescentTable.COLUMN_NAME, adol.getName());
        values.put(AdolescentTable.COLUMN_SAH1, adol.sAH1toString());
        values.put(AdolescentTable.COLUMN_SAH2, adol.sAH2toString());
        values.put(AdolescentTable.COLUMN_SAH3, adol.sAH3toString());
        values.put(AdolescentTable.COLUMN_SAH4, adol.sAH4toString());
        values.put(AdolescentTable.COLUMN_SAH5, adol.sAH5toString());
        values.put(AdolescentTable.COLUMN_SAH6, adol.sAH6toString());
        values.put(AdolescentTable.COLUMN_SAH7, adol.sAH7toString());
        values.put(AdolescentTable.COLUMN_ISTATUS, adol.getiStatus());
        values.put(AdolescentTable.COLUMN_DEVICETAGID, adol.getDeviceTag());
        values.put(AdolescentTable.COLUMN_DEVICEID, adol.getDeviceId());
        values.put(AdolescentTable.COLUMN_APPVERSION, adol.getAppver());
        values.put(AdolescentTable.COLUMN_SYNCED, adol.getSynced());
        values.put(AdolescentTable.COLUMN_SYNC_DATE, adol.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                AdolescentTable.TABLE_NAME,
                AdolescentTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addEntryLog(EntryLog entryLog) throws SQLiteException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_EB_CODE, entryLog.getEbCode());
        values.put(EntryLogTable.COLUMN_HHID, entryLog.getHhid());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ISTATUS96x, entryLog.getiStatus96x());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_ENTRY_DATE, entryLog.getEntryDate());
        values.put(EntryLogTable.COLUMN_DEVICEID, entryLog.getDeviceId());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNC_DATE, entryLog.getSyncDate());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());

        long newRowId;
        newRowId = db.insertOrThrow(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addPregnancyMaster(PregnancyMaster pregM) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyMasterTable.COLUMN_PROJECT_NAME, pregM.getProjectName());
        values.put(PregnancyMasterTable.COLUMN_UID, pregM.getUid());
        values.put(PregnancyMasterTable.COLUMN_UUID, pregM.getUuid());
        values.put(PregnancyMasterTable.COLUMN_FMUID, pregM.getFmuid());
        values.put(PregnancyMasterTable.COLUMN_PSU_CODE, pregM.getClusterCode());
        values.put(PregnancyMasterTable.COLUMN_HHID, pregM.getHhid());
        values.put(PregnancyMasterTable.COLUMN_SNO, pregM.getSno());
        values.put(PregnancyMasterTable.COLUMN_M_NAME, pregM.getMName());
        values.put(PregnancyMasterTable.COLUMN_USERNAME, pregM.getUserName());
        values.put(PregnancyMasterTable.COLUMN_SYSDATE, pregM.getSysDate());
        values.put(PregnancyMasterTable.COLUMN_SE1, pregM.sE1toString());
        values.put(PregnancyMasterTable.COLUMN_ISTATUS, pregM.getiStatus());
        values.put(PregnancyMasterTable.COLUMN_DEVICETAGID, pregM.getDeviceTag());
        values.put(PregnancyMasterTable.COLUMN_DEVICEID, pregM.getDeviceId());
        values.put(PregnancyMasterTable.COLUMN_APPVERSION, pregM.getAppver());
        values.put(PregnancyMasterTable.COLUMN_SYNCED, pregM.getSynced());
        values.put(PregnancyMasterTable.COLUMN_SYNC_DATE, pregM.getSyncDate());

        long newRowId;
        newRowId = db.insertOrThrow(
                PregnancyMasterTable.TABLE_NAME,
                PregnancyMasterTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addPregnancyDetails(PregnancyDetails pregD) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyDetailsTable.COLUMN_PROJECT_NAME, pregD.getProjectName());
        values.put(PregnancyDetailsTable.COLUMN_UID, pregD.getUid());
        values.put(PregnancyDetailsTable.COLUMN_UUID, pregD.getUuid());
        values.put(PregnancyDetailsTable.COLUMN_FMUID, pregD.getFmuid());
        values.put(PregnancyDetailsTable.COLUMN_PSU_CODE, pregD.getPsuCode());
        values.put(PregnancyDetailsTable.COLUMN_HHID, pregD.getHhid());
        values.put(PregnancyDetailsTable.COLUMN_PSNO, pregD.getPSno());
        values.put(PregnancyDetailsTable.COLUMN_MSNO, pregD.getMsno());
        values.put(PregnancyDetailsTable.COLUMN_M_NAME, pregD.getMName());
        values.put(PregnancyDetailsTable.COLUMN_USERNAME, pregD.getUserName());
        values.put(PregnancyDetailsTable.COLUMN_SYSDATE, pregD.getSysDate());
        values.put(PregnancyDetailsTable.COLUMN_SE1, pregD.sE1toString());
        values.put(PregnancyDetailsTable.COLUMN_ISTATUS, pregD.getiStatus());
        values.put(PregnancyDetailsTable.COLUMN_DEVICETAGID, pregD.getDeviceTag());
        values.put(PregnancyDetailsTable.COLUMN_DEVICEID, pregD.getDeviceId());
        values.put(PregnancyDetailsTable.COLUMN_APPVERSION, pregD.getAppver());
        values.put(PregnancyDetailsTable.COLUMN_SYNCED, pregD.getSynced());
        values.put(PregnancyDetailsTable.COLUMN_SYNC_DATE, pregD.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                PregnancyDetailsTable.TABLE_NAME,
                PregnancyDetailsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMortality(MaternalMortality mortality) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MaternalMortalityTable.COLUMN_PROJECT_NAME, mortality.getProjectName());
        values.put(MaternalMortalityTable.COLUMN_UID, mortality.getUid());
        values.put(MaternalMortalityTable.COLUMN_UUID, mortality.getUuid());
        values.put(MaternalMortalityTable.COLUMN_PSU_CODE, mortality.getpsuCode());
        values.put(MaternalMortalityTable.COLUMN_HHID, mortality.getHhid());
        values.put(MaternalMortalityTable.COLUMN_SNO, mortality.getSno());
        values.put(MaternalMortalityTable.COLUMN_USERNAME, mortality.getUserName());
        values.put(MaternalMortalityTable.COLUMN_SYSDATE, mortality.getSysDate());
        values.put(MaternalMortalityTable.COLUMN_ISTATUS, mortality.getiStatus());
        values.put(MaternalMortalityTable.COLUMN_DEVICETAGID, mortality.getDeviceTag());
        values.put(MaternalMortalityTable.COLUMN_DEVICEID, mortality.getDeviceId());
        values.put(MaternalMortalityTable.COLUMN_APPVERSION, mortality.getAppver());
        values.put(MaternalMortalityTable.COLUMN_SYNCED, mortality.getSynced());
        values.put(MaternalMortalityTable.COLUMN_SYNC_DATE, mortality.getSyncDate());

        values.put(MaternalMortalityTable.COLUMN_SE2, mortality.sE2toString());

        long newRowId;
        newRowId = db.insert(
                MaternalMortalityTable.TABLE_NAME,
                MaternalMortalityTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesfamilyListColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(column, value);
        String selection = FamilyMembersTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.familyMember.getId())};
        return db.update(FamilyMembersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesChildColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ChildTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(child.getId())};

        return db.update(ChildTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesAdolColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = AdolescentTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(adol.getId())};

        return db.update(AdolescentTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMWRAColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = MwraTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.mwra.getId())};

        return db.update(MwraTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesPregnancyMasterColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = PregnancyMasterTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.pregM.getId())};

        return db.update(PregnancyMasterTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesPregnancyDetailsColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = PregnancyDetailsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.pregD.getId())};

        return db.update(PregnancyDetailsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMortalityColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = MaternalMortalityTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.mortality.getId())};

        return db.update(MaternalMortalityTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, MainApp.form.getiStatus());

        // Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    //Functions that dealing with table data
    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException, IllegalArgumentException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                UsersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            loggedInUser = new Users().hydrate(c);

        }
        boolean countCheck = c.getCount() > 0;
        if (c != null && !c.isClosed()) {
            c.close();
        }

        if (checkPassword(password, loggedInUser.getPassword())) {
            MainApp.user = loggedInUser;
            MainApp.selectedDistrict = loggedInUser.getDist_id();
            return countCheck;
        } else {
            return false;
        }
    }


    public ArrayList<Forms> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Forms> allForms = new ArrayList<>();

        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Forms forms = new Forms();
            forms.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            forms.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            forms.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            forms.setUserName(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME)));
            allForms.add(forms);
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }

        return allForms;
    }


    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    public int syncversionApp(JSONArray VersionList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        long count = 0;

        JSONObject jsonObjectVersion = ((JSONArray) VersionList.getJSONObject(0).get("elements")).getJSONObject(0);

        String appPath = jsonObjectVersion.getString("outputFile");
        String versionCode = jsonObjectVersion.getString("versionCode");

        MainApp.editor.putString("outputFile", jsonObjectVersion.getString("outputFile"));
        MainApp.editor.putString("versionCode", jsonObjectVersion.getString("versionCode"));
        MainApp.editor.putString("versionName", jsonObjectVersion.getString("versionName") + ".");
        MainApp.editor.apply();
        count++;
          /*  VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectVersion);

            ContentValues values = new ContentValues();

            values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            //db.close();
        }*/

        return (int) count;
    }

    public int syncAppUser(JSONArray userList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < userList.length(); i++) {

            JSONObject jsonObjectUser = userList.getJSONObject(i);

            Users user = new Users();
            user.sync(jsonObjectUser);
            ContentValues values = new ContentValues();

            values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
            values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
            values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
            values.put(UsersTable.COLUMN_ENABLED, user.getEnabled());
            values.put(UsersTable.COLUMN_ISNEW_USER, user.getNewUser());
            values.put(UsersTable.COLUMN_PWD_EXPIRY, user.getPwdExpiry());
            values.put(UsersTable.COLUMN_DESIGNATION, user.getDesignation());
            values.put(UsersTable.COLUMN_DIST_ID, user.getDist_id());
            long rowID = db.insertOrThrow(UsersTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        //db.close();
        return insertCount;
    }

    public int syncClusters(JSONArray clusterList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(ClusterTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < clusterList.length(); i++) {

            JSONObject json = clusterList.getJSONObject(i);

            Clusters clusters = new Clusters();
            clusters.sync(json);
            ContentValues values = new ContentValues();

            values.put(ClusterTable.COLUMN_GEOAREA, clusters.getGeoarea());
            values.put(ClusterTable.COLUMN_DIST_ID, clusters.getDistId());
            values.put(ClusterTable.COLUMN_CLUSTER_CODE, clusters.getClusterCode());

            long rowID = db.insertOrThrow(ClusterTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    public int syncbl_randomised(JSONArray list) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(RandomHHTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < list.length(); i++) {
            JSONObject json = list.getJSONObject(i);
            RandomHH ran = new RandomHH();
            ran.sync(json);
            ContentValues values = new ContentValues();
            values.put(RandomHHTable.COLUMN_SNO, ran.getSno());
            values.put(RandomHHTable.COLUMN_CLUSTER_CODE, ran.getClusterCode());
            values.put(RandomHHTable.COLUMN_HH_NO, ran.getHhno());
            values.put(RandomHHTable.COLUMN_HEAD_HH, ran.getHeadhh());
            long rowID = db.insertOrThrow(RandomHHTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }

        return insertCount;
    }


    //get UnSyncedTables
    public JSONArray getUnsyncedFormHH() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FormsTable.COLUMN_SYNCED + " = '' AND " +
                FormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedFormHH: " + c.getCount());
            Forms form = new Forms();
            allForms.put(form.Hydrate(c).toJSONObject());


        }

        c.close();
        //db.close();

        Log.d(TAG, "getUnsyncedFormHH: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedFormHH: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedFamilyMembers() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                FamilyMembersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedFamilyMembers: " + c.getCount());
            FamilyMembers fm = new FamilyMembers();
            all.put(fm.Hydrate(c).toJSONObject());
        }

        c.close();

        //db.close();

        Log.d(TAG, "getUnsyncedFamilyMembers: " + all.toString().length());
        Log.d(TAG, "getUnsyncedFamilyMembers: " + all);
        return all;
    }

    public JSONArray getUnsyncedMWRA() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = MwraTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = MwraTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedMWRA: " + c.getCount());
            MWRA mwra = new MWRA();
            all.put(mwra.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedMWRA: " + all.toString().length());
        Log.d(TAG, "getUnsyncedMWRA: " + all);
        return all;
    }

    public JSONArray getUnsyncedPregnancyDetails() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = PregnancyDetailsTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = PregnancyDetailsTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                PregnancyDetailsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedPregnancy: " + c.getCount());
            PregnancyDetails pregD = new PregnancyDetails();
            all.put(pregD.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedPregnancy: " + all.toString().length());
        Log.d(TAG, "getUnsyncedPregnancy: " + all);
        return all;
    }

    public JSONArray getUnsyncedPregnancyMaster() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = PregnancyMasterTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = PregnancyMasterTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                PregnancyMasterTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedPregnancy: " + c.getCount());
            PregnancyMaster pregM = new PregnancyMaster();
            all.put(pregM.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedPregnancy: " + all.toString().length());
        Log.d(TAG, "getUnsyncedPregnancy: " + all);
        return all;
    }

    public JSONArray getUnsyncedMortalityTable() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = MaternalMortalityTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = MaternalMortalityTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                MaternalMortalityTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedMortalityTable: " + c.getCount());
            MaternalMortality maternalMortality = new MaternalMortality();
            all.put(maternalMortality.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedMortalityTable: " + all.toString().length());
        Log.d(TAG, "getUnsyncedMortalityTable: " + all);
        return all;
    }

    public JSONArray getUnsyncedChild() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = ChildTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = ChildTable.COLUMN_ID + " ASC";

        JSONArray allChild = new JSONArray();
        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedChild: " + c.getCount());
            Child ch = new Child();
            allChild.put(ch.Hydrate(c).toJSONObject());
        }

        Log.d(TAG, "getUnsyncedChild: " + allChild.toString().length());
        Log.d(TAG, "getUnsyncedChild: " + allChild);
        return allChild;
    }

    public JSONArray getUnsyncedAdolescent() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = AdolescentTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = AdolescentTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                AdolescentTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedAdolescent: " + c.getCount());
            Adolescent ch = new Adolescent();
            all.put(ch.Hydrate(c).toJSONObject());
        }

        Log.d(TAG, "getUnsyncedAdolescent: " + all.toString().length());
        Log.d(TAG, "getUnsyncedAdolescent: " + all);
        return all;
    }

    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }


    //update SyncedTables
    public void updateSyncedFormHH(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNC_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedFamilyMembers(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_SYNCED, true);
        values.put(FamilyMembersTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = FamilyMembersTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                FamilyMembersTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedMWRA(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MwraTable.COLUMN_SYNCED, true);
        values.put(MwraTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = MwraTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                MwraTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedPregnancyDetails(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyDetailsTable.COLUMN_SYNCED, true);
        values.put(PregnancyDetailsTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = PregnancyDetailsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                PregnancyDetailsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedPregnancyMaster(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyMasterTable.COLUMN_SYNCED, true);
        values.put(PregnancyMasterTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = PregnancyMasterTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                PregnancyMasterTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedMaternalMortality(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MaternalMortalityTable.COLUMN_SYNCED, true);
        values.put(MaternalMortalityTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = MaternalMortalityTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                MaternalMortalityTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedChild(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ChildTable.COLUMN_SYNCED, true);
        values.put(ChildTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = ChildTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                ChildTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedAdolescent(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AdolescentTable.COLUMN_SYNCED, true);
        values.put(AdolescentTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = AdolescentTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                AdolescentTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedEntryLog(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_SYNCED, true);
        values.put(EntryLogTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = EntryLogTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                EntryLogTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    public Forms getFormByPsuhhid(String ebCode, String hhid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_CLUSTER_CODE + "=? AND " +
                FormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {ebCode, hhid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Forms form = null;
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            form = new Forms().Hydrate(c);
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }

        return form;
    }


    public List<Forms> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_CLUSTER_CODE + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        List<Forms> allFC = new ArrayList<>();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Forms fc = new Forms();
            fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            fc.setClusterCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER_CODE)));
            fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
            fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
            allFC.add(fc);
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }

        return allFC;
    }

    public List<Forms> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        List<Forms> allFC = new ArrayList<>();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Forms fc = new Forms();
            fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            fc.setClusterCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER_CODE)));
            fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
            allFC.add(fc);
        }
        if (c != null) {
            c.close();
        }
        /*if (db != null) {
            db.close();
        }*/
        return allFC;
    }


    public List<Forms> getPendingForms() {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        List<Forms> allFC = new ArrayList<>();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Forms fc = new Forms();
            fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            fc.setClusterCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER_CODE)));
            fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
            fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
            allFC.add(fc);
        }
        if (c != null && !c.isClosed()) {
            c.close();
        }
        return allFC;
    }


    public Forms getFormByhhid() throws JSONException {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = false;
        String tableName = FormsTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_CLUSTER_CODE + "= ? AND " +
                FormsTable.COLUMN_HHID + "= ? ";
        String[] whereArgs = {selectedCluster.getClusterCode(), selectedHousehold.getHhno()};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_SYSDATE + " ASC";
        String limitRows = "1";

        c = db.query(
                distinct,       // Distinct values
                tableName,      // The table to query
                columns,        // The columns to return
                whereClause,    // The columns for the WHERE clause
                whereArgs,      // The values for the WHERE clause
                groupBy,        // don't group the rows
                having,         // don't filter by row groups
                orderBy,
                limitRows
        );

        Forms form = new Forms();
        while (c.moveToNext()) {
            form = (new Forms().Hydrate(c));
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }
        return form;

    }


    public RandomHH getHHbyCluster(String clustercode, String hhid) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = RandomHHTable.COLUMN_CLUSTER_CODE + " = ? AND " +
                RandomHHTable.COLUMN_HH_NO + " = ?";

        String[] whereArgs = {clustercode, hhid};

        String groupBy = null;
        String having = null;

        String orderBy = RandomHHTable.COLUMN_HH_NO + " ASC";

        String limit = "5000";

        RandomHH randHH = new RandomHH();
        c = db.query(true,
                RandomHHTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy,
                limit
                // The sort order
        );
        while (c.moveToNext()) {
            randHH = new RandomHH().hydrate(c);
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }


        return randHH;
    }

    public Clusters getCluster(String ebCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = ClusterTable.COLUMN_CLUSTER_CODE + " =?";
        String[] whereArgs = new String[]{ebCode};
        String groupBy = null;
        String having = null;

        String orderBy =
                ClusterTable._ID + " ASC";

        Clusters cluster = new Clusters();

        c = db.query(
                ClusterTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            cluster = new Clusters().hydrate(c);
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }

        return cluster;

    }

    public int updatePassword(String hashedPassword) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(UsersTable.COLUMN_PASSWORD, hashedPassword);
        values.put(UsersTable.COLUMN_ISNEW_USER, "");

        String selection = UsersTable.COLUMN_USERNAME + " =? ";
        String[] selectionArgs = {MainApp.user.getUserName()};

        return db.update(UsersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public Clusters getClusterByEBNum(String ebCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = ClusterTable.COLUMN_CLUSTER_CODE + " = ? ";

        String[] whereArgs = {ebCode};

        String groupBy = null;
        String having = null;

        String orderBy = null;


        Clusters cluster = null;
        c = db.query(
                ClusterTable.TABLE_NAME,   // The table to query
                columns,                    // The columns to return
                whereClause,                // The columns for the WHERE clause
                whereArgs,                  // The values for the WHERE clause
                groupBy,                    // don't group the rows
                having,                     // don't filter by row groups
                orderBy                     // The sort order
        );
        while (c.moveToNext()) {
            cluster = new Clusters().hydrate(c);
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }


        return cluster;

    }

    public RandomHH getRandomByhhid(String hhid) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = RandomHHTable.COLUMN_CLUSTER_CODE + " = ? AND " +
                RandomHHTable.COLUMN_HH_NO + " = ? ";

        String[] whereArgs = {selectedCluster.getClusterCode(), hhid};
        String groupBy = null;
        String having = null;
        String orderBy = null;

        RandomHH randomHH = null;
        c = db.query(
                RandomHHTable.TABLE_NAME,   // The table to query
                columns,                    // The columns to return
                whereClause,                // The columns for the WHERE clause
                whereArgs,                  // The values for the WHERE clause
                groupBy,                    // don't group the rows
                having,                     // don't filter by row groups
                orderBy                     // The sort order
        );
        while (c.moveToNext()) {
            randomHH = new RandomHH().hydrate(c);
        }
        if (c != null && !c.isClosed()) {
            c.close();
        }
        return randomHH;
    }

    public List<Child> getChildrenBYUID() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = ChildTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = ChildTable.COLUMN_ID + " ASC";

        List<Child> childrenByUID = new ArrayList<>();
        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            childrenByUID.add(new Child().Hydrate(c));
        }

        if (c != null && !c.isClosed()) {
            c.close();
        }

        return childrenByUID;
    }


    public int getChildrenByUUID(String UUID) {
        String countQuery = "SELECT  * FROM " + ChildTable.TABLE_NAME + " WHERE " + ChildTable.COLUMN_UUID + " = '" + UUID + "' AND " + ChildTable.COLUMN_ISTATUS + " = '1'";
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    public int getChildrenPhotoCheck(String UID) {
        String countQuery = "SELECT  * FROM " + ChildTable.TABLE_NAME +
                " WHERE " + ChildTable.COLUMN_UUID + " = '" + UID +
                "' AND " + ChildTable.COLUMN_ISTATUS + " = '1' " +
                " AND (" + ChildTable.COLUMN_SIM + " NOT LIKE '%\"frontFileName\":\"\"%' " +
                " OR " + ChildTable.COLUMN_SIM + " NOT LIKE '%\"backFileName\":\"\"%') ";
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    public int getChildrenCardCheck(String UID) {
        String countQuery = "SELECT  * FROM " + ChildTable.TABLE_NAME +
                " WHERE " + ChildTable.COLUMN_UUID + " = '" + UID +
                "' AND " + ChildTable.COLUMN_ISTATUS + " = '1' " +
                " AND " + ChildTable.COLUMN_SIM + " LIKE '%\"im01\":\"1\"%' ";
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    public List<PregnancyDetails> getPregDByFmuid(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause =
                PregnancyDetailsTable.COLUMN_UUID + "=? AND " +
                        PregnancyDetailsTable.COLUMN_FMUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = PregnancyDetailsTable.COLUMN_ID + " ASC";

        List<PregnancyDetails> pregnancyD = new ArrayList<>();  // Pregnancies can never be null.

        c = db.query(
                PregnancyDetailsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            pregnancyD.add(new PregnancyDetails().Hydrate(c));
        }

        //db.close();

        return pregnancyD;
    }

    public PregnancyDetails getPregDByPsno(String fmuid, String pSno) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause =
                PregnancyDetailsTable.COLUMN_UUID + "=? AND " +
                        PregnancyDetailsTable.COLUMN_FMUID + "=? AND " +
                        PregnancyDetailsTable.COLUMN_PSNO + "=?";

        String[] whereArgs = {MainApp.form.getUid(), fmuid, pSno};

        String groupBy = null;
        String having = null;

        String orderBy = PregnancyDetailsTable.COLUMN_ID + " ASC";

        PregnancyDetails pregnancyD = new PregnancyDetails();  // Pregnancies can never be null.

        c = db.query(
                PregnancyDetailsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            pregnancyD = new PregnancyDetails().Hydrate(c);
        }

        //db.close();

        return pregnancyD;
    }

    public List<FamilyMembers> AllChildrenByMUID(String muid) throws JSONException {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND " +
                FamilyMembersTable.COLUMN_MUID + "=?";

        String[] whereArgs = {MainApp.form.getUid(), muid};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_AGE_MONTHS + " ASC";

        c = db.query(
                FamilyMembersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order

        );
        List<FamilyMembers> allChildren = new ArrayList<>();
        while (c.moveToNext()) {
            allChildren.add(new FamilyMembers().Hydrate(c));
        }

        //db.close();

        return allChildren;
    }


    public List<FamilyMembers> getMemberBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=?";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        ArrayList<FamilyMembers> membersByUID = new ArrayList<>();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FamilyMembers mwra = new FamilyMembers().Hydrate(c);

                membersByUID.add(mwra);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            /*if (db != null) {
                db.close();
            }*/
        }
        return membersByUID;
    }


    public FamilyMembers getSelectedMemberBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND "
                + FamilyMembersTable.COLUMN_INDEXED + "=?";

        String[] whereArgs = {uid, "1"};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        FamilyMembers membersByUID = new FamilyMembers();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                membersByUID = new FamilyMembers().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
           /* if (db != null) {
                db.close();
            }*/
        }
        return membersByUID;
    }


    public FamilyMembers getSelectedMemberBYUID(String uid, String index) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND "
                + FamilyMembersTable.COLUMN_INDEXED + "=?";

        String[] whereArgs = {uid, "1"};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        FamilyMembers membersByUID = new FamilyMembers();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                membersByUID = new FamilyMembers().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            /*if (db != null) {
                db.close();
            }*/
        }
        return membersByUID;
    }


    public MaternalMortality getMortalityBySno(String sno) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause =
                MaternalMortalityTable.COLUMN_UUID + "=? AND " +
                        MaternalMortalityTable.COLUMN_SNO + "=?";

        String[] whereArgs = {MainApp.form.getUid(), sno};

        String groupBy = null;
        String having = null;

        String orderBy = MaternalMortalityTable.COLUMN_ID + " ASC";

        MaternalMortality mortality = new MaternalMortality();  // Pregnancies can never be null.

        c = db.query(
                MaternalMortalityTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            mortality = new MaternalMortality().Hydrate(c);
        }

        //db.close();

        return mortality;
    }


    public Child getChildByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = ChildTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = ChildTable.COLUMN_ID + " ASC";

        Child child = new Child();  // Pregnancies can never be null.

        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            child = new Child().Hydrate(c);
        }

        //db.close();

        return child;
    }


    public int getSNoYoungestChild() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND " +
                FamilyMembersTable.COLUMN_MOTHER_PRESENT + "='1' AND " +
                "CAST(" + FamilyMembersTable.COLUMN_AGE_MONTHS + " AS INTEGER) < 1825 ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        // Not working
        String orderBy = "CAST(" + FamilyMembersTable.COLUMN_AGE_MONTHS + " AS INTEGER) ASC";
        //String orderBy = null;

        c = db.query(
                FamilyMembersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy,                    // The sort order
                "1"
        );
        int chSNo = 999;

        c.moveToFirst();
        chSNo = Integer.parseInt(new FamilyMembers().Hydrate(c).getD101());
        //db.close();
        return chSNo;
    }


    public int getSNoYoungestMWRA() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND " +
                "CAST(" + FamilyMembersTable.COLUMN_AGE_MONTHS + " AS INTEGER) > 5110 " + "=? AND " +
                "CAST(" + FamilyMembersTable.COLUMN_AGE_MONTHS + " AS INTEGER) < 18250 ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        // Not working
        String orderBy = "CAST(" + FamilyMembersTable.COLUMN_AGE_MONTHS + " AS INTEGER) ASC";
        //String orderBy = null;

        c = db.query(
                FamilyMembersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy,                    // The sort order
                "1"
        );
        int chSNo = 999;

        c.moveToFirst();
        chSNo = Integer.parseInt(new FamilyMembers().Hydrate(c).getD101());

        //db.close();

        return chSNo;
    }


    public MWRA getMwraByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;
        String whereClause;
        whereClause = MwraTable.COLUMN_UUID + "=? ";
        String[] whereArgs = {MainApp.form.getUid()};
        String groupBy = null;
        String having = null;
        String orderBy = MwraTable.COLUMN_ID + " ASC";
        MWRA mwra = new MWRA();
        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            mwra = new MWRA().Hydrate(c);
        }
        //db.close();
        return mwra;
    }


    public Adolescent getAdolByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;
        String whereClause;
        whereClause = AdolescentTable.COLUMN_UUID + "=? ";
        String[] whereArgs = {MainApp.form.getUid()};
        String groupBy = null;
        String having = null;
        String orderBy = AdolescentTable.COLUMN_ID + " ASC";
        Adolescent adol = new Adolescent();
        c = db.query(
                AdolescentTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            adol = new Adolescent().Hydrate(c);
        }
        //db.close();
        return adol;
    }

    public PregnancyMaster getPregMByFmuid(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;
        String whereClause;
        whereClause = PregnancyMasterTable.COLUMN_UUID + "=? AND " +
                PregnancyMasterTable.COLUMN_FMUID + "=? ";
        String[] whereArgs = {MainApp.form.getUid(), fmuid};
        String groupBy = null;
        String having = null;
        String orderBy = PregnancyMasterTable.COLUMN_ID + " ASC";
        PregnancyMaster pregnancyM = new PregnancyMaster();  // Pregnancies can never be null.
        c = db.query(
                PregnancyMasterTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            pregnancyM = new PregnancyMaster().Hydrate(c);
        }
        //db.close();
        return pregnancyM;
    }


    public Forms getFormByPsuHHNo(String psuCode, String hhid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_CLUSTER_CODE + "=? AND " +
                FormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {psuCode, hhid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Forms form = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                form = new Forms().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            /*if (db != null) {
                db.close();
            }*/
        }
        return form;
    }

    public Forms getFormByPSUHHNo(String psuCode, String hhid) throws JSONException {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = false;
        String tableName = FormsTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_CLUSTER_CODE + "= ? AND " +
                FormsTable.COLUMN_HHID + "= ? ";
        String[] whereArgs = {psuCode, hhid};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_SYSDATE + " ASC";
        String limitRows = "1";

        c = db.query(
                distinct,       // Distinct values
                tableName,      // The table to query
                columns,        // The columns to return
                whereClause,    // The columns for the WHERE clause
                whereArgs,      // The values for the WHERE clause
                groupBy,        // don't group the rows
                having,         // don't filter by row groups
                orderBy,
                limitRows
        );

        Forms form = new Forms();
        while (c.moveToNext()) {
            form = (new Forms().Hydrate(c));
        }
        c.close();
        return form;

    }


    public Adolescent getAdolByUUID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;
        String whereClause;
        whereClause = AdolescentTable.COLUMN_UUID + "=? AND " + AdolescentTable.COLUMN_FMUID + "=?";
        String[] whereArgs = {MainApp.form.getUid(), fmuid};
        String groupBy = null;
        String having = null;
        String orderBy = AdolescentTable.COLUMN_ID + " ASC";
        Adolescent adol = new Adolescent();  // Pregnancies can never be null.
        c = db.query(
                AdolescentTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
        while (c.moveToNext()) {
            adol = new Adolescent().Hydrate(c);
        }
        return adol;
    }


}


