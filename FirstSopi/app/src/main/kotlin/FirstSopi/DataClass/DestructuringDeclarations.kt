package FirstSopi.DataClass

/**
 * Destructuring Declarations
 * merupakan proses memetakan objek menjadi sebuah variabel
 *
 * Dengan fungsi componentN()
 * */
fun main() {
    val dataUser = DataUser("Sopianna", 19)

    //Fungsi component() dihasilkan sesuai dengan jumlah properti yang ada pada data class
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}