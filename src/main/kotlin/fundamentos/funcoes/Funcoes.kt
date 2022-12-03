package fundamentos.funcoes
/*
/Unit - significa que a fun��o vai retornar vazio
ent�o escrever Unit � opcional,
uma fun��o pode retornar um valor
Uma fun��o que retorna um valor tem se ":" representando a a��o
Para armazenar um valor em uma vari�vel:

fun main() {
    var name = returnName()
    println(name)
}
 */

/*
/Como passar uma fun��o como argumento
Detalhe: A fun��o tem que ser do mesmo tipo que o construtor exige
Exemplo:
 */
/*
Outra forma de se escrever:
fun main() : Unit{ por padr�o retorna Unit
}
 */
fun main() { //Fun��o padr�o de execu��o
    dizOi(returnName(), 20)
    dizOi("Vinicius jr", 21)

    /*
  /Tamb�m � poss�vel passar os argumentos fora de ordem:
  Mas a forma de impress�o que aparece na tela � a mesma,
  pois segue o que foi argumentado no m�todo que est� sendo usado
  Exemplo:
   */

    dizOi(age = 42, name = "Carlos eduardo")
    dizOi("Paulo Renan")

}

//Como fazer um m�todo (Fun��o)
fun returnName(): String {
    return "Kevin Richard"
}

/*
/Tamb�m � poss�vel setar um valor,
tirando a necessidade de informa - lo no argumento do m�todo quando
ele for chamado
 */
fun dizOi(name: String, age: Int = 27) {
    println("Hello $name you has $age ages")
}

/*
Par�metros na fun��o: valores que n�o v�o estar predefinidos na fun��o
Mas que ela vai receber e fazer algo
 */
