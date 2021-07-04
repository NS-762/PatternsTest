package com.example.patternstest.flyweight

import android.util.Log

class HouseType(val material: String, val stages: Int) {

    fun build(x: Int, y: Int) {
        Log.e("Дом", "Построен дом. Кол-во этажей: $stages, материал: $material," +
                " координаты ($x, $y)")
    }
}