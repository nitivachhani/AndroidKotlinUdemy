abstract class CreditCard(){
    fun creditID():String{
        return "12314134132"
    }
    abstract fun newCredit()
}

class UserInfo():CreditCard(){
    fun getInfo():String{
        return creditID()
    }

    override fun newCredit() {
        println("New Card created")
    }
}

fun main(args:Array<String>){

    // Cannot create instance of abstract class
    // var credit = CreditCard()
    // println(credit.creditID())

    var user = UserInfo()
    println(user.getInfo())
}