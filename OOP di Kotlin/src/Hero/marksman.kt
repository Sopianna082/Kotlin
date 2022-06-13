package Hero

//Ini adalah class
//Constructor utama / Primary consructor
class marksman(Name:String, Power:Int, Health:Int = 1000) { //Ini adalah constructor,
// class yang memiliki constructor

    //Secondary Constructor
    //Kita harus wajib memanggil contructor yang pertama
    constructor(Name:String, Power: Int):this(Name, Power, Health=200){
        println("Secondary Hero constructor 1")
    }

    //Constructor yang ketiga
    //Kita bisa memanggil yang pertama atau yang kedua
    constructor(Name: String):this(Name, 1000){
        println("Secondary Hero Constructor 2")
    }

    //Membuat data yang disebut properties
    //Properties adalah mirip dengan variabel, dimana bersifat muttable (var) dan immuttable (val)

    var Name:String = ""
    var Power:Int = 1000
    var Health:Int = 1000

    //Dari properties yang terbentuk, kita dapat membuat variabel yg terbentuk ke object

    //Body
//    println("Herooo") //Akan error
    //Didalam contructor utama tidak boleh ada bodynya
    //Jika ingin membuat body, digunakan initializer Block
    //Initializer Block
    init {
        println("Hero Mobile Legend $Name dibuat dengan memiliki Power $Power dan Health $Health")
    }
}