/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : top-level variables
 */

//variable ini bersifat global
val PI = 3.14
var x = 0

fun incrementX(){
    //Nilai dapat diubah karena menggunakan "var"
    x += 1
}

fun main() {
    println("x = $x, PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")

    //Dari hasil yang dijalankan
    //bahwa nilai PI tidak akan berubah, bersifat tetap
    //semnetara x berubah dengan function incrementX()
}