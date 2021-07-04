package com.example.patternstest.factoryMethod

class PanelHouseFactory : HouseFactory {
    override fun createHouse(): House {
        return PanelHouse()
    }
}