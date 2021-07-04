package com.example.patternstest.state

import android.util.Log

class GasState: WaterState {
    override fun frost(water: Water) {
        Log.e("WaterState", "Пар -> вода")
        water.waterState = LiquidState()
    }

    override fun heat(water: Water) {
        Log.e("WaterState", "Пар -> дополнительное нагревание пара")
    }
}