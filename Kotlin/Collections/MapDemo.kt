package Kotlin.Collections

fun main(args : Array<String>){

    // MAP is an interface

    val map : Map<String,Int> = mapOf<String,Int>("Dhawan" to 2,"Kumar" to 3)
    // map.put not available

    val mutableMap : MutableMap<String,Int> = mutableMapOf("Dhawan" to 2,"Kumar" to 3)
    mutableMap["Paras"] = 23

    val emptyMap = emptyMap<String,Int>()
    val emptyMap1 = mapOf<String,Int>()
    val emptyMap2 = mutableMapOf<String,Int>()

    // HASH MAP is an implementation of the interface MAP

    val hashMap = HashMap<String,Int>()
    val hashMap1 = hashMapOf<String,Int>()
    // Mutable by default
    hashMap["Paras"] = 123

    // Iterate a map
    map.forEach { (key, value) ->
        println("$key : $value")
    }
    mutableMap.forEach { (key, value) ->
        println("$key : $value")
    }
    hashMap.forEach { (key, value) ->
        println("$key : $value")
    }

    // Check if map contains a key
    map.containsKey("key")
    mutableMap.containsKey("key")
    hashMap.containsKey("key")
}