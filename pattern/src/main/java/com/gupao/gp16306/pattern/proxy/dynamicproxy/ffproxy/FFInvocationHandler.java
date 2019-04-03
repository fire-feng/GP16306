package com.gupao.gp16306.pattern.proxy.dynamicproxy.ffproxy;

import java.lang.reflect.Method;

public interface FFInvocationHandler {
    public Object invoke(Object proxy , Method method , Object[] args) throws Throwable;
}
