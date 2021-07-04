package com.example.patternstest.state

import android.util.Log

class SolidState: WaterState {
    override fun frost(water: Water) {
        Log.e("WaterState", "Лед -> дополнительная заморозка льда")
    }

    override fun heat(water: Water) {
        Log.e("WaterState", "Лед -> вода")
        water.waterState = LiquidState()
    }
}