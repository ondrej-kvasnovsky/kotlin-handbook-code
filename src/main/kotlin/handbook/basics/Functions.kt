package handbook.basics

fun main(args: Array<String>) {
    println(enhance("kotlin"))
}

fun enhance(text: String) : String {
    var result = ""
    for (letter in text) {
        result += letter.toUpperCase() + " "
    }
    return result
}