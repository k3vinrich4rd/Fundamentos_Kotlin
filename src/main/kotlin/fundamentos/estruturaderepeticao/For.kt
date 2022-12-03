package fundamentos.estruturaderepeticao

//Contador crescente
fun printDeUmADez() {
    //number = indices que recebe os valores de 1 á 10
    //Para cada valor de 1 a dez, faça:
    for (number in 1..10) {
        println(number)
    }
}

//Contador decrescente
fun printDeDezAUm() {
    //dowTo = descer para
    for (number in 10 downTo 0) {
        println(number)
    }
}

//Contador crescente (A cada dois)
fun printDeDoisEmDois() {
    //Step = escada
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

fun main() {
    printDeUmADez()
    println()
    printDeDezAUm()
    println()
    printDeDoisEmDois()
    println()
    printRange(10, 20)

}