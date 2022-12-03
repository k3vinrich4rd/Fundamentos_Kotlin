package fundamentos.funcoes
/*
/Unit - significa que a função vai retornar vazio
então escrever Unit é opcional,
uma função pode retornar um valor
Uma função que retorna um valor tem se ":" representando a ação
Para armazenar um valor em uma variável:

fun main() {
    var name = returnName()
    println(name)
}
 */

/*
/Como passar uma função como argumento
Detalhe: A função tem que ser do mesmo tipo que o construtor exige
Exemplo:
 */
/*
Outra forma de se escrever:
fun main() : Unit{ por padrão retorna Unit
}
 */
fun main() { //Função padrão de execução
    dizOi(returnName(), 20)
    dizOi("Vinicius jr", 21)

    /*
  /Também é possível passar os argumentos fora de ordem:
  Mas a forma de impressão que aparece na tela é a mesma,
  pois segue o que foi argumentado no método que está sendo usado
  Exemplo:
   */

    dizOi(age = 42, name = "Carlos eduardo")
    dizOi("Paulo Renan")

}

//Como fazer um método (Função)
fun returnName(): String {
    return "Kevin Richard"
}

/*
/Também é possível setar um valor,
tirando a necessidade de informa - lo no argumento do método quando
ele for chamado
 */
fun dizOi(name: String, age: Int = 27) {
    println("Hello $name you has $age ages")
}

/*
Parâmetros na função: valores que não vão estar predefinidos na função
Mas que ela vai receber e fazer algo
 */
