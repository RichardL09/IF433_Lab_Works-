package oop_00000107431_RichardLiu.week01

fun main() {
    // Ubah var menjadi val, dan hapus tipe data ekspilit
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    // Ubah println menjadi String Template + Panggil fungsi checksize didalam println
    println("Radius: $radius, Area: $area, ${checkSize(area)}")
}
fun checkSize(area: Double) =
    if (area > 100){
        "This is a Big Circle"
    } else {
        "This is a Small Circle"
    }