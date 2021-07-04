package com.example.patternstest.proxy

import android.util.Log

class RealTimetableTrains : TimetableTrains {

    var isHaveChanges = true

    override fun loadData() {
        Log.e("Расписание", "Произошло обращение к БД, получено новое расписание")
    }
}