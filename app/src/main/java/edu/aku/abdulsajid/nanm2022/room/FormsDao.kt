package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
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

}