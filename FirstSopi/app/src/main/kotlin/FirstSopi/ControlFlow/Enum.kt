package FirstSopi.ControlFlow

//Enum
fun main() {
    //ketika ingin mengakses objek yang berada dalam class enum
    val color : Color = Color.RED
    print("Warnanya adalah " + color)
    print("\n")

    //Menggunakan syntehetic method untuk mendapatkan daftar objek enum dan nama dari tiap enum
    //values() => daftar objek enum
    val color1 : Array<Color1> = Color1.values()
    color1.forEach {
        color -> print(color)
        print(", ")
    }

    //valuesof() => mendapatkan nama dari objek enum
    //perhatikan argumen yang kita masukkan ke fungsi, jika argumen
    //yang kita masukkan tidak sama dengan objek enum akan terjadi kesalahan yakni illegalArgumnetException
    var color2 : Color1 = Color1.valueOf("RED")
    print("\nColor is $color2\n")

    //Ordinal => mendapatkan posisi tiap objek menggunakan properti ordinal
//    val color4 : Color1 = Color1.BLUE
//    print("Posisi Nilai BLUE is ${color1.ordinal}")

    //mengecek instance dari enum itu sendiri
    val color3 : Color1 = Color1.GREEN
    when(color3){
        Color1.RED -> print("Color is Red")
        Color1.BLUE -> print("Color is Blue")
        Color1.GREEN -> print("Color is Green")
    }
}

//Implementasi objek yang paling mendasar
enum class Color{
    RED, GREEN, BLUE
}

//Setiap objek yang dideklarasikan merupakan instance dari kelas Enum
//Dapat di inisialisasi menjadi
enum class Color1(val value : Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}