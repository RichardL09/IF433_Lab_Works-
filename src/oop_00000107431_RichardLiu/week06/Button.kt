package oop_00000107431_RichardLiu.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil di klik")
    }
}