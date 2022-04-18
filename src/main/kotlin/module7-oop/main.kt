package `module7-oop`

fun main() {

    val ktDev = KotlinDeveloper("Alex", 25)
    val javaDev = JaveDeveloper(name = "Ivan", age = 40, experience = 20)
    val cppDeveloper = CppDeveloper(name = "Anna", age = 30, experience = 7)
    val developer = Developer(name = "MegaMozg", age = 100, experience = 100)
    val scalaDev = ScalaDeveloper(name = "ScalaDeveloper", age = 30, experience = 5)

    ktDev.writeCode()
    println("ktDev level - ${ktDev.getLevel()}")
//    println("experience - ${ktDev.experience}")

    javaDev.writeCode()
    println("javaDev level - ${javaDev.getLevel()}")
//    println("experience - ${javaDev.experience}")

    cppDeveloper.writeCode()
    println("cppDev level - ${cppDeveloper.getLevel()}")
//    println("experience - ${cppDeveloper.experience}")

    developer.writeCode()
    println("developer level - ${developer.getLevel()}")
//    println("experience - ${developer.experience}")

    println("javaDev paradigm - ${javaDev.paradigm}")
    println("scalaDev paradigm - ${scalaDev.paradigm}")

}