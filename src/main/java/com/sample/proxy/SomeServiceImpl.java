package com.sample.proxy;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSomething() {
        System.out.println("Doing something here...");

        doSomething2();

        System.out.println("Done something.");
    }

    @Override
    public void doSomething2() {
        System.out.println("Doing something2 here...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done something2.");
    }
}
