package com.example.patternstest.visitor

class Test: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }
}