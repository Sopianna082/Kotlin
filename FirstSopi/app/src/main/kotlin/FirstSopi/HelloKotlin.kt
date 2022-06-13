package FirstSopi

//fun main() {
//    println("Hello Kotlin!")
//
//    val name = "Sopianna"
//
//    print("Hello my name is " + name + "\n")
//    print(if(true) "Always true" else "Always false")
//}

//Tipe char = hanya dapat kita gunakan untuk meyimpan karaker  tunggal
//dalam tipe ini juga dapat kita lukkan operasi increment (++) dan decrement (--)
//karena pada dasarnya setiap char merupakan gambaran dari Unicode
//char hnya dapat menggunakan tanda kutip tunggal ('')
//fun main() {
//    var vocal = 'A'
//
//    println("Vocal " + vocal++) //Tidak lansung mengalami peningkatan
//    println("Vocal " + vocal++)
//    println("Vocal " + ++vocal) //penggunaan hal disamping akan lansung ditambah ke variabelnya
//    println("Vocal " + vocal++)
//    println("Vocal " + vocal--)
//    println("Vocal " + vocal--)
//    println("Vocal " + --vocal)
//    println("Vocal " + vocal--)
//}


//Tipe String, mirip dengan char hanya saja dapat menyimpan nilai berupa teks
//sekumpulan karakter dalam string berbentuk array sehinggan dapat dilakukan indexxing
//Indexing merupakan sebuah cara yang memudahkan kita untuk mengakses elemen yang berada
// di dalam sebuah Collection dengan memanfaatkan index atau posisi dari elemen tersebut.
//fun main() {
//    val name = "Sopianna Siagian"
//    for(char in name){
//        print("$char ")
//    }
//
//    //Escape String, mengurangi ambiguitas dalam string yakni dalam penggunan symbol
//    var pernyataan = "Hari ini belajar \"Bahasa Pemograman Kotlin\""
//    print("\n" + pernyataan)
//}


//Functions
//fun main() {
//    val user1 = setUser1("Sopianna", 20)
//    println(user1)
//
//    val user2 = setUser2("Sopianna", 20)
//    println(user2)
//
//    val user = setUser("Alfian", 19)
//    println(user)
//
//    printUser("Alfian")
//
//    printUser1("Sopianna", 19)
//}
////cara 1 , pakai curly braces{}
//fun setUser1(name:String, age:Int) : String{
//    return "Your name is $name, and you $age years old"
//}
//
////cara 2, hnya satu tipe data yg dikembalikan
//// nilai yang dikembalikan dengan keyword "return" yg hanya
////mengembalikan satu expression dengan hnya perlu menambahkan tanda =
//fun setUser2(name:String, age:Int) : String = "Your name is $name, and you $age years old"
//
////Dengan expression body, kompiler dapat menentukan tipe nilai kembalian secara eksplisit
//fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
//
//fun printUser(name: String) {
//    println("Your name is $name")
//}
//
//fun printUser1(name: String, age: Int) : Unit{
//    print("Your name is $name and umur $age")
//}

//if Expressions
//fun main() {
//    val jamMasuk : Int = 7
//    val jamSekarang = 29
//    val office: String
//    if (jamSekarang > jamMasuk && jamSekarang == jamMasuk) {
//        office = "Office already open"
//    } else if (jamSekarang > 18 && jamSekarang <= 24){
//        office = "Office is closed"
//    } else {
//        office = "Nothing"
//    }
//
//    print(office)
//}

//perlu diingat
//kotlin tidak mendukung ternary operator
//(condition ? then : else), karena peran dari operator tersebut sudah digantikan dengan if expressions.

//Numbers
//Adalah sebuah tipe data yg khusus digunakan untuk menyimapan nilai dalam bentuk numerik
/**
 *  Beberapa tipe bawaan yang merepresentasikan Numbers adalah Double, Long, Int, Short dan Byte.
 *  Int (32 bit)
 *  Long (64 bit)
 *  Short (16 bit)
 *  Byte (8 bit)
 *  Double (64 bit)
 *  float (32 bit)
 * */

//Untuk mengetahui nlai maksimal dan minimal dari suatu tipe number
//fun main() {
//    val maxInt = Int.MAX_VALUE
//    val minInt = Int.MIN_VALUE
//
//    println(maxInt)
//    println(minInt)
//
//    //Untuk konversi nilai ke tipe data yang lainnya
//    //dapat menggunakan fungsi toInt() sesuai tipe data yg ingin diubah
//    val byteNumber : Byte = 10
//    val intNumber : Int = byteNumber.toInt()
//}

//Arrays
//Tipe data yang memungkinkan untuk menyimpan beberapa objek di dalam sebuah variabel
//Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size.
// Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut:
