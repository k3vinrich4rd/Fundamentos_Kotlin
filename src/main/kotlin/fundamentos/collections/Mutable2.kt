package fundamentos.collections

fun main() {
    val list = mutableListOf(2, 7, 12, 9, 1, 3)
    println(list)

    //Para ordenar (sort) uma lista
    list.sort()
    println(list)

    //Para embaralhar (shuffle)
    list.shuffle()
    println(list)

    println()


    //Também funciona com uma lista de nomes

    //(sort)
    val firstListNames = mutableListOf("João", "Paulo Renan", "Jhonatan Tavares", "Let", "Ana", "Bruno")
    firstListNames.sort()
    println(firstListNames)

    //(shuffle)
    val secondListNames = mutableListOf("Ketelyn", "Ted", "Vilma", "Eduardo", "Marli")
    secondListNames.shuffle()
    println(secondListNames)
}