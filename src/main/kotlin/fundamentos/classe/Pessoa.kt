package fundamentos.classe
/*
Para criar uma classe em kotlin
detalhe: Ao criar a classe voc� j� pode criar o construtor e
o c�digo ap�s a essa instancia  n�o necessita ficar no escopo da classe
 */

class Pessoa(var name: String, var age: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${name}, Idade: ${age}"
    }

}

//Para fazer a fun��o main
fun main() {
    //Para instanciar um objeto da classe
    var pessoa = Pessoa("Julia", 19)
    println(pessoa)


}

