package oop_00000107431_RichardLiu.week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} ditambahkan ke Smart Home Hub")
    }

    fun turnOffAllSwitches() {

        for (device in devices) {

            if (device is Switchable) {
                device.turnOff()
            }

        }
    }

    fun activateSecurityMode() {

        println("Security Mode Aktif!")

        for (device in devices) {

            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }

        }
    }
}