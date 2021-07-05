package com.example.patternstest.visitor

class Database: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }
}