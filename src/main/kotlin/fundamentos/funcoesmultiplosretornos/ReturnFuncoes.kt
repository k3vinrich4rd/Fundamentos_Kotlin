package fundamentos.funcoesmultiplosretornos

fun retornaNumeroPorExtenso(numero: Int): String {
    return if (numero == 5) {
        "Cinco"
    } else if (numero == 6) {
        "Seis"
    } else if (numero == 7) {
        "Sete"
    } else {
        "Número não mapeado"
    }
}

fun main(){
    println(retornaNumeroPorExtenso(7))
}
