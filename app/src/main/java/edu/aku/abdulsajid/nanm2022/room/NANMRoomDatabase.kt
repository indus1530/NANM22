package edu.aku.abdulsajid.nanm2022.room

import android.app.admin.SystemUpdatePolicy
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import edu.aku.abdulsajid.nanm2022.core.MainApp
import edu.aku.abdulsajid.nanm2022.models.Forms
import net.sqlcipher.database.SupportFactory

//
// Created by gul.sanober on 11/30/2022.
// Copyright (c) 2022 coe. All rights reserved.
//

@Database(
        version = NANMRoomDatabase.DATABASE_VERSION,
        entities = [
            Forms::class
        ]
)

abstract class NANMRoomDatabase : RoomDatabase(){

    abstract fun formsDao() : FormsDao


    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = MainApp.PROJECT_NAME + "1.db"


        @Volatile
        @JvmStatic
        var dbInstance: NANMRoomDatabase? = null

        @JvmStatic
        fun init(context: Context, password: String): NANMRoomDatabase {
            if (dbInstance != null)
                return dbInstance!!

            synchronized(this) {
                val passphrase: ByteArray = net.sqlcipher.database.SQLiteDatabase.getBytes(password.toCharArray())
                val factory = SupportFactory(passphrase)

                dbInstance = Room.databaseBuilder(context, NANMRoomDatabase::class.java, DATABASE_NAME)
                        .openHelperFactory(factory)
                        .addMigrations(MIGRATION_1_2)
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
                return dbInstance!!
            }
        }

        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Since we didn’t alter the table, there’s nothing else
                // to do here.
            }
        }

    }


}

