/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 * Deskripsi: Operasi yang dapat dilakukan dalam List
 */

fun main() {
    val numbers = listOf("one", "two", "three", "four") //Data yang ditampung dalam list
    println("Number of element: ${numbers.size}") //Operasi dalam mendapatkan size atau jumlah elemen yang ditampung
    println("Third element: ${numbers.get(2)}") //Operasi dalam mendapatkan nilai index kedua dihitung dari index 0
    println("Fourth element: ${numbers[3]}")//Operasi dalam mendapatkan nilai index ketiga dihitung dari index 0
    println("Index of element \"two\" ${numbers.indexOf("two")}") //Mendapatkan index keberapa nilai yang ditentukan
}