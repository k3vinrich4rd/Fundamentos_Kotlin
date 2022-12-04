package fundamentos.operadorin

fun main() {
    println(isLetter('7'))
    println(isNotDigit('5'))
}

//Verifica se est� no intervalo
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

//Verifica se n�o est� no intervalo'
fun isNotDigit(c: Char) = c !in '0'..'9'