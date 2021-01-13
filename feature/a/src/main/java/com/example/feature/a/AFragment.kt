package com.example.feature.a

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.core.navigation.base.Navigator
import com.example.core.ui.BaseFragment
import com.example.feature.a.navigation.ADestination

class AFragment : BaseFragment(R.layout.fragment_a), Navigator<ADestination> {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.toA2Button).setOnClickListener {
            navigateTo(ADestination.A2)
        }
    }

    override fun navigateTo(destination: ADestination) {
        navController.navigate(
            when (destination) {
                is ADestination.A2 -> AFragmentDirection
            }
        )
    }
}