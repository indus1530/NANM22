package edu.aku.abdulsajid.nanm2022.core

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.Settings
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.Reflection.getPackageName
import edu.aku.abdulsajid.nanm2022.core.MainApp.IBAHC
import edu.aku.abdulsajid.nanm2022.core.MainApp.TRATS
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase
import net.sqlcipher.database.SQLiteDatabase
import java.text.SimpleDateFormat
import java.util.*

/*
 * @author Mustufa
 * @update hussain.siddiqui on 01/12/22
 * */
class AppInfo {
    var versionName: String = ""
    var installedOn: Long = 0
    var versionCode = 0
    var tagName: String? = null
    var deviceID: String = ""
    var appVersion: String = ""
    val dtToday: String
        get() = SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(Date().time)
    val isTestingApp: Boolean
        // get() = versionName.split("\\.".toRegex())[0].toInt() > 0
        get() = versionName.split(".").first().toInt() > 0


    lateinit var dbHelper: NANMRoomDatabase

    constructor(context: Context) {
        try {
            installedOn = context.packageManager.getPackageInfo(
                context.applicationContext.packageName,
                0
            ).lastUpdateTime
            versionCode = context.packageManager.getPackageInfo(
                context.applicationContext.packageName,
                0
            ).versionCode
            versionName = context.packageManager.getPackageInfo(
                context.applicationContext.packageName,
                0
            ).versionName
            deviceID =
                Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
            appVersion = "$versionName.$versionCode"
            tagName = getTagName(context)
            setupDatabase(context)
            /*synchronized(this) {
                 NANMRoomDatabase.dbInstance?.let{ dbHelper = it }
            }*/
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }

    constructor(versionName: String, installedOn: Long, versionCode: Int) {
        this.versionName = versionName
        this.installedOn = installedOn
        this.versionCode = versionCode
    }

    private fun getTagName(mContext: Context): String? {
        val sharedPref = mContext.getSharedPreferences("tagName", Context.MODE_PRIVATE)
        return sharedPref.getString("tagName", null)
    }

    fun updateTagName(mContext: Context) {
        tagName = getTagName(mContext)
    }

    fun getInfo(): AppInfo {
        return AppInfo(versionName, installedOn, versionCode)
    }

    fun getAppInfo(): String {
        return """Ver. $versionName.$versionCode ( Last Updated: ${
            SimpleDateFormat(
                "dd MMM. yyyy",
                Locale.ENGLISH
            ).format(Date(getInfo().installedOn))
        } )"""
    }

    private fun setupDatabase(context: Context) {
        synchronized(this) {
            dbHelper = if (NANMRoomDatabase.dbInstance != null)
                NANMRoomDatabase.dbInstance!!
            else {
                initSecure(context)
                NANMRoomDatabase.dbInstance!!
            }
        }
    }

    private fun initSecure(context: Context) = context.apply {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);

        try {
            val ai: ApplicationInfo = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            val bundle: Bundle = ai.metaData;
            val trats: Int = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            val ibahc: String? = bundle.getString("YEK_REVRES");

            // Room DB
            if (ibahc != null) {
                NANMRoomDatabase.init(this, ibahc)
            };

        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace();
        }
    }


}