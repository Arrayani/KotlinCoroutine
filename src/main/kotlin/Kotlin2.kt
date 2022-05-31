

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//suspend fun main(){
 fun main()= runBlocking{
    println("Main program Starts: ${Thread.currentThread().name}")

//    thread {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Fake work ends: ${Thread.currentThread().name}")
//    }
    val job: Job =launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendFunc2(1000)
        println("Fake work ends: ${Thread.currentThread().name}")
    }
    //Thread.sleep(2000 )
//    runBlocking {
//        delay(2000)
//    }
    job.join()
    println("Main program Ends: ${Thread.currentThread().name}")

}

suspend fun mySuspendFunc2(time:Long){
    delay(time)
}