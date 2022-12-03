package fundamentos.funcoes

fun main() {
    //Passando os argumentos
    println(max(10, 5))
    println(max1(2, 10))

}

//Corpo de bloco(Função com multiplos retornos)
//Parâmetros
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b //Se a for maior que b retorne a, se não retorne b
}

//Corpo de expressão (Para casos de apenas uma expressão)
// também da para simplificar a função por conta da inferência do kotlin:
fun max1 (a : Int , b : Int) = if (a > b) a else b