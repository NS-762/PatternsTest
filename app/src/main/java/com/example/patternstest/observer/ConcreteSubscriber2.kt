package com.example.patternstest.observer

import android.util.Log

class ConcreteSubscriber2: Subscriber {
    override fun update() {
        Log.e("ConcreteSubscriber2", "!!!")
        Log.e("ConcreteSubscriber2", "!!!")
    }
}