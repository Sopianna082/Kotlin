fun main() {
    println(Perkalian(5))

    println(sayHello("Hai", "Indonesia"))

    val kataSapa = "Hello"
    val me:String = kataSapa.halo()
    println(me)
}

//Single Expression Function => menyerdehanakan code dengan satu baris aja
//hanya berlaku jiga expression yang mudah
//fun Perkalian(a:Int):Int{
//    return a*3;
//}

//Memakai Single Expression Function
fun Perkalian(a:Int):Int = a*3;

//dengan parameter
fun sayHello(sapaan:String, negara:String):String = "$sapaan from $negara"

//Extension Function
//Kemampuan menambahkan function pada tipe daya yang sudah ada
fun String.halo():String{
    return "Hallo $this"
}