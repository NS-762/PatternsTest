package com.example.patternstest.mediator

interface Participant {

    fun send(message: String)
    fun get(message: String)
}