package FirstSopi.OOP

class ExtensionProperties(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val ExtensionProperties.getInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val info = ExtensionProperties("Dicoding", 5.0, 2, true)
    println(info.getInfo)
}