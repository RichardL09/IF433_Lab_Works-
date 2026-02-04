package oop_00000107431_RichardLiu.week01

fun main() {
    val gameTitle = "Pokemon Scarlet and Violet Double Pack version"
    val price = 1500000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        price = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String?) {
    println("Game Title  : $title")
    println("Price: $price")
    println("Final Price : Rp $finalPrice")
    println("Note: ${note ?: "Tidak ada catatan"}")
}