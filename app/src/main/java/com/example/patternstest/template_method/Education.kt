package com.example.patternstest.template_method

import android.util.Log

abstract class Education {

    fun learn() {
        enter()
        study()
        passExams()
        getDocument()
    }

    abstract fun enter()
    fun study() {
        Log.e("Learn", "Упорно учиться")
    }
    abstract fun passExams()
    abstract fun getDocument()
}