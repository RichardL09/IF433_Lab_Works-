package oop_00000107431_RichardLiu.week04lec

class Celana: `Pakaian(Lec)`() {
    private var stock:Int = 20
    public fun update_stock() {
        super.harga = stock * 200
        println("Stock $stock celana terupdate, harga ${super.harga}")
    }
}