package Hero

//private class mage (val name:String){ //Akan error jika diakses
//public class mage (val name:String){    //dapat diakses fungsi yang didalamnya
open class mage (val name:String){  //Jadi Class Parent
    private fun skill(){    //hanya dapat diakses class tempat diinisialisasi
        println("Menyemburkan Api")
    }

    protected fun Skill2(){ //dapat diakses class turunan
        println("Menyambarkan Petir")
        val Eudora = mage("Hero Eudora")
        Eudora.Skill2()
        Eudora.skill()  //Dapat mengakses function private, karena masih berada
                        // dalam class yang sama
    }
}

class Mage2(name: String):mage(name){   //Class child
    fun Skill3(){
        val Eudora2 = Mage2("Hero Eudora 2")
        Eudora2.Skill2()    //dapat dipanggil, karena bersifat protected
//        Eudora2.skill() //Akan error, karena bersifat private
    }
}