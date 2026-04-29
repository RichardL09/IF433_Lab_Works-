package oop_00000107431_RichardLiu.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}