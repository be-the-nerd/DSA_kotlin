package basics.lists

import java.util.LinkedList

/**
 * List<T> : A read-only list.
 * MutableList<T> : A list that supports modification operations such as adding, removing or updating elements.
 * Mutable collections aren't COVARIANT
 */

fun main() {
    typesOfLists()
    creatingInitializingLists()
    accessingUpdatingLists()
    iteratingOverList()
    listExtensions()
    specializedOrVariantTypes()
}


fun typesOfLists() {
    val numbers = listOf("One", "Two", "Three", "Four", "Five")  //Immutable list - read only
    println(numbers)
    val mNumbers = mutableListOf("Zero", "One", "Two", "Three", "Four", "Five")  //Mutable list
    mNumbers.add("Six")
    mNumbers.remove("Zero")
    println(mNumbers)
}

fun creatingInitializingLists() {
    val stringList = listOf("Kotlin", "Java", "Python", "Javascript")
    println(stringList)

    data class Student(val name: String, val grade: Int)

    val studentList = listOf(Student(name = "Dexter", grade = 80), Student(name = "Bob", grade = 70))
    println(studentList)

    val mutableList = mutableListOf("a", "b", "c")
    mutableList.add("d")
    println(mutableList)

    val emptyList = listOf<Int>() //Empty immutable list
    val emptyMutableList = mutableListOf<Int?>()  //Empty mutable list
    emptyMutableList.add(1)
    emptyMutableList.add(2)
    emptyMutableList.add(3)
    emptyMutableList.add(null)  //Lists can hold null
    println(emptyMutableList)

    val studentMutableList = mutableListOf<Student>()
    studentMutableList.add(Student(name = "xyz", 75))
    println(studentMutableList)
}

fun accessingUpdatingLists() {
    val mutableList = mutableListOf(10, 20, 30, 40, 50)
    mutableList[0] = 100  //Modifying element
    mutableList.add(40)  //Adding an element
    mutableList.remove(20)  //Removing an element
    mutableList.removeAt(4)  //Removes the element at specified index
    //mutableList.clear()  //Clear list
    println("Is 33 exists in list: ${mutableList.contains(33)}")  //Checking if an element exists
    println(mutableList)
}

fun iteratingOverList() {
    val list = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90)

    //Using for loop
    for (l in list) {
        print("$l,")
    }

    //Using for-each
    println()
    list.forEach { print("$it,") }
}

fun listExtensions() {
    val list = listOf(1, 2, 3, 4, 5)
    println("\nSum: ${list.sum()}")  //Sum
    println("Shuffled list: ${list.shuffled()}")  //Randomly shuffle elements
    println("List to Set: ${list.toSet()}")  //To Set
    val listToMap = listOf("a" to 1, "b" to 2, "c" to 3)
    println("List to Map: ${listToMap.toMap()}")  //To Map
    val evenNumbers = list.filter { it % 2 == 0 }  //Filter
    println("Filtered list: $evenNumbers")
    val doubledList = list.map { it * 2 }  //Map - transform each element
    println("Mapped list: $doubledList")
    println("Return first element of list: ${list.first()}") //Get the first element of the list
    println("Return last element of list: ${list.last()}")  //Get the last element of the list
}

fun specializedOrVariantTypes() {
    /**
     * ArrayList
     * Access - O(1)
     * Insert/Delete - O(n)
     */
    val arrayList = arrayListOf("Apple", "Banana", "Cherry")
    arrayList.add("Kiwi") //Insert
    println(arrayList[0]) //Access
    println(arrayList.removeAt(3))
    println("ArrayList: $arrayList")

    /**
     * LinkedList
     * Access - O(n)
     * Insert/Delete - O(1)
     */
    val linkedList = LinkedList<String>()
    linkedList.add("Kotlin")
    linkedList.addFirst("Java")
    linkedList.addLast("Python")
    println("LinkedList: $linkedList")
}