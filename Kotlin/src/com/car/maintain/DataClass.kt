package com.car.maintain

data class Person(val name:String, val age:Int, val gender:String)

fun main(){
    val person = Person("Niti", 33, "Female")
    println("Name of person: ${person.name}")
    println("Age of person: ${person.age}")
    println("Gender of person: ${person.gender}")
}