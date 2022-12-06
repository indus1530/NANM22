package edu.aku.abdulsajid.nanm2022.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.aku.abdulsajid.nanm2022.contracts.TableContracts
import edu.aku.abdulsajid.nanm2022.models.Users
import edu.aku.abdulsajid.nanm2022.models.Villages
import org.json.JSONArray
import org.json.JSONException

//
// Created by gul.sanober on 12/6/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface VillagesDao {

    @Query("SELECT * FROM " + TableContracts.VillageTable.TABLE_NAME
            + " WHERE " + TableContracts.VillageTable.COLUMN_VILLAGE_CODE
            + " LIKE :villageCode " + " ORDER BY "
            + TableContracts.VillageTable.COLUMN_ID + " ASC")
    fun getVillage(villageCode : String) : Villages

}