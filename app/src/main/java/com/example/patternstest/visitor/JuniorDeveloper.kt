package com.example.patternstest.visitor

import android.util.Log

class JuniorDeveloper: Developer {
    override fun create(program: Program) {
        Log.e("Create", "Junior create program")
    }

    override fun create(database: Database) {
        Log.e("Create", "Junior create database")
    }

    override fun create(test: Test) {
        Log.e("Create", "Junior create test")
    }
}