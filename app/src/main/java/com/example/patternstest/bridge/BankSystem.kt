package com.example.patternstest.bridge

import android.util.Log

class BankSystem(developer: Developer): Project(developer) {

    override fun createProject() {
        Log.e("Project", "Create bank system project")
        developer.writeCode()
    }
}