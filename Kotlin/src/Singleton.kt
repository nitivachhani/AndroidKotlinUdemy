class Singleton{
    var name:String?=null
    private constructor(){
        println("Instance is created")
    }

    companion object{
        val instance:Singleton by lazy { Singleton()}
    }
}

fun main(args:Array<String>){

    var s1 = Singleton.instance
    s1.name = "Niti"
    println(s1.name)

    var s2 = Singleton.instance
    // No name assigned
    println(s2.name)

    var s3 = Singleton.instance
    // No name assigned
    println(s3.name)
    s3.name = "Kevin"
    println(s3.name)

}