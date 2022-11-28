package fundamentos.funcoes
/*
/Unit - significa que a fun��o vai retornar vazio
ent�o escrever Unit � opcional

uma fun��o pode retornar um valor
Uma fun��o retorna um valor o ":" representa isso

Para armazenar um valor em uma vari�vel:
fun main() {
    var name = returnName()
    println(name)
}
 */

/*
/Como passar uma fun��o como argumento
Detalhe: A fun��o tem que ser do mesmo tipo que o construtor exige
 */

fun main() { //Fun��o padr�o de execu��o
    dizOi(returnName(), 100)
    dizOi("Endrick", 33)
    /*
    /Tamb�m � poss�vel passar os par�metros fora de ordem:
    Mas a forma de impress�o que aparece na tela � a mesma,
    pois segue o que foi argumentado no m�todo que est� sendo usado
     */
    dizOi(idade = 20, name = "Carlos eduardo")
    dizOi("Paulo Renan")  //Chamando o mesmo m�todo com um valor setado:

}

//Como fazer um m�todo (Fun��o)
fun returnName(): String {
    return "Jhonatan Tavares"
}

/*
/Tamb�m � poss�vel setar um valor,
tirando a necessidade de informa - lo no argumento do m�todo quando
ele for chamado
 */
fun dizOi(name: String, idade: Int = 27) {
    println("Hello $name you are grade $idade bro")
}


/*
Parameters na fun��o: valores que n�o v�o estar predefinidos na fun��o
Mas que ela vai receber e fazer algo
 */
