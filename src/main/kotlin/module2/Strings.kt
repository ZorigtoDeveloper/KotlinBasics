package module2

fun main() {
    val escapedString = "Hello\nWorld"    // перенос строки /n
    println(escapedString)

    val commonString = """Hello
        |kotlin.
        |This is a
        |common string
    """.trimMargin()
    println(commonString)

    val secondChar = commonString[1]
    println(secondChar)

    val hello = "Hello"
    println(hello + "kotlin")    // какатинация строк

    println(hello.toUpperCase())
    println(hello)

    val longString = "The longest string you've ever seen"
    val resultString = "Length of " + "\"" + longString + "\"" + longString.length + " symbols"
    println(resultString)

    val resultString2 = "Length of \"$longString\" - ${longString.length} symbols"
    println(resultString2)

    val str = "Hello kotlin"
    println(str.contains("H"))
    println(str.contains("kotlin"))
    println(str.contains("world"))

    println(str.replace("l", "2"))

    val replaceFirst = str.replaceFirst("Hello", "First")
    println(replaceFirst)

}