package FirstSopi.DataClass

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

val numberList : List<Int> = listOf(1, 2, 3, 4, 5)

//dapat ditulis sperti berikut
val numberList1 = listOf(1, 2, 3, 4, 5)
val charList = listOf('a', 'b', 'z')

//jika kita membuat list dengan tipe data yang berbeda
//variabel yang kita pakai yakni List<Any>
val anyList = listOf('a', "Sopianna", 1, true)

//bahkan kita dapat menuliskan sebuah data class ke dalam list
//val anyList = listOf('a', "Kotlin", 3, true, User())


//val anyList = mutableListOf('a', "Kotlin", 3, true, User())
////manipulasi data
//anyList.add('d') // menambah item di akhir list
//anyList.add(1, "love") // menambah item pada indeks ke-1
//anyList[3] = false // mengubah nilai item pada indeks ke-3
//anyList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array