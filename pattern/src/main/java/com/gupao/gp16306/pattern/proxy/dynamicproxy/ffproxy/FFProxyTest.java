package com.gupao.gp16306.pattern.proxy.dynamicproxy.ffproxy;

import com.gupao.gp16306.pattern.proxy.Person;
import com.gupao.gp16306.pattern.proxy.dynamicproxy.jdkproxy.Girl;

public class FFProxyTest {
    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new FFMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
