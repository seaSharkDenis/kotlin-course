fun main(){
//    Printing an ascending asterisk triangle
//    Write a program that reads a positive integer N and prints a triangle with N rows using asterisks ('*').
//    Each row should have one more asterisk than the previous row, starting with one asterisk in the first row.
//    Sample Input 1:
//    5
//    Sample Output 1:
//    *
//    **
//    ***
//    ****
//    *****
    print("Enter your integer: ")
    val N = readln().toInt()
    var count = 1
    while(count<=N)
    {
        println("*".repeat(count))
        count++
    }

//    Find how many "D", "C", "B" and "A" grades the students have got after the last Computer Science test.
//    There are n students in the class. The program gets the n number as input and then gets the grades one by one.
//    The program should output four numbers in a single line, representing the number of grades equal to "D", "C", "B" and "A".
//    Numbers represent the following grades: 2 is "D", 3 is "C", 4 is "B", and 5 is "A".
//    Sample Input 1:
//    10
//    3
//    5
//    4
//    4
//    2
//    5
//    5
//    5
//    5
//    2
//    Sample Output 1:
//    2 1 2 5
    println("Enter number of students and their scores: ")
    val studentCount = readln().toInt()
    var gradeACount = 0
    var gradeBCount = 0
    var gradeCCount = 0
    var gradeDCount = 0
    repeat(studentCount){
        val grade = readln().toInt()

        when(grade){
            5 -> gradeACount++
            4 -> gradeBCount++
            3 -> gradeCCount++
            2 -> gradeDCount++
        }
    }
    println("$gradeDCount $gradeCCount $gradeBCount $gradeACount")

//    Write a program that reads a number and prints it the number of times corresponding to the value of the input number.
//    Sample Input 1:
//    5
//    Sample Output 1:
//    55555
//    Sample Input 2:
//    10
//    Sample Output 2:
//    10101010101010101010
    println("Enter number you would like to repeat its value")
    val repeatVal = readln().toInt()
    repeat(repeatVal){
        print(repeatVal)
    }

//    Calculate the sum of natural numbers up to a given limit
//    Write a Kotlin program that finds the sum of the natural numbers up to a given number. You'll receive an integer
//    'N' as input, representing the limit of the numbers to be added. Your program should print the calculated sum as the output.
//    Sample Input 1:
//    10
//    Sample Output 1:
//    55
//    Sample Input 2:
//    100
//    Sample Output 2:
//    5050
    print("Calculate the sum of natural numbers up to N. Enter N: ")
    val numLimit = readln().toInt()
    var sum = 0
    var numCounter = 1
    while(numCounter<=numLimit){
        sum+=numCounter
        numCounter++
    }
    println(sum)

}