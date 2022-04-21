package `module9-interfaces-and-polymorphism`.lesson2

class DeputyID(
    private val number: String
) : Document {
    override fun getStringIdentifier(): String = number

    override fun getType(): String = "Deputy ID"
}