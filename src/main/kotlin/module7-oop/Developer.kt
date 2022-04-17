package `module7-oop`

open class Developer(
    name: String,
    age: Int,
    val experience: Int = 2
): Person(name, age) {

    fun writeCode() = println("programmer writing code")

    fun getLevel() = when (experience) {
        0 -> "intern"
        in 1..2 -> "junior"
        in 3..4 -> "middle"
        in 4..5 -> "senior"
        else -> "leading"
    }
}