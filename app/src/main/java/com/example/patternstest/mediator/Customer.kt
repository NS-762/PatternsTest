package com.example.patternstest.mediator

import android.util.Log

class Customer(val managerMediator: ManagerMediator): Participant {


    override fun send(message: String) {
        managerMediator.send(message, this)
    }

    override fun get(message: String) {
        Log.e("message", "Заказчик получил сообщение: $message")
    }
}