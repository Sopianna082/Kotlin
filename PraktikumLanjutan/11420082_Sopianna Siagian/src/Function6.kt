/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

/**
 * class yang umumnya digunakan untuk menampung sebuah data
 * class User(val name : String, val age : Int)
 *
 * menggunakan keyword data
 * data class DataUser(val name : String, val age : Int)
 *
 * Tanpa ada keyword "data" akan mengembalikan nilai yakni nama package, nama kelas dan memoryaddress
 */

//data class yang akan menampung data
data class Person(var name: String, var age: Int)

fun main() {
    val bob = Person("Bob", 31) //nilai yang sudah dicantumkan
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)

    //Operasi boolean
    println(people == people2)  //bernilai true karna nilai yang di set sama yakni Adam dan 20
    bob.age = 32
    println(people == people2) //bernilai false karna nilai age sudah diubah
}