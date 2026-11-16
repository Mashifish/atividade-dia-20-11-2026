fun main() {
    // Cria um array preenchido de 1 a 20
    val numeros = IntArray(20) { it + 1 }
    var somaIndicesPares = 0

    // Percorre pulando de 2 em 2 (0, 2, 4, 6...) correspondendo aos índices pares
    for (i in numeros.indices step 2) {
        somaIndicesPares += numeros[i]
        println("Índice $i -> Valor: ${numeros[i]}")
    }

    println("Soma dos valores em índices pares: $somaIndicesPares")
}