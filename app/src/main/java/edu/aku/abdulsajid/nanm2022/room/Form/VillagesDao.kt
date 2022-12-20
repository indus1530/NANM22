package edu.aku.abdulsajid.nanm2022.room.Form

import androidx.room.Dao
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.Villages

//
// Created by gul.sanober on 12/6/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface VillagesDao {

    @Query("SELECT * FROM " + TableContracts.VillageTable.TABLE_NAME
            + " WHERE " + TableContracts.VillageTable.COLUMN_VILLAGE_CODE
            + " LIKE :villageCode ORDER BY "
            + TableContracts.VillageTable.COLUMN_ID + " ASC")
    fun getVillage_internal(villageCode : String) : Villages?

    fun getVillage(villageCode : String) : Villages?
    {
        val villages =getVillage_internal(villageCode)
        if(villages == null)
        {
            val newVillages = Villages()
            return newVillages
        }

        return villages
    }

}