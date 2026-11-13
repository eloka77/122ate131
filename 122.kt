fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triangulo")
    } else {
        println("Nao podem ser lados de um triangulo")
    }
}