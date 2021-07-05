package com.example.patternstest.bridge

import android.util.Log

class JavaDeveloper: Developer {
    override fun writeCode() {
        Log.e("Developer", "Java developer write code")
    }
}