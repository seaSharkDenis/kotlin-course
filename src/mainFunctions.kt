fun main(){
//    println("Enter numbers separated by comma")
//    println()
//    val input = readln()
//    val numbers = input.split(",").map{it.trim().toInt()}.toIntArray()
//    addNumbers(numbers)
    val myNum: UInt = 23u
    val anothNum: UInt = 23u

}

fun addNumbers(myNumbers: IntArray){
    var sum = 0
    for(i in myNumbers){
        sum += i
    }
    println("The sum of numbers is $sum")
}