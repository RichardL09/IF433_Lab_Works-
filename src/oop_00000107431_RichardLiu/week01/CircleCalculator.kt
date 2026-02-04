package oop_00000107431_RichardLiu.week01

fun main(args: Array<String>) {
    // Variable definition (Ubah var menjadi val, dan hapus tipe data ekspilit)
    val radius = 7.0
    val pi = 3.14

    // Calculation (Ubah var menjadi val dan hapus tipe data ekspilit)
    val area = pi * radius * radius

    // Output String Template (Ubah println menjadi String Template)
    println("Radius: $radius, Area: $area")

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100){
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}