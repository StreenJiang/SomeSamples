package com.sample.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SomeServiceInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Proxy[CGLib] is running [" + method.getName() + "] before the real method...");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("Proxy[CGLib] is running [" + method.getName() + "] after the real method...");
        return result;
    }
}
