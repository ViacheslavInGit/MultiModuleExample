package com.example.navcomponent

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.core.BaseActivity
import com.example.core.Destination
import com.example.core.DestinationNavigator
import com.example.feature.a.A2Fragment
import com.example.navcomponent.databinding.ActivityMainBinding

class MainActivity :
    BaseActivity<ActivityMainBinding>(R.layout.activity_main),
    DestinationNavigator {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = supportFragmentManager
            .findFragmentById(R.id.navHostFragment)
            .let(::requireNotNull)
            .findNavController()

        with(binding.bottomNavigationView) {
            selectedItemId = R.id.fragmentA

            NavigationUI.setupWithNavController(this, navController)
        }
    }

    override fun navigateTo(destination: Destination) {
        when (destination) {
            Destination.A -> navController.navigate(NavGraphMainDirections.actionToA())
            is Destination.A2 -> navController.navigate(
                R.id.action_to_a2,
                A2Fragment.createBundle(destination.message)
            )
            Destination.B -> navController.navigate(NavGraphMainDirections.actionToB())
            Destination.B2 -> navController.navigate(NavGraphMainDirections.actionToB2())
        }
    }
}