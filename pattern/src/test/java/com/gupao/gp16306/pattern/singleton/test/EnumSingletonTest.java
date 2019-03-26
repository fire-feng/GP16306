package com.gupao.gp16306.pattern.singleton.test;

import com.gupao.gp16306.pattern.singleton.register.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    /*public static void main(String[] args) {
        EnumSingleton instance1 = null ;
        try {
            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setData(new Object());


            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());

            System.out.println(instance1.getData() == instance2.getData());

        } catch (Exception e) {
                e.printStackTrace();
            }


    }*/

    public static void main(String[] args) {
        try {
        Class clazz  = EnumSingleton.class;
        Constructor c  = clazz.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);
        EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("haha",6666);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
