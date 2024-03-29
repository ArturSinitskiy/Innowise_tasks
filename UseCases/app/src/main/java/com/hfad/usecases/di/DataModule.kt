package com.hfad.usecases.di

import com.hfad.usecases.data.repository.DataRepositoryImplementation
import com.hfad.usecases.data.storage.DataStorage
import com.hfad.usecases.data.storage.sharedprefs.SharedPrefsDataStorage
import com.hfad.usecases.domain.repository.DataRepository
import org.koin.dsl.module

val dataModule = module {

    single<DataRepository> {
        DataRepositoryImplementation(dataStorage = get())
    }

    single<DataStorage> {
        SharedPrefsDataStorage(context = get())
    }

}