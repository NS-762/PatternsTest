package com.example.patternstest.template_method

import android.util.Log

class School: Education() {

    override fun enter() {
        Log.e("Learn", "Пойти в первый класс")
    }

    override fun passExams() {
        Log.e("Learn", "Сдать ОГЭ или ЕГЭ")
    }

    override fun getDocument() {
        Log.e("Learn", "Получить аттестат")
    }
}