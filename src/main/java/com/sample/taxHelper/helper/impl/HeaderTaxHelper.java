package com.sample.taxHelper.helper.impl;

import com.sample.taxHelper.bean.HeaderTaxBean;
import com.sample.taxHelper.helper.TaxBaseHelper;

public class HeaderTaxHelper extends TaxBaseHelper<HeaderTaxBean> {
    public HeaderTaxHelper(HeaderTaxBean headerBean) {
        super(headerBean);
    }

    @Override
    protected String getSomething() {
        return this.getClass().getName() + " | " + getTClass().getName();
    }
}
