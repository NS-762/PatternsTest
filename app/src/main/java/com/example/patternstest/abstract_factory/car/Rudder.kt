package com.example.patternstest.abstract_factory.car

import android.util.Log
import com.example.patternstest.abstract_factory.ControlDevice

class Rudder: ControlDevice {
    override fun control() {
        Log.e("car", "Управлять рулем")
    }
}