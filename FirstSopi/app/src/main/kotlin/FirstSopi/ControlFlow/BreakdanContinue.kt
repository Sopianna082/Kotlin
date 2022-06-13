package FirstSopi.ControlFlow

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null)
    for (i in listOfInt){
        print(i)
    }

    print("\n")
    //Kode diatas mmeiliki nilai null
    //akan berpotensi untuk membuat NullPounterException disana
    //kita dapat menggunakan keyword Break dan Continue
    //untuk menghentikan atau melewatkan proses

    for (f in listOfInt){
        if (f == null) continue
        print(f)
    }

    print("\n")
    for (g in listOfInt){
        if (g == null) break
        print(g)
    }

    //Break = menghentikan program
    //Continue = melewatkan

    /**
     * Break dan Continue Labels
     * label pada kotlin memiliki sebuah identifier yang diikuti dengan symbol @author
     * cth: foo@ atau bar@
     */

    print("\n")
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}

