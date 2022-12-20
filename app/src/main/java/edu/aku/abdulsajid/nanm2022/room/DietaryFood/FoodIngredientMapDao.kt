package edu.aku.abdulsajid.nanm2022.room.DietaryFood

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodIngredientMap
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Ingredient
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/20/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface FoodIngredientMapDao {



    @Query("SELECT * FROM FoodIngredientMap")
    fun getAll(): List<FoodIngredientMap?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAll(data: List<FoodIngredientMap?>?)

    @Query("DELETE FROM FoodIngredientMap")
    fun deleteAll()

    @Query(
        "SELECT * FROM ingredient LEFT JOIN foodingredientmap " +
                "ON ingredient.ingredientId = foodingredientmap.ingredientId WHERE foodId = :foodId"
    )
    fun getAllIngrByFoodId(foodId: Int): List<Ingredient?>?

}