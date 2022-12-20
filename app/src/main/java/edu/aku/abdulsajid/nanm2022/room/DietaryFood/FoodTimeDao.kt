package edu.aku.abdulsajid.nanm2022.room.DietaryFood

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodTime

//
// Created by gul.sanober on 12/20/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface FoodTimeDao {

    @Query("SELECT * FROM foodtime")
    fun getAll(): List<FoodTime?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAll(data: List<FoodTime>)

    @Query("SELECT * FROM foodtime WHERE foodTimeId= :id")
    fun getById(id: Int): FoodTime?

    @Query("DELETE FROM foodtime")
    fun deleteAll()


}