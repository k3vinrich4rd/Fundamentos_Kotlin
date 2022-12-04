package fundamentos.estruturadecondicao

import fundamentos.enums.Color

//Corpo de expressão
fun obterMnemonica(color: Color) =
    when (color) {
        Color.RED -> "Ver"
        Color.YELLOW -> "Alguém"
        Color.GREEN -> "Viver"
        Color.BLUE -> "Além é"
        Color.ORANGE -> "Legal"
        else -> "Color is not Mapped"
    }

//Corpo de bloco (É necessário usar a palavra 'return')
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