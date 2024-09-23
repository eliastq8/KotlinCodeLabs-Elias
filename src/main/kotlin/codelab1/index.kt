package org.example.codelab1

fun printHello() {
    println ("Hello World")
}
fun ecua(){
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)
    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)
    val i4: Int = b2.toInt() // OK!
    println(i4)
    val i5: String = b2.toString()
    println(i5)
    val i6: Double = b2.toDouble()
    println(i6)



    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)

    for (i in 5 downTo 1) print(i)

    for (i in 3..6 step 2) print(i)

    for (i in 'd'..'g') print (i)


    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}




fun main() {
    printHello()
    ecua()
}