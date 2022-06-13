package OOPKotlin

import java.lang.Exception

fun main(args: Array<String>){
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    //Object dari constructor pertama
//    val player = Player() //Merupakan object dari player
    val player = Player("Madrigal", 89, true, false)
    player.castFireball()

//    //Jika nilai _healthPoints diset < 0, maka program akan terhentikan / error saat kompilasi
//    //Karena pada init, require yang diminta bahwa value _healthPoints > 0
//    val player2 = Player("Madrigal", -1, true, false)
//    player2.castFireball()


    //Object dengan menggunakan constructor kedua
    var player3 = Player("Harry Potter")
    player3.healthPoints

    //Object dengan menggunakan constructor ketiga
    var player4 = Player("kar")
    player4.name

    //Merupakan object dari class child
    val auraColor = Player.auraColor(isBlessed, healthPoints, isImmortal)
    auraColor.name

    //Player status
    val healthStatus = Player.formatHealthStatus(healthPoints, isBlessed)
    healthStatus.healthPoints
//    printPlayerStatus(auraColor, isBlessed, player.name, healthPoints)


    //Lanjutan sesi 3
    val player5 = Player("Madrigal")
    player5.castFireball()

    var curentRoom = Room("Foyer")
    println(curentRoom.description())
    println(curentRoom.load())

    //Player status
//    printPlayerStatus(player)

    var  swordsJuggling: Int? = null
    val isjugglingProficient = (1..3).shuffled().last() == 3
    if (isjugglingProficient){
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(2)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e: Exception){
        println(e)
    }

    println("You juggle $swordsJuggling sword!\n")

    val animal = Animal1()
    animal.name = " Cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")

    val color = Color()
    println("Aura have ${color.color}")
    color.color = "RED"
    println("Now, Aura have ${color.color} color")

    val info = ExtensionProperties("Platipus", 5.0, 2, true)
    println(info.getInfo)
}


fun proficiencyCheck(swordsJuggling: Int){
//    swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords")
    swordsJuggling ?: throw UnskilledSwordJugglerException()
}

class UnskilledSwordJugglerException() : IllegalStateException("Player cannot juggle swords")