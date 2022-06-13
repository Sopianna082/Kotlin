/***
 * Tipe Data String
 * adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks
 * Di kotlin, tipe data string direpresentasikan dengan kata kunci String
 * Untuk membaut string di kotlin, kit abisa menggunakan
 * " -> untuk teks satu baris
 * """ -> Untuk teks lebih dari satu baris
 */

fun main() {
    var Firstname = "Sopianna"
    val Lastname = "Siagian"

    var address: String = """
        Jl Raya Rianite 
        Pengururan
        Samosir
    """

    var address1: String = """
        |Jl Raya Rianite 
        |Pengururan
        |Samosir
    """.trimMargin()
    //trimMargin akan mencari karakter | untuk mengahapus karakter sebelumnya
    //dan digabungkan

    var address2: String = """
        >Jl Raya Rianite 
        >Pengururan
        >Samosir
    """.trimMargin(">")
    //Biar pakai karakter sendiri
    //bisa menggantikan symbol dengan >

    var address3: String = """
        Jl Raya Rianite 
        Pengururan
        Samosir
    """.trimIndent()

    println(Firstname)
    println(address)
    println(address1)
    println(address2)

    //String Template
    val fullName: String = "$Firstname $Lastname"
    println(fullName)

    val moreInformastion: String = "$Firstname Length = ${Firstname.length}"
    print(moreInformastion)

    //NB : Jangan lagi menggunakan +
}

/**
 * Menggabungkan String
 * dapat menggunakan operator +
 *
 * Bisa Pakai String Template
 * adalah kemampuan String di Kotlin yang mendukung ekspresi template
 * Dengan String template, secara otomatis kita bisa mengakses data dari luar string
 * $ adalah tanda yang digunakan untuk template ekspresi sederhana seperti mengakses variable lain
 * ${ isi ekspresi } adalah tanda yang digunakan untuk template ekspresi yang kompleks
 */