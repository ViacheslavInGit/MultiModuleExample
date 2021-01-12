package com.example.navcomponent

import android.app.Application
import com.example.navcomponent.di.NavigationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class NavApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@NavApplication)
            modules(
                NavigationModule.module,
            )
        }
    }
}