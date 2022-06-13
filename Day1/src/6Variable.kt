/***
 * Variable adalah tempat untuk menyimpan data
 * Kotlin mendukung 2 jenis variable yakni
 * - Mutable (bisa diubah) menggunakan kata kunci Var (Diubah data dengan tipe yang sama, tetapi mengubah dari String ke Int tidak bisa diubah)
 * Datanya bisa diubah tetapi tipe data tidak dapat berubah
 * - Immutable ( tidak bisa diubah) menggunakan kata kunci Val
 *
 * Deklarasi Variable
 * val/var namaVariable: TipeData = data
 *
 * direkomendasikan mneggunakan immutable dibanding mutable
 *
 * Variable Constant
 * adalah immutable data yang bisa diakses untuk kepeluan global
 * Global artinya bisa diakses dimanapun
 * untuk menandai bahwa avriable tersebut adalah constant, biasanya menggunakan
 * UPPER_CASE dalam pembuatan nama variable constantnya
 */

//Variable Constant
//harus pakai val
const val APPLICATION = "Belajar Kotlin"
const val VERSION = 1

fun main() {
    //Mutable
    var firstname = "Sopianna"
    firstname = "Harmonie"

    //Imuntable
    val lastName = "Siagian"

    //Nullable
    var name:String? = null
    name = "Sopianna"
    println(name)
    println(name?.length)


}

/***
 * NUllable
 * Variable di kotin harus dideklarasikan / diinisialisasikan nilainya
 * Jika saat membuat variable tidak diberi nilai maka akan error
 * Kotlin mendukung variable yang boleh null(tidak memiliki data)
 * Dikarenakna kotlin bisa mengakses java, dan kebanyakan di java, semua varibale bisa null
 * Untuk membuat varibale bisa bernilai null, di kotlin bisa menggunakan ? (tanda tanya) seteleah tipe datanya
 * Penggunaan fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya
 * sebagai jalan akhir jika misal mengakses kode java
 */