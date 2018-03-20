package handbook.io

import java.io.File

fun main(args: Array<String>) {
    File("src/main/resources/handbook/io/file.txt").forEachLine {
        println(it)
    }
}