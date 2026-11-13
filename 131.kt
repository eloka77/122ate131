fun main() {
    val nome = readln().uppercase()
    val inicial = nome.first()
    when (inicial) {
        in 'A'..'K' -> println("Sala 101")
        in 'L'..'N' -> println("Sala 102")
        in 'O'..'Z' -> println("Sala 103")
    }
}