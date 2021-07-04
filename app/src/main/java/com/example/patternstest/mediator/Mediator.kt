package com.example.patternstest.mediator

interface Mediator {
    fun send(message: String, participant: Participant)
}