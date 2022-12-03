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
    //É possível trocar o it por qualquer outra variável
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
        Ao imprimir a variável result o retorno é um kotlin.
        Unit significa que o retorno é um valor não útil. Portanto,
        concluímos que o let não retorna um valor.
     */
}