package oop_00000107431_RichardLiu.week09lec

fun main() {
    println("============ LIST OF IMUT ============")
    val arSiswa = listOf("Ali", "Budi", "Cica")
    // view isi array
    println(arSiswa)
    // munculin satu item
    println(arSiswa[1])
    // menghitung banyak item
    println("banyak siswa: " + arSiswa.size)
    // munculin semua siswa
    for(i in arSiswa) {
        println("ini siswa nya " + i)
    }

    println("============ LIST OF MUT ============")
    val arMatkul = mutableListOf("OOP", "Matdis", "GameDev")
    arMatkul.add("Kalkulus")
    arMatkul[2] = "PemWeb"
    arMatkul.remove("Matdis")
    println(arMatkul)

    println("============ SET OF IMUT ============")
    var arNilai = setOf(80,90,20,30,90,70,20,10,100)
    println("Banyak data: " + arNilai.size)
    println("Apakah ada angka 20? ${arNilai.contains(20)}" )
    println(arNilai)

    println("============ SET OF MUT ============")
    var arMakanan = mutableSetOf("Nasi goreng", "Tempe", "Tahu", "Bakpao", "Tahu", "Ayam")
    arMakanan.add("Mie")
    arMakanan.remove("Tahu")
    arMakanan.add("Tempe")
    println(arMakanan)

    println("============ MAP IMUT ============")
    var arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 83
        )
    println("Banyak data: ${arDataMhs.size}")
    println("Si Acong nilainya: ${arDataMhs["Acong"]}")
    println("List semua Mhs: ${arDataMhs.keys}")
    println("List semua nilai: ${arDataMhs.values}")
    println(arDataMhs)

    println("============ MAP MUT ============")
    var arMenuResto = mutableMapOf(
        "Mie Ayam" to 5000,
        "Mie Bakso" to 6000,
        "Mie Pangsit" to 65000
    )
    arMenuResto["Mie Bakso"] = 6200
    arMenuResto.remove("Mie Ayam")
    println(arMenuResto)

    println("============ LAMBDA ============")
    // cara lama -> function tulis kebawah
    fun tambah(a:Int, b:Int):Int{
        return a + b
    }
    // cara baru -> function tulis kesamping
    var kurang = {a:Int, b:Int->a-b}
    println("Hasil kurang ${kurang(10, 3)}")

    println("============ LAMBDA (IT) ============")
    val pangkat = {a:Int -> a*a}
    val hitungPangkat:(Int) -> Int = {it*it}
    println("Hasil pangkat adalah ${hitungPangkat(5)}")
}