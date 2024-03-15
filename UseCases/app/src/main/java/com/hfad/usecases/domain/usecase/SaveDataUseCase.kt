package com.hfad.usecases.domain.usecase

import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData
import com.hfad.usecases.domain.repository.DataRepository

class SaveDataUseCase(private val dataRepository: DataRepository) {
    fun execute(data: SaveData){
        dataRepository.saveData(data)
    }
}