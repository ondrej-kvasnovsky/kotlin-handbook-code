package handbook.basics

class Stack<T>(vararg items: T) {
    private val values = items.toMutableList()
    fun push(item: T) {
        values.add(item)
    }

    fun pop(): T? {
        if (values.isNotEmpty()) {
            val size = values.size
            return values.removeAt(size - 1)
        }
        return null
    }
}

fun <T> stackOf(vararg items: T): Stack<T> {
    return Stack(*items) // * is spread operator
}

fun main(args: Array<String>) {
    val stack = stackOf(1, 2)
    stack.push(3)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    // Queue
    val queue = queueOf(1, 2)
    queue.enqueue(3)
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
}

class Queue<T>(vararg items: T) {
    private val values = items.toMutableList()
    fun enqueue(item: T) {
        values.add(item)
    }

    fun dequeue(): T? {
        if (values.isNotEmpty()) {
            return values.removeAt(0)
        }
        return null
    }
}

fun <T> queueOf(vararg items: T): Queue<T> {
    return Queue(*items) // * is spread operator
}