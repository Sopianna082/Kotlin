package FirstSopi.DataClass

/** Menyalin dan Memodifikasi Data Class
 * Data class memungkinkan kita untuk menyalin sebuah objke dengan sangat mudah
 * hanya dengan memafaatkan fungsi copy() di dalamnya.
 * */

fun main() {
    val dataUser = DataUser("Sopianna", 18)
    val dataUser1 = DataUser("Dimas", 17)
    val dataUser2 = DataUser("Taehyung", 31)
    val dataUser3 = DataUser("nhromen", 18)
    val dataUser4 = dataUser.copy()
    //dengan menggunakan fungsi copy() dapat juga memodifikasi nilai
    val dataUser5 = dataUser2.copy(age = 20)

    println(dataUser4)
    println(dataUser5)
}

/**
 * Tanpa data class untuk melakukan tugas memerlukan sebuah instance baru untuk mengubah nilai dari onjek
 * Tugas ini berulang dan membuat kode yang kita tulis, jauh dari paradigma clean code
 * */