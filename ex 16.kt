/** 16. Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
 * hora trabalhada.
 */

fun main() {
    println("Digite os dias trabalhados:")
    val dias: Double = readLine()!!.toDouble()

    val total_a_pagar = dias * 8 * 25

    println(String.format("O valor do salário é R$ %.2f", total_a_pagar))

}
