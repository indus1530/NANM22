package edu.aku.abdulsajid.nanm2022.room.DietaryFood

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Ingredient
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/20/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface IngredientDao {

    @Throws(JSONException::class)
    fun syncIngredient(list: JSONArray): Int {
        var insertCount = 0
        deleteTable()
        for(i in 0 until list.length()) {
            val jsonObject = list.optJSONObject(i)

            val item = Ingredient()
            item.sync(jsonObject)

            val rowId = insertTable(item)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertTable(ingredient: Ingredient): Long

    @Query("DELETE FROM " + TableContracts.IngredientTable.TABLE_NAME)
    fun deleteTable()

    @Query("SELECT * FROM ingredient")
    fun getAll(): List<Ingredient?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAll(data: List<Ingredient?>?)

    @Query("SELECT * FROM ingredient WHERE ingredientId= :id")
    fun getById(id: Int): Ingredient?

    @Query("SELECT * FROM ingredient WHERE ingredientName= :name")
    fun getByName(name: String?): Ingredient?

    @Query("DELETE FROM ingredient")
    fun deleteAll()

}