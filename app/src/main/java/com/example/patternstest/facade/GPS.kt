package com.example.patternstest.facade

class GPS(val powerSystem: PowerSystem, val geolocationSystem: GeolocationSystem,
          val roadAdvisiorSystem: RoadAdvisiorSystem) {

    fun activate() {
        powerSystem.on()
        geolocationSystem.on()
        roadAdvisiorSystem.on()
    }

}