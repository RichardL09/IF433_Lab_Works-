package oop_00000107431_RichardLiu.week03

fun main(){
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan meledakkan program anda
}