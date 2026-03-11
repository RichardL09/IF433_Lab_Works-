package oop_00000107431_RichardLiu.week06lec

class Karyawan(
    override val namaKerjaan:String,
    override val gaji:Int,
    override val jmlHari: Int,
    override val namaGame: String,
    override val waktuMain: Int
) : Bekerja, Bermain {
    override fun ngoding() {
        println("Kerjaan kamu $namaKerjaan")
        println("Gaji kamu ${super.GajiDidapat}")
    }

    override fun main_game() {
        println("Main $namaGame selama $waktuMain")
    }

    override fun tester() {
        super<Bermain>.tester()
        super<Bekerja>.tester()
    }
}