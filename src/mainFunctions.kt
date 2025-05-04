fun main(){
//    println("Enter numbers separated by comma")
//    println()
//    val input = readln()
//    val numbers = input.split(",").map{it.trim().toInt()}.toIntArray()
//    addNumbers(numbers)
    val charOne = readln().first().lowercase()
    val charTwo = readln().first().lowercase()
    val result = checkLatinEquality(charOne, charTwo)
    print(result)
}

fun addNumbers(myNumbers: IntArray){
    var sum = 0
    for(i in myNumbers){
        sum += i
    }
    println("The sum of numbers is $sum")
}
//Write a program that reads two Latin letters as characters and compares them ignoring cases. If these characters
//represent the same letter print true , otherwise false.
//Sample Input 1:
//a
//b
//Sample Output 1:
//false
//Sample Input 2:
//d
//D
//Sample Output 2:
//true
fun checkLatinEquality(charOne: String, charTwo: String): Boolean{
    return charOne.lowercase()==charTwo.lowercase()
}