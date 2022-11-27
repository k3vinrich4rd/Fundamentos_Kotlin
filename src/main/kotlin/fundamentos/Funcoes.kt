package fundamentos

class Funcoes(var casa: String, var ageHome: Int) {
}

fun main() {
    var casa = Funcoes("Mansão", 20)
    println(casa.casa + " " + casa.ageHome)

}