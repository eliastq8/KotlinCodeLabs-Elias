package org.example.codelab3

interface FishAction {
    fun eat()
}

object GoldColor : FishColor {
    override val color = "gold"
}

interface FishColor {
    val color: String
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}



fun main() {

}