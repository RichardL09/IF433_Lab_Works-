package oop_00000107431_RichardLiu.week04

fun main() {
    println("\n=== EMPLOYEE HIERARCHY TEST ===")

    val manager = Manager("Maku", 10_000_000)
    val developer = Developer("Giku", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}