package com.car.maintain

// Interface
interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCard{
    override fun score(age: Int) {
        if(age>50){
            println("Negative")
        }else{
            println("Positive")
        }
    }
}

class VisaCard(override val cardNumber: String) :CreditCard{
    override fun score(age: Int) {
        if(age>60){
            println("Negative")
        }else{
            println("Positive")
        }
    }
    fun print(){
        println("Hello")
    }
}

// Delegation
class PayPal(client:CreditCard):CreditCard by client{
    fun print(){
        println(this.cardNumber)
    }
}

fun main(){
    val visa = VisaCard("676763767234")
    visa.score(60)

    val masterCard = MasterCard("7676342394")
    masterCard.score(60)

    val payPal1 = PayPal(masterCard)
    println("Card Number PayPay: ${payPal1.cardNumber}")
    payPal1.print()

    val payPal2 = PayPal(visa)
    println("Card Number PayPay: ${payPal2.cardNumber}")
    payPal2.print()
}