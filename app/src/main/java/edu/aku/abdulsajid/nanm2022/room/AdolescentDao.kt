package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.Adolescent
import edu.aku.abdulsajid.nanm2022.models.ChildList
import edu.aku.abdulsajid.nanm2022.models.Forms
import org.json.JSONException
import kotlin.jvm.Throws

//
// Created by gul.sanober on 12/6/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
interface AdolescentDao {

    @Throws(JSONException ::class)
    @Insert
    fun addAdolescent(adolescent: Adolescent) : Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateAdolescent(adolescent: Adolescent) : Int





}