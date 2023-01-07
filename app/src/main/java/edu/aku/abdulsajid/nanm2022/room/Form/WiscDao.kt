package edu.aku.abdulsajid.nanm2022.room.Form

import androidx.room.*
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.WiscTable
import edu.aku.abdulsajid.nanm2022.models.WISC
import org.json.JSONException

//
// Created by muhammad.hussain on 06/01/2023.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface WiscDao {

    @Throws(JSONException::class)
    @Insert
    fun addWisc(wisc: WISC): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateWisc(wisc: WISC): Int

    @Query(
        "SELECT * FROM " + WiscTable.TABLE_NAME +
                " WHERE " + WiscTable.COLUMN_VILLAGE_CODE + " LIKE :villageCode AND "
                + WiscTable.COLUMN_CHILD_SNO + " LIKE :childID  ORDER BY "
                + WiscTable.COLUMN_SYSDATE + " ASC"
    )
    fun getFormByChildID_internal(childID: String, villageCode: String): WISC?

    @Throws(JSONException::class)
    fun getFormByAdolSno(sno: String, villageCode: String): WISC? {
        val wisc = getFormByChildID_internal(sno, villageCode)

        /* To get data and view in edit mode  -- Hydrate function will be called in particular section Activity's onCreate() Method*/
        if (wisc == null) {
            val tempForms = WISC()
            return tempForms
        }
        return wisc
    }
}