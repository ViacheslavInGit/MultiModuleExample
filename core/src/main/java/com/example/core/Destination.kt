package com.example.core

sealed class Destination {
    object A : Destination()
    class A2(val message: String) : Destination()
    object B : Destination()
    object B2 : Destination()
}