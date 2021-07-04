package com.example.patternstest.state

interface WaterState {
    fun frost(water: Water)
    fun heat(water: Water)
}