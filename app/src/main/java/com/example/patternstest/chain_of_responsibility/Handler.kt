package com.example.patternstest.chain_of_responsibility

interface Handler {
    fun setNextHandler(handler: Handler)
    fun checkData(email: String, password: String) : String
}