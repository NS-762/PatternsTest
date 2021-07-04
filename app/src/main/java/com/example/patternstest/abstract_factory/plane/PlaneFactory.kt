package com.example.patternstest.abstract_factory.plane

import com.example.patternstest.abstract_factory.AbstractFactoryVehicle
import com.example.patternstest.abstract_factory.ControlDevice
import com.example.patternstest.abstract_factory.RideDevice

class PlaneFactory : AbstractFactoryVehicle {
    override fun createControlDevice(): ControlDevice {
        return Helm()
    }

    override fun createRideDevice(): RideDevice {
        return Chassis()
    }
}