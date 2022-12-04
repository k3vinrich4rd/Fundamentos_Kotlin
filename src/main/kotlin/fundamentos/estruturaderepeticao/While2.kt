package fundamentos.estruturaderepeticao
//Crie um programa que calcule e exiba o resultado da
//Média das temperaturas informadas pelo usuário

fun main() {

    var temperature: Int = 0;
    var sum: Int = 0
    var quantity: Int = 0
    var average: Int = 0

    while (temperature != 999) {
        print("Enter a temperature or 999 to exit the program: ")
        temperature = readLine()!!.toInt()

        if (temperature != 999) {
            sum += temperature
            quantity++
        }
    }
    average = sum/ quantity
    println("average temperature result: $average")


}