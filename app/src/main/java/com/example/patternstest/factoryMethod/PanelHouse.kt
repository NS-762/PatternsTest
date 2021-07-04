package com.example.patternstest.factoryMethod

import android.util.Log

class PanelHouse: House {
    override fun destroy() {
        Log.e("destroy", "destroy panelHouse")
    }
}