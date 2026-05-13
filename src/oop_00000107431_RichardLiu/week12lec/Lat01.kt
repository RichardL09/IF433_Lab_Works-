package oop_00000107431_RichardLiu.week12lec

fun basic_trycatch(pembilang:Int, penyebut:Int) {
     try {
         val hasil = pembilang / penyebut
         println("hasil bagi $hasil")
     } catch (e: Exception) {
         println("Ada error pembagian ${e.message}")
     } finally {
         println("Selesai pembagian")
    }
}

fun cek_tipe_data(angka:String) {
    var nilai:Int = try {
        Integer.parseInt(angka)
    } catch (e: Exception) {
        println("ada error di cek tipe data ${e.message}")
        123
    }
    println("Nilai kamu $nilai")
}

fun cek_gaji(hariKerja:Int) {
    if(hariKerja<0) {
        throw IllegalArgumentException("Masa hari kerja minus")
    } else {
        val gaji = hariKerja * 1000
        println("Gaji kamu $gaji")
    }
}

fun main() {
    // coba Throw
    try {
        cek_gaji(-1)
    } catch (e: Exception) {
        println("Error coba catch ::: ${e.message}")
    }

    // Exception - Expression
    cek_tipe_data("abc")

    // basic exception
    basic_trycatch(10, 0)
}