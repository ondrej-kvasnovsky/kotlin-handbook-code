package handbook.basics

data class Human(val name: String, val age: Int)

fun main(args: Array<String>) {
    val h1 = Human("Jimmy", 24)
    val h2 = Human("Jimmy", 24)
    println(h1)
    println(h1.equals(h2))
    println(h1.hashCode())
    println(h2.hashCode())

    val h3 = h1.copy()
    println(h3)

    val (name, age) = h3
    println(name)
    println(age)

    val set = hashSetOf(h1, h2, h3)
    println(set)
}