package org.example.codelab3


fun acu() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    println("-------")
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    println("-------")
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    println("-------")
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    println("-------")
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
    println("-------")
    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()
    println("****************")
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}


fun main() {
    acu()
    println("****************")
    makeFish()
    println("****************")
}