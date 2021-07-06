package com.example.patternstest.command

abstract class Command(val lamp: Lamp) {
    abstract fun execute()
}