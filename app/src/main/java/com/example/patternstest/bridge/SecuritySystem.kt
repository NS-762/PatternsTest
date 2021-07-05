package com.example.patternstest.bridge

import android.util.Log

class SecuritySystem(developer: Developer): Project(developer) {
    override fun createProject() {
        Log.e("Project", "Create security system project")
        developer.writeCode()
    }
}