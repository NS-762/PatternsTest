package com.example.patternstest.mediator

import android.util.Log

class Programmer(val managerMediator: ManagerMediator) : Participant {

    override fun send(message: String) {
        managerMediator.send(message, this)
    }

    override fun get(message: String) {
        Log.e("message", "Программист получил сообщение: $message")
    }
}