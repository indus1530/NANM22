package edu.aku.abdulsajid.nanm2022.room

import androidx.room.*
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.Adolescent
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers
import org.json.JSONException
import kotlin.jvm.Throws

//
// Created by gul.sanober on 12/6/2022.
// Copyright (c) 2022 COE. All rights reserved.
//


@Dao
interface AdolescentDao {

    @Throws(JSONException ::class)
    @Insert
    fun addAdolescent(adolescent: Adolescent) : Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateAdolescent(adolescent: Adolescent) : Int



    @Query("SELECT * FROM " + TableContracts.AdolescentTable.TABLE_NAME
            + " WHERE " + TableContracts.AdolescentTable.COLUMN_UUID + " LIKE :uid "
            + "ORDER BY " + TableContracts.AdolescentTable.COLUMN_ID + " ASC")
    fun getAdolByUUid_Query(uid: String) : Adolescent

    @Throws(JSONException::class)
    fun getAdolByUUid(uid: String) : Adolescent
    {
        val members = getAdolByUUid_Query(uid)
        if(members == null)
        {
            val tempMembers = Adolescent()
            return tempMembers
        }else{
            members.sCHydrate(members.sc)
            members.sDHydrate(members.sd)
        }
        return members
    }


    @Query("SELECT * FROM " + TableContracts.AdolescentTable.TABLE_NAME
            + " WHERE " + TableContracts.AdolescentTable.COLUMN_UUID + " LIKE :uid AND "
            + TableContracts.AdolescentTable.COLUMN_FMUID
            + " LIKE :fmuid ORDER BY " + TableContracts.AdolescentTable.COLUMN_ID
            + " ASC")
    fun getAdolByUUid_Query(uid: String, fmuid : String) : Adolescent

    @Throws(JSONException::class)
    fun getAdolByUUid(uid: String, fmuid: String) : Adolescent
    {
        val members = getAdolByUUid_Query(uid, fmuid)
        if(members == null)
        {
            val tempMembers = Adolescent()
            return tempMembers
        }else{
            members.sCHydrate(members.sc)
            members.sDHydrate(members.sd)
        }
        return members
    }



}