/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function having two Int parameters with Int return type
 */

fun sum(a: Int, b: Int):Int{    // Function ini memiliki 2 parameter dengan tipe Int
                                //dan akan dikembalikan juga dalam bentuk Int
    return a + b    //Function ini juga tipe dengan adanya pengembalian nilai ditandai
                    //dengan keyword "return"
}

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))  //Saat akan dijalankan function, terlebih dahulu menuliskna parameter
                             //yang bertipe int

    //print akan menampilkan nilai tanpa adanya tambahan baris baru
    //priintln akna menampilkan nilai dengan adanya tambahan baris baru selanjutnya
}