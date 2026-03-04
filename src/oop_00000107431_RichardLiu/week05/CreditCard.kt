package oop_00000107431_RichardLiu.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard ($accountName): Transaksi sukses. Total terpakai: $usedAmount")
        } else {
            println("CreditCard ($accountName): Transaksi ditolak. Melebihi limit.")
        }
    }
}