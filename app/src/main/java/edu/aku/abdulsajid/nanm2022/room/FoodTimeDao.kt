package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodTime
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/20/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface FoodTimeDao {

    @Throws(JSONException::class)
    fun syncFoodTime(list: JSONArray): Int {
        var insertCount = 0
        deleteTable()
        for(i in 0 until list.length()) {
            val jsonObject = list.optJSONObject(i)

            val item = FoodTime()
            item.sync(jsonObject)

            val rowId = insertTable(item)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertTable(foodTime: FoodTime): Long

    @Query("DELETE FROM " + TableContracts.FoodTimeTable.TABLE_NAME)
    fun deleteTable()

    @Query("SELECT * FROM foodtime")
    fun getAll(): List<FoodTime?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAll(data: List<FoodTime?>?)

    @Query("SELECT * FROM foodtime WHERE foodTimeId= :id")
    fun getById(id: Int): FoodTime?

    @Query("DELETE FROM foodtime")
    fun deleteAll()
}