package edu.aku.abdulsajid.nanm2022.room

import androidx.room.*
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
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
            forms.sAHydrate(forms.sa)
            forms.sBHydrate(forms.sb)
        }

        return forms
    }

}