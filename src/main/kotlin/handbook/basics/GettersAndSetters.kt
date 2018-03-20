package handbook.basics

open class Person {
    private var reallyInternalVariable = 0 // only class
    protected var onlySubClassesCanAccessThis = 0 // only class and its sub classes
    internal val isInternal = true // can be accessed inside a module
    public val isPublic = true // this one is the default visiblity

    var age: Int = 0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val p1 = Person()
    p1.age = 66
    p1.age = -100
    // p1.reallyInternalVariable = 1000 // not possible
    println(p1.age) // prints 66
    println(p1.isPublic)
}