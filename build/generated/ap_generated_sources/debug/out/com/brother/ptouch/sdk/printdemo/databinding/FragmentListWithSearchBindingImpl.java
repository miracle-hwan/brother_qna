package com.brother.ptouch.sdk.printdemo.databinding;
import com.brother.ptouch.sdk.printdemo.R;
import com.brother.ptouch.sdk.printdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListWithSearchBindingImpl extends FragmentListWithSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.main_find_printer, 6);
        sViewsWithIds.put(R.id.base_recycler_view, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListWithSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentListWithSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            );
        this.mainPrinterInfo.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
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
            setBean((com.brother.ptouch.sdk.printdemo.viewmodel.SelectorWithSearchViewModel.DisplayBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBean(@Nullable com.brother.ptouch.sdk.printdemo.viewmodel.SelectorWithSearchViewModel.DisplayBean Bean) {
        updateRegistration(1, Bean);
        this.mBean = Bean;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.bean);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBeanTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeBean((com.brother.ptouch.sdk.printdemo.viewmodel.SelectorWithSearchViewModel.DisplayBean) object, fieldId);
            case 2 :
                return onChangeBeanSubTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBeanTitle(androidx.databinding.ObservableField<java.lang.String> BeanTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBean(com.brother.ptouch.sdk.printdemo.viewmodel.SelectorWithSearchViewModel.DisplayBean Bean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBeanSubTitle(androidx.databinding.ObservableField<java.lang.String> BeanSubTitle, int fieldId) {
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
        java.lang.String beanTitleGet = null;
        java.lang.String beanSubTitleGet = null;
        int beanTitleEmptyViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.String> beanTitle = null;
        boolean beanTitleEmpty = false;
        int beanTitleEmptyViewVISIBLEViewGONE = 0;
        com.brother.ptouch.sdk.printdemo.viewmodel.SelectorWithSearchViewModel.DisplayBean bean = mBean;
        androidx.databinding.ObservableField<java.lang.String> beanSubTitle = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (bean != null) {
                        // read bean.title
                        beanTitle = bean.getTitle();
                    }
                    updateRegistration(0, beanTitle);


                    if (beanTitle != null) {
                        // read bean.title.get()
                        beanTitleGet = beanTitle.get();
                    }


                    if (beanTitleGet != null) {
                        // read bean.title.get().empty
                        beanTitleEmpty = beanTitleGet.isEmpty();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(beanTitleEmpty) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read bean.title.get().empty ? View.GONE : View.VISIBLE
                    beanTitleEmptyViewGONEViewVISIBLE = ((beanTitleEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read bean.title.get().empty ? View.VISIBLE : View.GONE
                    beanTitleEmptyViewVISIBLEViewGONE = ((beanTitleEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (bean != null) {
                        // read bean.subTitle
                        beanSubTitle = bean.getSubTitle();
                    }
                    updateRegistration(2, beanSubTitle);


                    if (beanSubTitle != null) {
                        // read bean.subTitle.get()
                        beanSubTitleGet = beanSubTitle.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.mainPrinterInfo.setVisibility(beanTitleEmptyViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(beanTitleEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, beanTitleGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, beanSubTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bean.title
        flag 1 (0x2L): bean
        flag 2 (0x3L): bean.subTitle
        flag 3 (0x4L): null
        flag 4 (0x5L): bean.title.get().empty ? View.GONE : View.VISIBLE
        flag 5 (0x6L): bean.title.get().empty ? View.GONE : View.VISIBLE
        flag 6 (0x7L): bean.title.get().empty ? View.VISIBLE : View.GONE
        flag 7 (0x8L): bean.title.get().empty ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}