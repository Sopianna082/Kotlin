/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function with collection (List) yang bersifat mutable
 */

fun main() {
    //Menggunakan for dalam menampilkan data dalam list
    //Nilai yang ditampilkan tanpa adanya index yang tampil
    val items = listOf("apple", "banana", "kiwitfruit")
    for (item in items){
        println(item)
    }

    //or
    //NIlai yang ditampilkan adanya index setiap nilai yang disimpan dalam list
    val items2 = listOf("apple", "banana", "kiwitfruit")
    for (index in items2.indices){
        println("item at $index is ${items2[index]}")
    }

    //Menggunakan while dalam menampilkan nilainya
    val items3 = listOf("apple", "banana", "kiwitfruit")
    var index = 0
    while (index < items3.size){
        println("item at $index is ${items3[index]}")
        index++
    }
}