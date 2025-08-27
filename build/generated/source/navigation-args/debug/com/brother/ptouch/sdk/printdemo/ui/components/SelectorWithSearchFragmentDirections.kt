package com.brother.ptouch.sdk.printdemo.ui.components

import androidx.navigation.NavDirections
import com.brother.ptouch.sdk.printdemo.NavigationMainDirections

public class SelectorWithSearchFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalFragmentShowResult(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentShowResult()

    public fun actionGlobalFragmentGetInt(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetInt()

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetIntList()
  }
}
