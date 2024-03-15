package com.hfad.usecases.domain.repository

import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData

interface DataRepository {
    fun saveData(data: SaveData)
    fun getData(): Data
}