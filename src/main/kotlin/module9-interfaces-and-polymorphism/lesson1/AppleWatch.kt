package `module9-interfaces-and-polymorphism`.lesson1

class AppleWatch : Callable {
    override val vendor: String = "Apple"

    override fun call(number: String) {
        println("smart watches calling $number")
    }
}