package com.example.patternstest.proxy

import android.util.Log

class ProxyTimetableTrains(val realTimetableTrains: RealTimetableTrains) : TimetableTrains {

    override fun loadData() {
        if (realTimetableTrains.isHaveChanges) {
            realTimetableTrains.loadData()
            realTimetableTrains.isHaveChanges = false
        } else {
            Log.e("Расписание", "В расписании нет изменений")
        }
    }
}