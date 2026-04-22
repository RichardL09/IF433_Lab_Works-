package oop_00000107431_RichardLiu.week09

fun main() {
    println("=== TEST LAMBDA ===")
    // Syntax Lambda eksplisit: { parameters -> body }
    val sumLambda = { a: Int, b: Int -> a + b}
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Lambda dengan satu parameter bisa menggunakan implicit
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}