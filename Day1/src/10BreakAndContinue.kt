/**
 * Break => akan lansung menghentikan perulangan
 * Continue => berhenti pada perulangan tertentu
 * tetapi akan melanjutkan perulangan jika memenuhi syarat
 */

fun main() {
    //Break
    var i = 0;
    while (true){
        println("Ini Angka $i")
        i++

        if (i>10){
            break
        }
    }

    //Continue
    for (i in 1..50){
        if (i % 5 != 0){
            continue
        }
        print("$i, ")
    }
}