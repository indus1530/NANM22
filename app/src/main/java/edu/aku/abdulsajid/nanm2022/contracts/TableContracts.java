package edu.aku.abdulsajid.nanm2022.contracts;

import android.provider.BaseColumns;

public class TableContracts {

    public static abstract class EntryLogTable implements BaseColumns {
        public static final String TABLE_NAME = "EntryLog";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_EB_CODE = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_ENTRY_DATE = "entryDate";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
    }


    public static abstract class UsersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "AppUser";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "passwordEnc";
        public static final String COLUMN_FULLNAME = "full_name";
        public static final String COLUMN_DESIGNATION = "designation";
        public static final String COLUMN_ENABLED = "enabled";
        public static final String COLUMN_ISNEW_USER = "isNewUser";
        public static final String COLUMN_PWD_EXPIRY = "pwdExpiry";
        public static final String COLUMN_DIST_ID = "dist_id";
    }

    public static abstract class VillageTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "villages";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DIST_ID = "dist_id";
        public static final String COLUMN_GEOAREA = "geoarea";
        public static final String COLUMN_VILLAGE_CODE = "village_code";

    }

    public static abstract class ChildTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "child_list";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VILLAGE_CODE = "village_code";
        public static final String COLUMN_CHILD_ID = "child_id";
        public static final String COLUMN_MOTHER_NAME = "mother_name";
        public static final String COLUMN_CHILD_NAME = "child_name";
        public static final String COLUMN_HH_HEAD = "hh_head";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_DOB = "dob";
        public static final String COLUMN_PROJECT = "project";

    }


    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "FormHH";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_VILLAGE_CODE = "village_code";
        public static final String COLUMN_CHILD_ID = "child_id";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SA = "sA";
        public static final String COLUMN_SB = "sB";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class FamilyMembersTable implements BaseColumns {
        public static final String TABLE_NAME = "FamilyMembers";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_CLUSTER_CODE = "clusterCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_AGE_MONTHS = "ageinmonths";
        public static final String COLUMN_MUID = "muid";
        public static final String COLUMN_MOTHER_PRESENT = "motherPresent";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class AdolescentTable implements BaseColumns {
        public static final String TABLE_NAME = "Adolescent";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_MUID = "_muid";
        public static final String COLUMN_VILLAGE_CODE = "village_code";
        public static final String COLUMN_CHILD_ID = "child_id";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_SC = "sC";
        public static final String COLUMN_SD = "sD";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


}
