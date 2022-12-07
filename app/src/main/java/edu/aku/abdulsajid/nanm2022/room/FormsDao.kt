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

    @Throws(JSONException ::class)
    @Insert
    fun addForm(forms: Forms) : Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateForm(forms: Forms) : Int

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME +
            " WHERE " + TableContracts.FormsTable.COLUMN_VILLAGE_CODE + " LIKE :villageCode AND "
            + TableContracts.FormsTable.COLUMN_CHILD_ID + " LIKE :childID  ORDER BY "
            + TableContracts.FormsTable.COLUMN_SYSDATE + " ASC")
    fun getFormByChildID_internal(childID : String, villageCode : String) : Forms

    @Throws(JSONException::class)
    fun getFormByChildID(childID: String, villageCode: String) : Forms
    {
        val forms = getFormByChildID_internal(childID, villageCode)

        if(forms == null)
        {
            val tempForms = Forms()
            return tempForms
        }else{
            forms.sA1Hydrate(forms.sA1)
            forms.sB1Hydrate(forms.sB1)
        }

        return forms
    }

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME
            + " WHERE " + TableContracts.FormsTable.COLUMN_ISTATUS + " is \'\' ORDER BY "
            + TableContracts.FormsTable.COLUMN_ID + " DESC")
    fun getPendingForms() : List<Forms>

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME
            + " WHERE " + TableContracts.FormsTable.COLUMN_VILLAGE_CODE
            + " LIKE :cluster ORDER BY " + TableContracts.FormsTable.COLUMN_ID + " ASC" )
    fun getFormsByCluster(cluster : String) : List<Forms>

    @Query("SELECT * FROM " + TableContracts.FormsTable.TABLE_NAME
            + " WHERE " + TableContracts.FormsTable.COLUMN_SYSDATE
            + " LIKE '%' || :sysdate || '%' ORDER BY "
            + TableContracts.FormsTable.COLUMN_ID + " DESC")
    fun getTodayForms(sysdate : String) : List<Forms>



}