package basics.arrays

/*
* An array is a data structure that holds a fixed number of values of the same type or its subtypes.
*/

fun main() {
    createArrays() //Create arrays - 3 types
    arrayConstructor() //Array constructor
    nestedArrays() //Nested Arrays
}

fun createArrays() {
    val simpleArray = arrayOf(1, 2, 3) //1
    for (i in simpleArray) {
        println(i)
    }

    val nullArray = arrayOfNulls<Int?>(3) //2
    println(nullArray.contentToString())

    val exampleOfEmptyArray: Array<String> = emptyArray() //3
    println(exampleOfEmptyArray.joinToString())
}


fun arrayConstructor() {
    val initArray = Array<Int>(3) { 1 }
    println(initArray.joinToString())

    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print("$it,") }
}

fun nestedArrays() {
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println("\n\n${twoDArray.contentDeepToString()}")

    val threeDArray = Array(3) { Array(2) { Array<String>(2) { "abc" } } }
    println(threeDArray.contentDeepToString())
}

