fun main() {
    println("Welcome to the Even or Odd Checker Game!!!")
    println("Enter a number and I will tell you whether the number is even or odd!!")
    var running = true
    var userNumber: Int?
    while (running) {
        println("\nEnter a number(or type 'exit to quit): ")
        val input = readln()
        if (input.equals("exit", ignoreCase = true)) {
            running = false
            println("Goodbye!")
        } else {
            val number = input.toIntOrNull()
            if (number == null) {
                println("Please enter a valid number")
            } else {
                if (number % 2 == 0) {
                    println("$number is EVEN.")
                } else {
                    println("$number is ODD.")
                }
            }
        }
    }
}