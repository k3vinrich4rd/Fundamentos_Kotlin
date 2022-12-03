package fundamentos.atributosacessos

/*
Para acessar os atributos recém-declarados
é preciso inserir a palavra  "val" antes dos nomes dos atributos
essa palavra indica que aquele atributo é uma variável (imutável)
Exemplo:
class Carro(val color: String, val yearManufacturing: Int) {
}
fun main() {
    var carro = Carro("Cinza", 1997)
    println(carro.color)
    println(carro.yearManufacturing)
}
mas para conseguir mudar o valor da variável basta inserir
a palavra "var" que a variável se torna uma variável (mutável)
Exemplo:
class Carro(var color: String, var yearManufacturing: Int) {
}
fun main() {
    var carro = Carro("white", 1997)
    println(carro.color)
    carro.color = "black"
    println(carro.color)
}
 */

//Para fazer composição:
class Car(var color: String, var anoDeFabricacao: Int, var owner: Owner) {

}

data class Owner(var name: String, var age: Int) {

}

fun main() {
    //Para fazer composição:
    var car = Car("White", 1997, Owner("Kevin Richard", 20))
    println(car.color)
    //Mudando a cor do carro:
    car.color = "Black"
    println(car.color)
    //Imprimindo o nome do dono do carro:
    println(car.owner.name)
    //Mudando o nome do dono do carro:
    car.owner.name = "Jhonatan Tavares"
    println(car.owner.name)


}