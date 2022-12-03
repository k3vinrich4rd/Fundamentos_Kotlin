package fundamentos.classe

class Rectangle(
    private val height: Int,
    private val width: Int
) {
    //Escopo de express�o
    val isQuadrado
        get() = height == width //Accessor customizado


    //A Fun��o acima � equivalente a:
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
Forma principiante para se declarar uma fun��o (Escopo de express�o)
{
    val isQuadrado: Boolean
        get() { // Escopo de express�o
            return height == width //Accessor customizado
        }
}
 */