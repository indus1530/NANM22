package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.core.MainApp
import edu.aku.abdulsajid.nanm2022.core.UserAuth
import edu.aku.abdulsajid.nanm2022.models.Users
import org.json.JSONArray
import org.json.JSONException
import java.security.InvalidKeyException
import java.security.NoSuchAlgorithmException

//
// Created by gul.sanober on 12/6/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Dao
interface UsersDao {

    @Throws(JSONException::class)
    fun syncAppUser(usersList: JSONArray): Int {
        var insertCount = 0
        deleteUsersTable()
        for(i in 0 until usersList.length()) {
            val jsonObjectUser = usersList.optJSONObject(i)

            val user = Users()
            user.sync(jsonObjectUser)

            val rowId = insertUser(user)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertUser(user: Users): Long

    @Query("DELETE FROM " + TableContracts.UsersTable.TABLE_NAME)
    fun deleteUsersTable()



    @Query("SELECT * FROM " + TableContracts.UsersTable.TABLE_NAME +
            " WHERE " + TableContracts.UsersTable.COLUMN_USERNAME + " LIKE :username ORDER By "
            + TableContracts.UsersTable.COLUMN_ID + " ASC")
    fun doLogin_internal(username: String, password : String) : Users

    @kotlin.jvm.Throws(InvalidKeyException::class, NoSuchAlgorithmException::class, IllegalArgumentException::class)
    fun doLogin(username: String, password: String) : Boolean
    {
        val user = doLogin_internal(username, password)
        user.
    }





}