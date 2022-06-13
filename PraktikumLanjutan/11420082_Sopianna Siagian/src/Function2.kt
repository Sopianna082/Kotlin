/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 * Deskripsi: Unit return can be omitted
 */

//Jenis function adalah function tanpa pengembalian yang ditandai dengan "unit"
//Tetapi keyword unit dapat juga dihilangkan tanpa menghilangkan arti yang berbeda

fun printSum2(a:Int, b:Int){    //Penggunaan keyword "unit' tidak wajib dicantumkan
                                // untuk jenis function dengan pengembalian nilai
    println("sum of $a and $b is ${a+b}")   //Dalam String template bisa juga dilakukan
                                            // operasi matematika dengan memakai {}
}

fun main() {
    printSum2(-1, 8)      //Dalam penulisan bilangan Int dalam kotlin,
                                // tidak selamanya harus bilangan positif,
                                // jika ingin menuliskan angka negatif dengan menambahkan "-" sebelum angka
}