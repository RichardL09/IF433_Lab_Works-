package oop_00000107431_RichardLiu.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")n
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk()      // Memanggil method yang sudah di-override
    myCar.accelerate()// Memanggil gabungan method Parent dan Child
}