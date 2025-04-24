fun main(){
    print("Enter the number to write sequence for: ")
    val number = readln().toInt()
    var printedCount = 0
    var count = 1
    while(count<=number){
        repeat(count){
            if(printedCount<number){
                print(count)
                printedCount++
            }else{
                return@repeat
            }
        }
        count++
    }
    
    println()
    print(printedCount)
}