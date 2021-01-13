package com.example.core.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController

abstract class BaseActivity : AppCompatActivity() {

    val navController: NavController
        get() = _navController

    protected lateinit var _navController: NavController
}