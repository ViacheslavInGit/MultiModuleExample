package com.example.feature.b

import android.os.Bundle
import android.view.View
import com.example.core.BaseFragment
import com.example.feature.b.databinding.FragmentBBinding

class BFragment : BaseFragment<FragmentBBinding>(R.layout.fragment_b) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toB2Button.setOnClickListener {
            // TODO: 13.01.2021 navigate to b2 
        }
    }
}