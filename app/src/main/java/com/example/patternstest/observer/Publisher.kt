package com.example.patternstest.observer

class Publisher {
    private val listSubscribers = mutableListOf<Subscriber>()

    fun add(subscriber: Subscriber) {
        listSubscribers.add(subscriber)
    }

    fun remove(subscriber: Subscriber) {
        listSubscribers.remove(subscriber)
    }

    fun notifySubscribers() {
        listSubscribers.forEach { it.update()}
    }
}