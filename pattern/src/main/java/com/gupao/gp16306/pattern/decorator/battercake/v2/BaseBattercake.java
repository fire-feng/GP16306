package com.gupao.gp16306.pattern.decorator.battercake.v2;

public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}