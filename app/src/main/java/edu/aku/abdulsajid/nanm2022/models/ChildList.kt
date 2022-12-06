package edu.aku.abdulsajid.nanm2022.models

import android.database.Cursor
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.ChildTable
import edu.aku.abdulsajid.nanm2022.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 05/12/2022.
 */
class ChildList {
    var ID: Long = 0
    var child_id: String = _EMPTY_
    var village_code: String = _EMPTY_
    var mother_name: String = _EMPTY_
    var child_name: String = _EMPTY_
    var hh_head: String = _EMPTY_
    var gender: String = _EMPTY_
    var dob: String = _EMPTY_
    var project: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): ChildList {
        village_code = jsonObject.getString(ChildTable.COLUMN_VILLAGE_CODE)
        child_id = jsonObject.getString(ChildTable.COLUMN_CHILD_ID)
        mother_name = jsonObject.getString(ChildTable.COLUMN_MOTHER_NAME)
        child_name = jsonObject.getString(ChildTable.COLUMN_CHILD_NAME)
        hh_head = jsonObject.getString(ChildTable.COLUMN_HH_HEAD)
        gender = jsonObject.getString(ChildTable.COLUMN_GENDER)
        dob = jsonObject.getString(ChildTable.COLUMN_DOB)
        project = jsonObject.getString(ChildTable.COLUMN_PROJECT)


        return this
    }

    fun hydrate(cursor: Cursor): ChildList {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_ID))
        village_code =
            cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_VILLAGE_CODE))
        child_id = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_CHILD_ID))
        mother_name = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_MOTHER_NAME))
        child_name = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_CHILD_NAME))
        hh_head = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_HH_HEAD))
        gender = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_GENDER))
        dob = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_DOB))
        project = cursor.getString(cursor.getColumnIndexOrThrow(ChildTable.COLUMN_PROJECT))

        return this
    }


}