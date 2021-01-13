package com.example.feature.a

import android.os.Bundle
import android.view.View
import com.example.core.BaseFragment
import com.example.feature.a.databinding.FragmentA2Binding

class A2Fragment : BaseFragment<FragmentA2Binding>(R.layout.fragment_a2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvValue.text = getValue().toString()
    }

    companion object {

        private fun A2Fragment.getValue(): String? = TODO("")
    }
}