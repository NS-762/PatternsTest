package com.example.patternstest.abstract_factory.car

import android.util.Log
import com.example.patternstest.abstract_factory.RideDevice

class Wheel: RideDevice {
    override fun ride() {
        Log.e("car", "Ехать на колесах")
    }
}