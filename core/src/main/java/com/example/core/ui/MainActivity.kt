package com.example.core.ui

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.core.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        _navController = supportFragmentManager
            .findFragmentById(R.id.navHostMain)
            .let(::requireNotNull)
            .findNavController()

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

}