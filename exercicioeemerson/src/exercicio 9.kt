fun main() {
    val matriz = arrayOf(
        intArrayOf(0, 5, 10),
        intArrayOf(-2, 0, 15),
        intArrayOf(8, 3, 0)
    )

    var somaPositivos = 0

    for (linha in matriz) {
        for (valor in linha) {
            if (valor == 0) {
                continue // Pula o processamento se o valor for zero
            }
            somaPositivos += valor
        }
    }

    println("Soma de todos os valores maiores que zero: $somaPositivos")
}