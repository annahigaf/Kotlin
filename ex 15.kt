/** 15. A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
 * programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
 * e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
 * sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.
 */

fun main() {
    println("Digite a quantidade de km rodados:")
    val km: Double = readLine()!!.toDouble()
    println("Digite quantos dias so carro ficou alugado")
    val dias: Double = readLine()!!.toDouble()

    val total_a_pagar = (km * 0.20) + (dias * 90)

    println(String.format("O valor a pagar pelo carro é R$ %.2f", total_a_pagar))

}
