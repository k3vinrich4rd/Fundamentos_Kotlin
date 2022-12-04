package fundamentos.enums

enum class Color(val red: Int, val green: Int, val blue: Int, val black: Int) { //Propriedades
    RED(255, 0, 0,0),
    ORANGE(255, 165, 0,0),
    YELLOW(255, 255, 0,0),
    GREEN(0, 255, 0,0),
    BLUE(0, 0, 255,0),
    BLACK(0, 0, 0,0);

    fun rgb() = ((red * 256 + green) * 256 + blue)

}

fun main() {
    //Também é possível chamar as propriedades além da função
    val rgbRed = Color.RED.rgb()
    println(rgbRed)

    val rgbOrange = Color.ORANGE.rgb()
    println(rgbOrange)

    val rgbYellow = Color.YELLOW.rgb()
    println(rgbYellow)

    val rgbGreen = Color.GREEN.rgb()
    println(rgbGreen)

    val rgbBlue = Color.BLUE.rgb()
    println(rgbBlue)
}