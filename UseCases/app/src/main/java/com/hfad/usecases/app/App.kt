package com.hfad.usecases.app

import android.app.Application
import com.hfad.usecases.di.appModule
import com.hfad.usecases.di.dataModule
import com.hfad.usecases.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {

    override fun onCreate() {
        super.onCreate()

       startKoin{
           androidLogger(Level.ERROR)
           androidContext(this@App)
           modules(listOf(appModule, domainModule, dataModule))
       }
    }
}