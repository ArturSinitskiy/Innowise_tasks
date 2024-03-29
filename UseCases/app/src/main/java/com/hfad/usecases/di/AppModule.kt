package com.hfad.usecases.di

import com.hfad.usecases.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            getDataUseCase = get(), saveDataUseCase = get()
        )
    }
}