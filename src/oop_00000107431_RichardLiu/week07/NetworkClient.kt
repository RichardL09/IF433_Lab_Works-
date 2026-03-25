package oop_00000107431_RichardLiu.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connected to $url....")
    }
}