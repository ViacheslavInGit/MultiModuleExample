package com.example.navcomponent.navigation

import com.example.core.navigation.BaseNavigator
import com.example.navcomponent.MainActivity
import com.example.navcomponent.R

class MainActivityNavigator(
    activity: MainActivity
) : BaseNavigator(activity, R.id.fragmentContainer)