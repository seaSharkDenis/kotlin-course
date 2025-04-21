//Given a program that reads two lines and outputs their multiplication. The product can’t be zero. If the product
// is equal to zero, the program should output It can't be zero!.
//Fix all errors in the code so that the program works correctly.
//Sample Input 1:
//2
//2
//Sample Output 1:
//4
//fun main() {
//    val line1 = readln()
//    val line2 = readln()
//
//    val product = line1 * line1
//    if (product == 0) {
//        printn("It can't be zerO!")
//    } else {
//        println(product)
//    }
fun main(){
    val line1 = readln().toInt()
    val line2 = readln().toInt()
    val product = line1 * line2
    if (product == 0) {
        println("It can't be zero!")
    } else {
        println(product)
    }
}