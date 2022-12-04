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
        //Como lan�ar uma exce��o:
        throw IllegalArgumentException("O n�mero informado deve estar entre 1 e 100")
    }
}

fun readAge(): Int? { // File Reader = Para conseguir ler uma informa��o que vem de um arquivo
    val reader = FileReader(File("src/main/kotlin/fundamentos/tratamentodeexcecoes/idades.txt")) // caminho do arquivo
    /*
    Buffer (Mem�ria temporaria)- regi�o de mem�ria f�sica utilizada para armazenar
    temporariamente os dados enquanto eles est�o sendo movidos de um lugar para outro.
     */
    val buffer = BufferedReader(reader)

    return try{// Tentar executar esse c�digo
        val number = buffer.readLine()
        Integer.parseInt(number) //Retornar um inteiro

        //capturar e tratar (Exce��o referente ao c�digo acima
    }catch (e : NumberFormatException){
        null
    }finally { //Limpa a mem�ria
        buffer.close()
    }
    //Try catch (Tentar Capturar)
}