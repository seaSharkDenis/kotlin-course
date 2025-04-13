fun main() {
//    Write a program that reads one number and one character on separate lines and checks whether the entered number
//    corresponds to the decimal representation of the character in the Unicode table.
//    If the input character is represented by the input number, print true; otherwise, print false.
    println("Enter a number to compare: ")
    val numberRead = readln().toInt()
    println("Enter a character to compare with $numberRead")
    val characterRead = readln().first()
    if (numberRead.toChar() == characterRead) {
        println(true)
    } else {
        println(false)
    }

//    Write a program that reads a character and checks if it is a capital letter or a digit from 1 to 9.
//    The program must print either true or false.
    println("Enter a character to check whether is capital or is a digit: ")
    val characterInput = readln().first()
    val isDigitOneToNine = characterInput.isDigit() && characterInput != '0'
    if (isDigitOneToNine || characterInput.isUpperCase()) {
        println(true)
    } else {
        println(false)
    }

//    According to the Unicode table, the symbol ? has the code 003F.
//    How would you represent it as a character in a program?
    val questionSymbol = '\u003F'
    println(questionSymbol)

    println('?'.code)

//    Write a program that reads three characters and checks if they are ordered according to the Unicode
//    table, and if each next character immediately follows the previous one (i.e. 'a', 'b', 'c' or 'x', 'y', 'z') according to the alphabet.
//    The program must print either true or false.
//    Sample Input 1:
//    a
//    b
//    c
//    Sample Output 1:
//    true
    println("Enter first character: ")
    val char1 = readln().first()
    println("Enter second character: ")
    val char2 = readln().first()
    println("Enter third character: ")
    val char3 = readln().first()
    if ((char1 + 1 == char2) && (char2 + 1 == char3)) {
        println(true)
    } else {
        println(false)
    }

//    Write a program that reads four characters and prints the previous character in the Unicode table for each of them.
    println("Print the previous character in the Unicode table")
    val char4 = readln().first()
    val char5 = readln().first()
    val char6 = readln().first()
    val char7 = readln().first()
    println(char4 - 1)
    println(char5 - 1)
    println(char6 - 1)
    println(char7 - 1)
}