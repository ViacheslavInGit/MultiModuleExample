package com.example.core.ui

import android.os.Bundle
import android.view.View
import com.example.core.R
import com.example.core.navigation.MainDestination
import com.example.core.navigation.base.Navigator

class MainFragment : BaseFragment(R.layout.fragment_main), Navigator<MainDestination> {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigateTo(MainDestination.A)
    }

    override fun navigateTo(destination: MainDestination) {
        navController.navigate(
            when (destination) {
                is MainDestination.A -> MainFragmentDirections.actionToA()
                is MainDestination.B -> MainFragmentDirections.actionToB()
            }
        )
    }
}