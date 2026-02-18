package oop_00000107431_RichardLiu.week03

class Player(
    val username: String
) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        }

        val previousLevel = level
        xp += amount
        val currentLevel = level

        if (currentLevel > previousLevel) {
            println("Level Up! Selamat $username naik ke level $currentLevel")
        }
    }
}
