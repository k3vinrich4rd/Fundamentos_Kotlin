package fundamentos.estruturadedecisao

//Par ou impar
fun main() {
    println(evenOrOdd(6))
    println(evenOrOdd(3))
}

fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0) {
        "O n�mero � par"
    } else {
        "O n�mero � impar"
    }

}