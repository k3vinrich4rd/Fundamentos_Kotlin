package fundamentos.nullsafety

fun main(){
    var name : String? = "Kevin"

    //Nesse caso n�o precisamos usar '?'
    // por j� estou verificando se o valor � nulo
    if (name != null){
        println(name.length)
    }

    //Outro caso
    //Quando � usado "!!" damos certeza que valor usado n�o � nulo
    //� uma garantia

    var toShort : Short = name !!.length.toShort()
}