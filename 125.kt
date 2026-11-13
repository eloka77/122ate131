fun main() {
    val idade = readln().toInt()
    if (idade < 18) println("Menor de idade")
    else if (idade in 18..65) println("Maior de idade")
    else println("Maior de 65 anos")
}