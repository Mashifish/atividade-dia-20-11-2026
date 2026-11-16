class `exercicio 2` {
}
fun main() {
    val codigosTransacao = arrayOf("TRX-001", "TRX-002", "TRX-042", "TRX-088", "TRX-099")
    val busca = "TRX-042"

    for ((indice, codigo) in codigosTransacao.withIndex()) {
        if (codigo == busca) {
            println("Código '$busca' encontrado na posição (índice) $indice.")
            break // Interrompe o laço imediatamente
        }
    }
}