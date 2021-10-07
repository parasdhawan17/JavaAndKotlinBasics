package Kotlin

fun main(args :Array<String>){

    // LIST is an interface

    val list : List<String> = listOf<String>("asd","asd","asd")
    // Immutable list
    // list.add not available

    val mutableList : MutableList<String> = mutableListOf<String>("asd","Asda","asd")
    // Mutable list
    mutableList.add("asddsa")

    // Create an empty list
    val emptyList = emptyList<String>()
    val emptyList1 = listOf<String>()
    val emptyList2 = mutableListOf<String>()

    // ArrayList is the implementation of the interface LIST
    val arrayList = ArrayList<String>()
    arrayList.add("123123")

    val arrayList1 : ArrayList<String> = arrayListOf<String>()
    arrayList1.add("asd")

    // Iterate a list
    mutableList.forEach {
        println(it)
    }
    list.forEach {
        println(it)
    }
    arrayList.forEach {
        println(it)
    }

    // Check if list contains an element
    list.contains("asda")
    mutableList.contains("asd")
    arrayList.contains("asd")
}