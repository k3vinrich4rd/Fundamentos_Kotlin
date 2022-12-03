package fundamentos.nullsafety

/*
null safety = Segurança nula
//Os valores das variaveis tem restrição a nulo
por isso usamos o null safety
 */

fun main (){
    //Para a variável poder receber valores nulos
    //Nesse caso se o nome for null, o retorno também será
    val name : String ? = null
    println(name?.length)
}