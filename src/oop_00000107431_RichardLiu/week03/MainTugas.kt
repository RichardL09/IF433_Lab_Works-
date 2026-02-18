package oop_00000107431_RichardLiu.week03

fun main() {

    println("=== TEST WEAPON ===")

    val sword = Weapon("Excalibur", 300)

    println("Damage awal: ${sword.damage}")
    println("Tier awal: ${sword.tier}")

    println("\nSet damage ke -50")
    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")

    println("\nSet damage ke 9999")
    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")
    println("Tier sekarang: ${sword.tier}")
}