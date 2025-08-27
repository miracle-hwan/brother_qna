package com.brother.ptouch.sdk.printdemo.model

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.hardware.usb.UsbManager
import com.brother.sdk.lmprinter.Channel
import com.brother.sdk.lmprinter.Channel.ChannelType.*

object PrinterConnectUtil {
    fun getCurrentChannel(context: Context, printerInfo: DiscoveredPrinterInfo): Channel? {
        return when (printerInfo.channelType) {
            USB -> Channel.newUsbChannel(context.getSystemService(Context.USB_SERVICE) as UsbManager)
            Wifi -> Channel.newWifiChannel(printerInfo.channelInfo)
            Bluetooth -> Channel.newBluetoothChannel(
                    printerInfo.channelInfo, getBluetoothAdapter(context)
            )
            BluetoothLowEnergy -> Channel.newBluetoothLowEnergyChannel(
                printerInfo.channelInfo, context, getBluetoothAdapter(context)
            )
            else -> null
        }
    }

    private fun getBluetoothAdapter(context: Context): BluetoothAdapter? {
        val manager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        return manager.adapter
    }
}
