/**
 * Nama     : Sopianna Siagian
 * NIM      : 11420082
 * Kelas    : 42 TRPL 2
 */

//function berikut unutk mendapatkan words dengan panjang yang ditentukan
fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int){
    this.filterTo(shortWords){it.length <= maxLength}   //akan mencari atau filter nilai string yang sesuai dengan maxlength
    //throwing away the articles
    val articles = setOf("a", "A", "an", "the", "The") //word yang sudah ditentukan akan dieliminasi
    shortWords -= articles  //walaupun memenuhi kriteria bahwa nilai <= maxlength, tetapi shortword tidak akan ditampilkan
}

fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ") //Value String yang akan dimanipulasi
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3) //Dari function yang ditentukan, maxLength <=3
                                                // maka akan mencari value yang memenuhi maxLength
    println(shortWords) //Menampilkan hasil dari mendapatkan value
}