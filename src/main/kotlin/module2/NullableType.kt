package module2

fun main() {
    var number: Int? = null

    var nonNullString: String = "Hello Kotlin"
    var nullableString: String? = null
    var nullableString2: String? = "Hello kotlin 2"
    println(nullableString?.toUpperCase())

    if (nullableString2 != null)
        println(nullableString2?.toUpperCase())
}