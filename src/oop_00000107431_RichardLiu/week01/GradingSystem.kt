package oop_00000107431_RichardLiu.week01

fun main() {
    // REFACTOR: Gunakan val dan hapus tipe data ekspilit
    val name = "John Thor"
    val score = 80

    // Concatenation gaya lama
    println("Nama: $name, Nilai: $score")

    // Tambahkan di bawah println
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 60 .. 79 -> "C"
        else -> "D"
    }
    println("Grade kamu : $grade")
}