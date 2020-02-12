package com.car.maintain

open class CarOptions(){

    var type:String? = null
    var model:Int?=null
    private var price:Double?=null
    var milesDrive:Int? = 0
    var owner:String? = null

    // Constructor
    constructor(type:String, model: Int, price: Double, milesDrive:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }
    constructor(type:String, model: Int, price: Double, milesDrive:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }

    // Methods / FUnctions
    open fun getCarPrice():Double{
        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }

    fun getPrice(): Double? {
        return this.price
    }
}

fun main(){

    val car1 = CarOptions("BMW", 2015, 10000.0, 105, "Niti")
    car1.type = "KIA"
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())
    println(car1.model)

    val car2 = CarOptions("Nissan", 2004, 5000.0, 120)
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())
    println(car2.model)
}