package edu.aku.abdulsajid.nanm2022.room.DietaryFood

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Food
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/20/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface FoodDao {

    @Query("SELECT * FROM food")
    fun getAll(): List<Food>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAll(data: List<Food>)

    @Query("SELECT * FROM food WHERE foodId= :id")
    fun getById(id: Int): Food?

    @Query("DELETE FROM food")
    fun deleteAll()


}