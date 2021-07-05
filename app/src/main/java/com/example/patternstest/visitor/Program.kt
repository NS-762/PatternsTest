package com.example.patternstest.visitor

class Program: ProjectElement {

    override fun beWritten(developer: Developer) {
        developer.create(this)
    }
}