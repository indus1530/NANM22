package edu.aku.abdulsajid.nanm2022.database


import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.*


object CreateTable {


    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNC_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SA + " TEXT,"
            + FormsTable.COLUMN_SB + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_EB_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_FAMILYMEMBERS = ("CREATE TABLE "
            + FamilyMembersTable.TABLE_NAME + "("
            + FamilyMembersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMembersTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMembersTable.COLUMN_UID + " TEXT,"
            + FamilyMembersTable.COLUMN_UUID + " TEXT,"
            + FamilyMembersTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + FamilyMembersTable.COLUMN_HHID + " TEXT,"
            + FamilyMembersTable.COLUMN_SNO + " TEXT,"
            + FamilyMembersTable.COLUMN_AGE_MONTHS + " TEXT,"
            + FamilyMembersTable.COLUMN_MUID + " TEXT,"
            + FamilyMembersTable.COLUMN_MOTHER_PRESENT + " TEXT,"
            + FamilyMembersTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMembersTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMembersTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMembersTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNC_DATE + " TEXT,"
            + FamilyMembersTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMembersTable.COLUMN_SD + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ADOLESCENT = ("CREATE TABLE "
            + AdolescentTable.TABLE_NAME + "("
            + AdolescentTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + AdolescentTable.COLUMN_PROJECT_NAME + " TEXT, "
            + AdolescentTable.COLUMN_UID + " TEXT, "
            + AdolescentTable.COLUMN_UUID + " TEXT, "
            + AdolescentTable.COLUMN_FMUID + " TEXT, "
            + AdolescentTable.COLUMN_MUID + " TEXT, "
            + AdolescentTable.COLUMN_PSU_CODE + " TEXT, "
            + AdolescentTable.COLUMN_HHID + " TEXT, "
            + AdolescentTable.COLUMN_SNO + " TEXT, "
            + AdolescentTable.COLUMN_USERNAME + " TEXT, "
            + AdolescentTable.COLUMN_SYSDATE + " TEXT, "
            + AdolescentTable.COLUMN_INDEXED + " TEXT, "
            + AdolescentTable.COLUMN_NAME + " TEXT, "
            + AdolescentTable.COLUMN_ISTATUS + " TEXT, "
            + AdolescentTable.COLUMN_DEVICEID + " TEXT, "
            + AdolescentTable.COLUMN_DEVICETAGID + " TEXT, "
            + AdolescentTable.COLUMN_SYNCED + " TEXT, "
            + AdolescentTable.COLUMN_SYNC_DATE + " TEXT, "
            + AdolescentTable.COLUMN_APPVERSION + " TEXT, "
            + AdolescentTable.COLUMN_SC + " TEXT, "
            + AdolescentTable.COLUMN_SD + " TEXT"
            + " );"
            )


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE "
            + ClusterTable.TABLE_NAME + "("
            + ClusterTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ClusterTable.COLUMN_GEOAREA + " TEXT,"
            + ClusterTable.COLUMN_DIST_ID + " TEXT,"
            + ClusterTable.COLUMN_CLUSTER_CODE + " TEXT"
            + " );"
            )

    const val SQL_CREATE_RANDOM_HH = ("CREATE TABLE "
            + RandomHHTable.TABLE_NAME + "("
            + RandomHHTable.COLUMN_ID + " INTEGER PRIMARY KEY,"
            + RandomHHTable.COLUMN_SNO + " TEXT,"
            + RandomHHTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + RandomHHTable.COLUMN_HH_NO + " TEXT,"
            + RandomHHTable.COLUMN_HEAD_HH + " TEXT"
            + " );"
            )
}