package com.example.core.navigation.base

interface Navigator<D : Destination> {

    fun navigateTo(destination: D)
}