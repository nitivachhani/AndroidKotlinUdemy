import java.io.FileReader
import java.io.FileWriter


fun main(args:Array<String>){
    println("1 - Read \n2 - Write")
    val op = readLine()!!.toInt()
    when(op){
        1 -> {
            readFromFile()
        }
        2 -> {
            print("Enter the string to be written to the file: ")
            var str = readLine()!!.toString()
            writeToFile(str)
        }
    }
}

fun writeToFile(str:String) {
    try{
        //FileWriter("test.txt") -> Crete new file
        //FileWriter("test.txt", true) -> Create new file or apend to existingAppend
        val fo= FileWriter("test.txt", true)
        fo.write(str)
        fo.close()
        print("Data is saved to the file")
    }catch(ex:Exception){
        print(ex.message)
    }
}

fun readFromFile(){
    try{
        val fin = FileReader("test.txt")
        var c:Int?
        do{
            c=fin.read()
            print(c.toChar())
        }while(c!=-1)
    }catch (ex:Exception){
        print(ex.message)
    }
}