package edu.aku.abdulsajid.nanm2022.room

import androidx.room.*
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.FormsTable
import edu.aku.abdulsajid.nanm2022.models.Forms
import org.json.JSONException
import kotlin.jvm.Throws

//
// Created by gul.sanober on 11/30/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface FormsDao {

    @Throws(JSONException ::class)
    @Insert
    fun addForm(forms: Forms) : Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateForm(forms: Forms) : Int

    @Query("SELECT * FROM " + FormsTable.TABLE_NAME +
            " WHERE " + FormsTable.COLUMN_VILLAGE_CODE + " LIKE :villageCode AND "
            + FormsTable.COLUMN_SNO + " LIKE :childID  ORDER BY "
            + FormsTable.COLUMN_SYSDATE + " ASC")
    fun getFormByChildID_internal(childID: String, villageCode: String): Forms?

    @Throws(JSONException::class)
    fun getFormByAdolSno(sno: String, villageCode: String): Forms? {
        val forms = getFormByChildID_internal(sno, villageCode)

        /* To get data and view in edit mode  -- Hydrate function will be called in particular section Activity's onCreate() Method*/
        if (forms == null) {
            val tempForms = Forms()
            return tempForms
        }
        return forms
    }

    @Query("SELECT * FROM " + FormsTable.TABLE_NAME
            + " WHERE " + FormsTable.COLUMN_ISTATUS + " is \'\' ORDER BY "
            + FormsTable.COLUMN_ID + " DESC")
    fun getPendingForms(): List<Forms>

    @Query("SELECT * FROM " + FormsTable.TABLE_NAME
            + " WHERE " + FormsTable.COLUMN_VILLAGE_CODE
            + " LIKE :cluster ORDER BY " + FormsTable.COLUMN_ID + " ASC")
    fun getFormsByCluster(cluster: String): List<Forms>

    @Query("SELECT * FROM " + FormsTable.TABLE_NAME
            + " WHERE " + FormsTable.COLUMN_SYSDATE
            + " LIKE '%' || :sysdate || '%' ORDER BY "
            + FormsTable.COLUMN_ID + " DESC")
    fun getTodayForms(sysdate: String): List<Forms>


}