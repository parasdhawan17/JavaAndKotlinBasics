package Kotlin.Collections

import java.util.*
import kotlin.collections.HashSet

fun main(args :Array<String>){
   /* A set is an unordered collection that does not support duplicates.
    For creating sets, there are functions setOf() and mutableSetOf().
    A read-only view of a mutable set can be obtained by casting it to Set.*/

    val set : Set<String> = setOf<String>("asd","Asdas","asdasda")
    // set.add not available

    val mutableSet : MutableSet<String> = mutableSetOf("asdasd","asdasd","adasdasd")
    val isElementAdded = mutableSet.add("asdasd")
    // isElementAdded false if element is already there

    // Creating an empty set
    val emptySet = emptySet<String>()
    val emptySet1 = setOf<String>()
    val emptySet2 = mutableSetOf<String>()


    // Hashset mutable by default
    val hasSet = HashSet<String>()
    val hasSet1 = hashSetOf<String>()
    hasSet.add("123")

    // Treeset mutable by default
    val treeSet = TreeSet<String>()
    treeSet.add("123123")

    // Iterate a set
    set.forEach {
        println(it)
    }
    mutableSet.forEach {
        println(it)
    }
    hasSet.forEach {
        println(it)
    }

    // check if set contains an element
    set.contains("asdas")
    mutableSet.contains("Asd")
    hasSet.contains("Asd")
}