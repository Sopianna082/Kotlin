package app

import Hero.SupportException

fun SayHi(Name:String){
    if (Name.isBlank()){
        throw SupportException("Name is Blank, please add your name")
    }else{
        println("Hello $Name")
    }
}

fun main() {
    SayHi("Sopi")
    SayHi("") //JIka kosong, maka error dan akan dijalankan exception
    // dan memanggil object Support
}