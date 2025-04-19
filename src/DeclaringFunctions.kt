//To declare a new function, you need to indicate the fun keyword and a function name, a list of parameters in
//parentheses, and the type of the result value. So, it looks like this:
//
//fun functionName(p1: Type1, p2: Type2, ...): ReturnType {
//    // body
//    return result
//}


fun sum(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun difference(a: Int, b: Int): Int = a - b // Single-expression function


//Write a function that checks whether a letter of the basic Latin alphabet is a vowel. The input is one letter.
//Do not consider the letter y a vowel.
//Your function should take a Char type value and return a Boolean.
//Use the provided code template.
//Examples
//1) isVowel('a') should be true
//2) isVowel('A') should be true
//3) isVowel('b') should be false
fun isVowel(vowel: Char): Boolean {
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u')
    return vowels.contains(vowel.lowercaseChar())
}


fun main() {
    println("Enter numbers to add: ")
    val addA = 40
    val addB = 10
    println("The sum of $addA and $addB is ${sum(addA, addB)}")
    println("The difference between $addA and $addB is ${difference(addA, addB)}")
    println(isVowel('A'))

}

//Single-expression functions
//If a function returns a single expression, you can write it without curly braces.
//It's an idiomatic way to create concise functions:
//fun sum(a: Int, b: Int): Int = a + b
//fun sayHello(): Unit = println("Hello")
//fun isPositive(number: Int): Boolean = number > 0
