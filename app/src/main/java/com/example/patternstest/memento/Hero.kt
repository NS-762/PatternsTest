package com.example.patternstest.memento

import android.util.Log

class Hero {

    private var patrons = 10

    fun shoot() {
        if (patrons > 0) {
            patrons--
            Log.e("Hero", "Сделан выстрел. Осталось патронов: $patrons")
        } else {
            Log.e("Hero", "Нет патронов")
        }
    }

    fun saveState(): HeroMemento {
        Log.e("Hero", "Сохранение состояния")
        return HeroMemento(patrons)
    }

    fun restoreState(heroMemento: HeroMemento) {
        patrons = heroMemento.patrons
        Log.e("Hero", "Восстановление состояния. Осталось патронов: $patrons")
    }
}