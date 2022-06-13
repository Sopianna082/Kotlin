package app

import Hero.fighter

fun main() {
    val Chou = fighter()
    //Ketika dipanggil function sayHello maka akan dipanggil dari class fighter
    Chou.sayHello("Hero Chou", 1000, 1000)

    val Alucard = fighter.Fighter1() //memanggil class child
    Alucard.sayHello("Hero Alucard", 1000, 100)

}