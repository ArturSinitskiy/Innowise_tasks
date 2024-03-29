package com.hfad.usecases.di

import com.hfad.usecases.domain.usecase.GetDataUseCase
import com.hfad.usecases.domain.usecase.SaveDataUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetDataUseCase> {
        GetDataUseCase(dataRepository = get())
    }

    factory<SaveDataUseCase> {
        SaveDataUseCase(dataRepository = get())
    }

}