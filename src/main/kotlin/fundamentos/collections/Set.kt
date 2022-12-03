package fundamentos.collections

fun main() {
    val listNormal = mutableListOf(1, 2, 4, 4, 4, 4, 4)
    println("Lista: $listNormal")


//Para definir valores não repetidos numa lista,
    //pois os valores duplicados são unificados
    //Detalhe: tudo que podemos fazer com uma lista normal
    //Conseguimos fazer com o setOf (conjunto de)
    val numbersListSet = setOf(2, 3, 4, 4, 4)
    println("Set : $numbersListSet")

    //Para verificar se contém um elemento específico em uma lista:
    println(numbersListSet.contains(4))//Valor boolean
}