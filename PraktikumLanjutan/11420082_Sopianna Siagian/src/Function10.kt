/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    //Walaupun dalam deklrasi argument dalam parameter tidak berurutan dalam kedua variable
    //Kedua variabel tersebut tetap sama
    //Hal ini ditentukan dari key-value yang sama tetapi acak tidak akan mempengaruhi
    println("The maps are equal: ${numbersMap == anotherMap}")
}