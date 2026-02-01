package com.sample.proxy.jdk;

import com.sample.proxy.SomeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SomeServiceInvocationHandler implements InvocationHandler {
    private final SomeService target;

    public SomeServiceInvocationHandler(SomeService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy is running [" + method.getName() + "] before the real method...");
        Object result = method.invoke(target, args);
        System.out.println("Proxy is running [" + method.getName() + "] after the real method...");
        return result;
    }
}
