package handbook.basics

interface EarthCompatible {
    var fromInterface: String
    fun someMethod()
    fun defaultMethod() {
        println("Default method called")
    }
}

abstract class Creature : EarthCompatible {
    override var fromInterface: String = "Lets set value in abstract class"
    abstract fun isLiving()
}

open class Animal(open var name: String) : Creature() {
    override fun someMethod() {
        println("Some method called")
    }

    override fun isLiving() {
        println("checking life functions")
    }

    fun doIt() = "$name is doing it"

    open fun ableToOverride() = "I can be overridden"
}

open class Cat(override var name: String) : Animal(name) {
    override final fun ableToOverride(): String {
        return "And I was overridden"
    }
}

fun main(args: Array<String>) {
    val cat: Animal = Cat("Jimmy")
    println(cat.doIt())
    cat.isLiving()
    cat.someMethod()
    println(cat.fromInterface)
    println(cat.ableToOverride())
    cat.defaultMethod()
}