package FirstSopi.DataClass

////class yang umumnya digunakan untuk menampung sebuah data
//class User(val name : String, val age : Int)
//
////menggunakan keyword data
//data class DataUser(val name : String, val age : Int)
//
//fun main() {
//    //Tanpa ada keyword "data" akan mengembalikan nilai yakni nama package, nama kelas dan memoryaddress
//    val user = User("nrohmen", 17)
//
//    //Menggunakan keyword "data" mengembalkukan nilai teks yaitu nama kelas disertai
//    // dengan semua properti didalamnya dan value dari properti
//    val dataUser = DataUser("nrohmen", 17)
//
//    println(user)
//    println(dataUser)
//}

//==============
// Agar dapat mengembalikan nilai dengan berupa teks tanpa keyword "data"
// Dapat menggunakan fungsi toString()

//class yang umumnya digunakan untuk menampung sebuah data
class User(val name : String, val age : Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
//        return super.toString()
    }
}

//menggunakan keyword data
data class DataUser(val name : String, val age : Int)

fun main() {
    //Tanpa ada keyword "data" akan mengembalikan nilai yakni nama package, nama kelas dan memoryaddress
    val user = User("Sopianna", 17)

    //Menggunakan keyword "data" mengembalkukan nilai teks yaitu nama kelas disertai
    // dengan semua properti didalamnya dan value dari properti
    val dataUser = DataUser("Siagian", 17)

    println(user)
    println(dataUser)
}