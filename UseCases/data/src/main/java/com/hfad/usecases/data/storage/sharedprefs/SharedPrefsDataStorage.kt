package com.hfad.usecases.data.storage.sharedprefs

import android.content.Context
import com.hfad.usecases.data.storage.DataStorage
import com.hfad.usecases.data.storage.models.StorageData
import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData

private const val SHARED_PREF_NAME = "MY_SHARED_PREF"
private const val DATA_NAME = "data"

class SharedPrefsDataStorage(context: Context) : DataStorage {

    private val sharedPreferences =
        context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)

    override fun get(): StorageData {
        val storageData = sharedPreferences.getString(DATA_NAME, "") ?: ""
        return StorageData(storageData)
    }

    override fun save(storageData: StorageData) {
        sharedPreferences.edit().putString(DATA_NAME, storageData.dataEntries).apply()
    }
}