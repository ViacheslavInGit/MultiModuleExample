package com.example.core.navigation

import com.example.core.navigation.base.Destination

sealed class MainDestination : Destination {

    object A : MainDestination()
    object B : MainDestination()
}

