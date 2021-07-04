package com.example.patternstest.decorator

import android.util.Log

class EmptyCar: Car {

    override fun drive() {
        Log.e("Car", "Empty car drive")
    }
}