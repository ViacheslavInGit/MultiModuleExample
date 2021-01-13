package com.example.feature.a

import android.os.Bundle
import android.view.View
import com.example.core.BaseFragment
import com.example.core.Destination
import com.example.core.DestinationNavigator
import com.example.feature.a.databinding.FragmentABinding

class AFragment : BaseFragment<FragmentABinding>(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toA2Button.setOnClickListener {
            (requireActivity() as DestinationNavigator).navigateTo(Destination.A2(getMessage()))
        }
    }

    private fun getMessage() = "hi from A"
}