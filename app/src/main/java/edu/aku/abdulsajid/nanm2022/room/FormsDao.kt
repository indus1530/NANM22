package edu.aku.abdulsajid.nanm2022.room

import androidx.room.*
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.Forms
import org.json.JSONException

//
// Created by gul.sanober on 11/30/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface FormsDao {

    @Throws(JSONException::class)
    @Insert
    fun addForm(forms: Forms): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateForm(forms: Forms): Int

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME +
            " WHERE " + TableContracts.FormsTable.COLUMN_VILLAGE_CODE + " LIKE :villageCode AND "
            + TableContracts.FormsTable.COLUMN_SNO + " LIKE :childID  ORDER BY "
            + TableContracts.FormsTable.COLUMN_ID + " ASC")
    fun getFormByChildID_internal(childID: String, villageCode: String): Forms?

    @Throws(JSONException::class)
    fun getFormByAdolSno(sno: String, villageCode: String): Forms? {
        val forms = getFormByChildID_internal(sno, villageCode)

        if (forms == null) {
            val tempForms = Forms()
            return tempForms
        } else {
            forms.sA1Hydrate(forms.sA1)
            forms.sA3AHydrate(forms.sA3A)
            forms.sA3BHydrate(forms.sA3B)
            forms.sA4AHydrate(forms.sA4A)
            forms.sA4BHydrate(forms.sA4B)
            forms.sA4CHydrate(forms.sA4C)
            forms.sB1Hydrate(forms.sB1)
            forms.sB3Hydrate(forms.sB3)

        }

        return forms
    }

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME
            + " WHERE " + TableContracts.FormsTable.COLUMN_ISTATUS + " is \'\' ORDER BY "
            + TableContracts.FormsTable.COLUMN_ID + " DESC")
    fun getPendingForms(): List<Forms>

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME
            + " WHERE " + TableContracts.FormsTable.COLUMN_VILLAGE_CODE
            + " LIKE :cluster ORDER BY " + TableContracts.FormsTable.COLUMN_ID + " ASC")
    fun getFormsByCluster(cluster: String): List<Forms>

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME
            + " WHERE " + TableContracts.FormsTable.COLUMN_SYSDATE
            + " LIKE '%' || :sysdate || '%' ORDER BY "
            + TableContracts.FormsTable.COLUMN_ID + " DESC")
    fun getTodayForms(sysdate: String): List<Forms>


}