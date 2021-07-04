package com.example.patternstest.flyweight

class House(val x: Int, val y: Int, val houseType: HouseType) {

    fun build() {
        houseType.build(x, y)
    }
}