package com.example.patternstest.builder

import android.util.Log

class Director {

    private lateinit var breadBuilder: BreadBuilder

    fun orderBread(typeBread: String): Bread {
        if (typeBread == "Белый") {
            breadBuilder = WhiteBreadBuilder()
            breadBuilder.createBread()
            breadBuilder.addFlour()
            breadBuilder.addSugar()
        } else if (typeBread == "Ржаной") {
            breadBuilder = RyeBreadBuilder()
            breadBuilder.createBread()
            breadBuilder.addFlour()
        }

        Log.e("Bread", "Тип хлеба: $typeBread, \nМука: ${breadBuilder.bread.flour}, " +
                "\nСахар: ${breadBuilder.bread.sugar}")
        return breadBuilder.bread
    }
}