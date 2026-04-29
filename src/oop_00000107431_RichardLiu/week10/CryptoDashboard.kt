package oop_00000107431_RichardLiu.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 5000.0))
}