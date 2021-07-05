package com.example.patternstest.visitor

interface Developer {
    fun create(program: Program)
    fun create(database: Database)
    fun create(test: Test)
}