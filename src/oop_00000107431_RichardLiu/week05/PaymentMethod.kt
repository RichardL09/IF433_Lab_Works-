package oop_00000107431_RichardLiu.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}