package oop_00000107431_RichardLiu.week06

// ERROR: Class Smartphone inherits multiple implementations of turnOn()
class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting")
    }
}