package fundamentos.collections

fun main() {
    //<Tipo> � opcional
    //
    var list = listOf<Int>(1, 2, 3, 4, 6) //listOf � um tipo de lista imut�vel
    //Para filtrar a lista pelos n�meros pares
    val pares = list.filter { it % 2 == 0 }.first() //Filtra pelo primeiro n�mero �mpar
    println(pares)

}