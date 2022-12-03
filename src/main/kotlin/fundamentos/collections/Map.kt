package fundamentos.collections

fun main() {
    //Para associar dois valores numa lista:
    // val mapNameAge = mapOf("Kevin Richard" to 20, "Let" to 22, "Bruno" to 23)
    //Pode existir valores repetidos, mas n�o chaves(ele sob reescreve)
    val mapNameAge = mutableMapOf("Kevin Richard" to 20, "Let" to 22, "Bruno" to 23)
    mapNameAge["Luis"] = 30
    mapNameAge["Sheila"] = 45
    //mapNameAge.put("Luis", 30) - Outra forma de fazer a mesma coisa
    println(mapNameAge)

    mapNameAge.remove("Sheila")
    println(mapNameAge)

    //Para adicionar caso a condi��o for verdadeira
    mapNameAge.putIfAbsent("Sheila", 45) //putIfAbsent = inserir se ausente
    mapNameAge.putIfAbsent("Sheila", 45) //N�o ser� adicionado
    println(mapNameAge)

}