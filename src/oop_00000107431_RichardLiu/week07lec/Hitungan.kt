package oop_00000107431_RichardLiu.week07lec

class Hitungan private constructor(var halaman:String) {
    companion object {
        const val namaKampus: String = "UMN"
        const val noIndukKampus: String = "0923040706"

        fun penambahan(a:Int, b:Int): Int {
            return a + b
        }
        fun pindah_halaman(namaHal:String) {
            Hitungan(namaHal)

        }
    }

    init {
        if(halaman=="home") {
            println("Welcome Home")
        } else {
            println("Halaman lainnya")
        }
    }
}