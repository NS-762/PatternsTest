package com.example.patternstest.prototype

import android.util.Log

class Cat(private val name: String, private val age: Int, private val color: String): Clonable {

    override fun clone(): Any {
        return (Cat(name, age, color) as Cat)
    }

    fun displayData() {
        Log.e("Cat", "$name, $age, $color")
    }
}