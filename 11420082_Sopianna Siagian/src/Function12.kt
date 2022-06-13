/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function percabangan when dengan memakai
 * tipe Any yang dapat menambung banyak data
 */

//function dengan percabangan when
//Nilai yang ditampung berbagai varian tipe data karena menggunakan tipe data Any
fun describe(obj: Any):String =
    //Percabangan when ketika nilai dalam parameter yang ditulis sesuai
    //dengan key yang sama akan mengembalikan String yang sesuai
    when (obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}