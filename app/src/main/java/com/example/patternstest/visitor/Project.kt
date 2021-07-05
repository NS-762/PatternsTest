package com.example.patternstest.visitor

class Project {

    var listProjectElements = mutableListOf<ProjectElement>(Program(), Database(), Test())

    fun create(developer: Developer) {
        listProjectElements.forEach { it.beWritten(developer) }
    }
}