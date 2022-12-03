package fundamentos.nullsafety

fun main() {

    //"?: = Elvis Operator"
    /*
    /O elvis operator acrescenta um número
    se qualquer coisa for nulo (Verificador de nulo)
    Exemplo:
     */

    val name: String? = null
    val tamanho: Int = name?.length ?: 0
    println(tamanho)
}

//Para uma lista poder conter elementos nulos, mas sem poder ser nula:
var list: List<Int?> = listOf(1, 2, null, 4)

//Para uma poder ser nula:
var listaNullable : List<Int>? = null