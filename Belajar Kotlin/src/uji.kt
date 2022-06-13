//fun getFullAddress(streetName: String, number: Int): String {
//    return "I live in $streetName No. $number"
//}
//
//fun main(){
//    getFullAddress("Jl. Margonda" , 50)
//    getFullAddress(number = 50, streetName = "Jl. Margonda")
//    getFullAddress(streetName = "Jl. Margonda" , number = 50)
//}

enum class Rainbow(val color : String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}


fun main() {
//    println(Rainbow.valueOf("Red"))
    val total = listOf(1, 2, 3, 4, 5, 6)
    val result1 = total.take(5)
    val result2 = result1.takeLast(4)
    val result3 = result2.drop(1)
    val result4 = result3.dropLast(2)
    println(result4)
}