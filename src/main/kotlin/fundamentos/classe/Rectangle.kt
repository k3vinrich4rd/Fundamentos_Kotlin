package fundamentos.classe

class Rectangle(
    private val height: Int,
    private val width: Int
) {
    //Escopo de expressão
    val isQuadrado
        get() = height == width //Accessor customizado


    //A Função acima é equivalente a:
    fun isQuandrado2(): Boolean {
        return height == width
    }
}

fun main() {
    val rectangle = Rectangle(11, 10)
    println(rectangle.isQuadrado)

    val rectangle2 = Rectangle(11, 11)
    println(rectangle2.isQuandrado2())

}


/*
Forma principiante para se declarar uma função (Escopo de expressão)
{
    val isQuadrado: Boolean
        get() { // Escopo de expressão
            return height == width //Accessor customizado
        }
}
 */