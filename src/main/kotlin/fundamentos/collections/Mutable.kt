package fundamentos.collections

fun main() {
    //Para fazer uma lista mutável:
    val list = mutableListOf(1, 2, 3, 4, 6)
    println(list)
    //Para adicionar:
    list.add(8)
    println(list)
    list.add(9)
    println(list)

    //Para saber a posição de indices de um elemento
    println(list.indexOf(9))

    //Para remover um valor da lista via elemento
    println(list.remove(9))
    //Para remover um valor da lista via indices
    println(list.removeAt(0))
    println(list.indexOf(0))


    //Para sobrescrever um valor de indices
    list[0] = 20
    println(list)

}