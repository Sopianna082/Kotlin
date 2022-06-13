package Hero

//Dalam class ini kita bisa membuat banyak class
//syaratnya dengan membuat salah satu class menjadi parent
//dengan menggunakan keyword open
open class fighter {    //Class Parent

    //Function
    fun sayHello(Name:String, Power:Int, Health:Int){
        println("Hallo hero fighter $Name dengan power $Power")
        println("Hero Fighter $Name mempunyai Health $Health")
    }

    //Class ini adalah contoh  inherritance
    //Dimana class ini mewarisi class fighter
    //Walaupun tidak ada function atau proprerties tetap mewarisi
    // function atau properties dari class parent
    class Fighter1():fighter()  //Class Child
}