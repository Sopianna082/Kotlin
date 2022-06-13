package FirstSopi.OOP

//class Animal(val name: String,
//             val weight: Double,
//             val age: Int,
//             val isMammal: Boolean
//) {
//
//    fun eat(){
//        println("$name makan!")
//    }
//
//    fun sleep() {
//        println("$name tidur!")
//    }
//}
//
//fun main() {
//    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2,true)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//    dicodingCat.eat()
//    dicodingCat.sleep()
//}

//====
//class Animal{
//    var name: String = "Dicoding Miaw"
//}
//
//fun main(){
//    val dicodingCat = Animal()
//    println("Nama: ${dicodingCat.name}" )
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")
//}

/**
 * Fungsi Getter dan Setter
 * Urutan dqlam pendefinisian get() dan set() tidak penting, dapat mendefinifikan hanya salah satu saja
 * Yang terpenting pendeklarasiannya dilakukan setelah mendeklarasikan properti
 * fungsi get(), kita mengembalikan nilai sesuai tipe data propertinya dengan menggunakan keyword field
 * fungsi set() memerlukan parameter, menjadi nilai baru yang nantinya akan dijadikan nilai properti dengan keyword value pada parameternya
 * */
//class Animal{
//    var name: String = "Dicoding Miaw"
//        get(){
//            println("Fungsi Getter terpanggil")
//            return field
//        }
//        set(value){
//            println("Fungsi Setter terpanggil")
//            field = value
//        }
//}
//
//fun main(){
//    val dicodingCat = Animal()
//    println("Nama: ${dicodingCat.name}" )
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")
//}


//Delegate
class Animal {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    val animal = Animal()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}