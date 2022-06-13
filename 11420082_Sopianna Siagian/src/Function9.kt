/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function dengan mengunakan percabangan if else
 */

//Function dengan tipe adanya pengembalian nilai
//Dan mengggunakan percabangan if else
fun maxOf(a: Int, b:Int):Int{
    if (a>b){
        return a
    }else{
        return b
    }
}

fun main() {
    //Menggunakan String template
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}