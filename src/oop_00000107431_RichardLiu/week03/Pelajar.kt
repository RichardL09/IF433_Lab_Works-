package oop_00000107431_RichardLiu.week03

open class Pelajar {
    private var nama: String ="belum ada nama"
    private var nilai:Int = 0
    protected var jmlsks:Int = 3

    public var uangjajan:Int = 1000
        set(value) {
            if (value <= 0) {
                println("Uang jajan ga boleh minus")
            } else {
                field = value
            }
        }
        get() {
            return field + 200
        }

    public fun set_nama(namaorang: String) {
        if(namaorang.length < 0){
            println("eh nama orang ga boleh kosong")
        } else {
            this.nama = namaorang
        }
    }

    public fun get_nama(): String {
        return this.nama
    }

    public fun set_nilai(nilaiorang: Int) {
        if(nilaiorang <= 0){
            println("Masukin nilai yang bener bang")
        } else if(nilaiorang >= 101) {
            println("Jangan lebih dari 100 woi")
        }else {
            this.nilai = nilaiorang
        }
    }
    public fun get_nilai(): Int {
        return this.nilai
    }
}

class MataKuliah: Pelajar() {
    public fun muncul_namasks(): Int {
        return this.jmlsks
    }
}

fun main() {
    var mahasiswa = MataKuliah()
    mahasiswa.set_nama("Giku")
    var nilai = Pelajar()
    mahasiswa.set_nilai(100)
    println("Nama kamu: " + mahasiswa.get_nama() + " Nilai kamu: " + mahasiswa.get_nilai())
    println("SKS kamu: " + mahasiswa.muncul_namasks())
    mahasiswa.uangjajan = -1000
    println("Uang kamu: " + mahasiswa.uangjajan)
//    println("hai " + mahasiswa.nama + " nilai kamu " + mahasiswa.nilai)
}