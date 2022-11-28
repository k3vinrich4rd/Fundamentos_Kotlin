package fundamentos.funcoes
/*
/Unit - significa que a função vai retornar vazio
então escrever Unit é opcional

uma função pode retornar um valor
Uma função retorna um valor o ":" representa isso

Para armazenar um valor em uma variável:
fun main() {
    var name = returnName()
    println(name)
}
 */

/*
/Como passar uma função como argumento
Detalhe: A função tem que ser do mesmo tipo que o construtor exige
 */

fun main() { //Função padrão de execução
    dizOi(returnName(), 100)
    dizOi("Endrick", 33)
    /*
    /Também é possível passar os parâmetros fora de ordem:
    Mas a forma de impressão que aparece na tela é a mesma,
    pois segue o que foi argumentado no método que está sendo usado
     */
    dizOi(idade = 20, name = "Carlos eduardo")
    dizOi("Paulo Renan")  //Chamando o mesmo método com um valor setado:

}

//Como fazer um método (Função)
fun returnName(): String {
    return "Jhonatan Tavares"
}

/*
/Também é possível setar um valor,
tirando a necessidade de informa - lo no argumento do método quando
ele for chamado
 */
fun dizOi(name: String, idade: Int = 27) {
    println("Hello $name you are grade $idade bro")
}


/*
Parameters na função: valores que não vão estar predefinidos na função
Mas que ela vai receber e fazer algo
 */
