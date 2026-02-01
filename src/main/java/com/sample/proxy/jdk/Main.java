package com.sample.proxy.jdk;

import com.sample.proxy.SomeService;
import com.sample.proxy.SomeServiceImpl;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // 1. Real instance
        SomeService service = new SomeServiceImpl();

        // 2. Create invocation handler
        SomeServiceInvocationHandler handler = new SomeServiceInvocationHandler(service);

        // 3. Create proxy
        SomeService proxy = (SomeService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                                                                 service.getClass().getInterfaces(), handler);

        proxy.doSomething();
    }
}
