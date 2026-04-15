package oop_00000107431_RichardLiu.week08lec

class Alamat(val nomor:String, val kota:String)
class Mahasiswa(val nama:String, val addr: Alamat?)

fun main() {
    val alm = Alamat("47", "Tangerang")
    val mhs = Mahasiswa("Richard", null)

    //kalau alamat-nya null, kita akan kasih nilai default
    val defKota = mhs.addr?.let {
        alamatDefault->"Tinggal di ${mhs.addr.kota} nomor ${mhs.addr.nomor}"
    }?:"Tidak tau tinggal dimana"

    println("hai ${mhs.nama} kamu tinggal di ${defKota}")
}
