fun main() {
    print("Enter your deposit: ")
    val depositAmount = readln().toDouble()
    println("${findYears(depositAmount)} years")
    getFibonacciSequence(1)
    var i = 5
    do {
        i++
        print("$i ")
        i -= 2
    } while (i > 1)


    balanceChecker()
}


//  Function checks the amount of years it would take for an amound deposited in a bank to exceed the amount
// the government can refund in case a bank goes down
fun findYears(depo: Double): Int {
    var initialDeposit: Double = depo
    var years = 0
    val interestRate = 1.071
    while (initialDeposit < 700000) {
        initialDeposit *= interestRate
        years++
    }
    return years
}

//Given a positive integer number, print a list of Fibonacci sequence up to the nth term. The Fibonacci sequence is
//a series of numbers in which each number is the sum of the two preceding ones, often starting with 0 and 1. For
//example, the Fibonacci sequence up to 7th term is: 0,1,1,2,3,5,8. The input is the term n and the output should
//be the sequential integers of Fibonacci as a string, separated by a comma and space.
//Sample Input 1:
//5
//Sample Output 1:
//0, 1, 1, 2, 3
fun getFibonacciSequence(limit: Int) {
    print("User wants the fibonacci sequence up to the ${limit}nth term")
    println()
    val sequence = mutableListOf<Int>()
    var count = 0
    var first = 0
    var second = 1
    while (count < limit) {
        sequence.add(first)
        val next = first + second
        first = second
        second = next
        count++
    }
    println(sequence.joinToString(", "))
}

//Create an algorithm that prevents an e-wallet account from going into negative balance. The account should be debited
//for each purchase sequentially while the balance allows it.
//The input should include:
//On the first line, a single integer number representing the available balance.
//On the second line, a sequence of integers representing purchase payments, which should be processed one after another.
//The output should contain:
//If there is not enough money for a purchase, output Error, insufficient funds for the purchase. Your balance is N, but
//you need M., where N is the remaining balance on the account and M is the cost of the items you cannot afford.
//If there is enough money for all the purchases, output Thank you for choosing us to manage your account! Your balance
//is N., where N is the amount of money left after the purchases.
//Sample Input 1:
//10000
//5000 3000
//Sample Output 1:
//Thank you for choosing us to manage your account! Your balance is 2000.
//Sample Input 2:
//1000
//500 500
//Sample Output 2:
//Thank you for choosing us to manage your account! Your balance is 0.
//Sample Input 3:
//5000
//500 2000 3000
//Sample Output 3:
//Error, insufficient funds for the purchase. Your balance is 2500, but you need 3000.
fun balanceChecker() {
    print("Enter available balance: ")
    var availableBalance = readln().toInt()
    val payments = arrayOf(5000, 3000, 4300)
    for (payment in payments) {
        if (availableBalance >= payment) {
            availableBalance -= payment
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $availableBalance, but you need $payment.")
            return
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $availableBalance.")
}
