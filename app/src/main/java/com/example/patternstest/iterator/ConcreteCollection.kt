package com.example.patternstest.iterator

class ConcreteCollection : IterableCollection {

    private var list = mutableListOf<Int>(1, 2, 3, 4)

    override fun getIterator(): Iterator {
        return ConcreteIterator(list)
    }

    class ConcreteIterator(val list: MutableList<Int>) : Iterator {

        private var index = 0

        override fun hasNext(): Boolean {
            if (index < list.size)
                return true
            else {
                index = 0
                return false
            }
        }

        override fun next(): Any {
            return list[index++]
        }
    }
}