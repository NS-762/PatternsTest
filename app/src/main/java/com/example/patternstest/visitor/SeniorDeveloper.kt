package com.example.patternstest.visitor

import android.util.Log

class SeniorDeveloper: Developer {
    override fun create(program: Program) {
        Log.e("Create", "Senior create program")
    }

    override fun create(database: Database) {
        Log.e("Create", "Senior create database")
    }

    override fun create(test: Test) {
        Log.e("Create", "Senior create test")
    }
}