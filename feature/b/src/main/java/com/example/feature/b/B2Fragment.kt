package com.example.feature.b

import android.os.Bundle
import android.view.View
import com.example.core.BaseFragment
import com.example.feature.b.databinding.FragmentB2Binding

class B2Fragment : BaseFragment<FragmentB2Binding>(R.layout.fragment_b2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toA2Button.setOnClickListener {
            router.navigateTo(screensProvider.getA2Screen(getMessage()))
        }
    }

    private fun getMessage() = "hi from B"

    companion object {

        fun newInstance(): B2Fragment = B2Fragment()
    }
}