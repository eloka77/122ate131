fun main() {
    val n = readln().toInt()
    if (n == 5) println("Igual a 5")
    else if (n == 200) println("Igual a 200")
    else if (n == 400) println("Igual a 400")
    else if (n in 500..1000) println("No intervalo entre 500 e 1000")
    else println("Fora dos escopos")
}