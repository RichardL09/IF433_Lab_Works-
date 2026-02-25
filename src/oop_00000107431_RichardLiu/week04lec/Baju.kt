package oop_00000107431_RichardLiu.week04lec

class Baju: `Pakaian(Lec)`() {
    private var stock:Int = 10
    public fun update_stock(terjual:Int) {
        super.harga = stock * 100
        println("Stock $stock baju terupdate, harga ${super.harga}")
    }

    override public fun jumlah_penjualan() {
        println("Baju terjual !!!!!!!  ")
    }
}