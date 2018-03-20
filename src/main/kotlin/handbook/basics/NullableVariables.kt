package handbook.basics

fun main(args: Array<String>) {
    // we can assign null to non type variable
    var n = null
    println(n)

    // or to typed variable but with ? after type declaration
    var nullable:String? = null
    println(nullable?.length)

    println(nullable!!.length)
}