fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && b == c) println("Equilatero")
        else if (a == b || b == c || a == c) println("Isosceles")
        else println("Escaleno")
    }
}