package Kotlin

fun main(varargs : Array<String>){
    (1..10).reduce { sum, element -> sum+element }

    arrayListOf(1,2,3,7,10).maxOrNull()
}