package oop_00000107431_RichardLiu.week01

fun main() {
    // Data game
    val gameTitle = "Pokemon Scarlet and Violet Double Pack version"
    val price = 1500000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

// Menghitung besar diskon berdasarkan harga game
fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }