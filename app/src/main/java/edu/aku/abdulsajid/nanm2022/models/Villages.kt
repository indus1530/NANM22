package edu.aku.abdulsajid.nanm2022.models

import android.database.Cursor
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.VillageTable
import edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

@Entity(tableName = VillageTable.TABLE_NAME)
class Villages {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = VillageTable._ID)
    var ID: Long = 0

    @ColumnInfo(name = VillageTable.COLUMN_VILLAGE_CODE, defaultValue = _EMPTY_)
    var village_code: String = _EMPTY_

    @ColumnInfo(name = VillageTable.COLUMN_VILLAGE, defaultValue = _EMPTY_)
    var village: String = _EMPTY_

    @ColumnInfo(name = VillageTable.COLUMN_UC_CODE, defaultValue = _EMPTY_)
    var uc_code: String = _EMPTY_

    @ColumnInfo(name = VillageTable.COLUMN_UC, defaultValue = _EMPTY_)
    var uc: String = _EMPTY_

    @ColumnInfo(name = VillageTable.COLUMN_GEOAREA, defaultValue = _EMPTY_)
    var geoarea: String = _EMPTY_

    @ColumnInfo(name = VillageTable.COLUMN_DIST_ID, defaultValue = _EMPTY_)
    var distId: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Villages {
        village_code = jsonObject.getString(VillageTable.COLUMN_VILLAGE_CODE)
        village = jsonObject.getString(VillageTable.COLUMN_VILLAGE)
        uc_code = jsonObject.getString(VillageTable.COLUMN_UC_CODE)
        uc = jsonObject.getString(VillageTable.COLUMN_UC)
        geoarea = jsonObject.getString(VillageTable.COLUMN_GEOAREA)
        distId = jsonObject.getString(VillageTable.COLUMN_DIST_ID)


        return this
    }

    fun hydrate(cursor: Cursor): Villages {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_ID))
        village_code =
            cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_VILLAGE_CODE))
        village = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_VILLAGE))
        uc_code = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_UC_CODE))
        uc = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_UC))
        geoarea = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_GEOAREA))
        distId = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_DIST_ID))

        return this
    }


}