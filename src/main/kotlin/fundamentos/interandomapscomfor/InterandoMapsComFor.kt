package fundamentos.interandomapscomfor

import java.util.TreeMap

// Imprimir as representações binários dos caracteres de A a F

fun main() {
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.toInt()) // Para converter para binário
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$letter - $binary")
    }

}