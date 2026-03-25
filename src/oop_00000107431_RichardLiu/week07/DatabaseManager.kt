package oop_00000107431_RichardLiu.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}