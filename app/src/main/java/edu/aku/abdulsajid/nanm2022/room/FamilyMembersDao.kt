package edu.aku.abdulsajid.nanm2022.room

import androidx.room.*
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.FamilyMembers
import edu.aku.abdulsajid.nanm2022.models.Forms
import edu.aku.abdulsajid.nanm2022.ui.lists.FamilyMembersListActivity
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


    @Query("SELECT * FROM " + TableContracts.FamilyMembersTable.TABLE_NAME
            + " WHERE " + TableContracts.FamilyMembersTable.COLUMN_UUID
            + " LIKE :uid ORDER BY " + TableContracts.FamilyMembersTable.COLUMN_ID
            + " ASC"
    )
    fun getMemberBYUID_Internal(uid : String) : List<FamilyMembers>

    @Throws(JSONException::class)
    fun getMemberBYUID(uid: String) : List<FamilyMembers>
    {
        val members = getMemberBYUID_Internal(uid)
        members.forEach {
            it.sDHydrate(it.sd)
        }
        return members

    }

    @Query("SELECT * FROM " + TableContracts.FamilyMembersTable.TABLE_NAME
            + " WHERE " + TableContracts.FamilyMembersTable.COLUMN_UUID + " LIKE :uid AND "
            + TableContracts.FamilyMembersTable.COLUMN_INDEXED + " LIKE '1' ORDER BY "
            + TableContracts.FamilyMembersTable.COLUMN_ID + " ASC")
    fun getSelectedMemberBYUID_internal(uid: String) : FamilyMembers

    @Throws(JSONException::class)
    fun getSelectedMemberBYUID(uid: String) : FamilyMembers
    {
        val members = getSelectedMemberBYUID_internal(uid)
        if(members == null)
        {
            val tempMembers = FamilyMembers()
            return tempMembers
        }else{
            members.sDHydrate(members.sd)
        }
        return members
    }


}