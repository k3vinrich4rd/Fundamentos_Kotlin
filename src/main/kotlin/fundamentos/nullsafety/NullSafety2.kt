package fundamentos.nullsafety

fun main(){
    var name : String? = "Kevin"

    //Nesse caso não precisamos usar '?'
    // por já estou verificando se o valor é nulo
    if (name != null){
        println(name.length)
    }

    //Outro caso
    //Quando é usado "!!" damos certeza que valor usado não é nulo
    //É uma garantia

    var toShort : Short = name !!.length.toShort()
}