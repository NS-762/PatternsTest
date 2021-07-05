package com.example.patternstest.bridge

import android.util.Log

class CppDeveloper : Developer {
    override fun writeCode() {
        Log.e("Developer", "Cpp developer write code")
    }
}