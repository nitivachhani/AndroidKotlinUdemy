

class thread: Thread {
    var threadName:String = ""
    constructor(threadName:String):super(){
        this.threadName = threadName
        println("Name of thread: $threadName")
    }
    override fun run(){
        // Write code - Runs synchronously
        var count=0
        while(count < 10){
            println("$threadName Count: $count")
            count++
            try{
                Thread.sleep(1000)
            }catch(ex:Exception){
                print(ex.message)
            }
        }
    }
}

fun main(args:Array<String>){
    var t1 = thread("thread1")
    // t1.run() -> call the function. Not start the thread
    // Start the thread
    t1.start()
    //println("${t1.threadName} is running")

    var t2 = thread("thread2")
    t2.start()
    //println("${t2.threadName} is running")

    var t3 = thread("thread3")
    t3.start()
    // Wait in join line. Let the t3 thread complete before executing next lines of code
    t3.join()
    println("Threads are running")
    //println("${t3.threadName} is running")
}