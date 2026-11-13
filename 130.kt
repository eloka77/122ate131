fun main() {
    val valor = readln().toDouble()
    val venda = if (valor < 20.0) valor * 1.45 else valor * 1.30
    println(venda)
}