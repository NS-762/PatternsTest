package com.example.patternstest.builder

class RyeBreadBuilder: BreadBuilder() {

    override fun addFlour() {
        bread.flour = "Ржаная мука"
    }
}