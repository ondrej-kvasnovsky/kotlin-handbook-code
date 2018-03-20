package handbook.basics

fun main(args: Array<String>) {
    val age = 35
    if (age < 30) {
        println("You are too young, go back by two steps")
    } else {
        println("You are too old, go back by twenty steps")
    }

    when (age) {
        1 -> println("I gone one!")
        35 -> {
            println("Let me think...")
            println("I got 35, oh my god!")
        }
        else -> println("Not sure what is happening right now")
    }

    val result = when (age) {
        35 -> "Hi old man"
        else -> "Whatever..."
    }
    println(result)

    val anotherOne = if (age == 35) {
        "Oh man!"
    } else {
        "Oh boy!"
    }
    println(anotherOne)

    val experiment = when (age) {
        1 * 10 -> "What?"
        in 1..50 -> "You are OK"
        !in 1..50 -> "You are NOT OK"
        else -> "Kind of bad"
    }
    println(experiment)
}