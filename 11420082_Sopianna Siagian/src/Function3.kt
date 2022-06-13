/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function returning no meaningful value
 */

//Function ini tanpa pengembalian nilai ditandai dengan menggunakan "unit"
//Menggunakan string template dan memiliki 2 parameter
fun printSum(a: Int, b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}

fun main() {
    printSum(-1, 8)
}