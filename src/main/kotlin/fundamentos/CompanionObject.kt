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
//Usado mais para valores est�ticos
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
   O companion Object � como se fosse um m�todo est�tico
   Ent�o, n�o � necess�rio instanciar um objeto para acessar os seus m�todos
     */
}