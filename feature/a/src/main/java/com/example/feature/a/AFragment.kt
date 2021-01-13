package com.example.feature.a

import android.os.Bundle
import android.view.View
import com.example.core.BaseFragment
import com.example.feature.a.databinding.FragmentABinding

class AFragment : BaseFragment<FragmentABinding>(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toA2Button.setOnClickListener {
            // TODO: 13.01.2021 navigate to a2
        }
    }

    private fun getMessage() = "hi from A"

    companion object {

        fun newInstance(): AFragment = AFragment()
    }
}