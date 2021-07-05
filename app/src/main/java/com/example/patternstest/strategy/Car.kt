package com.example.patternstest.strategy

class Car(var movable: Movable) {

    fun move() {
        movable.move()
    }
}