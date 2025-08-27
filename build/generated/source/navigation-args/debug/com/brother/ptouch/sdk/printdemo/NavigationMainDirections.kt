package com.brother.ptouch.sdk.printdemo

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavigationMainDirections private constructor() {
  public companion object {
    public fun actionGlobalFragmentShowResult(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_fragment_show_result)

    public fun actionGlobalFragmentGetInt(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_fragment_get_int)

    public fun actionGlobalFragmentGetIntList(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_fragment_get_int_list)
  }
}
