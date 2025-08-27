package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.brother.ptouch.sdk.printdemo.DataBinderMapperImpl());
  }
}
