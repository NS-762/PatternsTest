package com.example.patternstest.abstract_factory.plane

import android.util.Log
import com.example.patternstest.abstract_factory.ControlDevice

class Helm: ControlDevice {
    override fun control() {
        Log.e("самолет", "Управлять штурвалом")
    }
}