package OOPKotlin

import kotlin.reflect.KProperty

open class Room(val name:String) {
    fun description() = "Room: $name"

    open fun load() = "Nothing much to see here..."

    var nameRoom: String = "Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

class TownSquare : Room("Town Square"){
    override fun load() = "The villagers rally and cheer as you enter!"
}

//Membuat delegasi kelas umum yang dapat digunakan oleh seluruh tipe data dengan
//memanfaatkan tipe data Any
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal1 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

/**
 * Fungsi Getter dan Setter
 * Urutan dqlam pendefinisian get() dan set() tidak penting, dapat mendefinifikan hanya salah satu saja
 * Yang terpenting pendeklarasiannya dilakukan setelah mendeklarasikan properti
 * fungsi get(), kita mengembalikan nilai sesuai tipe data propertinya dengan menggunakan keyword field
 * fungsi set() memerlukan parameter, menjadi nilai baru yang nantinya akan dijadikan nilai properti dengan keyword value pada parameternya
 * */

class Color(){
    var color : String = "PINK"
        get(){
            println("\nFunction Getter")
            return field
        }set(value){
        println("Function Setter")
        field = value
    }

    var rgb: String by DelegateName()
}

//Extension Properties
class ExtensionProperties(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val ExtensionProperties.getInfo : String
    get() =  "\nNama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"
