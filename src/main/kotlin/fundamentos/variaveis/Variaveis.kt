package fundamentos.variaveis

/*
Em kotlin, existem duas categorias de vari�veis:

var(� poss�vel fazer mudan�as nos seus valores)
var = � uma vari�vel do tipo mut�vel

val (Impossivel fazer mudan�as nos seus valores)
val = � uma vari�vel do tipo imut�vel
Exemplo:
 */

fun main() {
    //Instanciando uma vari�vel (var):
    //Se declara uma vari�vel String por debaixo dos panos
    var name = "Jo�o"
    println(name)

    //Mutabilidade
    //Se declara uma vari�vel String por debaixo dos panos
    name = "roberto"
    println(name)

    //Instanciando uma vari�vel (val):
    //Imut�vel
    val nameVal = "Kleber"
    println(nameVal)

    //Declarando uma vari�vel e seu tipo b�sico
    val nameString: String = "Jhonatan Tavares"
    println(nameString)



    //Outras formas de declara��o:
    var casa : String = "Sobrado"
    println(casa)

    casa = "Mans�o"
    println(casa)



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
Exemplo:

class Variaveis {
   lateinit var  teste: String
}
 */

class Variaveis {
    // late init = inicializa��o tardia
    //Var � para ser mut�vel
    lateinit var teste: String

    fun inicializarVariaveis() {
        teste = "Teste"
        println(teste)
    }

}