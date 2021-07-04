package com.example.patternstest.composite

import android.util.Log

class File(name: String): Component(name) {

    override fun add(component: Component) {
    }

    override fun remove(component: Component) {
    }

    override fun display() {
        Log.e("component", name)
    }
}