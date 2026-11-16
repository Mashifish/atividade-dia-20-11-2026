fun main() {
    val tarefas = arrayOf(
        "Corrigir bug de login",
        "Atualizar dependências do Gradle",
        "Criar layout da tela de perfil",
        "Escrever testes unitários"
    )

    println("=== LISTA DE TAREFAS ===")
    for ((indice, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${indice + 1}: $tarefa")
    }
}