package com.example.patternstest.factoryMethod

import android.util.Log

class WoodHouse: House {
    override fun destroy() {
        Log.e("destroy", "destroy woodHouse")
    }
}