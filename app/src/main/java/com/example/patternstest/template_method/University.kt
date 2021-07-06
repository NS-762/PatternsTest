package com.example.patternstest.template_method

import android.util.Log

class University: Education() {
    override fun enter() {
        Log.e("Learn", "Поступить на первый курс")
    }

    override fun passExams() {
        Log.e("Learn", "Сдать гос. экзамены")
    }

    override fun getDocument() {
        Log.e("Learn", "Получить диплом")
    }
}