package com.gupao.gp16306.pattern.singleton.test;

import com.gupao.gp16306.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("com.gupao.gp16306.pattern.singleton.test.Pojo");;
                    System.out.println(System.currentTimeMillis() + ": "+ obj);


                }
            },10,6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end= System.currentTimeMillis();
        System.out.println("总耗时: " + (end - start) + " ms.");
    }
}
