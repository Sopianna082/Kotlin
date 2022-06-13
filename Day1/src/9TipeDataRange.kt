/**
 * tipe data range
 *
 * Kadang kita ingin membuat array yang berisi data yang angka berurutan
 * Membuat array dengan jumlah data yang sedikit mungkin mudah, tapin bagaimana jika data yang
 * berurutannya sangatvbanyak, misal 1 sampai 1000
 *
 * Kotlin mendukung tipe data range yanh digunakan untuk kebutuhan seperti permasalahan sebelumnya
 * Cara membuat yakni dengan menggunakan titik .. (titik dua kali)
 * 0..100 : Range dari 0 sampai 10
 */

fun main() {
    //range kebutuhan untuk perulangan bukan untuk menampung data
    var range = 0..10
    println(range)
    for (view in range){
        print(view)
    }

    /**
     * Operasi Range
     * count() -> mendapatkan total data di range
     * contains(value) -> mengecek apakah terdapat value tersebut
     * first => mendapatkan nilai pertama
     * last => mendapatkan nilai terakhir
     * step => mendapatkan nilai tiap kenaikan
     */

    println(range.count())
    println(range.contains(15))
    println(range.first)
    println(range.last)
    println(range.step)

    //Kode range terbalik
    var range2 = 5 downTo  1
    for (angka in range2){
        print(angka)
    }

    //untuk membuat angka yang berbeda step atau kenaikannya
    range2 = 30 downTo 1 step 3
    print("\nMemakai step\n")
    for (angka in range2) {
        print(angka)
    }
}

