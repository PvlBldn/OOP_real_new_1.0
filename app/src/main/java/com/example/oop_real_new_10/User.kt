package com.example.oop_real_new_10

class Sobaka {
//     var age: Int = 0
//    set(value) {
//        if(value >= 0) {
//            field = value
//        }
//    }
//     var name: String? = null
//    get() {
//        return if (field == null) {
//            ""
//        } else {
//            field
//        }
//    }
var age: Int = 0
    set(value) {
        if (value >= 0) {
            field = value
        }
    }
    var ves: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var Klichka = ""
        get() = field.toLowerCase().capitalize()

}