package FirstSopi.OOP

import kotlin.reflect.KProperty

//Delegasi hanya dapat digunakan untuk properti yang memiliki tipe data string
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
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

fun main(){
    val animal = Animal1()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}