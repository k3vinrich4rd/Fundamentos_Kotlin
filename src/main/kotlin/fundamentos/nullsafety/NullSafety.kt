package fundamentos.nullsafety

/*
null safety = Seguran�a nula
//Os valores das variaveis tem restri��o a nulo
por isso usamos o null safety
 */

fun main (){
    //Para a vari�vel poder receber valores nulos
    //Nesse caso se o nome for null, o retorno tamb�m ser�
    val name : String ? = null
    println(name?.length)
}