package FirstSopi.DataClass

//Equals
//kelebihan lain dari data class yakni adanya fungsi equals() secara otomatis
fun main() {
    println("Pakai data")
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    //Beda dengan komparasi dengan 2 buah objek yg bukan dari data class
    //Tidak bisa menghasilkan hasil yang akurat karena konsol akan menghasilkan nilai false
    println("\nTanpa dari data")
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))
}

