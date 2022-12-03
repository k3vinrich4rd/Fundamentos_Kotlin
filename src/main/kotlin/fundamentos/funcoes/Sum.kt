package fundamentos.funcoes

fun printSum(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

//Ocultando o tipo de retorno
fun printSum2(firstNumber: Int, secondNumber: Int) {
    println("Sum of $firstNumber and $secondNumber is: ${firstNumber + secondNumber}")
}

fun main() {
    //Função com retorno (Soma)
    println("Sum of 3 and 5 is: ${printSum(3, 5)}")

    //Exemplo com ocultação de retorno (Subtração)
    printSum2(-1, 8)
}