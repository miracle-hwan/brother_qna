package com.brother.ptouch.sdk.printdemo.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.brother.ptouch.sdk.printdemo.NavigationMainDirections
import com.brother.ptouch.sdk.printdemo.R

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun toPrintImage(): NavDirections = ActionOnlyNavDirections(R.id.to_print_image)

    public fun toPrintPdf(): NavDirections = ActionOnlyNavDirections(R.id.to_print_pdf)

    public fun toTransferFiles(): NavDirections = ActionOnlyNavDirections(R.id.to_transfer_files)

    public fun toPrinterInfo(): NavDirections = ActionOnlyNavDirections(R.id.to_printer_info)

    public fun toSelectPrinter(): NavDirections = ActionOnlyNavDirections(R.id.to_select_printer)

    public fun toAbout(): NavDirections = ActionOnlyNavDirections(R.id.to_about)

    public fun toPrintTemplate(): NavDirections = ActionOnlyNavDirections(R.id.to_print_template)

    public fun toFileAnalyze(): NavDirections = ActionOnlyNavDirections(R.id.to_file_analyze)

    public fun actionGlobalFragmentShowResult(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentShowResult()

    public fun actionGlobalFragmentGetInt(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetInt()

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetIntList()
  }
}
