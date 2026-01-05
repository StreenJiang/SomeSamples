package com.sample.helper;

import com.sample.bean.BaseBean;
import com.sample.bean.HeaderBean;
import com.sample.helper.impl.HeaderTaxHelper;

public abstract class TaxBaseHelper<T extends BaseBean> {
    private T t;

    // Some fields
    public TaxBaseHelper() { // with some arguments
        // Initialization
    }

    protected abstract String getSomething();

    public final void handleSomething() {
        String something = getSomething();

        // Do with 'something' here
        System.out.println("Here we are doing something with [" + something + "]");
    }

    public BaseBean getBaseBean() {
        // Do some conversions here
        return t;
    }

    public static TaxBaseHelper<?> getHelper(BaseBean bean) {
        if (bean instanceof HeaderBean) {
            return new HeaderTaxHelper();
        }

        return null;
    }
}
