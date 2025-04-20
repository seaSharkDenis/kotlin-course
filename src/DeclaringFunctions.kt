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


//Write a function called isGreater() that takes four integer numbers and returns true if a sum of the first two
//arguments is greater than a sum of the third and fourth argument. Otherwise, return false.
//Use the provided code template.
//Sample Input 1:
//1
//2
//3
//4
//Sample Output 1:
//false
//Sample Input 2:
//3
//4
//1
//2
//Sample Output 2:
//true
fun isGreater(numOne: Int, numTwo: Int, numThree: Int, numFour: Int): Boolean {
    val result = (numOne + numTwo) > (numThree + numFour)
    return result
}

//Write a function named divide that takes two long numbers and returns a double value. It should return the result of
//the division of the first argument by the second one. It's guaranteed that the second argument is not zero.
//Sample Input 1:
//500000000000
//200000000000
//Sample Output 1:
//2.5
fun divide(numOne: Long, numTwo: Long): Double {
    val result = numOne.toDouble() / numTwo.toDouble()
    return result
}

//Categorizing life stages based on age
//Write a function that takes a person's age as input and prints 'Minor' if their age is less than 18, 'Adult'
//if their age is greater than or equal to 18 and less than 65, and 'Senior' if their age is 65 or above.
fun ageCategory(userAge: Int) {
    val userAgeCategory = if (userAge < 18) {
        "Minor"
    } else if (userAge in 18..64) {
        "Adult"
    } else {
        "Senior"
    }
    println(userAgeCategory)
}

//Write a function named isRightEquation() that takes three numbers and returns true if the product of the first two
//numbers is equal to the third number. Otherwise, it should return false.
//Use the provided template.
//Sample Input 1:
//2
//3
//6
//Sample Output 1:
//true
//Sample Input 2:
//2
//3
//7
//Sample Output 2:
//false
fun isRightEquation(length:Int, width:Int, hypotenuse:Int):Boolean{
    val isRightEq = ((length*width)== hypotenuse)
    return isRightEq
}


fun main() {
    println("Enter numbers to add: ")
    val addA = 40
    val addB = 10
    println("The sum of $addA and $addB is ${sum(addA, addB)}")
    println("The difference between $addA and $addB is ${difference(addA, addB)}")
    println(isVowel('A'))
    println(isGreater(1, 2, 3, 4))
    println(isGreater(3, 4, 1, 2))
    println(divide(500000000000, 200000000000))
    ageCategory(65)
    println(isRightEquation(2,3,7))
}

//Single-expression functions
//If a function returns a single expression, you can write it without curly braces.
//It's an idiomatic way to create concise functions:
//fun sum(a: Int, b: Int): Int = a + b
//fun sayHello(): Unit = println("Hello")
//fun isPositive(number: Int): Boolean = number > 0
