/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

fun main() {
    //Manipulasi data dalam Map
    val numbersMap = mutableMapOf("one" to 1, "two" to 2) //Key dan value
    numbersMap.put("three", 3)  //Menambahkan key-value dengan keyword "put"
    numbersMap["one"] = 11 //mengubah nilai key "one"

    println(numbersMap) //perubahan yang dilakukan, akan ditampilkan
}