package com.example.patternstest.factory_method

import android.util.Log

class PanelHouse: House {
    override fun destroy() {
        Log.e("destroy", "destroy panelHouse")
    }
}