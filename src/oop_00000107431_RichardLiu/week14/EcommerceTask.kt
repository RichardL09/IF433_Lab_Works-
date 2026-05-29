package oop_00000107431_RichardLiu.week14
import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), melakukan kalkulasi + I/O + Notifikasi sekaligus
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP"     -> basePrice * 0.90 // Diskon 10%
            else      -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// =============================================
// FIX SRP & DIP
// =============================================

// Abstraksi untuk penyimpanan order
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// Implementasi konkret: tulis ke CSV dengan safe use block
class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File("orders_safe.csv").printWriter().use { writer ->
            writer.println("$itemName,$finalPrice,$customerType")
        }
        println("Order disimpan ke CSV: $itemName")
    }
}

// Abstraksi untuk notifikasi
interface NotificationService {
    fun sendNotification(itemName: String)
}

// Implementasi konkret: kirim email
class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// Processor utama yang bersih — SRP & DIP terpenuhi
class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

// =============================================
// FIX OCP — PricingStrategy
// =============================================

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90 // Diskon 10%
}

// Contoh ekstensi baru tanpa ubah SafeOrderProcessor sama sekali
class FlashSalePricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.50 // Diskon 50%
}

// main untuk demo keseluruhan pipeline
fun main() {
    val repo     = CsvOrderRepository()
    val notifier = EmailNotifier()
    val processor = SafeOrderProcessor(repo, notifier)

    val vipStrategy       = VipPricing()
    val regularStrategy   = RegularPricing()
    val flashSaleStrategy = FlashSalePricing()

    println("=== E-COMMERCE ORDER PROCESSING ===")
    processor.processOrder("MacBook Pro", vipStrategy.calculate(25000000.0),     "VIP")
    processor.processOrder("iPhone 15",   regularStrategy.calculate(15000000.0), "REGULAR")
    processor.processOrder("AirPods",     flashSaleStrategy.calculate(3000000.0),"FLASH_SALE")
}