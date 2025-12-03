package basics.arrays

/*
* An array is a data structure that holds a fixed number of values of the same type or its subtypes.
*/

fun main() {
    createArrays() //Create arrays - 3 types
    arrayConstructor() //Array constructor
    nestedArrays() //Nested arrays
    specializedArrays() //Specialized arrays for primitive types
    accessingUpdatingArrays()
    iteratingOverArrays()
    commonOperations()
    arrayExtensions() //Extension functions for array
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

fun specializedArrays() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val numbersC = IntArray(5) { it * 2 }
    println("\n${numbers.joinToString()}\n${numbersC.joinToString()}")
}

fun accessingUpdatingArrays() {
    val fruits = arrayOf("Apple", "Banana", "Pineapple")
    println("\nSecond element: ${fruits[1]}") //Accessing element
    fruits[1] = "Blueberry" //Updating element
    println("Updated element: ${fruits[1]}")
}

fun iteratingOverArrays() {
    val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Mango")

    //using for loop
    print("\nIterating using for loop: ")
    for (item in fruits) {
        print("$item,")
    }

    //Using forEach function
    print("\nIterating using forEach function: ")
    fruits.forEach {
        print("$it,")
    }
}

fun commonOperations() {
    val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Mango")

    //finding size
    println("\n\nArray size: ${fruits.size}")

    //sort array
    val sort = fruits.sortedArray()
    println("Sorted array: ${sort.joinToString()}")

    //checking for element
    println("Apple" in fruits)
}

fun arrayExtensions() {
    val arr = arrayOf(5, 2, 2, 4, 1)
    println("\n${arr.sum()}") //sum of numeric elements
    arr.shuffle() //Shuffle array
    println(arr.contentToString())
    val evenNumbers = arr.filter { it % 2 == 0 } //Filter elements
    println(evenNumbers.joinToString())
    val squared = arr.map { it * it } //Apply transformation to each element
    println(squared.joinToString())
    val sortedArr = arr.sortedArray() //Sort array
    println(sortedArr.joinToString())
    val firstThree = arr.take(3) //returns the first n elements
    println(firstThree.joinToString())
    val withoutFirstTwo = arr.drop(2) //returns all elements except the first n elements
    println(withoutFirstTwo.joinToString())
    val distinctArr = arr.distinct() //returns array with duplicate elements removed
    println("Distinct array: ${distinctArr.joinToString()}")
    val hasThree = arr.contains(3) //checks if and element is present in array
    println(hasThree)
    val index = arr.indexOf(3) //returns the index of first occurrence of an element
    println("Index of 3 is: $index")
    val lastIndex = arr.lastIndexOf(2) //returns the index of last occurrence of an element
    println("Index of last occurrence of 2 is: $lastIndex")
    val count = arr.count { it % 2 == 0 } //returns the number of elements satisfying a condition
    println("Count of elements with particular condition: $count")
    val hasEven = arr.any { it % 2 == 0 } //checks if any element satisfies a condition
    println("Is there any even number in array: $hasEven")
    val allEven = arr.all { it % 2 == 0 } //checks if all elements satisfy a condition
    println("If all element satisfies a condition: $allEven")
}