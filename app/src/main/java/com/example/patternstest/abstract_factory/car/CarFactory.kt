package com.example.patternstest.abstract_factory.car

import com.example.patternstest.abstract_factory.AbstractFactoryVehicle
import com.example.patternstest.abstract_factory.ControlDevice
import com.example.patternstest.abstract_factory.RideDevice

class CarFactory: AbstractFactoryVehicle {
    override fun createControlDevice(): ControlDevice {
        return Rudder()
    }

    override fun createRideDevice(): RideDevice {
        return Wheel()
    }
}