package com.example.oop_real_new_10
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}

fun main() {
//    val user = User()
//    user.name = null
//    user.age = (15)
//    println("Name ${user.name} age: ${user.age}")

//    val russia = Country("Russia", 144_000_000)
//    println(russia.name)
//    russia.population = 145_000_000

//    val book = Book("dwd", 1002, 19995)

//    val cat = cat("barsik", 2, 334.2f)
//
//    println(cat.isOldd) //  Свойство функции есть геетер, но нет сеттера(т.к вал)
//
//    println(cat.oldOrNot())  // функция
//
//    cat.age = 10
//    println(cat.isOld)  // переменная, когда надо переназначить значение, если нет, то просто через свойство
//
//    fun cat.isOls() = age >= 12 // Extension fun
//
//
//    fun Rabotnik.info(){
//        println("$name, $yearStart, $post, $experience")
//    }


    val student1 = Student("Ivan", "Ivanov", "228")
    val student2 = Student("Ivan", "Ivanov", "228")
    val (name, lastName, id) = student1   // Деструктор или деструктивная операция. Возможна только с data class или
                                          //  переопределить в class (operator fun component1() = name, operator fun component2() = lastName

    val student3 = student1.copy()   // возможен только c data class
    val student4 = student1.copy(id = "2323")
    println(name)
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)











}