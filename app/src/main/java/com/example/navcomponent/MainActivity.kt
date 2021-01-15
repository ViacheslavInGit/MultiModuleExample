package com.example.navcomponent

import android.os.Bundle
import com.example.core.BaseActivity
import com.example.navcomponent.databinding.ActivityMainBinding
import com.example.navcomponent.navigation.MainActivityNavigator

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override val navigator = MainActivityNavigator(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        with(binding.bottomNavigationView) {
            setOnNavigationItemSelectedListener {
                router.newRootScreen(
                    when (it.itemId) {
                        R.id.fragmentA -> screensProvider.getAScreen()
                        R.id.fragmentB -> screensProvider.getBScreen()
                        else -> throw IllegalArgumentException()
                    }
                )
                true
            }
            selectedItemId = R.id.fragmentA
        }
    }
}