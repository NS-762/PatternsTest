package com.example.patternstest.factoryMethod

class WoodHouseFactory: HouseFactory {
    override fun createHouse(): House {
        return WoodHouse()
    }
}