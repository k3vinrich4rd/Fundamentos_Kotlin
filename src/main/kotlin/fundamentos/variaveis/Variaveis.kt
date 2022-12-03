package fundamentos.variaveis

/*
Em kotlin, existem duas categorias de variáveis:

var(É possível fazer mudanças nos seus valores)
var = É uma variável do tipo mutável

val (Impossivel fazer mudanças nos seus valores)
val = É uma variável do tipo imutável
Exemplo:
 */

fun main() {
    //Instanciando uma variável (var):
    //Se declara uma variável String por debaixo dos panos
    var name = "João"
    println(name)

    //Mutabilidade
    //Se declara uma variável String por debaixo dos panos
    name = "roberto"
    println(name)

    //Instanciando uma variável (val):
    //Imutável
    val nameVal = "Kleber"
    println(nameVal)

    //Declarando uma variável e seu tipo básico
    val nameString: String = "Jhonatan Tavares"
    println(nameString)



    //Outras formas de declaração:
    var casa : String = "Sobrado"
    println(casa)

    casa = "Mansão"
    println(casa)



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
Exemplo:

class Variaveis {
   lateinit var  teste: String
}
 */

class Variaveis {
    // late init = inicialização tardia
    //Var é para ser mutável
    lateinit var teste: String

    fun inicializarVariaveis() {
        teste = "Teste"
        println(teste)
    }

}