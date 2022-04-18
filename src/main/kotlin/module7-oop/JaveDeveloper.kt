package `module7-oop`

class JaveDeveloper : Developer {
    constructor(name:String, age: Int) : super(name, age)
    constructor(name: String, age: Int, experience: Int) : super(name, age, experience)

    override fun writeCode() {
        println("java developer writing java code")
    }
}