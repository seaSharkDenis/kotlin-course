//Too big for us
//Report a typo
//Write a function that throws an exception with the message It's too big if a value is greater than zero; otherwise,
//it should return the value.
//Sample Input 1:
//-1
//Sample Output 1:
//-1
fun returnValue(): Int {
    val value = readln().toInt()

    // write your code here
    if (value > 0) {
        throw Exception("It's too big")
    } else {
        return value
    }
}

//Handle arithmetic exception
//Report a typo
//Write a program that calculates the division of two input numbers. It may throw an ArithmeticException.
//Fix it to avoid the exception.
//In the case when the exception can happen, the corrected program should output: Division by zero,
//please fix the second argument!.
//Sample Input 1:
//8
//2
//Sample Output 1:
//4
//Sample Input 2:
//8
//0
//Sample Output 2:
//Division by zero, please fix the second argument!
fun divisionException(operandOne: Int, operandTwo: Int) {
    try {
        val result = operandOne / operandTwo
        println(result)
    } catch (e: ArithmeticException) {
        println("Division by zero, please fix the second argument!")
    }
}

fun main(){
    val operandOne = readln().toInt()
    val operandTwo = readln().toInt()
    divisionException(operandOne,operandTwo)
}