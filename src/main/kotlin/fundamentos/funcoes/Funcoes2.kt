package fundamentos.funcoes

fun main() {
    //Passando os argumentos
    println(max(10, 5))
    println(max1(2, 10))

}

//Corpo de bloco(Fun��o com multiplos retornos)
//Par�metros
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b //Se a for maior que b retorne a, se n�o retorne b
}

//Corpo de express�o (Para casos de apenas uma express�o)
// tamb�m da para simplificar a fun��o por conta da infer�ncia do kotlin:
fun max1 (a : Int , b : Int) = if (a > b) a else b