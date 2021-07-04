package com.example.patternstest.adapter

class AdapterForeignCarToRus(val foreignCar: ForeignCar): RusCar {

    override fun basicLightOn() {
        foreignCar.xenonOn()
    }
}