//While loop
//The while loop includes a block of code and a condition, which is a boolean expression. If the condition is true, the loop initiates the statements. They are repeated until the condition becomes false. This loop checks the condition before the execution, so it is also known as a pre-test loop.
fun main() {
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
    println("Completed")

    var letter = 'A'
    while(letter<= 'Z'){
        print(letter)
        letter++
    }
    println()

    do{
        print("Enter a number: ")
        val n = readln().toInt()
        println(n)
    }while(n>2)

//    The sum of elements
//    Find the sum of all elements in a sequence, ending with 0.
//    The number 0 itself is not included in the sequence and serves as a sign that the sequence ended. Although, if you
//    add 0, nothing bad will happen :)
//    Sample Input 1:
//    3
//    6
//    8
//    0
//    Sample Output 1:
//    17
    println("Getting the sum of elements")
    var sum = 0
    do{
        print("Enter number: ")
        val number = readln().toInt()
        sum+=number
    }while(number>0)
    println(sum)
}