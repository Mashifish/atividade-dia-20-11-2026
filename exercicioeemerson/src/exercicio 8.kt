fun main() {
    val matriz = arrayOf(
        intArrayOf(4, 1, 2, 3),
        intArrayOf(5, 8, 6, 7),
        intArrayOf(9, 0, 1, 2),
        intArrayOf(3, 4, 5, 6)
    )

    println("=== Matriz 4x4 ===")
    var somaDiagonal = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]} \t")
            // A diagonal principal ocorre quando o índice da linha é igual ao da coluna (i == j)
            if (i == j) {
                somaDiagonal += matriz[i][j]
            }
        }
        println()
    }

    println("\nSoma dos elementos da Diagonal Principal: $somaDiagonal")
}