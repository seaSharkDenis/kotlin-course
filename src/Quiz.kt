import kotlin.math.sqrt

fun main() {
//    You have been given an integer number. You need to print two values. The first one should be the original number
//    incremented by two. For the second value, you need to coerce the original number to a double and take a square root
//    from it.
//    Sample Input 1:
//    10
//    Sample Output 1:
//    12
//    3.1622776601683795

    println("Enter a number: ")
    val intAction = readln().toInt()
    println(intAction + 2)
    println(sqrt(intAction.toDouble()))

//    Write a program that reads a number and outputs its last digit.
//    Sample Input 1:
//    425
//    Sample Output 1:
//    5
    println("Enter the number: ")
    val getDigit = readln()
    val digitLength = getDigit.length
    println(getDigit[digitLength-1])

    val magic = 2_000_000_000 // Int
    val giant = 3_000_000_000 // Long
    val x = (magic + giant) % 10
    println(x)

    val secret1 = -1L
    val xy = 10 % 3 + 7 /2 /2
    val yx = secret1 * xy + 3
    println(yx - xy)
}