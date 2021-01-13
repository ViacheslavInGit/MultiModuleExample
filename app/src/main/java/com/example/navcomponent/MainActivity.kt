package com.example.navcomponent

import android.os.Bundle
import com.example.core.BaseActivity
import com.example.navcomponent.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding.bottomNavigationView) {

            selectedItemId = R.id.fragmentA
        }
    }
}