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
        public static final String COLUMN_VILLAGE_CODE = "village_code";
        public static final String COLUMN_CHILD_ID = "child_id";
        public static final String COLUMN_CHILD_SRNO = "child_srno";
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
        public static final String COLUMN_VILLAGE = "village";
        public static final String COLUMN_UC_CODE = "uc_code";
        public static final String COLUMN_UC = "uc";

    }

    public static abstract class ChildTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "child_list";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VILLAGE_CODE = "village_code";
        public static final String COLUMN_SR_NO = "srno";
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
        public static final String COLUMN_CHILD_SNO = "childSno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SA1 = "sA1";
        public static final String COLUMN_SA3A = "sA3A";
        public static final String COLUMN_SA3B = "sA3B";
        public static final String COLUMN_SA4A = "sA4A";
        public static final String COLUMN_SA4B = "sA4B";
        public static final String COLUMN_SA4C = "sA4C";
        public static final String COLUMN_SA5A = "sA5A";
        public static final String COLUMN_SA5B = "sA5B";
        public static final String COLUMN_SB1 = "sB1";
        public static final String COLUMN_SB3 = "sB3";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS_96X = "istatus96x";
    }

    public static abstract class FamilyMembersTable implements BaseColumns {
        public static final String TABLE_NAME = "FamilyMembers";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_MUID = "_muid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_CHILDID = "childID";
        public static final String COLUMN_CHILD_SNO = "childSno";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_AGE_MONTHS = "ageinmonths";
        public static final String COLUMN_MOTHER_PRESENT = "motherPresent";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_A2 = "sA2";
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
        public static final String COLUMN_CHILD_SNO = "childSno";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_SC1 = "sC1";
        public static final String COLUMN_SC2 = "sC2";
        public static final String COLUMN_SC3 = "sC3";
        public static final String COLUMN_SC4 = "sC4";
        public static final String COLUMN_SC5 = "sC5";
        public static final String COLUMN_SC6 = "sC6";
        public static final String COLUMN_SC7 = "sC7";
        public static final String COLUMN_SD1 = "sD1";
        public static final String COLUMN_SD2 = "sD2";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class FoodTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "Food";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_FOOD_ID = "foodId";
        public static final String COLUMN_FOOD_NAME = "foodName";
        public static final String COLUMN_MEASURING_UNIT = "measuringUnit";

    }


    public static abstract class IngredientTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "Ingredient";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_INGREDIENT_ID = "ingredientId";
        public static final String COLUMN_INGREDIENT_NAME = "ingredientName";
        public static final String COLUMN_ENERGY_COUNT = "energyCount";

    }


    public static abstract class FoodTimeTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "FoodTime";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_FOODTIME_ID = "foodTimeId";
        public static final String COLUMN_TITLE = "title";

    }


    public static abstract class FoodIngredientMapTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "FoodIngredientMap";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_FOOD_ID = "foodId";
        public static final String COLUMN_INGREDIENT_ID = "ingredientId";

    }


    public static abstract class FoodScaleTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "FoodScale";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_FOOD_SCALE_ID = "foodScaleId";
        public static final String COLUMN_TITLE = "title";

    }


    public static abstract class FoodSizeTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "FoodSize";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_FOOD_SIZE_ID = "foodSizeId";
        public static final String COLUMN_FOOD_SCALE_ID = "foodScaleId";
        public static final String COLUMN_TITLE = "title";

    }


}
