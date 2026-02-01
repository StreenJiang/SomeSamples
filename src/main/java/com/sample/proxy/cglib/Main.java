package com.sample.proxy.cglib;

import com.sample.proxy.SomeService;
import com.sample.proxy.SomeServiceImpl;
import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        // 1. Create enhancer
        Enhancer enhancer = new Enhancer();

        // 2. Set super class
        enhancer.setSuperclass(SomeServiceImpl.class);

        // 3. Set interceptor
        enhancer.setCallback(new SomeServiceInterceptor());

        // 4. Set ClassLoader (This is optional)
        // enhancer.setClassLoader(SomeServiceImpl.class.getClassLoader());

        // 5. Create proxy
        SomeService proxy = (SomeServiceImpl) enhancer.create();

        proxy.doSomething();
    }
}
