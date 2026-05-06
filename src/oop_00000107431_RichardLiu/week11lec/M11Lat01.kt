package oop_00000107431_RichardLiu.week11lec

// function biasa
fun salam_pembuka(nama: String) {
    if(nama=="Budi gunawan") {
        println("Salam kenal")
    } else {
        println("Ih kamu siapa")
    }
}

// function extension - basoc
fun String.rubah_huruf_depan_jadi_besar(): String {
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return "Hai $hasil"
}

// function extension - parameters
fun Int.tentukanGrade(namaMhs:String) {
    var hasilGrade = "E"
    if(this>=80) {
        hasilGrade = "A"
    } else if (this>=70) {
        hasilGrade = "B"
    } else {
        hasilGrade = "C"
    }
    println(namaMhs + " Grade kamu " + this)
}

// function extension - null
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()) {
        return "Username ga boleh null atau empty"
    } else {
        return "Username kamu $this"
    }
}

fun main() {
    var namaSaya = "Budi gunawan"
    salam_pembuka(namaSaya)
    println(namaSaya.uppercase())

    // cara panggil function extension - Dasar
    println("Udin sedunia d2oeidnejdnwdnw djpsqkndqsldxnsq epwdijwedk".rubah_huruf_depan_jadi_besar())

    // cara panggil function extension - Parameter
    var hasilStr = 71.tentukanGrade("Maku")

    // cara panggil function extension - Null
    var usernameKamu:String = "Maku"
    println(usernameKamu.uppercase())

    // SCOPE - LET
    var kampusKamu = "UMN"
    kampusKamu.let {
        println("Nama kampus kamu " + it)
        if(it=="UMN") {
            println("Ih Keren")
        } else {
            println("Amazing")
        }
    }

    // SCOPE - RUN
    val namaMatkul = "OOP"
    namaMatkul.run {
        println("Matkul favorite saya " + this)
    }

    // SCOPE - WITH
    val keputusanLulus = with(70) {
        if(this > 70) {
            "Lulus"
        } else {
            "Remedial"
        }
    }
    println("Kamu $keputusanLulus")

    // SCOPE - APPLY
    val namaMahasiswa = Mahasiswa().apply {
        nim = "12345"
        nama = "Maku"
        nilai = "100"
    }
    println("si ${namaMahasiswa.nama} nilainya ${namaMahasiswa.nilai}")

    // SCOPE - ALSO
    val arDeret = mutableListOf<Int>(60, 70, 56, 80)
    arDeret.also {
        println("Deret Sebelum: $arDeret")
    }.add(90)
    println("Deret Setelah: $arDeret")
}

class Mahasiswa {
    var nim:String = ""
    var nama:String = ""
    var nilai:String = ""
}