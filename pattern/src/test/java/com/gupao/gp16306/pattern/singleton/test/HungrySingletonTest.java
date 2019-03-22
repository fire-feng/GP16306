package com.gupao.gp16306.pattern.singleton.test;

import com.gupao.gp16306.pattern.singleton.hungry.HungrySingleton;

public class HungrySingletonTest {

    public static void main(String[] args) {

        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println("end!");
    }
}
