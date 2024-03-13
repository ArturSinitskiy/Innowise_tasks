package com.hfad.usecases.domain.usecase

import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData

class SaveDataUseCase {
    fun execute(data: SaveData): Boolean{
        if (data.dataEntries.isNotEmpty()) {
            Data.getInstance().dataEntries = data.dataEntries
        }
        return data.dataEntries.isNotEmpty()
    }
}