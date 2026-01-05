package com.sample.helper.impl;

import com.sample.bean.HeaderBean;
import com.sample.helper.TaxBaseHelper;

public class HeaderTaxHelper extends TaxBaseHelper<HeaderBean> {
    @Override
    protected String getSomething() {
        return HeaderTaxHelper.class.getName() + "-" + HeaderBean.class.getName();
    }
}
