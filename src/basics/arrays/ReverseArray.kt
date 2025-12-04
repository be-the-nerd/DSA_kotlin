package basics.arrays

import kotlin.system.measureTimeMillis

fun main() {
    val myArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 11, 12, 13, 14, 15, 16, 17, 1, 7, 6)
    val executionTime = measureTimeMillis { reverseArray(myArray) }
    println("Reversed array: ${myArray.joinToString()} \nExecution time: ${executionTime}ms")
}

/** Two-pointers pattern **/
fun reverseArray(arr: IntArray) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }
}