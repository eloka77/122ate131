fun main() {
    val verbo = readln().lowercase()
    if (verbo.endsWith("ar")) println("1a conjugacao")
    else if (verbo.endsWith("er") || verbo.endsWith("or")) println("2a conjugacao")
    else if (verbo.endsWith("ir")) println("3a conjugacao")
    else println("Nao esta no infinitivo")
}