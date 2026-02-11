package oop_00000107431_RichardLiu.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\nPertarungan dimulai melawan Monster dengan 100 HP!")

    while (hero.isAlive() && enemyHp > 0) {

        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {

            1 -> {
                // Hero menyerang
                hero.attack("Monster")
                enemyHp -= hero.baseDamage

                if (enemyHp < 0) {
                    enemyHp = 0
                }

                println("HP Monster tersisa: $enemyHp")

                // Jika musuh masih hidup, dia membalas
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Monster membalas sebesar $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                    println("HP $heroName tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("$heroName memilih untuk kabur!")
                break
            }

            else -> {
                println("Pilihan tidak valid.")
            }
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("$heroName menang!")
    } else if (!hero.isAlive()) {
        println("$heroName kalah...")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}