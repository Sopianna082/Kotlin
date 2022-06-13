fun main() {
    var age: Byte = 30;
    var heidgt: Int = 170

    //untuk tipe data long
    //kita harus menambahkan diakhir L
    var balance: Long = 1000000000L
    var name: String = "Sopianna Siagian "

    println(age )
    println(name + " berumur " + age + " dengan " + balance)

    //Literals
    var decimalLiteral: Int = 100
    //JIka hexadecimal di awali dengan 0x
    var hexadeximalLiteral: Int = 0xFF
    //JIka ingin mengubah ke bentuk binaryLiteral diawali dengan 0b001
    var binaryLiteral: Int = 0b0001

    println(decimalLiteral + hexadeximalLiteral + binaryLiteral)

    //underscore in number
    //ditambahkan sebagai separator sebagai mmepermudah pembacaan
    var price: Long = 4_000_000_000L
    println(price)

    //Conversion
    var number: Int = 100
    //Convert
    var byte: Short = number.toShort()
    println(byte)

    var priceDouble: Double = price.toDouble()
    println(priceDouble
    )
}