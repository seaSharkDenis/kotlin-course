class Patient  {
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

//New planet
//Create the class Planet with the following properties:
//star – of type String, with the default value "Unknown Star";
//mass – of type Double, with the default value 1.0;
//numberOfSatellites – of type Int, with the default value 1.
class Planet{
    var star: String = "Unknown Star"
    var mass:Double = 1.0
    var numberOfSatellites: Int = 1
}

//Assume you have the Rectangle class with width and height properties. The properties types are Int.
//Implement a function that receives a Rectangle object and prints the product of the multiplication of two properties.
//Name the function printArea.
class Rectangle{
    var width: Int = 0
    var height: Int = 0
}
fun printArea(rectangle: Rectangle){
    println(rectangle.width * rectangle.height)
}

//How about writing a calculator that manipulates complex numbers?
//Where to start? Write a class named Complex. It must have two Double properties named real and image. The properties
//must be assignable and their default value must be zero.
class Complex{
    var real: Double = 0.0
    var image: Double = 0.0
}

class Student(val name: String, var age: Int){
    fun introduceSelf() = "Hello, I am $name and I am $age years old."
}