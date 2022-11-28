package fundamentos.classe
/*
Para criar uma classe em kotlin
detalhe: Ao criar a classe você já pode criar o construtor e
o código após a essa instancia  não necessita ficar no escopo da classe
 */

class Pessoa(var name: String, var age: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${name}, Idade: ${age}"
    }

}

//Para fazer a função main
fun main() {
    //Para instanciar um objeto da classe
    var pessoa = Pessoa("Julia", 19)
    println(pessoa)


}

