package com.sample.taxHelper.helper.impl;

import com.sample.taxHelper.bean.HeaderBean;
import com.sample.taxHelper.helper.TaxBaseHelper;

public class HeaderTaxHelper extends TaxBaseHelper<HeaderBean> {
    public HeaderTaxHelper(HeaderBean headerBean) {
        super(headerBean);
    }

    @Override
    protected String getSomething() {
        return this.getClass().getName() + " | " + getTClass().getName();
    }
}
