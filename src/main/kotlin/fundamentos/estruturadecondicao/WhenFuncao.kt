package fundamentos.estruturadecondicao

fun main() {

    //Uma forma para imprimir
    println(comecaComOi(6))

    //Outra forma:
    when {
        comecaComOi(5) -> println("5")
        comecaComOi("oi, tudo bem?") -> println("BRASILLLL")
        comecaComOi("oi, estou bem!") -> println("CASEEEEEEMIITOOO")
    }
}


fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}