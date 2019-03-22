package com.gupao.gp16306.pattern.singleton.test;

import com.gupao.gp16306.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.gupao.gp16306.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.gupao.gp16306.pattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {

    @Override
    public void run() {
       // LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
