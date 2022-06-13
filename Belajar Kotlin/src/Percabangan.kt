/**
 * Karena kotlin berjalan di atas JVM, maka harus menginstal Java environment
 *
 * Percabagan ada 2:
 * 1. if else
 *
 * 2. When
 */

fun main() {
    val numSatu = 1
    val numDua = 3

    //if else
    if (numSatu>numDua){
        println("Benar bahwa nilai 40 lebih besar dari 3");
    }else{
        println("Salah")
    }

    //when
    when(numDua){
        2 -> println("Angka 2");
        3 -> println("Angka 3")
        else -> println("Bukan angka")
    }
}