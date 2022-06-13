/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

/**
 * List
 * Dapat melakukan perubahan pada nilainya dengan cara
 * seperti menambah, menghapus, atau mengganti nilai yang
 * sudah ada.
 *
 * Caranya dengan menggunakan fungsi mutableListOf
 */

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4) //Dapat dimanipulasi data karena sudah menggunakan MutableListOf
    numbers.add(5)  //menambah iterm di akhir list
    numbers.removeAt(1) //menghapus item numbers berdasarkan index atau posisi nilai dalam array
    numbers[0] = 0 //mendapatkan nilai dari index 0
    numbers.shuffle() //Akan merubah urutan secara acak
    println(numbers) //menampilkan nilai yang sudah di shuffle
}