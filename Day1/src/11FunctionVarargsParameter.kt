/**
 * Fumction Varargs Parameter
 * Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
 * Varargs artinya datanya bisa menerima lebih dari satu inut, atau anggap saja semacam array
 *
 * Perbedaan dengan Array?
 * Jika parameternya tipe array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke funtion
 * Jika parameter mengggunakan Varargs, kita bisa lansung mengirim datanya, jika lebih dari satu, cukup gunakan tanda koma
 *
 */

fun hitungTotal(value:String, vararg values: Int): Int {
    var total = 0

    for (value in values){
        total += value

    }
    return total
}

fun main() {
//    val values = arrayOf(10,10,10,10)
//    val result = hitungTotal(values)
    val result = hitungTotal("Varagh harus terakhir didefinisikan",10,10,10,10)
    println(result)
}
