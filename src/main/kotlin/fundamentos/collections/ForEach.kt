package fundamentos.collections

//It. É usado para acessar o elemento da vez:
//Iterar é: passar por todos os elementos de uma lista

fun main() {
    val firstList = listOf(1, 2, 3, 4)
    firstList.forEach {
        println(it)
    }
    println()

    //For de outra forma:
    val secondList = listOf(3, 5, 9, 10)
    for (number in secondList) {
        println(number)
    }
    //Para pegar um elemento isolado da lista

    //Primeira forma:
    println(firstList[0])
    //Segunda forma:
    println(secondList.get(0))

    println()
    //Para pegar o tamanho da lista:
    println(firstList.size)
    println(secondList.size)

    //Para saber o indices de um elemento
    println(firstList.indexOf(4))
    println(secondList.indexOf(10))

}