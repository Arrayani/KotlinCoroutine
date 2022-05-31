

import kotlinx.coroutines.*


//suspend fun main(){
fun main()= runBlocking{
    println("Main program Starts: ${Thread.currentThread().name}")

//    thread {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Fake work ends: ${Thread.currentThread().name}")
//    }
    val jobDeferred: Deferred<Int> =async {
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendFunc3(1000)
        println("Fake work ends: ${Thread.currentThread().name}")
        15
    }
    //Thread.sleep(2000 )
//    runBlocking {
//        delay(2000)
//    }
    //async memberikan return value angka 15
    val num:Int=jobDeferred.await()
    //jobDeferred.join()
    println("Main program Ends: ${Thread.currentThread().name}")

}

suspend fun mySuspendFunc3(time:Long){
    delay(time)
}