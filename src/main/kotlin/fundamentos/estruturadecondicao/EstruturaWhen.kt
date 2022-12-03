package fundamentos.estruturadecondicao

/*
Essa estrutura � usada quando temos mais que duas op��es
 */
fun main() {
    //When = Quando
    //Sempre para na primeira valida��o verdadeira

    when (21) {
        //� poss�vel agrupar um conjunto de n�meros
        5, -5 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        //� poss�vel abrir um bloco de comando tamb�m:
        10 -> {
            println("x == 10")
            println("X � uma dezena")
        }
        //Uma range:
        in 11..15 -> println("x est� entre 11 e 15")
        //Uma range com nega��o:
        !in 16.. 20 -> println("O n�mero n�o est� entre 16 a 20")
        else -> println("Number is not mapped")
    }
}