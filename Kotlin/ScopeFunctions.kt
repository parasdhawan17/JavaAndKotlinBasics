package Kotlin

var str : String? = null

data class Person(val name : String,val age :Int){
    fun isAged() : Boolean{
        return age>40
    }
}

fun main(varargs : Array<String>){

    // LET OPERATOR
    // CAN BE USED WITH IT

    str?.let{
        val a = it.toCharArray()
        print(a)
    }

    // RUN OPERATOR
    // CAN BE USED WITH THIS or without this

    str?.run{
        val a = toCharArray()
    }


    // WITH OPERATOR

    val person = Person("Paras",28)

    with(person){
        val isAged = isAged()
    }

    // APPLY OPERATOR
    val string = "Hello".apply{
        substring(0,3)
    }

    // ALSO OPERATOR
    val jake = Person("Jake", 30,)
        .also {
            val personCopy = it.copy()
            person
        }
}