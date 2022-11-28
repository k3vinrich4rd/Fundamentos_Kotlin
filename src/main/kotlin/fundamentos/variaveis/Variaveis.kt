package fundamentos.variaveis

/*
Em kotlin, existem dois tipos de vari�veis:

(� poss�vel fazer mudan�as nos seus valores)
var = � uma vari�vel do tipo mut�vel

(Impossivel fazer mudan�as nos seus valores)
val = � uma vari�vel do tipo imut�vel

Exemplo:
 */
fun main() {
    val name = "kyky"
    println(name)

    //Declarando uma vari�vel String por debaixo dos panos
    val nomeVal = "Kevin Richard"
    println(nomeVal)

    // val idade = 24

    var nome: String
    nome = "Jhonatan Tavares"
    println(nome)


}

/*
/� poss�vel criar variaveis fora das fun��es,
mas no caso, vari�veis que ficam fora de fun��es precisam
ser inicializadas
Exemplo:

class Variaveis {
    val teste: String = "Teste"

}

//Ou coloca late init
class Variaveis {
   lateinit var  teste: String
}
 */


class Variaveis {
    // late init = inicializa��o tardia
    //Var � para ser mut�vel
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}


