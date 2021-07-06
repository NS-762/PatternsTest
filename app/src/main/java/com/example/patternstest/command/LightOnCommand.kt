package com.example.patternstest.command

class LightOnCommand(lamp: Lamp): Command(lamp) {
    override fun execute() {
        lamp.on()
    }
}