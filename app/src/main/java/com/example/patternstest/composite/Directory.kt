package com.example.patternstest.composite

import android.util.Log

class Directory(name: String): Component(name) {

    private var childrenList = mutableListOf<Component>()

    override fun add(component: Component) {
        childrenList.add(component)
    }

    override fun remove(component: Component) {
        childrenList.remove(component)
    }

    override fun display() {
        Log.e("component", name)
        childrenList.forEach { it.display() }
    }
}