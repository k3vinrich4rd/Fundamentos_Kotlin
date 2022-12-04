package fundamentos.estruturadecondicao

import fundamentos.enums.Color

//Corpo de express�o
fun obterMnemonica(color: Color) =
    when (color) {
        Color.RED -> "Ver"
        Color.YELLOW -> "Algu�m"
        Color.GREEN -> "Viver"
        Color.BLUE -> "Al�m �"
        Color.ORANGE -> "Legal"
        else -> "Color is not Mapped"
    }

//Corpo de bloco (� necess�rio usar a palavra 'return')
fun obterTemperatura(color: Color): String {
    return when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Cor quente"
        Color.GREEN -> "Cor Neutra"
        Color.BLUE -> "Cor Fria"
        else -> "Color is not Mapped"
    }
}

fun main() {
    val mnemonica = obterMnemonica(Color.GREEN)
    println(mnemonica)

    val temperatura = obterTemperatura(Color.BLUE)
    println(temperatura)

}