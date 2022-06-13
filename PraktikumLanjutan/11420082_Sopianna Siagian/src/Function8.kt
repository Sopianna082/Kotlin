/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

/** SET
 * Set merupakan objek turunan yang hanya dapat menyimpan nilai yg unik
 * artinya tidak ada data yang sama atau duplikat dalam sebuah collection
 * */

fun main() {
    val numbers = setOf(1, 2, 3, 4) //LinkedHashSet is the default implementation
    val numberBackwards = setOf(4, 3, 2, 1)

    // Dalam list, urutan tidak penting sehingga apabila
    // kita bandingkan dua buah Set yang memiliki nilai
    // yang sama dan urutan yang berbeda, akan tetap dianggap sama.

    //Tetapi dalam hal ini, sudah ditentukan first dan last
    println(numbers.first() == numberBackwards.first()) // 1 == 4 => false
    println(numbers.first() == numberBackwards.last()) // 1 == 1 => true
}