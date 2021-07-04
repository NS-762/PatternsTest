package com.example.patternstest.flyweight

class HouseTypeFactory {

    private var houseTypes: MutableMap<String, HouseType> = mutableMapOf()

    fun getHouseType(descriptionHouse: String, material: String, stages: Int): HouseType {
        var houseType = houseTypes.get(descriptionHouse)
        if (houseType == null) {
            houseType = HouseType(material, stages)
            houseTypes.put(descriptionHouse, houseType)
        }
        return houseType
    }
}