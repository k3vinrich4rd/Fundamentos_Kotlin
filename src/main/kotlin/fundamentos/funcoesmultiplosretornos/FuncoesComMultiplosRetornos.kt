package fundamentos.funcoesmultiplosretornos

fun retornarUmNumeroPorExtenso(number: Int): String {
    return if (number == 5) {
        return "Five"
    } else if (number == 6) {
        return "Six"
    } else if (number == 7) {
        "Seven"
    } else {
        return "Number is not mapped"
    }
}

fun main() {
    println(retornarUmNumeroPorExtenso(5))
    println(retornarUmNumeroPorExtenso(6))
    println(retornarUmNumeroPorExtenso(7))
}
