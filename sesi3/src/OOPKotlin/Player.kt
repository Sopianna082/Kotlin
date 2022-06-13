package OOPKotlin

import kotlin.reflect.KProperty

//Class Player yang menjadi container dalam pembuatan object
//Class Parent
open class Player(_name: String, _healthPoints: Int, _isBlessed: Boolean, _isImmortal:Boolean) { //Primary Constructor
    //Getter dan Setter
//    val name = "madrigal"     //Digantikan menjadi var, agar bersifat mutable
    var name = "madrigal"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }

    //Membuat data/properties
    var name2 = _name
    var healthPoints = _healthPoints
    val isBlessed = _isBlessed
    private val isImmortal = _isImmortal
    var _healthPoints:Int = 1000
    var _isBlessed:Boolean = true
    var _isImmortal:Boolean = false

    //Initializer Block
    init {
        println("\nRequirement: ")
        if (healthPoints > 0){
            println("healthPoints must be greater than zero.")
        }

        if (name.isNotBlank()){
            println("Player must have a name")
        }

        //Persyaratan value dalam constructor
        require(healthPoints > 0, {"healthPoints must be greater than zero."})
        require(name.isNotBlank(), {"Player must have a name"})

        println("\"Player name $name2 have HealthPoints $_healthPoints, Blessed = $_isBlessed, Immortal = $_isImmortal\"")
    }

    //Secondary Constructor
    constructor(_name: String):this(_name, 90, true, false){
        if (name.toLowerCase() == "kar") healthPoints = 40
        println("Player name is $name")
    }

    fun castFireball(numFireballs: Int = 2) =
        println("A glass of Fireball springs into existence. (x$numFireballs)\n")


    //Class Child dari player
    open class auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) :Player("Aura", 89, true, false){

        init {
            println("Player aura $isBlessed, $healthPoints, $isImmortal")
        }
    }

    class formatHealthStatus(healthPoints: Int, isBlessed: Boolean):auraColor(true, 89, false){
        fun printPlayerStatus(auraColor: auraColor, isBlessed: Boolean, healthPoints: Int) {

        }
    }

}
//Delegasi hanya dapat digunakan untuk properti yang memiliki tipe data string
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("\nFungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

