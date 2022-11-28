package fundamentos.estruturaderepeticao

fun main() {
    printDeUmADez()
    println()
    printDeDezAUm()
    println()
    printDeDoisEmDois()
    printRange(10, 20)
}

//Contador crescente
fun printDeUmADez() {
    for (number in 1..10) {
        println(number)
    }
}

//Contador decrescente
fun printDeDezAUm() {
    for (number in 10 downTo 1) {
        println(number)
    }
}

//Contador crescente (De dois em dois)
fun printDeDoisEmDois() {
    for (number in 2..10 step 2) {
        println(number)
    }
}

//Passando um parâmetro na função
fun printRange(inicio: Int, fim: Int) {
    for (number in inicio..fim) {
        println(number)
    }
}


