package edu.aku.abdulsajid.nanm2022.models

import android.database.Cursor
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.RandomHHTable
import edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class RandomHH {
    var ID: Long = 0
    var sno: String = _EMPTY_
    var clusterCode: String = _EMPTY_
    var hhno: String = _EMPTY_
    var headhh: String = _EMPTY_

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): RandomHH {
        sno = jsonObject.getString(RandomHHTable.COLUMN_SNO)
        clusterCode = jsonObject.getString(RandomHHTable.COLUMN_CLUSTER_CODE)
        hhno = jsonObject.getString(RandomHHTable.COLUMN_HH_NO)
        headhh = jsonObject.getString(RandomHHTable.COLUMN_HEAD_HH)
        return this
    }

    fun hydrate(cursor: Cursor): RandomHH {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_ID))
        sno = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_SNO))
        clusterCode =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_CLUSTER_CODE))
        hhno = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_NO))
        headhh = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HEAD_HH))
        return this
    }


}