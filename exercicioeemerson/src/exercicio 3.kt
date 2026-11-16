fun main() {
    val temperaturas = doubleArrayOf(28.5, 31.0, 29.2, 34.0, 32.5, 30.0, 27.8)

    var soma = 0.0
    for (temp in temperaturas) {
        soma += temp
    }
    val mediaGeral = soma / temperaturas.size
    println("Média geral das temperaturas: %.2f".format(mediaGeral))

    println("Dias (índices) com temperatura acima da média:")
    for ((dia, temp) in temperaturas.withIndex()) {
        if (temp > mediaGeral) {
            println("Dia $dia: $temp°C")
        }
    }
}