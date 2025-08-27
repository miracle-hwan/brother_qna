package com.brother.ptouch.sdk.printdemo.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.brother.ptouch.sdk.printdemo.NavigationMainDirections
import com.brother.ptouch.sdk.printdemo.R

public class PrintPDFFragmentDirections private constructor() {
  public companion object {
    public fun toInputPages(): NavDirections = ActionOnlyNavDirections(R.id.to_input_pages)

    public fun toPrintSettings(): NavDirections = ActionOnlyNavDirections(R.id.to_print_settings)

    public fun actionGlobalFragmentShowResult(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentShowResult()

    public fun actionGlobalFragmentGetInt(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetInt()

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetIntList()
  }
}
