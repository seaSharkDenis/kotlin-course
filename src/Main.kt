//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    Type coercion
//    Byte&Short > Int > Long > Float> Double
    val num: Int = 100
    val longNum: Long = 1000
    val result = num + longNum // 1100, Long
    println(result)

//    A byte and a byte will give you an Int, same as a byte and a short
//    If either operand is of type Double, the result is Double.
//    Otherwise, if either operand is of type Float, the result is Float.
//    Otherwise, if either operand is of type Long, the result is Long.
//    Otherwise, the result is Int.
    val a: Int = 12
    val b: Double = a.toDouble()/5
    println("Result: $b")

//    Declaration of variables of Long type
    val longNumber1 = 1_000_000_000_00_000
    val longNumber2: Long = 1_000_000
    val longNumber3 = 1000L
    val longResult = longNumber1 + longNumber2 - longNumber3
    println(longResult)

//    Unsigned integers provided - These are integers that can contain only non-negative values.
//    UByte, UShort, UInt, and ULong
    val uByte: UByte  = 5U
    val uShort: UShort = 10U
}