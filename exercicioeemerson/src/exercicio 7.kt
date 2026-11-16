fun main() {
    // Matriz original 2x3 (2 linhas, 3 colunas)
    val matrizOriginal = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val linhas = matrizOriginal.size
    val colunas = matrizOriginal[0].size

    // Matriz transposta 3x2 (3 linhas, 2 colunas)
    val matrizTransposta = Array(colunas) { IntArray(linhas) }

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            matrizTransposta[j][i] = matrizOriginal[i][j]
        }
    }

    println("=== Matriz Original (2x3) ===")
    for (linha in matrizOriginal) {
        println(linha.contentToString())
    }

    println("\n=== Matriz Transposta (3x2) ===")
    for (linha in matrizTransposta) {
        println(linha.contentToString())
    }
}