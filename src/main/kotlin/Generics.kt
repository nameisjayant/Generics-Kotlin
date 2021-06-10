
data class Course(val name:String)

class OddList<T>(private val list: List<T>){

    fun oddItems():List<T>{
        return list.filterIndexed { index, _ -> index%2 == 1 }
    }
}

fun main(){
    val items = listOf("kotlin","java","python","php")
    val oddList = OddList(items)
    print(oddList.oddItems())

    val intItems = listOf(1,2,3,4,5,6)
    val oddListInt = OddList(intItems)
    print(oddListInt.oddItems())

    val course = listOf(
        Course("kotlin"),
        Course("java"),
        Course("php"),
        Course("python")
    )

    val courseClass = OddList(course)
    print(courseClass.oddItems())
}