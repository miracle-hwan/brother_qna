package com.brother.ptouch.sdk.printdemo.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.brother.ptouch.sdk.printdemo.NavigationMainDirections
import com.brother.ptouch.sdk.printdemo.R

public class PrintTemplateFragmentDirections private constructor() {
  public companion object {
    public fun toInputTemplateKeyFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.to_input_template_key_fragment)

    public fun actionGlobalFragmentShowResult(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentShowResult()

    public fun actionGlobalFragmentGetInt(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetInt()

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetIntList()
  }
}
