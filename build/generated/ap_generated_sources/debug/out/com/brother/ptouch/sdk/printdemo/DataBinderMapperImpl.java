package com.brother.ptouch.sdk.printdemo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentAboutBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentBaseListBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentEditTemplateBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentInputIntBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentInputIntListBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentListWithSearchBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentMainBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentPrintSettingsBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentPrinterConfigListBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentPrinterListBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentPrinterSetConfigBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentSelectEnumBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentSelectPrinterInterfaceBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentShowResultBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.FragmentTemplatePrintSettingsBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.ItemPrinterListBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.ItemRecyclerCategoryBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.ItemRecyclerConfigItemBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.ItemRecyclerItemBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.ItemSimpleStringBindingImpl;
import com.brother.ptouch.sdk.printdemo.databinding.ItemTitleWithMessageBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTABOUT = 1;

  private static final int LAYOUT_FRAGMENTBASELIST = 2;

  private static final int LAYOUT_FRAGMENTEDITTEMPLATE = 3;

  private static final int LAYOUT_FRAGMENTINPUTINT = 4;

  private static final int LAYOUT_FRAGMENTINPUTINTLIST = 5;

  private static final int LAYOUT_FRAGMENTLISTWITHSEARCH = 6;

  private static final int LAYOUT_FRAGMENTMAIN = 7;

  private static final int LAYOUT_FRAGMENTPRINTSETTINGS = 8;

  private static final int LAYOUT_FRAGMENTPRINTERCONFIGLIST = 9;

  private static final int LAYOUT_FRAGMENTPRINTERLIST = 10;

  private static final int LAYOUT_FRAGMENTPRINTERSETCONFIG = 11;

  private static final int LAYOUT_FRAGMENTSELECTENUM = 12;

  private static final int LAYOUT_FRAGMENTSELECTPRINTERINTERFACE = 13;

  private static final int LAYOUT_FRAGMENTSHOWRESULT = 14;

  private static final int LAYOUT_FRAGMENTTEMPLATEPRINTSETTINGS = 15;

  private static final int LAYOUT_ITEMPRINTERLIST = 16;

  private static final int LAYOUT_ITEMRECYCLERCATEGORY = 17;

  private static final int LAYOUT_ITEMRECYCLERCONFIGITEM = 18;

  private static final int LAYOUT_ITEMRECYCLERITEM = 19;

  private static final int LAYOUT_ITEMSIMPLESTRING = 20;

  private static final int LAYOUT_ITEMTITLEWITHMESSAGE = 21;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(21);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_base_list, LAYOUT_FRAGMENTBASELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_edit_template, LAYOUT_FRAGMENTEDITTEMPLATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_input_int, LAYOUT_FRAGMENTINPUTINT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_input_int_list, LAYOUT_FRAGMENTINPUTINTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_list_with_search, LAYOUT_FRAGMENTLISTWITHSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_print_settings, LAYOUT_FRAGMENTPRINTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_printer_config_list, LAYOUT_FRAGMENTPRINTERCONFIGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_printer_list, LAYOUT_FRAGMENTPRINTERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_printer_set_config, LAYOUT_FRAGMENTPRINTERSETCONFIG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_select_enum, LAYOUT_FRAGMENTSELECTENUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_select_printer_interface, LAYOUT_FRAGMENTSELECTPRINTERINTERFACE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_show_result, LAYOUT_FRAGMENTSHOWRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.fragment_template_print_settings, LAYOUT_FRAGMENTTEMPLATEPRINTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.item_printer_list, LAYOUT_ITEMPRINTERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.item_recycler_category, LAYOUT_ITEMRECYCLERCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.item_recycler_config_item, LAYOUT_ITEMRECYCLERCONFIGITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.item_recycler_item, LAYOUT_ITEMRECYCLERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.item_simple_string, LAYOUT_ITEMSIMPLESTRING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brother.ptouch.sdk.printdemo.R.layout.item_title_with_message, LAYOUT_ITEMTITLEWITHMESSAGE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBASELIST: {
          if ("layout/fragment_base_list_0".equals(tag)) {
            return new FragmentBaseListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_base_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITTEMPLATE: {
          if ("layout/fragment_edit_template_0".equals(tag)) {
            return new FragmentEditTemplateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_template is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINPUTINT: {
          if ("layout/fragment_input_int_0".equals(tag)) {
            return new FragmentInputIntBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_input_int is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINPUTINTLIST: {
          if ("layout/fragment_input_int_list_0".equals(tag)) {
            return new FragmentInputIntListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_input_int_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTWITHSEARCH: {
          if ("layout/fragment_list_with_search_0".equals(tag)) {
            return new FragmentListWithSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_with_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRINTSETTINGS: {
          if ("layout/fragment_print_settings_0".equals(tag)) {
            return new FragmentPrintSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_print_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRINTERCONFIGLIST: {
          if ("layout/fragment_printer_config_list_0".equals(tag)) {
            return new FragmentPrinterConfigListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_printer_config_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRINTERLIST: {
          if ("layout/fragment_printer_list_0".equals(tag)) {
            return new FragmentPrinterListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_printer_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRINTERSETCONFIG: {
          if ("layout/fragment_printer_set_config_0".equals(tag)) {
            return new FragmentPrinterSetConfigBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_printer_set_config is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSELECTENUM: {
          if ("layout/fragment_select_enum_0".equals(tag)) {
            return new FragmentSelectEnumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_select_enum is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSELECTPRINTERINTERFACE: {
          if ("layout/fragment_select_printer_interface_0".equals(tag)) {
            return new FragmentSelectPrinterInterfaceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_select_printer_interface is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOWRESULT: {
          if ("layout/fragment_show_result_0".equals(tag)) {
            return new FragmentShowResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_show_result is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEMPLATEPRINTSETTINGS: {
          if ("layout/fragment_template_print_settings_0".equals(tag)) {
            return new FragmentTemplatePrintSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_template_print_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRINTERLIST: {
          if ("layout/item_printer_list_0".equals(tag)) {
            return new ItemPrinterListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_printer_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECYCLERCATEGORY: {
          if ("layout/item_recycler_category_0".equals(tag)) {
            return new ItemRecyclerCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recycler_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECYCLERCONFIGITEM: {
          if ("layout/item_recycler_config_item_0".equals(tag)) {
            return new ItemRecyclerConfigItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recycler_config_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECYCLERITEM: {
          if ("layout/item_recycler_item_0".equals(tag)) {
            return new ItemRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recycler_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSIMPLESTRING: {
          if ("layout/item_simple_string_0".equals(tag)) {
            return new ItemSimpleStringBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_simple_string is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTITLEWITHMESSAGE: {
          if ("layout/item_title_with_message_0".equals(tag)) {
            return new ItemTitleWithMessageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_title_with_message is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "bean");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(21);

    static {
      sKeys.put("layout/fragment_about_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_about);
      sKeys.put("layout/fragment_base_list_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_base_list);
      sKeys.put("layout/fragment_edit_template_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_edit_template);
      sKeys.put("layout/fragment_input_int_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_input_int);
      sKeys.put("layout/fragment_input_int_list_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_input_int_list);
      sKeys.put("layout/fragment_list_with_search_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_list_with_search);
      sKeys.put("layout/fragment_main_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_main);
      sKeys.put("layout/fragment_print_settings_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_print_settings);
      sKeys.put("layout/fragment_printer_config_list_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_printer_config_list);
      sKeys.put("layout/fragment_printer_list_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_printer_list);
      sKeys.put("layout/fragment_printer_set_config_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_printer_set_config);
      sKeys.put("layout/fragment_select_enum_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_select_enum);
      sKeys.put("layout/fragment_select_printer_interface_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_select_printer_interface);
      sKeys.put("layout/fragment_show_result_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_show_result);
      sKeys.put("layout/fragment_template_print_settings_0", com.brother.ptouch.sdk.printdemo.R.layout.fragment_template_print_settings);
      sKeys.put("layout/item_printer_list_0", com.brother.ptouch.sdk.printdemo.R.layout.item_printer_list);
      sKeys.put("layout/item_recycler_category_0", com.brother.ptouch.sdk.printdemo.R.layout.item_recycler_category);
      sKeys.put("layout/item_recycler_config_item_0", com.brother.ptouch.sdk.printdemo.R.layout.item_recycler_config_item);
      sKeys.put("layout/item_recycler_item_0", com.brother.ptouch.sdk.printdemo.R.layout.item_recycler_item);
      sKeys.put("layout/item_simple_string_0", com.brother.ptouch.sdk.printdemo.R.layout.item_simple_string);
      sKeys.put("layout/item_title_with_message_0", com.brother.ptouch.sdk.printdemo.R.layout.item_title_with_message);
    }
  }
}
