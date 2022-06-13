package FirstSopi.DataClass

/** SET
 * Set merupakan objek turunan yang hanya dapat menyimpan nilai yg unik
 * artinya tidak ada data yang sama atau duplikat dalam sebuah collection
 * */

val integerSet = setOf(1, 2, 1, 3, 2, 1, 5)

val setA = setOf(1, 2, 4, 2, 1, 5)
val setB = setOf(1, 2, 4, 5)

val setC = setOf(1, 5, 7)
val union = setA.union(setC)
val intersect = setA.intersect(setC)

fun main() {
    println(integerSet)
    // Dalam list, urutan tidak penting sehingga apabila
    // kita bandingkan dua buah Set yang memiliki nilai
    // yang sama dan urutan yang berbeda, akan tetap dianggap sama.

    println(setA == setB)

    //Ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 buah set
    //Union = gabungan
    //Intersect = irisan
    println(union)
    println(intersect)
}