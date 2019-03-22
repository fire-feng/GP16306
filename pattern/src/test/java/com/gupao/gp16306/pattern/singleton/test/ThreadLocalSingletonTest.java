package com.gupao.gp16306.pattern.singleton.test;

import com.gupao.gp16306.pattern.singleton.hungry.HungrySingleton;
import com.gupao.gp16306.pattern.singleton.hungry.HungryStaticSingleton;
import com.gupao.gp16306.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 =  new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("Run is End!");

    }
}
