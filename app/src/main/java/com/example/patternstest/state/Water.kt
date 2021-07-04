package com.example.patternstest.state

class Water(var waterState: WaterState) {

    fun frost() {
        waterState.frost(this)
    }

    fun heat() {
        waterState.heat(this)
    }
}