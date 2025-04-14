fun main() {
    val greeting = "Hello"
//    get the first and last character of a string
    println(greeting.first())
    println(greeting.last())
    println(greeting.lastIndex)

//    Check if a String is empty
    val emptyString = ""
    println(emptyString.isEmpty()) // Will return true

//    Read two lines, each on a separate line, and print whether they are equal or not.
    val str1 = readln()
    val str2 = readln()
    println(str1 == str2)

//    Write a Kotlin program that reads a line of text and then prints it in reverse order. For example, if the
//    input is 'Hello, World!', the output should be '!dlroW ,olleH'.
    println("enter a string to reverse")
    val stringToReverse = readln()
    println(stringToReverse?.reversed())

//    Write a program that reads one string and one number N and prints the N-th symbol of the input string.
//    Here the N refers to the position of the symbol not its index. The examples below show how the result should look like.
//    Input: one string and one number of type Int in separate lines.
//    Output: single string. Use the following template:
//    "Symbol # N of the string "input string" is 'character', where N is the input number, input string — the string
//    your read, and character — the N-th symbol of the input string."
//    Sample Input 1:
//    hello world
//    1
//    Sample Output 1:
//    Symbol # 1 of the string "hello world" is 'h'
    println("Enter a string a number.")
    val stringInput1 = readln()
    val numberInput1 = readln().toInt()
    println("Symbol # $numberInput1 of the string \"$stringInput1\" is \'${stringInput1[numberInput1 - 1]}\'")

//    Write a program that reads the first name, the last name and the age of a person and then prints the information
//    as in the examples below.
//To solve this problem, use string templates.
//Sample Input 1:
//John Smith 30
//Sample Output 1:
//J. Smith, 30 years old
    println("Information about a person")
    val nameInput = readln()
    val secondName = nameInput.split(" ").last()
    val ageInput = readln().toInt()
    println("${nameInput.first()}. $secondName, $ageInput years old")

}