/**Exercício resolvendo a formula f = m * a
 */

fun main (){
    println("Digite o valor da aceleracao:")
    val aceleracao:Double = readln().toDouble()
    println("Digite o valor da massa:")
    val massa:Double = readln().toDouble()
    val forca = massa * aceleracao

    println("O valor da força é:$forca")
}