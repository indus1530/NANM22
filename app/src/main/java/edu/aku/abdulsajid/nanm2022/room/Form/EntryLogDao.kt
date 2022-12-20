package edu.aku.abdulsajid.nanm2022.room.Form

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import edu.aku.abdulsajid.nanm2022.models.EntryLog
import org.json.JSONException
import kotlin.jvm.Throws

//
// Created by gul.sanober on 12/7/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface EntryLogDao {

    @Throws(JSONException ::class)
    @Insert
    fun addEntryLog(entryLog : EntryLog) : Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateEntryLog(entryLog : EntryLog) : Int
}