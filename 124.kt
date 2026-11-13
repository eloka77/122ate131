fun main() {
    val lados = List(3) { readln().toDouble() }.sortedDescending()
    val a = lados[0]
    val b = lados[1]
    val c = lados[2]
    if (a < b + c) {
        val a2 = a * a
        val bc2 = b * b + c * c
        if (a2 == bc2) println("Retangulo")
        else if (a2 > bc2) println("Obtusangulo")
        else println("Acutangulo")
    }
}