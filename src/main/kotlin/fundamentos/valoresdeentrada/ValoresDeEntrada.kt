package fundamentos.valoresdeentrada

fun main(args: Array<String>) {

    print("Enter your name: ")
    //Readline = leia linha (Para String)
    val name: String = readLine()!!

    print("Enter your age: ") //to int = para inteiro
    val age: Int = readLine()!!.toInt()

    print("Enter your salary: ")
    val salary: Double = readLine()!!.toDouble()

    print("are you employed? ")
    val response: Boolean = readLine()!!.toBoolean()


    println("\nName: $name, Age: $age, Salary: $salary, are you employed? $response")


}