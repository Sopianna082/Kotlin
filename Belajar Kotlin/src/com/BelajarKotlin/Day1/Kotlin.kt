package com.BelajarKotlin.Day1

import java.util.*

fun sopi(nama:String) {
    println("Nama saya adalah $nama")
}

//lambda expression
//Function yang tidak memiliki nama
//dimana lamda expression (function) bisa disimpan dalam variabel
fun main() {
    //Coba buat lambda expression
    val LambdaExpression : (String) -> String = { value:String ->
        value.uppercase(Locale.getDefault())
    }

    //Ekxsekusu Lambda
    val Nama = LambdaExpression("Sopianna")
    println(Nama)

    //if else
    println(Hello("Sopianna"))
    println(Hello(""))

    //when
    println(nameLaptop(""))
    println(nameLaptop("Lenovo"))
}

//return if dan when
fun Hello(Nama:String= ""):String{
    return if (Nama == ""){
        "Hello bro"
    }else{
        "Hello $Nama"
    }
}

//when
fun nameLaptop(varian:String=""):String{
    when(varian){
        "" -> return "Nama laptop belum ada"
        else -> return "Nama laptop $varian"
    }
}