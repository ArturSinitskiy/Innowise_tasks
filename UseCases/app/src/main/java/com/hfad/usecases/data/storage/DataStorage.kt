package com.hfad.usecases.data.storage

import com.hfad.usecases.data.storage.models.StorageData
import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData

interface DataStorage {
    fun get(): StorageData
    fun save(storageData: StorageData)
}