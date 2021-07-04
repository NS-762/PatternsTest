package com.example.patternstest.composite

import android.util.Log

abstract class Component(val name: String) {

    abstract fun add(component: Component)
    abstract fun remove(component: Component)
    abstract fun display()
}