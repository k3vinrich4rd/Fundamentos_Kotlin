package fundamentos.stringtemplates

fun main() {
    val name = "Douglas "
    println("The result this sum is: ${sum(5, 10)}, $name")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}