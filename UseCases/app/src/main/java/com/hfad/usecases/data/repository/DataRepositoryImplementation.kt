package com.hfad.usecases.data.repository

import android.content.Context
import com.hfad.usecases.data.storage.DataStorage
import com.hfad.usecases.data.storage.models.StorageData
import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData
import com.hfad.usecases.domain.repository.DataRepository

class DataRepositoryImplementation(private val dataStorage: DataStorage) : DataRepository {
    override fun saveData(data: SaveData) {
        val storageData = StorageData(data.dataEntries)
        dataStorage.save(storageData)
    }

    override fun getData(): Data {
        val storageData = dataStorage.get()
        return Data(storageData.dataEntries)
    }
}