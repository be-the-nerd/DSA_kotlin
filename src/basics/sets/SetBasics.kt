package basics.sets

/**
 * Set<T> stores unique elements.
 * Order is generally undefined(except in specific implementations like LinkedHashSet).
 * Set can contain only one null value.
 * MutableSet<T> :  A set that supports modification operations such as adding or removing elements.
 */

fun main() {
    typesOfSets()
    iteratingOverSets()
    specializedVariants()
}

fun typesOfSets() {
    val set = setOf(1, 2, 2, 3, 4, 5, 6, 7, 8, 9)  //Immutable set //2 is duplicate and is ignored
    println(set)

    data class Student(val name: String, val grade: Int)

    val customObjectSet = setOf(Student("John", 50), Student("Doe", 80))
    println(customObjectSet)

    val emptyMutableSet = mutableSetOf<String>()  //Empty mutable set
    emptyMutableSet.add("Java")
    emptyMutableSet.add("Kotlin") //adding new element
    emptyMutableSet.add("Python")  //removing element
    emptyMutableSet.remove("Python")
    println(emptyMutableSet)
    emptyMutableSet.clear() //clear set
}

fun iteratingOverSets() {
    //Using for loop
    val fruits = setOf("Apple", "Banana", "Cherry")
    for (f in fruits) {
        print("$f,")
    }

    //Using for each
    println()
    fruits.forEach {
        print("$it,")
    }
}

fun specializedVariants() {
    /** HashSet<T>
     * Unordered collection
     * No duplicated
     * Used hash table for storage
     * O(1) -> Access,Insertion,Deletion
     */
    val hashSet = HashSet<String>()
    hashSet.add("Dell")
    hashSet.add("HP")
    hashSet.add("HP")  // Duplicate, will not be added
    println("\nHashSet: $hashSet")

    /** LinkedHashSet<T>
     * Variant of HashSet
     * Maintains insertion order
     * No duplicates
     * O(1) -> Insertion
     * O(n) -> Iteration
     */
    val linkedHashSet = LinkedHashSet<String>()
    linkedHashSet.add("Samsung")
    linkedHashSet.add("OnePlus")
    linkedHashSet.add("Samsung")  // Duplicate, will not be added
    println("LinkedHashSet: $linkedHashSet")

    /** SortedSet<T>
     * Sorted order
     * No duplicates
     */
    val sortedSet = sortedSetOf("Banana", "Apple", "Cherry")
    println("SortedSet: $sortedSet")
}