package com.example.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.core.navigation.BaseRouter
import com.example.core.navigation.ScreensProvider
import org.koin.android.ext.android.inject

abstract class BaseFragment<B : ViewDataBinding>(
    @LayoutRes private val layoutId: Int
) : Fragment() {

    protected val router: BaseRouter by inject()
    protected val screensProvider: ScreensProvider by inject()

    private var viewBinding: B? = null
    protected val binding: B
        get() = viewBinding
            ?: throw IllegalStateException("Trying to access the binding outside of the view lifecycle.")

    @CallSuper
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }
}