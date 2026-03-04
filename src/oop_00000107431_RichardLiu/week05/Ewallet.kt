package oop_00000107431_RichardLiu.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet ($accountName): Pembayaran sukses. Sisa saldo: $balance")
        } else {
            println("EWallet ($accountName): Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("EWallet ($accountName): Top up berhasil. Saldo sekarang: $balance")
    }
}