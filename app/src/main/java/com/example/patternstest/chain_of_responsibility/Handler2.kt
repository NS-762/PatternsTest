package com.example.patternstest.chain_of_responsibility

class Handler2: Handler {
    private lateinit var nextHandler: Handler
    private var isWorker = true //"Пользователь найден в списке сотрудников"

    override fun setNextHandler(handler: Handler) {
        nextHandler = handler
    }

    override fun checkData(email: String, password: String): String {
        val result: String
        if (isWorker) {
            result = nextHandler.checkData(email, password)
        } else {
            result = "Тип пользователя - гость"
        }
        return result
    }
}