fun main() {
    greeting()
    println(tambahkanAngka())
    println(tambahkanAngka2(30,15))

    //dengan parameter
    sayHello("Sopianna", 18)

    //Default parameter yakni jika tidak diisi nilai parameternya tidak akan error
    HarryPotter("", "Ron Weaslay", "")

    //Named Argument yakni nilai parameter yang didefinisikan tidak harus berurutan
    NameedArgument(value2 = "Siagian", value1 = "Sopiaa")
}

//Function
//ada fungsi tanpa pengembalian dengan menambahkan unit
//tidak ada pengembalian data yang kita proses
fun greeting():Unit{
    var Indonesia = "Halo"
    println("$Indonesia adalah kata sapa dari negara Indonesia")
}

//ada fungsi dengan pengembalian nilai
fun tambahkanAngka():Int{
    return 10 + 5
}

fun tambahkanAngka2(Angka1:Int, Angka2:Int):Int{
    return Angka1 + Angka2
}

//Fungsi yang ada parameter
fun sayHello(nama:String, umur:Int){
    println("Halo nama saya $nama dan umur saya $umur")
}

//Function Default Parameter
//artinya ketika lupa menuliskan parameter akan menggunakan default parameter
fun HarryPotter(Pemain1:String = "Harry", Pemain2:String = "", Pemain3:String = ""){
    println("Pemain utama Harry Potter yakni $Pemain1 , $Pemain2, $Pemain3")
}

//function Named Argument
fun NameedArgument (value1:String, value2:String){
    println("Ini nilai 1 yakni $value1 dan nilai 2 $value2")
}
