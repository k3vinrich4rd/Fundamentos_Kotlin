package fundamentos.estruturaderepeticao

fun main() {

    var sum: Int = 0
    var quantity: Int = 0
    var average: Int = 0


    do {
        print("Enter a temperature or 999 to exit the program: ")
        val temperature = readLine()!!.toInt()

        if (temperature != 999) {
            sum += temperature
            quantity++
        }
    } while (temperature != 999)

    average = sum / quantity
    println(average)

}