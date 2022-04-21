package `module9-interfaces-and-polymorphism`.lesson1

class SmartFridge : Callable {
    override val vendor: String = "LG"

    override fun call(number: String) {
        println("Hey, my smart fringe calling $number")
    }
}