/***
 * Array
 * adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
 *
 * Operasi dalam Array
 * size -> untuk mendapatkan panjang Array
 * get(index) -> mendapat data diposisi index
 * [index]
 * set(index, value)-> mengubah data diposisi index
 * [index] = value
 *
 */

fun main() {
    //walaupun memakai val, data dapat diubah
    //karena yang diubah itu data dalam arraynya, bukan nama variable
    val varianLaptop: Array<String> = arrayOf("Lenovo", "Acer", "Asus")

    var lenovo = varianLaptop[0]
    var acer = varianLaptop.get(1)
    var asus = varianLaptop.get(2)

    varianLaptop.set(2, "Region")
    println()
    println(varianLaptop[0])
    println(varianLaptop[1])
    println(varianLaptop[2])

    // Kode : Array Nullable
    //jangan lupa memakai ? setelah tipe data variableb
    val names:Array<String?> = arrayOfNulls(10)
    println(names[0]) // hasilnya null
    names[0] = "Sopi"
    names[1] = "anna"
    names[2] = "Harry"
    names[3] = "CIci"
    names[3] = null //walaupun data tidak diisi, bukan berrati index itu bakalan hilang,tetap ada
    println(names[0])
    println(names.size)
    for (name in names){
        println(name)
    }
}



