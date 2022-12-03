package fundamentos

class MyClass(
    var name: String,
    var address: String,
    var age: Int
) {
    companion object {
        fun criarComValoresPadrao(): MyClass {
            return MyClass("Kevin Richard", "Teste", 20)
        }
    }
}
//Usado mais para valores estáticos
class SecondClass(
    var name: String,
    var address: String,
    var age: Int
) {
    fun criaClasse(): SecondClass {
        return SecondClass("Kevin Richard", "Teste", 20)
    }
}

fun main() {
    var secondClass = SecondClass("Kevin", "teste", 20).criaClasse()

    //Com companion Object:
    var myClass = MyClass.criarComValoresPadrao()

    /*
   O companion Object é como se fosse um método estático
   Então, não é necessário instanciar um objeto para acessar os seus métodos
     */
}