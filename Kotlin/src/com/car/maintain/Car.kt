package com.car.maintain

class Car(var type:String, val model:Int, val price:Double, val milesDrive:Int, val owner:String){
    // COnstructor
    init{
        println("Object class is created")
    }
    // Methods / FUnctions
    fun getCarPrice():Double{
        return this.price - (this.milesDrive.toDouble()*10)
    }
}

fun main(){

    val car1 = Car("BMW", 2015, 10000.0, 105, "Niti")
    car1.type = "KIA"
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())
    println(car1.model)

    val car2 = Car("Nissan", 2004, 5000.0, 120, "Kevin")
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())
    println(car2.model)

    // List of cars

    val listOfCars = arrayListOf<Car>()
    listOfCars.add(Car("BMW", 2015, 10000.0, 105, "Niti"))
    listOfCars.add(Car("Nissan", 2004, 5000.0, 120, "Kevin"))

    for(car in listOfCars){
        println("------------")
        println(car.owner)
        println(car.getCarPrice())
    }
}