package com.example.patternstest.mediator

class ManagerMediator : Mediator {

    lateinit var customer: Customer
    lateinit var programmer: Programmer
    lateinit var tester: Tester

    override fun send(message: String, participant: Participant) {
        when (participant) {
            is Customer -> {
                programmer.get(message)
            }
            is Programmer -> {
                tester.get(message)
            }
            is Tester -> {
                customer.get(message)
            }
        }
    }
}