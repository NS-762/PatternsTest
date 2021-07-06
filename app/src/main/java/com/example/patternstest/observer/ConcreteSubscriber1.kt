package com.example.patternstest.observer

import android.util.Log

class ConcreteSubscriber1: Subscriber {

    override fun update() {
        Log.e("ConcreteSubscriber1", "Пришло уведомление от издателя")
    }
}