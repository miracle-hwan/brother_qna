package com.brother.ptouch.sdk.printdemo.databinding;
import com.brother.ptouch.sdk.printdemo.R;
import com.brother.ptouch.sdk.printdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShowResultBindingImpl extends FragmentShowResultBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout, 2);
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.print_result, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentShowResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentShowResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.result.setTag(null);
        this.resultListRecycler.setTag(null);
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
            setBean((com.brother.ptouch.sdk.printdemo.viewmodel.ShowResultViewModel.DisplayBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBean(@Nullable com.brother.ptouch.sdk.printdemo.viewmodel.ShowResultViewModel.DisplayBean Bean) {
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
                return onChangeBeanTemplateList((androidx.databinding.ObservableField<java.util.ArrayList<com.brother.ptouch.sdk.printdemo.model.TemplateData>>) object, fieldId);
            case 1 :
                return onChangeBean((com.brother.ptouch.sdk.printdemo.viewmodel.ShowResultViewModel.DisplayBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBeanTemplateList(androidx.databinding.ObservableField<java.util.ArrayList<com.brother.ptouch.sdk.printdemo.model.TemplateData>> BeanTemplateList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBean(com.brother.ptouch.sdk.printdemo.viewmodel.ShowResultViewModel.DisplayBean Bean, int fieldId) {
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
        int beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNullViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.util.ArrayList<com.brother.ptouch.sdk.printdemo.model.TemplateData>> beanTemplateList = null;
        boolean beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNull = false;
        boolean beanTemplateListJavaLangObjectNull = false;
        boolean beanTemplateListEmpty = false;
        java.util.ArrayList<com.brother.ptouch.sdk.printdemo.model.TemplateData> beanTemplateListGet = null;
        com.brother.ptouch.sdk.printdemo.viewmodel.ShowResultViewModel.DisplayBean bean = mBean;

        if ((dirtyFlags & 0x7L) != 0) {



                if (bean != null) {
                    // read bean.templateList
                    beanTemplateList = bean.getTemplateList();
                }
                updateRegistration(0, beanTemplateList);


                if (beanTemplateList != null) {
                    // read bean.templateList.get()
                    beanTemplateListGet = beanTemplateList.get();
                }


                if (beanTemplateListGet != null) {
                    // read bean.templateList.get().empty
                    beanTemplateListEmpty = beanTemplateListGet.isEmpty();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(beanTemplateListEmpty) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                // read bean.templateList.get() == null
                beanTemplateListJavaLangObjectNull = (beanTemplateListGet) == (null);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read bean.templateList.get().empty ? true : bean.templateList.get() == null
                beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNull = ((beanTemplateListEmpty) ? (true) : (beanTemplateListJavaLangObjectNull));
            if((dirtyFlags & 0x7L) != 0) {
                if(beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read bean.templateList.get().empty ? true : bean.templateList.get() == null ? View.GONE : View.VISIBLE
                beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNullViewGONEViewVISIBLE = ((beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.resultListRecycler.setVisibility(beanTemplateListEmptyBooleanTrueBeanTemplateListJavaLangObjectNullViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bean.templateList
        flag 1 (0x2L): bean
        flag 2 (0x3L): null
        flag 3 (0x4L): bean.templateList.get().empty ? true : bean.templateList.get() == null ? View.GONE : View.VISIBLE
        flag 4 (0x5L): bean.templateList.get().empty ? true : bean.templateList.get() == null ? View.GONE : View.VISIBLE
        flag 5 (0x6L): bean.templateList.get().empty ? true : bean.templateList.get() == null
        flag 6 (0x7L): bean.templateList.get().empty ? true : bean.templateList.get() == null
    flag mapping end*/
    //end
}