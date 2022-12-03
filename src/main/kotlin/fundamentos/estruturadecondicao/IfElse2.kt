package fundamentos.estruturadecondicao

fun noteAverage(note: Int) {
    if (note < 4) {
        println("Disapproved")
    } else if (note in 4..5) {
        println("Recovery")
    } else {
        println("Approved")
    }

}
/*
/Se a nota > 6 -> passou
/Se a nota > 4 -> recuperação
/Se a nota < 4 -> reprovado
 */
fun main() {
    noteAverage(3)
    noteAverage(5)
    noteAverage(7)
}