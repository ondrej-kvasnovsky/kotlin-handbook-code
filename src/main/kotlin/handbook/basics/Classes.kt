package handbook.basics

class Car(val color: String) {
    private val otherColor: String

    init {
        println("object is being created")
        otherColor = color
    }

    var name = ""
    var running = false

    fun startEngine(remote: Boolean) {
        println("Starting (remote $remote): $name, $color vrum vruuum")
        running = true
    }

    fun isRunning() = running
}

fun main(args: Array<String>) {
    val car = Car("Metalic Gray")
    car.name = "Mustang"
    println(car.color)
    println(car.name)

    car.startEngine(remote = true)
    println(car.isRunning())
}
