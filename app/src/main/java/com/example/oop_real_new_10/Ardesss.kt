package com.example.oop_real_new_10

class Ardesss(val name: String, val street: String, val numberHouse: Int) {
    operator fun component1() = name
    operator fun component2() = street
    operator fun component3() = numberHouse

    fun copy(name: String = this.name, street: String = this.street, numberHouse: Int = this.numberHouse): Ardesss {
        return Ardesss(name, street, numberHouse)
    }
}