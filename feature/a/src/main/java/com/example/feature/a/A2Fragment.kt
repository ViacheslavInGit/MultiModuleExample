package com.example.feature.a

//import com.example.feature.a.A2FragmentArgs
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import com.example.core.BaseFragment
import com.example.feature.a.databinding.FragmentA2Binding

class A2Fragment : BaseFragment<FragmentA2Binding>(R.layout.fragment_a2) {

    // билдится в app модуле, поэтому нельзя использовать safeArgs
    // val args: A2FragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvValue.text = getValue().toString()
    }

    companion object {

        private const val VALUE_KEY = "VALUE"

        private fun A2Fragment.getValue(): String? =
            requireArguments().getString(VALUE_KEY)

        fun createBundle(message: String) = bundleOf(
            VALUE_KEY to message
        )
    }
}