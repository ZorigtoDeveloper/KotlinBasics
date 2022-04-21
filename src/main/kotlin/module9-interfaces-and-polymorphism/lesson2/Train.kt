package `module9-interfaces-and-polymorphism`.lesson2

class Train(maxWeight: Int) : Transporter(maxWeight) {

    override val capacity: Int = 0


    override fun move() {
        println("Train moving on rails")
    }
}