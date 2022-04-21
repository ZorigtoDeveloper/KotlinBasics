package `module9-interfaces-and-polymorphism`.lesson2

class Passenger(
    val name: String,
    val lastName: String,
    val document: Document,
    val seat: Seat
) {
    fun getInfo() = "$name $lastName with document:\n${document.getType()} - ${document.getStringIdentifier()}"
}