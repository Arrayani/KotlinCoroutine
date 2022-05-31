
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

//suspend fun main(){
fun main(){
    println("Main program Starts: ${Thread.currentThread().name}")

//    thread {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Fake work ends: ${Thread.currentThread().name}")
//    }
    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendFunc(1000)
        println("Fake work ends: ${Thread.currentThread().name}")
    }
    //Thread.sleep(2000 )
    runBlocking {
    delay(2000)
    }
    println("Main program Ends: ${Thread.currentThread().name}")

}

suspend fun mySuspendFunc(time:Long){
    delay(time)
}