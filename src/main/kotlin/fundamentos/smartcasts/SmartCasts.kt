package fundamentos.smartcasts

interface Expressao

class Number(val value: Int) : Expressao
class Sum(val left: Expressao, val right: Expressao) : Expressao

/*
(Antes da refatoração):

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Number) {
        return expressao.value
    } else if (expressao is Sum) {
        return avaliacao(expressao.left) + avaliacao(expressao.right)
    }
    throw IllegalArgumentException("Expressão desconhecida")
}
 */

fun avaliacao(expressao: Expressao): Int =
    when (expressao) {
        is Number -> {
            println("Expressão com número: ${expressao.value}")
            expressao.value
        }
        is Sum -> {
            avaliacao(expressao.left) + avaliacao(expressao.right)
        }
        else -> throw IllegalArgumentException("Expressão desconhecida")

    }

fun main() {
    val result = avaliacao(Sum(Sum(Number(1), Number(2)), Number(4)))
    println(result)
}

