package fundamentos.collections

fun main() {
    //ArrayList - Classe
    val frutas1 = arrayListOf<String>()
    frutas1.add("Ma��")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    //ArrayList - Fun��o
    val frutas2 = arrayListOf("Ma��s", "Banana", "Morango")
    println(frutas2)

    //Confirmando a cole��o da biblioteca:
    println(HashSet::class.java) // Java

    //Outras fun��es apenas do kotlin
    println(frutas2.last()) // Last - �ltima = Pega o �ltimo elemento da lista

    val numbers = setOf(1, 14, 2)
    println(numbers.max()) // Retorna o valor m�ximo na lista

    val numbersTwo = setOf(5, 8, 1)
    println(numbersTwo.min()) // Retorna o valor m�nimo na lista
}