package com.gupao.gp16306.pattern.decorator.battercake.v1;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    //加一个香肠加2块钱
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
