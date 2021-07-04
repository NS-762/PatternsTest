package com.example.patternstest.decorator

import android.util.Log

class SpoilerCarDecorator(car: Car): CarDecorator(car) {

    fun useSpoiler() {
        Log.e("Car", "Car use spoiler")
    }

    override fun drive() {
        car.drive()
        useSpoiler()
    }
}