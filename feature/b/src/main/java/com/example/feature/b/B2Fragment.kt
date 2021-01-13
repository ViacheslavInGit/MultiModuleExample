package com.example.feature.b

import android.os.Bundle
import android.view.View
import com.example.core.BaseFragment
import com.example.feature.b.databinding.FragmentB2Binding

class B2Fragment : BaseFragment<FragmentB2Binding>(R.layout.fragment_b2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toA2Button.setOnClickListener {
            // TODO: 13.01.2021  navigate to a2
        }
    }

    private fun getMessage() = "hi from B"
}