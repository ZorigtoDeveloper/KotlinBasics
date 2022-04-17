package `module7-oop`

/*
наследоваться можно только от открытых классов, чтобы сделать класс открытым,
необходимо установить ему модификатор open.
 */
open class Person(val name: String, val age: Int ) {

    fun walk() = println("walking")
    fun eat() = println("eating")
    fun sleep() = println("sleeping")

}