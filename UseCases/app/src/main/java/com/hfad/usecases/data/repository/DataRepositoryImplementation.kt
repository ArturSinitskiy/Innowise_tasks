package com.hfad.usecases.data.repository

import android.content.Context
import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData
import com.hfad.usecases.domain.repository.DataRepository

private const val SHARED_PREF_NAME = "MY_SHARED_PREF"
private const val DATA_NAME = "data"

class DataRepositoryImplementation(context: Context): DataRepository {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)

    override fun saveData(data: SaveData) {
        sharedPreferences.edit().putString(DATA_NAME, data.dataEntries).apply()
    }

    override fun getData(): Data {
        val data = sharedPreferences.getString(DATA_NAME, "") ?: ""
        return Data(data)
    }
}