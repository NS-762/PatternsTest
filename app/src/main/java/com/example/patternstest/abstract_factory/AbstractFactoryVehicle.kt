package com.example.patternstest.abstract_factory

interface AbstractFactoryVehicle {
    fun createControlDevice(): ControlDevice
    fun createRideDevice(): RideDevice
}