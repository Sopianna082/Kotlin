package FirstSopi.ControlFlow

//For
/**
 * For dapat digunakan pada Ranges, collections dan arrays dan
 * apapun yg menyediakan iterator (perulangan)
 * */

fun main() {
    val ranges = 1.rangeTo(5)
    for (i in ranges){
        println("Nilai $i")
    }

    //menggunakan step
    val ranges1 = 15.rangeTo(25) step 3
    for (i in ranges1){
        print("$i ")
    }

    //menambahkan ekstensi step yang akan  mengembalikan nilai baru
    //dengan tipe IntProgression
    //dapat mengakses indeks untuk setiap elemen yang ada pada Ranges dengan
    //fungsi withIndex()

    val ranges2 = 1.rangeTo(15) step 4
    for ((index, value ) in ranges2.withIndex()){
        println("Nilai $value dengan index $index")
    }
}