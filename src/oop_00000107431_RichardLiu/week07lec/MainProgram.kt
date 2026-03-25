package oop_00000107431_RichardLiu.week07lec

fun main() {
    Koneksi.alamatServer = "makugiku"
    println("server: " + Koneksi.alamatServer)
    Koneksi.konek_db()

    println("Nama Kampus: " + Hitungan.namaKampus)
    println("No Induk Kampus: " + Hitungan.noIndukKampus)
    println("Hitungan: " + Hitungan.penambahan(20, 30 ))

    Hitungan.pindah_halaman("Profile")

    val siswa = Murid("Andi", "123", 2024)
    val siswa2 = siswa.copy(nama="Ani", nim="431")
    println(siswa)
    println(siswa2)
}
