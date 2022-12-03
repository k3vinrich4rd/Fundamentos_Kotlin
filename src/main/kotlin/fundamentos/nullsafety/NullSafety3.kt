package fundamentos.nullsafety

//A exce��o de ponteiro nulo � lan�ada
// quando um aplicativo tenta usar um objeto ou refer�ncia de vari�vel que cont�m o valor nulo.
// Em Java, voc� pode atribuir nulo diretamente a qualquer vari�vel ou tipo de objeto.
// Mas como ele cria tantas brechas e falhas. Kotlin apresenta uma �tima solu��o para isso
import fundamentos.classe.People

fun main() {
    //A classe pode ser nula
    val people: People? = null

    println(people!!.name)

}