package handbook.basics

fun main(args: Array<String>) {
    val list = listOf("hi", "there")
    // list.add("stranger") // not possible
    println(list)

    val arrayList = arrayListOf("well", "that", "is")
    arrayList.add("awesome")
    println(arrayList)

    // connect two lists
    println(list + arrayList)
    println(list + arrayList[0])
}