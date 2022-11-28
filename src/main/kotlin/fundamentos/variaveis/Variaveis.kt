package fundamentos.variaveis

/*
Em kotlin, existem dois tipos de variáveis:

(É possível fazer mudanças nos seus valores)
var = É uma variável do tipo mutável

(Impossivel fazer mudanças nos seus valores)
val = É uma variável do tipo imutável

Exemplo:
 */
fun main() {
    val name = "kyky"
    println(name)

    //Declarando uma variável String por debaixo dos panos
    val nomeVal = "Kevin Richard"
    println(nomeVal)

    // val idade = 24

    var nome: String
    nome = "Jhonatan Tavares"
    println(nome)


}

/*
/É possível criar variaveis fora das funções,
mas no caso, variáveis que ficam fora de funções precisam
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
    // late init = inicialização tardia
    //Var é para ser mutável
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}


