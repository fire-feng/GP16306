package com.gupao.gp16306.pattern.singleton.hungry;

//饿汉式静态块单例
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton ;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){ }

    public static  HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }

}
