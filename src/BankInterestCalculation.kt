fun main(){
    print("Enter your deposit: ")
    val depositAmount = readln().toDouble()
    println("${findYears(depositAmount)} years")
}


//  Function checks the amount of years it would take for an amound deposited in a bank to exceed the amount
// the government can refund in case a bank goes down
fun findYears(depo:Double): Int{
    var initialDeposit:Double = 650000.00
    var years = 0
    val interestRate = 1.071
    while(initialDeposit<700_000){
        initialDeposit *= interestRate
        years++
    }
    return years
}