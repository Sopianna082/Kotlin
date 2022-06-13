/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

/** List
 * Dapat menyimpan banyak data menjadi satu objek
 * List tidak hanya bisa menyimpan data dengan tipe yang sama namun juga dapat berisi
 * macam tipe seperti Int, String, Boolean
 *
 * Dalam list kita tidak dapat memanipulasi data
 * karena list tersebut bersifat immutable alias tidak bisa diubah
 * namun kotlin menyediakan collection dengan tipe mutable.
 * Artinya kita melakukan perubahan pada nilainya dengan cara
 * seperti menambah, menghapus, atau mengganti nilai yang
 * sudah ada. Caranya pun cukup mudah. Anda hanya perlu
 * menggunakan fungsi mutableListOf
 * */

/** SET
 * Set merupakan objek turunan yang hanya dapat menyimpan nilai yg unik
 * artinya tidak ada data yang sama atau duplikat dalam sebuah collection
 * */

fun printAll(strings: Collection<String>){  //Dengan memakai collection dalam kotlin maka akan bersifat mutable
    for(s in strings) print("$s ")  //Memakai perulangan for dalam menampilkan data
    println()
}

fun main() {
    //Penggunaan list dapat ditulis sebagai berikut
    //Data dalam list dapat berulang
    val stringList = listOf("one", "two", "one") //Menggunakan keyword "ListOf" dan didalmnya akan menampung data
    printAll(stringList)    //Menampilkan value

    //Penggunaan set
    //Data dalam set tidak dapat berulang
    val stringSet = setOf("one", "two", "three")
    val stringSet1 = setOf("one", "two", "three","one") //adanya dua nilai yang sama
    printAll(stringSet)
    printAll(stringSet1) //Hasil dari kedua println akan sama,
                        // walaupun pada StringSet1 adanya nilai "one" yang berulang.
                        // Tetapi dalam set, bersifat unik sehingga tidak adanya data yang duplikat
}