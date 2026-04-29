package oop_00000107431_RichardLiu.week10lec

// Non-Generic Programming
class meja(val hasil:Any)

// Generic Programming
class kursi<T>(val hasil: T)

// Generic Programming
class Televisi<T, V>(val merk:T, val kodeBarcode: V)

// Generic - Function
fun <T> Alamat(kodePos:T):T {
    return kodePos
}

// Generic - Cosntraint
class kalkulator<T: Number>(val a:T, val b:T) {
    fun tambah():Int {
        return a.toInt() + b.toInt()
    } fun kurang(): Double {
        return a.toDouble() - b.toDouble()
    }
}

// Generic - WHERE
val arNilai = listOf(60, 70, 85, 75, 63, 83, 92, 76, 46, 71)
fun <T> nilaiDiatasKKM(list: List<T>, kkm:T): List<T> where T: Comparable<T>{
    return list.filter {it >= kkm}
}


fun main() {
    // Implementasi Non-Generic
    println("======= implementasi Non-Generic =======")
    val mj = meja(100)
    val hargaMeja = mj.hasil as Int
    println(hargaMeja + 50)

    // Implementasi Generic
    println("\n======= implementasi Generic =======")
    val chair = kursi(300)
    println(chair.hasil + 50)

    println("\n======= implementasi Multi Param =======")
    val tv = Televisi("Samsung", 884777)
    println("Merknya " + tv.merk)
    println("Barcode " + tv.kodeBarcode + 77777)

    println("\n======= Generic Function =======")
    println("Kode pos kamu " + Alamat(154133))

    println("\n======= Generic - Kalkulator =======")
    val kal = kalkulator(10.5, 20.5)
    println("Hasil Penambahan: ${kal.a} ditambah ${kal.b}" + kal.tambah())
    println("Hasil Pengurangan: ${kal.a} dikurang ${kal.b}" + kal.kurang())

    println("\n======= Generic - Where ======")
    println("Semua nilai: " + arNilai)
    var nilaikkm = nilaiDiatasKKM(arNilai, 70)
    println("Nilai diatas KKM: " + nilaikkm)
}