fun main() {
    val greeting = "hello"
    println("Original string is $greeting")
//    substring function accepts startIndex (inclusive) and lastIndex (exclusive) as arguments
    println("Getting the substring of a string using the substring function")
    println(greeting.substring(0, 2)) // he

    println(
        "When the lastIndex is ommitted, you get the substring from the startIndex element to the end of the" +
                "\n original string"
    )
    println(greeting.substring(2)) // llo

    println("You can get part of a string also using substringAfter and substringBefore")
    println(greeting.substringAfter('e'))
    println(greeting.substringBefore('l'))
//    these functions can also accept a message to be returned is the delimited argument is not present in the string
    println(greeting.substringAfter('a', "The character is missing."))

//    Replacing parts of a string
    val example = "Good Morning..."
    println(example.replace("Morning", "Bye"))
    println(example.replace('.', '!'))
    println("The replace function returns a new string without changing the original string")
    println("Original string is $example") // Original string is returned.

    println("Enter string to compare")
    val stringOne = readln()
    val stringTwo = readln()
    println(caseInsensitive(stringOne, stringTwo))

//    Write a program that reads a string and prints that string, swapping the first and last characters.
//    Sample Input 1: Hellow
//    Sample Output 1: welloH
    val swapString = readln()
    val swappedString = "${swapString[swapString.length-1]}${swapString.substring(1,(swapString.length-1))}${swapString[0]}"
    println(swappedString)

    println(checkCrash("Example", 0,8))
}

//Write a program that reads and compares two lines in a case-insensitive manner.
//The program must print either true or false.
//Sample Input 1:
//Hello
//hello
fun caseInsensitive(stringOne: String, stringTwo: String): Boolean {
    if (stringOne.lowercase() == stringTwo.lowercase()) {
        return true
    } else {
        return false
    }
}

fun checkCrash(exampleString:String, firstIndex: Int, lastIndex: Int): String{
    return exampleString.substring(firstIndex, lastIndex)
}