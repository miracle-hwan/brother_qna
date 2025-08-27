package com.brother.ptouch.sdk.printdemo.databinding;
import com.brother.ptouch.sdk.printdemo.R;
import com.brother.ptouch.sdk.printdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditTemplateBindingImpl extends FragmentEditTemplateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.edit_template_index_editor, 7);
        sViewsWithIds.put(R.id.edit_tempalte_object_editor, 8);
        sViewsWithIds.put(R.id.edit_template_text_editor, 9);
        sViewsWithIds.put(R.id.edit_template_encoding_layout, 10);
        sViewsWithIds.put(R.id.edit_template_encoding_spinner, 11);
        sViewsWithIds.put(R.id.edit_template_add_button, 12);
        sViewsWithIds.put(R.id.edit_template_delete_button, 13);
        sViewsWithIds.put(R.id.edit_template_data_text_view, 14);
        sViewsWithIds.put(R.id.edit_template_print_button, 15);
    }
    // views
    // variables
    // values
    // listeners
    private OnCheckedChangeListenerImpl mBeanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public FragmentEditTemplateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentEditTemplateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[11]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.EditText) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (android.widget.RadioGroup) bindings[1]
            , (android.widget.EditText) bindings[9]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            );
        this.editTemplateIndex.setTag(null);
        this.editTemplateIndexLayout.setTag(null);
        this.editTemplateObject.setTag(null);
        this.editTemplateObjectLayout.setTag(null);
        this.editTemplateRadioGroup.setTag(null);
        this.templateEditLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.bean == variableId) {
            setBean((com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBean(@Nullable com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean Bean) {
        updateRegistration(0, Bean);
        this.mBean = Bean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bean);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBean((com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean) object, fieldId);
            case 1 :
                return onChangeBeanSelectedEditType((androidx.databinding.ObservableField<com.brother.ptouch.sdk.printdemo.model.TemplateEditType>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBean(com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean Bean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBeanSelectedEditType(androidx.databinding.ObservableField<com.brother.ptouch.sdk.printdemo.model.TemplateEditType> BeanSelectedEditType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.brother.ptouch.sdk.printdemo.model.TemplateEditType beanSelectedEditTypeGet = null;
        int beanSelectedEditTypeTemplateEditTypeObjectNameViewVISIBLEViewGONE = 0;
        android.widget.RadioGroup.OnCheckedChangeListener beanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener = null;
        boolean beanSelectedEditTypeTemplateEditTypeObjectName = false;
        int beanSelectedEditTypeTemplateEditTypeIndexViewVISIBLEViewGONE = 0;
        boolean beanSelectedEditTypeTemplateEditTypeIndex = false;
        com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean bean = mBean;
        androidx.databinding.ObservableField<com.brother.ptouch.sdk.printdemo.model.TemplateEditType> beanSelectedEditType = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (bean != null) {
                        // read bean::onCheckedChanged
                        beanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener = (((mBeanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener == null) ? (mBeanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mBeanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener).setValue(bean));
                    }
            }

                if (bean != null) {
                    // read bean.selectedEditType
                    beanSelectedEditType = bean.getSelectedEditType();
                }
                updateRegistration(1, beanSelectedEditType);


                if (beanSelectedEditType != null) {
                    // read bean.selectedEditType.get()
                    beanSelectedEditTypeGet = beanSelectedEditType.get();
                }


                // read bean.selectedEditType.get() == TemplateEditType.ObjectName
                beanSelectedEditTypeTemplateEditTypeObjectName = (beanSelectedEditTypeGet) == (com.brother.ptouch.sdk.printdemo.model.TemplateEditType.ObjectName);
                // read bean.selectedEditType.get() == TemplateEditType.Index
                beanSelectedEditTypeTemplateEditTypeIndex = (beanSelectedEditTypeGet) == (com.brother.ptouch.sdk.printdemo.model.TemplateEditType.Index);
            if((dirtyFlags & 0x7L) != 0) {
                if(beanSelectedEditTypeTemplateEditTypeObjectName) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(beanSelectedEditTypeTemplateEditTypeIndex) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read bean.selectedEditType.get() == TemplateEditType.ObjectName ? View.VISIBLE : View.GONE
                beanSelectedEditTypeTemplateEditTypeObjectNameViewVISIBLEViewGONE = ((beanSelectedEditTypeTemplateEditTypeObjectName) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read bean.selectedEditType.get() == TemplateEditType.Index ? View.VISIBLE : View.GONE
                beanSelectedEditTypeTemplateEditTypeIndexViewVISIBLEViewGONE = ((beanSelectedEditTypeTemplateEditTypeIndex) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.editTemplateIndex, beanSelectedEditTypeTemplateEditTypeIndex);
            this.editTemplateIndexLayout.setVisibility(beanSelectedEditTypeTemplateEditTypeIndexViewVISIBLEViewGONE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.editTemplateObject, beanSelectedEditTypeTemplateEditTypeObjectName);
            this.editTemplateObjectLayout.setVisibility(beanSelectedEditTypeTemplateEditTypeObjectNameViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.editTemplateRadioGroup, (android.widget.RadioGroup.OnCheckedChangeListener)beanOnCheckedChangedAndroidWidgetRadioGroupOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.RadioGroup.OnCheckedChangeListener{
        private com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean value;
        public OnCheckedChangeListenerImpl setValue(com.brother.ptouch.sdk.printdemo.viewmodel.EditTemplateViewModel.Bean value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
            this.value.onCheckedChanged(arg0, arg1); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bean
        flag 1 (0x2L): bean.selectedEditType
        flag 2 (0x3L): null
        flag 3 (0x4L): bean.selectedEditType.get() == TemplateEditType.ObjectName ? View.VISIBLE : View.GONE
        flag 4 (0x5L): bean.selectedEditType.get() == TemplateEditType.ObjectName ? View.VISIBLE : View.GONE
        flag 5 (0x6L): bean.selectedEditType.get() == TemplateEditType.Index ? View.VISIBLE : View.GONE
        flag 6 (0x7L): bean.selectedEditType.get() == TemplateEditType.Index ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}