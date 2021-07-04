package com.example.patternstest.decorator

import android.util.Log

class XenonCarDecorator(car: Car): CarDecorator(car) {

    fun useXenon() {
        Log.e("Car", "Car use xenon")
    }

    override fun drive() {
        car.drive()
        useXenon()
    }
}