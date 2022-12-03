package fundamentos.classe
/*
Para criar uma classe em Kotlin
detalhe: Ao criar a classe � poss�vel j� criar o construtor e
 o c�digo ap�s a essa instancia n�o necessita ficar no escopo da classe

 */
class People(
    internal var name: String, //Propriedades
    private var age: Int)  {
    override fun toString(): String {
        return "Class: People, Name: $name, Age: $age"
    }
}

fun main() {
    //Para instanciar um objeto da classe:
    val people = People("Kevin Richard", 20)
    print(people)
}

