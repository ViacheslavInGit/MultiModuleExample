package com.example.navcomponent.di

import com.example.core.navigation.BaseRouter
import com.example.core.navigation.ScreensProvider
import com.example.navcomponent.navigation.MainActivityNavigator
import com.example.navcomponent.navigation.ScreensProviderImpl
import org.koin.dsl.module
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder

object NavigationModule {

    val module = module {

        val cicerone = Cicerone.create(BaseRouter())

        single<BaseRouter> { cicerone.router }
        single<NavigatorHolder> { cicerone.navigatorHolder }

        single<ScreensProvider> { ScreensProviderImpl() }
    }
}