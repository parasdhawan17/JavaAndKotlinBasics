package Kotlin.Delegates

class LazySample {
    init {
        println("created!")            // 1
    }

    // can use blockingLazy for thread safety
    val lazyStr: String by lazy {
        println("computed!")          // 2
        "my lazy"
    }
}

fun main() {
    val sample = LazySample()         // 1
    println("lazyStr = ${sample.lazyStr}")  // 2
    println(" = ${sample.lazyStr}")  // 3
}