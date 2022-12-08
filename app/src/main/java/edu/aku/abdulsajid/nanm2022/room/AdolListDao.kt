package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.AdolList
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/6/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface AdolListDao {
    @Throws(JSONException::class)
    fun syncChildList(childList: JSONArray): Int {
        var insertCount = 0
        deleteChildListTable()
        for(i in 0 until childList.length()) {
            val jsonObjectUser = childList.optJSONObject(i)

            val adolList = AdolList()
            adolList.sync(jsonObjectUser)

            val rowId = insertChildList(adolList)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertChildList(adolList: AdolList): Long

    @Query("DELETE FROM " + TableContracts.ChildTable.TABLE_NAME)
    fun deleteChildListTable()


    @Query("SELECT * FROM " + TableContracts.ChildTable.TABLE_NAME +
            " WHERE " + TableContracts.ChildTable.COLUMN_VILLAGE_CODE + " LIKE :villageCode AND "
            + TableContracts.ChildTable.COLUMN_SR_NO + " LIKE :srNo  ORDER BY "
            + TableContracts.ChildTable.COLUMN_SR_NO + " ASC")
    fun getAdolBySno(villageCode : String, srNo: String) : AdolList?


    @Query("SELECT * FROM " + TableContracts.ChildTable.TABLE_NAME  +
            " WHERE " + TableContracts.ChildTable.COLUMN_VILLAGE_CODE + " LIKE :villageCode AND " +
            TableContracts.ChildTable.COLUMN_SR_NO + " LIKE :srNo" )
    fun getRandomBySrno(srNo: String, villageCode: String) : AdolList





}