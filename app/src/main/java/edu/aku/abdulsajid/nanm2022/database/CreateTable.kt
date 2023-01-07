package edu.aku.abdulsajid.nanm2022.database


import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.*


object CreateTable {


    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + FormsTable.COLUMN_CHILD_ID + " TEXT,"
            + FormsTable.COLUMN_CHILD_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_ISTATUS_96X + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNC_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SA1 + " TEXT,"
            + FormsTable.COLUMN_SA3A + " TEXT,"
            + FormsTable.COLUMN_SA3B + " TEXT,"
            + FormsTable.COLUMN_SA4A + " TEXT,"
            + FormsTable.COLUMN_SA4B + " TEXT,"
            + FormsTable.COLUMN_SA4C + " TEXT,"
            + FormsTable.COLUMN_SA5A + " TEXT,"
            + FormsTable.COLUMN_SA5B + " TEXT,"
            + FormsTable.COLUMN_SB1 + " TEXT,"
            + FormsTable.COLUMN_SB3 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + EntryLogTable.COLUMN_CHILD_ID + " TEXT,"
            + EntryLogTable.COLUMN_CHILD_SRNO + " TEXT,"
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
            + FamilyMembersTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + FamilyMembersTable.COLUMN_CHILDID + " TEXT,"
            + FamilyMembersTable.COLUMN_CHILD_SNO + " TEXT,"
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
            + FamilyMembersTable.COLUMN_A2 + " TEXT"
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
            + AdolescentTable.COLUMN_VILLAGE_CODE + " TEXT, "
            + AdolescentTable.COLUMN_CHILD_ID + " TEXT, "
            + AdolescentTable.COLUMN_CHILD_SNO + " TEXT, "
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
            + AdolescentTable.COLUMN_SC1 + " TEXT, "
            + AdolescentTable.COLUMN_SC2 + " TEXT, "
            + AdolescentTable.COLUMN_SC3 + " TEXT, "
            + AdolescentTable.COLUMN_SC4 + " TEXT, "
            + AdolescentTable.COLUMN_SC5 + " TEXT, "
            + AdolescentTable.COLUMN_SC6 + " TEXT, "
            + AdolescentTable.COLUMN_SC7 + " TEXT, "
            + AdolescentTable.COLUMN_SD1 + " TEXT, "
            + AdolescentTable.COLUMN_SD2 + " TEXT"
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


    const val SQL_CREATE_VILLAGES = ("CREATE TABLE "
            + VillageTable.TABLE_NAME + "("
            + VillageTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VillageTable.COLUMN_GEOAREA + " TEXT,"
            + VillageTable.COLUMN_DIST_ID + " TEXT,"
            + VillageTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + VillageTable.COLUMN_VILLAGE + " TEXT,"
            + VillageTable.COLUMN_UC_CODE + " TEXT,"
            + VillageTable.COLUMN_UC + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CHILD_LIST = ("CREATE TABLE "
            + ChildTable.TABLE_NAME + "("
            + ChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildTable.COLUMN_SR_NO + " TEXT,"
            + ChildTable.COLUMN_CHILD_ID + " TEXT,"
            + ChildTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + ChildTable.COLUMN_MOTHER_NAME + " TEXT,"
            + ChildTable.COLUMN_CHILD_NAME + " TEXT,"
            + ChildTable.COLUMN_HH_HEAD + " TEXT,"
            + ChildTable.COLUMN_GENDER + " TEXT,"
            + ChildTable.COLUMN_DOB + " TEXT,"
            + ChildTable.COLUMN_PROJECT + " TEXT"
            + " );"
            )


    const val SQL_CREATE_WISC = ("CREATE TABLE "
            + WiscTable.TABLE_NAME + "("
            + WiscTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + WiscTable.COLUMN_PROJECT_NAME + " TEXT,"
            + WiscTable.COLUMN_UID + " TEXT,"
            + WiscTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + WiscTable.COLUMN_CHILD_ID + " TEXT,"
            + WiscTable.COLUMN_CHILD_SNO + " TEXT,"
            + WiscTable.COLUMN_USERNAME + " TEXT,"
            + WiscTable.COLUMN_SYSDATE + " TEXT,"
            + WiscTable.COLUMN_ISTATUS + " TEXT,"
            + WiscTable.COLUMN_ISTATUS_96X + " TEXT,"
            + WiscTable.COLUMN_DEVICEID + " TEXT,"
            + WiscTable.COLUMN_DEVICETAGID + " TEXT,"
            + WiscTable.COLUMN_SYNCED + " TEXT,"
            + WiscTable.COLUMN_SYNC_DATE + " TEXT,"
            + WiscTable.COLUMN_APPVERSION + " TEXT,"
            + WiscTable.COLUMN_SA1 + " TEXT"
            + " );"
            )
}