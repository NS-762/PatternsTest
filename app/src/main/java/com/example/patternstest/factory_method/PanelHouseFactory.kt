package com.example.patternstest.factory_method

class PanelHouseFactory : HouseFactory {
    override fun createHouse(): House {
        return PanelHouse()
    }
}