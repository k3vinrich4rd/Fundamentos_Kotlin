package fundamentos.tratamentodeexcecoes

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    try {
        val porcentagem = porcentagem(101)
        println(porcentagem)
    }catch (e : IllegalArgumentException){
        println(e.message)
    }
        val age = readAge()
        println(age)

}

fun porcentagem(number: Int): String {
    return if (number in 1..100) {
        "$number%"
    } else {
        //Como lançar uma exceção:
        throw IllegalArgumentException("O número informado deve estar entre 1 e 100")
    }
}

fun readAge(): Int? { // File Reader = Para conseguir ler uma informação que vem de um arquivo
    val reader = FileReader(File("src/main/kotlin/fundamentos/tratamentodeexcecoes/idades.txt")) // caminho do arquivo
    /*
    Buffer (Memória temporaria)- região de memória física utilizada para armazenar
    temporariamente os dados enquanto eles estão sendo movidos de um lugar para outro.
     */
    val buffer = BufferedReader(reader)

    return try{// Tentar executar esse código
        val number = buffer.readLine()
        Integer.parseInt(number) //Retornar um inteiro

        //capturar e tratar (Exceção referente ao código acima
    }catch (e : NumberFormatException){
        null
    }finally { //Limpa a memória
        buffer.close()
    }
    //Try catch (Tentar Capturar)
}