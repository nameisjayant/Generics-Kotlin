
/*
 star projection(*) , when we don't know about the specific type value , then there
 we can pass (*)
 */

fun printArray(array: Array<*>){
    array.forEach {
        println(it)
    }
}

fun main(){
    printArray(arrayOf(12,34,22,12,"jayant",90.0))
}