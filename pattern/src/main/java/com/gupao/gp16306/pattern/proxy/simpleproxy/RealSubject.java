package com.gupao.gp16306.pattern.proxy.simpleproxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
