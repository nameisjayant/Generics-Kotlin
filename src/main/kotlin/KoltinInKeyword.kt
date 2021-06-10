
/*
if you want to assign any supertype value to subtype then `in` keyword comes as a
solution..
 */
class ParamerterizedConsumer<in T>{

    fun getName(name:T):String = name.toString()
    fun getValue(value:T):String = value.toString()
}

fun main(){
    val paramerterizedConsumer = ParamerterizedConsumer<Any>()
    val ref : ParamerterizedConsumer<String> = paramerterizedConsumer
    val ref1 : ParamerterizedConsumer<Double> = paramerterizedConsumer
    println(ref.getName("jayant"))
    println(ref1.getValue(12.090))
}
/*
If the type T in the ParameterizedCounsumer will not be the in type,
 the given statement will produce a compiler error.

 */