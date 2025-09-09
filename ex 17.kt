/**17 Escreva um programa em kotlin para calcular a redução do tempo de vida
 * de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
 * ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 */

fun main() {
    println("Qual a quantidade de cigarros fumados no dia:")
    val cigarros:Double = readLine()!!.toDouble()
    println("Fuma a quantos anos?:")
    val anos:Double = readLine()!!.toDouble()

    val totalcigarros = cigarros * anos * 365
    val minutosperdidos = totalcigarros * 10
    val horasperdidas = minutosperdidos / 60
    val diasperdidos = horasperdidas / 24

    println("Você perdeu aproximadamente $diasperdidos dias de vida")
}
