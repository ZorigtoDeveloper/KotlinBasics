package module10.lesson4

import `module7-oop`.Developer
import `module7-oop`.Person


/*
    Generic или обобщенные типы - классы или интерфейсы, которые могут работать с данными разных типов

 */

fun main() {
//    val list: List<String> = List(5) { "" }
//    val intList = listOf(1, 2, 3, 4)
//
//    println(genericFun(5))
//    println(genericFun("hello"))

//    val object1 = Generic(5)
////    object1.item = 1
//
//    val object2 = Generic("Generic String")
////    object2.item = "Generic String"
//
//    val person = Generic<Person>(Person("Tony", 35))
//    person.setItem(Developer("Developer", 25))

    val first = Generic<Number>(5.0)
    val second = Generic<Number>(10)
    sum(first, second)

}

fun <T> genericFun(input: T) : String {
    return input?.toString() ?: "object is null"
}

fun sum(a: Generic<Number>, b: Generic<Number>) : Int? {
    val first = a.item?.toInt() ?: return null
    val second = b.item?.toInt() ?: return null
    return first + second
}