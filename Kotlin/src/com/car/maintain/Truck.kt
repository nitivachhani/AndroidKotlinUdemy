package com.car.maintain

class Truck:CarOptions{
    var subType:String? = null

    // Constructor
    constructor(type:String, model: Int, price: Double, milesDrive:Int, owner:String, subType:String):
            super(type, model, price, milesDrive, owner){
        this.subType = subType
    }
    constructor(type:String, model: Int, price: Double, milesDrive:Int, subtype:String):
            super(type, model, price, milesDrive){
        this.subType = subType
    }
    override fun getCarPrice():Double{
        return this.getPrice()!! - (this.milesDrive!!.toDouble()*20)
    }

    //fun getCarPriceWrapper():Double{
    //    return super.getCarPrice()
    //}
}

// Extension - Outside the class
fun Truck.getCarPriceWrapper():Double{
    return this.getCarPrice()
}

fun main(){

    val truck1 = Truck("BMW", 2015, 10000.0, 105, "Niti", "Dump")
    truck1.type = "KIA"
    println(truck1.type)
    println(truck1.owner)
    println(truck1.getCarPrice())
    println(truck1.model)
    println(truck1.subType)
    println(truck1.getCarPriceWrapper())

    val truck2 = Truck("Nissan", 2004, 5000.0, 120, "Garbage")
    println(truck2.type)
    println(truck2.owner)
    println(truck2.getCarPrice())
    println(truck2.model)
    println(truck1.subType)
}
