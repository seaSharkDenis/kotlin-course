fun checkTheCode(input: String) {
    var result = input.toBoolean()
    result = !result
    val output = result.toString()
    println(output)
}

fun main() {
    checkTheCode("denis")

//    ArithmeticException
//    ArithmeticException is the runtime exception that is thrown when the code attempts an illegal arithmetic
//    operation. Consider an extremely common example:
    try {
        val example = 2 / 0 // throws ArithmeticException
    } catch (e: Exception) {
        println("Caught Arithmetic expression : ${e.message}")
    } finally {
        println("Exit the program.")
    }


//    NumberFormatException
//    During calculations you can get another type of exception: NumberFormatException. It is thrown when a method
//    expects to receive a number, but the actual input is something else. Take an example:
    val string = "It's not a number"
    val number = string.toInt() // throws NumberFormatException

//    IndexOutOfBoundsException
//    IndexOutOfBoundsException occurs when you access some non-existent index. For example, if you are trying to
//    access the tenth element of a collection that has only 5 elements, your index will be out of bounds.
//
//    This type of exception has further subtypes. This example throws a StringIndexOutOfBoundsException, a special
//    type of IndexOutOfBoundsException used for (you guessed it) strings:
    val sequence = "string"
    println(sequence[10])   // throws StringIndexOutOfBoundsException
}