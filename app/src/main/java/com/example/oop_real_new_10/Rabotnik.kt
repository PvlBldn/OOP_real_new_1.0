package com.example.oop_real_new_10

import java.util.Calendar

class Rabotnik(val name: String, val post: String, val yearStart: Int) {

    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearStart

    fun work(){
        println("working..")
    }
}