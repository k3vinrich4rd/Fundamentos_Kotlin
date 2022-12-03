package fundamentos.collections

fun main() {
    //<Tipo> é opcional
    //
    var list = listOf<Int>(1, 2, 3, 4, 6) //listOf é um tipo de lista imutável
    //Para filtrar a lista pelos números pares
    val pares = list.filter { it % 2 == 0 }.first() //Filtra pelo primeiro número ímpar
    println(pares)

}