package com.sample.proxy.staticproxy;

import com.sample.proxy.SomeService;

public class StaticProxy implements SomeService {
    private final SomeService target;

    public StaticProxy(SomeService target) {
        this.target = target;
    }

    @Override
    public void doSomething() {
        System.out.println("Do something in [static proxy]...");
        target.doSomething();
        System.out.println("Done something in [static proxy].");
    }

    @Override
    public void doSomething2() {
        System.out.println("Do something2 in [static proxy]...");
        target.doSomething2();
        System.out.println("Done something2 in [static proxy].");
    }
}
