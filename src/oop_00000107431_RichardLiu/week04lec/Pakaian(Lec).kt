package oop_00000107431_RichardLiu.week04lec

open class `Pakaian(Lec)` {
    private var merk:String = ""
    protected var harga:Int = 0
    init {
        this.merk= "Uniqlo"
        println("Pakaian $merk")
    }
    open public fun jumlah_penjualan() {
        println("Pakaian terjual ")
    }
}