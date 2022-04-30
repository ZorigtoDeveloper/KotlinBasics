package module10.lesson3

import module10.lesson3.SealedCalss.SealedColor

fun main() {
    val person = Person("name", "lastName")

//    val (name, lastName) = person

    val name = person.component1()
    val lastName = person.component2()

    val map = mutableMapOf(
        1 to "1",
        2 to "2",
        3 to "3"
    )

    for ((key, value ) in map) {
        println("$key - $value")
    }

    Color.WHITE
    Color.WHITE.hex
    Color.WHITE.draw()

    println(Color.values().joinToString(","))
    println(Color.valueOf("RED").hex)

    Color.values().forEach {
        println("${it.name} - ${it.ordinal}")
    }
}

fun switchColor(color: Color) : Color =
    when(color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.RED
        Color.RED -> Color.GREEN
        Color.GREEN -> Color.BLUE
        Color.BLUE -> Color.BLACK
    }

fun switchColor(color: SealedColor) : SealedColor =
    when(color) {
        SealedColor.White -> SealedColor.Black
        SealedColor.Black -> SealedColor.Red
        SealedColor.Red -> SealedColor.Green
        SealedColor.Green -> SealedColor.Blue
        SealedColor.Blue -> SealedColor.Black
        is SealedColor.CustomColor -> SealedColor.CustomColor("#345")
    }