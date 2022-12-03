package fundamentos.scopingfunction

data class Product(
    var title: String,
    var price: Double,
    var isActive: Boolean
) {
    fun deactivate() {
        isActive = false
    }
}
/*
Instanciando um objeto sem let :

    product.title = "Smartphone Bonito"
    product.price = 1000.00
    product.deactivate()
 */

fun main() {
    //� poss�vel trocar o it por qualquer outra vari�vel
    val product = Product("Smartphone", 999.99, true)
    product.let {
        it.title = "cama de casal"
        it.price = 1000.00
        it.deactivate()

        println(product)

    }
    val result = product.let {
        it.title = "Smartphone"
        it.price = 1000.00
        it.deactivate()
    }
    print(result)

    /*
        Ao imprimir a vari�vel result o retorno � um kotlin.
        Unit significa que o retorno � um valor n�o �til. Portanto,
        conclu�mos que o let n�o retorna um valor.
     */
}