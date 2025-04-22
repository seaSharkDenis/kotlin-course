fun main() {
//    To use the simplest loop, write repeat(n) and a sequence of statements in curly braces {...}. n is an integer that
//    determines how many times these statements are going to be repeated.
//    repeat(n) {
//        // statements
//    }
    repeat(3) {
        println("Hello\n")
    }
    println()

//    Kotlin has the opportunity to control the current iteration with the it name:
    repeat(3) {
        println(it)
    }

    println()

    val n = readln().toInt()
    var sum = 0
    repeat(n) {
        val next = readln().toInt()
        sum += next
    }
    println(sum)
    var count = 10
    while (count > 0) {
        println("I will not use copy-paste!")
        count--
    }

    var number = 5
    repeat(2) {
        number--
    }
    repeat(0) {
        number--
    }
    repeat(1) {
        number--
    }
    println(number)  // Expected to produce 2

    println("Enter the number of parts to enter")
    val numberParts = readln().toInt()
    var largerComponents = 0
    var smallerComponents = 0
    var perfectComponents = 0
    repeat(numberParts) {
        val componentStatus = readln().toInt()
        when (componentStatus) {
            1 -> largerComponents++
            -1 -> smallerComponents++
            0 -> perfectComponents++
        }
    }
    println("$perfectComponents $largerComponents $smallerComponents")
}