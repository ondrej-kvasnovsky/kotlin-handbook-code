package handbook.basics

object Cache {
    val values = HashMap<String, String>()
    fun put(key: String, value: String) {
        // do it here
        values.put(key, value)
    }

    fun get(key: String): String? {
        return values.get(key)
    }

    fun clear() {
        values.clear()
    }
}

fun main(args: Array<String>) {
    val cache = Cache
    Cache.put("item1", "value1")
    println(Cache.get("item1"))
}