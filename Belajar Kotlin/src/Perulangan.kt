/**
 * Perulangan ada for loop, while loop, do while loop
 */

fun main() {
    for (i in 1..10){
        println("Number $i")
    }

    val mataKuliah = arrayOf("PAM", "PBO", "Probstat")
    for (mk in mataKuliah){
        println(mk)
    }
    println(mataKuliah[2])

    //while loop
    var number = 0
    while (number < 5){
//        println(number);
//        println(++number)
        println(number++)
    }

    //Do while loop
    var angka = 1
    do {
        println(angka++)
    }while (angka <= 5)
}