package com.hfad.usecases.domain.usecase

import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.repository.DataRepository

class GetDataUseCase(private val dataRepository: DataRepository) {
    fun execute(): Data {
        return dataRepository.getData()
    }
}