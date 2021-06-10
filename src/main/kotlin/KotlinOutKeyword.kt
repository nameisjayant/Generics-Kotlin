
/*
out is a kotlin keyword , suppose we have a producer class(SomeClass) , which
produces some result of type T , sometimes we want to assign that produced
value to a reference that is of a supertype of T.
 */
class SomeClass<out T>(private val name:T){

    fun getName():T = name
}

fun main(){
    val someClass = SomeClass("jayant")
    val ref:SomeClass<Any> = someClass
    print(ref.getName())
}

/*
If the type T in the class (SomeClass) will not be the out type,
 the given statement will produce a compiler error.
 */