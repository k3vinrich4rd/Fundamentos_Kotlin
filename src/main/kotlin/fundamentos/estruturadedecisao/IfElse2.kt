package fundamentos.estruturadedecisao

fun main() {
    notesAverage(3)
    notesAverage(5)
    notesAverage(7)
}

/*
/Se a nota > 6 -> passou
/Se a nota > 4 -> recuperação
/Se a nota < 4 -> reprovado

 */
fun notesAverage(nota: Int) {
    if (nota < 4) {
        println("Disapproved")
    } else if (nota >= 4 && nota < 6) {
        println("Recovery")
    } else {
        println("Approved")
    }


}