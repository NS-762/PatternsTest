package com.example.patternstest.strategy

import android.util.Log

class PetrolMove: Movable {
    override fun move() {
        Log.e("Move", "Ехать на бензине")
    }
}