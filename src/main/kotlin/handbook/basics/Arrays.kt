package handbook.basics

fun main(args: Array<String>) {
    val array = arrayOf("1", "2", "3")
    println(array[0])
    array[0] = "100"
    println(array.joinToString { it })

    val mixedValues = arrayOf("string", 1, true)
    println(mixedValues.joinToString { it.toString() })

    val intArray = intArrayOf(1, 2, 3)
    println(intArray.joinToString { it.toString() })

    val string = "some string"
    println(string[0])

    val toBeConnected = intArrayOf(4, 5)
    val connected = intArray + toBeConnected
    println(connected.isEmpty())
    println(connected.size)
    println(connected.contains(1))
    println(connected.joinToString { it.toString() })
}