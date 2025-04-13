fun main(){
    val numHexadecimal = "1A3F"
    val decimalNum = numHexadecimal.toInt(16)
    println(decimalNum)
    val ch = '\u0041'
    println("ch is $ch") // A

//    One can convert numbers to characters and vice versa
    val Ach='A'
    println(Ach.code)
    val num = 97
    println(num.toChar())
    println("Enter your name to get the first character of it: ")
    val name:Char = readln().first()
    println(name)
//    Retrieving subsequent characters
//    One can use + for adding and - for subtracting integer numbers to get
//    the next and previous characters according to the Unicode order:
    val ch1 = '?'
    val ch2 = ch1 + 1
    val ch3 = ch2 - 2
    println("ch1 is $ch1, ch2 is $ch2, and ch3 is $ch3.")
//    This; 1 + ch, is wrong. You cannot add a symbol to a number is it will cause an error.
//    You also cannot sum up two characters
//    All digits have codes from '\u0030' to '\u0039'
    println("Enter a character to check whether it is a digit: ")
    val ch4 = readln().first()
    val isDigitBool = ch in '\u0030'..'\u0039'
    println(isDigitBool)
    println('9'.isDigit())
}