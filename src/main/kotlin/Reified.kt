import java.util.logging.Logger

inline fun <reified T> Any.isInstanceOf():Boolean = this is T

inline fun <reified T,reified U> haveSameType(first:T,second:U) =
    first is U && second is T


fun main(){
    val isAString  =  "jayant".isInstanceOf<String>()
    println(haveSameType("jayant",12))
}