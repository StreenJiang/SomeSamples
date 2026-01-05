package com.sample.helper.impl;

import com.sample.bean.HeaderBean;
import com.sample.helper.TaxBaseHelper;

public class HeaderTaxHelper extends TaxBaseHelper<HeaderBean> {
    public HeaderTaxHelper(HeaderBean headerBean) {
        super(headerBean);
    }

    @Override
    protected String getSomething() {
        return HeaderTaxHelper.class.getName() + "-" + HeaderBean.class.getName();
    }
}
