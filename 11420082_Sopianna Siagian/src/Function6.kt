/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Read-only local variable are defined using the keyword val. Thay can be assigned a value only once.
 */

fun main() {
    //Variable tipe val bersifat immuttable (tidak dapat diubah)

    //val a dituliskan dengan mendeklarasikan tipe datanya juga
    val a: Int = 1 //immediate assignment

    //val b tanpa deklarasi tipe data, dimana kotlin dapat mengenali secara otomatis tipe data
    val b = 2 //'int' type is inferred

    //val c tampak seperti nilainya dapat diubah
    //tetapi saat deklrasi nilainya belum ditentukan, maka dapat dituliskan kembali
    val c : Int //Type required when no initializer is provided
    c = 3 //deferred assignment

    println("a = $a, b = $b, c = $c")   //Menggunakan string template
}