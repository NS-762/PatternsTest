package com.example.patternstest.builder

abstract class BreadBuilder {
    lateinit var bread: Bread
    private set

    fun createBread() {
        bread = Bread()
    }

    abstract fun addFlour()
    open fun addSugar() {}
}