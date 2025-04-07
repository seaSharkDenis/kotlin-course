fun main() {
    println("Hello World!")
//    Note that you cannot check the equality of Int and Long! You can compare Int and Long freely with >, <. >=, <=,
//    but cannot use == and !=. You can check equality only for the same types, so you need to convert Int to Long:
//    Write a program that reads numbers a, b, c and checks whether any pair of arguments (ab, ac, or bc) sums to 20.
//    Output true or false.
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val ab = a + b
    val bc = b + c
    val ac = a + c

    if (ab == 20 || bc == 20 || ac == 20) {
        println(true)
    } else {
        println(false)
    }

//    Write a program that reads three numbers and checks if they are different (numbers are not equal to one another).
//    Output either true or false.
    val d = readln().toInt()
    val e = readln().toInt()
    val f = readln().toInt()
    if (d != e && e != f && d != f) {
        println(true)
    } else {
        println(false)
    }

//    Given two numbers, determine if the first number is greater than, less than, or equal to the second number.
//    Print '>' if the first number is greater than the second, '<' if it is less than the second, or '=' if they
//    are equal.
    val g = readln().toInt()
    val h = readln().toInt()
    if (g > h) {
        println("greater")
    } else if (g < h) {
        println("less")
    } else {
        println("equal")
    }

//    Write a program that reads a value from standard input and prints true if the number is greater than 0 and less
//    than 10, otherwise prints false.
    val i  = readln().toInt()
    if(i>0){
        println(true)
    }else{
        println(false)
    }
}