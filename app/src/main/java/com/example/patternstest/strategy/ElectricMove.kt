package com.example.patternstest.strategy

import android.util.Log

class ElectricMove: Movable {
    override fun move() {
        Log.e("Move", "Ехать на электроэнергии")
    }
}