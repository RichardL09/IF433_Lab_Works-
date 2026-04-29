package oop_00000107431_RichardLiu.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 5000.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )
    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }
    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250000.0))
    txRepo.add(Transaction("TX002", 500000.0))

    println("\nTransaction List:")

    txRepo.getAll().forEach {
        println("Transaction ID: ${it.id}, Amount: ${it.amount}")
    }
}