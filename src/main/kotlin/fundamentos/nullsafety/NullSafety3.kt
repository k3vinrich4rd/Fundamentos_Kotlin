package fundamentos.nullsafety

//A exceção de ponteiro nulo é lançada
// quando um aplicativo tenta usar um objeto ou referência de variável que contém o valor nulo.
// Em Java, você pode atribuir nulo diretamente a qualquer variável ou tipo de objeto.
// Mas como ele cria tantas brechas e falhas. Kotlin apresenta uma ótima solução para isso
import fundamentos.classe.People

fun main() {
    //A classe pode ser nula
    val people: People? = null

    println(people!!.name)

}