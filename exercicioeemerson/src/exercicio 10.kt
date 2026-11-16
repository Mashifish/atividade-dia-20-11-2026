fun main() {
    // 3 alunos, cada um com 2 notas
    val notasAlunos = arrayOf(
        doubleArrayOf(8.5, 7.5), // Aluno 0
        doubleArrayOf(6.0, 5.5), // Aluno 1
        doubleArrayOf(9.0, 9.5)  // Aluno 2
    )

    var somaTotalTurma = 0.0
    var totalNotas = 0

    for ((alunoIdx, notas) in notasAlunos.withIndex()) {
        var somaNotasAluno = 0.0
        for (nota in notas) {
            somaNotasAluno += nota
            somaTotalTurma += nota
            totalNotas++
        }

        val mediaAluno = somaNotasAluno / notas.size
        val status = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"

        println("Aluno ${alunoIdx + 1} - Média: %.2f ($status)".format(mediaAluno))
    }

    val mediaGeralTurma = somaTotalTurma / totalNotas
    println("----------------------------------------")
    println("Média Geral da Turma: %.2f".format(mediaGeralTurma))
}