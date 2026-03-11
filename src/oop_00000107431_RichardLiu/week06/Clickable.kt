package oop_00000107431_RichardLiu.week06

interface Clickable {
    // ERROR : Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicity Abstract)
    fun click()
}