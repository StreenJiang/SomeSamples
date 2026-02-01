package com.sample.proxy.staticproxy;

import com.sample.proxy.SomeService;
import com.sample.proxy.SomeServiceImpl;

public class Main {
    public static void main(String[] args) {
        // 1. Create real instance
        SomeService service = new SomeServiceImpl();

        // 2. Create proxy
        SomeService proxy = new StaticProxy(service);

        proxy.doSomething();
    }
}
