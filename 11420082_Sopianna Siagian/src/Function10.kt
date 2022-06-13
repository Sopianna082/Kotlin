/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Dalam kotlin, bentuk if juga dapat digunakan yang lebih ringkas seperti expression berikut
 */

//Function berikut dituliskan dengan lebih ringkas
fun maxOf2(a: Int, b:Int) = if (a > b) a else b

fun main() {
    println("max of 0 and 42 is ${maxOf2(0, 42)}")
}