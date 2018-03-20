package handbook.basics

fun main(args: Array<String>) {
    val values1 = mapOf(Pair("John", 35), Pair("Jimmy", 25))
    println(values1)

    val values2 = mapOf(
            "John" to 35,
            "Jimmy" to 25
    )
    println(values2)

    println(values2.keys)
    println(values2.values)
    println(values2.entries)

    println(values1 == values2)

    val values3 = mutableMapOf("Josh" to 36)
    values3.putIfAbsent("Peter", 29)
    println(values3)

    println(values3.containsKey("Peter"))
    println(values3.getOrDefault("DoesNotExist", 0))

    values3.entries.forEach {
        println(it)
    }
}