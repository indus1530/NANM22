package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers
import edu.aku.abdulsajid.nanm2022.models.Forms
import org.json.JSONException
import kotlin.jvm.Throws

//
// Created by gul.sanober on 12/6/2022.
//

@Dao
interface FamilyMembersDao {

    @Throws(JSONException ::class)
    @Insert
    fun addFamilyMembers(familyMembers: FamilyMembers) : Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateFamilyMembers(familyMembers: FamilyMembers) : Int
}