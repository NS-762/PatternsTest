package com.example.patternstest.command

class Human(private val lightOnCommand: LightOnCommand, private val lightOffCommand: LightOffCommand) {

    fun lightOn() {
        lightOnCommand.execute()
    }

    fun lightOff() {
        lightOffCommand.execute()
    }
}