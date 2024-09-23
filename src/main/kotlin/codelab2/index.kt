package org.example.codelab2
import java.util.*    // required import
fun gen(){
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))
    println(updateDirty(30, waterFilter))
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

}
val lazyMap = decorations.asSequence().map {
    println("access: $it")
    it
}
val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
    println("access: $it")
    it
}
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
fun main() {
    gen()
    feedTheFish()
    randomDay()
    fishFood("Monday")
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")
shouldChangeWater()// named parameter
    isSunday()
    isTooHot()
    isDirty()
    println( decorations.filter {it[0] == 'p'})
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

            println("lazy: $lazyMap")
            println("-----")
            println("first: ${lazyMap.first()}")
            println("-----")
            println("all: ${lazyMap.toList()}")
            println("-----")
            println("filtered: ${lazyMap2.toList()}")
    updateDirty()
    increaseDirty()
}
fun increaseDirty( start: Int ) = start + 1{
    println(updateDirty(15, ::increaseDirty))
}
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"
