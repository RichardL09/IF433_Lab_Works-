package oop_00000107431_RichardLiu.week07

class DatabaseManager {
    var connectionStatus: String = "DIsconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}