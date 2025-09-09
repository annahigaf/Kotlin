/** 12. Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
 *equação do segundo grau e mostre o valor de Delta. (formula Δ = b
 *2 – 4ac)
 */

fun main() {
    println("Digite o a da equação:")
    val a:Double = readLine()!!.toDouble()
    println("Digite o b da equação:")
    val b:Double = readLine()!!.toDouble()
    println("Digite o c da equação:")
    val c:Double = readLine()!!.toDouble()

    val delta = ((b * 2) - (4 * a * c))


    println("O valor de delta é: $delta")
}
