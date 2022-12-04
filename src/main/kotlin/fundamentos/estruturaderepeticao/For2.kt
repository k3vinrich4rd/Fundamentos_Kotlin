package fundamentos.estruturaderepeticao
//Números divisíveis por 15 = FizzBuzz
//Números divisíveis por 3 = Fizz
//Números divisíveis por 5 = Buzz

fun fizzBuzz(number: Int) = when { //When sem argumento
    number % 15 == 0 -> "FizzBuzz"
    number % 3 == 0 -> "Fiz"
    number % 5 == 0 -> "Buzz"
    else -> "Number is not mapped"
}

fun main() {
    for (number in 1..100){ //Verifica se o número é maior ou igual a 100
      println(fizzBuzz(number))

    }
}