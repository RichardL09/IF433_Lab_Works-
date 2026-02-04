package oop_00000107431_RichardLiu.week01

fun main(args: Array<String>) {
    // Variable definition (Ubah var menjadi val, dan hapus tipe data ekspilit)
    val radius = 7.0
    val pi = 3.14

    // Calculation (Ubah var menjadi val dan hapus tipe data ekspilit)
    val area = pi * radius * radius

    // Output String Template (Ubah println menjadi String Template) + Panggil fungsi checksize didalam println
    println("Radius: $radius, Area: $area, ${checkSize(area)}")
}

// Mengubah signature
fun checkSize(area: Double) =
    if (area > 100){
        "This is a Big Circle"
    } else {
        "This is a Small Circle"
    }