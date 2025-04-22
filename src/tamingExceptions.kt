// Necessary import statements
import java.lang.Exception
import java.lang.NumberFormatException

// Function to convert String to Integer and calculate its length
fun stringToIntLength(input: String): Int? {
    // Placeholder where the exception handling logic shall go
    // This is where your responsibility as a programmer begins
    return try {
        val convertedNumber = input.toInt()
        convertedNumber.toString().length

    } catch (e: NumberFormatException) {
        return -1
    }
    // Remember all exceptions derive from the Exception superclass, but we are dealing with a NumberFormatException

    // After handling the exceptions, convert the string to an Integer and get its length
    // If it fails to convert, return -1
}

fun main() {
    println("Enter a string and and an index.")
    print("Index: ")
    val numIndex = readln().toInt()
    print("String: ")
    val stringCheck = readln()
    if(numIndex < 0 || numIndex > stringCheck.length - 1){
        println("There isn't such an element in the given string, please fix the index!There isn't such an element in the given string, please fix the index!")
    }else{
        println(stringCheck[numIndex])
    }
}