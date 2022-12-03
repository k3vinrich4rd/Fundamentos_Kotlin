package fundamentos.estruturadecondicao

fun pairOrOdd(number: Int): String {
    return if (number % 2 == 0) {
        "This number is Pair"
    } else {
        "This number is Odd"
    }
}

fun main() {
    println(pairOrOdd(6))
    println(pairOrOdd(3))
}