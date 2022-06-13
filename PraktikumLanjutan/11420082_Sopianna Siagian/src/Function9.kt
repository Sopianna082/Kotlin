/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

/**
 * Map
 * Collection yang dapat menyimpan data dengan format key-value
 * */

fun main() {
    //Penentuan dalam "key1" to 1
    //key => "key1" ; value => 1
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}") //Akan menampilkan keynya saja
    println("All values: ${numbersMap.values}") //Akan menampilkan nilainya saja
    if ("key2" in numbersMap) println("Values by key \"key2\": ${numbersMap["key2"]} ") //Mengambil hanya nilai dari key2
    if (1 in numbersMap.values) println("The value 1 is in the map") //Jika ada nilai/value 1 akan memprintln
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") //same as previous
}