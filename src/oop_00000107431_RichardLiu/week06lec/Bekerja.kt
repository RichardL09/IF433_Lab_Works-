package oop_00000107431_RichardLiu.week06lec

interface Bekerja {
    public val namaKerjaan: String
    val gaji:Int
    val jmlHari:Int
    val GajiDidapat:Int
        get() = gaji * jmlHari

    public fun ngoding()

    public fun  tester() {
        println("Tes kerjaan baru")
    }
}