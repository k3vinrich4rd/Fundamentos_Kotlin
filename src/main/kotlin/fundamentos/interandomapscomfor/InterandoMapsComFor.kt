package fundamentos.interandomapscomfor

import java.util.TreeMap

// Imprimir as representa��es bin�rios dos caracteres de A a F

fun main() {
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.toInt()) // Para converter para bin�rio
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$letter - $binary")
    }

}