class `exercicio 1` {
}
fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50, 60)
    println("Original: ${numeros.joinToString(", ")}")

    var inicio = 0
    var fim = numeros.size - 1

    while (inicio < fim) {
        // Realiza a troca dos elementos utilizando uma variável temporária
        val temp = numeros[inicio]
        numeros[inicio] = numeros[fim]
        numeros[fim] = temp

        inicio++
        fim--
    }

    println("Invertido: ${numeros.joinToString(", ")}")
}