package com.example.patternstest.bridge

abstract class Project(var developer: Developer) {

    abstract fun createProject()
}