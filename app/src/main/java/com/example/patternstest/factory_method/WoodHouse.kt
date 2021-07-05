package com.example.patternstest.factory_method

import android.util.Log

class WoodHouse: House {
    override fun destroy() {
        Log.e("destroy", "destroy woodHouse")
    }
}