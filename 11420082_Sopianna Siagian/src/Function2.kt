/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function with an expression body and inferred return type
 */

//Function ini dituliskan dengan lebih ringkas, yang lansung menambahkan symbol "="
//Fucntion ini memiliki 2 parameter dengan tipe pengembalian
fun sum2(a:Int, b:Int) = a + b

fun main() {
    //Nilai yang ditampilkan menggunakan String Template
    print("sum of 19 and 23 is ${sum2(19, 23)}")
}