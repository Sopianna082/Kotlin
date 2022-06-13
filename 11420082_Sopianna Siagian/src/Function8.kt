/**
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 * Deskripsi : Function yang menggantikan nilai dalam template dan manipulasi data
 */

//Just like most modern languages, Kotlin supports single-line (or end-of-line) and multi-line (block) comments
// This is an end-of-line comment
/* This is a block comment
   ob multiple lines*/

//BLock comments in Kotlin can be nested
/* The comments starts here
/* Contains a nested comment */
 and ends here.*/

fun main() {
    var a = 1   //nilai awalnya 1
    //simple name in template
    val s1 = "a is $a"

    a = 2 //tergantikan menjadi 2
    //aribitary expression in template
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    /**
     * Penjelasan:
     * Dalam variable s1, nilai a yang disimpan adalah 1 belum tergantikan menjadi2
     * Kemudian variable s2, adanya manipulasi string dengan menggantikan string,
     * dan nilai a yang disimpan sudah berubah menjadi 2
     */
}

