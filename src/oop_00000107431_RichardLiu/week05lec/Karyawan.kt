package oop_00000107431_RichardLiu.week05lec

abstract class Karyawan {
    val name: String = "Budi"

    abstract fun bekerja(kecepatan:Int = 3):String

    fun terima_gaji() {
        println("Hore gajian !!")
    }
}

class Staff:Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Staff sedang ngetik, kecepatan: $kecepatan"
    }
    fun pegang_uang() {
        println("Staff pegang uang")
    }
}

class Manager:Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Manager mengawasi $kecepatan km/jam"
    }
    fun quality_control() {
        println("Manager melakukan Quality control")
    }
}

fun main() {
//    val staf = Staff()
//    println(staf.bekerja(7))
//
//    val mgr = Manager()
//    println(mgr.bekerja(12))
    var listkry:List<Karyawan> = listOf(
        Staff(),
        Manager()
    )

    println("Jenis karyawan ada " + listkry.size)

    for(kry in listkry) {
        println("Kerjanya karyawan: " + kry.bekerja(5))
    }
}