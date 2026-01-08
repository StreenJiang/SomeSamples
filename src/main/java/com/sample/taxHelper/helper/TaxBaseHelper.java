package com.sample.taxHelper.helper;

import com.sample.taxHelper.bean.TaxBaseBean;
import com.sample.taxHelper.bean.HeaderTaxBean;
import com.sample.taxHelper.helper.impl.HeaderTaxHelper;

public abstract class TaxBaseHelper<T extends TaxBaseBean> {
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

    public final TaxBaseBean getBaseBean() {
        TaxBaseBean bean = new TaxBaseBean();

        // Do some conversions use this.t here

        return bean;
    }

    public final Class<T> getTClass() {
        return tClass;
    }

    public static TaxBaseHelper<?> getHelper(TaxBaseBean bean) {
        if (bean instanceof HeaderTaxBean) {
            return new HeaderTaxHelper((HeaderTaxBean) bean);
        }

        return null;
    }
}
