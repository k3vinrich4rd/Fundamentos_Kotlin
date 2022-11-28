package fundamentos

/*
Para acessar os atributos rec�m-declarados
� preciso inserir a palavra  "val" antes dos nomes dos atributos
essa palavra indica que aquele atributo � uma variavel (imut�vel)
Exemplo:

class Carro(val color: String, val yearManufacturing: Int) {
}

fun main() {
    var carro = Carro("Cinza", 1997)
    println(carro.color)
    println(carro.yearManufacturing)
}

mas para conseguir mudar o valor da vari�vel basta inserir
a palavra "var" que a variavel se torna uma variavel (mut�vel)
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

//Para fazer composi��o:
class Car(var color: String, var anoDeFabricacao: Int, var owner: Owner) {

}

data class Owner(var name: String, var age: Int) {

}

fun main() {
    //Para fazer composi��o:
    var car = Car("White", 1997, Owner("Kevin Richard", 20))
    println(car.color)
    car.color = "Black"
    println(car.color)
    println(car.owner.name)
    car.owner.name = "Julia"
    println(car.owner)

}