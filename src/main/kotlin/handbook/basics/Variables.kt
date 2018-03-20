package handbook.basics

fun main(args: Array<String>) {
    var variable = "Hi"
    variable = "I can change val variable"
    println(variable)

    val constant = "Constant"
    // constant = "I can't change val, it is constant"
    println(constant)
}