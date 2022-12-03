package fundamentos.estruturadecondicao

/*
Essa estrutura é usada quando temos mais que duas opções
 */
fun main() {
    //When = Quando
    //Sempre para na primeira validação verdadeira

    when (21) {
        //É possível agrupar um conjunto de números
        5, -5 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        //É possível abrir um bloco de comando também:
        10 -> {
            println("x == 10")
            println("X é uma dezena")
        }
        //Uma range:
        in 11..15 -> println("x está entre 11 e 15")
        //Uma range com negação:
        !in 16.. 20 -> println("O número não está entre 16 a 20")
        else -> println("Number is not mapped")
    }
}