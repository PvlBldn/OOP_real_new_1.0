package com.example.oop_real_new_10

class cat(val name: String, var age: Int, val weight: Float = 0f) {

    val isOldd = age >= 12 // Свойство функции есть геетер, но нет сеттера(т.к вал)

    val isOld: Boolean
    get() = age >=12   // переменная, когда надо переназначить значение, если нет, то просто через свойство

    fun printInfo() {
        println("Name: $name, Age: $age, Weight: $weight")
    }

    fun oldOrNot() = age >= 12
}