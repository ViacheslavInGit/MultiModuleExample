package com.example.core.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController

abstract class BaseFragment(
    @LayoutRes private val layoutId: Int
) : Fragment() {

    protected val navController: NavController
        get() = (requireActivity() as BaseActivity).navController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(layoutId, container, false)

}