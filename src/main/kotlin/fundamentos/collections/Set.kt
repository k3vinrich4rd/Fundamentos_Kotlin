package fundamentos.collections

fun main() {
    val listNormal = mutableListOf(1, 2, 4, 4, 4, 4, 4)
    println("Lista: $listNormal")


//Para definir valores n�o repetidos numa lista,
    //pois os valores duplicados s�o unificados
    //Detalhe: tudo que podemos fazer com uma lista normal
    //Conseguimos fazer com o setOf (conjunto de)
    val numbersListSet = setOf(2, 3, 4, 4, 4)
    println("Set : $numbersListSet")

    //Para verificar se cont�m um elemento espec�fico em uma lista:
    println(numbersListSet.contains(4))//Valor boolean
}