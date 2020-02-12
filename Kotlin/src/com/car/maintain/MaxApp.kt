package com.car.maintain

fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0
    for(item in this){
        if(item > maxNumber){
            maxNumber = item
        }
    }
    return maxNumber
}

fun main(){
    val listOfElements = arrayListOf<Int>()
    listOfElements.add(12)
    listOfElements.add(1)
    listOfElements.add(3)
    listOfElements.add(7)
    for(item in listOfElements){
        println(item)
    }
    println("Max Element: ${listOfElements.findMax()}")
}