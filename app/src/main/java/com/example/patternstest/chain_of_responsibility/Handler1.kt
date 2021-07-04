package com.example.patternstest.chain_of_responsibility

class Handler1: Handler {

    private lateinit var nextHandler: Handler
    private var isGuest = true //Пользователь найден в списке зарегестрированных пользователей

    override fun setNextHandler(handler: Handler) {
        nextHandler = handler
    }

    override fun checkData(email: String, password: String) : String{
        val result: String
        if (isGuest) {
            result = nextHandler.checkData(email, password)
        } else {
            result = "Пользователь не зарегестрирован"
        }
        return result
    }
}