package fundamentos.operadorin

fun main() {
    println(isLetter('7'))
    println(isNotDigit('5'))
}

//Verifica se está no intervalo
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

//Verifica se não está no intervalo'
fun isNotDigit(c: Char) = c !in '0'..'9'