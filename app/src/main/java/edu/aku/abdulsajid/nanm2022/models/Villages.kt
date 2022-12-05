package edu.aku.abdulsajid.nanm2022.models

import android.database.Cursor
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.VillageTable
import edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Villages {
    var ID: Long = 0
    var village_code: String = _EMPTY_
    var geoarea: String = _EMPTY_
    var distId: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Villages {
        village_code = jsonObject.getString(VillageTable.COLUMN_VILLAGE_CODE)
        geoarea = jsonObject.getString(VillageTable.COLUMN_GEOAREA)
        distId = jsonObject.getString(VillageTable.COLUMN_DIST_ID)


        return this
    }

    fun hydrate(cursor: Cursor): Villages {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_ID))
        village_code =
            cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_VILLAGE_CODE))
        geoarea = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_GEOAREA))
        distId = cursor.getString(cursor.getColumnIndexOrThrow(VillageTable.COLUMN_DIST_ID))

        return this
    }


}