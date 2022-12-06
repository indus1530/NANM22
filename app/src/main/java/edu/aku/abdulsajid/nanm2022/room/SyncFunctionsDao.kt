package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.Users
import edu.aku.abdulsajid.nanm2022.models.Villages
import org.json.JSONArray
import org.json.JSONException
import java.util.*

//
// Created by gul.sanober on 12/1/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface SyncFunctionsDao {


    // upload function
/*

    @Query("SELECT * FROM " + TableContracts.HouseholdTable.TABLE_NAME + " WHERE " + TableContracts.HouseholdTable.COLUMN_SYNCED
            + " is \'\' AND (" + TableContracts.HouseholdTable.COLUMN_ISTATUS  + " = 1 OR "
            + TableContracts.HouseholdTable.COLUMN_VISIT_NO + " > 2) ORDER BY " + TableContracts.HouseholdTable.COLUMN_ID + " ASC")
    fun getUnsyncedHousehols_internal() : List<Households>
*/

   /* @kotlin.jvm.Throws(JSONException :: class)
    fun getUnsyncedHouseholds() : JSONArray?
    {
        val allForms = getUnsyncedHousehols_internal()

        val jsonArray = JSONArray()
        for (i in allForms)
        {

            jsonArray.put(i.toJSONObject())

        }

        return jsonArray

    }*/



    // Households



    /*@Query("SELECT * FROM " + TableContracts.HouseholdTable.TABLE_NAME
            + " WHERE " + TableContracts.HouseholdTable.COLUMN_ID + " LIKE :id ")
    fun updateQueryhhs(id: String?) : Households


    fun updateSyncedhhs(id: String?) : Households
    {
        val synced = updateQueryhhs(id)

        synced.synced = "1"
        synced.syncDate = Date().toString()
        return synced
    }
*/

    // MWRA


    /*@Query("SELECT * FROM " + TableContracts.MWRATable.TABLE_NAME
            + " WHERE " + TableContracts.MWRATable.COLUMN_SYNCED
            + " is \'\' ORDER BY " + TableContracts.MWRATable.COLUMN_ID + " ASC")
    fun getUnsyncedMWRAS_internal() : List<Mwra>

    @kotlin.jvm.Throws(JSONException :: class)
    fun getUnsyncedMwras() : JSONArray?
    {
        val allForms = getUnsyncedMWRAS_internal()

        val jsonArray = JSONArray()
        for (i in allForms)
        {

            jsonArray.put(i.toJSONObject())

        }

        return jsonArray

    }*/


   /* @Query("SELECT * FROM " + TableContracts.MWRATable.TABLE_NAME
            + " WHERE " + TableContracts.MWRATable.COLUMN_ID + " LIKE :id ")
    fun updateQueryMWRA(id: String?) : Mwra


    fun updateSyncedMWRA(id: String?) : Mwra
    {
        val synced = updateQueryMWRA(id)

        synced.synced = "1"
        synced.syncDate = Date().toString()
        return synced
    }*/


    // Outcome

   /* @Query("SELECT * FROM " + TableContracts.OutcomeTable.TABLE_NAME
            + " WHERE " + TableContracts.OutcomeTable.COLUMN_SYNCED
            + " is \'\' ORDER BY " + TableContracts.OutcomeTable.COLUMN_ID + " ASC")
    fun getUnsyncedOutcome_internal() : List<Outcome>

    @kotlin.jvm.Throws(JSONException :: class)
    fun getUnsyncedOutcome() : JSONArray?
    {
        val allForms = getUnsyncedOutcome_internal()

        val jsonArray = JSONArray()
        for (i in allForms)
        {

            jsonArray.put(i.toJSONObject())

        }

        return jsonArray

    }


    @Query("SELECT * FROM " + TableContracts.OutcomeTable.TABLE_NAME
            + " WHERE " + TableContracts.OutcomeTable.COLUMN_ID + " LIKE :id ")
    fun updateQueryOutcome(id: String?) : Outcome


    fun updateSyncedOutcome(id: String?) : Outcome
    {
        val synced = updateQueryOutcome(id)

        synced.synced = "1"
        synced.syncDate = Date().toString()
        return synced
    }*/


    //************************************************* DOWNLOAD FUNCTIONS*************************************************************


    @Throws(JSONException::class)
    fun syncvillages(villagesList: JSONArray): Int {
        var insertCount = 0
        deleteVillagesTable()
        for(i in 0 until villagesList.length()) {
            val jsonObjectUser = villagesList.optJSONObject(i)

            val villages = Villages()
            villages.sync(jsonObjectUser)

            val rowId = insertVillages(villages)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }


    @Insert
    fun insertVillages(villages: Villages): Long

    @Query("DELETE FROM " + TableContracts.VillageTable.TABLE_NAME)
    fun deleteVillagesTable()


    // Users

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


}