package com.example.patternstest.command

class LightOffCommand(lamp: Lamp): Command(lamp) {
    override fun execute() {
        lamp.off()
    }
}