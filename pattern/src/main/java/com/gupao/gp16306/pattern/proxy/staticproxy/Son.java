package com.gupao.gp16306.pattern.proxy.staticproxy;

import com.gupao.gp16306.pattern.proxy.Person;

public class Son implements Person {

    public int findLove(){
        System.out.println("儿子要求：肤白貌美大长腿");
        return 0;
    }

    public void findJob(){

    }

    public void eat(){

    }

}