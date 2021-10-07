package Kotlin.Collections

import kotlin.math.abs

fun main(args : Array<String>){
    val numbers : List<Int> = listOf(1, -2, 3, -4, 5, -6)

    // ------------- MAP -------------------
    // ----------- RETURNS COLLECTION --------
    // Double every element
    val doubled : List<Int> = numbers.map { x -> x * 2 }

    // Triple every element
    val tripled  : List<Int> = numbers.map { it * 3 }


    // ------------- FILTER -----------------
    // ----------- RETURNS COLLECTION --------
    val evenNumbers : List<Int> = numbers.filter {
        // Parameter (optional, can be referenced as it)
            x ->
        // Filter condition which returns a boolean
        x%2==0
    }

    val evenNumbers1 : List<Int> = numbers.filter {
        it%2==0
    }

    // --------------- ANY ----------------
    // ----------- RETURNS BOOLEAN --------

    val anyNegative : Boolean = numbers.any { it < 0 }

    val anyGT6 : Boolean = numbers.any { it > 6 }

    // ---------------- ALL ------------------
    // ----------- RETURNS BOOLEAN --------

    val allEven : Boolean = numbers.all { it % 2 == 0 }

    val allLess6 : Boolean = numbers.all { it < 6 }

    // --------------- NO -------------------
    // ----------- RETURNS BOOLEAN --------

    val allEven1 = numbers.none { it % 2 == 1 }

    val allLess62 = numbers.none { it > 6 }

    val words :List<String> = listOf("Lets", "find", "something", "in", "collection", "somehow")

    // -------------- FIND --------------------
    // ------------ RETURNS FIRST ELEMENT -----------
    val first : String? = words.find { it.startsWith("some") }

    // -------------- FIND LAST --------------------
    // ------------ RETURNS LAST ELEMENT -----------
    val last : String? = words.findLast { it.startsWith("some") }

    // -------------------- FIRST ------------------
    // ------------ RETURNS FIRST ELEMENT -----------
    val first1 :Int = numbers.first()
    val first2 = numbers.first { it%2 ==0 }

    // -------------------- LAST ------------------
    // ------------ RETURNS LAST ELEMENT -----------
    val last1 :Int  = numbers.last()
    val last2 = numbers.last { it%2 ==0 }

    // ------------FIRST OR NULL -------------
    // ------------RETURNS FIRST ELEMENT -------------
    val first3 = words.firstOrNull()
    val first4 = words.firstOrNull { it.startsWith('f') }

    // ------------LAST OR NULL -------------
    // ------------RETURNS LAST ELEMENT -------------
    val last3 = words.lastOrNull()
    val last4 = words.lastOrNull { it.startsWith('f') }

    // ------------ COUNT -------------------
    // ----------- RETURNS COUNT -----------
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }

    // ------------- PARTITION ----------------
    // -------- RETURNS PAIR OF COLLECTION --------
    val evenOdd :Pair<List<Int>,List<Int>> = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }

    // ----------- FLAT MAP -------------------
    // ---------RETURNS COLLECTION ------------

    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothesBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
    val flatMapBag1 = cart.flatten()

    println(cart)
    // [[apple, orange, banana, grapes], [shirts, pants, jeans]]
    println(flatMapBag)
    // [apple, orange, banana, grapes, shirts, pants, jeans]

    // ----------- MAX OR NULL -----------
    // --------- RETURNS SINGLE ELEMENT -------
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()

    // ------------ SORTED/SORTBY -------------
    // ------------ RETURNS COLLECTION --------
    val sortedList = numbers.sorted()
    val sortbyList = numbers.sortedBy { -it }
    val sortDesending = numbers.sortedDescending()
    val sortByDesending = numbers.sortedByDescending { abs(it) }

    // ------------- ZIP ----------------------
    // --------- RETURNS COLLECTION -----------
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }

    // ---------- GET OR ELSE ------------------
    // --------- RETURNS SINGLE ELEMENT --------

    //getOrElse provides safe access to elements of a collection.
    // It takes an index and a function that provides the default value in
    // cases when the index is out of bound.

    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })
}