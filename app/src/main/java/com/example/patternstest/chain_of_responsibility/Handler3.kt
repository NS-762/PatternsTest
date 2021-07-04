package com.example.patternstest.chain_of_responsibility

class Handler3: Handler {

    private lateinit var nextHandler: Handler
    private var isAdmin = true //"Пользователь найден в списке администраторов"

    override fun setNextHandler(handler: Handler) {
        nextHandler = handler
    }

    override fun checkData(email: String, password: String): String {
        val result: String
        if (isAdmin) {
            result = "Тип пользователя - администратор"
        } else {
            result = "Тип пользователя - сотрудник"
        }
        return result
    }
}