package com.example.patternstest.abstract_factory.plane

import android.util.Log
import com.example.patternstest.abstract_factory.RideDevice

class Chassis: RideDevice {
    override fun ride() {
        Log.e("самолет", "Ехать на шасси")
    }
}