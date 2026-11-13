fun main() {
    val nome = readln()
    val pr1 = readln().toDouble()
    val pr2 = readln().toDouble()
    val media = (pr1 + pr2) / 2
    println("$nome, $pr1, $pr2, $media")
    if (media >= 7) println("Aprovado")
    else if (media < 3) println("Reprovado")
    else println("Prova Final")
}