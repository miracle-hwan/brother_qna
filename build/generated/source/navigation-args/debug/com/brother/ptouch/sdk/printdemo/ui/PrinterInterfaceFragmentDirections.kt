package com.brother.ptouch.sdk.printdemo.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.brother.ptouch.sdk.printdemo.NavigationMainDirections
import com.brother.ptouch.sdk.printdemo.R

public class PrinterInterfaceFragmentDirections private constructor() {
  public companion object {
    public fun toPrinterList(): NavDirections = ActionOnlyNavDirections(R.id.to_printer_list)

    public fun actionGlobalFragmentShowResult(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentShowResult()

    public fun actionGlobalFragmentGetInt(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetInt()

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetIntList()
  }
}
