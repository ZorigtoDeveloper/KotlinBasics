package `module8-abstraction`.lesson2

fun main() {
//    val transporter = Transporter(1000)
    val train = Train(10000)
    println("capacity - ${train.capacity}")
    train.move()
}