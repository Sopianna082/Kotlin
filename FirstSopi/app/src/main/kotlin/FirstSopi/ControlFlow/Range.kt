package FirstSopi.ControlFlow

/**
 * Range
 * merupakan tipe data yang unik pada kotlin
 * dapat menentukan nilai awal dan nilai akhir pada range
 * Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo()
 * */

//Cara buat range di kotlin

fun main() {
    val rangeInt = 1..10

    //Nilai rangeInt mencakup nilai 1,2,3,4,5,6,7,8,9,10
    //Jarak antara dua nilai yang dicakup ditentukan oleh step
    //secara default step bernilai 1
    println(rangeInt.step)

    //Untuk mengubah nilai dri step bisa dilakukan dengan inisialisasi nilai yg dicakup range itu sendiri
    val rangeInt1 = 1..10 step 2
    rangeInt1.forEach {
        print("$it ")
    }
    println(rangeInt1.step)

    //Untuk menggunakan fungsi rangeTo()
    //operator .. digantikan degan fungsi rangeTo()
    val rangeInt2 = 1.rangeTo(10)
    print("\n")

    //menggunakan fungsi downTo() untuk menentukan nilai dengan urutan terbalik
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    //dalam if expression menggunakan keyword in
    //itu sama halnya dengan expression berikut
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }

    //bisa juga memeriksa apakah suatu nilai tidak ada pada nilai cakupan range
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }

    //Range pada Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange dan CharRange.
    //Sehingga selain nilai numerik, kita juga bisa menentukan tipe Character sebagai nilai yang dicakup oleh Range
    val rangeChar = 'A'.rangeTo('F')
    //Nilai pada variable rangeChar di atas mencakup A, B, C, D, E, F.
}