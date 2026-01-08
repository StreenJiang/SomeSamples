package com.sample.taxHelper;

import com.sample.taxHelper.bean.HeaderBean;
import com.sample.taxHelper.helper.TaxBaseHelper;

public class TestApplication {
    static void main() {
        // For this base helper, we don't need to care about exact helper it is,
        //   we just need to know what method we need to use, that's it
        System.out.println("------------------------");
        TaxBaseHelper<?> helper = TaxBaseHelper.getHelper(new HeaderBean());
        System.out.println("Class: " + helper.getTClass());
        helper.handleSomething();
        System.out.println("------------------------");

    }
}
