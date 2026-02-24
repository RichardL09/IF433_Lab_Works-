package oop_00000107431_RichardLiu.week04

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}

