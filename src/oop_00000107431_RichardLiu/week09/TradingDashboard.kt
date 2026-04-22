package oop_00000107431_RichardLiu.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 7.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 8, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 3.1, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 12, 9.8, "CLOSED")
    )
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
}