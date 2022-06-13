package FirstSopi.DataClass

/**Map
 * Collection yang dapat menyimapan data dengan format key-value
 * */

val capital = mapOf(
    //String sebelah kiri keyword to adalah sebuah key
    //sedangkan yang sebelah kanan merupakan value-nya
    "Jakarta" to "Indonesia",
    "London" to "Inggris",
    "Wahington" to "USA"

)

//menampilkan key yang didalam Map dengan fungsi kwys()
val mapKeys = capital.keys

//untuk mengetahui nilai apa saja yang ada didalam map kita bisa menggunakan
//fungsi values() yang akan mengembalikan colllection sebagai tipe datanya
val mapValues = capital.values

fun main() {
    //untuk mengakses nilai dari map, menggunakan key yang sudah dimasukkan
    println(capital["Jakarta"])

    //atau menggunakan fungsi getValue()
    println(capital["London"])

    //Perbedaan
    //Saat menggunakan simbol [ ] atau yang kita kenal dengan indexing,
    // konsol akan menampilkan hasil null saat key yang dicari tidak ada
    // di dalam Map. Sedangkan saat kita menggunakan getValue(), konsol
    // akan memberikan sebuah Exception.

    println(capital["New Delhi"])

    //akan menghasilkan exception
//    println(capital.getValue("New Zealand"))

    println(mapKeys)
    println(mapValues)

    mutableCapital.put("Singapura", "Kuala Lumpur")

}


//Untuk menambahkan key-value ke dalam map(bersiat mutable)
//ubah map capital menjadi mutable

val mutableCapital = capital.toMutableMap()
