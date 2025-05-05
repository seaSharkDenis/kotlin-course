fun main(){
    val john = Patient()
    john.name = "John"
    john.age = 30
    john.height = 180.0

    val alice = Patient()
    alice.name = "John"
    alice.age = 30
    alice.height = 180.0

    john.age = 31

    println("${john.name}: ${john.age} yrs, ${john.height} cm")
    println("${alice.name}: ${alice.age} yrs, ${alice.height} cm")

    val rectangle = Rectangle()
    println("Enter the rectangle dimensions: ")
    rectangle.width = readln().toInt()
    rectangle.height = readln().toInt()
    printArea(rectangle)

    val student1 = Student("Denis Ndiritu", 20)
    println(student1.introduceSelf())
}