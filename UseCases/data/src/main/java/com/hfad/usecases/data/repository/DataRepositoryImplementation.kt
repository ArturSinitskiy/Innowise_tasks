package com.hfad.usecases.data.repository

import android.content.Context
import com.hfad.usecases.data.storage.DataStorage
import com.hfad.usecases.data.storage.models.StorageData
import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData
import com.hfad.usecases.domain.repository.DataRepository

class DataRepositoryImplementation(private val dataStorage: DataStorage) :
    com.hfad.usecases.domain.repository.DataRepository {
    override fun saveData(data: com.hfad.usecases.domain.models.SaveData) {
        val storageData = StorageData(data.dataEntries)
        dataStorage.save(storageData)
    }

    override fun getData(): com.hfad.usecases.domain.models.Data {
        val storageData = dataStorage.get()
        return com.hfad.usecases.domain.models.Data(storageData.dataEntries)
    }
}