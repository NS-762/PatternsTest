package com.example.patternstest.factory_method

class WoodHouseFactory: HouseFactory {
    override fun createHouse(): House {
        return WoodHouse()
    }
}