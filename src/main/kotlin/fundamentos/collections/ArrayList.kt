package fundamentos.collections

fun main() {
    //ArrayList - Classe
    val frutas1 = arrayListOf<String>()
    frutas1.add("Maçã")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    //ArrayList - Função
    val frutas2 = arrayListOf("Maçãs", "Banana", "Morango")
    println(frutas2)

    //Confirmando a coleção da biblioteca:
    println(HashSet::class.java) // Java

    //Outras funções apenas do kotlin
    println(frutas2.last()) // Last - Última = Pega o último elemento da lista

    val numbers = setOf(1, 14, 2)
    println(numbers.max()) // Retorna o valor máximo na lista

    val numbersTwo = setOf(5, 8, 1)
    println(numbersTwo.min()) // Retorna o valor mínimo na lista
}