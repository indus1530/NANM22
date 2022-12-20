package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodChange
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/20/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface FoodChangeDao {

    @Throws(JSONException::class)
    fun syncFoodChange(list: JSONArray): Int {
        var insertCount = 0
        deleteTable()
        for(i in 0 until list.length()) {
            val jsonObject = list.optJSONObject(i)

            val item = FoodChange()
            item.sync(jsonObject)

            val rowId = insertTable(item)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertTable(foodChange: FoodChange): Long

    @Query("DELETE FROM " + TableContracts.FoodTimeTable.TABLE_NAME)
    fun deleteTable()

    @Query("SELECT * FROM foodchange")
    fun getAll(): List<FoodChange?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAll(data: List<FoodChange?>?)

    @Query("SELECT * FROM foodchange WHERE foodChangeId= :id")
    fun getById(id: Int): FoodChange?

    @Query("DELETE FROM foodchange")
    fun deleteAll()

//        @Query("SELECT * FROM foodchange WHERE patientFoodId= :id")
//        List<FoodChange> getByPatientFoodId(int id);

    //        @Query("SELECT * FROM foodchange WHERE patientFoodId= :id")
    //        List<FoodChange> getByPatientFoodId(int id);
    @Query("SELECT * FROM foodchange WHERE patientId= :patientId AND foodId = :foodId AND foodTimeId = :foodTimeId")
    fun getByPatientFoodId(patientId: Int, foodId: Int, foodTimeId: Int): List<FoodChange?>?
}