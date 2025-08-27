package com.brother.ptouch.sdk.printdemo.databinding;
import com.brother.ptouch.sdk.printdemo.R;
import com.brother.ptouch.sdk.printdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInputIntListBindingImpl extends FragmentInputIntListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
    }
    // views
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    private OnTextChangedImpl mBeanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers

    public FragmentInputIntListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentInputIntListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.templateDelete.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setBean((com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBean(@Nullable com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean Bean) {
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
                return onChangeBean((com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean) object, fieldId);
            case 1 :
                return onChangeBeanIntListString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeBeanMessage((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBean(com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean Bean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBeanIntListString(androidx.databinding.ObservableField<java.lang.String> BeanIntListString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBeanMessage(androidx.databinding.ObservableField<java.lang.String> BeanMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean beanMessageEmpty = false;
        java.lang.String beanMessageGet = null;
        java.lang.String beanIntListStringGet = null;
        com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean bean = mBean;
        androidx.databinding.ObservableField<java.lang.String> beanIntListString = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged beanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        androidx.databinding.ObservableField<java.lang.String> beanMessage = null;
        int beanMessageEmptyViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (bean != null) {
                        // read bean.intListString
                        beanIntListString = bean.getIntListString();
                    }
                    updateRegistration(1, beanIntListString);


                    if (beanIntListString != null) {
                        // read bean.intListString.get()
                        beanIntListStringGet = beanIntListString.get();
                    }
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (bean != null) {
                        // read bean::onTextChanged
                        beanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mBeanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mBeanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mBeanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(bean));
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (bean != null) {
                        // read bean.message
                        beanMessage = bean.getMessage();
                    }
                    updateRegistration(2, beanMessage);


                    if (beanMessage != null) {
                        // read bean.message.get()
                        beanMessageGet = beanMessage.get();
                    }


                    if (beanMessageGet != null) {
                        // read bean.message.get().empty
                        beanMessageEmpty = beanMessageGet.isEmpty();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(beanMessageEmpty) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read bean.message.get().empty ? View.GONE : View.VISIBLE
                    beanMessageEmptyViewGONEViewVISIBLE = ((beanMessageEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, beanIntListStringGet);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)beanOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, beanMessageGet);
            this.mboundView2.setVisibility(beanMessageEmptyViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean value;
        public OnTextChangedImpl setValue(com.brother.ptouch.sdk.printdemo.viewmodel.InputIntListViewModel.DisplayBean value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bean
        flag 1 (0x2L): bean.intListString
        flag 2 (0x3L): bean.message
        flag 3 (0x4L): null
        flag 4 (0x5L): bean.message.get().empty ? View.GONE : View.VISIBLE
        flag 5 (0x6L): bean.message.get().empty ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}