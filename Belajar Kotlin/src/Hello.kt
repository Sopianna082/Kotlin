/**
 * print () => akan menampilkan nilai tanpa adanya baris baru
 * println () => menampilkan nilai dengan menambahkan enter untuk baris selanjutnya
 */

fun main() {
    //tempat menuliskan struktur pemograman
    print("Hello Guys, ");
    println("Yuk belajar kotlin");

    //Variabel dan Tipe data
    /**
     * Val -> imutable -> tidak bisa diubah
     * Var -> mutable -> nilai dalam variable bisa diubah
     */
    val name = "Sopianna"
//    name = "Anna";  //akan error, karena tidak bisa diubah
    var age = 20
    age = 19
    println(name)
    println(age)

    //Bisa memakai String template
    //gunanya untuk merefer atau mengambil nama variabel dalam string
    println("Nama saya $name dan umur $age")

    /**
     * Untuk menuliskan komentar
     * // untuk satu baris
     * /* */ untuk multi line
     *
     * komentar tidak akan ditampilkan pada program
     */

    //Tipe data
    /**
     * Tipe data primitive -> tipe data yang menyimpan satu nilai saja
     * contoh : Int, Float, Double, Short, Long
     *
     * Tipe data reference -> tipe data yang menyimpan beberapa nilai
     * contoh : Array
     */

    val bookname : String = "Atom Habits" //bisa dituliskan tanpa menuliskan tipe data, akan lanusng otomatis
    println(bookname)

    val a = 10
    val b = 4
    val c = a.toDouble()/b.toDouble()
    println(c)


}



