package app
import Hero.marksman    //dengan membuat import maka class marksman dapat diimplementasikan

fun main() {
    //Memiliki data -> Nama, Power, Health

    //Memakai Constructor yang pertama
    val Miya = marksman("Hero Miya", Power = 1500, Health = 200)   //Membuat object,
    // class marksman memiliki object yakni Miya
    Miya.Name = "Hero Miya" //Properti yang dipakai mengakses class marksman
    Miya.Power = 1500
    Miya.Health = 1500

    //Constructor yang kedua
    val Claude = marksman("Hero CLaude", Power = 1000)
    Claude.Name = "Hero Claude"
    Claude.Power = 1000
    Claude.Health = 1000

    //Constructor yang ketiga
    val Granger = marksman("Hero Granger")
    Granger.Name = "Hero Granger"
//    Granger.Power = 1000
//    Granger.Health = 1000

    //Tempat lokasi object diinstances
    println(Miya.Name)
    println(Claude.Power)
    println(Granger.Health)
    println(Miya)
    println(Claude)
}

