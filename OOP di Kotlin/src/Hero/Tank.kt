package Hero

abstract class Tank (val name:String){
    init {
        println("Hero Tank dengan $name adalah hero pelindung")
    }
}

class JohnsonTank(name:String):Tank(name){

}

//interface itu ada variabel dan function yang tidak memiliki value
//INterface ini juga harus diturunkan yakni variabel dan function
interface interaction{
    val name:String
    fun Sayhello(Name:String)
}

//Class turunannya, akan menugaskan bahwa variabel dan
// function akan memiliki value dan body
class PowerTank(override val name: String):interaction{ //Penggunaan variabel yang diturunkan
    override fun Sayhello(Name: String) {   //Penggunaan fucntion/behaviour yang diturunkan
        println("Hallo Power Tank $Name dengan ${this.name}")
    }
}