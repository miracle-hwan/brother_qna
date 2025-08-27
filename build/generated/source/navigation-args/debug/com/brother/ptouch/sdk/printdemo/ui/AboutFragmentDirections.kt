package com.brother.ptouch.sdk.printdemo.ui

import androidx.navigation.NavDirections
import com.brother.ptouch.sdk.printdemo.NavigationMainDirections

public class AboutFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalFragmentShowResult(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentShowResult()

    public fun actionGlobalFragmentGetInt(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetInt()

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        NavigationMainDirections.actionGlobalFragmentGetIntList()
  }
}
