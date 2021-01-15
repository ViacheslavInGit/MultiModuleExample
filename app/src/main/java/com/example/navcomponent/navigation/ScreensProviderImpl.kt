package com.example.navcomponent.navigation

import com.example.core.navigation.ScreensProvider
import com.example.feature.a.A2Fragment
import com.example.feature.a.AFragment
import com.example.feature.b.B2Fragment
import com.example.feature.b.BFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class ScreensProviderImpl : ScreensProvider {

    override fun getAScreen() =
        object : SupportAppScreen() {
            override fun getFragment() = AFragment.newInstance()
        }

    override fun getA2Screen(message: String) =
        object : SupportAppScreen() {
            override fun getFragment() = A2Fragment.newInstance(message)
        }

    override fun getBScreen() =
        object : SupportAppScreen(){
            override fun getFragment() = BFragment.newInstance()
        }

    override fun getB2Screen()=
        object : SupportAppScreen(){
            override fun getFragment() = B2Fragment.newInstance()
        }
}