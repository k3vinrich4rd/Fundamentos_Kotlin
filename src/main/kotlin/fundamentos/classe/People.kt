package fundamentos.classe
/*
Para criar uma classe em Kotlin
detalhe: Ao criar a classe é possível já criar o construtor e
 o código após a essa instancia não necessita ficar no escopo da classe

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

