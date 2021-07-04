package com.example.patternstest.state

import android.util.Log

class LiquidState: WaterState {
    override fun frost(water: Water) {
        Log.e("WaterState", "Вода -> лед")
        water.waterState = SolidState()
    }

    override fun heat(water: Water) {
        Log.e("WaterState", "Вода -> Пар")
        water.waterState = GasState()
    }
}