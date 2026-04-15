package oop_00000107431_RichardLiu.week08lec

class set_Krs(val nim:String?, val tahun:Int?) {
    fun pilih_matkul(kodeMatkul:String?) {
        println("Matkul dipilih $kodeMatkul")
    }
}

fun main() {
    var nama:String? = "Wirawan"
    nama = null
    println("hi $nama")

    val setKRS = set_Krs(nim = "000123", tahun = null)
    println("si ${setKRS.nim} masuk tahun ${setKRS.tahun}")
    setKRS.pilih_matkul(null)
}