/**
 * Tipe Data Char
 * String -> KUmpulan Character
 * Character -> Tunggal -> A, B, C,...., @, >, .....
 * Untuk char disimbolkan dengna memakai ''
 */

fun main() {
    val char = 'A'
    //var character = 'ABC'   //akan error karena tipe data character berdifat tunggal
    println(char)

    /**
     * Collection
     * adlah kumpulan data
     *
     * ada beberapa macam
     * - List => menyatakab nilai dengan indeks -> (1,2,3,4), sifatnya mutable(bisa diubah datanya)
     * - Set => menyatakan nilai unik => (1,1,2,2,3) yg muncul tidak akan double, unik atau tunggal
     *  - Map => menyatakan nilai dengan format key value
     */

    //List -> Mutable
    val number = listOf<Int>(1,2,2,3,3,4)
    println(number)
    println(number[1])

    //Any bisa diakses semua tipe data
    val kindList = listOf<Any>(1, "Sopianna", true, 2.3)
    println(kindList)

    val MutableAnyList = mutableListOf<Any>(1, "Siagian", 'A')
    println(MutableAnyList)
    MutableAnyList.add(3.3) //akan bertambah
    println(MutableAnyList)
    MutableAnyList.remove("Siagian")
    println(MutableAnyList)

    //Set => unik akan mengembalikan nilai yang tidak berulang
    var numberSet = setOf<Int>(1,0,0,4,0,3,2,0);
    println(numberSet)

    //Map => konsepnya memiliki key dan value
    val filmName = mapOf(1 to "Harry Potter", 2 to "Spongebob")
    println(filmName)
    println(filmName[1])
    println(filmName[2])

    //Array
    /**
     * adalah tempat menyimpan beberapa data ke dalam sebuah variabel
     */
    val Array = arrayOf(1, 2,2, 3000L, "Sopianna", '@')
    println(Array)

    for (i in Array){
        println(i)
    }
    //Mengakses array
    println(Array[5])

    //Kotlin mensupport Array dnegan tipe data primitif
    //intArrayOf() : IntArray
    //booleanArrayOf() : BooleanArray
    //charArrayOf() : CharArray
    //LongArrayOf() : LongArray
    //shortArrayOf() : ShortArray

    //Array bersifat mutable
    var numlist = arrayListOf<Int>(0, 7, 43, 63)
    numlist.add(20)
    for (i in numlist){
        print(i)
        print(" ")
    }

    numlist.remove(0)
    println("\n" + numlist)
}