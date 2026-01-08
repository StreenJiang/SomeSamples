package com.sample.taxHelper.helper;

import com.sample.taxHelper.bean.BaseBean;
import com.sample.taxHelper.bean.HeaderBean;
import com.sample.taxHelper.helper.impl.HeaderTaxHelper;

public abstract class TaxBaseHelper<T extends BaseBean> {
    // Some fields
    private T t;
    private Class<T> tClass;

    public TaxBaseHelper(T t) { // with some arguments
        // Initialization
       this.t = t;
        tClass = (Class<T>) t.getClass();
    }

    protected abstract String getSomething();

    public final void handleSomething() {
        String something = getSomething();

        // Do with 'something' here
        System.out.println("Here we are doing something with [" + something + "]");
    }

    public final BaseBean getBaseBean() {
        BaseBean bean = new BaseBean();

        // Do some conversions use this.t here

        return bean;
    }

    public final Class<T> getTClass() {
        return tClass;
    }

    public static TaxBaseHelper<?> getHelper(BaseBean bean) {
        if (bean instanceof HeaderBean) {
            return new HeaderTaxHelper((HeaderBean) bean);
        }

        return null;
    }
}
