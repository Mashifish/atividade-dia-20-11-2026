fun main() {
    val matriz = arrayOf(
        intArrayOf(5, 2, 3, 1),
        intArrayOf(10, 4, 2, 2),
        intArrayOf(1, 1, 1, 1)
    )

    for ((linhaIdx, linha) in matriz.withIndex()) {
        var somaLinha = 0
        for (valor in linha) {
            somaLinha += valor
        }
        println("Soma da linha $linhaIdx: $somaLinha")
    }
}