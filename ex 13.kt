/** 13. Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
 *seu PREÇO PROMOCIONAL, com 5% de desconto.
 */

fun main() {
    println("Digite o preço do produto:")
    val preco: Double = readLine()!!.toDouble()

    val desconto = preco * 0.05
    val com_desconto = preco - desconto

    println(String.format("O valor promocional é R$ %.2f", com_desconto))

}
