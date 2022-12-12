package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts.*
import edu.aku.abdulsajid.nanm2022.models.*
import org.json.JSONArray
import org.json.JSONException
import java.util.*

/*
 Created by gul.sanober on 12/1/2022.
 Updated by muhammad.hussain on 12/06/2022.
 Copyright (c) 2022 COE. All rights reserved.
*/

@Dao
interface SyncFunctionsDao {

    /*upload function*/
    /*EntryLog*/
    @Query(
        "SELECT * FROM " + EntryLogTable.TABLE_NAME + " WHERE " + EntryLogTable.COLUMN_SYNCED
                + " is \'\' " + " ORDER BY " + EntryLogTable.COLUMN_ID + " ASC"
    )
    fun getUnsyncedEntryLog_Internal(): List<EntryLog>

    @kotlin.jvm.Throws(JSONException::class)
    fun getUnsyncedEntryLog(): JSONArray? {
        val allForms = getUnsyncedEntryLog_Internal()
        val jsonArray = JSONArray()
        for (i in allForms) {
            i.Hydrate(i)
            jsonArray.put(i.toJSONObject())
        }
        return jsonArray
    }

    /*Forms*/
    @Query(
        "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_SYNCED
                + " is \'\' AND " + FormsTable.COLUMN_ISTATUS + " is not \'\' ORDER BY " + FormsTable.COLUMN_ID + " ASC"
    )
    fun getUnsyncedFormHH_Internal(): List<Forms>

    @kotlin.jvm.Throws(JSONException::class)
    fun getUnsyncedFormHH(): JSONArray? {
        val allForms = getUnsyncedFormHH_Internal()
        val jsonArray = JSONArray()
        for (i in allForms) {
            i.Hydrate(i)
            jsonArray.put(i.toJSONObject())
        }


        return jsonArray
    }

    /*Family Members*/
    @Query(
        "SELECT * FROM " + FamilyMembersTable.TABLE_NAME + " WHERE " + FamilyMembersTable.COLUMN_SYNCED
                + " is \'\' " + " ORDER BY " + FamilyMembersTable.COLUMN_ID + " ASC"
    )
    fun getUnsyncedFamilyMembers_Internal(): List<FamilyMembers>

    @kotlin.jvm.Throws(JSONException::class)
    fun getUnsyncedFamilyMembers(): JSONArray? {
        val allForms = getUnsyncedFamilyMembers_Internal()
        val jsonArray = JSONArray()
        for (i in allForms) {
            i.Hydrate(i)
            jsonArray.put(i.toJSONObject())
        }
        return jsonArray
    }

    /*Adolescent*/

    @Query(
        "SELECT * FROM " + AdolescentTable.TABLE_NAME + " WHERE " + AdolescentTable.COLUMN_SYNCED
                + " is \'\' AND " + AdolescentTable.COLUMN_ISTATUS + " is not null ORDER BY " + AdolescentTable.COLUMN_ID + " ASC"
    )
    fun getUnsyncedAdolescent_Internal(): List<Adolescent>

    @kotlin.jvm.Throws(JSONException::class)
    fun getUnsyncedAdolescent(): JSONArray? {
        val allForms = getUnsyncedAdolescent_Internal()
        val jsonArray = JSONArray()
        for (i in allForms) {
            i.Hydrate(i)
            jsonArray.put(i.toJSONObject())
        }
        return jsonArray
    }


    /*update SyncedTables */
    /*EntryLog*/
    @Query(
        "SELECT * FROM " + EntryLogTable.TABLE_NAME
                + " WHERE " + EntryLogTable.COLUMN_ID + " LIKE :id "
    )
    fun updateQueryEntryLog(id: String?): EntryLog

    fun updateSyncedEntryLog(id: String?): EntryLog {
        val synced = updateQueryEntryLog(id)
        synced.synced = "1"
        synced.syncDate = Date().toString()
        NANMRoomDatabase.dbInstance?.entryLogDao()?.updateEntryLog(synced)
        return synced
    }

    /*Forms*/
    @Query(
        "SELECT * FROM " + FormsTable.TABLE_NAME
                + " WHERE " + FormsTable.COLUMN_ID + " LIKE :id "
    )
    fun updateQueryhhs(id: String?): Forms

    fun updateSyncedFormHH(id: String?): Forms {
        val synced = updateQueryhhs(id)
        synced.synced = "1"
        synced.syncDate = Date().toString()
        NANMRoomDatabase.dbInstance?.formsDao()?.updateForm(synced)
        return synced
    }

    /*Family Members*/
    @Query(
        "SELECT * FROM " + FamilyMembersTable.TABLE_NAME
                + " WHERE " + FamilyMembersTable.COLUMN_ID + " LIKE :id "
    )
    fun updateQueryFM(id: String?): FamilyMembers

    fun updateSyncedFamilyMembers(id: String?): FamilyMembers {
        val synced = updateQueryFM(id)
        synced.synced = "1"
        synced.syncDate = Date().toString()
        NANMRoomDatabase.dbInstance?.familyMembersDao()?.updateFamilyMembers(synced)
        return synced
    }

    /*Adolescent*/
    @Query(
        "SELECT * FROM " + AdolescentTable.TABLE_NAME
                + " WHERE " + AdolescentTable.COLUMN_ID + " LIKE :id "
    )
    fun updateQueryAdol(id: String?): Adolescent

    fun updateSyncedAdolescent(id: String?): Adolescent {
        val synced = updateQueryAdol(id)
        synced.synced = "1"
        synced.syncDate = Date().toString()
        NANMRoomDatabase.dbInstance?.adolescentDao()?.updateAdolescent(synced)
        return synced
    }


    //************************************************* DOWNLOAD FUNCTIONS*************************************************************

    // Villages
    @Throws(JSONException::class)
    fun syncvillages(villagesList: JSONArray): Int {
        var insertCount = 0
        deleteVillagesTable()
        for (i in 0 until villagesList.length()) {
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

    @Query("DELETE FROM " + VillageTable.TABLE_NAME)
    fun deleteVillagesTable()


    // Users

    @Throws(JSONException::class)
    fun syncAppUser(usersList: JSONArray): Int {
        var insertCount = 0
        deleteUsersTable()
        for (i in 0 until usersList.length()) {
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

    @Query("DELETE FROM " + UsersTable.TABLE_NAME)
    fun deleteUsersTable()


    // Child
    @Throws(JSONException::class)
    fun syncchild_list(childList: JSONArray): Int {
        var insertCount = 0
        deleteChildTable()
        for (i in 0 until childList.length()) {
            val jsonObject = childList.optJSONObject(i)

            val child = AdolList()
            child.sync(jsonObject)


            val rowId = insertChild(child)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertChild(child: AdolList): Long

    @Query("DELETE FROM " + ChildTable.TABLE_NAME)
    fun deleteChildTable()


}