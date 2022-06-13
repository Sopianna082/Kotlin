/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

//fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
//    // TODO
//    val getvaluec = valueC ?: 50
//    return valueA + (valueB - valueC)
//}

//fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
//    // TODO
//    val result = valueC?.let {valueA + (valueB - valueC)}?:103
//    return result
//}

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO
    val valueCNotNull = if (valueC == null){
        50
    } else {
        valueC
    }

    val valueA = valueA
    val valueB = valueB
    val result = valueA + (valueB - (valueCNotNull ?: 50))
    return result
}

//fun calculateResult1(valueA: Int, valueB: Int, valueC: Int?): Int
//val textLength = if (text != null) text.length else 7