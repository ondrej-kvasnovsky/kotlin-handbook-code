package handbook.basics

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    val languages = listOf("Java", "Kotlin")
    for ((index, language) in languages.withIndex()) {
        println("$index $language")
    }
}