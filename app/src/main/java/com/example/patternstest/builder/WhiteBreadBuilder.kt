package com.example.patternstest.builder

class WhiteBreadBuilder: BreadBuilder() {

    override fun addFlour() {
        bread.flour = "Мука высшего сорта"
    }

    override fun addSugar() {
        bread.sugar = "Содержит сахар"
    }
}