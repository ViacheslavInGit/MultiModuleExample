package com.example.core.navigation

import ru.terrakok.cicerone.android.support.SupportAppScreen

interface ScreensProvider {

    fun getAScreen(): SupportAppScreen
    fun getA2Screen(message: String): SupportAppScreen
    fun getBScreen(): SupportAppScreen
    fun getB2Screen(): SupportAppScreen
}