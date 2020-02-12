class Outer{
    private val name:String? = null

    inner class Nested{
        fun show(){
            println("Nested")
            println(name)
        }
    }

    var nested = Nested()

}

fun main(args:Array<String>){
    var outer = Outer()
    //var nested = Outer.Nested()
    //nested.show()
}