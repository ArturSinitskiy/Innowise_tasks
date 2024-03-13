package com.hfad.usecases.domain.usecase

import android.widget.Toast
import com.hfad.usecases.domain.models.Data

class GetDataUseCase {
    fun execute(): Data {
        return Data.getInstance()
    }
}