fun main() {
    //Is a year a leap year?
//Just a reminder: leap years are the years that are either divisible by 4 and not divisible by 100, or divisible
//by 400 (for example, the year 2000 is a leap year, but the year 2100 is not).
//The program should work for the years 1900 ≤ n ≤ 3000.
//Output "Leap" (case-sensitive) if the year is a leap, otherwise print "Regular".
    println("Enter a year between 1900 and 3000")
    val yearInput = readln().toInt()
    if (yearInput !in 1900..3000) {
        println("Please enter a year that is between 1900 and 3000")
    } else {
        if ((yearInput % 400 == 0) || (yearInput % 4 == 0 && yearInput % 100 != 0)) {
            println("Leap")
        } else {
            println("Regular")
        }
    }

//    Write a program that reads a temperature in Fahrenheit from the input and prints 'High temperature' if the
//    temperature is above 85, 'Low temperature' if it's below 50, and 'Normal temperature' otherwise.
    println("Enter the temperature in Fahrenheit")
    val tempReading = readln().trim().toInt()
    when {
        tempReading > 85 -> {
            println("High temperature")
        }

        tempReading < 50 -> {
            println("Low temperature")
        }

        else -> {
            println("Normal temperature")
        }
    }

//    Write a program that uses if to find the max of two integer numbers. These numbers can be positive,
//    negative or zero.
//    Be creative, solve the problem without else branch :)
//    Use the provided code template, print the max.
    val a = readln().toInt()
    val b = readln().toInt()
    val result = maxOf(a, b)
    println("Between $a and $b, $result is greater.")


//    Annie has a family: mother Lucy, father James, sister Emily, and brother Luke. She creates a family tree
//    family tree of the Annie family Now she wants to make this tree interactive. First, she wants the program
//    to be able to determine the relationship between herself and a random family member. How many if expressions
//    will Annie need to use to find out the relationship between herself and her random family member? For this,
//    the program can use information about the person's parents (compare two people's parents) and gender (male or female).
    val familyMembers = arrayOf("Luke", "Emily", "Lucy", "James")
    for (member in familyMembers) {
        if (member == "Luke") {
            println("Brother")
        } else if (member == "Emily") {
            println("Sister")
        } else if (member == "Lucy") {
            println("Mother")
        } else {
            println("Father")
        }
    }

//    Ann watched a TV program about health and learned that she should sleep at least A
//    hours per day, but oversleeping is also not healthy and you should not sleep more than B
//    hours.Now Ann sleeps H hours per day.If Ann 's sleep schedule complies with the requirements of that TV program –
//    print "Normal". If Ann sleeps less than A hours, output “Deficiency”, if she sleeps more than B hours, output
//    “Excess”. Input to this program are the three strings with variables in the following order: A, B, H. A
//    is always less than or equal to B.Please note letters case : the output should exactly correspond to what is
//    required in the problem, i.e. if the
//    program has to output "Excess", such output as "excess", "EXCESS", "ExCeSs" and others will not be considered
//    correct.
//    You should think carefully about all the conditions, which you need to use. A special attention should be paid to
//    the strictness of the conditional operators used: distinguish between < and ≤; > and ≥ . In order to understand
//    which ones to use, read carefully the problem statement.
    val recommendedHours = readln().toInt()
    val notExceedHours = readln().toInt()
    val hoursSlept = readln().toInt()
    if (hoursSlept in recommendedHours..notExceedHours) {
        println("Normal")
    } else if (hoursSlept < recommendedHours) {
        println("Deficiency")
    } else if (hoursSlept > recommendedHours) {
        println("Excess")
    }

    val x = 11

    if (x * 2 + 1 < 23 && x % 2 == 1) {
        print("1")
        print(if (x == 11) "2" else "3")
    } else if (x != 0) {
        print("4")
    }
    print("5")
}