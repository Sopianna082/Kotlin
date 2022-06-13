/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Unit return can be omitted
 */

//Jenis function adalah function tanpa pengembalian yang ditandai dengan "unit"
//Tetapi keyword unit dapat juga dihilangkan tanpa menghilangkan arti yang berbeda
fun printSum2(a:Int, b:Int){
    println("sum of $a and $b is ${a+b}")
}

fun main() {
    printSum2(-1, 8)
}