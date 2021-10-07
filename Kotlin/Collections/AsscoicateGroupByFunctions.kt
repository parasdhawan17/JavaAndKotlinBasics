package Kotlin.Collections

fun main(varags : Array<String>){
    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))


    // CREATE MAP OF key, last object
    val phoneBook :Map<String,Person> = people.associateBy { it.phone }

    val cityBook :Map<String,String> = people.associateBy(Person::phone, Person::city)

    val lastPersonCity :Map<String,String> = people.associateBy(Person::city, Person::name)


    // CREATE MAP OF key, all objects
    val peopleCities :Map<String,List<String>>  = people.groupBy(Person::city, Person::name)

}