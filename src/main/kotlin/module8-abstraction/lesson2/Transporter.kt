package `module8-abstraction`.lesson2

abstract class Transporter(
    val maxWeight: Int,

) {
    abstract val capacity: Int
    abstract fun move()
}